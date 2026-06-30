package yf2;

/* loaded from: classes3.dex */
public final class g1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f543233d;

    public g1(yf2.m1 m1Var) {
        this.f543233d = m1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        in0.q m129720xd052bc21;
        r45.q12 q12Var = (r45.q12) obj;
        yf2.m1 m1Var = this.f543233d;
        boolean T7 = ((mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class)).T7();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (T7) {
            if (q12Var != null) {
                int m75939xb282bd08 = q12Var.m75939xb282bd08(0);
                if (m75939xb282bd08 != 1) {
                    if (m75939xb282bd08 != 2) {
                        if (m75939xb282bd08 != 3) {
                            if (m75939xb282bd08 == 5) {
                                if (zl2.r4.f555483a.Y1(m1Var.O6())) {
                                    m1Var.a7();
                                }
                                mm2.n0 n0Var = (mm2.n0) m1Var.m56788xbba4bfc0(mm2.n0.class);
                                boolean Q6 = n0Var.Q6(xy2.c.e(m1Var.O6()));
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onModeChange] CoLive, isInvitee=");
                                sb6.append(Q6);
                                sb6.append(", invitationId=");
                                r45.f50 f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) n0Var.f410798g).mo144003x754a37bb();
                                sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f455546d) : null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m1Var.f543281m, sb6.toString());
                                if (Q6) {
                                    qo0.b bVar = qo0.b.f446923n5;
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", false);
                                    m1Var.X6(bVar, bundle);
                                } else {
                                    mm2.c1 c1Var = (mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class);
                                    if (c1Var.l7()) {
                                        int i17 = (int) c1Var.f410399q;
                                        java.util.regex.Pattern pattern = pm0.v.f438335a;
                                        c1Var.p8(i17 & (-257));
                                        c1Var.D8(0);
                                    }
                                    qo0.b bVar2 = qo0.b.f446923n5;
                                    android.os.Bundle bundle2 = new android.os.Bundle();
                                    bundle2.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true);
                                    m1Var.X6(bVar2, bundle2);
                                }
                            }
                        } else if (zl2.r4.f555483a.Y1(m1Var.O6())) {
                            m1Var.a7();
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                            if (((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m1Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410602g).mo144003x754a37bb()).booleanValue() && ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m1Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410603h).mo144003x754a37bb() == null) {
                                h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(m1Var, null, null, new yf2.b1(m1Var, h0Var, null), 3, null);
                            } else {
                                h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(m1Var, null, null, new yf2.d1(m1Var, h0Var, null), 3, null);
                            }
                        }
                    } else if (zl2.r4.f555483a.Y1(m1Var.O6())) {
                        m1Var.a7();
                    }
                } else if (pm0.v.z(q12Var.m75939xb282bd08(1), 1)) {
                    if (zl2.r4.f555483a.Y1(m1Var.O6())) {
                        m1Var.a7();
                    }
                } else if (pm0.v.z(q12Var.m75939xb282bd08(1), 2) && !zl2.r4.f555483a.Y1(m1Var.O6())) {
                    df2.te teVar = (df2.te) m1Var.m56789x25fe639c(df2.te.class);
                    if (teVar != null) {
                        teVar.Z6();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) k0Var : null;
                    if (v1Var != null && (m129720xd052bc21 = v1Var.m129720xd052bc21()) != null) {
                        in0.q.d1(m129720xd052bc21, null, false, 2, null);
                        r3 = f0Var;
                    }
                    if (r3 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostUIC", "Orientatio reset blend but pluginLayout:" + dk2.ef.f314913e + " get liveCore fail!");
                    }
                }
                ((mm2.g1) m1Var.m56788xbba4bfc0(mm2.g1.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VIDEO_LIVE_ENABLE_AUDIENCE_NICKNAME_INT_SYNC;
                if (c17.r(u3Var, -1) == -1) {
                    if (pm0.v.z((int) ((mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class)).f410399q, 8192)) {
                        ((mm2.g1) m1Var.m56788xbba4bfc0(mm2.g1.class)).W6(1);
                    } else {
                        ((mm2.g1) m1Var.m56788xbba4bfc0(mm2.g1.class)).W6(0);
                    }
                } else if (q12Var.m75939xb282bd08(0) != 2) {
                    ((mm2.g1) m1Var.m56788xbba4bfc0(mm2.g1.class)).getClass();
                    if (gm0.j1.u().c().r(u3Var, -1) == 0) {
                        mm2.c1 c1Var2 = (mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class);
                        int i18 = (int) ((mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
                        java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                        c1Var2.p8(i18 & (-8193));
                    } else {
                        mm2.c1 c1Var3 = (mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class);
                        int i19 = (int) ((mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
                        java.util.regex.Pattern pattern3 = pm0.v.f438335a;
                        c1Var3.p8(i19 | 8192);
                    }
                }
            }
            yf2.m1.Z6(m1Var);
        }
        m1Var.f543284p.a(q12Var);
        return f0Var;
    }
}
