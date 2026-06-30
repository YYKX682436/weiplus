package yu4;

/* loaded from: classes8.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.n f547424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f547425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f547426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yu4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(0);
        this.f547424d = nVar;
        this.f547425e = abstractC19224x1fe3df6e;
        this.f547426f = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yu4.n nVar = this.f547424d;
        android.widget.FrameLayout frameLayout = nVar.f547432h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = this.f547425e;
        frameLayout.addView(abstractC19224x1fe3df6e);
        if (!this.f547426f.f391645d) {
            r45.xi0 xi0Var = nVar.f547429e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f547431g, "start to load url %s", xi0Var.f471651g);
            abstractC19224x1fe3df6e.mo120128x74041feb(nVar.f547434m, "emojiWebSearchJSApi");
            abstractC19224x1fe3df6e.mo32265x141096a9(xi0Var.f471651g);
        }
        return jz5.f0.f384359a;
    }
}
