package nx0;

/* loaded from: classes5.dex */
public final class a3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f422599d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f422600e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f422601f;

    public a3(java.util.List itemDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemDataList, "itemDataList");
        this.f422599d = itemDataList;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f422600e = fVar.a();
        this.f422601f = nx0.z2.f422807d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f422599d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nx0.x2 holder = (nx0.x2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nx0.b3 b3Var = (nx0.b3) this.f422599d.get(i17);
        b3Var.getClass();
        boolean z17 = b3Var == nx0.b3.f422607g;
        java.lang.String str = b3Var.f422609b;
        java.lang.String string = z17 ? holder.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n1v) : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.View view = holder.f3639x46306858;
        if (b3Var.f422611d) {
            string = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mck, string);
        }
        view.setContentDescription(string);
        holder.f422793d.setBackground(b3Var.f422611d ? k.a.a(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ckg) : null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = holder.f422794e;
        if (z17) {
            c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cl8);
        } else {
            vo0.e.f520001b.c(b3Var.f422610c, c22628xfde5d61d, this.f422600e);
        }
        holder.f422795f.setText(str);
        holder.f422796g.setVisibility(b3Var.f422612e ? 0 : 8);
        holder.f3639x46306858.setOnClickListener(new nx0.y2(this, i17, b3Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwp, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new nx0.x2(this, inflate);
    }
}
