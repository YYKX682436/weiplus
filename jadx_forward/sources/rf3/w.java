package rf3;

/* loaded from: classes12.dex */
public final class w implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 f476543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf3.g f476545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf3.g f476546d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4, java.lang.String str, sf3.g gVar, sf3.g gVar2) {
        this.f476543a = c16491xb6370bb4;
        this.f476544b = str;
        this.f476545c = gVar;
        this.f476546d = gVar2;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoadError */
    public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 result) {
        sf3.g gVar = this.f476545c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.f4423xa7c470f2);
        java.lang.String errMsg = result.f4424xb2d4efdc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = this.f476543a;
        c16491xb6370bb4.h("onImageLoadError errCode: %d, errMsg: %s", objArr);
        rq5.b.a(result.f4423xa7c470f2);
        try {
            c16491xb6370bb4.i("tryLoadBitmap after big image load error, default imgPath: " + gVar.c(), new java.lang.Object[0]);
            sf3.d dVar = c16491xb6370bb4.innerLoader;
            if (dVar != null) {
                dVar.b(gVar, new rf3.x(c16491xb6370bb4));
            }
        } catch (java.lang.Exception e17) {
            c16491xb6370bb4.h("tryLoadBitmap exception", e17);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoaded */
    public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        java.lang.Object[] objArr = {this.f476544b};
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = this.f476543a;
        c16491xb6370bb4.i("onImageLoaded cache bitmap, cacheImagePath: %s", objArr);
        c16491xb6370bb4.j(true, false);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoadError */
    public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.f4423xa7c470f2);
        java.lang.String errMsg = result.f4424xb2d4efdc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        this.f476543a.h("onPreviewLoadError errCode: %d, errMsg: %s", objArr);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoaded */
    public void mo15808x3c79ee4e() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        this.f476543a.i("onPreviewLoaded", new java.lang.Object[0]);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewReleased */
    public void mo15809x76d22946() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onReady */
    public void mo15810xb03baf04() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = this.f476543a;
        c16491xb6370bb4.i("onReady", new java.lang.Object[0]);
        c16491xb6370bb4.j(true, false);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onTileLoadError */
    public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.f4423xa7c470f2);
        java.lang.String errMsg = result.f4424xb2d4efdc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = this.f476543a;
        c16491xb6370bb4.h("onTileLoadError errCode: %d, errMsg: %s", objArr);
        rf3.v vVar = c16491xb6370bb4.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (vVar != null) {
            vVar.z(this.f476546d);
        }
    }
}
