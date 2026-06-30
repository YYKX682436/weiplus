package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class r3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f79711d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f79712e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f79713f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f79714g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f79715h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f79716i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f79717m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f79718n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.t3 f79719o;

    /* renamed from: p, reason: collision with root package name */
    public int f79720p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.appbrand.jsapi.auth.t3 t3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f79719o = t3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f79718n = obj;
        this.f79720p |= Integer.MIN_VALUE;
        return this.f79719o.a(this);
    }
}
