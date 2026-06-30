package qx3;

/* loaded from: classes10.dex */
public final class o extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f448907d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f448908e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f448909f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f448910g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f448911h;

    /* renamed from: i, reason: collision with root package name */
    public long f448912i;

    /* renamed from: m, reason: collision with root package name */
    public kk4.v f448913m;

    /* renamed from: n, reason: collision with root package name */
    public co4.b f448914n;

    /* renamed from: o, reason: collision with root package name */
    public vx3.i f448915o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f448916p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f448917q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f448918r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f448919s;

    public o(p3325xe03a0797.p3326xc267989b.y0 lifeCycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleScope, "lifeCycleScope");
        this.f448907d = lifeCycleScope;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new qx3.e(0L, 3));
        this.f448908e = a17;
        this.f448909f = a17;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new qx3.f(0L, null, 1));
        this.f448910g = a18;
        this.f448911h = a18;
    }

    public final void N6() {
        k6.a aVar;
        kk4.v vVar = this.f448913m;
        if (vVar != null) {
            try {
                vVar.R();
                kk4.v vVar2 = this.f448913m;
                if (vVar2 != null) {
                    kk4.b.e(vVar2, null, 1, null);
                }
                kk4.v vVar3 = this.f448913m;
                if (vVar3 != null) {
                    vVar3.P();
                }
                co4.b bVar = this.f448914n;
                if (bVar != null && (aVar = bVar.f125335a) != null) {
                    p6.f fVar = aVar.f386010a;
                    if (fVar != null) {
                        fVar.mo157875x65825f6();
                    }
                    if (fVar != null) {
                        fVar.c();
                    }
                    if (fVar != null) {
                        fVar.mo157877x41012807();
                    }
                }
                kk4.v vVar4 = this.f448913m;
                if (vVar4 != null) {
                    vVar4.mo143590x408b7293();
                }
                this.f448913m = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", "Player destroyed");
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f448913m = null;
                throw th6;
            }
            this.f448913m = null;
        }
    }

    public final void O6(vx3.i tpMediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tpMediaInfo, "tpMediaInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", "initPlayer is ".concat(tpMediaInfo.n()));
        this.f448915o = tpMediaInfo;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f448913m = new kk4.v(context);
        dk4.a aVar = tpMediaInfo.f522817a;
        boolean z17 = true;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", "setMediaInfo to play " + vx3.i.D.b(aVar) + ", ringWithLoop:" + this.f448918r);
            kk4.v vVar = this.f448913m;
            if (vVar != null) {
                vVar.B(aVar);
            }
            kk4.v vVar2 = this.f448913m;
            if (vVar2 != null) {
                vVar2.A(this.f448918r);
            }
            kk4.v vVar3 = this.f448913m;
            if (vVar3 != null) {
                vVar3.f390118j = true;
            }
            if (vVar3 != null) {
                vVar3.P = tpMediaInfo.f522818b;
            }
            if (vVar3 != null) {
                vVar3.H(tpMediaInfo.f522818b, tpMediaInfo.f522819c);
            }
        }
        kk4.v vVar4 = this.f448913m;
        if (vVar4 != null) {
            vVar4.f390128t = new qx3.i(this);
        }
        if (vVar4 != null) {
            vVar4.f390124p = new qx3.j(this);
            if (vVar4.s()) {
                pm0.v.X(new kk4.m(vVar4));
            }
        }
        kk4.v vVar5 = this.f448913m;
        k6.a aVar2 = null;
        kk4.h hVar = vVar5 != null ? vVar5.f390113e : null;
        if (hVar != null) {
            hVar.f390084m = new qx3.k(tpMediaInfo, this);
        }
        if (this.f448917q) {
            this.f448914n = new co4.b();
        }
        vx3.i iVar = this.f448915o;
        if ((iVar != null ? iVar.i().f339136a : null) == null) {
            t45.d1 d1Var = new t45.d1();
            t45.f fVar = new t45.f();
            fVar.f497082d = tpMediaInfo.f522831o;
            fVar.f497083e = tpMediaInfo.f522832p;
            d1Var.f497076f = fVar;
            t45.e0 e0Var = new t45.e0();
            e0Var.f497080d = tpMediaInfo.f522833q;
            d1Var.f497075e = e0Var;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new eo4.a(d1Var, null), 3, null);
        }
        vx3.i iVar2 = this.f448915o;
        if (iVar2 != null) {
            ey3.a i17 = iVar2.i();
            co4.b bVar = this.f448914n;
            boolean z18 = false;
            if (bVar != null) {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                qx3.l lVar = new qx3.l(this);
                java.lang.String a17 = ym1.f.f544667h.a();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "vibrate") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "normal")) {
                    if (fp.h.c(26)) {
                        if (co4.c.a() ? false : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_preview_can_vibrate, true)) {
                            java.lang.String str = i17.f339136a;
                            java.lang.String str2 = i17.f339137b;
                            if (str != null && str2 != null) {
                                k6.a b17 = k6.a.b(context2);
                                if (b17 != null) {
                                    java.io.File file = new java.io.File(co4.c.e(str, str2, false));
                                    co4.a aVar3 = new co4.a(lVar);
                                    p6.f fVar2 = b17.f386010a;
                                    if (fVar2 != null) {
                                        fVar2.d(file, 255, 50, aVar3);
                                    }
                                    if (fVar2 != null) {
                                        fVar2.mo157876xed060d07();
                                    }
                                    if (fVar2 != null) {
                                        fVar2.b(true);
                                    }
                                    if (fVar2 != null) {
                                        fVar2.mo157879x68ac462();
                                    }
                                    aVar2 = b17;
                                }
                                bVar.f125335a = aVar2;
                            }
                            z18 = z17;
                        }
                    }
                    z17 = false;
                    z18 = z17;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VibratePlayer", "forbidden vibrate cause system setting no vibrate");
                }
            }
            this.f448919s = z18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        try {
            kk4.v vVar6 = this.f448913m;
            if (vVar6 != null) {
                kk4.b.f(vVar6, 0, false, null, 6, null);
            }
            kk4.v vVar7 = this.f448913m;
            if (vVar7 != null) {
                vVar7.O();
            }
        } catch (java.lang.Exception unused) {
            N6();
        }
    }

    public final void P6(vx3.i iVar, long j17, boolean z17, boolean z18, boolean z19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestPlayFlow, id:");
        sb6.append(j17);
        sb6.append(", play:");
        sb6.append(z17);
        sb6.append(", withVibrate:");
        sb6.append(z18);
        sb6.append(", info:");
        sb6.append(iVar != null ? iVar.f522817a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", sb6.toString());
        this.f448917q = z18;
        this.f448918r = z19;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f448910g).k(new qx3.f(j17, iVar, z17 ? 2 : 3));
    }

    public final void Q6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", "requestStopPlay");
        R6();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f448910g).k(new qx3.f(0L, null, 3));
    }

    public final void R6() {
        k6.a aVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop play sync id is");
        sb6.append(this.f448912i);
        sb6.append(" and ");
        vx3.i iVar = this.f448915o;
        sb6.append(iVar != null ? iVar.n() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", sb6.toString());
        kk4.v vVar = this.f448913m;
        if (vVar != null) {
            vVar.f390124p = null;
            vVar.s();
        }
        kk4.v vVar2 = this.f448913m;
        if (vVar2 != null) {
            vVar2.f390128t = null;
        }
        if (vVar2 != null) {
            vVar2.D(null);
        }
        co4.b bVar = this.f448914n;
        if (bVar != null && (aVar = bVar.f125335a) != null) {
            p6.f fVar = aVar.f386010a;
            if (fVar != null) {
                fVar.mo157875x65825f6();
            }
            if (fVar != null) {
                fVar.c();
            }
            if (fVar != null) {
                fVar.mo157877x41012807();
            }
        }
        kk4.v vVar3 = this.f448913m;
        if (vVar3 != null) {
            vVar3.R();
        }
        kk4.v vVar4 = this.f448913m;
        if (vVar4 != null) {
            kk4.b.e(vVar4, null, 1, null);
        }
        kk4.v vVar5 = this.f448913m;
        if (vVar5 != null) {
            vVar5.mo143591x360802();
        }
        kk4.v vVar6 = this.f448913m;
        if (vVar6 != null) {
            vVar6.mo143590x408b7293();
        }
    }
}
