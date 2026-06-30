package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes14.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.ImageReader f257261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w f257262e;

    public u(android.media.ImageReader imageReader, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar) {
        this.f257261d = imageReader;
        this.f257262e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar;
        try {
            try {
                if (this.f257261d.getSurface().isValid()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar2 = this.f257262e;
                    rs0.g gVar = rs0.i.f480829a;
                    android.view.Surface surface = this.f257261d.getSurface();
                    com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f257262e.f257286b;
                    wVar2.f257300p = rs0.g.n(gVar, surface, null, 0, 0, c25779x3338e719 != null ? c25779x3338e719.m97628x77710645() : null, 14, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar3 = this.f257262e;
                    os0.g gVar2 = new os0.g(0, 0, 0, 0, 1, 15, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar4 = this.f257262e;
                    android.media.MediaFormat mediaFormat = wVar4.f257291g;
                    if (mediaFormat != null && mediaFormat.containsKey("color-range")) {
                        android.media.MediaFormat mediaFormat2 = wVar4.f257291g;
                        gVar2.V = mediaFormat2 != null && mediaFormat2.getInteger("color-range") == 1;
                        gVar2.x();
                    } else {
                        wVar4.D.w("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: do not containsKey KEY_COLOR_RANGE ");
                    }
                    android.media.MediaFormat mediaFormat3 = wVar4.f257291g;
                    if (mediaFormat3 != null && mediaFormat3.containsKey("color-standard")) {
                        android.media.MediaFormat mediaFormat4 = wVar4.f257291g;
                        gVar2.W = mediaFormat4 != null && mediaFormat4.getInteger("color-standard") == 1;
                        gVar2.x();
                    } else {
                        wVar4.D.w("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: do not containsKey KEY_COLOR_STANDARD ");
                    }
                    wVar4.D.i("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: trans is fullRange " + gVar2.V + ", is yuv709 " + gVar2.W, new java.lang.Object[0]);
                    wVar3.f257299o = gVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar5 = this.f257262e;
                    os0.g gVar3 = wVar5.f257299o;
                    if (gVar3 != null) {
                        gVar3.u(wVar5.f257302r, wVar5.f257303s);
                    }
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f257262e.D;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create rgb2yuvEGLEnvironment:");
                    sb6.append(this.f257262e.f257300p);
                    sb6.append(", shareEGLContext:");
                    com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e7192 = this.f257262e.f257286b;
                    sb6.append(c25779x3338e7192 != null ? c25779x3338e7192.m97628x77710645() : null);
                    c25799x4a77fd1.i("MicroMsg.CompositionSoftwareEncoder", sb6.toString(), new java.lang.Object[0]);
                } else {
                    this.f257262e.D.e("MicroMsg.CompositionSoftwareEncoder", "create rgb2yuvEGLEnvironment error surface invalid");
                }
                this.f257262e.f257298n = true;
                wVar = this.f257262e;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompositionSoftwareEncoder", e17, "configure imageReader render error", new java.lang.Object[0]);
                this.f257262e.f257298n = false;
                wVar = this.f257262e;
            }
            wVar.f257301q.open();
        } catch (java.lang.Throwable th6) {
            this.f257262e.f257301q.open();
            throw th6;
        }
    }
}
