package com.tencent.mm.feature.finder.live;

/* loaded from: classes10.dex */
public final class m6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66829e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66831g;

    /* renamed from: h, reason: collision with root package name */
    public int f66832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.feature.finder.live.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66831g = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66830f = obj;
        this.f66832h |= Integer.MIN_VALUE;
        return this.f66831g.Zi(null, null, this);
    }
}
