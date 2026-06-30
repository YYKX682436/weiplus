package bp4;

/* loaded from: classes10.dex */
public final class r1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104894f;

    /* renamed from: g, reason: collision with root package name */
    public final cq4.n f104895g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f104896h;

    /* renamed from: i, reason: collision with root package name */
    public int f104897i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f104898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103) layout.findViewById(com.p314xaae8f345.mm.R.id.d8c);
        this.f104894f = holder;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(holder, "holder");
        cq4.n nVar = new cq4.n(holder);
        this.f104895g = nVar;
        android.widget.ImageView imageView = (android.widget.ImageView) layout.findViewById(com.p314xaae8f345.mm.R.id.d7o);
        this.f104896h = imageView;
        this.f104897i = -1;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
        imageView.setOnClickListener(new bp4.p1(this, status));
        nVar.f303013g = new bp4.q1(status, this);
        com.p314xaae8f345.mm.ui.a4.e(holder, false, false, 3, null);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (!this.f104894f.h()) {
            return false;
        }
        this.f104898m = false;
        z();
        return true;
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f104898m = false;
        z();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104896h.setVisibility(i17);
    }

    public final void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104894f;
        c17043x8103c103.m68236x76500a7f(false);
        ju3.d0.k(this.f546865d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f104896h;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, this.f104897i));
        c17043x8103c103.m68236x76500a7f(false);
    }
}
