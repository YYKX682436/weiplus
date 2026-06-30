package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t f231292a;

    /* renamed from: b, reason: collision with root package name */
    public volatile tl.w f231293b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.p f231294c;

    /* renamed from: d, reason: collision with root package name */
    public zi3.a f231295d;

    /* renamed from: e, reason: collision with root package name */
    public int f231296e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f231297f = 92;

    /* renamed from: g, reason: collision with root package name */
    public int f231298g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f231299h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public int f231300i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f231301j = 1;

    /* renamed from: k, reason: collision with root package name */
    public long f231302k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f231303l;

    /* renamed from: m, reason: collision with root package name */
    public int f231304m;

    /* renamed from: n, reason: collision with root package name */
    public int f231305n;

    /* renamed from: o, reason: collision with root package name */
    public int f231306o;

    /* renamed from: p, reason: collision with root package name */
    public int f231307p;

    /* renamed from: q, reason: collision with root package name */
    public int f231308q;

    /* renamed from: r, reason: collision with root package name */
    public final tl.v f231309r;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.Y1;
        this.f231303l = i17;
        this.f231304m = 1;
        this.f231305n = 20;
        this.f231306o = i17;
        this.f231307p = 1;
        this.f231308q = 20;
        this.f231309r = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.q(this);
        this.f231295d = new zi3.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J = this.f231295d;
        this.f231294c = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.p();
        this.f231292a = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t();
    }

    public int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t tVar = this.f231292a;
        if (tVar == null) {
            return 0;
        }
        tVar.getClass();
        zi3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
        if (fVar == null || (eVar = fVar.f554703k) == null) {
            return 0;
        }
        return eVar.K;
    }

    public void b() {
        if (this.f231296e == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "dev start already...");
            return;
        }
        this.f231292a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "start device......");
        this.f231296e = 2;
        this.f231294c.getClass();
        wo.v1.f529356c.c();
        this.f231294c.a();
        if (this.f231297f <= 10) {
            this.f231297f = 92;
        }
        this.f231293b = new tl.w(this.f231303l, this.f231304m, 1);
        this.f231293b.g(this.f231305n);
        this.f231293b.j(true);
        this.f231293b.f(true);
        this.f231293b.f501693m = -19;
        this.f231293b.h(1, false);
        this.f231293b.i(true);
        this.f231293b.f501705y = this.f231309r;
    }

    public void c() {
        this.f231295d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t tVar = this.f231292a;
        if (tVar != null) {
            synchronized (tVar.f231322a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlay, isStart: %s %s", java.lang.Boolean.valueOf(tVar.f231323b), java.lang.Integer.valueOf(tVar.hashCode()));
                if (tVar.f231323b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = tVar.f231324c;
                    if (eVar != null) {
                        eVar.e();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = tVar.f231324c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar2);
                        eVar2.f();
                        tVar.f231324c = null;
                        zi3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
                        if (fVar != null) {
                            fVar.f554703k = null;
                        }
                    }
                    zi3.f fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
                    if (fVar2 != null) {
                        fVar2.G();
                    }
                    tVar.f231325d.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlaying cost: " + tVar.f231325d.a());
                    tVar.f231323b = false;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "stopRecord.");
        if (this.f231293b != null) {
            this.f231293b.l();
            this.f231293b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "finish pauseRecord");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.I(false);
        this.f231296e = 3;
        if (this.f231292a != null) {
            zi3.f fVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
            if (fVar3 != null) {
                fVar3.G();
            }
            this.f231292a.getClass();
            zi3.f fVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
            if (fVar4 != null) {
                fVar4.R();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().d();
    }

    public void d(r45.s70 s70Var) {
        if (s70Var != null) {
            r45.ge0 ge0Var = s70Var.f467068e;
            this.f231303l = ge0Var.f456686d;
            this.f231304m = ge0Var.f456688f;
            this.f231305n = ge0Var.f456687e;
            this.f231306o = ge0Var.f456695p;
            this.f231307p = ge0Var.f456697r;
            this.f231308q = ge0Var.f456696q;
        }
    }

    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t tVar;
        int i17;
        if (this.f231296e != 2 || (tVar = this.f231292a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "hy: error not init when startplay, devStatus:" + this.f231296e);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r(this);
        int i18 = this.f231306o;
        int i19 = this.f231307p;
        int i27 = this.f231308q;
        synchronized (tVar.f231322a) {
            if (tVar.f231323b) {
                i17 = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlay %s", java.lang.Integer.valueOf(tVar.hashCode()));
                int a17 = tVar.a(rVar, i18, i19, i27);
                zi3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
                if (fVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = tVar.f231324c;
                    fVar.f554703k = eVar;
                    if (eVar != null) {
                        eVar.R = fVar.f554705m;
                    }
                }
                tVar.f231325d.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlaying cost: " + tVar.f231325d.a());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "set start play");
                tVar.f231323b = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "finish start play: %s", java.lang.Integer.valueOf(a17));
                i17 = a17;
            }
        }
        if (i17 <= 0) {
            return false;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t0 Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = Bi.f231666a;
        if (b4Var != null) {
            b4Var.d();
            Bi.f231666a.m77787xbe88f509();
            Bi.f231666a.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.mm.plugin.multitalk.model.t0$$a
            @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
            /* renamed from: onTimerExpired */
            public final boolean mo322xdd48fb9f() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t0 t0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t0.this;
                t0Var.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                    java.util.ArrayList a18 = i4Var.f231156f.a();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    if (a18 == null || a18.size() == 0 || i4Var.f231170n != 1) {
                        hashMap = null;
                    } else {
                        java.util.Iterator it = a18.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
                            int m119991x7be9e6cb = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m119991x7be9e6cb(wVar.f231373a);
                            if (m119991x7be9e6cb > 0) {
                                hashMap.put(wVar.f231375c, java.lang.Integer.valueOf(m119991x7be9e6cb));
                            }
                        }
                    }
                    if (hashMap != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.entrySet());
                        java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.C16574x6790426());
                        t0Var.f231667b = new java.util.concurrent.CopyOnWriteArrayList(arrayList);
                    }
                }
                return true;
            }
        }, true);
        Bi.f231666a = b4Var2;
        b4Var2.c(300L, 300L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
        i4Var.f231150b2 = 0;
        i4Var.f231151c2 = 0;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
            i4Var.f231150b2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.E();
            i4Var.f231151c2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.E();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "seenli, startPlay mILinkStartSpeakerStreamType=%d", java.lang.Integer.valueOf(i4Var.f231150b2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "seenli, startPlay SubCoreMultiTalk.getMultiTalkManager().mMultiTalkAudioManager == null");
        }
        return true;
    }

    public boolean f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "hy: trigger startrecord, isMicEnable:%b", java.lang.Boolean.valueOf(z17));
        if (this.f231296e != 2 || this.f231293b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "hy: not init when startrecord! devStatus:" + this.f231296e);
            return false;
        }
        synchronized (this.f231299h) {
            if (!this.f231293b.k()) {
                int i17 = this.f231293b.f501681a;
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.I(z17);
            i4Var.T1 = z17;
            boolean z18 = !z17;
            if (this.f231293b != null) {
                this.f231293b.n(z18);
            }
            i4Var.Y1 = ym1.f.Bi();
            i4Var.Z1 = ym1.f.Bi();
            i4Var.f231149a2 = this.f231293b != null ? this.f231293b.f501685e : 0;
            return true;
        }
    }
}
