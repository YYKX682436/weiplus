package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class r6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102508d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f102509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.n7 f102510f;

    /* renamed from: g, reason: collision with root package name */
    public int f102511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.finder.assist.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f102510f = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f102509e = obj;
        this.f102511g |= Integer.MIN_VALUE;
        return this.f102510f.v(null, null, this);
    }
}
