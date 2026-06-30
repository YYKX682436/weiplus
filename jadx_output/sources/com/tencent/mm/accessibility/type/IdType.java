package com.tencent.mm.accessibility.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/accessibility/type/IdType;", "", "(Ljava/lang/String;I)V", "Layout", "Id", "String", "Unknow", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.accessibility.type.IdType[] $VALUES;
    public static final com.tencent.mm.accessibility.type.IdType Layout = new com.tencent.mm.accessibility.type.IdType("Layout", 0);
    public static final com.tencent.mm.accessibility.type.IdType Id = new com.tencent.mm.accessibility.type.IdType("Id", 1);
    public static final com.tencent.mm.accessibility.type.IdType String = new com.tencent.mm.accessibility.type.IdType("String", 2);
    public static final com.tencent.mm.accessibility.type.IdType Unknow = new com.tencent.mm.accessibility.type.IdType("Unknow", 3);

    private static final /* synthetic */ com.tencent.mm.accessibility.type.IdType[] $values() {
        return new com.tencent.mm.accessibility.type.IdType[]{Layout, Id, String, Unknow};
    }

    static {
        com.tencent.mm.accessibility.type.IdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IdType(java.lang.String str, int i17) {
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.accessibility.type.IdType valueOf(java.lang.String str) {
        return (com.tencent.mm.accessibility.type.IdType) java.lang.Enum.valueOf(com.tencent.mm.accessibility.type.IdType.class, str);
    }

    public static com.tencent.mm.accessibility.type.IdType[] values() {
        return (com.tencent.mm.accessibility.type.IdType[]) $VALUES.clone();
    }
}
