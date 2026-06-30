package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes9.dex */
public class i0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273223b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f273224c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273225d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f273226e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273227f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f273228g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f273229h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f273230i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f273231j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f273232k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f273233l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f273234m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f273235n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f273236o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f273237p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f273238q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f273239r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f273240s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f273241t;

    public static r45.xs4 f(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var) {
        r45.xs4 xs4Var = new r45.xs4();
        if (i0Var == null) {
            return xs4Var;
        }
        xs4Var.set(0, i0Var.f273225d);
        xs4Var.set(1, i0Var.f273226e);
        xs4Var.set(2, i0Var.f273227f);
        xs4Var.set(3, i0Var.f273228g);
        xs4Var.set(4, i0Var.f273229h);
        xs4Var.set(5, i0Var.f273230i);
        xs4Var.set(7, i0Var.f273231j);
        xs4Var.set(8, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(i0Var.f273232k)));
        xs4Var.set(9, i0Var.f273233l);
        xs4Var.set(10, java.lang.Integer.valueOf(i0Var.f273235n));
        xs4Var.set(6, i0Var.f273234m);
        xs4Var.set(12, i0Var.f273236o);
        xs4Var.set(11, i0Var.f273237p);
        xs4Var.set(16, i0Var.f273223b);
        xs4Var.set(18, java.lang.Integer.valueOf(i0Var.f273239r));
        xs4Var.set(19, i0Var.f273240s);
        xs4Var.set(20, i0Var.f273241t);
        return xs4Var;
    }

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
        i0Var.f273223b = this.f273223b;
        i0Var.f273224c = this.f273224c;
        i0Var.f273225d = this.f273225d;
        i0Var.f273226e = this.f273226e;
        i0Var.f273227f = this.f273227f;
        i0Var.f273228g = this.f273228g;
        i0Var.f273229h = this.f273229h;
        i0Var.f273230i = this.f273230i;
        i0Var.f273231j = this.f273231j;
        i0Var.f273232k = this.f273232k;
        i0Var.f273233l = this.f273233l;
        i0Var.f273234m = this.f273234m;
        i0Var.f273235n = this.f273235n;
        i0Var.f273237p = this.f273237p;
        i0Var.f273238q = this.f273238q;
        i0Var.f273240s = this.f273240s;
        i0Var.f273239r = this.f273239r;
        i0Var.f273241t = this.f273241t;
        return i0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273223b)) {
            sb6.append("<songalbumurl>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273223b));
            sb6.append("</songalbumurl>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273224c)) {
            sb6.append("<songlyric>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273224c));
            sb6.append("</songlyric>");
        }
        if (this.f273239r > 0) {
            sb6.append("<tingListenItem>");
            sb6.append("<type>");
            sb6.append(this.f273239r);
            sb6.append("</type>");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273240s)) {
                sb6.append("<listenItem>");
                sb6.append(this.f273240s);
                sb6.append("</listenItem>");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273241t)) {
                sb6.append("<listenId>");
                sb6.append(this.f273241t);
                sb6.append("</listenId>");
            }
            sb6.append("</tingListenItem>");
        }
        sb6.append("<musicShareItem>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273225d)) {
            sb6.append("<mvObjectId>");
            sb6.append(this.f273225d);
            sb6.append("</mvObjectId>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273226e)) {
            sb6.append("<mvNonceId>");
            sb6.append(this.f273226e);
            sb6.append("</mvNonceId>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273227f)) {
            sb6.append("<mvCoverUrl>");
            sb6.append(ot0.q.g(this.f273227f));
            sb6.append("</mvCoverUrl>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273228g)) {
            sb6.append("<mvMakerFinderNickname>");
            sb6.append(ot0.q.g(this.f273228g));
            sb6.append("</mvMakerFinderNickname>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273229h)) {
            sb6.append("<mvSingerName>");
            sb6.append(ot0.q.g(this.f273229h));
            sb6.append("</mvSingerName>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273230i)) {
            sb6.append("<mvAlbumName>");
            sb6.append(ot0.q.g(this.f273230i));
            sb6.append("</mvAlbumName>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273231j)) {
            sb6.append("<mvMusicGenre>");
            sb6.append(ot0.q.g(this.f273231j));
            sb6.append("</mvMusicGenre>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273232k)) {
            sb6.append("<mvIssueDate>");
            sb6.append(ot0.q.g(this.f273232k));
            sb6.append("</mvIssueDate>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273233l)) {
            sb6.append("<mvIdentification>");
            sb6.append(ot0.q.g(this.f273233l));
            sb6.append("</mvIdentification>");
        }
        sb6.append("<musicDuration>");
        sb6.append(this.f273235n);
        sb6.append("</musicDuration>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273234m)) {
            sb6.append("<mvExtInfo>");
            sb6.append(ot0.q.g(this.f273234m));
            sb6.append("</mvExtInfo>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273236o)) {
            sb6.append("<mvOperationUrl>");
            sb6.append(ot0.q.g(this.f273236o));
            sb6.append("</mvOperationUrl>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273237p)) {
            sb6.append("<mid>");
            sb6.append(ot0.q.g(this.f273237p));
            sb6.append("</mid>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273238q)) {
            sb6.append("<appIdForSourceDisplay>");
            sb6.append(ot0.q.g(this.f273238q));
            sb6.append("</appIdForSourceDisplay>");
        }
        sb6.append("</musicShareItem>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f273223b = (java.lang.String) map.get(".msg.appmsg.songalbumurl");
        this.f273224c = (java.lang.String) map.get(".msg.appmsg.songlyric");
        this.f273225d = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvObjectId");
        this.f273226e = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvNonceId");
        this.f273227f = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvCoverUrl");
        this.f273228g = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvMakerFinderNickname");
        this.f273229h = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvSingerName");
        this.f273230i = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvAlbumName");
        this.f273231j = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvMusicGenre");
        this.f273232k = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvIssueDate");
        this.f273233l = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvIdentification");
        this.f273234m = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvExtInfo");
        this.f273235n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.musicShareItem.musicDuration"), 0);
        this.f273236o = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvOperationUrl");
        this.f273237p = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mid");
        this.f273238q = (java.lang.String) map.get(".msg.appmsg.musicShareItem.appIdForSourceDisplay");
        this.f273240s = (java.lang.String) map.get(".msg.appmsg.tingListenItem.listenItem");
        this.f273239r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.tingListenItem.type"), 0);
        this.f273241t = (java.lang.String) map.get(".msg.appmsg.tingListenItem.listenId");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273223b) || this.f273239r <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273240s)) {
            return;
        }
        bw5.v70 c17 = rk4.l5.c(this.f273240s);
        java.lang.String f17 = c17 != null ? c17.f() : null;
        if (f17 == null) {
            f17 = "";
        }
        this.f273223b = f17;
    }
}
