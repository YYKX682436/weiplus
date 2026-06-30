package com.tencent.mm.plugin.appbrand;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/PopPageStackType;", "", "(Ljava/lang/String;I)V", "Activity_Finish", "Activity_Destroy", "Call_Runtime_Close", "Remove_from_Stack", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PopPageStackType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.appbrand.PopPageStackType[] $VALUES;
    public static final com.tencent.mm.plugin.appbrand.PopPageStackType Activity_Finish = new com.tencent.mm.plugin.appbrand.PopPageStackType("Activity_Finish", 0);
    public static final com.tencent.mm.plugin.appbrand.PopPageStackType Activity_Destroy = new com.tencent.mm.plugin.appbrand.PopPageStackType("Activity_Destroy", 1);
    public static final com.tencent.mm.plugin.appbrand.PopPageStackType Call_Runtime_Close = new com.tencent.mm.plugin.appbrand.PopPageStackType("Call_Runtime_Close", 2);
    public static final com.tencent.mm.plugin.appbrand.PopPageStackType Remove_from_Stack = new com.tencent.mm.plugin.appbrand.PopPageStackType("Remove_from_Stack", 3);

    private static final /* synthetic */ com.tencent.mm.plugin.appbrand.PopPageStackType[] $values() {
        return new com.tencent.mm.plugin.appbrand.PopPageStackType[]{Activity_Finish, Activity_Destroy, Call_Runtime_Close, Remove_from_Stack};
    }

    static {
        com.tencent.mm.plugin.appbrand.PopPageStackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private PopPageStackType(java.lang.String str, int i17) {
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.appbrand.PopPageStackType valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.PopPageStackType) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.PopPageStackType.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.PopPageStackType[] values() {
        return (com.tencent.mm.plugin.appbrand.PopPageStackType[]) $VALUES.clone();
    }
}
