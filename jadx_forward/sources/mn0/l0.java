package mn0;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f411303a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f411304b;

    /* renamed from: c, reason: collision with root package name */
    public final long f411305c;

    /* renamed from: d, reason: collision with root package name */
    public final long f411306d;

    /* renamed from: e, reason: collision with root package name */
    public final long f411307e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nw1 f411308f;

    public l0(java.lang.String streamId, java.lang.String anchorNickName, long j17, long j18, long j19, r45.nw1 nw1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorNickName, "anchorNickName");
        this.f411303a = streamId;
        this.f411304b = anchorNickName;
        this.f411305c = j17;
        this.f411306d = j18;
        this.f411307e = j19;
        this.f411308f = nw1Var;
    }

    /* renamed from: equals */
    public boolean m148065xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0.l0)) {
            return false;
        }
        mn0.l0 l0Var = (mn0.l0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411303a, l0Var.f411303a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411304b, l0Var.f411304b) && this.f411305c == l0Var.f411305c && this.f411306d == l0Var.f411306d && this.f411307e == l0Var.f411307e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411308f, l0Var.f411308f);
    }

    /* renamed from: hashCode */
    public int m148066x8cdac1b() {
        int hashCode = ((((((((this.f411303a.hashCode() * 31) + this.f411304b.hashCode()) * 31) + java.lang.Long.hashCode(this.f411305c)) * 31) + java.lang.Long.hashCode(this.f411306d)) * 31) + java.lang.Long.hashCode(this.f411307e)) * 31;
        r45.nw1 nw1Var = this.f411308f;
        return hashCode + (nw1Var == null ? 0 : nw1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m148067x9616526c() {
        return "PlayerInfoData(streamId=" + this.f411303a + ", anchorNickName=" + this.f411304b + ", liveId=" + this.f411305c + ", feedId=" + this.f411306d + ", enterLiveTs=" + this.f411307e + ", liveInfo=" + this.f411308f + ')';
    }
}
