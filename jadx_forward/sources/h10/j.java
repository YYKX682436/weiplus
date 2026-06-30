package h10;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final h10.j f359583a = new h10.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.i f359584b;

    static {
        com.p176xb6135e39.p280x308fcb.j jVar = new com.p176xb6135e39.p280x308fcb.j();
        jVar.f126371k = true;
        jVar.f126367g = true;
        f359584b = jVar.a();
    }

    public final java.util.List a(java.lang.String jsonString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonString, "jsonString");
        try {
            java.util.List list = (java.util.List) f359584b.b(jsonString, java.util.List.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Object obj : list) {
                h10.f fVar = h10.g.L;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                arrayList.add(fVar.a((java.util.Map) obj));
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SemanticsUtils", "jsonToSemanticsNodes", e17);
            return kz5.p0.f395529d;
        }
    }
}
