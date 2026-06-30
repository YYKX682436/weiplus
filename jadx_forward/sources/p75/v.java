package p75;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final p75.f1 f434228a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f434229b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f434230c;

    public v(p75.f1 table, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f434228a = table;
        this.f434229b = name;
    }

    public final p75.w a() {
        p75.f1 f1Var = this.f434228a;
        if (!(f1Var instanceof p75.n0)) {
            throw new java.lang.IllegalArgumentException("Not support multi table index");
        }
        java.util.List list = this.f434230c;
        if (list != null) {
            boolean z17 = false;
            if (list != null && ((java.util.ArrayList) list).isEmpty()) {
                z17 = true;
            }
            if (!z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE ");
                sb6.append("");
                sb6.append("INDEX IF NOT EXISTS ");
                sb6.append(this.f434229b);
                sb6.append(" ON ");
                sb6.append(((p75.n0) f1Var).f434209a);
                sb6.append('(');
                java.util.List list2 = this.f434230c;
                sb6.append(list2 != null ? kz5.n0.g0(list2, ",", null, null, 0, null, p75.u.f434227d, 30, null) : null);
                sb6.append(')');
                return new p75.w(sb6.toString());
            }
        }
        throw new java.lang.IllegalArgumentException("empty columns");
    }

    public final p75.v b(p75.l... columns) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columns, "columns");
        java.util.ArrayList arrayList = new java.util.ArrayList(columns.length);
        for (p75.l lVar : columns) {
            arrayList.add(lVar);
        }
        this.f434230c = arrayList;
        return this;
    }
}
