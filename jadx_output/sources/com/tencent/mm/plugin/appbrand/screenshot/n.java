package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f88526d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f88527e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f88528f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f88529g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f88530h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f88531i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f88532m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.v f88533n;

    /* renamed from: o, reason: collision with root package name */
    public int f88534o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.screenshot.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f88533n = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f88532m = obj;
        this.f88534o |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.screenshot.v.j(this.f88533n, null, null, null, this);
    }
}
