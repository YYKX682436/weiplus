package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65474d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65475e;

    /* renamed from: f, reason: collision with root package name */
    public int f65476f;

    /* renamed from: g, reason: collision with root package name */
    public int f65477g;

    /* renamed from: h, reason: collision with root package name */
    public int f65478h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65479i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65480m;

    /* renamed from: n, reason: collision with root package name */
    public int f65481n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65480m = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65479i = obj;
        this.f65481n |= Integer.MIN_VALUE;
        return this.f65480m.f(this);
    }
}
