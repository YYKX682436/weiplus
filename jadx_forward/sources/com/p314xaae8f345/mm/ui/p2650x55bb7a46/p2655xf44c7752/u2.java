package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class u2 implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f283003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f283004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 f283006e;

    public u2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var, java.lang.String str, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f283006e = t2Var;
        this.f283002a = str;
        this.f283003b = i17;
        this.f283004c = taVar;
        this.f283005d = f9Var;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoadError */
    public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onImageLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(c1434xa197a886.f4423xa7c470f2), c1434xa197a886.f4424xb2d4efdc);
        rq5.b.a(c1434xa197a886.f4423xa7c470f2);
        java.lang.String str = this.f283002a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f283004c;
        int i17 = this.f283003b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f283006e;
        t2Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "tryLoadBitmap after big image load error, imgPath: %s", str);
            t2Var.I(taVar, false, true);
            t2Var.f282919h.b(taVar.C, str, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageGalleryHolderImage", e17, "tryLoadBitmap exception", new java.lang.Object[0]);
        }
        if (c1434xa197a886.f4423xa7c470f2 == 4) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.f282914r = false;
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoaded */
    public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f283004c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f283006e;
        if (bitmap != null && t2Var.f282919h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "onImageLoaded cache bitmap, cacheImagePath: %s", this.f283002a);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = t2Var.f282919h;
            int i17 = this.f283003b;
            if (i17 <= 0) {
                i17 = taVar.f282958c;
            }
            k3Var.d(i17, bitmap);
        }
        t2Var.I(taVar, true, false);
        if (t2Var.f282917f != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283005d;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b7) t2Var.f282917f).a(f9Var != null ? f9Var.m124847x74d37ac6() : 0L, f9Var != null ? f9Var.Q0() : "", taVar.D, this.f283002a, bitmap);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoadError */
    public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onPreviewLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(c1434xa197a886.f4423xa7c470f2), c1434xa197a886.f4424xb2d4efdc);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoaded */
    public void mo15808x3c79ee4e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "SubsamplingImageView onPreviewLoaded");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewReleased */
    public void mo15809x76d22946() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onReady */
    public void mo15810xb03baf04() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onTileLoadError */
    public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onTileLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(c1434xa197a886.f4423xa7c470f2), c1434xa197a886.f4424xb2d4efdc);
        this.f283006e.p(this.f283005d, this.f283004c, this.f283003b, 5);
    }
}
