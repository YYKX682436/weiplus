package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f65443f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f65444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f65445h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65446i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65447m;

    /* renamed from: n, reason: collision with root package name */
    public int f65448n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65447m = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65446i = obj;
        this.f65448n |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.chatrecordstts.b1.bj(this.f65447m, this);
    }
}
