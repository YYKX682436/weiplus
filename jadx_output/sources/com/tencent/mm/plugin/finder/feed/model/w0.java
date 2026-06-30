package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.w0 f108419d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.w0 f108420e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.w0 f108421f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.w0 f108422g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.w0[] f108423h;

    static {
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var = new com.tencent.mm.plugin.finder.feed.model.w0(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f108419d = w0Var;
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var2 = new com.tencent.mm.plugin.finder.feed.model.w0("LOADING", 1);
        f108420e = w0Var2;
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var3 = new com.tencent.mm.plugin.finder.feed.model.w0("LOADED", 2);
        f108421f = w0Var3;
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var4 = new com.tencent.mm.plugin.finder.feed.model.w0("FAILURE", 3);
        f108422g = w0Var4;
        com.tencent.mm.plugin.finder.feed.model.w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4};
        f108423h = w0VarArr;
        rz5.b.a(w0VarArr);
    }

    public w0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.w0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.w0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.w0.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.w0[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.w0[]) f108423h.clone();
    }
}
