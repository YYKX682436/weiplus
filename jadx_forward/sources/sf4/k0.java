package sf4;

/* loaded from: classes4.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(0);
        this.f489051d = c18497x85806502;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489051d;
        java.lang.Object obj = ((java.util.ArrayList) c18497x85806502.f253642z.get(c18497x85806502.f253635u)).get(c18497x85806502.f253636v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        nf4.j J0 = ef4.w.f334001t.i().J0(((if4.f) obj).f372780e.f372786a);
        java.lang.String string = J0 != null && J0.u0() ? c18497x85806502.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmj) : c18497x85806502.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c18497x85806502.getContext());
        u1Var.g(string);
        u1Var.n(c18497x85806502.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlx));
        u1Var.k(-65536);
        u1Var.a(true);
        u1Var.b(new sf4.c1(c18497x85806502, J0));
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", "delete click");
        return jz5.f0.f384359a;
    }
}
