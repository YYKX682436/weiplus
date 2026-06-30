package com.tencent.mm.plugin.finder.feed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dp {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.dp f106580d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.dp f106581e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.dp f106582f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.dp[] f106583g;

    static {
        com.tencent.mm.plugin.finder.feed.dp dpVar = new com.tencent.mm.plugin.finder.feed.dp(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f106580d = dpVar;
        com.tencent.mm.plugin.finder.feed.dp dpVar2 = new com.tencent.mm.plugin.finder.feed.dp("LOADING", 1);
        com.tencent.mm.plugin.finder.feed.dp dpVar3 = new com.tencent.mm.plugin.finder.feed.dp("LOADED", 2);
        f106581e = dpVar3;
        com.tencent.mm.plugin.finder.feed.dp dpVar4 = new com.tencent.mm.plugin.finder.feed.dp("FAILURE", 3);
        f106582f = dpVar4;
        com.tencent.mm.plugin.finder.feed.dp[] dpVarArr = {dpVar, dpVar2, dpVar3, dpVar4, new com.tencent.mm.plugin.finder.feed.dp("PRIVATE_LOCK", 4)};
        f106583g = dpVarArr;
        rz5.b.a(dpVarArr);
    }

    public dp(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.dp valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.dp) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.dp.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.dp[] values() {
        return (com.tencent.mm.plugin.finder.feed.dp[]) f106583g.clone();
    }
}
