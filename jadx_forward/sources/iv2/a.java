package iv2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f376651a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f376652b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f376653c;

    /* renamed from: d, reason: collision with root package name */
    public int f376654d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f376655e;

    /* renamed from: f, reason: collision with root package name */
    public final int f376656f;

    /* renamed from: field_id */
    private long f72347xc8a07680;

    /* renamed from: field_username */
    private java.lang.String f72348xdec927b;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f376657g;

    public a(java.lang.String app_name, java.lang.String entity_id, java.lang.String userName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app_name, "app_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f376651a = entity_id;
        this.f376652b = userName;
        this.f376653c = z17;
        this.f376655e = "";
        this.f376656f = app_name.concat(entity_id).hashCode();
        this.f72347xc8a07680 = app_name.concat(entity_id).hashCode();
        this.f376657g = "";
        this.f72348xdec927b = "";
        new java.util.LinkedList();
    }

    public final long a() {
        return this.f72347xc8a07680;
    }
}
