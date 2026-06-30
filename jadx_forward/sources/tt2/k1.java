package tt2;

/* loaded from: classes3.dex */
public final class k1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f503483d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public r45.p45 f503484e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f503483d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        tt2.j1 holder = (tt2.j1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f503483d;
        r45.o45 o45Var = (r45.o45) kz5.n0.a0(list, i17);
        if (o45Var != null) {
            r45.p45 p45Var = this.f503484e;
            int size = ((java.util.ArrayList) list).size();
            android.view.View view = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 c14975x15ef5b10 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10) view : null;
            if (c14975x15ef5b10 != null) {
                boolean z17 = i17 == 0;
                android.widget.ImageView imageView = c14975x15ef5b10.f207825d;
                if (z17) {
                    imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17 + 1);
                sb6.append('/');
                sb6.append(size);
                c14975x15ef5b10.f207827f.setText(sb6.toString());
                mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                java.lang.String m75945x2fec8307 = o45Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                ((wo0.b) d1Var.a(((c61.i8) i5Var).Ai(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
                c14975x15ef5b10.post(new xt2.v(c14975x15ef5b10, o45Var, p45Var));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 c14975x15ef5b10 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10(context);
        c14975x15ef5b10.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return new tt2.j1(this, c14975x15ef5b10);
    }
}
