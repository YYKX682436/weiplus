package cs2;

/* loaded from: classes2.dex */
public final class p extends dn.o implements java.lang.Comparable {

    /* renamed from: d2, reason: collision with root package name */
    public final ek4.b f303620d2;

    /* renamed from: e2, reason: collision with root package name */
    public final mn2.g4 f303621e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f303622f2;

    /* renamed from: g2, reason: collision with root package name */
    public cs2.o f303623g2;

    /* renamed from: h2, reason: collision with root package name */
    public int f303624h2;

    /* renamed from: i2, reason: collision with root package name */
    public final java.lang.String f303625i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.lang.String f303626j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f303627k2;

    /* renamed from: l2, reason: collision with root package name */
    public cs2.n f303628l2;

    static {
        new cs2.m(null);
    }

    public p(ek4.b taskContext, mn2.g4 video) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        this.f303620d2 = taskContext;
        this.f303621e2 = video;
        this.f303623g2 = cs2.o.f303617e;
        this.f303625i2 = video.n();
        java.lang.String m75945x2fec8307 = video.f411535e.m75945x2fec8307(9);
        this.f303626j2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        this.f303628l2 = cs2.n.f303612d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        cs2.p other = (cs2.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(other.f303624h2, this.f303624h2);
    }

    /* renamed from: equals */
    public boolean m122616xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof cs2.p)) {
            return false;
        }
        cs2.p pVar = (cs2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303625i2, pVar.f303625i2) && this.f303628l2 == pVar.f303628l2;
    }

    /* renamed from: hashCode */
    public int m122617x8cdac1b() {
        return this.f303625i2.hashCode();
    }

    public final java.lang.String k() {
        java.lang.String str = this.X1;
        if (str != null) {
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
        return "xV0";
    }

    @Override // dn.o
    /* renamed from: toString */
    public java.lang.String mo122618x9616526c() {
        int i17 = this.f69610x4f5245a8;
        java.lang.String str = "";
        java.lang.String str2 = i17 == 1 ? "H264" : i17 == 2 ? "H265" : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.f303623g2);
        sb6.append("] ");
        sb6.append(this.f303627k2);
        sb6.append('_');
        java.lang.String mediaId = this.f303625i2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (!(mediaId.length() == 0)) {
            if (mediaId.length() <= 13) {
                str = mediaId;
            } else {
                int length = mediaId.length();
                if (length > 24) {
                    length = 24;
                }
                str = mediaId.substring(13, length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
        }
        sb6.append(str);
        sb6.append(' ');
        sb6.append(pm0.v.u(this.f303622f2));
        sb6.append(' ');
        sb6.append(str2);
        sb6.append(" percent=");
        sb6.append(this.V1);
        sb6.append("% minSize=");
        sb6.append(this.f323338x);
        sb6.append(" weight=");
        sb6.append(this.f303624h2);
        return sb6.toString();
    }
}
