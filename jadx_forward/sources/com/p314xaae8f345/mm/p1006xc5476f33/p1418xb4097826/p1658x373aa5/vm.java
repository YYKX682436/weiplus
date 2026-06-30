package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes14.dex */
public final class vm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm f214790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f214791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f214792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214793g;

    public vm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar, android.graphics.SurfaceTexture surfaceTexture, yz5.l lVar, yz5.a aVar) {
        this.f214790d = xmVar;
        this.f214791e = surfaceTexture;
        this.f214792f = lVar;
        this.f214793g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.media.MediaCodec mediaCodec;
        android.media.MediaFormat mediaFormat;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar = this.f214790d;
        if (xmVar.f214879g != null) {
            xmVar.d();
        }
        java.lang.String concat = "[createDecoder] before create, mime:".concat(xmVar.c());
        java.lang.String str = xmVar.f214875c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, concat);
        try {
            mediaCodec = android.media.MediaCodec.createDecoderByType(xmVar.c());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, java.lang.String.valueOf(e17.getMessage()));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xmVar.c(), "video/dolby-vision") && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.E).mo141623x754a37bb()).r()).booleanValue()) {
                xmVar.f214881i = "video/hevc";
                mediaCodec = android.media.MediaCodec.createDecoderByType(xmVar.c());
            } else {
                mediaCodec = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[createDecoder] after create, mime:".concat(xmVar.c()));
        xmVar.f214879g = mediaCodec;
        xmVar.f214888p = false;
        if (mediaCodec != null) {
            android.graphics.SurfaceTexture surfaceTexture = this.f214791e;
            mediaCodec.setCallback(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tm(xmVar, this.f214792f));
            try {
                mediaFormat = xmVar.f214880h;
            } catch (java.lang.Exception e18) {
                android.media.MediaFormat mediaFormat2 = xmVar.f214880h;
                if (mediaFormat2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaFormat");
                    throw null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, mediaFormat2.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "configure", new java.lang.Object[0]);
            }
            if (mediaFormat == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaFormat");
                throw null;
            }
            mediaCodec.configure(mediaFormat, new android.view.Surface(surfaceTexture), (android.media.MediaCrypto) null, 0);
            xmVar.f214874b.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.um(this.f214793g));
        }
    }
}
