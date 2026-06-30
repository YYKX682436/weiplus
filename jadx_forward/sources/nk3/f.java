package nk3;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nk3.f f419574a = new nk3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f419575b = new java.util.HashMap();

    public final long a(int i17) {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).Di()) {
            if (i17 == 1) {
                return 2L;
            }
            if (i17 == 2) {
                return 1L;
            }
            if (i17 == 3) {
                return 4L;
            }
            if (i17 == 4) {
                return 3L;
            }
            if (i17 != 5) {
                if (i17 != 8) {
                    if (i17 != 22) {
                        return i17 != 25 ? -1L : 5L;
                    }
                    return 8L;
                }
                return 6L;
            }
            return 0L;
        }
        if (i17 == 1) {
            return 15L;
        }
        if (i17 == 2) {
            return 14L;
        }
        if (i17 == 3) {
            return 11L;
        }
        if (i17 == 4) {
            return 12L;
        }
        if (i17 != 5) {
            if (i17 != 8) {
                switch (i17) {
                    case 22:
                        return 16L;
                    case 23:
                        return 19L;
                    case 24:
                        return 20L;
                    case 25:
                        return 17L;
                    case 26:
                        return 13L;
                    case 27:
                        return 18L;
                    default:
                        return -1L;
                }
            }
            return 6L;
        }
        return 0L;
    }

    public final void b(r45.hr4 hr4Var) {
        if (hr4Var != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6764xf9084a8d c6764xf9084a8d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6764xf9084a8d();
            c6764xf9084a8d.f140897d = hr4Var.m75942xfb822ef2(1);
            c6764xf9084a8d.f140898e = hr4Var.m75942xfb822ef2(2);
            c6764xf9084a8d.f140899f = hr4Var.m75942xfb822ef2(3);
            c6764xf9084a8d.f140900g = hr4Var.m75942xfb822ef2(4);
            c6764xf9084a8d.k();
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, long j17, long j18, java.lang.String str, r45.kr4 kr4Var) {
        r45.ir4 ir4Var;
        if (c16601x7ed0e40c != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6765x66af22bc c6765x66af22bc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6765x66af22bc();
            int i17 = 1;
            c6765x66af22bc.f140903f = c6765x66af22bc.b("ItemId", c16601x7ed0e40c.f66791xc8a07680, true);
            c6765x66af22bc.f140902e = f419574a.a(c16601x7ed0e40c.f66793x2262335f);
            c6765x66af22bc.f140901d = c6765x66af22bc.b("ContextId", kr4Var != null ? kr4Var.m75945x2fec8307(0) : null, true);
            c6765x66af22bc.f140904g = j17;
            c6765x66af22bc.f140905h = c01.id.c();
            c6765x66af22bc.f140906i = j18;
            c6765x66af22bc.f140907j = c6765x66af22bc.b("ItemSubId", str, true);
            java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            java.util.HashMap hashMap = f419575b;
            java.lang.Long valueOf = !hashMap.containsKey(field_id) ? java.lang.Long.valueOf(c01.id.c()) : (java.lang.Long) hashMap.get(field_id);
            c6765x66af22bc.f140908k = valueOf != null ? valueOf.longValue() : c01.id.c();
            c6765x66af22bc.f140909l = c16601x7ed0e40c.f66789xac3be4e;
            if (kr4Var != null && (ir4Var = (r45.ir4) kr4Var.m75936x14adae67(7)) != null && ((int) ir4Var.m75942xfb822ef2(0)) != 1 && ((int) ir4Var.m75942xfb822ef2(0)) == 7) {
                i17 = 2;
            }
            c6765x66af22bc.f140910m = i17;
            c6765x66af22bc.k();
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, long j17, long j18, java.lang.String str, java.lang.String str2) {
        if (c16601x7ed0e40c != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6766x2f928865 c6766x2f928865 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6766x2f928865();
            c6766x2f928865.f140911d = c6766x2f928865.b("ItemId", c16601x7ed0e40c.f66791xc8a07680, true);
            c6766x2f928865.f140912e = f419574a.a(c16601x7ed0e40c.f66793x2262335f);
            c6766x2f928865.f140913f = j17;
            c6766x2f928865.f140914g = j18;
            c6766x2f928865.f140915h = c6766x2f928865.b("ContextId", str, true);
            c6766x2f928865.f140916i = c6766x2f928865.b("ItemSubId", str2, true);
            c6766x2f928865.k();
        }
    }

    public final void e(r45.kr4 kr4Var) {
        r45.ir4 ir4Var;
        if (kr4Var == null || (ir4Var = (r45.ir4) kr4Var.m75936x14adae67(7)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6768x3606b038 c6768x3606b038 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6768x3606b038();
        c6768x3606b038.f140923e = c6768x3606b038.b("ContextId", kr4Var.m75945x2fec8307(0), true);
        c6768x3606b038.f140922d = ir4Var.m75942xfb822ef2(0);
        c6768x3606b038.f140924f = ir4Var.m75942xfb822ef2(1);
        c6768x3606b038.f140925g = ir4Var.m75942xfb822ef2(2);
        c6768x3606b038.f140926h = ir4Var.m75942xfb822ef2(3);
        c6768x3606b038.f140927i = ir4Var.m75942xfb822ef2(4);
        c6768x3606b038.f140928j = ir4Var.m75942xfb822ef2(5);
        c6768x3606b038.f140929k = ir4Var.m75942xfb822ef2(6);
        c6768x3606b038.k();
    }

    public final void f(r45.kr4 kr4Var) {
        r45.gr4 gr4Var;
        if (kr4Var == null || (gr4Var = (r45.gr4) kr4Var.m75936x14adae67(5)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6767x1ec123bf c6767x1ec123bf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6767x1ec123bf();
        c6767x1ec123bf.f140918e = c6767x1ec123bf.b("ItemId", kr4Var.m75945x2fec8307(2), true);
        c6767x1ec123bf.f140919f = f419574a.a(kr4Var.m75939xb282bd08(3));
        c6767x1ec123bf.f140917d = c6767x1ec123bf.b("ContextId", kr4Var.m75945x2fec8307(0), true);
        c6767x1ec123bf.f140920g = c6767x1ec123bf.b("ItemSubId", kr4Var.m75945x2fec8307(4), true);
        c6767x1ec123bf.f140921h = gr4Var.m75942xfb822ef2(1);
        c6767x1ec123bf.k();
    }

    public final void g(int i17, r45.jr4 jr4Var) {
        if (jr4Var != null) {
            nk3.f fVar = f419574a;
            if (i17 == 1) {
                fVar.h(10, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                return;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    fVar.h(20, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                    return;
                }
                if (i17 == 4) {
                    fVar.h(15, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                    return;
                }
                if (i17 == 5) {
                    fVar.h(0, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                    return;
                }
                if (i17 == 8) {
                    fVar.h(30, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                    return;
                } else if (i17 == 22 || i17 == 25) {
                    fVar.h(25, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
                    return;
                } else if (i17 != 26) {
                    return;
                }
            }
            fVar.h(5, jr4Var.m75942xfb822ef2(0), jr4Var.m75933x41a8a7f2(1));
        }
    }

    public final void h(int i17, long j17, boolean z17) {
        if (j17 <= 0 || j17 > 30000) {
            return;
        }
        if (i17 == -1 || i17 == 0 || i17 == 5 || i17 == 10 || i17 == 15 || i17 == 20 || i17 == 25 || i17 == 30) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(1627);
            c4582x424c344.m40331x936762bd(i17 + 1);
            c4582x424c344.m40332x57b2b64f(j17);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(1627);
            c4582x424c3442.m40331x936762bd(i17 + 2);
            c4582x424c3442.m40332x57b2b64f(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3443.m40330x4c144dd(1627);
                c4582x424c3443.m40331x936762bd(i17 + 3);
                c4582x424c3443.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3443);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
        }
    }
}
