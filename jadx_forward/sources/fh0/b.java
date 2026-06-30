package fh0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f344051a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f344052b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f344053c;

    /* renamed from: d, reason: collision with root package name */
    public int f344054d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f344055e;

    public b(long j17, boolean z17, java.lang.String status, int i17, java.lang.String firstChunk, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        status = (i18 & 4) != 0 ? "ACTIVE" : status;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        firstChunk = (i18 & 16) != 0 ? "" : firstChunk;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstChunk, "firstChunk");
        this.f344051a = j17;
        this.f344052b = z17;
        this.f344053c = status;
        this.f344054d = i17;
        this.f344055e = firstChunk;
    }

    /* renamed from: equals */
    public boolean m129556xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0.b)) {
            return false;
        }
        fh0.b bVar = (fh0.b) obj;
        return this.f344051a == bVar.f344051a && this.f344052b == bVar.f344052b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f344053c, bVar.f344053c) && this.f344054d == bVar.f344054d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f344055e, bVar.f344055e);
    }

    /* renamed from: hashCode */
    public int m129557x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f344051a) * 31) + java.lang.Boolean.hashCode(this.f344052b)) * 31) + this.f344053c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f344054d)) * 31) + this.f344055e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129558x9616526c() {
        return "StreamItemData(msgSvrId=" + this.f344051a + ", isThinking=" + this.f344052b + ", status=" + this.f344053c + ", dataLength=" + this.f344054d + ", firstChunk=" + this.f344055e + ')';
    }
}
