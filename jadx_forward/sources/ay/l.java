package ay;

/* loaded from: classes14.dex */
public final class l extends ay.i {

    /* renamed from: n, reason: collision with root package name */
    public final xx.y f96693n;

    /* renamed from: o, reason: collision with root package name */
    public int f96694o;

    /* renamed from: p, reason: collision with root package name */
    public int f96695p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f96696q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f96697r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f96698s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96699t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f96700u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f96701v;

    /* renamed from: w, reason: collision with root package name */
    public int f96702w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f96703x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jy.m screenInfo, xx.y dataReporter) {
        super(screenInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataReporter, "dataReporter");
        this.f96693n = dataReporter;
        this.f96696q = new p012xc85e97e9.p093xedfae76a.j0();
        this.f96697r = new p012xc85e97e9.p093xedfae76a.j0();
        this.f96698s = new p012xc85e97e9.p093xedfae76a.j0();
        this.f96699t = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        this.f96702w = -1;
        java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    @Override // wx.g1
    public void J6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        this.f96697r.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        this.f96693n.d();
    }

    public final void P6(boolean z17) {
        this.f96703x = z17;
        jz5.g gVar = this.f96684f;
        if (z17) {
            ((gy.c) ((jz5.n) gVar).mo141623x754a37bb()).f();
        } else {
            ((gy.c) ((jz5.n) gVar).mo141623x754a37bb()).e();
        }
    }

    public final void Q6(boolean z17, boolean z18) {
        long parseLong;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96683e, " startPullQueryList");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b17 = this.f96682d.f384006d.b();
        if (b17 != null) {
            try {
                java.lang.String str = b17.f298027i[5] ? b17.f298026h : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getStringBizuin(...)");
                byte[] decode = android.util.Base64.decode(str, 0);
                if (decode != null) {
                    str = new java.lang.String(decode, r26.c.f450398a);
                }
                parseLong = java.lang.Long.parseLong(r26.n0.u0(str).toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBotBrandDataReporter", e17.getMessage(), e17);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0 w0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k();
            kVar.f297847e = 0L;
            boolean[] zArr = kVar.f297849g;
            zArr[2] = true;
            kVar.f297846d = parseLong;
            zArr[1] = true;
            kVar.f297848f = false;
            zArr[3] = true;
            w0Var.e(kVar, new ay.k(this, z18));
        }
        parseLong = 0;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0 w0Var2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k kVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k();
        kVar2.f297847e = 0L;
        boolean[] zArr2 = kVar2.f297849g;
        zArr2[2] = true;
        kVar2.f297846d = parseLong;
        zArr2[1] = true;
        kVar2.f297848f = false;
        zArr2[3] = true;
        w0Var2.e(kVar2, new ay.k(this, z18));
    }

    @Override // wx.g1
    public void Qc(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96683e, "onRoomMemberChange memberCount:" + i17);
        this.f96694o = i17 + (-1);
        R6();
    }

    public final void R6() {
        java.lang.String str;
        int i17 = this.f96694o;
        if (i17 <= 0) {
            str = "";
        } else if (this.f96695p > 0) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n77, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f96695p));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n78, java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        this.f96696q.mo7808x76db6cb1(str);
        xx.z zVar = this.f96693n.f539373m;
        zVar.f539378c = this.f96694o;
        int i18 = this.f96695p;
        zVar.f539379d = i18;
        zVar.f539377b = java.lang.Math.abs(i18 - this.f96702w);
    }

    @Override // wx.g1
    public void X8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96683e, "onTalkSucc");
        this.f96693n.i(0L);
    }

    @Override // wx.g1
    public void Yb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        this.f96697r.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        this.f96693n.e(xx.e.f539317e);
    }

    @Override // ay.i, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        java.lang.String str;
        super.mo528x82b764cd();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96697r.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
            xx.e eVar = xx.e.f539319g;
            boolean z17 = this.f96700u;
            ay.w wVar = (ay.w) this.f96698s.mo3195x754a37bb();
            if (wVar == null || (str = wVar.f96725a) == null) {
                str = "";
            }
            this.f96693n.f(eVar, z17, str);
        }
    }
}
