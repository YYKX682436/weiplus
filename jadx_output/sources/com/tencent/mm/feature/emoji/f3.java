package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class f3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66260f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66262h;

    /* renamed from: i, reason: collision with root package name */
    public int f66263i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66262h = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66261g = obj;
        this.f66263i |= Integer.MIN_VALUE;
        return this.f66262h.bj(null, this);
    }
}
