package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class nd implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84827b;

    public nd(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f84826a = str;
        this.f84827b = atomicReference;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public void a() {
        com.tencent.mm.ipcinvoker.d0.i(this.f84826a, this);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84827b;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.tencent.mm.plugin.appbrand.launching.od.f84874a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            e1Var.a();
            atomicReference.set(null);
        }
    }
}
