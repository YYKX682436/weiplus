package bp5;

/* loaded from: classes14.dex */
public final class b implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp5.c f104983d;

    public b(bp5.c cVar) {
        this.f104983d = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            bp5.c cVar = this.f104983d;
            try {
                try {
                    try {
                        try {
                            android.media.Image.Plane plane = acquireLatestImage.getPlanes()[0];
                            if (plane != null && plane.getBuffer() != null) {
                                bp5.a aVar = cVar.f104984d;
                                java.nio.ByteBuffer buffer = plane.getBuffer();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buffer, "getBuffer(...)");
                                ((so5.x) aVar).a(buffer, imageReader.getWidth(), imageReader.getHeight(), plane.getRowStride(), 4);
                            }
                        } catch (java.util.NoSuchElementException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.ImageReaderWrapper", e17.getMessage());
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.ImageReaderWrapper", e18.getMessage());
                    }
                } catch (java.lang.IllegalStateException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.ImageReaderWrapper", e19.getMessage());
                }
            } finally {
                acquireLatestImage.close();
            }
        }
    }
}
