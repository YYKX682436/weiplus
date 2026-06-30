package nt3;

/* loaded from: classes13.dex */
public final class g implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.k f421321d;

    public g(nt3.k kVar) {
        this.f421321d = kVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(android.media.ImageReader imageReader) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageReader);
        android.media.Image acquireNextImage = imageReader.acquireNextImage();
        android.media.Image.Plane[] planes = acquireNextImage.getPlanes();
        int width = acquireNextImage.getWidth();
        int height = acquireNextImage.getHeight();
        int rowStride = planes[0].getRowStride() - (planes[0].getPixelStride() * width);
        java.nio.ByteBuffer buffer = planes[0].getBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buffer, "getBuffer(...)");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        nt3.k kVar = this.f421321d;
        int i18 = kVar.f421327y;
        if (i18 > 0 && (i17 = kVar.f421328z) > 0 && kVar.f421325J == null) {
            kVar.f421325J = java.nio.ByteBuffer.allocateDirect(i18 * i17 * 4);
        }
        java.nio.ByteBuffer byteBuffer = kVar.f421325J;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer);
        byteBuffer.clear();
        java.nio.ByteBuffer byteBuffer2 = kVar.f421325J;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer2);
        byteBuffer2.order(buffer.order());
        int i19 = 0;
        for (int i27 = 0; i27 < height; i27++) {
            int i28 = (i27 * rowStride) + i19;
            int i29 = width * 4;
            buffer.limit(i28 + i29);
            buffer.position(i28);
            java.nio.ByteBuffer byteBuffer3 = kVar.f421325J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer3);
            byteBuffer3.put(buffer);
            i19 += i29;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecFakeDecoder", "copyToByteArray cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        acquireNextImage.close();
        yz5.p pVar = kVar.I;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, kVar.f421325J);
        }
    }
}
