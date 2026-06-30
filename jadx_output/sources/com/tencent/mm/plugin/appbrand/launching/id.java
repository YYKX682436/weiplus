package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class id implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.nd f84677c;

    public id(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.nd ndVar) {
        this.f84675a = atomicReference;
        this.f84676b = str;
        this.f84677c = ndVar;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) parcelable;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84675a;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.tencent.mm.plugin.appbrand.launching.od.f84874a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.appbrand.launching.hd(e1Var, iPCBoolean));
            atomicReference.set(null);
        }
        com.tencent.mm.ipcinvoker.d0.i(this.f84676b, this.f84677c);
    }
}
