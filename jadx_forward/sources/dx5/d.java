package dx5;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f326043a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326044b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f326045c;

    /* renamed from: d, reason: collision with root package name */
    public final long f326046d;

    public d(long j17, java.lang.String url, java.util.Map headers, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        this.f326043a = j17;
        this.f326044b = url;
        this.f326045c = headers;
        this.f326046d = j18;
    }

    /* renamed from: equals */
    public boolean m126427xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx5.d)) {
            return false;
        }
        dx5.d dVar = (dx5.d) obj;
        return this.f326043a == dVar.f326043a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326044b, dVar.f326044b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326045c, dVar.f326045c) && this.f326046d == dVar.f326046d;
    }

    /* renamed from: hashCode */
    public int m126428x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f326043a) * 31) + this.f326044b.hashCode()) * 31) + this.f326045c.hashCode()) * 31) + java.lang.Long.hashCode(this.f326046d);
    }

    /* renamed from: toString */
    public java.lang.String m126429x9616526c() {
        return "DownloadParams(taskId=" + this.f326043a + ", url=" + this.f326044b + ", headers=" + this.f326045c + ", timeoutMillis=" + this.f326046d + ')';
    }
}
