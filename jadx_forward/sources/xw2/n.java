package xw2;

/* loaded from: classes2.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539243d;

    public n(xw2.s sVar) {
        this.f539243d = sVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        xw2.s sVar = this.f539243d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).getClass();
        return sVar.c((java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d).mo144003x754a37bb()).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int m176115xd666ff73;
        xw2.o holder = (xw2.o) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        xw2.s sVar = this.f539243d;
        m176115xd666ff73 = sVar.m176115xd666ff73();
        for (int i18 = 0; i18 < m176115xd666ff73; i18++) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).getClass();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d;
            java.util.Objects.toString(xw2.s.b(sVar, (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb(), i17, i18));
            android.view.View childAt = linearLayout.getChildAt(i18);
            childAt.setOnClickListener(new xw2.h(sVar, i17, i18));
            childAt.setOnLongClickListener(new xw2.i(sVar, i17, i18));
            xw2.u m176119xa0ab20ce = sVar.m176119xa0ab20ce();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) m176119xa0ab20ce).S6(j2Var, new xw2.j(sVar, i17, i18, null), new xw2.k(i17, i18, sVar, childAt));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        int m176115xd666ff73;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(parent.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        xw2.s sVar = this.f539243d;
        m176115xd666ff73 = sVar.m176115xd666ff73();
        for (int i18 = 0; i18 < m176115xd666ff73; i18++) {
            linearLayout.addView(android.view.LayoutInflater.from(parent.getContext()).inflate(sVar.mo63149x721372b7(), (android.view.ViewGroup) linearLayout, false));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).S6(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).f216101f, new xw2.l(null), new xw2.m(linearLayout, parent, sVar));
        return new xw2.o(linearLayout);
    }
}
