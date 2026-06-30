package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCCancelInfo {
    public final com.tencent.maas.camstudio.MJAIGCCancelReason cancelReason;

    public MJAIGCCancelInfo(int i17) {
        this.cancelReason = com.tencent.maas.camstudio.MJAIGCCancelReason.fromValue(i17);
    }

    public MJAIGCCancelInfo(com.tencent.maas.camstudio.MJAIGCCancelReason mJAIGCCancelReason) {
        this.cancelReason = mJAIGCCancelReason;
    }
}
