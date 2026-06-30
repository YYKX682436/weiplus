package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ae extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(com.tencent.mm.plugin.appbrand.page.v5 v5Var, boolean z17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86414d = v5Var;
        this.f86415e = z17;
        this.f86416f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.page.ae(this.f86414d, this.f86415e, this.f86416f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.page.ae) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86414d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        try {
            return v5Var.S1(this.f86415e);
        } finally {
            v5Var.getAppId();
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
