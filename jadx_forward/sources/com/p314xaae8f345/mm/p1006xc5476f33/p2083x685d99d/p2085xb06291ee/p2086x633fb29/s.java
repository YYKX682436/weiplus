package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public abstract class s {
    public static final java.util.Map H;
    public int C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.C17687xb8e630d7 E;
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.k F;
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.l G;

    /* renamed from: b, reason: collision with root package name */
    public final int f243979b;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f243985h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f243986i;

    /* renamed from: k, reason: collision with root package name */
    public long f243988k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.ref.WeakReference f243989l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.animation.Animation f243990m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n f243991n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h f243992o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p f243993p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.i f243994q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.r f243995r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.j f243996s;

    /* renamed from: a, reason: collision with root package name */
    public int f243978a = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f243980c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f243981d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f243982e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f243983f = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public int f243984g = 41;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.l f243997t = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.b(this);

    /* renamed from: u, reason: collision with root package name */
    public boolean f243998u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f243999v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f244000w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f244001x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f244002y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f244003z = true;
    public double A = -1.0d;
    public double B = -1.0d;
    public boolean D = false;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f243987j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    static {
        new java.util.HashMap();
        H = new java.util.concurrent.ConcurrentHashMap();
    }

    public s(int i17, android.view.View view) {
        this.f243979b = 0;
        this.f243979b = i17;
        this.f243989l = new java.lang.ref.WeakReference(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", java.lang.Integer.valueOf(i17));
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar) {
        java.lang.ref.WeakReference weakReference = sVar.f243989l;
        if (weakReference == null || !sVar.f243998u || sVar.f244001x) {
            return;
        }
        if (sVar.f243990m == null && weakReference.get() != null) {
            sVar.f243990m = android.view.animation.AnimationUtils.loadAnimation(((android.view.View) weakReference.get()).getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559408dz);
        }
        if (sVar.f243996s == null) {
            sVar.f243996s = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.j(sVar, null);
        }
        sVar.f243987j.mo50293x3498a0(sVar.f243996s);
    }

    public static boolean b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) H).get(str);
        return num == null || 2 != num.intValue();
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f243982e), java.lang.Boolean.valueOf(h()));
        j(true);
        this.f243988k = 0L;
        e(this.f243983f);
        this.f243982e = -1;
        this.f243980c = "";
        this.f243981d = "ERROR#PATH";
        this.A = 0.0d;
        com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f243985h);
        this.f243985h = null;
    }

    public void d(android.graphics.Bitmap bitmap) {
        wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.r rVar = this.f243995r;
        ((vf0.y1) k1Var).getClass();
        t21.o2.bj(rVar);
        if (this.f243995r == null) {
            this.f243995r = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.r(this, null);
        }
        this.f243995r.f243976d = new java.lang.ref.WeakReference(bitmap);
        wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.r rVar2 = this.f243995r;
        ((vf0.y1) k1Var2).getClass();
        t21.o2.aj(rVar2, 0L);
    }

    public final void e(java.util.Queue queue) {
        while (true) {
            java.lang.Integer num = (java.lang.Integer) queue.poll();
            if (num == null) {
                return;
            }
            int intValue = num.intValue();
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.d(this, intValue);
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(dVar, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener] */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f() {
        if (this.E == null) {
            this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c>(this) { // from class: com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener

                /* renamed from: d, reason: collision with root package name */
                public int f243950d;

                /* renamed from: e, reason: collision with root package name */
                public int f243951e;

                /* renamed from: f, reason: collision with root package name */
                public int f243952f;

                /* renamed from: g, reason: collision with root package name */
                public final java.lang.ref.WeakReference f243953g;

                {
                    super(com.p314xaae8f345.mm.app.a0.f134821d);
                    this.f243950d = 0;
                    this.f243951e = 0;
                    this.f243952f = 0;
                    this.f243953g = new java.lang.ref.WeakReference(this);
                    this.f39173x3fe91575 = 2023294236;
                }

                public boolean c() {
                    int i17;
                    java.lang.ref.WeakReference weakReference = this.f243953g;
                    return weakReference.get() != null && (i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).C + this.f243950d) >= this.f243951e && i17 <= this.f243952f;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c2 = c6182x843a430c;
                    java.lang.ref.WeakReference weakReference = this.f243953g;
                    if (weakReference.get() != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).hashCode();
                        int i17 = c6182x843a430c2.f136440g.f88911a;
                        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).C;
                        am.mz mzVar = c6182x843a430c2.f136440g;
                        int i19 = mzVar.f88912b;
                        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D;
                        int i27 = mzVar.f88911a;
                        if (i27 != 0) {
                            if (i27 != 1) {
                                if (i27 == 3) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).c();
                                } else if (i27 == 5) {
                                    this.f243950d = mzVar.f88914d;
                                    this.f243951e = mzVar.f88912b;
                                    this.f243952f = mzVar.f88913c;
                                    if (!c() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D) {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).c();
                                    } else {
                                        if (!"ERROR#PATH".equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d) && !((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243980c.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d)) {
                                            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243980c;
                                            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d;
                                            java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d == null ? "" : ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d;
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).c();
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243980c = str3;
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).f243981d = "ERROR#PATH";
                                        }
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).i();
                                    }
                                } else if (i27 == 6) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D = true;
                                } else if (i27 == 7 && ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D = false;
                                }
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).j(false);
                        }
                        this.f243950d = mzVar.f88914d;
                        this.f243951e = mzVar.f88912b;
                        this.f243952f = mzVar.f88913c;
                        if (c() && !((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).D) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s) weakReference.get()).i();
                        }
                    }
                    return false;
                }
            };
        }
        return this.E;
    }

    public final boolean g() {
        if (!this.f244002y && this.f243978a >= 3) {
            this.f243978a = 0;
        }
        return false;
    }

    public boolean h() {
        return 1 == this.f243979b ? (this.f243992o == null || this.f243992o.f243960d) ? false : true : (this.f243994q == null || this.f243994q.f243963d || this.f243992o == null || this.f243992o.f243960d) ? false : true;
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f243999v), this.f243980c, java.lang.Integer.valueOf(this.f243982e));
        if (!this.f243999v) {
            c();
            return;
        }
        if (h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", java.lang.Integer.valueOf(hashCode()), this.f243980c);
            return;
        }
        j(this.f243982e < 0);
        this.f243988k = 0L;
        g();
        if (this.f243982e < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", java.lang.Integer.valueOf(hashCode()), this.f243980c);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243980c)) {
                return;
            }
            if (!b(this.f243980c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                c();
                return;
            }
            this.f243991n = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n(this, null);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n nVar = this.f243991n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(nVar, 0L);
            return;
        }
        if (1 == this.f243979b) {
            this.f243992o = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h(this, null);
            this.f243994q = null;
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar = this.f243992o;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.aj(hVar, 0L);
            return;
        }
        this.f243992o = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h(this, null);
        this.f243994q = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.i(this);
        this.f243992o.f243961e = this.f243994q;
        this.f243994q.f243964e = this.f243992o;
        wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar2 = this.f243992o;
        ((vf0.y1) k1Var3).getClass();
        t21.o2.aj(hVar2, 0L);
    }

    public void j(boolean z17) {
        if (this.f243991n != null) {
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n nVar = this.f243991n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.bj(nVar);
            this.f243991n.f243967d = true;
        }
        if (this.f243994q != null) {
            this.f243987j.mo50300x3fa464aa(this.f243994q);
            this.f243994q.f243963d = true;
        }
        if (this.f243992o != null) {
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar = this.f243992o;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.bj(hVar);
            this.f243992o.f243960d = true;
        }
        if (this.f243993p != null) {
            this.f243993p.f243971e = z17 ? 0 : 2;
            wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p pVar = this.f243993p;
            ((vf0.y1) k1Var3).getClass();
            t21.o2.aj(pVar, 0L);
        }
    }
}
