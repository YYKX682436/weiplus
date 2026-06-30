package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class e2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65399d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65400e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65402g;

    /* renamed from: h, reason: collision with root package name */
    public int f65403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65402g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65401f = obj;
        this.f65403h |= Integer.MIN_VALUE;
        return this.f65402g.c(this);
    }
}
