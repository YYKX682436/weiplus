package iv2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f376658a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f376659b;

    /* renamed from: c, reason: collision with root package name */
    public int f376660c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f376661d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f376662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f376663f;

    /* renamed from: field_id */
    private long f72349xc8a07680;

    /* renamed from: field_username */
    private java.lang.String f72350xdec927b;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f376664g;

    public b(java.lang.String app_name, java.lang.String entity_id) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app_name, "app_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        this.f376658a = app_name;
        this.f376659b = entity_id;
        this.f376661d = "";
        this.f376662e = "";
        this.f376663f = (app_name + entity_id).hashCode();
        this.f72349xc8a07680 = (app_name + entity_id).hashCode();
        this.f376664g = "";
        this.f72350xdec927b = "";
        new java.util.LinkedList();
        new java.util.LinkedList();
    }

    public final long a() {
        return this.f72349xc8a07680;
    }
}
