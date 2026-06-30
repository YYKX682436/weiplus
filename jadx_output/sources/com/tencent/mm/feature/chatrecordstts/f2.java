package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class f2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65422d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65423e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f65424f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f65425g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f65426h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65427i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65428m;

    /* renamed from: n, reason: collision with root package name */
    public int f65429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65428m = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65427i = obj;
        this.f65429n |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.chatrecordstts.k2.a(this.f65428m, null, this);
    }
}
