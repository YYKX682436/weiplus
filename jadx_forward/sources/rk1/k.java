package rk1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 f477955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 f477956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 f477957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk1.m f477958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f477960i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477961m;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee462, rk1.m mVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f477955d = y8Var;
        this.f477956e = c11663x8e8dee46;
        this.f477957f = c11663x8e8dee462;
        this.f477958g = mVar;
        this.f477959h = str;
        this.f477960i = i17;
        this.f477961m = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(-4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.InputStream c17 = this.f477955d.c(this.f477956e.f156922e);
        if (c17 != null) {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(c17, r26.c.f450398a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.util.Iterator mo144672x467c086e = vz5.v.b(bufferedReader).mo144672x467c086e();
                while (mo144672x467c086e.hasNext()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) mo144672x467c086e.next())));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Appbrand.WasmCacheService", e17, "readline precompile.txt", new java.lang.Object[0]);
                    }
                }
                vz5.b.a(bufferedReader, null);
            } finally {
            }
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "func list empty, abort");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "wasm fileName: %s!!", this.f477957f.f156922e);
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = this.f477955d;
        java.lang.String fileName = this.f477957f.f156922e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileName, "fileName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.c(y8Var, fileName, b0Var);
        java.lang.String fileName2 = this.f477957f.f156922e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileName2, "fileName");
        java.lang.String substring = fileName2.substring(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        rk1.m mVar = this.f477958g;
        java.lang.String appId = this.f477959h;
        int i17 = this.f477960i;
        java.lang.String packageMD5 = this.f477961m;
        java.lang.Object value = b0Var.f373357a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
        rk1.i iVar = new rk1.i(this.f477958g, this.f477959h);
        mVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageMD5, "packageMD5");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = rk1.m.f477967i;
        if (concurrentHashMap.contains(appId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Appbrand.WasmCacheService", "already added task for appId: %s", appId);
        } else {
            rk1.e eVar = new rk1.e(appId, i17, packageMD5, byteBuffer, substring, iVar, arrayList);
            concurrentHashMap.put(appId, eVar);
            if (concurrentHashMap.size() > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "more than 1 task, pending for appId: %s", appId);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "create task for appId: %s", appId);
                mVar.wi(eVar);
            }
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_precompile_cache_timeout, 10000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "set compile timeout: %d", java.lang.Integer.valueOf(Ni));
        ((ku5.t0) ku5.t0.f394148d).k(new rk1.j(this.f477958g, this.f477959h), Ni);
    }
}
