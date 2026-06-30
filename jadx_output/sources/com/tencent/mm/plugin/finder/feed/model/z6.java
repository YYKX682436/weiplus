package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z6 f108511d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z6 f108512e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z6 f108513f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z6 f108514g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.z6[] f108515h;

    static {
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var = new com.tencent.mm.plugin.finder.feed.model.z6(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f108511d = z6Var;
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var2 = new com.tencent.mm.plugin.finder.feed.model.z6("LOADING", 1);
        f108512e = z6Var2;
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var3 = new com.tencent.mm.plugin.finder.feed.model.z6("LOADED", 2);
        f108513f = z6Var3;
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var4 = new com.tencent.mm.plugin.finder.feed.model.z6("FAILURE", 3);
        f108514g = z6Var4;
        com.tencent.mm.plugin.finder.feed.model.z6[] z6VarArr = {z6Var, z6Var2, z6Var3, z6Var4, new com.tencent.mm.plugin.finder.feed.model.z6("PRIVATE_LOCK", 4)};
        f108515h = z6VarArr;
        rz5.b.a(z6VarArr);
    }

    public z6(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.z6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.z6) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.z6.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.z6[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.z6[]) f108515h.clone();
    }
}
