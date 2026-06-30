package nx0;

/* loaded from: classes5.dex */
public final class g2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f422651d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f422652e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f422653f;

    public g2(java.util.List itemDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemDataList, "itemDataList");
        this.f422651d = itemDataList;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f422652e = fVar.a();
        this.f422653f = nx0.f2.f422639d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f422651d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nx0.d2 holder = (nx0.d2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nx0.i2 i2Var = (nx0.i2) this.f422651d.get(i17);
        boolean a17 = i2Var.a();
        java.lang.String str = i2Var.f422666b;
        java.lang.String string = a17 ? holder.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mcn) : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.View view = holder.f3639x46306858;
        if (i2Var.f422668d) {
            string = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mck, string);
        }
        view.setContentDescription(string);
        holder.f422625d.setBackground(i2Var.f422668d ? k.a.a(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ckg) : null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = holder.f422626e;
        if (a17) {
            c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cl8);
        } else {
            vo0.e.f520001b.c(i2Var.f422667c, c22628xfde5d61d, this.f422652e);
        }
        holder.f422627f.setText(str);
        holder.f3639x46306858.setOnClickListener(new nx0.e2(this, i17, i2Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwn, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new nx0.d2(this, inflate);
    }
}
