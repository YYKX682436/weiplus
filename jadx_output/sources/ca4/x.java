package ca4;

/* loaded from: classes15.dex */
public class x implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.a0 f40056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f40058c;

    public x(ca4.b0 b0Var, ca4.a0 a0Var, java.lang.String str) {
        this.f40058c = b0Var;
        this.f40056a = a0Var;
        this.f40057b = str;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
        java.util.List list = c3Var != null ? c3Var.f306621a : null;
        java.util.ArrayList arrayList = c3Var != null ? c3Var.f306623c : null;
        java.lang.String str = this.f40057b;
        ca4.a0 a0Var = this.f40056a;
        ca4.b0 b0Var = this.f40058c;
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "afterDecode, results is empty");
            b0Var.n("", false);
            if (a0Var != null) {
                a0Var.a(str, false, "QR result is empty", ca4.b0.f(b0Var));
            }
            b0Var.m();
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
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
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().fetchQRCodeInfo(ca4.b0.d(b0Var), ca4.b0.c(b0Var), new ca4.v(this));
            com.tencent.mm.sdk.platformtools.u3.h(new ca4.w(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
    }
}
