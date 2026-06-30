package p75;

/* loaded from: classes.dex */
public class g implements p75.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f434176b;

    public g(java.lang.String column, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        this.f434175a = column;
        this.f434176b = z17;
    }

    @Override // p75.r
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f434175a);
        sb6.append(this.f434176b ? "" : " DESC");
        return sb6.toString();
    }
}
