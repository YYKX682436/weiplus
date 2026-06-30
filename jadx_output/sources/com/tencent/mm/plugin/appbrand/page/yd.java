package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class yd extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f87297d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f87298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87299f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f87300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.fe f87301h;

    /* renamed from: i, reason: collision with root package name */
    public int f87302i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(com.tencent.mm.plugin.appbrand.page.fe feVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f87301h = feVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f87300g = obj;
        this.f87302i |= Integer.MIN_VALUE;
        return this.f87301h.a(0L, null, false, this);
    }
}
