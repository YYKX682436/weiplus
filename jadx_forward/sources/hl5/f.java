package hl5;

/* loaded from: classes15.dex */
public class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f363656d;

    /* renamed from: e, reason: collision with root package name */
    public final nl5.a0 f363657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hl5.g f363658f;

    public f(hl5.g gVar, java.util.List list, nl5.a0 a0Var) {
        this.f363658f = gVar;
        this.f363656d = list;
        this.f363657e = a0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f363656d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        hl5.e eVar = (hl5.e) k3Var;
        nl5.z zVar = (nl5.z) this.f363656d.get(i17);
        eVar.f363655d.setText(zVar.f419930a);
        eVar.f363655d.setTag(zVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.boo, viewGroup, false);
        hl5.e eVar = new hl5.e(this, inflate);
        inflate.setOnClickListener(new hl5.d(this));
        return eVar;
    }
}
