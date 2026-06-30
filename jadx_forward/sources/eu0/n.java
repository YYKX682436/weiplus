package eu0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final eu0.m f338252h = new eu0.m(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338253a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338254b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f338255c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f338256d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f338257e;

    /* renamed from: f, reason: collision with root package name */
    public final long f338258f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f338259g;

    public n(java.lang.String musicID, java.lang.String musicName, java.lang.String authorName, java.lang.String coverUrl, java.lang.String musicFilePath, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicID, "musicID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicName, "musicName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorName, "authorName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicFilePath, "musicFilePath");
        this.f338253a = musicID;
        this.f338254b = musicName;
        this.f338255c = authorName;
        this.f338256d = coverUrl;
        this.f338257e = musicFilePath;
        this.f338258f = j17;
        this.f338259g = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musicID", this.f338253a);
        jSONObject.put("musicName", this.f338254b);
        jSONObject.put("authorName", this.f338255c);
        jSONObject.put("coverUrl", this.f338256d);
        jSONObject.put("musicFilePath", this.f338257e);
        jSONObject.put("durationInMs", this.f338258f);
        jSONObject.put("isMusicOn", this.f338259g);
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m128193xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.n)) {
            return false;
        }
        eu0.n nVar = (eu0.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338253a, nVar.f338253a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338254b, nVar.f338254b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338255c, nVar.f338255c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338256d, nVar.f338256d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338257e, nVar.f338257e) && this.f338258f == nVar.f338258f && this.f338259g == nVar.f338259g;
    }

    /* renamed from: hashCode */
    public int m128194x8cdac1b() {
        return (((((((((((this.f338253a.hashCode() * 31) + this.f338254b.hashCode()) * 31) + this.f338255c.hashCode()) * 31) + this.f338256d.hashCode()) * 31) + this.f338257e.hashCode()) * 31) + java.lang.Long.hashCode(this.f338258f)) * 31) + java.lang.Boolean.hashCode(this.f338259g);
    }

    /* renamed from: toString */
    public java.lang.String m128195x9616526c() {
        return "ComposingCreationMusicInfo(musicID=" + this.f338253a + ", musicName=" + this.f338254b + ", authorName=" + this.f338255c + ", coverUrl=" + this.f338256d + ", musicFilePath=" + this.f338257e + ", durationInMs=" + this.f338258f + ", isMusicOn=" + this.f338259g + ')';
    }
}
