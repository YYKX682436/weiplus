package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class be extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86446d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f86447e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86448f;

    /* renamed from: g, reason: collision with root package name */
    public long f86449g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86450h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.fe f86451i;

    /* renamed from: m, reason: collision with root package name */
    public int f86452m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(com.tencent.mm.plugin.appbrand.page.fe feVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f86451i = feVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f86450h = obj;
        this.f86452m |= Integer.MIN_VALUE;
        return this.f86451i.b(null, null, false, this);
    }
}
