package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.u2.class)
/* loaded from: classes5.dex */
public final class qp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements dh0.i, sb5.u2 {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f281337p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f281338q;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f281329e = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pp.f281263d);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f281330f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f281331g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f281332h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f281333i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f281334m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f281335n = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f281336o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    public final long f281339r = 200;

    public static void p0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp qpVar, java.lang.String str, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        sb5.t2 t2Var = (sb5.t2) ((java.util.LinkedHashMap) qpVar.f281331g).get(java.lang.Long.valueOf(j17));
        if (t2Var == null) {
            return;
        }
        v11.n0 n07 = qpVar.n0(str, j17);
        java.util.Map map = qpVar.f281332h;
        v11.n0 n0Var = (v11.n0) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (z17 || n0Var != n07) {
            map.put(java.lang.Long.valueOf(j17), n07);
            qpVar.f281336o.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kp(t2Var, n07));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        java.lang.Object putIfAbsent;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = this.f280113d.u();
        if (u17 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(u17.d1())) {
            java.lang.String d17 = u17.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            dh0.j m07 = m0();
            int i17 = 0;
            if (m07 != null) {
                eh0.o oVar = (eh0.o) m07;
                eh0.e eVar = oVar.f334429e;
                eVar.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f334406a;
                java.lang.Object obj = concurrentHashMap.get(d17);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(d17, (obj = new java.util.concurrent.CopyOnWriteArrayList()))) != null) {
                    obj = putIfAbsent;
                }
                ((java.util.concurrent.CopyOnWriteArrayList) obj).add(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "registerListener: registered for talker:%s", d17);
                eh0.j jVar = oVar.f334428d;
                jVar.getClass();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f334420a.get(d17);
                java.util.List<eh0.i> S0 = copyOnWriteArrayList != null ? kz5.n0.S0(copyOnWriteArrayList) : kz5.p0.f395529d;
                if (S0.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] registerStreamCallback: no active sessions");
                } else {
                    int i18 = 0;
                    for (eh0.i iVar : S0) {
                        java.lang.String a17 = iVar.a();
                        if (a17.length() > 0) {
                            if (iVar.f334419i) {
                                t0(d17, iVar.f334411a, iVar.f334412b, a17);
                            } else {
                                q0(d17, iVar.f334411a, iVar.f334412b, a17);
                            }
                        }
                        i18++;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] registerStreamCallback: " + i18 + " streams registered");
                    i17 = i18;
                }
            }
            if (i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.ChattingComponent", "registerCallback: success, registered %d streams for talker=%s", java.lang.Integer.valueOf(i17), d17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.ChattingComponent", "registerCallback: no active streams for talker=%s", d17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        dh0.j m07;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = this.f280113d.u();
        if (u17 == null) {
            return;
        }
        java.lang.String d17 = u17.d1();
        if (d17 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(d17) && (m07 = m0()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] unregisterStreamCallback: callback unregister");
            eh0.e eVar = ((eh0.o) m07).f334429e;
            eVar.getClass();
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f334406a.get(d17);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "[talker:" + d17 + "] unregisterListener: callback removed. remainingListeners:" + copyOnWriteArrayList.size());
            }
        }
        ((java.util.LinkedHashMap) this.f281330f).clear();
        ((java.util.LinkedHashMap) this.f281331g).clear();
        ((java.util.LinkedHashMap) this.f281332h).clear();
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f281333i;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((d90.p) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ip) it.next()).f280776a).b();
        }
        linkedHashMap.clear();
        this.f281334m.clear();
        this.f281335n.clear();
    }

    public final dh0.j m0() {
        return (dh0.j) ((jz5.n) this.f281329e).mo141623x754a37bb();
    }

    public final v11.n0 n0(java.lang.String str, long j17) {
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(str, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(str, j17) : false;
        dh0.j m09 = m0();
        boolean Ri = m09 != null ? ((eh0.o) m09).Ri(str, j17) : false;
        return (Vi && Ri) ? v11.n0.f513980f : Vi ? v11.n0.f513979e : (Ui && Ri) ? v11.n0.f513981g : Ri ? v11.n0.f513982h : v11.n0.f513978d;
    }

    public final void o0(long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.ChattingComponent", "notifyMessageUpdate: msgId invalid, msgId=%d", java.lang.Long.valueOf(j17));
            return;
        }
        this.f281337p = java.lang.Long.valueOf(j17);
        java.lang.Thread.currentThread().getName();
        if (this.f281338q != null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jp jpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jp(this);
        this.f281338q = jpVar;
        this.f281336o.mo50297x7c4d7ca2(jpVar, this.f281339r);
    }

    public void q0(java.lang.String talker, long j17, long j18, java.lang.String deltaText) {
        sb5.r2 u07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deltaText, "deltaText");
        java.lang.Thread.currentThread().getName();
        if (this.f281335n.add(java.lang.Long.valueOf(j17)) && (u07 = u0()) != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u07).o0(j17);
        }
        p0(this, talker, j17, false, 4, null);
        o0(j18);
    }

    public void r0(java.lang.String talker, long j17, long j18, java.lang.String fullText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullText, "fullText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[STREAM_TRACE] onStreamEnd: msgSvrId=%d, msgId=%d, fullTextLen=%d, thread=%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(fullText.length()), java.lang.Thread.currentThread().getName());
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f281330f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f281336o.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lp(s2Var));
        }
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(talker, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(talker, j17) : false;
        java.util.HashSet hashSet = this.f281334m;
        if (hashSet.contains(java.lang.Long.valueOf(j17)) && !Vi) {
            hashSet.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u07 = u0();
            if (u07 != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u07).n0(j17);
            }
        }
        java.util.HashSet hashSet2 = this.f281335n;
        if (hashSet2.contains(java.lang.Long.valueOf(j17)) && !Ui) {
            hashSet2.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u08 = u0();
            if (u08 != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u08).n0(j17);
            }
        }
        p0(this, talker, j17, false, 4, null);
        o0(j18);
    }

    public void s0(java.lang.String talker, long j17, long j18, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.ChattingComponent", "onStreamError: msgId=%d, errorCode=%d, errorMsg=%s", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), str);
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f281330f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f281336o.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mp(s2Var));
        }
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(talker, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(talker, j17) : false;
        java.util.HashSet hashSet = this.f281334m;
        if (hashSet.contains(java.lang.Long.valueOf(j17)) && !Vi) {
            hashSet.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u07 = u0();
            if (u07 != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u07).n0(j17);
            }
        }
        java.util.HashSet hashSet2 = this.f281335n;
        if (hashSet2.contains(java.lang.Long.valueOf(j17)) && !Ui) {
            hashSet2.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u08 = u0();
            if (u08 != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u08).n0(j17);
            }
        }
        p0(this, talker, j17, false, 4, null);
        if (j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.ChattingComponent", "notifyMessageError: msgId invalid, msgId=%d", java.lang.Long.valueOf(j18));
            return;
        }
        java.lang.String x17 = this.f280113d.x();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828();
        am.a2 a2Var = c5236x8e0a6828.f135569g;
        a2Var.f87650a = j18;
        a2Var.f87651b = x17;
        a2Var.f87652c = true;
        c5236x8e0a6828.e();
    }

    public void t0(java.lang.String talker, long j17, long j18, java.lang.String streamText) {
        sb5.r2 u07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamText, "streamText");
        java.lang.Thread.currentThread().getName();
        if (this.f281334m.add(java.lang.Long.valueOf(j17)) && (u07 = u0()) != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) u07).o0(j17);
        }
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f281330f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f281336o.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.np(s2Var, streamText));
        }
        p0(this, talker, j17, false, 4, null);
    }

    public final sb5.r2 u0() {
        yb5.d dVar = this.f280113d;
        if (dVar != null) {
            return (sb5.r2) dVar.f542241c.a(sb5.r2.class);
        }
        return null;
    }

    public void v0(long j17) {
        java.util.Map map = this.f281330f;
        map.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[THINKING_TRACE] unregisterThinkingCallback: msgSvrId=%d, mapSize=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(map.size()));
    }

    public void w0(long j17) {
        java.util.Map map = this.f281331g;
        map.remove(java.lang.Long.valueOf(j17));
        this.f281332h.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[THINKING_TRACE] unregisterThinkingStatusCallback: msgSvrId=%d, mapSize=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(map.size()));
    }
}
