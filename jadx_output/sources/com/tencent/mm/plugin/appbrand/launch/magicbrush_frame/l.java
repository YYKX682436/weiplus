package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f84304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f84305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f84306f;

    /* renamed from: g, reason: collision with root package name */
    public int f84307g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f84308h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84309i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84309i = wAMagicBrushFrameLaunchParams;
        this.f84310m = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.l lVar = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.l(this.f84309i, this.f84310m, continuation);
        lVar.f84308h = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
