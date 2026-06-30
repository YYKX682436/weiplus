package e95;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f331995a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f331996b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331997c;

    public u(java.util.List list, java.lang.String[] columnNames, java.lang.String sql) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columnNames, "columnNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        this.f331995a = list;
        this.f331996b = columnNames;
        this.f331997c = sql;
    }

    /* renamed from: toString */
    public java.lang.String m127203x9616526c() {
        return "WCDBNewQuery: " + this.f331997c;
    }
}
