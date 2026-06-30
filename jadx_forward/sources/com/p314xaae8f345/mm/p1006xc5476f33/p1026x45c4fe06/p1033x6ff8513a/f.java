package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.e f157695i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.e(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f157696m = new java.util.LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f157697n = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f157698d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f157699e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 f157700f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 f157701g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f157702h;

    public f(long j17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var) {
        this.f157698d = j17;
        this.f157699e = str2;
        this.f157700f = g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0(j17, "AppBrandEncryptMMKVStorage#" + str + '#');
        this.f157701g = g0Var2;
        this.f157702h = android.util.Base64.decode(str2, 0);
        g0Var2.f157716d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.d(str, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(o(i17, str, (java.lang.String) it.next()));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public int K(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return this.f157701g.K(appId);
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var = this.f157701g;
        g0Var.f157717e.g();
        g0Var.f157717e.d();
        java.lang.String[] b17 = g0Var.f157717e.b();
        int length = b17 != null ? b17.length : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptMMKVStorage", "storage after clearAll keySize = [" + length + ']');
        if (length > 0) {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).b(1817L, 13L, 1L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public void k(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var = this.f157700f;
        if (g0Var != null) {
            g0Var.k(i17, str);
        }
        this.f157701g.k(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var = this.f157700f;
        if (g0Var != null) {
            g0Var.f(i17, str, str2, str3, dataType, b17);
        }
        return this.f157701g.f(i17, str, str2, str3, dataType, b17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.lang.Object[] o(int i17, java.lang.String str, java.lang.String str2) {
        return this.f157701g.o(i17, str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var = this.f157700f;
        if (g0Var != null) {
            g0Var.q(i17, str, str2);
        }
        return this.f157701g.q(i17, str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        return this.f157701g.t(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 z(int i17, java.lang.String str, java.util.List kvInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kvInfo, "kvInfo");
        return this.f157701g.z(i17, str, kvInfo);
    }
}
