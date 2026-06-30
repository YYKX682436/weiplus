package com.tencent.cloud.aicamare.entity;

/* loaded from: classes14.dex */
public class CameraConfig {
    public boolean isSupportZoom = false;
    public boolean isBackCamera = false;
    public boolean isByteDataBuffer = true;
    public boolean isMainThread = false;
    public boolean isLand = false;
    public int preWidth = 1920;
    public int preHeight = 1080;
    public int minFps = 24;
    public int maxFps = 30;
    public boolean mustDiffMinAndMaxFps = false;
    public com.tencent.cloud.aicamare.enums.CameraZoom zoom = com.tencent.cloud.aicamare.enums.CameraZoom.ZOOM_1X;

    public int getMaxFps() {
        return this.maxFps;
    }

    public int getMinFps() {
        return this.minFps;
    }

    public int getPreHeight() {
        return this.preHeight;
    }

    public int getPreWidth() {
        return this.preWidth;
    }

    public com.tencent.cloud.aicamare.enums.CameraZoom getZoom() {
        return this.zoom;
    }

    public boolean isBackCamera() {
        return this.isBackCamera;
    }

    public boolean isByteDataBuffer() {
        return this.isByteDataBuffer;
    }

    public boolean isLand() {
        return this.isLand;
    }

    public boolean isMainThread() {
        return this.isMainThread;
    }

    public boolean isMustDiffMinAndMaxFps() {
        return this.mustDiffMinAndMaxFps;
    }

    public boolean isSupportZoom() {
        return this.isSupportZoom;
    }

    public void setBackCamera(boolean z17) {
        this.isBackCamera = z17;
    }

    public void setByteDataBuffer(boolean z17) {
        this.isByteDataBuffer = z17;
    }

    public void setLand(boolean z17) {
        this.isLand = z17;
    }

    public void setMainThread(boolean z17) {
        this.isMainThread = z17;
    }

    public void setMaxFps(int i17) {
        this.maxFps = i17;
    }

    public void setMinFps(int i17) {
        this.minFps = i17;
    }

    public void setMustDiffMinAndMaxFps(boolean z17) {
        this.mustDiffMinAndMaxFps = z17;
    }

    public void setPreHeight(int i17) {
        this.preHeight = i17;
    }

    public void setPreWidth(int i17) {
        this.preWidth = i17;
    }

    public void setSupportZoom(boolean z17) {
        this.isSupportZoom = z17;
    }

    public void setZoom(com.tencent.cloud.aicamare.enums.CameraZoom cameraZoom) {
        this.zoom = cameraZoom;
    }
}
