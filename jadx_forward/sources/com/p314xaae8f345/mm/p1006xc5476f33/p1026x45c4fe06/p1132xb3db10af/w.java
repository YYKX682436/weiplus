package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z f165735a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f165736b = false;

    public static void a(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        java.lang.String b17;
        if (f165736b && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.b(cls)) != null) {
            f165735a.b(b17, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, "CollectKeyInfo", 0, "", str2);
        }
    }

    public static void b(java.lang.String str, kg1.a aVar) {
        c(str, aVar, "");
    }

    public static void c(java.lang.String str, kg1.a aVar, java.lang.String str2) {
        if (f165736b) {
            kg1.h hVar = (kg1.h) aVar;
            f165735a.b(hVar.f389226a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f389227b, java.lang.Integer.valueOf(hVar.f389228c ? 1 : 0), java.lang.String.format("fail:%s", str2), "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.a(str, aVar, str2, "");
    }

    public static void d(java.lang.String str, kg1.a aVar, java.lang.String str2, java.lang.String str3, long j17, long j18) {
        if (f165736b) {
            java.lang.String str4 = ((kg1.h) aVar).f389226a;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            kg1.h hVar = (kg1.h) aVar;
            java.lang.Object[] objArr = {valueOf, str, hVar.f389227b, 0, "stepStart", str3};
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z zVar = f165735a;
            zVar.b(str4, "%d|%s|%s|%d|%s|%s", objArr);
            zVar.b(hVar.f389226a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(j18), str, hVar.f389227b, java.lang.Integer.valueOf(hVar.f389228c ? 1 : 0), java.lang.String.format("fail:%s", str2), str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.a(str, aVar, str2, str3);
    }

    public static void e(java.lang.String str, kg1.a aVar) {
        if (f165736b) {
            kg1.h hVar = (kg1.h) aVar;
            f165735a.b(hVar.f389226a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f389227b, java.lang.Integer.valueOf(hVar.f389228c ? 1 : 0), "ok", "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.f165738a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a;
        java.lang.String str2 = ((kg1.h) aVar).f389226a;
        vVar.a(str2, str, aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.f165738a.a(str2, str, aVar));
    }

    public static void f(java.lang.String str, kg1.a aVar, java.lang.String str2, long j17, long j18) {
        if (f165736b) {
            java.lang.String str3 = ((kg1.h) aVar).f389226a;
            kg1.h hVar = (kg1.h) aVar;
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), str, hVar.f389227b, 0, "stepStart", str2};
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z zVar = f165735a;
            zVar.b(str3, "%d|%s|%s|%d|%s|%s", objArr);
            zVar.b(hVar.f389226a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(j18), str, hVar.f389227b, java.lang.Integer.valueOf(hVar.f389228c ? 1 : 0), "ok", str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.f165738a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a.a(((kg1.h) aVar).f389226a, str, aVar, j18 - j17);
    }

    public static void g(java.lang.String str, kg1.a aVar) {
        if (f165736b) {
            kg1.h hVar = (kg1.h) aVar;
            f165735a.b(hVar.f389226a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f389227b, 0, "stepStart", "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.f165738a;
        kg1.h hVar2 = (kg1.h) aVar;
        java.lang.String str2 = hVar2.f389226a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x xVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.y.f165738a;
        xVar2.getClass();
        java.lang.String format = java.lang.String.format("%s#%s#%s", str2, str, hVar2.f389227b);
        ((java.util.concurrent.ConcurrentHashMap) xVar2.f165737a).put(format, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.util.List list = (java.util.List) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a.f165734a).get(hVar2.f389226a);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str, aVar, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u1.f169890d);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 h(java.lang.String str) {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z.f165739b;
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.z.f165739b.matcher(str);
            str = matcher.find() ? matcher.group(1) : null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String[] split = str.split("\\|", -1);
        if (split == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WeAppKeyLogger", "parse items null");
            return null;
        }
        if (split.length != 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WeAppKeyLogger", "parse items length illegal:%d", java.lang.Integer.valueOf(split.length));
            return null;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 c12311xaad8723 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723();
            c12311xaad8723.f165665d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[0], 0L);
            c12311xaad8723.f165666e = split[1];
            c12311xaad8723.f165667f = split[2];
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], 1) != 1) {
                z17 = false;
            }
            c12311xaad8723.f165668g = z17;
            c12311xaad8723.f165669h = split[4];
            c12311xaad8723.f165670i = split[5];
            return c12311xaad8723;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeAppKeyLogger", "parse e:%s", e17);
            return null;
        }
    }

    public static void i(java.lang.Class cls, java.lang.String str) {
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.a(cls, null);
        if (a17 == null) {
            return;
        }
        e(str, ((kg1.o) a17.get(a17.size() - 1)).f389242a);
        java.lang.String str2 = ((kg1.h) ((kg1.o) a17.get(0)).f389242a).f389226a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a;
        vVar.getClass();
        vVar.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.s(vVar, str));
    }

    public static void j(java.lang.Class cls, java.lang.String str) {
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.a(cls, null);
        if (a17 == null) {
            return;
        }
        e(str, ((kg1.o) a17.get(0)).f389242a);
        java.lang.String str2 = ((kg1.h) ((kg1.o) a17.get(0)).f389242a).f389226a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a;
        vVar.getClass();
        vVar.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.r(vVar, str));
    }
}
