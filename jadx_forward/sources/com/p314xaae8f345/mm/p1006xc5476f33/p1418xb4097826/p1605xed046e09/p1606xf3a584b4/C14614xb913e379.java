package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4;

/* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore */
/* loaded from: classes2.dex */
public final class C14614xb913e379 extends pf5.o0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f204076e;

    /* renamed from: f, reason: collision with root package name */
    public final bs2.w f204077f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f204078g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14615xc531ce2b f204079h;

    /* renamed from: i, reason: collision with root package name */
    public int f204080i;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1] */
    public C14614xb913e379() {
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.util.ArrayList d17 = kz5.c0.d(new bs2.t(this), new bs2.p(this), new bs2.q(this));
        if (t70Var.W2() && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Qg).mo141623x754a37bb()).r()).booleanValue()) {
            d17.add(new bs2.a0(this));
        }
        this.f204076e = d17;
        this.f204077f = ((((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209213ed).mo141623x754a37bb()).r()).booleanValue() || ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209194dd).mo141623x754a37bb()).r()).booleanValue()) && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209232fd).mo141623x754a37bb()).r()).booleanValue()) ? new bs2.w(this) : null;
        this.f204078g = jz5.h.b(bs2.h.f105378d);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f204079h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135971g.f88958a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.this;
                if (i17 == 2) {
                    for (bs2.n1 n1Var : c14614xb913e379.f204076e) {
                        boolean n17 = n1Var.n();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f105446g;
                        java.lang.String str = n1Var.f105442c;
                        if (n17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "performEnterFindMoreFriendTab: foreground prefetch open");
                            atomicBoolean.set(true);
                        }
                        boolean compareAndSet = n1Var.f105447h.compareAndSet(false, true);
                        if ((atomicBoolean.compareAndSet(false, true) || n17) && !n1Var.f105443d) {
                            int T6 = n1Var.f105441b.T6();
                            int i18 = n1Var.f105440a;
                            if (i18 == T6) {
                                long f17 = n1Var.f();
                                boolean z17 = n1Var.j().I0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(i18)) != null;
                                if (!n17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "performEnterFindMoreFriendTab: case2, hasRedDot=" + z17 + ", delay=" + f17);
                                    bs2.c.b(n1Var.f105444e, n1Var.f105454o, f17, "performEnterFindMoreFriendTab#2", null, 8, null);
                                } else if (compareAndSet) {
                                    bs2.s0 s0Var = n1Var.f105454o;
                                    long c17 = (s0Var.f105336e + s0Var.f105335d) - c01.id.c();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "performEnterFindMoreFriendTab: case1, hasRedDot=" + z17 + ", delay=" + f17 + ", postDelayDelta=" + c17 + ", lastTriggerSource=" + s0Var.f105337f);
                                    if (c17 < 0 || c17 > f17) {
                                        bs2.c.b(n1Var.f105444e, n1Var.f105454o, f17, "performEnterFindMoreFriendTab#1", null, 8, null);
                                    }
                                }
                                n1Var.s("performEnterFindMoreFriendTab");
                            }
                        }
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        new org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "preload PAGView: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms ");
                        pm0.v.O("FinderObjectWordingConfig", new bs2.x0(n1Var));
                    }
                } else {
                    for (bs2.n1 n1Var2 : c14614xb913e379.f204076e) {
                        n1Var2.f105447h.set(false);
                        boolean n18 = n1Var2.n();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = n1Var2.f105446g;
                        java.lang.String str2 = n1Var2.f105442c;
                        if (n18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "performExitFindMoreFriendTab: foreground prefetch open, runnable triggerSource=" + n1Var2.f105454o.f105337f);
                            atomicBoolean2.set(true);
                            if (n1Var2.f105440a == n1Var2.f105441b.T6()) {
                                long f18 = n1Var2.f();
                                boolean z18 = n1Var2.f105445f.get();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "performExitFindMoreFriendTab: delay=" + f18 + ", isBackground=" + z18);
                                if (!z18) {
                                    n1Var2.f105444e.a(n1Var2.f105454o, f18, "performExitFindMoreFriendTab", bs2.a.f105330e);
                                }
                            }
                        } else if (atomicBoolean2.compareAndSet(true, false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "performExitFindMoreFriendTab:");
                            n1Var2.f105444e.c("performExitFindMoreFriendTab");
                            c01.id.c();
                        }
                    }
                }
                return false;
            }
        };
        this.f204080i = -1;
    }

    public final void N6() {
        java.util.Iterator it = this.f204076e.iterator();
        while (it.hasNext()) {
            ((bs2.n1) it.next()).e(true, "clearAllCache");
        }
        bs2.w wVar = this.f204077f;
        if (wVar != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = wVar.f105498c;
            reentrantLock.lock();
            try {
                wVar.f105503h = true;
                db2.o4 o4Var = wVar.f105499d;
                if (o4Var != null) {
                    o4Var.j();
                }
                wVar.f105499d = null;
                wVar.a("clearAllCache");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final long O6(int i17) {
        int m75939xb282bd08;
        int intValue;
        long j17;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209422q2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(25);
                j17 = m75939xb282bd08 * 1000;
            }
        } else if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209440r2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                        j17 = intValue;
                    } else {
                        m75939xb282bd08 = S6().m75939xb282bd08(26);
                        j17 = m75939xb282bd08 * 1000;
                    }
                } else if (i17 != 35) {
                    j17 = 0;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209404p2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(24);
                j17 = m75939xb282bd08 * 1000;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209457s2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(27);
                j17 = m75939xb282bd08 * 1000;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "[getCacheValidTime] tabType=" + i17 + " time=" + j17 + "ms ");
        return j17 <= 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17;
    }

    public final long P6(int i17, boolean z17) {
        int m75939xb282bd08;
        int intValue;
        long j17;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 != 35) {
                            j17 = Long.MAX_VALUE;
                        }
                    } else if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209202e2;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() >= 0) {
                            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                            j17 = intValue;
                        } else {
                            m75939xb282bd08 = S6().m75939xb282bd08(10);
                            j17 = m75939xb282bd08 * 1000;
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209278i2;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() >= 0) {
                            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                            j17 = intValue;
                        } else {
                            m75939xb282bd08 = S6().m75939xb282bd08(14);
                            j17 = m75939xb282bd08 * 1000;
                        }
                    }
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209164c2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue();
                        j17 = intValue;
                    } else {
                        m75939xb282bd08 = S6().m75939xb282bd08(8);
                        j17 = m75939xb282bd08 * 1000;
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    jz5.g gVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209240g2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue();
                        j17 = intValue;
                    } else {
                        m75939xb282bd08 = S6().m75939xb282bd08(12);
                        j17 = m75939xb282bd08 * 1000;
                    }
                }
            } else if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209221f2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar5).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar5).mo141623x754a37bb()).r()).intValue();
                    j17 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(11);
                    j17 = m75939xb282bd08 * 1000;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209296j2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar6).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar6).mo141623x754a37bb()).r()).intValue();
                    j17 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(15);
                    j17 = m75939xb282bd08 * 1000;
                }
            }
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209183d2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar7).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar7).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(9);
                j17 = m75939xb282bd08 * 1000;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209259h2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar8).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar8).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(13);
                j17 = m75939xb282bd08 * 1000;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "[getInnerTime] tabType=" + i17 + " withRedDot=" + z17 + " time=" + j17 + 's');
        return j17 <= 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17;
    }

    public final long Q6(int i17, boolean z17, boolean z18) {
        long U6;
        int m75939xb282bd08;
        int intValue;
        if (z17) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209350m2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                    U6 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(21);
                    U6 = m75939xb282bd08 * 1000;
                }
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209386o2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                    U6 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(23);
                    U6 = m75939xb282bd08 * 1000;
                }
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209332l2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue();
                    U6 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(20);
                    U6 = m75939xb282bd08 * 1000;
                }
            } else if (i17 != 4) {
                U6 = 0;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                jz5.g gVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209368n2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue();
                    U6 = intValue;
                } else {
                    m75939xb282bd08 = S6().m75939xb282bd08(22);
                    U6 = m75939xb282bd08 * 1000;
                }
            }
            if (U6 > 0 && z18) {
                long O6 = O6(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "getNewRedDotPreloadInterval: get cache valid time, tabType=" + i17 + " prefetchInterval=" + U6 + "ms cacheValidTime=" + O6 + "ms");
                if (O6 > 0 && O6 > U6) {
                    U6 = O6;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "getNewRedDotPreloadInterval: tabType=" + i17 + " time=" + U6 + "ms ");
            if (U6 <= 0) {
                U6 = Long.MAX_VALUE;
            }
        } else {
            U6 = U6(i17, z18);
        }
        if (z17 && U6 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.StreamTabPreloadCore", "getOutsideIntervalTime: redDotInterval is 0, tabType=" + i17);
            U6 = U6(i17, z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "getOutsideIntervalTime: tabType=" + i17 + " isRedDotPreload=" + z17 + " hasCache = " + z18 + ", time=" + U6 + "ms ");
        return U6 <= 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : U6;
    }

    public final bs2.n1 R6(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f204076e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((bs2.n1) obj).f105440a == i17) {
                break;
            }
        }
        return (bs2.n1) obj;
    }

    public final r45.fx2 S6() {
        r45.fx2 fx2Var = new r45.fx2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            fx2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Q9).mo141623x754a37bb()).r()).intValue() > 0) {
                fx2Var.set(32, java.lang.Boolean.TRUE);
                fx2Var.set(33, 30);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.StreamTabPreloadCore", e17, "", new java.lang.Object[0]);
        }
        return fx2Var;
    }

    public final int T6() {
        return ((ey2.t0) ((jz5.n) this.f204078g).mo141623x754a37bb()).Q6();
    }

    public final long U6(int i17, boolean z17) {
        int m75939xb282bd08;
        int intValue;
        long j17;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z1;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(5);
                j17 = m75939xb282bd08 * 1000;
            }
        } else if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209126a2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                        j17 = intValue;
                    } else {
                        m75939xb282bd08 = S6().m75939xb282bd08(6);
                        j17 = m75939xb282bd08 * 1000;
                    }
                } else if (i17 != 35) {
                    j17 = 0;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y1;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(4);
                j17 = m75939xb282bd08 * 1000;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            jz5.g gVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209145b2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue();
                j17 = intValue;
            } else {
                m75939xb282bd08 = S6().m75939xb282bd08(7);
                j17 = m75939xb282bd08 * 1000;
            }
        }
        if (j17 > 0 && z17) {
            long O6 = O6(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "getTimeOutPreloadInterval: get cache valid time, tabType=" + i17 + " prefetchInterval=" + j17 + "ms cacheValidTime=" + O6 + "ms");
            if (O6 > 0 && O6 > j17) {
                j17 = O6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "getTimeOutPreloadInterval: tabType=" + i17 + " originInterval=" + j17 + "ms ");
        return j17 <= 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17;
    }

    public final boolean V6(bs2.h0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209272hf).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.StreamTabPreloadCore", "isEnable return for FINDER_FIND_PAGE_PRELOAD_ONE");
            return false;
        }
        if (!((c61.l7) i95.n0.c(c61.l7.class)).el()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "finder entry close then return");
            return false;
        }
        if (source == bs2.h0.f105384n) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209352m4).mo141623x754a37bb()).r()).intValue() == 1;
        }
        if ((c01.z1.j() & 34359738368L) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "finder find more ui entry close then return");
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_preload_tab_refresh_enable, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "[GET] isEnablePreloadStreamRefresh=" + z17);
        if (z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamTabPreloadCore", "isEnablePreloadStreamRefresh false then return");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r13, boolean r14) {
        /*
            r12 = this;
            java.lang.String r0 = "ctrInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            int r13 = r13.m55856xfb85f7b0()
            r0 = 7
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L26
            r0 = 8
            if (r13 == r0) goto L24
            r0 = 17
            if (r13 == r0) goto L26
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r13 == r0) goto L22
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r13 == r0) goto L20
            r13 = r1
            goto L27
        L20:
            r13 = 4
            goto L27
        L22:
            r13 = 2
            goto L27
        L24:
            r13 = 3
            goto L27
        L26:
            r13 = r2
        L27:
            bs2.n1 r0 = r12.R6(r13)
            if (r0 == 0) goto L43
            if (r14 == 0) goto L36
            boolean r14 = r0.f105443d
            if (r14 == 0) goto L34
            goto L36
        L34:
            r14 = r1
            goto L37
        L36:
            r14 = r2
        L37:
            if (r14 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L43
            java.lang.String r14 = "RedDotRevoke"
            boolean r1 = r0.e(r2, r14)
        L43:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "[onRedDotRevoke] tabType="
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "Finder.StreamTabPreloadCore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r13)
            if (r1 == 0) goto L67
            bs2.g r2 = bs2.g.f105374a
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 115(0x73, float:1.61E-43)
            r11 = 0
            bs2.g.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.W6(com.tencent.mm.plugin.finder.extension.reddot.jb, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3  */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo525x7bb163d5(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.mo525x7bb163d5(java.lang.Object):void");
    }
}
