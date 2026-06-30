package xf0;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f535706a;

    /* renamed from: b, reason: collision with root package name */
    public final xf0.f f535707b;

    /* renamed from: c, reason: collision with root package name */
    public final y15.d f535708c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535709d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535710e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f535711f;

    /* renamed from: g, reason: collision with root package name */
    public final t21.v2 f535712g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f535713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f535714i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f535715j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f535716k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f535717l;

    /* renamed from: m, reason: collision with root package name */
    public xf0.e f535718m;

    /* renamed from: n, reason: collision with root package name */
    public final int f535719n;

    /* renamed from: o, reason: collision with root package name */
    public final long f535720o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f535721p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.v2 f535722q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f535723r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f535724s;

    public i(boolean z17, xf0.f videoType, y15.d videoMsg, java.lang.String videoUsername, java.lang.String mediaId, java.lang.String downloadPath, t21.v2 v2Var, boolean z18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoType, "videoType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMsg, "videoMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoUsername, "videoUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadPath, "downloadPath");
        this.f535706a = z17;
        this.f535707b = videoType;
        this.f535708c = videoMsg;
        this.f535709d = videoUsername;
        this.f535710e = mediaId;
        this.f535711f = downloadPath;
        this.f535712g = v2Var;
        this.f535713h = z18;
        this.f535714i = true;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f535715j = uuid;
        int ordinal = videoType.ordinal();
        if (ordinal == 0) {
            str = "MsgThumbVideoDownload";
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            str = "MsgOriginVideoDownload";
        }
        this.f535716k = str;
        this.f535717l = new java.util.LinkedHashMap();
        this.f535719n = 1;
        this.f535720o = -1L;
        this.f535721p = "";
        this.f535724s = true;
    }

    /* renamed from: equals */
    public boolean m175451xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0.i)) {
            return false;
        }
        xf0.i iVar = (xf0.i) obj;
        return this.f535706a == iVar.f535706a && this.f535707b == iVar.f535707b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535708c, iVar.f535708c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535709d, iVar.f535709d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535710e, iVar.f535710e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535711f, iVar.f535711f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535712g, iVar.f535712g) && this.f535713h == iVar.f535713h;
    }

    /* renamed from: hashCode */
    public int m175452x8cdac1b() {
        int hashCode = ((((((((((java.lang.Boolean.hashCode(this.f535706a) * 31) + this.f535707b.hashCode()) * 31) + this.f535708c.hashCode()) * 31) + this.f535709d.hashCode()) * 31) + this.f535710e.hashCode()) * 31) + this.f535711f.hashCode()) * 31;
        t21.v2 v2Var = this.f535712g;
        return ((hashCode + (v2Var == null ? 0 : v2Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f535713h);
    }

    /* renamed from: toString */
    public java.lang.String m175453x9616526c() {
        return "MsgVideoDownloadParams(isTp=" + this.f535706a + ", videoType=" + this.f535707b + ", videoMsg=" + this.f535708c + ", videoUsername=" + this.f535709d + ", mediaId=" + this.f535710e + ", downloadPath=" + this.f535711f + ", videoInfo=" + this.f535712g + ", notifyDB=" + this.f535713h + ')';
    }
}
