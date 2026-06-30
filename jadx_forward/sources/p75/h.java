package p75;

/* loaded from: classes4.dex */
public abstract class h extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434178a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f434179b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.p f434180c;

    public h(java.lang.String column, java.lang.String value, p75.p operator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operator, "operator");
        this.f434178a = column;
        this.f434179b = value;
        this.f434180c = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f434178a + ' ' + this.f434180c + " ?";
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return new java.lang.String[]{this.f434179b};
    }
}
