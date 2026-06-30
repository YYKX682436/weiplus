package com.tencent.mm.plugin.finder.feed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bp {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.bp f106403d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.bp f106404e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.bp f106405f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.bp[] f106406g;

    static {
        com.tencent.mm.plugin.finder.feed.bp bpVar = new com.tencent.mm.plugin.finder.feed.bp(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f106403d = bpVar;
        com.tencent.mm.plugin.finder.feed.bp bpVar2 = new com.tencent.mm.plugin.finder.feed.bp("NO_CACHE", 1);
        f106404e = bpVar2;
        com.tencent.mm.plugin.finder.feed.bp bpVar3 = new com.tencent.mm.plugin.finder.feed.bp("WITH_CACHED", 2);
        f106405f = bpVar3;
        com.tencent.mm.plugin.finder.feed.bp[] bpVarArr = {bpVar, bpVar2, bpVar3};
        f106406g = bpVarArr;
        rz5.b.a(bpVarArr);
    }

    public bp(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.bp valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.bp) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.bp.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.bp[] values() {
        return (com.tencent.mm.plugin.finder.feed.bp[]) f106406g.clone();
    }
}
