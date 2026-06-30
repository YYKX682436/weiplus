package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class fq extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.a63 f199902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jq f199903e;

    public fq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jq jqVar, r45.a63 categoryInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryInfo, "categoryInfo");
        this.f199903e = jqVar;
        this.f199902d = categoryInfo;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f199902d.m75941xfb821914(2).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        mm2.g1 g1Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cq holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cq) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.q12 q12Var = null;
        holder.f374658i = null;
        r45.a63 a63Var = this.f199902d;
        java.util.LinkedList m75941xfb821914 = a63Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGame_app_info_list(...)");
        r45.z53 z53Var2 = (r45.z53) kz5.n0.a0(m75941xfb821914, i17);
        if (z53Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar = this.f199903e.f200303h;
            holder.f374658i = z53Var2;
            java.lang.String m75945x2fec83072 = z53Var2.m75945x2fec8307(1);
            java.lang.String str = "";
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            holder.f199553o.setText(m75945x2fec83072);
            i95.m c17 = i95.n0.c(vd2.i5.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            vd2.i5 i5Var = (vd2.i5) c17;
            java.lang.String m75945x2fec83073 = z53Var2.m75945x2fec8307(2);
            vd2.i5.l8(i5Var, m75945x2fec83073 == null ? "" : m75945x2fec83073, holder.f199552n, null, 4, null);
            nqVar.getClass();
            zl2.r4 r4Var = zl2.r4.f555483a;
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            if (g1Var2 != null && (j2Var2 = g1Var2.f410601f) != null) {
                q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb();
            }
            if (r4Var.T1(q12Var) && (g1Var = (mm2.g1) efVar.i(mm2.g1.class)) != null && (j2Var = g1Var.f410604i) != null && (n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) != null && (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) != null && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                str = m75945x2fec8307;
            }
            holder.f199554p.setVisibility(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, z53Var2.m75945x2fec8307(0)) ? 0 : 8);
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.eq(z53Var2, nqVar));
            android.view.View view = holder.f199555q;
            int i18 = i17 != a63Var.m75941xfb821914(2).size() - 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f199903e.f309888d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dkh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cq(this, inflate);
    }
}
