package x06;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f532860a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f532861b;

    /* renamed from: c, reason: collision with root package name */
    public final e16.g f532862c;

    public v(n16.b classId, byte[] bArr, e16.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i17 & 2) != 0 ? null : bArr;
        gVar = (i17 & 4) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        this.f532860a = classId;
        this.f532861b = bArr;
        this.f532862c = gVar;
    }

    /* renamed from: equals */
    public boolean m174880xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.v)) {
            return false;
        }
        x06.v vVar = (x06.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532860a, vVar.f532860a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532861b, vVar.f532861b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532862c, vVar.f532862c);
    }

    /* renamed from: hashCode */
    public int m174881x8cdac1b() {
        int m148881x8cdac1b = this.f532860a.m148881x8cdac1b() * 31;
        byte[] bArr = this.f532861b;
        int hashCode = (m148881x8cdac1b + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        e16.g gVar = this.f532862c;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m174882x9616526c() {
        return "Request(classId=" + this.f532860a + ", previouslyFoundClassFileContent=" + java.util.Arrays.toString(this.f532861b) + ", outerClass=" + this.f532862c + ')';
    }
}
