package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public enum MJAIGCCancelReason {
    Default(0),
    UserAbandon(1),
    RemindLater(2);

    private final int value;

    MJAIGCCancelReason(int i17) {
        this.value = i17;
    }

    public static com.tencent.maas.camstudio.MJAIGCCancelReason fromValue(int i17) {
        for (com.tencent.maas.camstudio.MJAIGCCancelReason mJAIGCCancelReason : values()) {
            if (mJAIGCCancelReason.value == i17) {
                return mJAIGCCancelReason;
            }
        }
        return Default;
    }

    public int getValue() {
        return this.value;
    }
}
