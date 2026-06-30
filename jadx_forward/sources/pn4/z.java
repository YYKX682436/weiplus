package pn4;

@j95.b
/* loaded from: classes12.dex */
public final class z extends jm0.o implements cv.f1 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f438794m = jz5.h.b(pn4.y.f438782d);

    /* renamed from: n, reason: collision with root package name */
    public tl.h f438795n;

    public static final void Zi(pn4.z zVar, android.content.Context context, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z17) {
        zVar.getClass();
        int b17 = w21.v0.b(str, true);
        tl.h d1Var = b17 != 0 ? b17 != 1 ? b17 != 2 ? new w21.d1(context) : new w21.d0(context, 1.0f) : new w21.i0(context) : new w21.d1(context);
        zVar.f438795n = d1Var;
        d1Var.i(z17);
        d1Var.b(new pn4.q(atomicBoolean, qVar));
        d1Var.a(new pn4.r(atomicBoolean, qVar));
        d1Var.j(str, true);
    }

    public final pn4.p aj() {
        return (pn4.p) ((jz5.n) this.f438794m).mo141623x754a37bb();
    }

    public java.lang.Object bj(java.lang.String str, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        aj().O6(str, java.lang.System.currentTimeMillis(), new pn4.s(str, new java.util.concurrent.atomic.AtomicBoolean(false), rVar), z17, r45.jy3.INSTANT, r45.iy3.CHINESE);
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        rVar.m(new pn4.t(this));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1, com.tencent.mm.sdk.event.IListener] */
    public java.lang.Object cj(final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, final boolean z17, final yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        gm0.b bVar;
        ((ku5.t0) ku5.t0.f394148d).B(new pn4.u(this, f9Var));
        final p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        final android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (context != null) {
            cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            java.lang.String Ai = ((bv.p0) h1Var).Ai(f9Var);
            if (Ai.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: fileName is empty");
                if (atomicBoolean.compareAndSet(false, true)) {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                }
            } else {
                final java.lang.String yj6 = ((k90.b) u0Var).yj(f9Var, Ai, false);
                if (com.p314xaae8f345.mm.vfs.w6.j(yj6)) {
                    Zi(this, context, yj6, rVar, atomicBoolean, z17);
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                    rVar.m(new pn4.v(this));
                } else {
                    w21.w0 z07 = w21.p0.Di().z0(Ai);
                    if (z07 == null || (i17 = z07.f524025i) == 99) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: voice file not found and no voiceInfo");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                        }
                    } else {
                        if (i17 == 5 || i17 == 6) {
                            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                            ?? r86 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90>(a0Var) { // from class: com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1
                                {
                                    this.f39173x3fe91575 = -1397503360;
                                }

                                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                                /* renamed from: callback */
                                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90) {
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 event = c6220x84bdfe90;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                                    am.p00 p00Var = event.f136469g;
                                    if (p00Var.f89123a != com.p314xaae8f345.mm.p2621x8fb0427b.f9.this.m124847x74d37ac6()) {
                                        return false;
                                    }
                                    mo48814x2efc64();
                                    if (p00Var.f89124b && com.p314xaae8f345.mm.vfs.w6.j(yj6)) {
                                        pn4.z.Zi(this, context, yj6, rVar, atomicBoolean, z17);
                                        yz5.a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.mo152xb9724478();
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: download failed");
                                        if (atomicBoolean.compareAndSet(false, true)) {
                                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                            ((p3325xe03a0797.p3326xc267989b.r) rVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
                                        }
                                    }
                                    return true;
                                }
                            };
                            r86.mo48813x58998cd();
                            w21.p0.Bi().e();
                            rVar.m(new pn4.w(r86, this));
                            gm0.m b17 = gm0.j1.b();
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
                            if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new pn4.x(atomicBoolean, r86, rVar, null), 1, null) == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextToSpeechService", "readVoiceMessage: scope is null");
                                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: voice not in receiving state, status=" + z07.f524025i);
                            if (atomicBoolean.compareAndSet(false, true)) {
                                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                            }
                        }
                    }
                }
            }
        } else if (atomicBoolean.compareAndSet(false, true)) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : f0Var;
    }

    /* renamed from: stop */
    public void m158777x360802() {
        try {
            aj().P6();
            tl.h hVar = this.f438795n;
            if (hVar != null) {
                hVar.mo166733x360802();
            }
            this.f438795n = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextToSpeechService", e17, "stop", new java.lang.Object[0]);
        }
    }
}
