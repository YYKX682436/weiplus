package com.tencent.mm.plugin.finder.feed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rz {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.rz f108951d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.rz f108952e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.rz[] f108953f;

    static {
        com.tencent.mm.plugin.finder.feed.rz rzVar = new com.tencent.mm.plugin.finder.feed.rz(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        com.tencent.mm.plugin.finder.feed.rz rzVar2 = new com.tencent.mm.plugin.finder.feed.rz("LOADMORE", 1);
        f108951d = rzVar2;
        com.tencent.mm.plugin.finder.feed.rz rzVar3 = new com.tencent.mm.plugin.finder.feed.rz("REFRESH", 2);
        f108952e = rzVar3;
        com.tencent.mm.plugin.finder.feed.rz[] rzVarArr = {rzVar, rzVar2, rzVar3};
        f108953f = rzVarArr;
        rz5.b.a(rzVarArr);
    }

    public rz(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.rz valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.rz) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.rz.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.rz[] values() {
        return (com.tencent.mm.plugin.finder.feed.rz[]) f108953f.clone();
    }
}
