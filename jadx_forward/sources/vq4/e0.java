package vq4;

/* loaded from: classes14.dex */
public final class e0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520826a;

    public e0(vq4.m0 m0Var) {
        this.f520826a = m0Var;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        cv.v0 v0Var = (cv.v0) obj;
        vq4.m0 m0Var = this.f520826a;
        if (m0Var.f520891v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current running system telecom ，wechat should not response audio changed");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioRouteConsumer ");
        sb6.append(v0Var.f304051c);
        sb6.append(" ==== ");
        int i17 = v0Var.f304049a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", sb6.toString());
        int i18 = v0Var.f304051c;
        xm1.o oVar = m0Var.f520890u;
        if (i18 == 1) {
            if (i17 == 1) {
                gq4.v.Bi().Q(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar = m0Var.B;
                if (fVar != null) {
                    fVar.i2(v0Var);
                }
                gq4.v.Bi().K(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11080, 2, 1, 0);
            } else if (i17 == 2) {
                gq4.v.Bi().Q(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar2 = m0Var.B;
                if (fVar2 != null) {
                    fVar2.i2(v0Var);
                }
                gq4.v.Bi().K(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11080, 2, 2, 0);
            } else if (i17 == 3) {
                gq4.v.Bi().Q(false);
                gq4.v.Bi().K(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar3 = m0Var.B;
                if (fVar3 != null) {
                    fVar3.i2(v0Var);
                }
            } else if (i17 == 4) {
                gq4.v.Bi().Q(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar4 = m0Var.B;
                if (fVar4 != null) {
                    fVar4.i2(v0Var);
                }
                gq4.v.Bi().K(true);
            }
            if (mx3.f0.h()) {
                if (m0Var.C) {
                    m0Var.f520887r = v0Var;
                } else {
                    m0Var.f520888s = v0Var;
                }
            }
            m0Var.f520889t = v0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar5 = m0Var.B;
            if (fVar5 != null) {
                fVar5.q2(oVar.a());
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 == 4 && i17 == 4) {
                    m0Var.g();
                    return;
                }
                return;
            }
            if (i17 == 3) {
                m0Var.l(3, false);
            } else if (i17 == 4) {
                vq4.o0 o0Var = m0Var.f520882m;
                if (o0Var != null) {
                    int i19 = o0Var.f520902a;
                    boolean contains = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).wi()).contains(6);
                    if (vq4.n0.e(i19) && (contains || !m0Var.f520886q)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current is car online ,and we not allow to response start bt");
                        return;
                    }
                }
                m0Var.h();
                m0Var.l(4, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar6 = m0Var.B;
            if (fVar6 != null) {
                fVar6.q2(oVar.a());
                return;
            }
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                if (mx3.f0.h()) {
                    if (m0Var.a() == 4 || m0Var.a() == -1) {
                        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                            m0Var.l(3, false);
                        } else {
                            int i27 = m0Var.f520881l;
                            if (i27 != -1) {
                                m0Var.l(i27, false);
                            } else {
                                vq4.b0 b0Var = vq4.b0.f520803a;
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_fix_xiaomi_watch_error_t2, false)) {
                                    vq4.o0 o0Var2 = m0Var.f520882m;
                                    if (o0Var2 == null || vq4.n0.e(o0Var2.f520902a)) {
                                        m0Var.l(1, false);
                                    } else {
                                        m0Var.l(m0Var.f520893x ? 1 : 2, false);
                                    }
                                } else if (m0Var.f520893x) {
                                    m0Var.l(1, false);
                                } else {
                                    m0Var.l(2, false);
                                }
                            }
                        }
                    }
                } else if (m0Var.a() == 4) {
                    if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                        m0Var.l(3, false);
                    } else {
                        int i28 = m0Var.f520881l;
                        if (i28 != -1) {
                            m0Var.l(i28, false);
                        } else if (m0Var.f520893x) {
                            m0Var.l(1, false);
                        } else {
                            m0Var.l(2, false);
                        }
                    }
                }
                vq4.o0 o0Var3 = m0Var.f520882m;
                if (o0Var3 != null) {
                    if (m0Var.A && vq4.n0.e(o0Var3.f520902a)) {
                        m0Var.A = false;
                        if (!m0Var.f520892w) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "direct play ringtone nor tts cause not support tts");
                        }
                        java.lang.String str = gq4.v.Bi().f258091a.f257964u;
                        if (str != null) {
                            m0Var.e(str, gq4.v.Bi().f258091a.f257965v, gq4.v.Bi().f258091a.f257966w);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "not allow to play tts cause " + m0Var.A + " && " + vq4.n0.e(o0Var3.f520902a));
                    }
                }
            }
        } else if (m0Var.a() == 3) {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                m0Var.l(4, false);
            } else {
                int i29 = m0Var.f520881l;
                if (i29 != -1) {
                    m0Var.l(i29, false);
                } else {
                    vq4.o0 o0Var4 = m0Var.f520882m;
                    if (o0Var4 == null || vq4.n0.e(o0Var4.f520902a)) {
                        m0Var.l(1, false);
                    } else {
                        m0Var.l(m0Var.f520893x ? 1 : 2, false);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar7 = m0Var.B;
        if (fVar7 != null) {
            fVar7.q2(oVar.a());
        }
    }
}
