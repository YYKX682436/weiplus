package fm3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final fm3.c f345568f = new fm3.c(null);

    /* renamed from: g, reason: collision with root package name */
    public static int f345569g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345572c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345573d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f345574e;

    public d(java.lang.String name, int i17, int i18, long j17, java.lang.String thumbPath, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        thumbPath = (i19 & 16) != 0 ? "" : thumbPath;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        this.f345570a = name;
        this.f345571b = i17;
        this.f345572c = i18;
        this.f345573d = j17;
        this.f345574e = thumbPath;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_default_video/");
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(new com.p314xaae8f345.mm.vfs.r6(sb6.toString(), this.f345570a).o(), false);
        return i17 == null ? "" : i17;
    }
}
