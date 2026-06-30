package kl2;

/* loaded from: classes3.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f390345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl2.v f390346e;

    public s(kl2.v vVar, java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f390346e = vVar;
        this.f390345d = itemList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f390345d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kl2.u holder = (kl2.u) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f390349d.setOnClickListener(new kl2.r(this.f390346e, i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("￥");
        java.util.List list = this.f390345d;
        sb6.append(((kl2.t) list.get(i17)).f390347a);
        holder.f390350e.setText(sb6.toString());
        holder.f390351f.setVisibility(((kl2.t) list.get(i17)).f390348b ? 0 : 8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ayg, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new kl2.u(inflate);
    }
}
