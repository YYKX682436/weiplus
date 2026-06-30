package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class km0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f194812p;

    /* renamed from: q, reason: collision with root package name */
    public final fg2.z1 f194813q;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f194814r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f194815s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f194816t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f194817u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f194818v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f194819w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f194820x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f194821y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194812p = rootView;
        this.f194813q = fg2.z1.a(rootView);
        this.f194817u = true;
        this.f194818v = new java.util.LinkedList();
        this.f194819w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ul0(this));
        this.f194821y = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rl0.f195691d);
        K0(8);
        rootView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ql0(this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "startLoop: " + km0Var.f194814r);
        int i17 = km0Var.f194814r + 1;
        if (i17 >= km0Var.f194818v.size()) {
            i17 = 0;
        }
        km0Var.f194819w.mo50303x856b99f0(1);
        if (km0Var.f194818v.size() > 1) {
            km0Var.f194819w.mo50311x7ab51103(km0Var.f194819w.mo50290x733c63a2(1, i17, 0), 5000L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "currentList size <=1 not need loop");
        km0Var.f194814r = 0;
        if (!km0Var.f194818v.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "currentList size ==1 update view to current data");
            java.lang.Object obj = km0Var.f194818v.get(km0Var.f194814r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            km0Var.w1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) obj, false);
        }
        km0Var.f194817u = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        zg2.d dVar;
        zg2.d dVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sl0.f195809a[status.ordinal()] == 1) {
            ((mm2.f7) P0(mm2.f7.class)).f410591f.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wl0(this));
            df2.c9 c9Var = (df2.c9) U0(df2.c9.class);
            if (c9Var != null && (dVar2 = c9Var.f311400m) != null) {
                dVar2.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yl0(this));
            }
            ((mm2.f7) P0(mm2.f7.class)).f410592g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.am0(this));
            df2.a0 a0Var = (df2.a0) U0(df2.a0.class);
            if (a0Var != null && (dVar = a0Var.f311180m) != null) {
                dVar.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cm0(this));
            }
            this.f194813q.f343957f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dm0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        u1(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return (zl2.r4.F1(S0()) || ((mm2.c1) P0(mm2.c1.class)).f410334f2 == 1) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1(boolean z17) {
        this.f194814r = 0;
        if (z17 || this.f194818v.isEmpty()) {
            this.f194818v.clear();
            K0(8);
            this.f194817u = true;
            this.f194819w.mo50303x856b99f0(1);
        }
        android.animation.ObjectAnimator objectAnimator = this.f194820x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final java.util.HashMap v1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user_type", zl2.r4.f555483a.w1() ? "1" : "2");
        java.lang.String str = this.f194815s;
        if (str == null) {
            str = "";
        }
        hashMap.put("wish_list_id", str);
        hashMap.put("screen_type", x0() ? "2" : "1");
        int i17 = this.f194814r;
        int size = this.f194818v.size() - 1;
        if (i17 > size) {
            i17 = size;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) this.f194818v.get(i17)).f195958a instanceof r45.aa4) {
            hashMap.put("type", "1");
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) this.f194818v.get(i17)).f195958a instanceof r45.zv1) {
            hashMap.put("type", "2");
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) this.f194818v.get(i17)).f195958a instanceof r45.gh6) {
            hashMap.put("type", "3");
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0205, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0 r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0.w1(com.tencent.mm.plugin.finder.live.plugin.tl0, boolean):void");
    }
}
