package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJCaptureOptions {
    private final boolean isAudioEnabled;
    private final boolean isChangeBackgroundImageEnabled;
    private final boolean isUseFrontCamera;
    private final com.tencent.maas.model.time.MJTime maxRecordingDuration;

    public MJCaptureOptions(boolean z17, boolean z18, boolean z19, com.tencent.maas.model.time.MJTime mJTime) {
        this.isUseFrontCamera = z17;
        this.isAudioEnabled = z18;
        this.isChangeBackgroundImageEnabled = z19;
        this.maxRecordingDuration = mJTime;
    }

    public com.tencent.maas.model.time.MJTime getMaxRecordingDuration() {
        return this.maxRecordingDuration;
    }

    public boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public boolean isChangeBackgroundImageEnabled() {
        return this.isChangeBackgroundImageEnabled;
    }

    public boolean isUseFrontCamera() {
        return this.isUseFrontCamera;
    }
}
