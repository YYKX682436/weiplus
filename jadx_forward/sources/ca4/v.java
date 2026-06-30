package ca4;

/* loaded from: classes15.dex */
public class v implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.x f121564a;

    public v(ca4.x xVar) {
        this.f121564a = xVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchQRCodeInfo, errType=");
        sb6.append(i17);
        sb6.append(", data==null?");
        sb6.append(obj == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", sb6.toString());
        ca4.x xVar = this.f121564a;
        if (android.text.TextUtils.isEmpty(ca4.b0.c(xVar.f121591c))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "the qr code string is empty in AdLandingPagesProxy call back");
            ca4.a0 a0Var = xVar.f121589a;
            if (a0Var != null) {
                a0Var.a(xVar.f121590b, false, "fetchQRCodeInfo empty", ca4.b0.f(xVar.f121591c));
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ca4.u(this, obj, i17));
            ca4.a0 a0Var2 = xVar.f121589a;
            if (a0Var2 == null || i17 != 0) {
                a0Var2.a(xVar.f121590b, false, " errType!=MM_OK", ca4.b0.f(xVar.f121591c));
            } else {
                a0Var2.a(xVar.f121590b, true, "", ca4.b0.f(xVar.f121591c));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
    }
}
