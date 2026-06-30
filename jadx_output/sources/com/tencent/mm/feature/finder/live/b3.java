package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class b3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66619e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f66621g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f66622h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66623i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66624m;

    /* renamed from: n, reason: collision with root package name */
    public int f66625n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.feature.finder.live.v4 v4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66624m = v4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66623i = obj;
        this.f66625n |= Integer.MIN_VALUE;
        return this.f66624m.nj(null, null, this);
    }
}
