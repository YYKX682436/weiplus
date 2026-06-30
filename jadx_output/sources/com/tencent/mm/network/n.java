package com.tencent.mm.network;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.network.l f72085a;

    public static int a(com.tencent.mm.network.i2 i2Var) {
        try {
            return i2Var.f() != 200 ? -1 : 0;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -3;
        }
    }

    public static java.io.InputStream b(java.lang.String str, int i17, int i18) {
        com.tencent.mm.network.h2 d17 = d(str, null);
        d17.g(i17);
        d17.k(i18);
        d17.c("GET");
        if (a(d17) != 0) {
            return null;
        }
        return d17.getInputStream();
    }

    public static org.apache.http.client.HttpClient c() {
        return new org.apache.http.impl.client.DefaultHttpClient();
    }

    public static com.tencent.mm.network.h2 d(java.lang.String str, com.tencent.mm.network.m mVar) {
        if (mVar == null) {
            mVar = new com.tencent.mm.network.m(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", mVar.f72067a, mVar.f72068b, mVar.f72069c, java.lang.Integer.valueOf(mVar.f72070d));
        com.tencent.mm.network.h2 h2Var = new com.tencent.mm.network.h2(mVar.f72068b, mVar.f72070d);
        h2Var.f72019c = mVar.f72069c;
        if (1 == mVar.f72070d) {
            java.lang.String str2 = mVar.f72067a;
            h2Var.h("Host", str2);
            h2Var.h("X-Online-Host", str2);
        }
        return h2Var;
    }

    public static com.tencent.mm.network.j2 e(java.lang.String str, com.tencent.mm.network.m mVar) {
        if (mVar == null) {
            mVar = new com.tencent.mm.network.m(str);
        }
        com.tencent.mm.network.j2 j2Var = new com.tencent.mm.network.j2(str, mVar.f72070d);
        j2Var.f72042h = mVar.f72069c;
        if (1 == mVar.f72070d) {
            java.lang.String str2 = mVar.f72067a;
            j2Var.h("Host", str2);
            j2Var.h("X-Online-Host", str2);
        }
        return j2Var;
    }

    public static int f(java.lang.String str, boolean z17, java.util.List list) {
        com.tencent.mm.network.l lVar = f72085a;
        if (lVar != null && lVar.a() != null) {
            try {
                return f72085a.a().D0(str, z17, list);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return -1;
    }

    public static void g(java.lang.String str) {
        com.tencent.mm.network.l lVar = f72085a;
        if (lVar == null || lVar.a() == null) {
            return;
        }
        f72085a.a().B(str);
    }

    public static void h(com.tencent.mm.network.l lVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(lVar == null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
        com.tencent.mars.xlog.Log.i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", objArr);
        f72085a = lVar;
    }
}
