package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c1 f107742d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c1 f107743e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c1 f107744f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.c1 f107745g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c1[] f107746h;

    static {
        com.tencent.mm.plugin.finder.feed.model.c1 c1Var = new com.tencent.mm.plugin.finder.feed.model.c1(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f107742d = c1Var;
        com.tencent.mm.plugin.finder.feed.model.c1 c1Var2 = new com.tencent.mm.plugin.finder.feed.model.c1("LOADING", 1);
        f107743e = c1Var2;
        com.tencent.mm.plugin.finder.feed.model.c1 c1Var3 = new com.tencent.mm.plugin.finder.feed.model.c1("LOADED", 2);
        f107744f = c1Var3;
        com.tencent.mm.plugin.finder.feed.model.c1 c1Var4 = new com.tencent.mm.plugin.finder.feed.model.c1("FAILURE", 3);
        f107745g = c1Var4;
        com.tencent.mm.plugin.finder.feed.model.c1[] c1VarArr = {c1Var, c1Var2, c1Var3, c1Var4};
        f107746h = c1VarArr;
        rz5.b.a(c1VarArr);
    }

    public c1(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.c1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.c1) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.c1.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.c1[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.c1[]) f107746h.clone();
    }
}
