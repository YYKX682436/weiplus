package m22;

/* loaded from: classes12.dex */
public final class o extends m22.g {

    /* renamed from: e, reason: collision with root package name */
    public final m22.y f404592e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f404593f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f404594g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.ViewGroup parent, m22.y clickListener) {
        super(parent, com.p314xaae8f345.mm.R.C30864xbddafb2a.a6s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        this.f404592e = clickListener;
        this.f404593f = (android.widget.ImageView) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565730dc3);
        this.f404594g = (android.widget.TextView) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565731dc4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565729dc2);
        this.f3639x46306858.setOnClickListener(new m22.m(this));
        c22661xa3a2b3c0.setOnClickListener(new m22.n(this));
    }

    @Override // m22.g
    public void i(m22.i item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f404579d = item;
        m22.p pVar = (m22.p) item;
        boolean b17 = n22.l.b(item.b());
        android.widget.ImageView imageView = this.f404593f;
        if (b17) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
        } else {
            vo0.e eVar = vo0.e.f520000a;
            wo0.c a17 = vo0.e.f520001b.a(pVar.a());
            yo0.f fVar = new yo0.f();
            fVar.f545611b = true;
            a17.f529405c = fVar.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            ((wo0.b) a17).c(imageView);
        }
        this.f404594g.setText(pVar.c());
    }
}
