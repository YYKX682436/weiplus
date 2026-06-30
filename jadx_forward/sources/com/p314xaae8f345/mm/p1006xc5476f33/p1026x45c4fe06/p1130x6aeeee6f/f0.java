package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public interface f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u {
    void C(int i17);

    java.lang.String a();

    default void e() {
    }

    boolean g();

    void h(boolean z17);

    default boolean j() {
        return false;
    }

    void k(java.lang.Runnable runnable, boolean z17);

    default void k0(java.lang.Runnable runnable) {
        if (g()) {
            runnable.run();
        } else {
            mo51545x3498a0(runnable);
        }
    }

    /* renamed from: post */
    void mo51545x3498a0(java.lang.Runnable runnable);
}
