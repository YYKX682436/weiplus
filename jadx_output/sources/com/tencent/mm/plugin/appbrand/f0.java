package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class f0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.f0 f78037d = new com.tencent.mm.plugin.appbrand.f0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.appbrand.appstorage.m0) obj2).f76268d;
        long j18 = ((com.tencent.mm.plugin.appbrand.appstorage.m0) obj).f76268d;
        if (j17 - j18 > 0) {
            return 1;
        }
        return j17 == j18 ? 0 : -1;
    }
}
