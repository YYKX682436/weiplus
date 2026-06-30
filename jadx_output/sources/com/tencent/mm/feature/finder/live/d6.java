package com.tencent.mm.feature.finder.live;

/* loaded from: classes10.dex */
public final class d6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66670e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66672g;

    /* renamed from: h, reason: collision with root package name */
    public int f66673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.feature.finder.live.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66672g = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66671f = obj;
        this.f66673h |= Integer.MIN_VALUE;
        return this.f66672g.Ai(null, this);
    }
}
