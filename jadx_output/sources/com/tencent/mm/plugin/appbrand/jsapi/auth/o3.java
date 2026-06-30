package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class o3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f79661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f79662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f79663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f79664g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f79665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f79666i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f79667m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f79668n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.q3 f79669o;

    /* renamed from: p, reason: collision with root package name */
    public int f79670p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.appbrand.jsapi.auth.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f79669o = q3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f79668n = obj;
        this.f79670p |= Integer.MIN_VALUE;
        return this.f79669o.a(this);
    }
}
