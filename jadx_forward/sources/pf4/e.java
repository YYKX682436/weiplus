package pf4;

/* loaded from: classes4.dex */
public final class e extends pf4.h {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f435393e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435402d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        pf4.c holder = (pf4.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f435402d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = holder.f3639x46306858.getContext();
        java.lang.String g27 = n17.g2();
        android.widget.TextView textView = holder.f435383e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize));
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = holder.f435382d;
        wVar.Ri(imageView, str, 0.5f);
        imageView.setOnClickListener(new pf4.d(str, this, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwk, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new pf4.c(this, inflate);
    }
}
