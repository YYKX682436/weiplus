package com.tencent.liteav.videobase.frame;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class FrameMetaData {
    private final com.tencent.liteav.videobase.frame.MirrorInfo mEncodeMirror;
    private com.tencent.liteav.base.util.k mEncodeRotation;
    private final com.tencent.liteav.base.util.Size mEncodeSize;
    private com.tencent.liteav.base.util.k mPreprocessorRotation;
    private com.tencent.liteav.videobase.base.GLConstants.GLScaleType mPreprocessorScaleType;
    private final com.tencent.liteav.videobase.frame.MirrorInfo mRenderMirror;
    private com.tencent.liteav.base.util.k mRenderRotation;
    private final com.tencent.liteav.base.util.Size mRenderSize;
    private final com.tencent.liteav.videobase.frame.MirrorInfo mCaptureMirror = new com.tencent.liteav.videobase.frame.MirrorInfo();
    private boolean mIsFrontCamera = false;
    private final com.tencent.liteav.base.util.Size mCaptureRealFrameSize = new com.tencent.liteav.base.util.Size();
    private boolean mIsBlackFrame = false;
    private final com.tencent.liteav.videobase.frame.MirrorInfo mPreprocessorMirror = new com.tencent.liteav.videobase.frame.MirrorInfo();

    public FrameMetaData() {
        com.tencent.liteav.base.util.k kVar = com.tencent.liteav.base.util.k.NORMAL;
        this.mPreprocessorRotation = kVar;
        this.mPreprocessorScaleType = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP;
        this.mRenderMirror = new com.tencent.liteav.videobase.frame.MirrorInfo();
        this.mRenderRotation = kVar;
        this.mRenderSize = new com.tencent.liteav.base.util.Size();
        this.mEncodeMirror = new com.tencent.liteav.videobase.frame.MirrorInfo();
        this.mEncodeRotation = kVar;
        this.mEncodeSize = new com.tencent.liteav.base.util.Size();
    }

    public com.tencent.liteav.base.util.Size getCaptureRealSize() {
        return this.mCaptureRealFrameSize;
    }

    public int getEncodeHeight() {
        return this.mEncodeSize.height;
    }

    public com.tencent.liteav.base.util.k getEncodeRotation() {
        return this.mEncodeRotation;
    }

    public int getEncodeRotationValue() {
        return this.mEncodeRotation.mValue;
    }

    public com.tencent.liteav.base.util.Size getEncodeSize() {
        return this.mEncodeSize;
    }

    public int getEncodeWidth() {
        return this.mEncodeSize.width;
    }

    public com.tencent.liteav.base.util.k getPreprocessorRotation() {
        return this.mPreprocessorRotation;
    }

    public int getPreprocessorRotationValue() {
        return this.mPreprocessorRotation.mValue;
    }

    public com.tencent.liteav.videobase.base.GLConstants.GLScaleType getPreprocessorScaleType() {
        return this.mPreprocessorScaleType;
    }

    public int getPreprocessorScaleTypeValue() {
        return this.mPreprocessorScaleType.mValue;
    }

    public int getRenderHeight() {
        return this.mRenderSize.height;
    }

    public com.tencent.liteav.base.util.k getRenderRotation() {
        return this.mRenderRotation;
    }

    public int getRenderRotationValue() {
        return this.mRenderRotation.mValue;
    }

    public com.tencent.liteav.base.util.Size getRenderSize() {
        return this.mRenderSize;
    }

    public int getRenderWidth() {
        return this.mRenderSize.width;
    }

    public boolean isBlackFrame() {
        return this.mIsBlackFrame;
    }

    public boolean isCaptureMirrorHorizontal() {
        return this.mCaptureMirror.isHorizontal;
    }

    public boolean isCaptureMirrorVertical() {
        return this.mCaptureMirror.isVertical;
    }

    public boolean isEncodeMirrorHorizontal() {
        return this.mEncodeMirror.isHorizontal;
    }

    public boolean isEncodeMirrorVertical() {
        return this.mEncodeMirror.isVertical;
    }

    public boolean isFrontCamera() {
        return this.mIsFrontCamera;
    }

    public boolean isPreprocessorMirrorHorizontal() {
        return this.mPreprocessorMirror.isHorizontal;
    }

    public boolean isPreprocessorMirrorVertical() {
        return this.mPreprocessorMirror.isVertical;
    }

    public boolean isRenderMirrorHorizontal() {
        return this.mRenderMirror.isHorizontal;
    }

    public boolean isRenderMirrorVertical() {
        return this.mRenderMirror.isVertical;
    }

    public void setCaptureMetaData(boolean z17, boolean z18, boolean z19, int i17, int i18) {
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo = this.mCaptureMirror;
        mirrorInfo.isHorizontal = z17;
        mirrorInfo.isVertical = z18;
        this.mIsFrontCamera = z19;
        com.tencent.liteav.base.util.Size size = this.mCaptureRealFrameSize;
        size.width = i17;
        size.height = i18;
    }

    public void setEncodeMetaData(boolean z17, boolean z18, int i17, int i18, int i19) {
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo = this.mEncodeMirror;
        mirrorInfo.isHorizontal = z17;
        mirrorInfo.isVertical = z18;
        this.mEncodeRotation = com.tencent.liteav.base.util.k.a(i17);
        com.tencent.liteav.base.util.Size size = this.mEncodeSize;
        size.width = i18;
        size.height = i19;
    }

    public void setEncodeMirror(com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo2 = this.mEncodeMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setEncodeRotation(com.tencent.liteav.base.util.k kVar) {
        if (kVar == null) {
            return;
        }
        this.mEncodeRotation = kVar;
    }

    public void setEncodeSize(com.tencent.liteav.base.util.Size size) {
        this.mEncodeSize.set(size);
    }

    public void setIsBlackFrame(boolean z17) {
        this.mIsBlackFrame = z17;
    }

    public void setPreprocessorMetaData(boolean z17, boolean z18, int i17, int i18) {
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo = this.mPreprocessorMirror;
        mirrorInfo.isHorizontal = z17;
        mirrorInfo.isVertical = z18;
        this.mPreprocessorRotation = com.tencent.liteav.base.util.k.a(i17);
        this.mPreprocessorScaleType = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.a(i18);
    }

    public void setPreprocessorMirror(com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo2 = this.mPreprocessorMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setPreprocessorRotation(com.tencent.liteav.base.util.k kVar) {
        if (kVar == null) {
            return;
        }
        this.mPreprocessorRotation = kVar;
    }

    public void setPreprocessorScaleType(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType) {
        if (gLScaleType == null) {
            return;
        }
        this.mPreprocessorScaleType = gLScaleType;
    }

    public void setRenderMetaData(boolean z17, boolean z18, int i17, int i18, int i19) {
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo = this.mRenderMirror;
        mirrorInfo.isHorizontal = z17;
        mirrorInfo.isVertical = z18;
        this.mRenderRotation = com.tencent.liteav.base.util.k.a(i17);
        com.tencent.liteav.base.util.Size size = this.mRenderSize;
        size.width = i18;
        size.height = i19;
    }

    public void setRenderMirror(com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        com.tencent.liteav.videobase.frame.MirrorInfo mirrorInfo2 = this.mRenderMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setRenderRotation(com.tencent.liteav.base.util.k kVar) {
        if (kVar == null) {
            return;
        }
        this.mRenderRotation = kVar;
    }

    public void setRenderSize(com.tencent.liteav.base.util.Size size) {
        this.mRenderSize.set(size);
    }
}
