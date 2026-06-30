package sj1;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static int f489904a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f489905b;

    /* renamed from: d, reason: collision with root package name */
    public static sj1.a f489907d;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f489906c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final sj1.c f489908e = new sj1.k();

    public static final double a() {
        if (f489905b) {
            return com.p302x1ea3c036.p304x697f145.C2849xa2aadc78.INSTANCE.m21186x444c05bd();
        }
        return 0.0d;
    }

    public static final void b(java.lang.String str) {
        sj1.b bVar;
        if (!f489905b || (bVar = (sj1.b) f489906c.get(str)) == null) {
            return;
        }
        bVar.mo52347x5d03b04();
    }

    public static final sj1.b c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageTracer", "get instanceId:" + str);
        return (sj1.b) f489906c.get(str);
    }

    public static final void d(java.lang.String str, boolean z17) {
        int i17 = z17 ? 0 : f489904a;
        if (i17 != -1) {
            f489905b = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageTracer", "init instanceId:" + str);
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageTracer", "init fail, instanceId is null, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else if (f489907d == null || com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h2.f128972a.c(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z1.f129100a))) {
            java.util.HashMap hashMap = f489906c;
            ((sj1.k) f489908e).getClass();
            hashMap.put(str, i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? sj1.g.f489899a : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.qc() : sj1.j.f489903a : sj1.i.f489901b : new sj1.h());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageTracer", "init fail, dynamicSo and so not ready, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f489905b = false;
        }
    }

    public static final void e(java.lang.String str, java.lang.String category, java.lang.String name) {
        sj1.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!f489905b || (bVar = (sj1.b) f489906c.get(str)) == null) {
            return;
        }
        bVar.c(category, name);
    }

    public static final int f(java.lang.String str, java.lang.String category, java.lang.String name) {
        sj1.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!f489905b || (bVar = (sj1.b) f489906c.get(str)) == null) {
            return -1;
        }
        return bVar.k(category, name);
    }

    public static final void g(java.lang.String str) {
        sj1.b bVar;
        if (!f489905b || (bVar = (sj1.b) f489906c.get(str)) == null) {
            return;
        }
        bVar.g();
    }

    public static final void h(java.lang.String str, int i17) {
        sj1.b bVar;
        if (!f489905b || (bVar = (sj1.b) f489906c.get(str)) == null) {
            return;
        }
        bVar.j(i17);
    }

    public static final void i(java.lang.String str, java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (f489905b) {
            java.util.HashMap hashMap = f489906c;
            sj1.b bVar = (sj1.b) hashMap.get(str);
            if (bVar != null) {
                bVar.c(category, name);
            }
            sj1.b bVar2 = (sj1.b) hashMap.get(str);
            if (bVar2 != null) {
                bVar2.g();
            }
        }
    }

    public static final sj1.b j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageTracer", "unInit instanceId:" + str);
        if (str != null) {
            return (sj1.b) f489906c.remove(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageTracer", "unInit fail, instanceId is null, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return null;
    }
}
