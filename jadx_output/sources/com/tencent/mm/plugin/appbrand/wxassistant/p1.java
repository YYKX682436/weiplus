package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class p1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f92269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f92270f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f92271g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f92272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.x1 f92273i;

    /* renamed from: m, reason: collision with root package name */
    public int f92274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f92273i = x1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f92272h = obj;
        this.f92274m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.wxassistant.x1.a(this.f92273i, null, null, null, null, this);
    }
}
