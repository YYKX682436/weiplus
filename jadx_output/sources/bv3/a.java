package bv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f24720a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24721b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24722c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24723d;

    public a(java.lang.String path, long j17, long j18, float f17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f24720a = path;
        this.f24721b = j17;
        this.f24722c = j18;
        this.f24723d = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv3.a)) {
            return false;
        }
        bv3.a aVar = (bv3.a) obj;
        return kotlin.jvm.internal.o.b(this.f24720a, aVar.f24720a) && this.f24721b == aVar.f24721b && this.f24722c == aVar.f24722c && java.lang.Float.compare(this.f24723d, aVar.f24723d) == 0;
    }

    public int hashCode() {
        return (((((this.f24720a.hashCode() * 31) + java.lang.Long.hashCode(this.f24721b)) * 31) + java.lang.Long.hashCode(this.f24722c)) * 31) + java.lang.Float.hashCode(this.f24723d);
    }

    public java.lang.String toString() {
        return "EditRenderScript(path=" + this.f24720a + ", startMs=" + this.f24721b + ", endMS=" + this.f24722c + ", playRate=" + this.f24723d + ')';
    }
}
