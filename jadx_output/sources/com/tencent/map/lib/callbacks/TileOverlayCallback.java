package com.tencent.map.lib.callbacks;

/* loaded from: classes13.dex */
public interface TileOverlayCallback {
    android.graphics.Bitmap onLoadTile(int i17, int i18, int i19, byte[] bArr);

    void onLoadTileFinish(int i17, int i18, int i19);

    void onWriteTile(int i17, int i18, int i19, java.lang.String str, byte[] bArr);
}
