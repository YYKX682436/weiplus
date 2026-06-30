package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f69123e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f69124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.p0 f69125g;

    /* renamed from: h, reason: collision with root package name */
    public int f69126h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.minigame.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f69125g = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f69124f = obj;
        this.f69126h |= Integer.MIN_VALUE;
        return this.f69125g.c(null, null, null, this);
    }
}
