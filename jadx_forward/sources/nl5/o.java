package nl5;

/* loaded from: classes15.dex */
public class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f419864d;

    /* renamed from: e, reason: collision with root package name */
    public final nl5.b0 f419865e;

    /* renamed from: f, reason: collision with root package name */
    public final nl5.a0 f419866f;

    public o(java.util.List list, nl5.a0 a0Var, nl5.b0 b0Var) {
        this.f419864d = list;
        this.f419866f = a0Var;
        this.f419865e = b0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f419864d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nl5.n nVar = (nl5.n) k3Var;
        nl5.z zVar = (nl5.z) this.f419864d.get(i17);
        nVar.f419862d.setText(zVar.f419930a);
        nVar.f419862d.setTag(zVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.boo, viewGroup, false);
        nl5.n nVar = new nl5.n(this, inflate);
        inflate.setOnClickListener(new nl5.m(this));
        return nVar;
    }
}
