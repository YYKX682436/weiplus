package ot0;

/* loaded from: classes9.dex */
public class f extends ot0.h {

    /* renamed from: l, reason: collision with root package name */
    public ot0.m1 f429998l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f430000n;

    /* renamed from: o, reason: collision with root package name */
    public int f430001o;

    /* renamed from: p, reason: collision with root package name */
    public int f430002p;

    /* renamed from: b, reason: collision with root package name */
    public int f429988b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f429989c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f429990d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f429991e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f429992f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f429993g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f429994h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f429995i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f429996j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f429997k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f429999m = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f430003q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f430004r = "0";

    public static boolean f(int i17) {
        return i17 == 5 || i17 == 16;
    }

    @Override // ot0.h
    public ot0.h a() {
        int i17 = this.f429988b;
        if (i17 == -1 && !this.f429997k && this.f429999m != 1) {
            return null;
        }
        ot0.f fVar = new ot0.f();
        fVar.f429988b = i17;
        fVar.f429989c = this.f429989c;
        fVar.f429990d = this.f429990d;
        fVar.f429991e = this.f429991e;
        fVar.f429992f = this.f429992f;
        fVar.f429993g = this.f429993g;
        fVar.f429996j = this.f429996j;
        fVar.f429995i = this.f429995i;
        fVar.f429997k = this.f429997k;
        fVar.f429998l = this.f429998l;
        fVar.f429994h = this.f429994h;
        fVar.f429999m = this.f429999m;
        fVar.f430000n = this.f430000n;
        fVar.f430001o = this.f430001o;
        fVar.f430002p = this.f430002p;
        fVar.f430003q = this.f430003q;
        fVar.f430004r = this.f430004r;
        return fVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        java.lang.String str2;
        if (this.f429988b != -1 || this.f429999m == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429996j)) {
                this.f429993g = 1;
            }
            sb6.append("<mmreadershare>");
            sb6.append("<itemshowtype>");
            sb6.append(this.f429988b);
            sb6.append("</itemshowtype>");
            sb6.append("<ispaysubscribe>");
            sb6.append(this.f429994h);
            sb6.append("</ispaysubscribe>");
            if (this.f429999m == 1) {
                sb6.append("<showsourceinfo>");
                sb6.append(this.f429999m);
                sb6.append("</showsourceinfo>");
            }
            if (f(this.f429988b)) {
                sb6.append("<pubtime>");
                sb6.append(this.f429989c);
                sb6.append("</pubtime>");
                sb6.append("<duration>");
                sb6.append(this.f429990d);
                sb6.append("</duration>");
                sb6.append("<width>");
                sb6.append(this.f429991e);
                sb6.append("</width>");
                sb6.append("<height>");
                sb6.append(this.f429992f);
                sb6.append("</height>");
                sb6.append("<nativepage>");
                sb6.append(this.f429993g);
                sb6.append("</nativepage>");
                sb6.append("<funcflag>");
                sb6.append(this.f429995i);
                sb6.append("</funcflag>");
                sb6.append("<vid>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f429996j));
                sb6.append("</vid>");
                java.lang.String str3 = this.f430000n;
                if (str3 != null && !str3.isEmpty() && this.f430001o > 0 && this.f430002p > 0) {
                    sb6.append("<coverpicimageurl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430000n));
                    sb6.append("</coverpicimageurl>");
                    sb6.append("<coverpicwidth>");
                    sb6.append(this.f430001o);
                    sb6.append("</coverpicwidth>");
                    sb6.append("<coverpicheight>");
                    sb6.append(this.f430002p);
                    sb6.append("</coverpicheight>");
                    sb6.append("<isfindercontact>");
                    sb6.append(this.f430004r);
                    sb6.append("</isfindercontact>");
                }
            }
            if (this.f429988b == 8 && (str2 = this.f430000n) != null && !str2.isEmpty() && this.f430001o > 0 && this.f430002p > 0 && this.f430003q > 0) {
                sb6.append("<coverpicimageurl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430000n));
                sb6.append("</coverpicimageurl>");
                sb6.append("<coverpicwidth>");
                sb6.append(this.f430001o);
                sb6.append("</coverpicwidth>");
                sb6.append("<coverpicheight>");
                sb6.append(this.f430002p);
                sb6.append("</coverpicheight>");
                sb6.append("<piccount>");
                sb6.append(this.f430003q);
                sb6.append("</piccount>");
                sb6.append("<isfindercontact>");
                sb6.append(this.f430004r);
                sb6.append("</isfindercontact>");
            }
            sb6.append("</mmreadershare>");
        }
        if (!this.f429997k || this.f429998l == null) {
            return;
        }
        sb6.append("<mmbrandmpvideo>");
        sb6.append("<vid>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f429998l.f454874f));
        sb6.append("</vid>");
        sb6.append("<videourl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f429998l.f454873e));
        sb6.append("</videourl>");
        sb6.append("<mpurl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f429998l.f454872d));
        sb6.append("</mpurl>");
        sb6.append("<thumbwidth>");
        sb6.append(this.f429998l.f454878m);
        sb6.append("</thumbwidth>");
        sb6.append("<thumbheight>");
        sb6.append(this.f429998l.f454879n);
        sb6.append("</thumbheight>");
        sb6.append("<duration>");
        sb6.append(this.f429998l.f454877i);
        sb6.append("</duration>");
        sb6.append("</mmbrandmpvideo>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f429994h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.ispaysubscribe"), 0);
        this.f429988b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.itemshowtype"), -1);
        this.f429999m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.showsourceinfo"), 0);
        int i17 = this.f429988b;
        if (i17 == 5 || i17 == 16) {
            this.f429989c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.pubtime"), 0);
            this.f429990d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.duration"), 0);
            this.f429991e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.width"), 0);
            this.f429992f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.height"), 0);
            this.f429993g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.nativepage"), 0);
            this.f429995i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.funcflag"), 0);
            this.f429996j = (java.lang.String) map.get(".msg.appmsg.mmreadershare.vid");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.mpurl")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.videourl"))) {
            this.f429997k = true;
            ot0.m1 m1Var = new ot0.m1();
            this.f429998l = m1Var;
            m1Var.f454874f = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.vid");
            this.f429998l.f454873e = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.videourl");
            this.f429998l.f454872d = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.mpurl");
            this.f429998l.f454876h = (java.lang.String) map.get(".msg.appmsg.thumburl");
            this.f429998l.f454875g = (java.lang.String) map.get(".msg.appmsg.title");
            this.f429998l.f454880o = (java.lang.String) map.get(".msg.appmsg.url");
            this.f429998l.f454881p = (java.lang.String) map.get(".msg.appmsg.sourceusername");
            this.f429998l.f454882q = (java.lang.String) map.get(".msg.appmsg.sourcedisplayname");
            this.f429998l.f454877i = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.duration"), 0.0f);
            this.f429998l.f454878m = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.thumbwidth"), 0.0f);
            this.f429998l.f454879n = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.thumbheight"), 0.0f);
        }
        if (this.f429988b == 8 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.piccount"))) {
            this.f430000n = (java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl");
            this.f430001o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth"), 0);
            this.f430002p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"), 0);
            this.f430003q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.piccount"), 0);
            this.f430004r = (java.lang.String) map.get(".msg.appmsg.mmreadershare.isfindercontact");
        }
        if (!f(this.f429988b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"))) {
            return;
        }
        this.f430000n = (java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl");
        this.f430001o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth"), 0);
        this.f430002p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"), 0);
        this.f430004r = (java.lang.String) map.get(".msg.appmsg.mmreadershare.isfindercontact");
    }
}
