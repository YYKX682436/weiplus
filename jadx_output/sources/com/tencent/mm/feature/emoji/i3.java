package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class i3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66321d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66322e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66324g;

    /* renamed from: h, reason: collision with root package name */
    public int f66325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66324g = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66323f = obj;
        this.f66325h |= Integer.MIN_VALUE;
        return this.f66324g.hj(0, 0L, 0, null, 0, this);
    }
}
