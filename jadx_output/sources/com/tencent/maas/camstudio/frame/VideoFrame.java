package com.tencent.maas.camstudio.frame;

/* loaded from: classes5.dex */
public interface VideoFrame extends com.tencent.maas.camstudio.frame.Frame {
    int accessibility();

    int getFrameCWAngle();

    int getHeight();

    int getWidth();

    boolean isMirrored();

    void release();
}
