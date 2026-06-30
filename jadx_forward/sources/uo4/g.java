package uo4;

/* loaded from: classes10.dex */
public final class g extends uo4.f {

    /* renamed from: g, reason: collision with root package name */
    public int f511223g;

    /* renamed from: h, reason: collision with root package name */
    public int f511224h;

    /* renamed from: q, reason: collision with root package name */
    public long f511233q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f511234r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f511236t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f511237u;

    /* renamed from: d, reason: collision with root package name */
    public float f511220d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f511221e = 1;

    /* renamed from: f, reason: collision with root package name */
    public float f511222f = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f511225i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f511226j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f511227k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f511228l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f511229m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f511230n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f511231o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f511232p = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f511235s = "";

    @Override // uo4.f, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        float f17 = this.f511222f;
        if (!(f17 == 1.0f)) {
            b17.put("playRate", java.lang.Float.valueOf(f17));
        }
        b17.put("duration", this.f511233q);
        b17.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.Float.valueOf(this.f511220d));
        b17.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f511221e);
        b17.put("audioSampleRate", this.f511223g);
        b17.put("audioBitrate", this.f511224h);
        b17.put("videoMime", this.f511225i);
        b17.put("audioMime", this.f511226j);
        b17.put("useHdrTransfer", this.f511234r);
        b17.put("audioType", this.f511227k);
        b17.put("videoType", this.f511228l);
        b17.put("videoCodeCTAG", this.f511229m);
        b17.put("audioCodeCTAG", this.f511230n);
        b17.put("hasAudioTrack", this.f511236t);
        b17.put("hasVideoTrack", this.f511237u);
        b17.put("videoCodeCName", this.f511231o);
        b17.put("audioCodeCName", this.f511232p);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511235s, "")) {
            b17.put("maxAlignment", this.f511235s);
        }
        return b17;
    }
}
