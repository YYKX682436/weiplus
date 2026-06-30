package com.tencent.mm.accessibility.uitl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/IdUtil;", "", "()V", "ID_MASK", "", "LAYOUT_ID_MASK", "STRING_MASK", "nameCache", "", "", "getName", dm.i4.COL_ID, "getType", "Lcom/tencent/mm/accessibility/type/IdType;", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdUtil {
    private static final int ID_MASK = 2131296256;
    private static final int LAYOUT_ID_MASK = 2131492864;
    private static final int STRING_MASK = 2131755008;
    public static final com.tencent.mm.accessibility.uitl.IdUtil INSTANCE = new com.tencent.mm.accessibility.uitl.IdUtil();
    private static final java.util.Map<java.lang.Integer, java.lang.String> nameCache = new java.util.LinkedHashMap();
    public static final int $stable = 8;

    private IdUtil() {
    }

    public final java.lang.String getName(int id6) {
        try {
            java.util.Map<java.lang.Integer, java.lang.String> map = nameCache;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(id6);
            java.lang.String str = map.get(valueOf);
            if (str == null) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceName(id6);
                kotlin.jvm.internal.o.f(str, "getResourceName(...)");
                map.put(valueOf, str);
            }
            return str;
        } catch (java.lang.Throwable unused) {
            nameCache.put(java.lang.Integer.valueOf(id6), "unknow Resource");
            return "unknow Resource";
        }
    }

    public final com.tencent.mm.accessibility.type.IdType getType(int id6) {
        return (id6 & com.tencent.mm.R.layout.bkq) == com.tencent.mm.R.layout.bkq ? com.tencent.mm.accessibility.type.IdType.Layout : (id6 & com.tencent.mm.R.id.f482248b) == com.tencent.mm.R.id.f482248b ? com.tencent.mm.accessibility.type.IdType.Id : (id6 & com.tencent.mm.R.string.f489700a) == com.tencent.mm.R.string.f489700a ? com.tencent.mm.accessibility.type.IdType.String : com.tencent.mm.accessibility.type.IdType.Unknow;
    }
}
