package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f69101e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f69102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.p0 f69103g;

    /* renamed from: h, reason: collision with root package name */
    public int f69104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.minigame.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f69103g = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f69102f = obj;
        this.f69104h |= Integer.MIN_VALUE;
        return this.f69103g.a(null, null, this);
    }
}
