package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class y6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102717d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102718e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102719f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f102720g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f102721h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f102722i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f102723m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102724n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.n7 f102725o;

    /* renamed from: p, reason: collision with root package name */
    public int f102726p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.finder.assist.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102725o = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102724n = obj;
        this.f102726p |= Integer.MIN_VALUE;
        return this.f102725o.A(null, null, null, null, false, false, this);
    }
}
