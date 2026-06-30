package hg0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362850a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f362851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f362852c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f362853d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f362854e;

    /* renamed from: f, reason: collision with root package name */
    public final long f362855f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f362856g;

    public g(java.lang.String fileName, boolean z17, boolean z18, boolean z19, boolean z27, long j17, java.lang.String otherInfo, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        otherInfo = (i17 & 64) != 0 ? "" : otherInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherInfo, "otherInfo");
        this.f362850a = fileName;
        this.f362851b = z17;
        this.f362852c = z18;
        this.f362853d = z19;
        this.f362854e = z27;
        this.f362855f = j17;
        this.f362856g = otherInfo;
    }

    /* renamed from: equals */
    public boolean m133528xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0.g)) {
            return false;
        }
        hg0.g gVar = (hg0.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362850a, gVar.f362850a) && this.f362851b == gVar.f362851b && this.f362852c == gVar.f362852c && this.f362853d == gVar.f362853d && this.f362854e == gVar.f362854e && this.f362855f == gVar.f362855f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362856g, gVar.f362856g);
    }

    /* renamed from: hashCode */
    public int m133529x8cdac1b() {
        return (((((((((((this.f362850a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f362851b)) * 31) + java.lang.Boolean.hashCode(this.f362852c)) * 31) + java.lang.Boolean.hashCode(this.f362853d)) * 31) + java.lang.Boolean.hashCode(this.f362854e)) * 31) + java.lang.Long.hashCode(this.f362855f)) * 31) + this.f362856g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133530x9616526c() {
        return "Session(fileName=" + this.f362850a + ", isNewDownload=" + this.f362851b + ", isGroupChat=" + this.f362852c + ", firstUseCgi=" + this.f362853d + ", lastUseCgi=" + this.f362854e + ", startTicks=" + this.f362855f + ", otherInfo=" + this.f362856g + ')';
    }
}
