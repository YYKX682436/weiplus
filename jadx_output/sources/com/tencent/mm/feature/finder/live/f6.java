package com.tencent.mm.feature.finder.live;

/* loaded from: classes10.dex */
public final class f6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66709d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66711f;

    /* renamed from: g, reason: collision with root package name */
    public int f66712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(com.tencent.mm.feature.finder.live.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66711f = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66710e = obj;
        this.f66712g |= Integer.MIN_VALUE;
        return this.f66711f.Bi(null, null, null, this);
    }
}
