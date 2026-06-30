package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f69134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.r0 f69135e;

    /* renamed from: f, reason: collision with root package name */
    public int f69136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.minigame.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f69135e = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f69134d = obj;
        this.f69136f |= Integer.MIN_VALUE;
        return this.f69135e.b(this);
    }
}
