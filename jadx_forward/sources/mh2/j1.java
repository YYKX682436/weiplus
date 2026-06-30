package mh2;

/* loaded from: classes10.dex */
public final class j1 extends mh2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_w;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        om2.x xVar = singState instanceof om2.x ? (om2.x) singState : null;
        if (xVar == null || (xn1Var = xVar.f427921a.f427894b) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        b(imageView, c19782x23db1cfa);
    }
}
