package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80395d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80396e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f80397f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 f80399h;

    /* renamed from: i, reason: collision with root package name */
    public int f80400i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80399h = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80398g = obj;
        this.f80400i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.jsapi.chattool.n0.C(this.f80399h, null, this);
    }
}
