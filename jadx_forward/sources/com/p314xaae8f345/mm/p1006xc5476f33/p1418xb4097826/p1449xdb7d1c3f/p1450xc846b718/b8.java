package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class b8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vt2 f186954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.d8 f186955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(r45.vt2 vt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.d8 d8Var) {
        super(0);
        this.f186954d = vt2Var;
        this.f186955e = d8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList m75941xfb821914 = this.f186954d.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRevoke_tab_tips_info(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jz5.f0 f0Var = jz5.f0.f384359a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.d8 d8Var = this.f186955e;
            if (!hasNext) {
                r45.dz2 dz2Var = new r45.dz2();
                dz2Var.set(0, linkedList);
                d8Var.e1(dz2Var, "FinderRevokeTabTips");
                return f0Var;
            }
            r45.wt2 wt2Var = (r45.wt2) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c17 = d8Var.c(wt2Var.m75945x2fec8307(0));
            if (c17 != null) {
                d8Var.F(c17.f65874xb5f7102a, "revokeTabTips");
                linkedList.addAll(wt2Var.m75941xfb821914(1));
                boolean L = d8Var.L(c17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManager", "[revokeRedDot] ret=" + L + " revokeId=" + wt2Var.m75945x2fec8307(0) + " removeRedDot=" + c17);
                if (L) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    int m55856xfb85f7b0 = c17.m55856xfb85f7b0();
                    java.lang.String str = c17.f65880x11c19d58;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String m75945x2fec8307 = wt2Var.m75945x2fec8307(0);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    o3Var.vj(m55856xfb85f7b0, str, m75945x2fec8307, 1);
                    d8Var.Z0().d("[revokeRedDot]", c17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    int m55856xfb85f7b02 = c17.m55856xfb85f7b0();
                    java.lang.String str2 = c17.f65880x11c19d58;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String m75945x2fec83072 = wt2Var.m75945x2fec8307(0);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    o3Var2.vj(m55856xfb85f7b02, str2, m75945x2fec83072, 0);
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManager", "no found redDot. " + wt2Var.m75945x2fec8307(0));
                java.util.concurrent.ConcurrentHashMap c18 = d8Var.c1();
                java.lang.String m75945x2fec83073 = wt2Var.m75945x2fec8307(0);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                c18.put(m75945x2fec83073, wt2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                java.lang.String m75945x2fec83074 = wt2Var.m75945x2fec8307(0);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                o3Var3.vj(0, "", m75945x2fec83074, 0);
            }
        }
    }
}
