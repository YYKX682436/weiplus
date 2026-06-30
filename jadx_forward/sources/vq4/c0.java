package vq4;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vq4.c0 f520814a = new vq4.c0();

    public final java.nio.ByteBuffer a(android.media.Image image) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        android.graphics.Rect cropRect = image.getCropRect();
        int width = cropRect.width();
        int height = cropRect.height();
        android.media.Image.Plane[] planes = image.getPlanes();
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(width * height * 4).order(java.nio.ByteOrder.nativeOrder());
        java.nio.ByteBuffer buffer = planes[0].getBuffer();
        int rowStride = planes[0].getRowStride();
        buffer.position((rowStride * 4 * cropRect.top) + (planes[0].getPixelStride() * cropRect.left));
        int i17 = width * 4;
        if (planes[0].getRowStride() == i17) {
            order.put(buffer);
        } else {
            int i18 = 0;
            for (int i19 = 0; i19 < height; i19++) {
                buffer.asReadOnlyBuffer().get(order.array(), i19 * width * 4, i17);
                i18 += rowStride;
                if (i19 < height - 1) {
                    if (i18 <= buffer.capacity()) {
                        buffer.position(i18);
                    } else {
                        buffer.position(buffer.capacity());
                    }
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(order);
        return order;
    }
}
