package xf0;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final xf0.k f535725a;

    /* renamed from: b, reason: collision with root package name */
    public int f535726b;

    public j(xf0.k resultType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultType, "resultType");
        this.f535725a = resultType;
    }

    /* renamed from: equals */
    public boolean m175454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf0.j) && this.f535725a == ((xf0.j) obj).f535725a;
    }

    /* renamed from: hashCode */
    public int m175455x8cdac1b() {
        return this.f535725a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175456x9616526c() {
        return "MsgVideoDownloadResult(resultType=" + this.f535725a + ')';
    }
}
