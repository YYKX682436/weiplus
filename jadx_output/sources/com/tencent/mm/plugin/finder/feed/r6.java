package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class r6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f108890d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f108891e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f108892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108893g;

    /* renamed from: h, reason: collision with root package name */
    public int f108894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.finder.feed.a7 a7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f108893g = a7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f108892f = obj;
        this.f108894h |= Integer.MIN_VALUE;
        return this.f108893g.J0(null, this);
    }
}
