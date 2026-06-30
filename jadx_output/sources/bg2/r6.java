package bg2;

/* loaded from: classes12.dex */
public final class r6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f20469d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f20470e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20471f;

    /* renamed from: g, reason: collision with root package name */
    public int f20472g;

    /* renamed from: h, reason: collision with root package name */
    public long f20473h;

    /* renamed from: i, reason: collision with root package name */
    public az2.j f20474i;

    public r6(int i17, com.tencent.mm.protobuf.f req) {
        kotlin.jvm.internal.o.g(req, "req");
        this.f20469d = i17;
        this.f20470e = req;
        this.f20472g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_polling_minimal_duration, 5);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        bg2.r6 other = (bg2.r6) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f20473h, other.f20473h);
    }

    public java.lang.String toString() {
        return "Command(cmdId=" + this.f20469d + ", disabled=" + this.f20471f + ", req=" + this.f20470e + ", intervalSec=" + this.f20472g + ", requestTime=" + this.f20473h + ", requestingCgi=" + this.f20474i + ')';
    }
}
