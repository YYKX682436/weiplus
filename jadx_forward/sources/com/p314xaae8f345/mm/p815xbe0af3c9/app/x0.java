package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public final class x0 implements com.p314xaae8f345.mm.p2617xca9a2a67.v {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2617xca9a2a67.v f150061a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f150062b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f150063c;

    public x0(com.p314xaae8f345.mm.p815xbe0af3c9.app.l0 l0Var) {
    }

    @Override // com.p314xaae8f345.mm.p2617xca9a2a67.v
    public void a() {
        c();
        com.p314xaae8f345.mm.p2617xca9a2a67.v vVar = this.f150061a;
        if (vVar != null) {
            vVar.a();
        } else {
            this.f150063c = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p2617xca9a2a67.v
    public void b() {
        c();
        com.p314xaae8f345.mm.p2617xca9a2a67.v vVar = this.f150061a;
        if (vVar != null) {
            vVar.b();
        } else {
            this.f150062b = true;
        }
    }

    public final void c() {
        if (!android.os.Looper.getMainLooper().isCurrentThread()) {
            throw new java.lang.IllegalStateException("Must call from main thread!");
        }
    }
}
