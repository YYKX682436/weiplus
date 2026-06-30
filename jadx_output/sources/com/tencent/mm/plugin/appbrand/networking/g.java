package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f86085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f86086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17, int i17) {
        super(1);
        this.f86085d = z17;
        this.f86086e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage(it.f47684a, this.f86085d, this.f86086e);
    }
}
