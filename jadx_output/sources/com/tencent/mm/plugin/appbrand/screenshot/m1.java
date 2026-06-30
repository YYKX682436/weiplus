package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class m1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f88515d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f88516e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f88517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f88518g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f88519h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f88520i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f88521m;

    /* renamed from: n, reason: collision with root package name */
    public long f88522n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f88523o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.n1 f88524p;

    /* renamed from: q, reason: collision with root package name */
    public int f88525q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.appbrand.screenshot.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f88524p = n1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f88523o = obj;
        this.f88525q |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.screenshot.n1.c(this.f88524p, null, null, this);
    }
}
