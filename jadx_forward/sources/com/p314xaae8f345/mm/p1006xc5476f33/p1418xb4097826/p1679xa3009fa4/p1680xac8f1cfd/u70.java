package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u70 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f217637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f217638e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f217639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217637d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r70.f217308d);
        this.f217638e = new java.util.HashMap();
        this.f217639f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s70.f217401d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    public final void O6(int i17) {
        pf5.u uVar = pf5.u.f435469a;
        long m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).S6().m75939xb282bd08(30) * 1000;
        boolean R6 = ((ey2.t0) ((jz5.n) this.f217639f).mo141623x754a37bb()).R6(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTabPreloadUIC", "startPreload: delayTimeSec = " + m75939xb282bd08 + ", tabType = " + i17 + " isAutoRefresh = " + R6);
        if (m75939xb282bd08 <= 0) {
            return;
        }
        if (R6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t70 t70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t70(this, i17);
            this.f217638e.put(java.lang.Integer.valueOf(i17), t70Var);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f217637d).mo141623x754a37bb()).mo50297x7c4d7ca2(t70Var, m75939xb282bd08);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) uVar.c(m158354x19263085()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o;
        if (copyOnWriteArraySet.contains(this)) {
            return;
        }
        copyOnWriteArraySet.add(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f217638e.remove(java.lang.Integer.valueOf(i27));
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTabPreloadUIC", "onFragmentChange: tabType = " + i27 + ", remove inside preload by fragment visible");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f217637d).mo141623x754a37bb()).mo50300x3fa464aa(runnable);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.HashMap hashMap = this.f217638e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f217637d).mo141623x754a37bb()).mo50300x3fa464aa((java.lang.Runnable) ((java.util.Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209480t7).mo141623x754a37bb()).r()).booleanValue()) {
            return;
        }
        for (bs2.n1 n1Var : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).f204076e) {
            bs2.b0 b0Var = n1Var.f105458s;
            if (b0Var.f105339b != null && b0Var.f105340c == bs2.h0.f105385o) {
                n1Var.e(true, "clearAllInside");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    /* renamed from: onPageScrolled */
    public void mo55649xf210c75a(int i17, float f17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
