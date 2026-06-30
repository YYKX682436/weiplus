package c43;

/* loaded from: classes8.dex */
public class w extends c43.x {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 Z;

    public w(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.Z.b(this.f120025g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fkx));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570672bf0, (android.view.ViewGroup) null);
        this.Z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566633gj3);
        return inflate;
    }
}
