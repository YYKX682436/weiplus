package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class w1 extends tk1.c {

    /* renamed from: v, reason: collision with root package name */
    public wk1.e f77839v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uh1.o0 f77840w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.x1 f77841x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.appbrand.debugger.x1 x1Var, java.net.URI uri, uk1.b bVar, java.util.Map map, int i17, uh1.o0 o0Var) {
        super(uri, bVar, map, i17);
        this.f77841x = x1Var;
        this.f77840w = o0Var;
        this.f77839v = null;
    }

    @Override // tk1.c
    public void k(int i17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugSocket", "onClose,reason: %s, errCode = %d", str, java.lang.Integer.valueOf(i17));
        uh1.o0 o0Var = this.f77840w;
        if (i17 != -1 && i17 != -2 && i17 != -3) {
            ((com.tencent.mm.plugin.appbrand.debugger.e1) o0Var).a(i17, str);
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            ((com.tencent.mm.plugin.appbrand.debugger.e1) o0Var).b(str);
        } else {
            ((com.tencent.mm.plugin.appbrand.debugger.e1) o0Var).b("network is down");
            i17 = 1006;
        }
        ((com.tencent.mm.plugin.appbrand.debugger.e1) o0Var).a(i17, str);
    }

    @Override // tk1.c
    public void l(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", "onSocketError, ex: " + exc.toString());
    }

    @Override // tk1.c
    public void m(wk1.e eVar) {
        wk1.e eVar2;
        wk1.d dVar = ((wk1.f) eVar).f446931b;
        wk1.d dVar2 = wk1.d.CONTINUOUS;
        if (dVar != dVar2 && !((wk1.f) eVar).f446930a) {
            this.f77839v = eVar;
            return;
        }
        wk1.f fVar = (wk1.f) eVar;
        if (fVar.f446931b != dVar2 || (eVar2 = this.f77839v) == null) {
            return;
        }
        if (eVar2.a().position() > 10485760) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", "Pending Frame exploded");
            this.f77839v = null;
            return;
        }
        try {
            ((wk1.f) this.f77839v).c(eVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", e17.getMessage());
        }
        if (fVar.f446930a) {
            wk1.e eVar3 = this.f77839v;
            if (((wk1.f) eVar3).f446931b == wk1.d.BINARY) {
                o(eVar3.a());
            } else if (((wk1.f) eVar3).f446931b == wk1.d.TEXT) {
                try {
                    java.lang.String a17 = yk1.c.a(eVar3.a());
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (a17 == null) {
                        a17 = "";
                    }
                    n(a17);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", e18.getMessage());
                }
            }
            this.f77839v = null;
        }
    }

    @Override // tk1.c
    public void n(java.lang.String str) {
        this.f77841x.f77843a.d(str);
        ((com.tencent.mm.plugin.appbrand.debugger.e1) this.f77840w).f77738a.f77750d.f();
    }

    @Override // tk1.c
    public void o(java.nio.ByteBuffer byteBuffer) {
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = ((com.tencent.mm.plugin.appbrand.debugger.e1) this.f77840w).f77738a;
        g1Var.f77750d.f();
        try {
            r45.k47 k47Var = (r45.k47) new r45.k47().parseFrom(ik1.f.a(byteBuffer));
            com.tencent.mm.protobuf.g gVar = k47Var.f378376f;
            if (gVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugJsEngine", "dataFormat.data is null");
                return;
            }
            byte[] bArr = gVar.f192156a;
            int i17 = k47Var.f378374d;
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = g1Var.f77754h;
            if (i17 == 2006) {
                r45.r47 r47Var = (r45.r47) new r45.r47().parseFrom(bArr);
                n1Var.getClass();
                n1Var.b(r47Var.f384545d);
            } else if (i17 == 3001) {
                g1Var.T();
            } else if (i17 != 3002) {
                switch (i17) {
                    case 1001:
                        com.tencent.mm.plugin.appbrand.debugger.y1.c(g1Var.f77750d, k47Var, ((r45.c57) new r45.c57().parseFrom(bArr)).f371299d, g1Var.f77756m, n1Var);
                        g1Var.f77750d.f();
                        break;
                    case 1002:
                        com.tencent.mm.plugin.appbrand.debugger.g1.y(g1Var, (r45.g57) new r45.g57().parseFrom(bArr), k47Var);
                        break;
                    case 1003:
                        r45.e57 e57Var = (r45.e57) new r45.e57().parseFrom(bArr);
                        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = g1Var.f77750d;
                        boolean z17 = e57Var.f373036e;
                        a1Var.f77623y = z17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onJoinRoom paged_data_switch: %b", java.lang.Boolean.valueOf(z17));
                        if (com.tencent.mm.plugin.appbrand.debugger.y1.c(g1Var.f77750d, k47Var, e57Var.f373035d, g1Var.f77756m, n1Var)) {
                            com.tencent.mm.plugin.appbrand.debugger.g1.t(g1Var);
                            break;
                        }
                        break;
                    case 1004:
                        if (!g1Var.f77755i.isRunning()) {
                            n1Var.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onQuitSilent");
                            n1Var.f77806b.e(4);
                            tk1.c cVar = n1Var.f77805a.f77843a;
                            if (cVar == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugSocket", "client is null");
                            } else {
                                cVar.f419896f.a(1000, "quit", false);
                            }
                            com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = n1Var.f77807c;
                            l2Var.setVisibility(8);
                            if (l2Var.getParent() instanceof android.view.ViewGroup) {
                                ((android.view.ViewGroup) l2Var.getParent()).removeView(l2Var);
                                l2Var.removeAllViews();
                            }
                            l2Var.f77784e = null;
                            break;
                        } else {
                            n1Var.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onQuit");
                            n1Var.f77806b.e(4);
                            tk1.c cVar2 = n1Var.f77805a.f77843a;
                            if (cVar2 == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugSocket", "client is null");
                            } else {
                                cVar2.f419896f.a(1000, "quit", false);
                            }
                            com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = n1Var.f77807c;
                            l2Var2.getClass();
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var2));
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var2));
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.g2(l2Var2));
                            break;
                        }
                    case 1005:
                        n1Var.e((r45.j57) new r45.j57().parseFrom(bArr), k47Var);
                        break;
                    case 1006:
                        n1Var.d((r45.z47) new r45.z47().parseFrom(bArr), k47Var);
                        com.tencent.mm.plugin.appbrand.debugger.s1.b(k47Var, (com.tencent.mm.plugin.appbrand.debugger.z0) ((java.util.HashMap) g1Var.f77750d.f77616r).get(k47Var.f378375e));
                        break;
                }
            } else {
                g1Var.f77750d.e(4);
                n1Var.f();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketMessage cmd: %d", java.lang.Integer.valueOf(k47Var.f378374d));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugJsEngine", "onSocketMessage %s", android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // tk1.c
    public void p(xk1.g gVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.debugger.e1 e1Var = (com.tencent.mm.plugin.appbrand.debugger.e1) this.f77840w;
        e1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen");
        e1Var.f77738a.f77750d.f();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = e1Var.f77738a.f77750d;
        a1Var.f77620v = 0;
        if (!android.text.TextUtils.isEmpty(a1Var.f77622x)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen with wsEndpoint");
            com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = e1Var.f77738a;
            g1Var.f77757n = true;
            com.tencent.mm.plugin.appbrand.debugger.g1.t(g1Var);
            e1Var.f77738a.T();
            return;
        }
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = e1Var.f77738a.f77750d;
        synchronized (a1Var2) {
            str = a1Var2.f77601c;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.debugger.g1.u(e1Var.f77738a);
        }
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = e1Var.f77738a.f77754h;
        n1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
        java.util.concurrent.Future future = n1Var.f77816l;
        if (future != null) {
            future.cancel(false);
        }
        n1Var.f77816l = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.appbrand.debugger.r1(n1Var), 100L, 1000L);
    }
}
