package com.tencent.mm.plugin.finder.feed.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z f108496d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z f108497e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z f108498f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.z f108499g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.z[] f108500h;

    static {
        com.tencent.mm.plugin.finder.feed.model.z zVar = new com.tencent.mm.plugin.finder.feed.model.z(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f108496d = zVar;
        com.tencent.mm.plugin.finder.feed.model.z zVar2 = new com.tencent.mm.plugin.finder.feed.model.z("HORIZONTAL_VIDEO", 1);
        f108497e = zVar2;
        com.tencent.mm.plugin.finder.feed.model.z zVar3 = new com.tencent.mm.plugin.finder.feed.model.z("START_PLAY", 2);
        f108498f = zVar3;
        com.tencent.mm.plugin.finder.feed.model.z zVar4 = new com.tencent.mm.plugin.finder.feed.model.z("LIKE", 3);
        f108499g = zVar4;
        com.tencent.mm.plugin.finder.feed.model.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f108500h = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.z valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.z) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.z.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.z[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.z[]) f108500h.clone();
    }
}
