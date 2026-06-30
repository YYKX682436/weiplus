package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c7 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c7 f107752d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c7 f107753e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c7 f107754f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c7[] f107755g;

    static {
        com.tencent.mm.plugin.finder.feed.model.c7 c7Var = new com.tencent.mm.plugin.finder.feed.model.c7(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f107752d = c7Var;
        com.tencent.mm.plugin.finder.feed.model.c7 c7Var2 = new com.tencent.mm.plugin.finder.feed.model.c7("NO_CACHE", 1);
        f107753e = c7Var2;
        com.tencent.mm.plugin.finder.feed.model.c7 c7Var3 = new com.tencent.mm.plugin.finder.feed.model.c7("WITH_CACHED", 2);
        f107754f = c7Var3;
        com.tencent.mm.plugin.finder.feed.model.c7[] c7VarArr = {c7Var, c7Var2, c7Var3};
        f107755g = c7VarArr;
        rz5.b.a(c7VarArr);
    }

    public c7(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.c7 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.c7) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.c7.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.c7[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.c7[]) f107755g.clone();
    }
}
