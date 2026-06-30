package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.p0 f108237d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.p0 f108238e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.p0 f108239f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.p0[] f108240g;

    static {
        com.tencent.mm.plugin.finder.feed.model.p0 p0Var = new com.tencent.mm.plugin.finder.feed.model.p0(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f108237d = p0Var;
        com.tencent.mm.plugin.finder.feed.model.p0 p0Var2 = new com.tencent.mm.plugin.finder.feed.model.p0("NO_CACHE", 1);
        f108238e = p0Var2;
        com.tencent.mm.plugin.finder.feed.model.p0 p0Var3 = new com.tencent.mm.plugin.finder.feed.model.p0("WITH_CACHED", 2);
        f108239f = p0Var3;
        com.tencent.mm.plugin.finder.feed.model.p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f108240g = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.p0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.p0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.p0.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.p0[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.p0[]) f108240g.clone();
    }
}
