package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.rfx.p2589x5fb4e56.i f273774d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273775e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f273776f = false;

    public h(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.i iVar) {
        this.f273774d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((com.p314xaae8f345.mm.rfx.p2589x5fb4e56.c) this.f273774d).run();
            synchronized (this) {
                this.f273775e = true;
                notifyAll();
                ((com.p314xaae8f345.mm.rfx.p2589x5fb4e56.c) this.f273774d).b(this.f273776f);
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                this.f273775e = true;
                notifyAll();
                ((com.p314xaae8f345.mm.rfx.p2589x5fb4e56.c) this.f273774d).b(this.f273776f);
                throw th6;
            }
        }
    }
}
