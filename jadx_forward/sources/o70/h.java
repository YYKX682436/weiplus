package o70;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f424766a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f424767b;

    /* renamed from: c, reason: collision with root package name */
    public int f424768c;

    /* renamed from: d, reason: collision with root package name */
    public int f424769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f424770e;

    /* renamed from: f, reason: collision with root package name */
    public long f424771f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f424772g;

    /* renamed from: h, reason: collision with root package name */
    public int f424773h;

    /* renamed from: i, reason: collision with root package name */
    public final int f424774i;

    /* renamed from: j, reason: collision with root package name */
    public final int f424775j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f424776k;

    /* renamed from: l, reason: collision with root package name */
    public o70.j f424777l;

    public h(com.p314xaae8f345.mm.vfs.r6 preBuildFolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preBuildFolder, "preBuildFolder");
        this.f424766a = preBuildFolder;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f424767b = uuid;
        this.f424770e = "";
        this.f424772g = "";
        this.f424774i = com.p314xaae8f345.mm.R.C30861xcebc809e.bzt;
        this.f424775j = -1;
    }

    public final void a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f424770e = str;
    }

    public final void b(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f424767b = str;
    }

    /* renamed from: toString */
    public java.lang.String m150704x9616526c() {
        return "PreBuildParams(source=" + this.f424768c + ", rotateCount=" + this.f424769d + ", imgId='" + this.f424771f + "' imgPath='" + this.f424770e + "', toUserName='" + this.f424772g + "', compressType=" + this.f424773h + ", resId=" + this.f424774i + ", backgroundColor=" + this.f424775j + ')';
    }
}
