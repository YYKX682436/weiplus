package x21;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f533065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f533066b;

    /* renamed from: c, reason: collision with root package name */
    public long f533067c;

    public h(java.lang.String filePath, int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 4) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f533065a = filePath;
        this.f533066b = i17;
        this.f533067c = j17;
    }

    /* renamed from: equals */
    public boolean m174921xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x21.h)) {
            return false;
        }
        x21.h hVar = (x21.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533065a, hVar.f533065a) && this.f533066b == hVar.f533066b && this.f533067c == hVar.f533067c;
    }

    /* renamed from: hashCode */
    public int m174922x8cdac1b() {
        return (((this.f533065a.hashCode() * 31) + java.lang.Integer.hashCode(this.f533066b)) * 31) + java.lang.Long.hashCode(this.f533067c);
    }

    /* renamed from: toString */
    public java.lang.String m174923x9616526c() {
        return "FileInfo(filePath=" + this.f533065a + ", indexPos=" + this.f533066b + ", duration=" + this.f533067c + ')';
    }
}
