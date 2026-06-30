package lb0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final lb0.d f399202a = new lb0.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f399203b = jz5.h.b(lb0.b.f399200d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f399204c = jz5.h.b(lb0.c.f399201d);

    public static final java.util.Map a(lb0.d dVar, java.lang.String str) {
        java.lang.Object m143895xf1229813;
        dVar.getClass();
        if (r26.n0.N(str)) {
            return kz5.q0.f395534d;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : f07) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{"&"}, false, 0, 6, null);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f08.get(0))), new lb0.a(p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) f08.get(1), "1"), java.lang.Long.parseLong((java.lang.String) f08.get(2)), java.lang.Long.parseLong((java.lang.String) f08.get(3)))));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            jz5.l lVar = (jz5.l) m143895xf1229813;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return kz5.c1.q(arrayList);
    }

    public final long b(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a adBusinessType) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f399204c).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                j17 = aVar.f399199c;
            }
            j17 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f399203b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                j17 = aVar2.f399199c;
            }
            j17 = 0;
        }
        return j17 * f();
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c(wj.t0 t0Var) {
        if (t0Var == null) {
            return null;
        }
        switch (t0Var.ordinal()) {
            case 8:
            case 10:
            case 12:
                return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a.f270309e;
            case 9:
            case 11:
            case 13:
                return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a.f270308d;
            default:
                return null;
        }
    }

    public final java.lang.String d(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a adBusinessType, android.content.Context context) {
        java.lang.Object obj;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adBusinessType, "adBusinessType");
        if (context == null) {
            return "";
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int ordinal = adBusinessType.ordinal();
            if (ordinal == 0) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzi);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lc9);
            }
            obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(string);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return (java.lang.String) (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj) == null ? obj : "");
    }

    public final long e(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a adBusinessType) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f399204c).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                j17 = aVar.f399198b;
            }
            j17 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f399203b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                j17 = aVar2.f399198b;
            }
            j17 = 0;
        }
        return j17 * f();
    }

    public final long f() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? 60000L : 86400000L;
    }

    public final boolean g(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a adBusinessType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f399204c).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                return aVar.f399197a;
            }
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f399203b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                return aVar2.f399197a;
            }
        }
        return false;
    }
}
