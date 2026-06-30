package com.tencent.mm.plugin.finder.convert;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fi {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.fi f103383e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.fi f103384f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.fi f103385g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.fi f103386h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.fi f103387i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.convert.fi[] f103388m;

    /* renamed from: d, reason: collision with root package name */
    public final int f103389d;

    static {
        com.tencent.mm.plugin.finder.convert.fi fiVar = new com.tencent.mm.plugin.finder.convert.fi(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f103383e = fiVar;
        com.tencent.mm.plugin.finder.convert.fi fiVar2 = new com.tencent.mm.plugin.finder.convert.fi("NODATA", 1, 1);
        f103384f = fiVar2;
        com.tencent.mm.plugin.finder.convert.fi fiVar3 = new com.tencent.mm.plugin.finder.convert.fi("CARD_ENTER", 2, 2);
        f103385g = fiVar3;
        com.tencent.mm.plugin.finder.convert.fi fiVar4 = new com.tencent.mm.plugin.finder.convert.fi("MEDIA_EMPTY", 3, 3);
        f103386h = fiVar4;
        com.tencent.mm.plugin.finder.convert.fi fiVar5 = new com.tencent.mm.plugin.finder.convert.fi("ENTRANCE_OPENED", 4, 4);
        f103387i = fiVar5;
        com.tencent.mm.plugin.finder.convert.fi[] fiVarArr = {fiVar, fiVar2, fiVar3, fiVar4, fiVar5};
        f103388m = fiVarArr;
        rz5.b.a(fiVarArr);
    }

    public fi(java.lang.String str, int i17, int i18) {
        this.f103389d = i18;
    }

    public static com.tencent.mm.plugin.finder.convert.fi valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.convert.fi) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.convert.fi.class, str);
    }

    public static com.tencent.mm.plugin.finder.convert.fi[] values() {
        return (com.tencent.mm.plugin.finder.convert.fi[]) f103388m.clone();
    }
}
