package h54;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h54.i f360629a = new h54.i();

    public final java.util.Map a(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (map == null || map.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
            return linkedHashMap;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!(str == null || str.length() == 0) && value != null) {
                linkedHashMap.put(str, value);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        return linkedHashMap;
    }
}
