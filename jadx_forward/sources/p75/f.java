package p75;

/* loaded from: classes4.dex */
public abstract class f extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434171a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f434172b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.p f434173c;

    public f(java.lang.String column1, java.lang.String column2, p75.p operator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column1, "column1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column2, "column2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operator, "operator");
        this.f434171a = column1;
        this.f434172b = column2;
        this.f434173c = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f434171a + ' ' + this.f434173c + ' ' + this.f434172b;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
