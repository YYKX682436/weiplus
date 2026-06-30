package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.f6 f107856d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.f6 f107857e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.f6 f107858f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.f6[] f107859g;

    static {
        com.tencent.mm.plugin.finder.feed.model.f6 f6Var = new com.tencent.mm.plugin.finder.feed.model.f6(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f107856d = f6Var;
        com.tencent.mm.plugin.finder.feed.model.f6 f6Var2 = new com.tencent.mm.plugin.finder.feed.model.f6("NO_CACHE", 1);
        f107857e = f6Var2;
        com.tencent.mm.plugin.finder.feed.model.f6 f6Var3 = new com.tencent.mm.plugin.finder.feed.model.f6("WITH_CACHED", 2);
        f107858f = f6Var3;
        com.tencent.mm.plugin.finder.feed.model.f6[] f6VarArr = {f6Var, f6Var2, f6Var3};
        f107859g = f6VarArr;
        rz5.b.a(f6VarArr);
    }

    public f6(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.f6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.f6) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.f6.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.f6[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.f6[]) f107859g.clone();
    }
}
