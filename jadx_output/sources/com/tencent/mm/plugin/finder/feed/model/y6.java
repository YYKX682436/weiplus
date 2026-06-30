package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.y6 f108479d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.y6 f108480e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.y6 f108481f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.y6[] f108482g;

    static {
        com.tencent.mm.plugin.finder.feed.model.y6 y6Var = new com.tencent.mm.plugin.finder.feed.model.y6(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f108479d = y6Var;
        com.tencent.mm.plugin.finder.feed.model.y6 y6Var2 = new com.tencent.mm.plugin.finder.feed.model.y6("NO_CACHE", 1);
        f108480e = y6Var2;
        com.tencent.mm.plugin.finder.feed.model.y6 y6Var3 = new com.tencent.mm.plugin.finder.feed.model.y6("WITH_CACHED", 2);
        f108481f = y6Var3;
        com.tencent.mm.plugin.finder.feed.model.y6[] y6VarArr = {y6Var, y6Var2, y6Var3};
        f108482g = y6VarArr;
        rz5.b.a(y6VarArr);
    }

    public y6(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.y6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.y6) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.y6.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.y6[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.y6[]) f108482g.clone();
    }
}
