package ni3;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f419279a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419280b;

    /* renamed from: c, reason: collision with root package name */
    public final cs2.p f419281c;

    public v0(so2.j5 data, java.lang.String mediaId, cs2.p taskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        this.f419279a = data;
        this.f419280b = mediaId;
        this.f419281c = taskInfo;
    }

    /* renamed from: equals */
    public boolean m149686xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.v0)) {
            return false;
        }
        ni3.v0 v0Var = (ni3.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419279a, v0Var.f419279a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419280b, v0Var.f419280b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419281c, v0Var.f419281c);
    }

    /* renamed from: hashCode */
    public int m149687x8cdac1b() {
        return (((this.f419279a.hashCode() * 31) + this.f419280b.hashCode()) * 31) + this.f419281c.m122617x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m149688x9616526c() {
        return "PreloadFeed(data=" + this.f419279a + ", mediaId=" + this.f419280b + ", taskInfo=" + this.f419281c + ')';
    }
}
