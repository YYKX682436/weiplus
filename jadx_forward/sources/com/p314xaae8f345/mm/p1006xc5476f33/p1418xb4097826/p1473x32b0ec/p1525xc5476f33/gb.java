package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h {

    /* renamed from: s, reason: collision with root package name */
    public static final int f194202s = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);

    /* renamed from: t, reason: collision with root package name */
    public static final int f194203t = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f194204p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f194205q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f194206r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194204p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.db(root));
        this.f194205q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fb(root));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb r19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ab r20, int r21, java.lang.String r22, boolean r23, long r24, android.view.View r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb.t1(com.tencent.mm.plugin.finder.live.plugin.gb, com.tencent.mm.plugin.finder.live.plugin.ab, int, java.lang.String, boolean, long, android.view.View, int, java.lang.Object):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible visible:");
        sb6.append(i17);
        sb6.append(",root.alpha:");
        android.view.ViewGroup viewGroup = this.f446856d;
        sb6.append(viewGroup.getAlpha());
        sb6.append(",isShow:");
        sb6.append(viewGroup.isShown());
        sb6.append(",root.parent:");
        sb6.append(viewGroup.getParent());
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveBottomTipsLazyPlugin", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveBottomTipsLazyPlugin", "unMount!");
        java.lang.Runnable runnable = this.f194206r;
        android.view.ViewGroup viewGroup = this.f446856d;
        viewGroup.removeCallbacks(runnable);
        viewGroup.animate().setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb(this)).alpha(0.0f).start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }
}
