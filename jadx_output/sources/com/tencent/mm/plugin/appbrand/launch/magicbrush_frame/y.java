package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f84321d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f84322e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f84323f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f84324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.z f84325h;

    /* renamed from: i, reason: collision with root package name */
    public int f84326i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f84325h = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f84324g = obj;
        this.f84326i |= Integer.MIN_VALUE;
        return this.f84325h.a(null, this);
    }
}
