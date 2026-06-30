package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public abstract class j0 implements com.tencent.mm.sdk.platformtools.g6, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f70457d;

    public j0(android.os.Handler handler) {
        this.f70457d = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f70457d.post(new com.tencent.mm.modelavatar.i0(this));
        }
    }
}
