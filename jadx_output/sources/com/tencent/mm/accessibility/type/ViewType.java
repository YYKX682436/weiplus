package com.tencent.mm.accessibility.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/accessibility/type/ViewType;", "", "(Ljava/lang/String;I)V", "Button", "TextView", "CheckBox", "SeekBar", "EditText", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.accessibility.type.ViewType[] $VALUES;
    public static final com.tencent.mm.accessibility.type.ViewType Button = new com.tencent.mm.accessibility.type.ViewType("Button", 0);
    public static final com.tencent.mm.accessibility.type.ViewType TextView = new com.tencent.mm.accessibility.type.ViewType("TextView", 1);
    public static final com.tencent.mm.accessibility.type.ViewType CheckBox = new com.tencent.mm.accessibility.type.ViewType("CheckBox", 2);
    public static final com.tencent.mm.accessibility.type.ViewType SeekBar = new com.tencent.mm.accessibility.type.ViewType("SeekBar", 3);
    public static final com.tencent.mm.accessibility.type.ViewType EditText = new com.tencent.mm.accessibility.type.ViewType("EditText", 4);

    private static final /* synthetic */ com.tencent.mm.accessibility.type.ViewType[] $values() {
        return new com.tencent.mm.accessibility.type.ViewType[]{Button, TextView, CheckBox, SeekBar, EditText};
    }

    static {
        com.tencent.mm.accessibility.type.ViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private ViewType(java.lang.String str, int i17) {
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.accessibility.type.ViewType valueOf(java.lang.String str) {
        return (com.tencent.mm.accessibility.type.ViewType) java.lang.Enum.valueOf(com.tencent.mm.accessibility.type.ViewType.class, str);
    }

    public static com.tencent.mm.accessibility.type.ViewType[] values() {
        return (com.tencent.mm.accessibility.type.ViewType[]) $VALUES.clone();
    }
}
