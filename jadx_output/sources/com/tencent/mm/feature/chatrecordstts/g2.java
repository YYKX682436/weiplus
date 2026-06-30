package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65434d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65435e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f65436f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65438h;

    /* renamed from: i, reason: collision with root package name */
    public int f65439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65438h = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65437g = obj;
        this.f65439i |= Integer.MIN_VALUE;
        return this.f65438h.d(null, this);
    }
}
