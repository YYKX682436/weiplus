package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class w1 extends tk1.c {

    /* renamed from: v, reason: collision with root package name */
    public wk1.e f159372v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uh1.o0 f159373w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 f159374x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 x1Var, java.net.URI uri, uk1.b bVar, java.util.Map map, int i17, uh1.o0 o0Var) {
        super(uri, bVar, map, i17);
        this.f159374x = x1Var;
        this.f159373w = o0Var;
        this.f159372v = null;
    }

    @Override // tk1.c
    public void k(int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugSocket", "onClose,reason: %s, errCode = %d", str, java.lang.Integer.valueOf(i17));
        uh1.o0 o0Var = this.f159373w;
        if (i17 != -1 && i17 != -2 && i17 != -3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) o0Var).a(i17, str);
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) o0Var).b(str);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) o0Var).b("network is down");
            i17 = 1006;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) o0Var).a(i17, str);
    }

    @Override // tk1.c
    public void l(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", "onSocketError, ex: " + exc.toString());
    }

    @Override // tk1.c
    public void m(wk1.e eVar) {
        wk1.e eVar2;
        wk1.d dVar = ((wk1.f) eVar).f528464b;
        wk1.d dVar2 = wk1.d.CONTINUOUS;
        if (dVar != dVar2 && !((wk1.f) eVar).f528463a) {
            this.f159372v = eVar;
            return;
        }
        wk1.f fVar = (wk1.f) eVar;
        if (fVar.f528464b != dVar2 || (eVar2 = this.f159372v) == null) {
            return;
        }
        if (eVar2.a().position() > 10485760) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", "Pending Frame exploded");
            this.f159372v = null;
            return;
        }
        try {
            ((wk1.f) this.f159372v).c(eVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", e17.getMessage());
        }
        if (fVar.f528463a) {
            wk1.e eVar3 = this.f159372v;
            if (((wk1.f) eVar3).f528464b == wk1.d.BINARY) {
                o(eVar3.a());
            } else if (((wk1.f) eVar3).f528464b == wk1.d.TEXT) {
                try {
                    java.lang.String a17 = yk1.c.a(eVar3.a());
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (a17 == null) {
                        a17 = "";
                    }
                    n(a17);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", e18.getMessage());
                }
            }
            this.f159372v = null;
        }
    }

    @Override // tk1.c
    public void n(java.lang.String str) {
        this.f159374x.f159376a.d(str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) this.f159373w).f159271a.f159283d.f();
    }

    @Override // tk1.c
    public void o(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) this.f159373w).f159271a;
        g1Var.f159283d.f();
        try {
            r45.k47 k47Var = (r45.k47) new r45.k47().mo11468x92b714fd(ik1.f.a(byteBuffer));
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = k47Var.f459909f;
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugJsEngine", "dataFormat.data is null");
                return;
            }
            byte[] bArr = gVar.f273689a;
            int i17 = k47Var.f459907d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = g1Var.f159287h;
            if (i17 == 2006) {
                r45.r47 r47Var = (r45.r47) new r45.r47().mo11468x92b714fd(bArr);
                n1Var.getClass();
                n1Var.b(r47Var.f466078d);
            } else if (i17 == 3001) {
                g1Var.T();
            } else if (i17 != 3002) {
                switch (i17) {
                    case 1001:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.c(g1Var.f159283d, k47Var, ((r45.c57) new r45.c57().mo11468x92b714fd(bArr)).f452832d, g1Var.f159289m, n1Var);
                        g1Var.f159283d.f();
                        break;
                    case 1002:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.y(g1Var, (r45.g57) new r45.g57().mo11468x92b714fd(bArr), k47Var);
                        break;
                    case 1003:
                        r45.e57 e57Var = (r45.e57) new r45.e57().mo11468x92b714fd(bArr);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = g1Var.f159283d;
                        boolean z17 = e57Var.f454569e;
                        a1Var.f159156y = z17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onJoinRoom paged_data_switch: %b", java.lang.Boolean.valueOf(z17));
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.c(g1Var.f159283d, k47Var, e57Var.f454568d, g1Var.f159289m, n1Var)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.t(g1Var);
                            break;
                        }
                        break;
                    case 1004:
                        if (!g1Var.f159288i.mo50262x39e05d35()) {
                            n1Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onQuitSilent");
                            n1Var.f159339b.e(4);
                            tk1.c cVar = n1Var.f159338a.f159376a;
                            if (cVar == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugSocket", "client is null");
                            } else {
                                cVar.f501429f.a(1000, "quit", false);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = n1Var.f159340c;
                            l2Var.setVisibility(8);
                            if (l2Var.getParent() instanceof android.view.ViewGroup) {
                                ((android.view.ViewGroup) l2Var.getParent()).removeView(l2Var);
                                l2Var.removeAllViews();
                            }
                            l2Var.f159317e = null;
                            break;
                        } else {
                            n1Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onQuit");
                            n1Var.f159339b.e(4);
                            tk1.c cVar2 = n1Var.f159338a.f159376a;
                            if (cVar2 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugSocket", "client is null");
                            } else {
                                cVar2.f501429f.a(1000, "quit", false);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = n1Var.f159340c;
                            l2Var2.getClass();
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var2));
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var2));
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g2(l2Var2));
                            break;
                        }
                    case 1005:
                        n1Var.e((r45.j57) new r45.j57().mo11468x92b714fd(bArr), k47Var);
                        break;
                    case 1006:
                        n1Var.d((r45.z47) new r45.z47().mo11468x92b714fd(bArr), k47Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.b(k47Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z0) ((java.util.HashMap) g1Var.f159283d.f159149r).get(k47Var.f459908e));
                        break;
                }
            } else {
                g1Var.f159283d.e(4);
                n1Var.f();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketMessage cmd: %d", java.lang.Integer.valueOf(k47Var.f459907d));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugJsEngine", "onSocketMessage %s", android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // tk1.c
    public void p(xk1.g gVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) this.f159373w;
        e1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen");
        e1Var.f159271a.f159283d.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = e1Var.f159271a.f159283d;
        a1Var.f159153v = 0;
        if (!android.text.TextUtils.isEmpty(a1Var.f159155x)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen with wsEndpoint");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = e1Var.f159271a;
            g1Var.f159290n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.t(g1Var);
            e1Var.f159271a.T();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = e1Var.f159271a.f159283d;
        synchronized (a1Var2) {
            str = a1Var2.f159134c;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.u(e1Var.f159271a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = e1Var.f159271a.f159287h;
        n1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
        java.util.concurrent.Future future = n1Var.f159349l;
        if (future != null) {
            future.cancel(false);
        }
        n1Var.f159349l = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.r1(n1Var), 100L, 1000L);
    }
}
