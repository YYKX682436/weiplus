package eo2;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final eo2.f f337098a = new eo2.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f337099b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f337100c = new java.util.HashSet();

    static {
        ki.i.f389634c.c(new eo2.c());
    }

    public final boolean a(r45.om2 objectInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectInfo, "objectInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "checkFeed preview %d, status %d", java.lang.Integer.valueOf(objectInfo.m75939xb282bd08(0)), java.lang.Integer.valueOf(objectInfo.m75939xb282bd08(1)));
        return objectInfo.m75939xb282bd08(0) == 1 || d(java.lang.Integer.valueOf(objectInfo.m75939xb282bd08(1)));
    }

    public final synchronized eo2.d b(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.Map map = f337099b;
        eo2.d dVar = (eo2.d) ((java.util.HashMap) map).get(name);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(dVar != null ? dVar.f337094c : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "checkMember %d", objArr);
        if (dVar == null) {
            e(name);
        } else {
            if (dVar.f337092a) {
                if (c01.id.c() / 1000 <= dVar.f337095d || dVar.f337094c == 2) {
                    return dVar;
                }
                ((java.util.HashMap) map).remove(name);
                e(name);
                return null;
            }
            int i17 = dVar.f337096e;
            if (i17 >= 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "ignore repeat");
                return dVar;
            }
            dVar.f337096e = i17 + 1;
            e(name);
        }
        return null;
    }

    public final synchronized eo2.d c(java.lang.String name) {
        eo2.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        dVar = (eo2.d) ((java.util.HashMap) f337099b).get(name);
        boolean z17 = false;
        if (dVar != null) {
            if (dVar.f337092a) {
                z17 = true;
            }
        }
        if (!z17) {
            dVar = null;
        }
        return dVar;
    }

    public final boolean d(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) || (num != null && num.intValue() == 2);
    }

    public final synchronized void e(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.e2().r()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "request disable");
            return;
        }
        java.util.Set set = f337100c;
        if (((java.util.HashSet) set).contains(name)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "request pending request");
        } else {
            ((java.util.HashSet) set).add(name);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "do request");
            new ho2.c(null, name, 0, 4, null).l().H(new eo2.e(name));
        }
    }

    public final synchronized void f(java.lang.String finderUsername, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.e2().r()).intValue() != 0) {
            r45.tr0 tr0Var = (r45.tr0) cgiBack.f152151d;
            if (d(tr0Var != null ? java.lang.Integer.valueOf(tr0Var.f468259g) : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "updateMemberStatus %s", finderUsername);
                long c17 = (c01.id.c() / 1000) + 86400;
                boolean z17 = cgiBack.b() && cgiBack.f152151d != null;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgiBack.f152151d;
                r45.tr0 tr0Var2 = (r45.tr0) fVar;
                int i17 = tr0Var2 != null ? tr0Var2.f468256d : -1;
                r45.tr0 tr0Var3 = (r45.tr0) fVar;
                int i18 = tr0Var3 != null ? tr0Var3.f468259g : -1;
                ((java.util.HashMap) f337099b).put(finderUsername, new eo2.d(z17, i17, i18, c17, 0, 16, null));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae();
                am.rj rjVar = c5705xaea272ae.f136027g;
                rjVar.f89355a = z17;
                rjVar.f89357c = i18;
                rjVar.f89356b = finderUsername;
                c5705xaea272ae.b(android.os.Looper.getMainLooper());
            }
        }
    }

    public final synchronized void g(java.lang.String finderUsername, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.e2().r()).intValue() == 0) {
            return;
        }
        r45.xr0 xr0Var = (r45.xr0) cgiBack.f152151d;
        long j17 = xr0Var != null ? xr0Var.f471886f : 0L;
        long c17 = c01.id.c() / 1000;
        boolean z17 = cgiBack.b() && cgiBack.f152151d != null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgiBack.f152151d;
        r45.xr0 xr0Var2 = (r45.xr0) fVar;
        int i17 = xr0Var2 != null ? xr0Var2.f471884d : -1;
        r45.xr0 xr0Var3 = (r45.xr0) fVar;
        int i18 = xr0Var3 != null ? xr0Var3.f471885e : -1;
        boolean z18 = z17;
        eo2.d dVar = new eo2.d(z17, i17, i18, (j17 <= 0 || j17 - c17 <= 120) ? 86400 + c17 : j17, 0, 16, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "success %b updateStatus %s status %d curTime %d validTime %d", java.lang.Boolean.valueOf(z18), finderUsername, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c17), java.lang.Long.valueOf(j17));
        if (!z18) {
            eo2.d dVar2 = (eo2.d) ((java.util.HashMap) f337099b).get(finderUsername);
            int i19 = dVar2 != null ? dVar2.f337096e : 0;
            dVar.f337096e = i19;
            if (i19 > 2) {
                dVar.f337095d = 120L;
            }
        }
        ((java.util.HashMap) f337099b).put(finderUsername, dVar);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae();
        am.rj rjVar = c5705xaea272ae.f136027g;
        rjVar.f89355a = z18;
        rjVar.f89357c = i18;
        rjVar.f89356b = finderUsername;
        c5705xaea272ae.b(android.os.Looper.getMainLooper());
    }

    public final boolean h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberStatusManager", "checkScene %d", java.lang.Integer.valueOf(i17));
        return i17 == 17 || i17 == 18 || i17 == 20;
    }
}
