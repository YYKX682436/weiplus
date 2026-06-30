package xt2;

/* loaded from: classes3.dex */
public final class l5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r5 f538406d;

    public l5(xt2.r5 r5Var) {
        this.f538406d = r5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f538406d.f538529o).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        xt2.k5 holder = (xt2.k5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        xt2.r5 r5Var = this.f538406d;
        cm2.m0 m0Var = r5Var.f538530p;
        cm2.m0 productInfo = (cm2.m0) ((java.util.ArrayList) r5Var.f538529o).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productInfo, "productInfo");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.l7a);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.rfn);
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.l58);
        android.widget.TextView textView4 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.l7n);
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.util.LinkedList linkedList = productInfo.f124904y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "<get-img_urls>(...)");
        wo0.c a17 = d1Var.a(((c61.i8) i5Var).Ai((java.lang.String) kz5.n0.Z(linkedList), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        ((wo0.b) a17).c(imageView);
        textView.setText(productInfo.f124903x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        hc2.o.b(textView3);
        textView3.setText(st2.w1.a(productInfo.f124901v));
        textView2.setVisibility(m0Var != null && (productInfo.f124902w > m0Var.f124902w ? 1 : (productInfo.f124902w == m0Var.f124902w ? 0 : -1)) == 0 ? 0 : 8);
        textView4.setText(java.lang.String.valueOf(productInfo.I));
        holder.f3639x46306858.setOnClickListener(new xt2.j5(holder.f538385d.f538406d, productInfo));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570519dt3, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new xt2.k5(this, inflate);
    }
}
