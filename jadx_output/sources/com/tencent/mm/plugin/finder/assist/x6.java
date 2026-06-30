package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class x6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102692f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f102693g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f102694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f102695i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f102696m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102697n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.n7 f102698o;

    /* renamed from: p, reason: collision with root package name */
    public int f102699p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.finder.assist.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102698o = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102697n = obj;
        this.f102699p |= Integer.MIN_VALUE;
        return this.f102698o.z(null, null, null, null, false, false, this);
    }
}
