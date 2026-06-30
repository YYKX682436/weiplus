package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class e5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f193903d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193904e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f193905f;

    public e5(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193903d = context;
        this.f193904e = "Finder.FinderLiveAnchorCloseBannerAdapter";
        this.f193905f = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f193905f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.y52 y52Var = (r45.y52) kz5.n0.a0(this.f193905f, i17);
        if (y52Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566359fn3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22628xfde5d61d);
            ym5.a1.h(c22628xfde5d61d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c5(y52Var));
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d e17 = g1Var.e();
            java.lang.String m75945x2fec8307 = y52Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            e17.c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), c22628xfde5d61d, g1Var.h(mn2.f1.f411486d));
            java.lang.String m75945x2fec83072 = y52Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c22628xfde5d61d.setTag(com.p314xaae8f345.mm.R.id.f565948e72, m75945x2fec83072);
            c22628xfde5d61d.m81387x205ac394(i65.a.b(this.f193903d, 10));
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566360fn4);
            java.lang.String m75945x2fec83073 = y52Var.m75945x2fec8307(2);
            c23001x9d3a0bdc.b(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d5(this, y52Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f193903d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.alh, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b5(inflate);
    }
}
