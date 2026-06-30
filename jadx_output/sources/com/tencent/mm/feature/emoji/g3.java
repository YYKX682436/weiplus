package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class g3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66280f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66282h;

    /* renamed from: i, reason: collision with root package name */
    public int f66283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66282h = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66281g = obj;
        this.f66283i |= Integer.MIN_VALUE;
        return this.f66282h.cj(null, this);
    }
}
