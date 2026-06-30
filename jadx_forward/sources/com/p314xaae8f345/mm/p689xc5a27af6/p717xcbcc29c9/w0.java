package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f147083d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f147084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f147085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e f147086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f147087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f147085f = b1Var;
        this.f147086g = c10511xc2ae2c6e;
        this.f147087h = c16564xb55e1d5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w0 w0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w0(this.f147085f, this.f147086g, this.f147087h, interfaceC29045xdcb5ca57);
        w0Var.f147084e = obj;
        return w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f147083d;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f147087h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f147084e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.v0 v0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.v0(c16564xb55e1d5, null);
            this.f147084e = y0Var;
            this.f147083d = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, v0Var, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) g17;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsTtsService", "startPlaying failed, message not found msgId=" + c16564xb55e1d5.f231013d + " talker=" + c16564xb55e1d5.a());
            return f0Var;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j(f9Var, null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.k2(this.f147086g, 0, 0L, 6, null), 6, null);
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147085f;
        b1Var.f146887q = jVar;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = b1Var.f146891u;
        if (c10511xc2ae2c6e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "startConnectivityWatchdog failed, playbackScope is null");
        } else {
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f1Var = b1Var.f146894x;
            if (f1Var != null && f1Var.f146954e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConditionWatchdog", "stop");
                f1Var.f146954e = false;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = f1Var.f146953d;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                f1Var.f146953d = null;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f1Var2 = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1(0L, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.s0.f147064d, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.t0(b1Var, null), 1, null);
            if (f1Var2.f146954e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConditionWatchdog", "start ignored, already running");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConditionWatchdog", "start checkIntervalMs=" + f1Var2.f146950a);
                f1Var2.f146954e = true;
                f1Var2.f146953d = v65.i.b(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e1(f1Var2, null), 1, null);
            }
            b1Var.f146894x = f1Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "startConnectivityWatchdog started");
        }
        b1Var.C.mo48813x58998cd();
        b1Var.D.mo48813x58998cd();
        b1Var.A = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
        if (b1Var.qj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "startMessageLoop state=" + b1Var.f146886p);
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e2 = b1Var.f146891u;
            if (c10511xc2ae2c6e2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsTtsService", "startMessageLoop failed, playbackScope is null");
            } else {
                v65.i.b(c10511xc2ae2c6e2, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.u0(b1Var, null), 1, null);
            }
        }
        return f0Var;
    }
}
