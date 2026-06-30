package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public interface l0 extends com.tencent.mm.plugin.appbrand.jsruntime.u {

    /* renamed from: t0, reason: collision with root package name */
    public static final int[] f84003t0 = {4, 0, 2, 1, 3, 5, 6};

    long G();

    long L();

    void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, cl.j1 j1Var);

    default void W(java.util.ArrayList arrayList, java.lang.String str, java.lang.Runnable runnable) {
    }

    void l0(java.util.ArrayList arrayList, java.lang.String str, cl.j1 j1Var);

    default void precompile(java.lang.String str, java.lang.String str2) {
    }

    default void saveEntryPagePathToCachePath() {
    }

    void v();

    long z();
}
