package fm3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final fm3.a f345559e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedHashMap f345560f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345561a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f345562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f345563c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345564d;

    static {
        fm3.a aVar = new fm3.a(null);
        f345559e = aVar;
        f345560f = new java.util.LinkedHashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_transition/");
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            aVar.a(sb7);
        }
    }

    public b(java.lang.String id6, org.json.JSONObject nameObj, java.lang.String wxamPath, java.lang.String pagPath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameObj, "nameObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxamPath, "wxamPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagPath, "pagPath");
        this.f345561a = id6;
        this.f345562b = nameObj;
        this.f345563c = wxamPath;
        this.f345564d = pagPath;
    }
}
