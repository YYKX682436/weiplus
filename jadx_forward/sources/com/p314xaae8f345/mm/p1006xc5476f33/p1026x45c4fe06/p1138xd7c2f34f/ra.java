package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f166651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7 f166652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166653c;

    public ra(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7 c12350x8cb074f7, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f166651a = atomicBoolean;
        this.f166652b = c12350x8cb074f7;
        this.f166653c = atomicReference;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6 callbackResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackResult, "callbackResult");
        int i17 = callbackResult.f165980d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7 c12350x8cb074f7 = this.f166652b;
        if (1 == i17) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = c12350x8cb074f7.f165999t;
            if (hVar != null) {
                hVar.a(callbackResult);
                return;
            }
            return;
        }
        boolean z17 = this.f166651a.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallTask", "onCallback instance:" + c12350x8cb074f7.f165995p.f169667d + " appId:" + c12350x8cb074f7.f165986d + " module:" + c12350x8cb074f7.f165998s + " isCallStackCompleted:" + z17);
        if (z17) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar2 = c12350x8cb074f7.f165999t;
            if (hVar2 != null) {
                hVar2.a(callbackResult);
            }
        } else {
            this.f166653c.set(callbackResult);
        }
        c12350x8cb074f7.f165993n.close();
    }
}
