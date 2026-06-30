package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69137d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f69138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.y f69139f;

    /* renamed from: g, reason: collision with root package name */
    public int f69140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.minigame.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f69139f = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f69138e = obj;
        this.f69140g |= Integer.MIN_VALUE;
        return this.f69139f.G(null, this);
    }
}
