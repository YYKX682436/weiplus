package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f80428f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 f80430h;

    /* renamed from: i, reason: collision with root package name */
    public int f80431i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80430h = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80429g = obj;
        this.f80431i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.jsapi.chattool.r0.C(this.f80430h, null, null, this);
    }
}
