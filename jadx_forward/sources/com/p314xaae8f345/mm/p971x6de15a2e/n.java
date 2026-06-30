package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p971x6de15a2e.l f153618a;

    public static int a(com.p314xaae8f345.mm.p971x6de15a2e.i2 i2Var) {
        try {
            return i2Var.f() != 200 ? -1 : 0;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -3;
        }
    }

    public static java.io.InputStream b(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p971x6de15a2e.h2 d17 = d(str, null);
        d17.g(i17);
        d17.k(i18);
        d17.c("GET");
        if (a(d17) != 0) {
            return null;
        }
        return d17.mo48349xc7995ab4();
    }

    public static org.apache.http.client.HttpClient c() {
        return new org.apache.http.impl.client.DefaultHttpClient();
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.h2 d(java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.m mVar) {
        if (mVar == null) {
            mVar = new com.p314xaae8f345.mm.p971x6de15a2e.m(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", mVar.f153600a, mVar.f153601b, mVar.f153602c, java.lang.Integer.valueOf(mVar.f153603d));
        com.p314xaae8f345.mm.p971x6de15a2e.h2 h2Var = new com.p314xaae8f345.mm.p971x6de15a2e.h2(mVar.f153601b, mVar.f153603d);
        h2Var.f153552c = mVar.f153602c;
        if (1 == mVar.f153603d) {
            java.lang.String str2 = mVar.f153600a;
            h2Var.h("Host", str2);
            h2Var.h("X-Online-Host", str2);
        }
        return h2Var;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.j2 e(java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.m mVar) {
        if (mVar == null) {
            mVar = new com.p314xaae8f345.mm.p971x6de15a2e.m(str);
        }
        com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var = new com.p314xaae8f345.mm.p971x6de15a2e.j2(str, mVar.f153603d);
        j2Var.f153575h = mVar.f153602c;
        if (1 == mVar.f153603d) {
            java.lang.String str2 = mVar.f153600a;
            j2Var.h("Host", str2);
            j2Var.h("X-Online-Host", str2);
        }
        return j2Var;
    }

    public static int f(java.lang.String str, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p971x6de15a2e.l lVar = f153618a;
        if (lVar != null && lVar.a() != null) {
            try {
                return f153618a.a().D0(str, z17, list);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return -1;
    }

    public static void g(java.lang.String str) {
        com.p314xaae8f345.mm.p971x6de15a2e.l lVar = f153618a;
        if (lVar == null || lVar.a() == null) {
            return;
        }
        f153618a.a().B(str);
    }

    public static void h(com.p314xaae8f345.mm.p971x6de15a2e.l lVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(lVar == null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[1] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", objArr);
        f153618a = lVar;
    }
}
