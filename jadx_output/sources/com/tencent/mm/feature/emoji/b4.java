package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class b4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66185d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66186e;

    /* renamed from: f, reason: collision with root package name */
    public long f66187f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66188g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66189h;

    /* renamed from: i, reason: collision with root package name */
    public int f66190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66189h = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66188g = obj;
        this.f66190i |= Integer.MIN_VALUE;
        return this.f66189h.qj(null, 0L, null, this);
    }
}
