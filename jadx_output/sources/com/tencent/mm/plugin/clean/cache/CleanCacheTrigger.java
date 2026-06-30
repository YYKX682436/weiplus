package com.tencent.mm.plugin.clean.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/clean/cache/CleanCacheTrigger;", "", "(Ljava/lang/String;I)V", "UNDEFINED", "TEST_MISC", "SILENT_CHARGING", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CleanCacheTrigger {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[] $VALUES;
    public static final com.tencent.mm.plugin.clean.cache.CleanCacheTrigger UNDEFINED = new com.tencent.mm.plugin.clean.cache.CleanCacheTrigger("UNDEFINED", 0);
    public static final com.tencent.mm.plugin.clean.cache.CleanCacheTrigger TEST_MISC = new com.tencent.mm.plugin.clean.cache.CleanCacheTrigger("TEST_MISC", 1);
    public static final com.tencent.mm.plugin.clean.cache.CleanCacheTrigger SILENT_CHARGING = new com.tencent.mm.plugin.clean.cache.CleanCacheTrigger("SILENT_CHARGING", 2);

    private static final /* synthetic */ com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[] $values() {
        return new com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[]{UNDEFINED, TEST_MISC, SILENT_CHARGING};
    }

    static {
        com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private CleanCacheTrigger(java.lang.String str, int i17) {
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.clean.cache.CleanCacheTrigger valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.clean.cache.CleanCacheTrigger) java.lang.Enum.valueOf(com.tencent.mm.plugin.clean.cache.CleanCacheTrigger.class, str);
    }

    public static com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[] values() {
        return (com.tencent.mm.plugin.clean.cache.CleanCacheTrigger[]) $VALUES.clone();
    }
}
