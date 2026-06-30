package wg3;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f527264b;

    /* renamed from: c, reason: collision with root package name */
    public final int f527265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f527266d;

    public k(java.lang.String str, int i17, int i18, int i19) {
        this.f527263a = str;
        this.f527264b = i17;
        this.f527265c = i18;
        this.f527266d = i19;
    }

    /* renamed from: equals */
    public boolean m173757xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg3.k)) {
            return false;
        }
        wg3.k kVar = (wg3.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527263a, kVar.f527263a) && this.f527264b == kVar.f527264b && this.f527265c == kVar.f527265c && this.f527266d == kVar.f527266d;
    }

    /* renamed from: hashCode */
    public int m173758x8cdac1b() {
        java.lang.String str = this.f527263a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f527264b)) * 31) + java.lang.Integer.hashCode(this.f527265c)) * 31) + java.lang.Integer.hashCode(this.f527266d);
    }

    /* renamed from: toString */
    public java.lang.String m173759x9616526c() {
        return "MediaGroupReportInfo(groupId=" + this.f527263a + ", imageCount=" + this.f527264b + ", videoCount=" + this.f527265c + ", liveCount=" + this.f527266d + ')';
    }
}
