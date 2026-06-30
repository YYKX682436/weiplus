package c43;

/* loaded from: classes8.dex */
public class r extends c43.x {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 Z;

    /* renamed from: p0, reason: collision with root package name */
    public final c43.h1 f120007p0;

    public r(android.view.View view, int i17) {
        super(view, i17);
        this.f120007p0 = new c43.h1();
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15735x912b11bf c15735x912b11bf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15737x912b1462 c15737x912b1462;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15735x912b11bf = c15791x7c5dbdd8.f36770x2b2244c1) == null || (c15737x912b1462 = c15735x912b11bf.f36588x4ae15ba6) == null) {
            return;
        }
        this.f120007p0.a(this.f120025g, c15737x912b1462.f36591x7e4dc33f, s(), new c43.q(this, c15731x94356d67));
    }

    @Override // c43.x
    public boolean n() {
        return true;
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bez, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566633gj3);
        this.Z = c22624x85d69039;
        c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this.Z.getContext())));
        return inflate;
    }
}
