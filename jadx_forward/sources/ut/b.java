package ut;

/* loaded from: classes9.dex */
public final class b extends jm0.g implements qi3.a0, qi3.z, w65.o {

    /* renamed from: f, reason: collision with root package name */
    public static final ut.a f512125f = new ut.a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = event.f445230g;
        java.lang.String a17 = c16564xb55e1d5 != null ? c16564xb55e1d5.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = event.f445230g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(a17, c16564xb55e1d52 != null ? c16564xb55e1d52.f231013d : 0L);
        if (k17 != null && k17.n2()) {
            event.m160185x9616526c();
            int ordinal = event.f445224a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                V6(k17, 8, true);
                return;
            }
            if (ordinal == 4) {
                V6(k17, 1, true);
                return;
            }
            if (ordinal != 7) {
                if (ordinal != 8) {
                    return;
                }
                V6(k17, 2, false);
                return;
            }
            int a18 = event.a();
            if (a18 == -510001) {
                V6(k17, 2, false);
            } else {
                if (a18 != 0) {
                    return;
                }
                V6(k17, 0, true);
            }
        }
    }

    @Override // w65.o
    public void P2(w65.p event) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (event instanceof w65.l) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231011f.a(event.f524896b.Z0());
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(a17 != null ? a17.a() : null, a17 != null ? a17.f231013d : 0L);
            if (k17 != null && k17.n2()) {
                int ordinal = event.f524895a.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        int i17 = event.f524897c;
                        if (i17 != 0) {
                            switch (i17) {
                                case -600002:
                                case -600001:
                                    V6(k17, 4, true);
                                    break;
                            }
                        } else {
                            V6(k17, 0, true);
                        }
                    } else if (ordinal == 5 || ordinal == 6) {
                        V6(k17, 4, true);
                    }
                } else if (!((w65.l) event).f524894e) {
                    V6(k17, 3, true);
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileBubbleStatusFSC", "onChange event:" + event + ", exception:" + m143898xd4a2fc34);
            }
        }
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f400862m).mo141623x754a37bb(), null, new lm.f(rVar, this, null), 1, null);
    }

    @Override // jm0.g
    public void S6() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f400862m).mo141623x754a37bb(), null, new lm.h(rVar, this, null), 1, null);
    }

    public final void T6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileBubbleStatusFSC", "markFileIfNeedClean msgId:" + f9Var.m124847x74d37ac6() + ", svrId:" + f9Var.I0() + ", talker:" + f9Var.Q0() + ", isNeedClean:" + z17);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            a17 = tg3.p1.f500739a.a(f9Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (a17.f276568p == z17) {
            return;
        }
        a17.f276568p = z17;
        tg3.q1.a(a17, f9Var);
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17);
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileBubbleStatusFSC", "markFileIfNeedClean failed, msgInfo:" + f9Var + ", isNeedClean:" + z17);
        }
    }

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileBubbleStatusFSC", "notifyFileBubbleUpdate msgIdTalker:" + c16564xb55e1d5);
        if (c16564xb55e1d5 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828();
            am.a2 a2Var = c5236x8e0a6828.f135569g;
            a2Var.f87650a = c16564xb55e1d5.f231013d;
            a2Var.f87651b = c16564xb55e1d5.a();
            c5236x8e0a6828.e();
        }
    }

    public final void V6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, int i17, boolean z17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            a17 = tg3.p1.f500739a.a(msgInfo);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (a17.f276567o != i17 || z17) {
            a17.f276567o = i17;
            tg3.q1.a(a17, msgInfo);
            U6(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(msgInfo.m124847x74d37ac6(), msgInfo.Q0()));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17);
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileBubbleStatusFSC", "setFileBubbleStatus failed, msgInfo:" + msgInfo + ", fileBubbleStatus:" + i17 + ", exception:" + m143898xd4a2fc34);
            }
        }
    }
}
