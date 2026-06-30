package com.tencent.mm.plugin.clean.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/clean/cache/CacheClassifyType;", "", "biz_type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getBiz_type", "()Ljava/lang/String;", "NONE", "SNS", "BIZ", "APPBRAND", "FAVORITE", "FINDER", "EMOJI", "MINI_GAME", "TING", "WEB", "MAP", "LIVE", "GAME_CENTER", "MISC_LOG", "MISC_MATRIX", "APPBRAND_FUSE", "OTHER", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheClassifyType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.clean.cache.CacheClassifyType[] $VALUES;
    private final java.lang.String biz_type;
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType NONE = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("NONE", 0, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType SNS = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("SNS", 1, "sns");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType BIZ = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("BIZ", 2, "brand");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType APPBRAND = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("APPBRAND", 3, "weapp");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType FAVORITE = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("FAVORITE", 4, "favorite");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType FINDER = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("FINDER", 5, "finder");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType EMOJI = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("EMOJI", 6, "emoji");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType MINI_GAME = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("MINI_GAME", 7, "game");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType TING = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("TING", 8, "ting");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType WEB = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("WEB", 9, "web");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType MAP = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("MAP", 10, "map");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType LIVE = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("LIVE", 11, "live");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType GAME_CENTER = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("GAME_CENTER", 12, "game_center");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType MISC_LOG = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("MISC_LOG", 13, "misc_log");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType MISC_MATRIX = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("MISC_MATRIX", 14, "misc_matrix");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType APPBRAND_FUSE = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("APPBRAND_FUSE", 15, "weapp_fuse");
    public static final com.tencent.mm.plugin.clean.cache.CacheClassifyType OTHER = new com.tencent.mm.plugin.clean.cache.CacheClassifyType("OTHER", 16, "other");

    private static final /* synthetic */ com.tencent.mm.plugin.clean.cache.CacheClassifyType[] $values() {
        return new com.tencent.mm.plugin.clean.cache.CacheClassifyType[]{NONE, SNS, BIZ, APPBRAND, FAVORITE, FINDER, EMOJI, MINI_GAME, TING, WEB, MAP, LIVE, GAME_CENTER, MISC_LOG, MISC_MATRIX, APPBRAND_FUSE, OTHER};
    }

    static {
        com.tencent.mm.plugin.clean.cache.CacheClassifyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private CacheClassifyType(java.lang.String str, int i17, java.lang.String str2) {
        this.biz_type = str2;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.clean.cache.CacheClassifyType valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.clean.cache.CacheClassifyType) java.lang.Enum.valueOf(com.tencent.mm.plugin.clean.cache.CacheClassifyType.class, str);
    }

    public static com.tencent.mm.plugin.clean.cache.CacheClassifyType[] values() {
        return (com.tencent.mm.plugin.clean.cache.CacheClassifyType[]) $VALUES.clone();
    }

    public final java.lang.String getBiz_type() {
        return this.biz_type;
    }
}
