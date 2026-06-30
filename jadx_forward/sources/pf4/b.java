package pf4;

/* loaded from: classes3.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f435378d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f435379e = new java.util.ArrayList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435379e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        pf4.a holder = (pf4.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = i17 == this.f435378d;
        android.view.View view = holder.f435368d;
        view.setSelected(z17);
        boolean f17 = bf4.f.f101248b.f();
        java.util.ArrayList arrayList = this.f435379e;
        if (f17) {
            view.setActivated(((if4.f) arrayList.get(i17)).f372776a.w0());
        } else {
            view.setActivated(((if4.f) arrayList.get(i17)).f372781f.f372769d);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571079cx2, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new pf4.a(this, inflate);
    }
}
