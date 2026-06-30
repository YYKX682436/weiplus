package nh1;

/* loaded from: classes7.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f418628d;

    /* renamed from: e, reason: collision with root package name */
    public final nh1.g f418629e;

    public j(java.util.List list, nh1.g gVar) {
        this.f418628d = new java.util.ArrayList(list);
        this.f418629e = gVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f418628d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nh1.i iVar = (nh1.i) k3Var;
        iVar.f418627d.setText((java.lang.CharSequence) ((java.util.ArrayList) this.f418628d).get(i17));
        iVar.f418627d.setOnClickListener(new nh1.h(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569623gy, viewGroup, false);
        nh1.i iVar = new nh1.i(this, inflate);
        iVar.f418627d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        return iVar;
    }
}
