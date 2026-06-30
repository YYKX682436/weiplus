package ot0;

/* loaded from: classes9.dex */
public class b extends ot0.h {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f429909b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f429910c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f429911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f429912e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f429913f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f429914g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f429915h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f429916i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f429917j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f429918k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f429919l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f429920m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f429921n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f429922o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f429923p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f429924q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f429925r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f429926s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f429927t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f429928u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f429929v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f429930w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f429931x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f429932y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f429933z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.b();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        int i17 = qVar.f430199i;
        if (i17 == 2002 || i17 == 2003) {
            f(map, "templateid");
            f(map, "senderurl");
            this.f429909b = f(map, "sendernativeurl");
            f(map, "receiverurl");
            this.f429910c = f(map, "receivernativeurl");
            this.f429911d = f(map, "iconurl");
            this.f429912e = f(map, "darkiconurl");
            f(map, "miniiconurl");
            f(map, "backgroundurl");
            f(map, "backgroundname");
            f(map, "backgroundcolor");
            this.f429913f = f(map, "receivertitle");
            this.f429914g = f(map, "sendertitle");
            this.f429918k = f(map, "senderdes");
            this.f429919l = f(map, "receiverdes");
            f(map, "sceneid");
            this.f429921n = f(map, "paymsgid");
            this.f429915h = f(map, "titlecolor");
            this.f429928u = f(map, "titlecolordark");
            this.f429929v = f(map, "realtitlecolordark");
            this.f429920m = f(map, "descolor");
            this.f429930w = f(map, "descolordark");
            this.f429931x = f(map, "realdescolordark");
            this.f429916i = f(map, "senderscenetext");
            this.f429917j = f(map, "receiverscenetext");
            this.f429933z = f(map, "scenetextcolor");
            this.f429932y = f(map, "scenetextcolordark");
            this.f429922o = f(map, "senderbackgroundname");
            this.f429923p = f(map, "senderbackgroundurl");
            this.f429924q = f(map, "senderbackgroundurldark");
            this.f429925r = f(map, "receiverbackgroundname");
            this.f429926s = f(map, "receiverbackgroundurl");
            this.f429927t = f(map, "receiverbackgroundurldark");
            f(map, "seperatorcolor");
            f(map, "seperatorcolordark");
            this.A = f(map, "thirdc2crouteinfo");
            this.B = f(map, "senderrouteinfo");
            this.C = f(map, "receiverrouteinfo");
        }
    }

    public final java.lang.String f(java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.wcpaythirdinfo." + str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }
}
