package com.tencent.maas.camerafun;

/* loaded from: classes.dex */
public enum MJAudioDeviceType {
    Unknown(-1),
    LoudSpeaker(0),
    BlueTooth(1),
    HeadPhone(2);

    private final int value;

    MJAudioDeviceType(int i17) {
        this.value = i17;
    }

    public int getValue() {
        return this.value;
    }
}
