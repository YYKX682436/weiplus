package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes15.dex */
public interface ImageRegionDecoder {
    android.graphics.Bitmap decodeRegion(android.graphics.Rect rect, int i17);

    android.graphics.Point init(android.content.Context context, android.net.Uri uri);

    boolean isReady();

    void recycle();
}
