package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dg extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f106559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f106560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f106561f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f106562g;

    /* renamed from: h, reason: collision with root package name */
    public long f106563h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f106564i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fg f106565m;

    /* renamed from: n, reason: collision with root package name */
    public int f106566n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(com.tencent.mm.plugin.finder.feed.fg fgVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f106565m = fgVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f106564i = obj;
        this.f106566n |= Integer.MIN_VALUE;
        return this.f106565m.Q6(0L, null, 0L, null, null, this);
    }
}
