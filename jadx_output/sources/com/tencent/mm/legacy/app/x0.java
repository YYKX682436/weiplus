package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public final class x0 implements com.tencent.mm.splash.v {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.splash.v f68528a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f68529b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68530c;

    public x0(com.tencent.mm.legacy.app.l0 l0Var) {
    }

    @Override // com.tencent.mm.splash.v
    public void a() {
        c();
        com.tencent.mm.splash.v vVar = this.f68528a;
        if (vVar != null) {
            vVar.a();
        } else {
            this.f68530c = true;
        }
    }

    @Override // com.tencent.mm.splash.v
    public void b() {
        c();
        com.tencent.mm.splash.v vVar = this.f68528a;
        if (vVar != null) {
            vVar.b();
        } else {
            this.f68529b = true;
        }
    }

    public final void c() {
        if (!android.os.Looper.getMainLooper().isCurrentThread()) {
            throw new java.lang.IllegalStateException("Must call from main thread!");
        }
    }
}
