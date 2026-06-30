package vf0;

/* loaded from: classes12.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f517812a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517813b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f517814c;

    /* renamed from: d, reason: collision with root package name */
    public final int f517815d;

    /* renamed from: e, reason: collision with root package name */
    public final vf0.r2 f517816e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.h7 f517817f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f517818g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f517819h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f517820i;

    public u2(java.lang.String videoFileNamePure, java.lang.String videoPath, java.lang.String videoThumbPath, boolean z17, int i17, vf0.r2 crossParams, c01.h7 h7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFileNamePure, "videoFileNamePure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoThumbPath, "videoThumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crossParams, "crossParams");
        this.f517812a = videoPath;
        this.f517813b = videoThumbPath;
        this.f517814c = z17;
        this.f517815d = i17;
        this.f517816e = crossParams;
        this.f517817f = h7Var;
        if ((videoFileNamePure.length() > 0) && !r26.i0.y(videoFileNamePure, "NS", false)) {
            videoFileNamePure = "NS".concat(videoFileNamePure);
        }
        this.f517818g = videoFileNamePure;
        this.f517819h = jz5.h.b(new vf0.t2(this));
        this.f517820i = jz5.h.b(new vf0.s2(this));
    }

    public final boolean a() {
        c01.h7 h7Var = this.f517817f;
        if (h7Var == null || h7Var.f118760b <= 0) {
            return false;
        }
        java.lang.String str = h7Var.f118762d;
        return str != null && (r26.n0.N(str) ^ true);
    }

    /* renamed from: toString */
    public java.lang.String m171811x9616526c() {
        return "VideoSendElement(videoFileName='" + this.f517818g + "', videoPath='" + this.f517812a + "', videoThumbPath='" + this.f517813b + "', sendRawVideo=" + this.f517814c + ", videoFileLength=" + this.f517815d + ", crossParams=" + this.f517816e + ", forwardInfo=" + this.f517817f + ')';
    }

    public /* synthetic */ u2(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, vf0.r2 r2Var, c01.h7 h7Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? "" : str3, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? 0 : i17, (i18 & 32) != 0 ? new vf0.r2(null, null, null, null, null, null, false, null, null, null, false, false, 4095, null) : r2Var, (i18 & 64) != 0 ? null : h7Var);
    }
}
