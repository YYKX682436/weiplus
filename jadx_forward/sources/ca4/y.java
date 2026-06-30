package ca4;

/* loaded from: classes15.dex */
public class y implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.a0 f121594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f121596c;

    public y(ca4.b0 b0Var, ca4.a0 a0Var, java.lang.String str) {
        this.f121596c = b0Var;
        this.f121594a = a0Var;
        this.f121595b = str;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
        java.util.List list = c3Var != null ? c3Var.f388154a : null;
        java.util.ArrayList arrayList = c3Var != null ? c3Var.f388156c : null;
        java.lang.String str = this.f121595b;
        ca4.a0 a0Var = this.f121594a;
        ca4.b0 b0Var = this.f121596c;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "afterDecode, results is empty");
            b0Var.n("", false);
            if (a0Var != null) {
                a0Var.a(str, false, "QR result is empty", ca4.b0.f(b0Var));
            }
        } else {
            int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(((com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) list.get(0)).f556864e);
            java.lang.String str2 = ((com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) list.get(0)).f556865f;
            int i17 = (arrayList == null || arrayList.isEmpty()) ? -1 : ((com.p314xaae8f345.p2891x34da02.C25312x3165f541) arrayList.get(0)).f45430x93fa756a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "QRCodeStr=" + str2 + ", QRCodeType=" + a17 + ", QRCodeVer=" + i17);
            if (!b0Var.j(a17, str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "isValidQRCode=false");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                b0Var.n(str2 != null ? str2 : "", false);
                if (a0Var != null) {
                    a0Var.a(str, false, "inValid QRCode", ca4.b0.f(b0Var));
                }
                b0Var.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f121363d = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f121365f = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.f121364e = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            b0Var.n(ca4.b0.c(b0Var), !android.text.TextUtils.isEmpty(ca4.b0.c(b0Var)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "onClickDirect createIntent");
            android.content.Intent intent = new android.content.Intent(ca4.b0.b(b0Var), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18009xc0007d67.class);
            intent.putExtra("action_type", 1);
            intent.putExtra("qrcodeStr", ca4.b0.c(b0Var));
            intent.putExtra("qrcodeType", ca4.b0.d(b0Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            int i18 = b0Var.f121364e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            intent.putExtra("qrcodeVer", i18);
            intent.putExtra("aid", ca4.b0.e(b0Var).c());
            intent.putExtra("ad_scene", ca4.b0.e(b0Var).l());
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 11);
            android.content.Context b17 = ca4.b0.b(b0Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (ca4.b0.b(b0Var) instanceof android.app.Activity) {
                ((android.app.Activity) ca4.b0.b(b0Var)).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
            b0Var.p(ca4.b0.c(b0Var), !android.text.TextUtils.isEmpty(ca4.b0.c(b0Var)));
            if (a0Var != null) {
                a0Var.a(str, true, "", ca4.b0.f(b0Var));
            }
        }
        b0Var.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
    }
}
