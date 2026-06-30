package mh2;

/* loaded from: classes10.dex */
public final class g1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f407890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View findViewById = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f407890c = (android.widget.ImageView) findViewById;
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_u;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        om2.c0 c0Var = singState instanceof om2.c0 ? (om2.c0) singState : null;
        if (c0Var == null || (xn1Var = c0Var.f427813a.f427894b) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) {
            return;
        }
        b(this.f407890c, c19782x23db1cfa);
    }
}
