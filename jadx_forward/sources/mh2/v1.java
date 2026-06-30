package mh2;

/* loaded from: classes10.dex */
public final class v1 extends mh2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drh;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        android.view.View view = this.f407825b;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ndn);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kb_);
        om2.x xVar = singState instanceof om2.x ? (om2.x) singState : null;
        if (xVar != null) {
            om2.o oVar = xVar.f427921a;
            boolean z17 = oVar.f427899g;
            android.content.Context context = this.f407824a;
            textView.setText(z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ork, oVar.f427897e) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjw, oVar.f427897e));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            r45.xn1 xn1Var = oVar.f427894b;
            b(imageView, xn1Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0) : null);
            r45.xn1 xn1Var2 = oVar.f427894b;
            if (xn1Var2 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) {
                return;
            }
            textView2.setText(zl2.r4.D0(zl2.r4.f555483a, c19782x23db1cfa.m76197x6c03c64c(), c19782x23db1cfa.m76184x8010e5e4(), false, 4, null));
        }
    }
}
