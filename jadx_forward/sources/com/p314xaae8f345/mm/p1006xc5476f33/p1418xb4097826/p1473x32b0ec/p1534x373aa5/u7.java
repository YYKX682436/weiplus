package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f198246d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p7.f198117d);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7 f198247a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f198248b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f198249c;

    public u7(android.app.Activity activity, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198248b = new java.util.HashMap();
        this.f198249c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t7(this));
        r45.b22 b22Var = new r45.b22();
        if (bArr != null) {
            try {
                b22Var.mo11468x92b714fd(bArr);
                a(b22Var);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMultiTaskManager", "initMultiTaskData", th6);
            }
        }
        java.lang.String m75945x2fec8307 = b22Var.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7 o7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7(new ak3.i(activity));
        this.f198247a = o7Var;
        if (m75945x2fec8307 == null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
        }
        o7Var.y(21, m75945x2fec8307);
    }

    public final void a(r45.b22 b22Var) {
        java.lang.String m76944x730bcac6;
        boolean isEmpty = b22Var.m75941xfb821914(9).isEmpty();
        java.util.HashMap hashMap = this.f198248b;
        if (isEmpty) {
            if (b22Var.m75942xfb822ef2(1) != 0) {
                hashMap.put(java.lang.Long.valueOf(b22Var.m75942xfb822ef2(1)), b22Var);
                return;
            }
            return;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = b22Var.m75941xfb821914(9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAllHistoryFinderObjectList(...)");
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            if (m76794xd0557130 != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0));
                r45.b22 b22Var2 = new r45.b22();
                b22Var2.set(0, pm0.v.u(m76794xd0557130.m75942xfb822ef2(0)));
                b22Var2.set(1, java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)));
                b22Var2.set(2, c19792x256d2725.m76803x6c285d75());
                b22Var2.set(3, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
                java.lang.String str = "";
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                b22Var2.set(4, m76836x6c03c64c);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 != null && (m76944x730bcac6 = m76802x2dd01666.m76944x730bcac6()) != null) {
                    str = m76944x730bcac6;
                }
                b22Var2.set(5, str);
                b22Var2.set(6, c19792x256d2725.m76829x97edf6c0());
                b22Var2.set(7, c19792x256d2725);
                hashMap.put(valueOf, b22Var2);
            }
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        java.lang.String str;
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null) {
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            r45.b22 b22Var = (r45.b22) this.f198248b.get(java.lang.Long.valueOf(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            if (b22Var == null || (c16601x7ed0e40c = this.f198247a.f381610a) == null) {
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c1Var.f410379n;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725 != null ? c19792x256d2725.m76760x76845fea() : null;
            java.lang.String u17 = pm0.v.u(((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            c16601x7ed0e40c.f66791xc8a07680 = u17;
            b22Var.set(0, u17);
            r45.lr4 v07 = c16601x7ed0e40c.v0();
            if (m76760x76845fea == null || (str = m76760x76845fea.m76175x6d346f39()) == null) {
                str = "";
            }
            v07.set(5, str);
            c16601x7ed0e40c.f66790x225a93cf = b22Var.mo14344x5f01b1f6();
            if (m76760x76845fea != null) {
                c16601x7ed0e40c.v0().set(0, m76760x76845fea.m76184x8010e5e4());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = m76760x76845fea.m76160xd133dfec();
                if (m76160xd133dfec != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = m76160xd133dfec.m76027x1cbb0791() > 0 ? m76160xd133dfec : null;
                    if (c19780xceb4c4dc != null) {
                        c16601x7ed0e40c.v0().set(6, java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791()));
                        c16601x7ed0e40c.v0().set(2, c19780xceb4c4dc.m76028x11716638());
                    }
                }
            }
        }
    }

    public u7(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u7 manager) {
        r45.b22 b22Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f198248b = new java.util.HashMap();
        this.f198249c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t7(this));
        java.util.HashMap hashMap = manager.f198248b;
        this.f198248b = hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7 o7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7(new ak3.i(activity));
        this.f198247a = o7Var;
        gk2.e eVar = gk2.e.f354004n;
        java.lang.String m75945x2fec8307 = (eVar == null || (b22Var = (r45.b22) hashMap.get(java.lang.Long.valueOf(((mm2.e1) ((mm2.c1) eVar.a(mm2.c1.class)).m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)))) == null) ? null : b22Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
        }
        o7Var.y(21, m75945x2fec8307);
    }
}
