package uf5;

/* loaded from: classes8.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f508766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f508767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf5.k f508768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f508769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f508770h;

    public h(java.util.ArrayList arrayList, java.util.HashSet hashSet, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f508766d = arrayList;
        this.f508767e = hashSet;
        this.f508768f = kVar;
        this.f508769g = imageView;
        this.f508770h = button;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f508766d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String str = (java.lang.String) this.f508766d.get(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.u1a);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.u1_);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.u1b);
        l02.n.a(imageView, this.f508767e.contains(str) ? "checkbox_cell_on" : "checkbox_cell_off");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            textView.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(n17));
        } else {
            textView.setText(str);
        }
        holder.f3639x46306858.setOnClickListener(new uf5.f(holder, this.f508766d, this.f508767e, this, this.f508768f, this.f508769g, this.f508770h));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new uf5.g(android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dz7, parent, false));
    }
}
