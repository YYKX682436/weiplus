package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class f0 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.e f203191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x f203192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 f203195e;

    public f0(vp2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var) {
        this.f203191a = eVar;
        this.f203192b = xVar;
        this.f203193c = h0Var;
        this.f203194d = h0Var2;
        this.f203195e = m0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
        int i17 = 0;
        int i18 = -1;
        for (java.lang.Object obj : this.f203191a.f520448e) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f203194d;
            int a07 = ((up2.c) h0Var.f391656d).a0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f203193c.f391656d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = this.f203192b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0.n(this.f203195e, this.f203191a, i18, (p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) h0Var.f391656d, i18 + a07, c1163xf1deaba4, xVar.f203549f, xVar);
        }
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f203193c;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.getGlobalVisibleRect(rect);
        }
        int height = rect.height();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d;
        boolean z17 = height == (c22849x81a93d252 != null ? c22849x81a93d252.getHeight() : 0) && rect.top >= 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = this.f203192b;
        gp2.l0 l0Var = xVar.f203549f;
        boolean z18 = l0Var != null && l0Var.K(i17, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAutoPlay by caller. playOrder=");
        sb6.append(i17);
        sb6.append(" isYAxisFullyVisible=");
        sb6.append(z17);
        sb6.append(" shouldPlay=");
        sb6.append(z18);
        sb6.append(" autoFocusPlayMode=");
        gp2.l0 l0Var2 = xVar.f203549f;
        sb6.append(l0Var2 != null ? java.lang.Integer.valueOf(l0Var2.f355795u.c()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb6.toString());
        if (z18) {
            gp2.l0 l0Var3 = xVar.f203549f;
            if (l0Var3 != null) {
                l0Var3.I(true);
            }
            return true;
        }
        gp2.l0 l0Var4 = xVar.f203549f;
        if (l0Var4 != null) {
            l0Var4.I(false);
        }
        return false;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whichContainer, "whichContainer");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(whichContainer, this.f203191a);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
        java.util.LinkedList linkedList;
        r45.fa2 fa2Var = this.f203191a.f520447d;
        if (fa2Var.f455658d == i17 && (linkedList = fa2Var.f455662h) != null) {
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) obj).m75936x14adae67(2);
                if (c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == j17) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) this.f203193c.f391656d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                i18 = i19;
            }
        }
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", "stopAutoPlay by caller.");
        gp2.l0 l0Var = this.f203192b.f203549f;
        if (l0Var == null) {
            return;
        }
        l0Var.I(false);
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f203192b.f203549f;
        if (l0Var != null) {
            l0Var.j();
        }
    }
}
