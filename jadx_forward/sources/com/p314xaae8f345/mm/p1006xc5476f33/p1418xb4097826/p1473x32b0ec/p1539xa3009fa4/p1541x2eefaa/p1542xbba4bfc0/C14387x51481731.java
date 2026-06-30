package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice */
/* loaded from: classes3.dex */
public final class C14387x51481731 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f198578f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f198579g;

    /* renamed from: h, reason: collision with root package name */
    public int f198580h;

    /* renamed from: i, reason: collision with root package name */
    public long f198581i;

    /* renamed from: m, reason: collision with root package name */
    public int f198582m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f198583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14387x51481731(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f198578f = "LiveAnchorSlice";
        this.f198582m = 1;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f198583n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5488xebc218a0>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice$notifyPausePushingLive$1
            {
                this.f39173x3fe91575 = 1760235184;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5488xebc218a0 c5488xebc218a0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14388xbba14e07 c14388xbba14e07;
                boolean z17;
                in0.q qVar;
                kn0.p pVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5488xebc218a0 event = c5488xebc218a0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (in0.q.f374302b2 != null) {
                    c14388xbba14e07 = this;
                    z17 = true;
                } else {
                    c14388xbba14e07 = this;
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731 c14387x51481731 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.this;
                boolean U7 = ((mm2.c1) ((mm2.e1) c14387x51481731.m147920xbba4bfc0(mm2.e1.class)).m147920xbba4bfc0(mm2.c1.class)).U7();
                boolean z18 = ((mm2.e1) c14387x51481731.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0) != 0;
                boolean z19 = pm0.v.z(((mm2.c1) c14387x51481731.m147920xbba4bfc0(mm2.c1.class)).f410340g2, 524288);
                boolean l76 = ((mm2.c1) c14387x51481731.m147920xbba4bfc0(mm2.c1.class)).l7();
                java.util.List list = ((mm2.o4) c14387x51481731.m147920xbba4bfc0(mm2.o4.class)).f410860v;
                boolean z27 = (list != null ? list.size() : 0) > 0;
                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85435v5).mo141623x754a37bb()).r()).intValue();
                in0.q qVar2 = in0.q.f374302b2;
                if (qVar2 != null) {
                    if (qVar2 == null) {
                        in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
                    }
                    qVar = in0.q.f374302b2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                } else {
                    qVar = null;
                }
                boolean f17 = (qVar == null || (pVar = qVar.D) == null) ? false : pVar.f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyPausePushingLive] isAnchor = ");
                sb6.append(z17);
                sb6.append(", isLiveStarted = ");
                sb6.append(z18);
                sb6.append(", isLiveFinish = ");
                sb6.append(U7);
                sb6.append(", isLivePaused = ");
                sb6.append(z19);
                sb6.append(", isAudioMode = ");
                sb6.append(l76);
                sb6.append(", pause = ");
                am.sb sbVar = event.f135821g;
                sb6.append(sbVar.f89424a);
                sb6.append(", isAnchorLinkMic = ");
                sb6.append(z27);
                sb6.append(", pauseWay = ");
                sb6.append(intValue);
                sb6.append(", isFloatMode = ");
                sb6.append(f17);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = c14387x51481731.f198578f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                if (!z17 || U7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "is not Anchor, isLiveFinish, return ");
                } else if (l76) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isAudioMode, return ");
                } else if (z18 && !U7 && !f17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isFloatMode = " + f17);
                    event.f135822h.f89530a = true;
                } else if (intValue == 0) {
                    if (sbVar.f89424a) {
                        if (qVar != null) {
                            qVar.H0();
                        }
                    } else if (qVar != null) {
                        qVar.c1(null);
                    }
                } else if (sbVar.f89424a) {
                    if (z18) {
                        if (!z19) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                            dk2.ef.f314905a.J(0);
                            if (qVar != null) {
                                qVar.k0();
                            }
                            c14387x51481731.f198579g = true;
                        }
                    } else if (qVar != null) {
                        qVar.H0();
                    }
                } else if (z18) {
                    if (c14387x51481731.f198579g) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        dk2.xf xfVar = dk2.ef.A;
                        if (xfVar != null) {
                            ((dk2.r4) xfVar).d0(2, 0, new dk2.xe());
                        }
                        if (qVar != null) {
                            qVar.c1(null);
                        }
                        if (qVar != null) {
                            qVar.r0();
                        }
                    }
                } else if (qVar != null) {
                    qVar.c1(null);
                }
                return true;
            }
        };
    }

    public final long N6() {
        return this.f198581i;
    }

    public final int O6() {
        return this.f198580h;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f198583n.mo48814x2efc64();
        this.f198579g = false;
    }
}
