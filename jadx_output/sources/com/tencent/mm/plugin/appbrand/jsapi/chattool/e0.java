package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f80385f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f80386g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f80387h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80388i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.g0 f80389m;

    /* renamed from: n, reason: collision with root package name */
    public int f80390n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.appbrand.jsapi.chattool.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80389m = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80388i = obj;
        this.f80390n |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.jsapi.chattool.g0.C(this.f80389m, null, null, null, null, null, this);
    }
}
