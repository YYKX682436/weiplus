package ca4;

/* loaded from: classes15.dex */
public class x implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.a0 f121589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f121591c;

    public x(ca4.b0 b0Var, ca4.a0 a0Var, java.lang.String str) {
        this.f121591c = b0Var;
        this.f121589a = a0Var;
        this.f121590b = str;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
        java.util.List list = c3Var != null ? c3Var.f388154a : null;
        java.util.ArrayList arrayList = c3Var != null ? c3Var.f388156c : null;
        java.lang.String str = this.f121590b;
        ca4.a0 a0Var = this.f121589a;
        ca4.b0 b0Var = this.f121591c;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "afterDecode, results is empty");
            b0Var.n("", false);
            if (a0Var != null) {
                a0Var.a(str, false, "QR result is empty", ca4.b0.f(b0Var));
            }
            b0Var.m();
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
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
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
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69841xd28ebb6(ca4.b0.d(b0Var), ca4.b0.c(b0Var), new ca4.v(this));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ca4.w(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
    }
}
