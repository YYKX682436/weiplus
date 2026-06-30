package wu2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 f531215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3) {
        super(1);
        this.f531215d = c15118xbecd3ba3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3 = this.f531215d;
        if (c15118xbecd3ba3.G0().f188944g != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var = c15118xbecd3ba3.f210789v;
            if (l7Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View view = l7Var.f187718r;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2) : null;
            if (textView != null) {
                textView.setText(c15118xbecd3ba3.y0().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuu, java.lang.Integer.valueOf(c15118xbecd3ba3.G0().f188944g)));
            }
            c15118xbecd3ba3.F0(c15118xbecd3ba3.G0().f188944g);
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b1) it).getHasMore()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var2 = c15118xbecd3ba3.f210789v;
            if (l7Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            l7Var2.W();
            c15118xbecd3ba3.A = true;
        }
        return jz5.f0.f384359a;
    }
}
