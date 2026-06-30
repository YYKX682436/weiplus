package gs0;

/* loaded from: classes14.dex */
public final class u implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f356557d;

    public u(gs0.w wVar) {
        this.f356557d = wVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            gs0.w wVar = this.f356557d;
            try {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                    int width = acquireNextImage.getWidth();
                    int height = acquireNextImage.getHeight();
                    android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(plane, "get(...)");
                    gs0.w.a(wVar, width, height, plane);
                    wVar.f356578o = wVar.f356578o + 1;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("end processImageYUVBufferToWriteYUVData, writeYuvCount:");
                    sb6.append(wVar.f356578o);
                    sb6.append(", renderYuvCount:");
                    sb6.append(wVar.f356577n);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", sb6.toString());
                    acquireNextImage.close();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X264TransImageReaderEncoder", e17, "acquireNextImage error", new java.lang.Object[0]);
                    acquireNextImage.close();
                }
                wVar.f356579p.release();
            } catch (java.lang.Throwable th6) {
                acquireNextImage.close();
                wVar.f356579p.release();
                throw th6;
            }
        }
    }
}
