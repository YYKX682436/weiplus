package vh;

/* loaded from: classes12.dex */
public class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f518352d = new java.util.ArrayList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f518352d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((vh.h) ((java.util.ArrayList) this.f518352d).get(i17)).a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ((vh.s) k3Var).i((vh.h) ((java.util.ArrayList) this.f518352d).get(i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        switch (i17) {
            case 0:
                return new vh.q(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvr, viewGroup, false));
            case 1:
                return new vh.m(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvl, viewGroup, false));
            case 2:
                return new vh.n(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvi, viewGroup, false));
            case 3:
                return new vh.o(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvj, viewGroup, false));
            case 4:
                return new vh.r(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvs, viewGroup, false));
            case 5:
                return new vh.p(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvq, viewGroup, false));
            case 6:
                return new vh.j(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvk, viewGroup, false));
            default:
                throw new java.lang.IllegalStateException("Unknown view type: " + i17);
        }
    }
}
