package b11;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f17028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f17029b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17030c;

    /* renamed from: d, reason: collision with root package name */
    public long f17031d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17032e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17033f;

    public c(java.lang.String fileName, java.lang.String groupId, long j17, long j18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(groupId, "groupId");
        this.f17028a = fileName;
        this.f17029b = groupId;
        this.f17030c = j17;
        this.f17031d = j18;
        this.f17032e = z17;
        this.f17033f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11.c)) {
            return false;
        }
        b11.c cVar = (b11.c) obj;
        return kotlin.jvm.internal.o.b(this.f17028a, cVar.f17028a) && kotlin.jvm.internal.o.b(this.f17029b, cVar.f17029b) && this.f17030c == cVar.f17030c && this.f17031d == cVar.f17031d && this.f17032e == cVar.f17032e && this.f17033f == cVar.f17033f;
    }

    public int hashCode() {
        return (((((((((this.f17028a.hashCode() * 31) + this.f17029b.hashCode()) * 31) + java.lang.Long.hashCode(this.f17030c)) * 31) + java.lang.Long.hashCode(this.f17031d)) * 31) + java.lang.Boolean.hashCode(this.f17032e)) * 31) + java.lang.Boolean.hashCode(this.f17033f);
    }

    public java.lang.String toString() {
        return "MediaGroupVideoInfo(fileName=" + this.f17028a + ", groupId=" + this.f17029b + ", videoDuration=" + this.f17030c + ", playProgress=" + this.f17031d + ", isOnlinePlay=" + this.f17032e + ", isDumped=" + this.f17033f + ')';
    }

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? false : z18);
    }
}
