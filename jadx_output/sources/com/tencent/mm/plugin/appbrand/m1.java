package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class m1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f85688d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f85689e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f85690f;

    /* renamed from: g, reason: collision with root package name */
    public int f85691g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f85692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n1 f85693i;

    /* renamed from: m, reason: collision with root package name */
    public int f85694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.appbrand.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f85693i = n1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f85692h = obj;
        this.f85694m |= Integer.MIN_VALUE;
        return this.f85693i.b(null, this);
    }
}
