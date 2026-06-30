package cw2;

/* loaded from: classes10.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f305463a;

    /* renamed from: b, reason: collision with root package name */
    public int f305464b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f305465c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f305466d;

    /* renamed from: e, reason: collision with root package name */
    public long f305467e;

    /* renamed from: f, reason: collision with root package name */
    public final int f305468f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f305469g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f305470h;

    /* renamed from: i, reason: collision with root package name */
    public long f305471i;

    public p6(java.lang.String mediaId, int i17, java.lang.String decodeType, java.lang.String preloadType, long j17, int i18, java.lang.String viewType, java.lang.String specType, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeType, "decodeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadType, "preloadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewType, "viewType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specType, "specType");
        this.f305463a = mediaId;
        this.f305464b = i17;
        this.f305465c = decodeType;
        this.f305466d = preloadType;
        this.f305467e = j17;
        this.f305468f = i18;
        this.f305469g = viewType;
        this.f305470h = specType;
        this.f305471i = j18;
    }

    /* renamed from: equals */
    public boolean m122917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.p6)) {
            return false;
        }
        cw2.p6 p6Var = (cw2.p6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305463a, p6Var.f305463a) && this.f305464b == p6Var.f305464b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305465c, p6Var.f305465c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305466d, p6Var.f305466d) && this.f305467e == p6Var.f305467e && this.f305468f == p6Var.f305468f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305469g, p6Var.f305469g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305470h, p6Var.f305470h) && this.f305471i == p6Var.f305471i;
    }

    /* renamed from: hashCode */
    public int m122918x8cdac1b() {
        return (((((((((((((((this.f305463a.hashCode() * 31) + java.lang.Integer.hashCode(this.f305464b)) * 31) + this.f305465c.hashCode()) * 31) + this.f305466d.hashCode()) * 31) + java.lang.Long.hashCode(this.f305467e)) * 31) + java.lang.Integer.hashCode(this.f305468f)) * 31) + this.f305469g.hashCode()) * 31) + this.f305470h.hashCode()) * 31) + java.lang.Long.hashCode(this.f305471i);
    }

    /* renamed from: toString */
    public java.lang.String m122919x9616526c() {
        return "DebugInfoData(mediaId=" + this.f305463a + ", position=" + this.f305464b + ", decodeType=" + this.f305465c + ", preloadType=" + this.f305466d + ", firstFrameTime=" + this.f305467e + ", bufferingCount=" + this.f305468f + ", viewType=" + this.f305469g + ", specType=" + this.f305470h + ", videoBitRate=" + this.f305471i + ')';
    }
}
