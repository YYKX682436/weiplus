package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class gd implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84632a;

    public gd(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f84632a = atomicReference;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84632a;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.tencent.mm.plugin.appbrand.launching.od.f84874a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.appbrand.launching.fd(e1Var));
        }
    }
}
