package p75;

/* loaded from: classes4.dex */
public abstract class e1 implements p75.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434169a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f434170b;

    public e1(java.lang.String sql, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        this.f434169a = sql;
        this.f434170b = strArr;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f434169a;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return this.f434170b;
    }

    /* renamed from: toString */
    public java.lang.String m157942x9616526c() {
        return "sql=" + this.f434169a + " params=" + this.f434170b;
    }
}
