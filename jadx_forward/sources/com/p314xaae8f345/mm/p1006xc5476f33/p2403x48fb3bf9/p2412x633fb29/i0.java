package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes5.dex */
public class i0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f264461d;

    public i0(java.lang.Runnable runnable) {
        this.f264461d = runnable;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.Runnable runnable = this.f264461d;
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return false;
    }
}
