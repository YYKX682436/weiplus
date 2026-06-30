package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class kd implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84731a;

    public kd(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f84731a = atomicReference;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) parcelable;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84731a;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.tencent.mm.plugin.appbrand.launching.od.f84874a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.appbrand.launching.jd(e1Var, iPCString));
        }
    }
}
