package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public abstract class j0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f151990d;

    public j0(android.os.Handler handler) {
        this.f151990d = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f151990d.post(new com.p314xaae8f345.mm.p943x351df9c2.i0(this));
        }
    }
}
