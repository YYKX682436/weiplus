package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ye extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.o72 f218098d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f218099e;

    /* renamed from: f, reason: collision with root package name */
    public long f218100f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f218101g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218102h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218103i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f218104m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f218105n;

    /* renamed from: o, reason: collision with root package name */
    public int f218106o;

    /* renamed from: p, reason: collision with root package name */
    public int f218107p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f218108q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f218100f = java.lang.System.currentTimeMillis();
        this.f218102h = true;
        this.f218104m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pe(this));
        this.f218105n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qe.f217226d);
        this.f218106o = -1;
        this.f218107p = -1;
        this.f218108q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.re(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye.O6(com.tencent.mm.plugin.finder.viewmodel.component.ye, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 P6(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 P6;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                if (childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) {
                    return (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) childAt;
                }
                android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                if (viewGroup2 != null && (P6 = P6(viewGroup2)) != null) {
                    return P6;
                }
            }
            i17++;
        }
    }

    public final int Q6() {
        return ((java.lang.Number) this.f218104m.mo141623x754a37bb()).intValue();
    }

    public final int R6() {
        jz5.g gVar = this.f218105n;
        if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() > 0) {
            return ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        }
        int i17 = this.f218106o;
        return i17 == -1 ? gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC, 0) : i17;
    }

    public final int S6() {
        int i17 = this.f218107p;
        return i17 == -1 ? gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC, 0) : i17;
    }

    public final void T6(boolean z17) {
        if (R6() <= 0 || S6() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedSafeCheckUIC", "startNextSafeCheck: not support feed safe check 1, intervalSce=" + R6() + ", lastFeedCount=" + S6());
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f218101g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f218101g = null;
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "startNextSafeCheck: notify from remote, cancle cur job");
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f218101g;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            this.f218101g = null;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f218101g;
        if (r2Var3 != null && r2Var3.a()) {
            return;
        }
        this.f218101g = p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xe(z17, this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "onPause: activity=" + m158354x19263085().getClass().getSimpleName() + ", commentScene=" + Q6());
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f218103i;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f218103i = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f218101g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f218101g = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "onResume: activity=" + m158354x19263085().getClass().getSimpleName() + ", commentScene=" + Q6() + ", isUserVisibleFocused=" + getIsUserVisibleFocused());
        if (getIsUserVisibleFocused()) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f218103i;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15455x4e229b6d c15455x4e229b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15455x4e229b6d(this, com.p314xaae8f345.mm.app.a0.f134821d);
            this.f218103i = c15455x4e229b6d;
            c15455x4e229b6d.mo48813x58998cd();
            T6(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "onUserVisibleFocused: activity=" + m158354x19263085().getClass().getSimpleName() + ", commentScene=" + Q6() + ", isFirstUserVisibleFocus=" + this.f218102h);
        if (this.f218102h) {
            this.f218100f = java.lang.System.currentTimeMillis();
            this.f218102h = false;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f218103i;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15455x4e229b6d c15455x4e229b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15455x4e229b6d(this, com.p314xaae8f345.mm.app.a0.f134821d);
        this.f218103i = c15455x4e229b6d;
        c15455x4e229b6d.mo48813x58998cd();
        T6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "onUserVisibleUnFocused: activity=" + m158354x19263085().getClass().getSimpleName() + ", commentScene=" + Q6());
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f218103i;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f218103i = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f218101g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f218101g = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f218100f = java.lang.System.currentTimeMillis();
        this.f218102h = true;
        this.f218104m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pe(this));
        this.f218105n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qe.f217226d);
        this.f218106o = -1;
        this.f218107p = -1;
        this.f218108q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.re(this));
    }
}
