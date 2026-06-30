package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.WearableStatusCodes */
/* loaded from: classes13.dex */
public final class C2477xcdece81b extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449 {

    /* renamed from: ASSET_UNAVAILABLE */
    public static final int f7528x16eb0541 = 4005;

    /* renamed from: DATA_ITEM_TOO_LARGE */
    public static final int f7529x7d0fa359 = 4003;

    /* renamed from: DUPLICATE_CAPABILITY */
    public static final int f7530xe5db58ec = 4006;

    /* renamed from: DUPLICATE_LISTENER */
    public static final int f7531x29a1e188 = 4001;

    /* renamed from: INVALID_TARGET_NODE */
    public static final int f7532x3a129d88 = 4004;

    /* renamed from: TARGET_NODE_NOT_CONNECTED */
    public static final int f7533xf671a24e = 4000;

    /* renamed from: UNKNOWN_CAPABILITY */
    public static final int f7534x97f3504d = 4007;

    /* renamed from: UNKNOWN_LISTENER */
    public static final int f7535xa623d29 = 4002;

    /* renamed from: WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED */
    public static final int f7536x419518a9 = 4008;

    private C2477xcdece81b() {
    }

    /* renamed from: getStatusCodeString */
    public static java.lang.String m19880x30a6166(int i17) {
        switch (i17) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case 4001:
                return "DUPLICATE_LISTENER";
            case 4002:
                return "UNKNOWN_LISTENER";
            case f7529x7d0fa359 /* 4003 */:
                return "DATA_ITEM_TOO_LARGE";
            case f7532x3a129d88 /* 4004 */:
                return "INVALID_TARGET_NODE";
            case f7528x16eb0541 /* 4005 */:
                return "ASSET_UNAVAILABLE";
            default:
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(i17);
        }
    }
}
