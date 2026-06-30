package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class y3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f102708d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102709e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102710f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102711g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.z3 f102712h;

    /* renamed from: i, reason: collision with root package name */
    public int f102713i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.finder.assist.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102712h = z3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102711g = obj;
        this.f102713i |= Integer.MIN_VALUE;
        return this.f102712h.a(0, false, null, this);
    }
}
