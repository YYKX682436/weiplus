package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69127d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f69128e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f69129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.y f69130g;

    /* renamed from: h, reason: collision with root package name */
    public int f69131h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.minigame.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f69130g = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f69129f = obj;
        this.f69131h |= Integer.MIN_VALUE;
        return com.tencent.mm.minigame.y.D(this.f69130g, null, null, null, this);
    }
}
