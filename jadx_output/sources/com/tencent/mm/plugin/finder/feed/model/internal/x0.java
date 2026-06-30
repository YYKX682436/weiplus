package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class x0 {
    public x0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(int i17) {
        switch (i17) {
            case 1:
                return "ADD_LOADMORE";
            case 2:
                return "ADD_REFRESH";
            case 3:
                return com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
            case 4:
                return "CLEAN_REFRESH";
            case 5:
                return "LOADMORE_THAT_ALL";
            case 6:
                return "REFRESH_THAT_ALL";
            case 7:
            case 9:
            default:
                return java.lang.String.valueOf(i17);
            case 8:
                return "INSERT";
            case 10:
                return "REFRESH_LEAVE_HISTORY";
            case 11:
                return "REFRESH_KEEP_LAST";
            case 12:
                return "INSERT_REFRESH";
            case 13:
                return "REFRESH_KEEP_FIRST_ITEM";
            case 14:
                return "LOADMORE_TO_TOP";
            case 15:
                return "LOADMORE_SLIDE_UP";
        }
    }
}
