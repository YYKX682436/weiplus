package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class yf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f111163d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f111164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f111165f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f111166g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f111167h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ag f111168i;

    /* renamed from: m, reason: collision with root package name */
    public int f111169m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(com.tencent.mm.plugin.finder.feed.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f111168i = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f111167h = obj;
        this.f111169m |= Integer.MIN_VALUE;
        return this.f111168i.b(null, null, this);
    }
}
