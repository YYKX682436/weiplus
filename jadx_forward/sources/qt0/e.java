package qt0;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f448029a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f448030b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f448031c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448032d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f448033e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f448034f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f448035g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f448036h;

    public e(l75.k0 k0Var, java.lang.String[] createIndexSQLs, java.lang.String targetTableName, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createIndexSQLs, "createIndexSQLs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetTableName, "targetTableName");
        this.f448029a = k0Var;
        this.f448030b = createIndexSQLs;
        this.f448031c = targetTableName;
        this.f448032d = str;
        this.f448033e = "MicroMsg.DBIndexTask";
        this.f448034f = jz5.h.b(qt0.c.f448027d);
        this.f448035g = "db_lazy_create_index_" + targetTableName + '_' + i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicfg_db_lazy_create_index_");
        if (str == null) {
            str = targetTableName.toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toLowerCase(...)");
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        sb6.append("_android");
        this.f448036h = sb6.toString();
    }
}
