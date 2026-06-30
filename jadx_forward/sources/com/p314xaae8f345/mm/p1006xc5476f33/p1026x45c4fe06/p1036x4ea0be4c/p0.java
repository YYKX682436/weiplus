package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
public class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158419a;

    public p0(java.lang.String str) {
        this.f158419a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app received data, appId:%s, type:%d, time:%d", this.f158419a, java.lang.Integer.valueOf(c11725x4c3df839.f158311e), java.lang.Long.valueOf(c11725x4c3df839.f158316m));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class);
            if (s1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.l) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.l) s1Var;
                lVar.getClass();
                if (c11725x4c3df839 != null && !android.text.TextUtils.isEmpty(c11725x4c3df839.f158310d) && (concurrentHashMap = lVar.f158382d) != null) {
                    concurrentHashMap.compute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(c11725x4c3df839.f158310d, c11725x4c3df839.f158311e), new java.util.function.BiFunction() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$b
                        @Override // java.util.function.BiFunction
                        public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df8392 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) obj3;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df8393 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839.this;
                            if (c11725x4c3df8392 != null && c11725x4c3df8392.f158316m >= c11725x4c3df8393.f158316m) {
                                return c11725x4c3df8392;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "resetCache, updated username:%s, type:%d, time:%d", c11725x4c3df8393.f158310d, java.lang.Integer.valueOf(c11725x4c3df8393.f158311e), java.lang.Long.valueOf(c11725x4c3df8393.f158316m));
                            return c11725x4c3df8393;
                        }
                    });
                }
            }
            java.lang.String str = this.f158419a;
            if (c11725x4c3df839 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch, parcel is null or appid is null");
                return;
            }
            java.lang.String str2 = c11725x4c3df839.f158310d;
            int i17 = c11725x4c3df839.f158311e;
            java.lang.String str3 = c11725x4c3df839.f158314h;
            java.lang.String str4 = c11725x4c3df839.f158312f;
            java.lang.String str5 = c11725x4c3df839.f158313g;
            int i18 = c11725x4c3df839.f158315i;
            final long j17 = c11725x4c3df839.f158316m;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "username or data is null");
                return;
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
            if (b17 == null || b17.S || b17.L0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch but runtime is null or destroyed, username:%s, appId:%s, fetchType:%d, updateTime:%d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("timeStamp", java.lang.Long.valueOf(j17));
            hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str4);
            hashMap.put("query", str5);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(i18));
            hashMap.put("fetchedData", str3);
            hashMap.put("fetchType", i17 == 0 ? "pre" : "peroid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "AppBrandOnBackgroundFetchDataEvent dispatch to runtime, username:%s, appId:%s, fetch type:%d, timestamp:%d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.r0();
            r0Var.t(hashMap);
            b17.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$s
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                    if (o6Var.Q2 == null) {
                        o6Var.Q2 = new android.util.LongSparseArray();
                    }
                    android.util.LongSparseArray longSparseArray = o6Var.Q2;
                    long j18 = j17;
                    if (longSparseArray.indexOfKey(j18) >= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "notifyBackgroundFetchDataThrottling timestamp:%d dispatched, skip", java.lang.Long.valueOf(j18));
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = o6Var.C0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.r0 r0Var2 = r0Var;
                    r0Var2.u(C0);
                    r0Var2.m();
                    o6Var.Q2.put(j18, o6Var);
                }
            });
        }
    }
}
