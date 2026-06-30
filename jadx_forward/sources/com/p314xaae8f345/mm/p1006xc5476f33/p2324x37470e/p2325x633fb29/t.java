package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes14.dex */
public final class t implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w f257254d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar) {
        this.f257254d = wVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireNextImage;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar = this.f257254d;
        synchronized (wVar.f257307w) {
            android.media.ImageReader imageReader2 = wVar.f257295k;
            if (imageReader2 != null && (acquireNextImage = imageReader2.acquireNextImage()) != null) {
                try {
                    try {
                        wVar.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                        int width = acquireNextImage.getWidth();
                        int height = acquireNextImage.getHeight();
                        android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(plane, "get(...)");
                        wVar.e(width, height, plane, acquireNextImage.getTimestamp());
                        wVar.f257310z = wVar.f257310z + 1;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompositionSoftwareEncoder", e17, "acquireNextImage error", new java.lang.Object[0]);
                    }
                    acquireNextImage.close();
                } catch (java.lang.Throwable th6) {
                    acquireNextImage.close();
                    throw th6;
                }
            }
        }
        this.f257254d.f257308x.release();
    }
}
