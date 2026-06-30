package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class z5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102752f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f102753g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f102754h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102755i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.n7 f102756m;

    /* renamed from: n, reason: collision with root package name */
    public int f102757n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.finder.assist.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102756m = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102755i = obj;
        this.f102757n |= Integer.MIN_VALUE;
        return this.f102756m.b(null, null, null, null, false, false, this);
    }
}
