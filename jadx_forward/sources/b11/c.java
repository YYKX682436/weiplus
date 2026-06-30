package b11;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f98561a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f98562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98563c;

    /* renamed from: d, reason: collision with root package name */
    public long f98564d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98566f;

    public c(java.lang.String fileName, java.lang.String groupId, long j17, long j18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        this.f98561a = fileName;
        this.f98562b = groupId;
        this.f98563c = j17;
        this.f98564d = j18;
        this.f98565e = z17;
        this.f98566f = z18;
    }

    /* renamed from: equals */
    public boolean m9572xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11.c)) {
            return false;
        }
        b11.c cVar = (b11.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98561a, cVar.f98561a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98562b, cVar.f98562b) && this.f98563c == cVar.f98563c && this.f98564d == cVar.f98564d && this.f98565e == cVar.f98565e && this.f98566f == cVar.f98566f;
    }

    /* renamed from: hashCode */
    public int m9573x8cdac1b() {
        return (((((((((this.f98561a.hashCode() * 31) + this.f98562b.hashCode()) * 31) + java.lang.Long.hashCode(this.f98563c)) * 31) + java.lang.Long.hashCode(this.f98564d)) * 31) + java.lang.Boolean.hashCode(this.f98565e)) * 31) + java.lang.Boolean.hashCode(this.f98566f);
    }

    /* renamed from: toString */
    public java.lang.String m9574x9616526c() {
        return "MediaGroupVideoInfo(fileName=" + this.f98561a + ", groupId=" + this.f98562b + ", videoDuration=" + this.f98563c + ", playProgress=" + this.f98564d + ", isOnlinePlay=" + this.f98565e + ", isDumped=" + this.f98566f + ')';
    }

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? false : z18);
    }
}
