package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class c extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a f203129f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f203130g = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);

    /* renamed from: h, reason: collision with root package name */
    public static final int f203131h;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f203132e;

    static {
        int i17;
        com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24);
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        f203131h = i18;
    }

    public c(boolean z17) {
        this.f203132e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.a item = (vp2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        int i19 = 0;
        if (layoutParams != null && (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a aVar = f203129f;
            boolean z18 = this.f203132e;
            int i27 = f203130g;
            if (z18) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i27;
                if (item.f520436f != item.f520437g - 1) {
                    i27 = 0;
                }
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i27;
                layoutParams.width = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a.a(aVar) - com.p314xaae8f345.mm.ui.zk.a(holder.f374654e, 24);
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i27;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i27;
                layoutParams.width = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a.a(aVar);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hk6);
        mn2.g1 g1Var = mn2.g1.f411508a;
        r45.nt0 nt0Var = item.f520434d;
        if (imageView != null) {
            java.lang.String m75945x2fec8307 = nt0Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            g1Var.e().c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hk7);
        if (imageView2 != null) {
            java.lang.String m75945x2fec83072 = nt0Var.m75945x2fec8307(2);
            g1Var.e().c(new mn2.q3(m75945x2fec83072 != null ? m75945x2fec83072 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView2, g1Var.h(mn2.f1.f411498s));
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.m66);
        if (p17 != null) {
            try {
                i19 = android.graphics.Color.parseColor("#" + nt0Var.m75945x2fec8307(3));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdConvert", "color Exception " + e17);
            }
            p17.setBackgroundColor(i19);
            p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b(item, holder));
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.m66);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(p18, "live_square_banner_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p18, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p18, 40, 26236);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
    }
}
