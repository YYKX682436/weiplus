package com.tencent.maas.camstudio.frame;

/* loaded from: classes5.dex */
public interface TextureVideoFrame extends com.tencent.maas.camstudio.frame.VideoFrame {
    long getFenceSyncObj();

    int getTextureName();

    void release(long j17);
}
