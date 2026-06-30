package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f75732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f75733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f75734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f75735g;

    /* renamed from: h, reason: collision with root package name */
    public int f75736h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.d f75737i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75738m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.o f75739n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.appcache.predownload.d dVar, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f75737i = dVar;
        this.f75738m = str;
        this.f75739n = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.appcache.predownload.a(this.f75737i, this.f75738m, this.f75739n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.appcache.predownload.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0099 -> B:5:0x00a1). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.predownload.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
