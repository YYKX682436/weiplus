package ca4;

/* loaded from: classes15.dex */
public class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f121541d;

    public r(ca4.b0 b0Var) {
        this.f121541d = b0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
        try {
            ca4.b0 b0Var = this.f121541d;
            b0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            android.view.View b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) b0Var.f121362c).b(new ca4.t(b0Var), b0Var.f121363d, b0Var.f121365f, 9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            if (b17 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) b17).m81539x4078f8b0(8);
            }
            ca4.b0.a(this.f121541d).o(b17);
            android.view.View view = new android.view.View(ca4.b0.b(this.f121541d));
            view.setMinimumHeight(i65.a.b(ca4.b0.b(this.f121541d), 2));
            ca4.b0.a(this.f121541d).s(view, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "onCreateMMMenu exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
    }
}
