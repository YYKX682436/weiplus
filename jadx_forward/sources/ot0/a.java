package ot0;

/* loaded from: classes9.dex */
public class a extends ot0.h {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public p15.x P;
    public boolean Q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f429879b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f429880c;

    /* renamed from: d, reason: collision with root package name */
    public int f429881d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f429882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f429883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f429884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f429885h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f429886i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f429887j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f429888k;

    /* renamed from: l, reason: collision with root package name */
    public int f429889l;

    /* renamed from: m, reason: collision with root package name */
    public int f429890m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f429894q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f429897t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f429898u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f429900w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f429901x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f429902y;

    /* renamed from: z, reason: collision with root package name */
    public int f429903z;

    /* renamed from: n, reason: collision with root package name */
    public int f429891n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f429892o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f429893p = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f429895r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f429896s = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f429899v = 0;
    public int D = 0;
    public java.lang.String E = "";
    public java.lang.String F = "";
    public java.lang.String G = "";
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f429878J = "";
    public boolean K = false;
    public int L = -1;
    public java.lang.String M = "";
    public int N = 0;
    public int O = 0;
    public java.lang.String R = "";
    public java.lang.String S = "";
    public java.lang.String T = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.a aVar = new ot0.a();
        aVar.f429879b = this.f429879b;
        aVar.f429880c = this.f429880c;
        aVar.f429881d = this.f429881d;
        aVar.f429882e = this.f429882e;
        aVar.f429883f = this.f429883f;
        aVar.f429884g = this.f429884g;
        aVar.f429885h = this.f429885h;
        aVar.f429886i = this.f429886i;
        aVar.f429887j = this.f429887j;
        aVar.f429889l = this.f429889l;
        aVar.f429890m = this.f429890m;
        aVar.f429891n = this.f429891n;
        aVar.f429898u = this.f429898u;
        aVar.f429899v = this.f429899v;
        aVar.A = this.A;
        aVar.f429903z = this.f429903z;
        aVar.B = this.B;
        aVar.C = this.C;
        aVar.D = this.D;
        aVar.E = this.E;
        aVar.G = this.G;
        aVar.H = this.H;
        aVar.I = this.I;
        aVar.f429878J = this.f429878J;
        aVar.f429892o = this.f429892o;
        aVar.f429893p = this.f429893p;
        aVar.f429894q = this.f429894q;
        aVar.f429895r = this.f429895r;
        aVar.f429896s = this.f429896s;
        aVar.K = this.K;
        aVar.f429901x = this.f429901x;
        aVar.L = this.L;
        aVar.M = this.M;
        aVar.N = this.N;
        aVar.P = this.P;
        aVar.R = this.R;
        aVar.Q = this.Q;
        aVar.O = this.O;
        aVar.S = this.S;
        aVar.T = this.T;
        return aVar;
    }

    @Override // ot0.h
    public void b(dn.m mVar, ot0.q qVar) {
        if (qVar.f430199i == 48 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E)) {
            mVar.f69580x454032b6 = 213;
            mVar.f69595x6d25b0d9 = this.E;
            mVar.f69593x419c9c3d = this.F;
            mVar.f69592xf1ebe47b = 20302;
            mVar.f69620xeb1a61d6 = (int) com.p314xaae8f345.mm.vfs.w6.k(r4);
            mVar.f69606xccdbf540 = true;
            mVar.f69597x853bb235 = false;
            mVar.f69594x4b409164 = false;
            mVar.f69621xf91593ca = true;
            mVar.f69584x89a4c0cf = 2;
        }
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<weappinfo>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430202i2)) {
            sb6.append("<pagepath>" + ot0.q.g(qVar.f430202i2) + "</pagepath>");
        }
        sb6.append("<username>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qVar.f430206j2) + "</username>");
        sb6.append("<appid>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qVar.f430210k2) + "</appid>");
        if (qVar.A2 != 0) {
            sb6.append("<version>" + qVar.A2 + "</version>");
        }
        if (qVar.f430214l2 != 0) {
            sb6.append("<type>" + qVar.f430214l2 + "</type>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.B2)) {
            sb6.append("<weappiconurl>" + ot0.q.g(qVar.B2) + "</weappiconurl>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429901x)) {
            sb6.append("<weapppagethumbrawurl>" + ot0.q.g(this.f429901x) + "</weapppagethumbrawurl>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430222n2)) {
            sb6.append("<shareId>" + ot0.q.g(qVar.f430222n2) + "</shareId>");
        }
        int i19 = qVar.f430270z2;
        if (i19 == 1 || i19 == 2) {
            sb6.append("<pkginfo>");
            sb6.append("<type>");
            sb6.append(qVar.f430270z2);
            sb6.append("</type>");
            sb6.append("<md5>");
            sb6.append(qVar.f430218m2);
            sb6.append("</md5>");
            sb6.append("</pkginfo>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430226o2)) {
            sb6.append("<sharekey>" + ot0.q.g(qVar.f430226o2) + "</sharekey>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429898u)) {
            sb6.append("<messageextradata>");
            sb6.append(ot0.q.g(this.f429898u));
            sb6.append("</messageextradata>");
        }
        if (this.f429879b) {
            sb6.append("<wadynamicpageinfo>");
            sb6.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
            sb6.append("<cacheKey>");
            sb6.append(ot0.q.g(this.f429880c));
            sb6.append("</cacheKey>");
            sb6.append("</wadynamicpageinfo>");
        }
        if (this.f429882e || this.Q) {
            sb6.append("<waupdatablemsginfov3>");
            if (this.f429882e) {
                sb6.append("<shoulduseupdatablemsg>1</shoulduseupdatablemsg>");
            } else {
                sb6.append("<shoulduseupdatablemsg>0</shoulduseupdatablemsg>");
            }
            if (this.Q) {
                sb6.append("<shouldusechattoolmsg>1</shouldusechattoolmsg>");
            } else {
                sb6.append("<shouldusechattoolmsg>0</shouldusechattoolmsg>");
            }
            sb6.append("<updatablemsgperiod>");
            sb6.append(this.f429889l);
            sb6.append("</updatablemsgperiod>");
            sb6.append("<updatablemsgstate>");
            sb6.append(this.f429890m);
            sb6.append("</updatablemsgstate>");
            sb6.append("<updatablemsgcontent>");
            sb6.append(ot0.q.g(this.f429883f));
            sb6.append("</updatablemsgcontent>");
            sb6.append("<updatablemsgcontentcolor>");
            sb6.append(ot0.q.g(this.f429884g));
            sb6.append("</updatablemsgcontentcolor>");
            sb6.append("<subscribeentrycontent>");
            sb6.append(ot0.q.g(this.f429885h));
            sb6.append("</subscribeentrycontent>");
            sb6.append("<subscribeentrybuttonwording>");
            sb6.append(ot0.q.g(this.f429886i));
            sb6.append("</subscribeentrybuttonwording>");
            sb6.append("<subscribeconfirmedcontent>");
            sb6.append(ot0.q.g(this.f429887j));
            sb6.append("</subscribeconfirmedcontent>");
            sb6.append("<expiredsubscribewording>");
            sb6.append(ot0.q.g(this.f429888k));
            sb6.append("</expiredsubscribewording>");
            sb6.append("<updatablemsgtype>");
            sb6.append(this.f429891n);
            sb6.append("</updatablemsgtype>");
            sb6.append("</waupdatablemsginfov3>");
        }
        sb6.append("<appservicetype>" + this.f429881d + "</appservicetype>");
        if (qVar.f430238r2 != 0) {
            sb6.append("<disableforward>" + qVar.f430238r2 + "</disableforward>");
        }
        sb6.append("<secflagforsinglepagemode>" + qVar.f430250u2 + "</secflagforsinglepagemode>");
        if (qVar.s(true)) {
            sb6.append("<nativeappinfo>");
            sb6.append("<type>" + qVar.f430230p2 + "</type>");
            sb6.append("<appnamemultilanguagekey>" + ot0.q.g(qVar.f430234q2) + "</appnamemultilanguagekey>");
            sb6.append("<sourcename>" + ot0.q.g(qVar.f430242s2) + "</sourcename>");
            sb6.append("<sourceiconurl>" + ot0.q.g(qVar.f430246t2) + "</sourceiconurl>");
            sb6.append("</nativeappinfo>");
        }
        sb6.append("<videopageinfo>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<thumbwidth>");
        if (i17 == 0) {
            i17 = this.f429903z;
        }
        sb7.append(i17);
        sb7.append("</thumbwidth>");
        sb6.append(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<thumbheight>");
        if (i18 == 0) {
            i18 = this.A;
        }
        sb8.append(i18);
        sb8.append("</thumbheight>");
        sb6.append(sb8.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            sb6.append("<videosource>" + ot0.q.g(this.B) + "</videosource>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            sb6.append("<appthumburl>" + ot0.q.g(this.C) + "</appthumburl>");
        }
        sb6.append("<fromopensdk>" + this.D + "</fromopensdk>");
        sb6.append("</videopageinfo>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E)) {
            sb6.append("<screenvideoinfo>");
            sb6.append("<videobuttontext>");
            sb6.append(ot0.q.g(this.H));
            sb6.append("</videobuttontext>");
            if (hVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69524x419c440e)) {
                com.p314xaae8f345.mm.vfs.w6.h(this.E);
                this.G = hVar.f69524x419c440e;
                this.F = hVar.f69526x419c9c3d;
                this.I = hVar.f69560x7b284d5e;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
                sb6.append("<videotemplocalpath>");
                sb6.append(ot0.q.g(this.E));
                sb6.append("</videotemplocalpath>");
            }
            sb6.append("<videomd5>");
            sb6.append(ot0.q.g(this.F));
            sb6.append("</videomd5>");
            sb6.append("<videoremoteurl>");
            sb6.append(ot0.q.g(this.G));
            sb6.append("</videoremoteurl>");
            sb6.append("<videothumburl>");
            sb6.append(ot0.q.g(this.I));
            sb6.append("</videothumburl>");
            sb6.append("<videoplaydesc>");
            sb6.append(ot0.q.g(this.f429878J));
            sb6.append("</videoplaydesc>");
            sb6.append("</screenvideoinfo>");
        }
        if (this.f429892o != 0) {
            sb6.append("<tradingguaranteeflag>");
            sb6.append(this.f429892o);
            sb6.append("</tradingguaranteeflag>");
        }
        if (this.f429893p != 0) {
            sb6.append("<showRelievedBuyFlag>");
            sb6.append(this.f429893p);
            sb6.append("</showRelievedBuyFlag>");
        }
        if (this.f429894q) {
            sb6.append("<hasRelievedBuyPlugin>1</hasRelievedBuyPlugin>");
        }
        if (this.f429895r != 0) {
            sb6.append("<showFlagshipFlag>");
            sb6.append(this.f429895r);
            sb6.append("</showFlagshipFlag>");
        }
        if (this.f429896s != 0) {
            sb6.append("<showFinancialLicenseFlag>");
            sb6.append(this.f429896s);
            sb6.append("</showFinancialLicenseFlag>");
        }
        if (this.f429899v != 0) {
            sb6.append("<subType>");
            sb6.append(this.f429899v);
            sb6.append("</subType>");
        }
        if (this.L >= 0) {
            sb6.append("<wxaTradeCommentScore>");
            sb6.append(this.L);
            sb6.append("</wxaTradeCommentScore>");
        }
        if (!android.text.TextUtils.isEmpty(this.M)) {
            sb6.append("<registerBody>");
            sb6.append(ot0.q.g(this.M));
            sb6.append("</registerBody>");
        }
        if (this.N > 0) {
            sb6.append("<certificationImageType>");
            sb6.append(this.N);
            sb6.append("</certificationImageType>");
        }
        if (this.O > 0) {
            sb6.append("<launchscene>");
            sb6.append(this.O);
            sb6.append("</launchscene>");
        }
        if (!android.text.TextUtils.isEmpty(this.f429897t)) {
            sb6.append("<todoactivityid>");
            sb6.append(ot0.q.g(this.f429897t));
            sb6.append("</todoactivityid>");
        }
        sb6.append("</weappinfo>");
        if (this.K) {
            sb6.append("<roomtoolsflag>1</roomtoolsflag>");
        }
        if (this.f429900w) {
            sb6.append("<isprivatemessage>1</isprivatemessage>");
        }
        p15.x xVar = this.P;
        if (xVar != null) {
            sb6.append(xVar.m126748x696739c(true));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T)) {
            return;
        }
        sb6.append("<wxchatbot>");
        sb6.append("<wxapplite>");
        sb6.append("<litepage>");
        sb6.append("<cdninfo>");
        sb6.append("<aeskey>");
        sb6.append(this.T);
        sb6.append("</aeskey>");
        sb6.append("<fileid>");
        sb6.append(this.S);
        sb6.append("</fileid>");
        sb6.append("</cdninfo>");
        sb6.append("</litepage>");
        sb6.append("</wxapplite>");
        sb6.append("</wxchatbot>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f429879b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1;
        this.f429880c = (java.lang.String) map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey");
        this.f429881d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.appservicetype"), this.f429881d);
        this.f429898u = (java.lang.String) map.get(".msg.appmsg.weappinfo.messageextradata");
        this.f429899v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.subType"), this.f429899v);
        this.f429882e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shoulduseupdatablemsg"), 0) == 1;
        this.Q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shouldusechattoolmsg"), 0) == 1;
        this.f429883f = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontent");
        this.f429884g = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontentcolor");
        this.f429885h = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrycontent");
        this.f429886i = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrybuttonwording");
        this.f429887j = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeconfirmedcontent");
        this.f429888k = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.expiredsubscribewording");
        this.f429890m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgstate"), 1);
        this.f429889l = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgperiod"), 10L);
        this.f429891n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgtype"), 0);
        this.f429903z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.thumbwidth"), 0);
        this.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.thumbheight"), 0);
        this.B = (java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.videosource");
        this.C = (java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.appthumburl");
        this.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.fromopensdk"), 0);
        this.E = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videotemplocalpath");
        this.F = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videomd5");
        this.G = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoremoteurl");
        this.H = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videobuttontext");
        this.I = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videothumburl");
        this.f429878J = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoplaydesc");
        this.f429892o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.tradingguaranteeflag"), 0);
        this.f429893p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showRelievedBuyFlag"), 0);
        this.f429894q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.hasRelievedBuyPlugin"), 0) == 1;
        this.f429895r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showFlagshipFlag"), 0);
        this.f429896s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showFinancialLicenseFlag"), 0);
        this.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.wxaTradeCommentScore"), -1);
        this.M = (java.lang.String) map.get(".msg.appmsg.weappinfo.registerBody");
        this.N = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.certificationImageType"), -1);
        this.f429897t = (java.lang.String) map.get(".msg.appmsg.weappinfo.todoactivityid");
        this.K = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.roomtoolsflag"), 0) == 1;
        this.f429900w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.isprivatemessage"), 0) == 1;
        this.f429901x = (java.lang.String) map.get(".msg.appmsg.weappinfo.weapppagethumbrawurl");
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wxaInfo.appId");
        this.O = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.launchscene"), 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p15.x xVar = new p15.x();
            this.P = xVar;
            xVar.p(str);
            this.P.u((java.lang.String) map.get(".msg.appmsg.wxaInfo.nickname"));
            this.P.t((java.lang.String) map.get(".msg.appmsg.wxaInfo.iconUrl"));
            this.P.q((java.lang.String) map.get(".msg.appmsg.wxaInfo.enterPath"));
            this.P.s((java.lang.String) map.get(".msg.appmsg.wxaInfo.forwardSceneNote"));
            this.P.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wxaInfo.showSourceView"), 0));
            this.P.x(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wxaInfo.versionType"), 0));
        }
        this.T = (java.lang.String) map.get(".msg.appmsg.wxchatbot.wxapplite.litepage.cdninfo.aeskey");
        this.S = (java.lang.String) map.get(".msg.appmsg.wxchatbot.wxapplite.litepage.cdninfo.fileid");
    }

    @Override // ot0.h
    public void e(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar == null || qVar.f430199i != 48) {
            return;
        }
        java.lang.String str2 = qVar.f430210k2;
        if (hVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69524x419c440e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69560x7b284d5e)) {
            return;
        }
        try {
            java.lang.String str3 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/cgi-bin/h5/static/minigame/video/index.html?url=%s&cover=%s&appid=%s&extWording=%s&btnWording=%s&shareTitle=%s";
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = fp.s0.b(hVar.f69524x419c440e, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            objArr[1] = fp.s0.b(hVar.f69560x7b284d5e, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            objArr[2] = fp.s0.b(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            objArr[3] = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430191g) ? fp.s0.b(qVar.f430191g, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) : "";
            objArr[4] = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H) ? fp.s0.b(this.H, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) : "";
            objArr[5] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430187f) ? "" : fp.s0.b(qVar.f430187f, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String format = java.lang.String.format(str3, objArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentAppBrandPiece", "hy: formatted url is %s", format);
            qVar.f430207k = format;
            java.lang.String str4 = hVar.f69560x7b284d5e;
            qVar.f430267z = str4;
            qVar.M = str4;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentAppBrandPiece", e17, "hy: not support utf-8!", new java.lang.Object[0]);
        }
    }
}
