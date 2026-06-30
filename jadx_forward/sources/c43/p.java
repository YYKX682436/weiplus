package c43;

/* loaded from: classes8.dex */
public final class p extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f120002p0;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f120003x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb c15733xb0b841eb;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15733xb0b841eb = c15791x7c5dbdd8.f36768xa538cbe6) == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15733xb0b841eb.f36581xdd86d13a)) {
            android.widget.ImageView imageView = this.Z;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightImg");
                throw null;
            }
            imageView.setVisibility(8);
        } else {
            android.widget.ImageView imageView2 = this.Z;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightImg");
                throw null;
            }
            imageView2.setVisibility(0);
        }
        r53.v vVar = new r53.v();
        vVar.f474240e = false;
        r53.y a17 = r53.y.a();
        android.widget.ImageView imageView3 = this.Z;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightImg");
            throw null;
        }
        a17.e(imageView3, c15733xb0b841eb.f36581xdd86d13a, vVar.a(), null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f120002p0;
        if (c22624x85d69039 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        c22624x85d69039.b(c15733xb0b841eb.f36582x6942258);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f120003x0;
        if (c22624x85d690392 != null) {
            c22624x85d690392.b(c15733xb0b841eb.f36579x2efe91);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bey, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568431mt2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568432mt3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f120002p0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568430mt1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f120003x0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById3;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb c15733xb0b841eb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15733xb0b841eb = c15791x7c5dbdd8.f36768xa538cbe6) == null || s()) {
            return;
        }
        s33.y.h(this.f120025g, c15733xb0b841eb.f36580x28d1961f);
    }
}
