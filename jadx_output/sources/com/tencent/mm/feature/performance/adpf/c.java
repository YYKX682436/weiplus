package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public abstract class c {
    public static final java.lang.String a(int i17) {
        if (i17 == 0) {
            return com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
        }
        if (i17 == 1) {
            return "RED";
        }
        if (i17 == 2) {
            return "GREEN";
        }
        if (i17 == 3) {
            return "YELLOW";
        }
        throw new java.lang.IllegalStateException(("Unknown signal: " + i17).toString());
    }

    public static final java.lang.String b(int i17) {
        if (i17 == 0) {
            return com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
        }
        if (i17 == 1) {
            return "SUSPEND";
        }
        if (i17 == 2) {
            return "RESUME";
        }
        if (i17 == 3) {
            return "LOW_ENERGY";
        }
        throw new java.lang.IllegalStateException(("Unknown status: " + i17).toString());
    }
}
