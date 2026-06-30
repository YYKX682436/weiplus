package tr3;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static long f502960b;

    /* renamed from: a, reason: collision with root package name */
    public static final tr3.a f502959a = new tr3.a();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f502961c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f502962d = new java.util.ArrayList();

    public final void a(tr3.b event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!event.f502964b) {
            f502962d.add(event);
            return;
        }
        ((java.util.HashMap) f502961c).put(java.lang.Integer.valueOf(event.f502963a), event);
    }
}
