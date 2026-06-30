package com.tencent.liteav.videobase.frame;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class MirrorInfo {
    public boolean isHorizontal;
    public boolean isVertical;

    public MirrorInfo() {
        this.isHorizontal = false;
        this.isVertical = false;
    }

    public MirrorInfo(boolean z17, boolean z18) {
        this.isHorizontal = z17;
        this.isVertical = z18;
    }
}
