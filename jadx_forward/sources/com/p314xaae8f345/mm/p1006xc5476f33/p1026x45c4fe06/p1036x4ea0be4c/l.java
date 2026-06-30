package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public class l extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f158382d = new java.util.concurrent.ConcurrentHashMap(10);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public long D4(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o.class);
        if (c10755xa1fef898 != null) {
            return c10755xa1fef898.f149938d;
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 E4(final java.lang.String str, final int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f158382d;
        return concurrentHashMap == null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.n.class) : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) concurrentHashMap.computeIfAbsent(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), new java.util.function.Function() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.l.this.getClass();
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.n.class);
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public boolean L3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11727xe9d3cd3(str, i17, str2, str3, str4, i18, j17, i19), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.p.class);
        if (c10750x9556b48c != null && c10750x9556b48c.f149933d) {
            z17 = true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f158382d;
        if (concurrentHashMap != null) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839();
                c11725x4c3df839.f158310d = str;
                c11725x4c3df839.f158311e = i17;
                c11725x4c3df839.f158314h = str2;
                c11725x4c3df839.f158312f = str3;
                c11725x4c3df839.f158313g = str4;
                c11725x4c3df839.f158315i = i18;
                c11725x4c3df839.f158316m = j17;
                c11725x4c3df839.f158317n = i19;
                concurrentHashMap.put(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), c11725x4c3df839);
            } else {
                concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17));
            }
        }
        return z17;
    }

    public void wi(final java.lang.String str, final int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f158382d;
        if (concurrentHashMap != null) {
            concurrentHashMap.compute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), new java.util.function.BiFunction() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$c
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) obj2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.l.this.getClass();
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    java.lang.String str3 = str;
                    int i18 = i17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df8392 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str3, i18), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.n.class);
                    if (c11725x4c3df8392 == null) {
                        return c11725x4c3df839;
                    }
                    if (c11725x4c3df839 != null && c11725x4c3df839.f158316m >= c11725x4c3df8392.f158316m) {
                        return c11725x4c3df839;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "warmUpCache, updated username:%s, type:%d, time:%d", str3, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c11725x4c3df8392.f158316m));
                    return c11725x4c3df8392;
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public boolean z6(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f158382d;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17));
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.m.class);
        return c10750x9556b48c != null && c10750x9556b48c.f149933d;
    }
}
