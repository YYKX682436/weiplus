package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.appstorage.q1 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.e f76162i = new com.tencent.mm.plugin.appbrand.appstorage.e(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f76163m = new java.util.LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f76164n = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f76165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76166e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.g0 f76167f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.g0 f76168g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f76169h;

    public f(long j17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var) {
        this.f76165d = j17;
        this.f76166e = str2;
        this.f76167f = g0Var;
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var2 = new com.tencent.mm.plugin.appbrand.appstorage.g0(j17, "AppBrandEncryptMMKVStorage#" + str + '#');
        this.f76168g = g0Var2;
        this.f76169h = android.util.Base64.decode(str2, 0);
        g0Var2.f76183d = new com.tencent.mm.plugin.appbrand.appstorage.d(str, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(o(i17, str, (java.lang.String) it.next()));
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public int K(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return this.f76168g.K(appId);
    }

    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var = this.f76168g;
        g0Var.f76184e.g();
        g0Var.f76184e.d();
        java.lang.String[] b17 = g0Var.f76184e.b();
        int length = b17 != null ? b17.length : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorage", "storage after clearAll keySize = [" + length + ']');
        if (length > 0) {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).b(1817L, 13L, 1L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public void k(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var = this.f76167f;
        if (g0Var != null) {
            g0Var.k(i17, str);
        }
        this.f76168g.k(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType) {
        kotlin.jvm.internal.o.g(dataType, "dataType");
        int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(str2, str3);
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var = this.f76167f;
        if (g0Var != null) {
            g0Var.f(i17, str, str2, str3, dataType, b17);
        }
        return this.f76168g.f(i17, str, str2, str3, dataType, b17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.lang.Object[] o(int i17, java.lang.String str, java.lang.String str2) {
        return this.f76168g.o(i17, str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var = this.f76167f;
        if (g0Var != null) {
            g0Var.q(i17, str, str2);
        }
        return this.f76168g.q(i17, str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        return this.f76168g.t(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 z(int i17, java.lang.String str, java.util.List kvInfo) {
        kotlin.jvm.internal.o.g(kvInfo, "kvInfo");
        return this.f76168g.z(i17, str, kvInfo);
    }
}
