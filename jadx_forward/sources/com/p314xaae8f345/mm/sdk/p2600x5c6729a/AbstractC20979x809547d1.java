package com.p314xaae8f345.mm.sdk.p2600x5c6729a;

/* renamed from: com.tencent.mm.sdk.event.IEvent */
/* loaded from: classes12.dex */
public abstract class AbstractC20979x809547d1 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f273898e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f273897d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f273899f = 0;

    public int a() {
        if (this.f273899f == 0) {
            this.f273899f = getClass().getName().hashCode();
        }
        return this.f273899f;
    }

    public final void b(android.os.Looper looper) {
        final com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d;
        dVar.getClass();
        iz5.a.d("EventPoolImpl.asyncPublish event", this);
        iz5.a.d("EventPoolImpl.asyncPublish looper", looper);
        a();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(looper).mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.this.d(this, false);
            }
        });
    }

    public final void c(java.lang.String str) {
        final com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d;
        dVar.getClass();
        a();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.d$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.this.d(this, false);
            }
        }, str);
    }

    public final void d(java.util.concurrent.Executor executor) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d;
        dVar.getClass();
        iz5.a.d("EventPoolImpl.asyncPublish event", this);
        iz5.a.d("EventPoolImpl.asyncPublish executor", executor);
        a();
        executor.execute(new com.p314xaae8f345.mm.sdk.p2600x5c6729a.f(dVar, this));
    }

    public final boolean e() {
        return com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.d(this, false);
    }
}
