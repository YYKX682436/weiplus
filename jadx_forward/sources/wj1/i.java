package wj1;

/* loaded from: classes8.dex */
public class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f528125d;

    public i(java.util.List list) {
        this.f528125d = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f528125d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        wj1.h hVar = (wj1.h) k3Var;
        r45.hc hcVar = (r45.hc) this.f528125d.get(i17);
        if (hcVar == null) {
            return;
        }
        hVar.f528122d.setText(hcVar.f457565d);
        hVar.f528123e.setText(hcVar.f457566e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new wj1.h(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569578fb, viewGroup, false));
    }
}
