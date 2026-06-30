package bv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f106257a;

    /* renamed from: b, reason: collision with root package name */
    public long f106258b;

    public b(java.lang.String path, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        path = (i17 & 1) != 0 ? "" : path;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f106257a = path;
        this.f106258b = j17;
    }

    /* renamed from: equals */
    public boolean m11386xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv3.b)) {
            return false;
        }
        bv3.b bVar = (bv3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106257a, bVar.f106257a) && this.f106258b == bVar.f106258b;
    }

    /* renamed from: hashCode */
    public int m11387x8cdac1b() {
        return (this.f106257a.hashCode() * 31) + java.lang.Long.hashCode(this.f106258b);
    }

    /* renamed from: toString */
    public java.lang.String m11388x9616526c() {
        return "TTSInfo(path=" + this.f106257a + ", durationMs=" + this.f106258b + ')';
    }
}
