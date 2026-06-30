package c43;

/* loaded from: classes8.dex */
public final class i extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f119967p0;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f119968x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 c15728xd7bc7765;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15728xd7bc7765 = c15791x7c5dbdd8.f36765x34581098) == null) {
            return;
        }
        r53.v vVar = new r53.v();
        vVar.f474240e = false;
        r53.y a17 = r53.y.a();
        android.widget.ImageView imageView = this.Z;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgImg");
            throw null;
        }
        a17.e(imageView, c15728xd7bc7765.f36559xdd86d13a, vVar.a(), null);
        if (c15728xd7bc7765.f36560xfe7c6efa) {
            android.widget.ImageView imageView2 = this.f119967p0;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playImg");
                throw null;
            }
            imageView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView3 = this.f119967p0;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playImg");
                throw null;
            }
            imageView3.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f119968x0;
        if (c22624x85d69039 != null) {
            c22624x85d69039.b(c15728xd7bc7765.f36557x2efe91);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bep, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hak);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h8u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f119967p0 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h8t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f119968x0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById3;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 c15728xd7bc7765;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15728xd7bc7765 = c15791x7c5dbdd8.f36765x34581098) == null || s()) {
            return;
        }
        s33.y.h(this.f120025g, c15728xd7bc7765.f36558xd27790a3);
    }
}
