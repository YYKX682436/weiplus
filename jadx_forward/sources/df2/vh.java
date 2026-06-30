package df2;

/* loaded from: classes3.dex */
public final class vh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313135m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f313136n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 f313137o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f313138p;

    /* renamed from: q, reason: collision with root package name */
    public int f313139q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f313140r;

    /* renamed from: s, reason: collision with root package name */
    public int f313141s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313135m = "Finder.LiveGameDataBannerController";
        this.f313140r = jz5.h.b(new df2.rh(this));
    }

    public final int Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f32 = this.f313137o;
        if (!(c14316xd081b6f32 != null ? c14316xd081b6f32.isShown() : false) || (c14316xd081b6f3 = this.f313137o) == null || (layoutParams = c14316xd081b6f3.getLayoutParams()) == null) {
            return 0;
        }
        return layoutParams.height;
    }

    public final void a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, str + " hideGameDataCard");
        if2.d0 d0Var = this.f313136n;
        if (d0Var != null) {
            d0Var.d(8);
        }
    }

    public final void b7(java.lang.String source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" postReleaseTask,gameDataView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f313137o;
        sb6.append(c14316xd081b6f3 != null ? c14316xd081b6f3.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f32 = this.f313137o;
        if (c14316xd081b6f32 != null) {
            c14316xd081b6f32.postDelayed((java.lang.Runnable) ((jz5.n) this.f313140r).mo141623x754a37bb(), j17);
        }
    }

    public final void c7(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        e7(source);
        a7(source);
        d7(source);
    }

    public final void d7(java.lang.String source) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, source + " releaseGameDataCard");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f313137o;
        if (c14316xd081b6f3 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14316xd081b6f3.f197433f, "release: source=" + source + ", liteAppView=" + c14316xd081b6f3.f197440p);
            android.view.View view = c14316xd081b6f3.f197440p;
            if (view != null) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
                    ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).g();
                }
            }
            c14316xd081b6f3.f197440p = null;
        }
        this.f313137o = null;
        this.f313136n = null;
    }

    public final void e7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, str + " removeReleaseTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f313137o;
        if (c14316xd081b6f3 != null) {
            c14316xd081b6f3.removeCallbacks((java.lang.Runnable) ((jz5.n) this.f313140r).mo141623x754a37bb());
        }
    }

    public final void f7() {
        boolean z17 = this.f313138p;
        java.lang.String str = this.f313135m;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPollingBannerData is done");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPollingBannerData");
        this.f313138p = true;
        r45.cc2 cc2Var = new r45.cc2();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.e(20, cc2Var, new df2.sh(this, r45.dc2.class), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.vh.g7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        return ((mm2.g0) m56788xbba4bfc0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, "onLiveActivate");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, "stopPollingBannerData have startPolling:" + this.f313138p);
        dk2.ef.f314925k.f(20);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var;
        super.mo14867x5aa1c816(r71Var);
        if (U6()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f313137o;
        if (!(c14316xd081b6f3 != null ? c14316xd081b6f3.isShown() : false) || (ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class)) == null) {
            return;
        }
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf C1 = ob0Var.C1();
        int[] iArr = new int[2];
        C1.getLocationOnScreen(iArr);
        int i17 = this.f313139q;
        if (i17 <= 0 || iArr[1] == i17 || C1.getHeight() <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313135m, "onLiveMsg previewLocY change from " + this.f313139q + " to " + iArr[1]);
        this.f313139q = iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0.class);
        if (le0Var != null) {
            le0Var.v1(iArr[0], iArr[1], C1.getHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz.class);
        if (ozVar != null) {
            ozVar.t1(iArr[0], iArr[1], C1.getHeight());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        f7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            f7();
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        c7("onViewUnmount");
        this.f313139q = 0;
    }
}
