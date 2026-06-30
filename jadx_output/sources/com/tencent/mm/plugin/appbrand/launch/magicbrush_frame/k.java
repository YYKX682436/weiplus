package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f84295d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f84296e;

    /* renamed from: f, reason: collision with root package name */
    public int f84297f;

    /* renamed from: g, reason: collision with root package name */
    public int f84298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f84300i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, kotlinx.coroutines.f1 f1Var, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84299h = wAMagicBrushFrameLaunchParams;
        this.f84300i = f1Var;
        this.f84301m = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k(this.f84299h, this.f84300i, this.f84301m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
