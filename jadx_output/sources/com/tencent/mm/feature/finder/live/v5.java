package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class v5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f67003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f67004e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f67005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f67006g;

    /* renamed from: h, reason: collision with root package name */
    public long f67007h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f67008i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f67009m;

    /* renamed from: n, reason: collision with root package name */
    public int f67010n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.feature.finder.live.z5 z5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f67009m = z5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f67008i = obj;
        this.f67010n |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.finder.live.z5.wi(this.f67009m, null, null, 0L, this);
    }
}
