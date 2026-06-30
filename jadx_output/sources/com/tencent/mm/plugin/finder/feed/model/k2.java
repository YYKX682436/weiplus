package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.k2[] f108112d;

    static {
        com.tencent.mm.plugin.finder.feed.model.k2[] k2VarArr = {new com.tencent.mm.plugin.finder.feed.model.k2(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0), new com.tencent.mm.plugin.finder.feed.model.k2("LOADING", 1), new com.tencent.mm.plugin.finder.feed.model.k2("LOADED", 2), new com.tencent.mm.plugin.finder.feed.model.k2("FAILURE", 3)};
        f108112d = k2VarArr;
        rz5.b.a(k2VarArr);
    }

    public k2(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.k2 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.k2) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.k2.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.k2[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.k2[]) f108112d.clone();
    }
}
