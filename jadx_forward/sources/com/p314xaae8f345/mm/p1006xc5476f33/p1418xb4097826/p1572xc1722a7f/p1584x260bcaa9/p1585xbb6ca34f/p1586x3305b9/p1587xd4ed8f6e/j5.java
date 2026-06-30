package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class j5 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f203275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ up2.o f203276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 f203278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203279e;

    public j5(vp2.l0 l0Var, up2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var, in5.s0 s0Var) {
        this.f203275a = l0Var;
        this.f203276b = oVar;
        this.f203277c = t5Var;
        this.f203278d = a5Var;
        this.f203279e = s0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
        int i17 = 0;
        int i18 = -1;
        for (java.lang.Object obj : this.f203275a.f520474e) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject().m76784x5db1b11() == j17) {
                i18 = i17;
            }
            i17 = i19;
        }
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5.o(this.f203277c, this.f203275a, i18, this.f203276b, i18 + this.f203276b.a0(), this.f203278d);
        }
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var = this.f203277c;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = t5Var.f203493p;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.getGlobalVisibleRect(rect);
        }
        int height = rect.height();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = t5Var.f203493p;
        boolean z17 = height == (c22849x81a93d252 != null ? c22849x81a93d252.getHeight() : 0) && rect.top >= 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var = this.f203278d;
        gp2.l0 l0Var = a5Var.f203109d;
        boolean z18 = l0Var != null && l0Var.K(i17, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAutoPlay by caller. playOrder=");
        sb6.append(i17);
        sb6.append(" isYAxisFullyVisible=");
        sb6.append(z17);
        sb6.append(" shouldPlay=");
        sb6.append(z18);
        sb6.append(" autoFocusPlayMode=");
        gp2.l0 l0Var2 = a5Var.f203109d;
        sb6.append(l0Var2 != null ? java.lang.Integer.valueOf(l0Var2.f355795u.c()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
        if (!z18) {
            h();
            return false;
        }
        gp2.l0 l0Var3 = a5Var.f203109d;
        if (l0Var3 != null) {
            l0Var3.I(true);
        }
        return true;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whichContainer, "whichContainer");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(whichContainer, this.f203275a);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        r45.fa2 fa2Var = this.f203275a.f520473d;
        if (fa2Var.f455658d == i17 && (linkedList = fa2Var.f455662h) != null) {
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) obj).m75936x14adae67(2);
                if ((c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == j17) && (c22849x81a93d25 = this.f203277c.f203493p) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                i18 = i19;
            }
        }
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cards, "cards");
        vp2.l0 l0Var = this.f203275a;
        if (i17 != l0Var.f520473d.f455658d) {
            return;
        }
        java.util.ArrayList feeds = l0Var.f520474e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        up2.o adapter = this.f203276b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        so2.j5 j5Var = (so2.j5) kz5.n0.k0(feeds);
        if (j5Var != null && (j5Var instanceof vp2.c0)) {
            kz5.h0.E(feeds);
            adapter.m8155x27702c4(feeds.size());
        }
        l0Var.f520473d.f455662h.addAll(cards);
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            if (sp2.z3.f492833a.b(l0Var.f520474e, (r45.ea2) it.next(), l0Var, this.f203277c.f203491n, true) && adapter != null) {
                adapter.m8149x8b456734(l0Var.f520474e.size() - 1);
            }
        }
        java.util.ArrayList feeds2 = l0Var.f520474e;
        int i18 = l0Var.f520473d.f455663i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds2, "feeds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        if (i18 > 0 && !(!kz5.j0.I(feeds2, vp2.c0.class).isEmpty())) {
            feeds2.add(new vp2.c0());
            adapter.m8149x8b456734(feeds2.size() - 1);
        }
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", "stopAutoPlay by caller");
        h();
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f203278d.f203109d;
        if (l0Var != null) {
            l0Var.j();
        }
    }

    public final void h() {
        gp2.l0 l0Var = this.f203278d.f203109d;
        if (l0Var != null) {
            l0Var.I(false);
        }
        android.content.Context context = this.f203279e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((sp2.x3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sp2.x3.class)).Y6();
    }
}
