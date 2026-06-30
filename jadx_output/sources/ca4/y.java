package ca4;

/* loaded from: classes15.dex */
public class y implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.a0 f40061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f40063c;

    public y(ca4.b0 b0Var, ca4.a0 a0Var, java.lang.String str) {
        this.f40063c = b0Var;
        this.f40061a = a0Var;
        this.f40062b = str;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
        java.util.List list = c3Var != null ? c3Var.f306621a : null;
        java.util.ArrayList arrayList = c3Var != null ? c3Var.f306623c : null;
        java.lang.String str = this.f40062b;
        ca4.a0 a0Var = this.f40061a;
        ca4.b0 b0Var = this.f40063c;
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "afterDecode, results is empty");
            b0Var.n("", false);
            if (a0Var != null) {
                a0Var.a(str, false, "QR result is empty", ca4.b0.f(b0Var));
            }
        } else {
            int a17 = com.tencent.mm.plugin.scanner.j1.a(((com.tencent.qbar.WxQBarResult) list.get(0)).f475331e);
            java.lang.String str2 = ((com.tencent.qbar.WxQBarResult) list.get(0)).f475332f;
            int i17 = (arrayList == null || arrayList.isEmpty()) ? -1 : ((com.tencent.qbar.WxQbarNative$QBarReportMsg) arrayList.get(0)).qrcodeVersion;
            com.tencent.mars.xlog.Log.i("SnsAdQRHelper", "QRCodeStr=" + str2 + ", QRCodeType=" + a17 + ", QRCodeVer=" + i17);
            if (!b0Var.j(a17, str2)) {
                com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "isValidQRCode=false");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b0Var.n(str2 != null ? str2 : "", false);
                if (a0Var != null) {
                    a0Var.a(str, false, "inValid QRCode", ca4.b0.f(b0Var));
                }
                b0Var.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f39830d = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f39832f = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f39831e = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.n(ca4.b0.c(b0Var), !android.text.TextUtils.isEmpty(ca4.b0.c(b0Var)));
            com.tencent.mars.xlog.Log.i("SnsAdQRHelper", "onClickDirect createIntent");
            android.content.Intent intent = new android.content.Intent(ca4.b0.b(b0Var), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsAdProxyUI.class);
            intent.putExtra("action_type", 1);
            intent.putExtra("qrcodeStr", ca4.b0.c(b0Var));
            intent.putExtra("qrcodeType", ca4.b0.d(b0Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            int i18 = b0Var.f39831e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            intent.putExtra("qrcodeVer", i18);
            intent.putExtra("aid", ca4.b0.e(b0Var).c());
            intent.putExtra("ad_scene", ca4.b0.e(b0Var).l());
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 11);
            android.content.Context b17 = ca4.b0.b(b0Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (ca4.b0.b(b0Var) instanceof android.app.Activity) {
                ((android.app.Activity) ca4.b0.b(b0Var)).overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
            }
            b0Var.p(ca4.b0.c(b0Var), !android.text.TextUtils.isEmpty(ca4.b0.c(b0Var)));
            if (a0Var != null) {
                a0Var.a(str, true, "", ca4.b0.f(b0Var));
            }
        }
        b0Var.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
    }
}
