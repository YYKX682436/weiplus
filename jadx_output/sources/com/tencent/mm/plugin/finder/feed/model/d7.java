package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d7 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.d7 f107802d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.d7 f107803e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.d7 f107804f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.d7 f107805g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.d7[] f107806h;

    static {
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var = new com.tencent.mm.plugin.finder.feed.model.d7(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f107802d = d7Var;
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var2 = new com.tencent.mm.plugin.finder.feed.model.d7("LOADING", 1);
        f107803e = d7Var2;
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var3 = new com.tencent.mm.plugin.finder.feed.model.d7("LOADED", 2);
        f107804f = d7Var3;
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var4 = new com.tencent.mm.plugin.finder.feed.model.d7("FAILURE", 3);
        f107805g = d7Var4;
        com.tencent.mm.plugin.finder.feed.model.d7[] d7VarArr = {d7Var, d7Var2, d7Var3, d7Var4, new com.tencent.mm.plugin.finder.feed.model.d7("PRIVATE_LOCK", 4)};
        f107806h = d7VarArr;
        rz5.b.a(d7VarArr);
    }

    public d7(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.d7 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.d7) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.d7.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.d7[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.d7[]) f107806h.clone();
    }
}
