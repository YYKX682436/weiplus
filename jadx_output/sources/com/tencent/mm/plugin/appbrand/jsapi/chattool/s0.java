package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80451e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f80452f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 f80454h;

    /* renamed from: i, reason: collision with root package name */
    public int f80455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80454h = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80453g = obj;
        this.f80455i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.jsapi.chattool.v0.C(this.f80454h, null, 0, null, null, this);
    }
}
