package p75;

/* loaded from: classes3.dex */
public abstract class t extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f434224b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f434225c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f434226d;

    public t(java.lang.String column, boolean z17, java.util.List values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f434223a = column;
        this.f434224b = z17;
        this.f434225c = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add("?");
        }
        this.f434226d = arrayList;
    }

    @Override // p75.r
    public java.lang.String b() {
        java.lang.String g07 = kz5.n0.g0(this.f434226d, ",", null, null, 0, null, null, 62, null);
        boolean z17 = this.f434224b;
        java.lang.String str = this.f434223a;
        if (z17) {
            return str + " NOT IN (" + g07 + ')';
        }
        return str + " IN (" + g07 + ')';
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return (java.lang.String[]) this.f434225c.toArray(new java.lang.String[0]);
    }
}
