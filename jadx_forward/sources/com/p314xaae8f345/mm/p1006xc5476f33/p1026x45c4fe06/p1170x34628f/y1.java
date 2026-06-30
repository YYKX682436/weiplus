package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 {
    public boolean A1;
    public final java.lang.Runnable B1;
    public final java.lang.Runnable C1;
    public final java.util.LinkedList D1;
    public java.lang.String W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.FrameLayout f168799l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.util.SparseIntArray f168800p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168801p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f168802x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.Map f168803x1;

    /* renamed from: y0, reason: collision with root package name */
    public zl1.t f168804y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.util.SparseArray f168805y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f168806z1;

    public y1(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        super(context, i3Var);
        this.f168800p0 = new android.util.SparseIntArray();
        this.f168803x1 = new java.util.HashMap();
        this.f168805y1 = new android.util.SparseArray();
        this.f168806z1 = false;
        this.A1 = false;
        this.B1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z1(this);
        this.C1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b2(this);
        this.D1 = new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r6.getChildAt(r6.getChildCount() - 1) == r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 r21, long r22, java.lang.String r24, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1.O(com.tencent.mm.plugin.appbrand.page.y1, long, java.lang.String, com.tencent.mm.plugin.appbrand.page.wd):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void C(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        R(j17, str, null, wdVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void D() {
        mo14682x9dee9c37().getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void E() {
        mo14683xad58292c();
        mo14682x9dee9c37().v2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void F() {
        mo14683xad58292c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
        if (v5Var != null) {
            v5Var.A2();
        }
        java.util.Iterator it = new x.d(((java.util.HashMap) this.f168803x1).values()).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) it.next()).A2();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void G() {
        mo14683xad58292c();
        L();
        setVisibility(0);
        mo14682x9dee9c37().C2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 s2Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) s2Var).e(this.f168804y0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 J(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2 k2Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiplePage", "recycleAppBrandPageView webviewId:%d", java.lang.Integer.valueOf(i17));
        java.util.Map map = this.f168803x1;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (true) {
            k2Var = null;
            if (!it.hasNext()) {
                str = "";
                v5Var = null;
                break;
            }
            str = (java.lang.String) it.next();
            v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) ((java.util.HashMap) map).get(str);
            if (v5Var != null && i17 == v5Var.mo50260x9f1221c2()) {
                v5Var.S2();
                break;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7 b7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167962a;
            ((java.util.HashMap) map).put(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167965d);
            java.util.LinkedList linkedList = this.D1;
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2 k2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2) it6.next();
                if (str.equals(k2Var2.f168349d)) {
                    k2Var = k2Var2;
                    break;
                }
            }
            if (k2Var != null) {
                removeCallbacks(k2Var);
                linkedList.remove(k2Var);
            }
        }
        return v5Var;
    }

    public final void P(boolean z17) {
        java.util.LinkedList linkedList = this.D1;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2) it.next();
            removeCallbacks(k2Var);
            if (z17) {
                k2Var.run();
            } else {
                k2Var.f168351f = true;
            }
        }
        linkedList.clear();
    }

    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 Q(boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
            if (v5Var != null) {
                return v5Var;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) ((java.util.HashMap) this.f168803x1).get(nf.z.a(this.W));
    }

    public final void R(long j17, final java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        int i17;
        int i18;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        u65.a aVar;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiplePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", m52222x74292566(), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 Q = Q(true);
        if (Q != null) {
            int b27 = Q.b2();
            int mo50260x9f1221c2 = Q.mo50260x9f1221c2();
            z17 = Q.p2();
            i17 = b27;
            i18 = mo50260x9f1221c2;
        } else {
            i17 = -1;
            i18 = -1;
            z17 = false;
        }
        if (u46.l.c(str, this.W) && this.f168800p0.get(str.hashCode(), 0) == 1) {
            if (j2Var != null) {
                j2Var.b(this, str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb m52177x6c78b088 = m52223xe6eebdcb().m52177x6c78b088();
                if (m52177x6c78b088 != null && wdVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB) {
                    ((com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) m52177x6c78b088).f(j17, str, z17, i17, i18, z17, i17, i18, wdVar, null, null);
                }
                j2Var.a(this, str);
                return;
            }
            return;
        }
        int b17 = this.f168804y0.b(str);
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiplePage", "loadUrl, index not found, appId:%s, url:%s", m52222x74292566(), str);
            if (j2Var != null) {
                j2Var.c(this, str);
                return;
            }
            return;
        }
        P(true);
        this.W = str;
        this.f168800p0.put(str.hashCode(), 1);
        this.f168804y0.f(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) ((java.util.HashMap) this.f168803x1).get(nf.z.a(str));
        if (!(v5Var2 == null ? true : v5Var2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167965d))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) ((java.util.HashMap) this.f168803x1).get(nf.z.a(str));
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f2 f2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f2(this, str, v5Var3, wdVar, j17, z17, i17, i18, j2Var);
            if (v5Var3 == null || !v5Var3.p2()) {
                f2Var.run();
                return;
            }
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            v5Var3.X0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1.this;
                    y1Var.getClass();
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] switchToImage received, time: %d", y1Var.m52222x74292566(), str, java.lang.Long.valueOf(currentTimeMillis2));
                    f2Var.run();
                }
            }, 500L);
            v5Var3.o3();
            if (((java.util.HashMap) this.f168803x1).size() > 1) {
                this.D1.addLast(f2Var);
                postDelayed(f2Var, 500L);
                return;
            }
            return;
        }
        java.lang.String a17 = nf.z.a(str);
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var4 = this.f168801p1;
            if (v5Var4 != null) {
                this.f168801p1 = null;
            } else {
                v5Var4 = m52223xe6eebdcb().o(a17);
                v5Var4.W = this;
            }
            v5Var = v5Var4;
            ((java.util.HashMap) this.f168803x1).put(a17, v5Var);
            this.f168799l1.addView(v5Var.mo51310xc2a54588(), 0);
        }
        boolean[] zArr = new boolean[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e2(this, j2Var, zArr, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiplePage", "loadAndWait appId[%s] url[%s]", m52222x74292566(), str);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g2(this, str, j17, wdVar, e2Var);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = new java.util.concurrent.atomic.AtomicBoolean(false);
        try {
            final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            final u65.a aVar2 = new u65.a(v5Var.p2() ? 2 : 1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1.this;
                    y1Var.getClass();
                    boolean z19 = atomicBoolean3.get();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k2 k2Var = g2Var;
                    if (z19) {
                        k2Var.run();
                    } else {
                        y1Var.post(k2Var);
                    }
                }
            });
            if (v5Var.p2()) {
                try {
                    atomicBoolean2 = atomicBoolean3;
                    aVar = aVar2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    atomicBoolean2 = atomicBoolean3;
                    atomicBoolean = atomicBoolean2;
                    atomicBoolean.set(true);
                    throw th;
                }
                try {
                    v5Var.X0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1.this;
                            y1Var.getClass();
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] switchToImage received, time: %d", y1Var.m52222x74292566(), str, java.lang.Long.valueOf(currentTimeMillis3));
                            aVar2.b();
                        }
                    }, 500L);
                    v5Var.o3();
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    atomicBoolean = atomicBoolean2;
                    atomicBoolean.set(true);
                    throw th;
                }
            } else {
                aVar = aVar2;
                atomicBoolean2 = atomicBoolean3;
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean4 = atomicBoolean2;
            try {
                v5Var.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h2(this, v5Var, currentTimeMillis2, str, aVar));
                if (((java.util.HashMap) this.f168803x1).size() > 1) {
                    try {
                        this.D1.addLast(g2Var);
                        postDelayed(g2Var, 500L);
                        z18 = true;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        atomicBoolean = atomicBoolean4;
                        atomicBoolean.set(true);
                        throw th;
                    }
                } else {
                    z18 = true;
                }
                this.f168806z1 = z18;
                v5Var.r2(j17, str, wdVar);
                atomicBoolean4.set(z18);
                int b28 = v5Var.b2();
                int mo50260x9f1221c22 = v5Var.mo50260x9f1221c2();
                boolean p27 = v5Var.p2();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb m52177x6c78b0882 = m52223xe6eebdcb().m52177x6c78b088();
                if (m52177x6c78b0882 != null && wdVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB) {
                    ((com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) m52177x6c78b0882).f(j17, str, z17, i17, i18, p27, b28, mo50260x9f1221c22, wdVar, null, null);
                }
                if (j2Var != null) {
                    j2Var.b(this, str);
                    zArr[0] = true;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            atomicBoolean = atomicBoolean3;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentPageView */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37() {
        return Q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentUrl */
    public java.lang.String mo14683xad58292c() {
        return this.W;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentWindowId */
    public int mo52213x2838138e() {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5> linkedList = new java.util.LinkedList(((java.util.HashMap) this.f168803x1).values());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
        if (v5Var != null) {
            linkedList.add(v5Var);
        }
        int i17 = -1;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 : linkedList) {
            if (v5Var2.p2()) {
                if (i17 == -1) {
                    i17 = v5Var2.b2();
                } else if (i17 != v5Var2.b2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("MicroMsg.AppBrandMultiplePage", "mPageViews has diff windowId,error ,windowId is [%d],other windowId is [%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var2.b2()));
                }
            }
        }
        return i17;
    }

    /* renamed from: getTabBar */
    public zl1.t m52251x308dc334() {
        return this.f168804y0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235 c12498x9f7db235) {
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiplePage", "getCurrentFullScreenView err, pageView is null");
            return;
        }
        if (c12498x9f7db235 == null || c12498x9f7db235.getParent() != null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f168802x0;
        if (viewGroup instanceof android.view.ViewGroup) {
            viewGroup.addView(c12498x9f7db235, new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f168805y1.put(v5Var.hashCode(), c12498x9f7db235);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void k() {
        this.A1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
        if (v5Var != null) {
            v5Var.h();
        }
        java.util.Map map = this.f168803x1;
        java.util.Iterator it = new x.d(((java.util.HashMap) map).values()).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) it.next()).h();
        }
        P(false);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        zl1.t tVar = this.f168804y0;
        if (tVar != null) {
            tVar.m179084xa2b9091a(null);
            this.f168804y0.a();
            this.f168804y0 = null;
        }
        this.f168799l1 = null;
        ((java.util.HashMap) map).clear();
        removeAllViews();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public boolean o(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList(((java.util.HashMap) this.f168803x1).values());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
        if (v5Var != null) {
            linkedList.add(v5Var);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) it.next()).mo50260x9f1221c2() == i17) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        if (view2 instanceof al1.l) {
            if (!this.A1) {
                post(this.B1);
            }
            if (this.A1) {
                return;
            }
            java.lang.Runnable runnable = this.C1;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (!this.A1) {
            post(this.B1);
        }
        if (this.A1) {
            return;
        }
        java.lang.Runnable runnable = this.C1;
        removeCallbacks(runnable);
        post(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public android.view.View p() {
        if (this.f168802x0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2(this, getContext());
            this.f168799l1 = new android.widget.FrameLayout(getContext());
            this.f168804y0 = (zl1.t) cf.i.a("createTabBar", new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1.this;
                    zl1.t tVar = (zl1.t) y1Var.m52223xe6eebdcb().m52171xd21f3eb7().a(y1Var.getContext(), zl1.t.class);
                    tVar.setId(com.p314xaae8f345.mm.R.id.f564706yn);
                    k91.n e17 = y1Var.m52223xe6eebdcb().m52167x3d3d7e0d().e();
                    tVar.m179085xa32537ab(e17.f387216a);
                    tVar.e(new zl1.g(tVar, e17.f387217b, e17.f387218c, e17.f387219d, e17.f387220e));
                    java.util.Iterator it = e17.f387222g.iterator();
                    while (it.hasNext()) {
                        k91.o oVar = (k91.o) it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17 c12813xe3573f17 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17) y1Var.m52223xe6eebdcb().m52171xd21f3eb7().a(y1Var.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17.class);
                        java.lang.String str = oVar.f387230a;
                        zl1.r rVar = new zl1.r();
                        rVar.f555139b = new zl1.v(oVar.f387232c, new zl1.h(tVar));
                        rVar.f555140c = new zl1.v(oVar.f387233d, new zl1.i(tVar));
                        rVar.f555141d = oVar.f387231b;
                        rVar.f555138a = str;
                        tVar.f555154m.add(new android.util.Pair(rVar.f555139b, rVar.f555140c));
                        if (rVar.f555141d == null && (rVar.f555139b.a() == null || rVar.f555140c.a() == null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageTabBar", "illegal data");
                        } else {
                            if (c12813xe3573f17 == null) {
                                c12813xe3573f17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17(tVar.getContext());
                            }
                            tVar.g(c12813xe3573f17, rVar);
                            zk1.m.a(c12813xe3573f17, null, null, false, null, null, null, new zl1.j(tVar, rVar), null, null, null, null, null);
                            c12813xe3573f17.setOnClickListener(new zl1.k(tVar));
                            tVar.f555153i.add(rVar);
                            tVar.f555149e.addView(c12813xe3573f17);
                        }
                    }
                    tVar.m179084xa2b9091a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c2(y1Var, e17));
                    return tVar;
                }
            });
            if (m52223xe6eebdcb().m52167x3d3d7e0d().e().f387221f) {
                this.f168804y0.setVisibility(8);
            }
            if ("top".equals(m52223xe6eebdcb().m52167x3d3d7e0d().e().f387216a)) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                l2Var.addView(this.f168799l1, layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                l2Var.addView(this.f168804y0, layoutParams2);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(12);
                l2Var.addView(this.f168804y0, layoutParams3);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(2, this.f168804y0.getId());
                layoutParams4.removeRule(12);
                l2Var.addView(this.f168799l1, layoutParams4);
            }
            this.f168802x0 = l2Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 o17 = m52223xe6eebdcb().o(this.W);
            this.f168801p1 = o17;
            o17.W = this;
            java.lang.String mo14683xad58292c = mo14683xad58292c();
            o17.D = nf.z.a(mo14683xad58292c);
            o17.E = mo14683xad58292c;
        }
        return this.f168802x0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168801p1;
        if (v5Var != null && z(iArr, v5Var.mo50260x9f1221c2())) {
            this.f168801p1.g(str, str2);
        }
        java.util.Iterator it = new x.d(((java.util.HashMap) this.f168803x1).values()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) it.next();
            if (z(iArr, v5Var2.mo50260x9f1221c2())) {
                v5Var2.g(str, str2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: setInitialUrl */
    public void mo14685x5050858d(java.lang.String str) {
        this.W = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 u(int i17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var : ((java.util.HashMap) this.f168803x1).values()) {
            if (v5Var.mo50260x9f1221c2() == i17) {
                return v5Var;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public boolean x(java.lang.String str) {
        return this.f168804y0.b(str) != -1;
    }
}
