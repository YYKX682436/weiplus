package hc2;

/* loaded from: classes10.dex */
public abstract class p0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final byte[] a(r45.mb4 mb4Var, int i17) {
        fo3.i iVar;
        fo3.h hVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mb4Var, "<this>");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (mb4Var.m75939xb282bd08(2) == 4) {
                java.lang.String m75945x2fec8307 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16)) ? mb4Var.m75945x2fec8307(16) : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(41)) ? mb4Var.m75945x2fec8307(41) : mb4Var.m75945x2fec8307(25);
                hVar = new fo3.h(m75945x2fec8307, null, m75945x2fec8307);
                iVar = new fo3.i(mb4Var.m75945x2fec8307(0), mb4Var.m75939xb282bd08(3), mb4Var.m75945x2fec8307(48), i17);
            } else if (mb4Var.m75939xb282bd08(2) == 2) {
                hVar = new fo3.h(mb4Var.m75945x2fec8307(0), null, mb4Var.m75945x2fec8307(48));
                iVar = null;
            } else {
                iVar = null;
                hVar = null;
            }
            byte[] s86 = fo3.s.INSTANCE.s8(hVar, iVar);
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateSecClientMediaFeature time:");
                sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
                sb6.append(" size:");
                sb6.append(s86 != 0 ? java.lang.Integer.valueOf(s86.length) : null);
                sb6.append(" type:");
                sb6.append(mb4Var.m75939xb282bd08(2));
                sb6.append(" duration:");
                sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f346440b) : null);
                sb6.append(" url:");
                java.lang.String str2 = "";
                if (iVar != null) {
                    str = iVar.f346439a;
                    if (android.text.TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                sb6.append(str);
                sb6.append(" url:");
                if (hVar != null) {
                    java.lang.String str3 = hVar.f346437a;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                } else {
                    str2 = null;
                }
                sb6.append(str2);
                sb6.append(" origin:");
                sb6.append(mb4Var.m75945x2fec8307(48));
                sb6.append(" watermarkFlag:");
                sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f346442d) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost", sb6.toString());
                return s86;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r3 = s86;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LogPost", "calculateSecClientMediaFeature time e:" + th);
                return r3;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final void b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19783xd9a946b7, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderFeedReportObject", prefix + " remux:" + c19783xd9a946b7.m76297x8ea8fbce() + ",upload:" + c19783xd9a946b7.m76339xdfbc0164() + ",uploadSize:" + (c19783xd9a946b7.m76341xfff0beb8() / 1024) + "KB,taskTotal:" + c19783xd9a946b7.m76319x2534fe28() + ",repost:" + c19783xd9a946b7.m76257x6bc66c4a());
    }

    public static final void c(android.view.View view, java.lang.String viewId, java.lang.String eventId, java.util.Map map) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            jz5.l[] lVarArr = new jz5.l[2];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76327x23a7af9b()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("finder_post_sessionid", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            lVarArr[1] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            if (map != null) {
                l17.putAll(map);
            }
            hc2.v0.d(view, viewId, eventId, false, l17, null, 20, null);
        }
    }

    public static /* synthetic */ void d(android.view.View view, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = "";
        }
        if ((i17 & 2) != 0) {
            str2 = "view_exp";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        c(view, str, str2, map);
    }
}
