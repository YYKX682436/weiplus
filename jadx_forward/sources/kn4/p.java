package kn4;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f391272a;

    /* renamed from: b, reason: collision with root package name */
    public final long f391273b;

    /* renamed from: c, reason: collision with root package name */
    public long f391274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f391275d;

    public p(java.lang.String mediaId, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f391272a = mediaId;
        this.f391273b = j17;
        this.f391274c = j18;
        this.f391275d = z17;
    }

    /* renamed from: equals */
    public boolean m143813xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn4.p)) {
            return false;
        }
        kn4.p pVar = (kn4.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391272a, pVar.f391272a) && this.f391273b == pVar.f391273b && this.f391274c == pVar.f391274c && this.f391275d == pVar.f391275d;
    }

    /* renamed from: hashCode */
    public int m143814x8cdac1b() {
        return (((((this.f391272a.hashCode() * 31) + java.lang.Long.hashCode(this.f391273b)) * 31) + java.lang.Long.hashCode(this.f391274c)) * 31) + java.lang.Boolean.hashCode(this.f391275d);
    }

    /* renamed from: toString */
    public java.lang.String m143815x9616526c() {
        return "FileInfo(mediaId=" + this.f391272a + ", totalLen=" + this.f391273b + ", finishedLen=" + this.f391274c + ", isUpload=" + this.f391275d + ')';
    }
}
