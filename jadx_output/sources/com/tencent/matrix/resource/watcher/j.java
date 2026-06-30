package com.tencent.matrix.resource.watcher;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f52997a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f52998b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public long f52999c;

    public j(long j17, android.os.HandlerThread handlerThread) {
        this.f52997a = new android.os.Handler(handlerThread.getLooper());
        this.f52999c = j17;
    }

    public final void a(com.tencent.matrix.resource.watcher.i iVar, int i17) {
        this.f52997a.postDelayed(new com.tencent.matrix.resource.watcher.g(this, iVar, i17), this.f52999c);
    }
}
