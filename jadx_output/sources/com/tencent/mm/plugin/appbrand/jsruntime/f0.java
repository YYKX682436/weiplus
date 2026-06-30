package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public interface f0 extends com.tencent.mm.plugin.appbrand.jsruntime.u {
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
            post(runnable);
        }
    }

    void post(java.lang.Runnable runnable);
}
