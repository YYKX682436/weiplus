package p75;

/* loaded from: classes3.dex */
public abstract class x extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f434232b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f434233c;

    public x(java.lang.String column, boolean z17, java.lang.String likeValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeValue, "likeValue");
        this.f434231a = column;
        this.f434232b = z17;
        this.f434233c = likeValue;
    }

    @Override // p75.r
    public java.lang.String b() {
        boolean z17 = this.f434232b;
        java.lang.String str = this.f434233c;
        java.lang.String str2 = this.f434231a;
        if (z17) {
            return str2 + " NOT LIKE " + str;
        }
        return str2 + " LIKE " + str;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
