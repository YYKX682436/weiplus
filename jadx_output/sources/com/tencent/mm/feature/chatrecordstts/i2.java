package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class i2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65460e;

    /* renamed from: f, reason: collision with root package name */
    public int f65461f;

    /* renamed from: g, reason: collision with root package name */
    public int f65462g;

    /* renamed from: h, reason: collision with root package name */
    public int f65463h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65464i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65465m;

    /* renamed from: n, reason: collision with root package name */
    public int f65466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65465m = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65464i = obj;
        this.f65466n |= Integer.MIN_VALUE;
        return this.f65465m.e(this);
    }
}
