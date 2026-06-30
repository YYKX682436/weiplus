package com.tencent.mm.feature.finder.live;

/* loaded from: classes10.dex */
public final class i6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66772d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66773e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66774f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66776h;

    /* renamed from: i, reason: collision with root package name */
    public int f66777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.feature.finder.live.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66776h = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66775g = obj;
        this.f66777i |= Integer.MIN_VALUE;
        return this.f66776h.Ni(null, 0, null, 0L, this);
    }
}
