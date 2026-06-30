package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class s6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f102533g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f102534h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102535i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.n7 f102536m;

    /* renamed from: n, reason: collision with root package name */
    public int f102537n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.plugin.finder.assist.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102536m = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102535i = obj;
        this.f102537n |= Integer.MIN_VALUE;
        return this.f102536m.w(null, null, this);
    }
}
