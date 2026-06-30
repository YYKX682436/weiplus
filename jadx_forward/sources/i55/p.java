package i55;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f370403a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f370404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f370405c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f370406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370407e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f370408f;

    public p(int i17, java.lang.String pageName, int i18, java.lang.String entryKey, int i19, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryKey, "entryKey");
        this.f370403a = i17;
        this.f370404b = pageName;
        this.f370405c = i18;
        this.f370406d = entryKey;
        this.f370407e = i19;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f370408f = linkedHashMap;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }

    public final void a(boolean z17) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(e55.e.f331200a.j());
        linkedHashMap.put("consume_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("page_id", java.lang.Integer.valueOf(this.f370403a));
        linkedHashMap.put("page_name", this.f370404b);
        linkedHashMap.put("click_entry_key", this.f370406d);
        linkedHashMap.put("tab_info", this.f370408f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("red_dot_page_consume_check", linkedHashMap, this.f370407e);
    }
}
