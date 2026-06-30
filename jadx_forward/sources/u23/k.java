package u23;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f505617g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f505618h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f505619i;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f505620a = jz5.h.b(u23.f.f505606d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f505621b = jz5.h.b(new u23.j(this));

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f505622c = jz5.h.b(new u23.h(this));

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f505623d = jz5.h.b(new u23.i(this));

    /* renamed from: e, reason: collision with root package name */
    public final long f505624e = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f505625f = jz5.h.b(u23.g.f505608d);

    static {
        java.util.List i17 = kz5.c0.i("camera", "screenshots", "download");
        f505617g = i17;
        f505618h = i17;
        f505619i = kz5.b0.c("camera");
    }

    public static final java.lang.String a(u23.k kVar) {
        kVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("date_modified<=2147483647 AND date_modified>0");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            sb6.append(" AND is_pending<>1");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return " AND ".concat(sb7);
    }

    public final java.util.List b(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) ? f505618h : (num != null && num.intValue() == 2) ? f505619i : f505617g;
    }
}
