package hr3;

/* loaded from: classes8.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f364997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f364999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str2) {
        super(0);
        this.f364997d = activityC16844x18232797;
        this.f364998e = str;
        this.f364999f = z3Var;
        this.f365000g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f364997d;
        if (f9Var.k(activityC16844x18232797.mo55332x76847179(), null)) {
            if (t41.i.a()) {
                android.content.Intent intent = new android.content.Intent();
                intent.setFlags(268435456);
                intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                intent.putExtra("rawUrl", this.f364998e);
                intent.putExtra("geta8key_scene", 58);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC16844x18232797.mo55332x76847179());
                u1Var.g(activityC16844x18232797.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bd_));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8);
                u1Var.b(new hr3.c2(activityC16844x18232797));
                u1Var.q(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15319, this.f364999f.Q0(), 6, this.f365000g);
        }
        return jz5.f0.f384359a;
    }
}
