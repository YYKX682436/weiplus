package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f84266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84267e;

    /* renamed from: f, reason: collision with root package name */
    public int f84268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f84267e = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f84266d = obj;
        this.f84268f |= Integer.MIN_VALUE;
        return this.f84267e.b(null, this);
    }
}
