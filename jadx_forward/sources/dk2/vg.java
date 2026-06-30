package dk2;

/* loaded from: classes3.dex */
public final class vg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.d22 f315787a;

    /* renamed from: b, reason: collision with root package name */
    public int f315788b;

    /* renamed from: c, reason: collision with root package name */
    public int f315789c;

    /* renamed from: d, reason: collision with root package name */
    public final int f315790d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f315791e;

    /* renamed from: f, reason: collision with root package name */
    public long f315792f;

    public vg(r45.d22 musicInfo, int i17, int i18, int i19, boolean z17, long j17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 8) != 0 ? 2 : i19;
        z17 = (i27 & 16) != 0 ? false : z17;
        j17 = (i27 & 32) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        this.f315787a = musicInfo;
        this.f315788b = i17;
        this.f315789c = i18;
        this.f315790d = i19;
        this.f315791e = z17;
        this.f315792f = j17;
    }

    /* renamed from: equals */
    public boolean m124675xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.vg)) {
            return false;
        }
        dk2.vg vgVar = (dk2.vg) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315787a, vgVar.f315787a) && this.f315788b == vgVar.f315788b && this.f315789c == vgVar.f315789c && this.f315790d == vgVar.f315790d && this.f315791e == vgVar.f315791e && this.f315792f == vgVar.f315792f;
    }

    /* renamed from: hashCode */
    public int m124676x8cdac1b() {
        return (((((((((this.f315787a.hashCode() * 31) + java.lang.Integer.hashCode(this.f315788b)) * 31) + java.lang.Integer.hashCode(this.f315789c)) * 31) + java.lang.Integer.hashCode(this.f315790d)) * 31) + java.lang.Boolean.hashCode(this.f315791e)) * 31) + java.lang.Long.hashCode(this.f315792f);
    }

    /* renamed from: toString */
    public java.lang.String m124677x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("musicInfo:");
        r45.d22 d22Var = this.f315787a;
        boolean z17 = true;
        sb6.append(d22Var.m75945x2fec8307(1));
        sb6.append(',');
        sb6.append(dk2.q.e(d22Var));
        sb6.append(",url is empty:");
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(7);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        sb6.append(z17);
        sb6.append(",playStatus:");
        sb6.append(this.f315788b);
        sb6.append(",favState:");
        sb6.append(this.f315789c);
        sb6.append(", type:");
        sb6.append(this.f315790d);
        sb6.append(", select:");
        sb6.append(this.f315791e);
        return sb6.toString();
    }
}
