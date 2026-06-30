package dk5;

/* loaded from: classes12.dex */
public class n1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public boolean f316276d = false;

    /* renamed from: e, reason: collision with root package name */
    public dn.h f316277e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f316278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316280h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316281i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316282m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f316283n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f316284o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f316285p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316286q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316287r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316288s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316289t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316290u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f316291v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f316292w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316293x;

    public n1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i27, t21.v2 v2Var) {
        this.f316293x = activityC22567x42e895b8;
        this.f316279g = str;
        this.f316280h = str2;
        this.f316281i = str3;
        this.f316282m = str4;
        this.f316283n = i17;
        this.f316284o = i18;
        this.f316285p = i19;
        this.f316286q = str5;
        this.f316287r = str6;
        this.f316288s = str7;
        this.f316289t = str8;
        this.f316290u = str9;
        this.f316291v = i27;
        this.f316292w = v2Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        dn.h hVar2;
        dn.h hVar3;
        if (hVar == null) {
            return 0;
        }
        boolean z18 = hVar.f69521xc9ff4d81;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316293x;
        if (!z18) {
            if (!this.f316276d) {
                int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
                activityC22567x42e895b8.T6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "not support second!! dealDownloadVideo");
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "origin video not support second!! dealDownloadVideo, go ahead normal video");
            if (this.f316277e == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f316278f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "temp result is null, some thing wrong in process");
            } else {
                m11.m1 i19 = m11.m1.i();
                i19.f523674p = this.f316278f;
                i19.f404285q = 0;
                i19.f404286r = this.f316277e;
                i19.f404287s = new dk5.m1(this);
                i19.f523667i = 4;
                i19.a().a();
            }
            activityC22567x42e895b8.finish();
            return 0;
        }
        boolean z19 = this.f316276d;
        java.lang.String str3 = this.f316280h;
        java.lang.String str4 = this.f316279g;
        hVar.f69522xf9dbbe9c = z19 ? str4 : str3;
        java.lang.String str5 = this.f316281i;
        java.lang.String str6 = this.f316282m;
        hVar.f69502xf11df5f5 = z19 ? str5 : str6;
        int i27 = this.f316283n;
        hVar.f69562x366b1958 = i27;
        int i28 = this.f316284o;
        int i29 = this.f316285p;
        hVar.f69523x17c343e7 = z19 ? i28 : i29;
        java.lang.String str7 = this.f316286q;
        hVar.f69563x1209e7cb = str7;
        java.lang.String str8 = this.f316287r;
        hVar.f69526x419c9c3d = z19 ? str8 : this.f316288s;
        hVar.f69543x16680d46 = this.f316289t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "support second!! sceneResult: %s", hVar);
        if (this.f316276d) {
            str2 = this.f316278f + ya.b.f77495x8b74a326;
        } else {
            kk.l lVar = t21.w2.f496589c;
            str2 = t21.c3.a(str7);
            this.f316278f = str2;
        }
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, true);
        java.lang.String tj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, activityC22567x42e895b8.f292487g, false);
        if (!this.f316276d) {
            com.p314xaae8f345.mm.vfs.w6.c(tj7, tj6);
        }
        java.lang.String str9 = ((((((("<msg><videomsg aeskey=\"" + str6 + "\" cdnthumbaeskey=\"" + str6 + "\" cdnvideourl=\"" + str3 + "\" ") + "cdnthumburl=\"" + str3 + "\" ") + "length=\"" + i29 + "\" ") + "cdnrawvideourl=\"" + str4 + "\" ") + "cdnrawvideoaeskey=\"" + str5 + "\" ") + "originsourcemd5=\"" + this.f316290u + "\" ") + "rawlength=\"" + i28 + "\" ") + "cdnthumblength=\"" + i27 + "\"/></msg>";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "cdn callback new build cdnInfo:%s", str9);
        boolean z27 = this.f316276d;
        t21.v2 v2Var = this.f316292w;
        if (z27) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str10 = this.f316278f;
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str10);
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "compress video info is null, pls check process");
                activityC22567x42e895b8.finish();
                return 0;
            }
            h17.o(str2);
            t21.d3.p(str2, null, this.f316291v, this.f316286q, null, 0, "", 43, null, "", null, null, null, true, h17.f496549n, null, "");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().C(h17);
        } else {
            t21.d3.r(str2, this.f316291v, this.f316286q, str9, 43, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(v2Var.f496549n, v2Var.f496553r), v2Var.Q, v2Var.R, this.f316285p);
        }
        if (!t21.d3.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || this.f316276d) {
            hVar2 = null;
            hVar3 = hVar;
        } else {
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_MsgRetransmitUI_3";
            mVar.f323320f = this;
            mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("checkExist", java.lang.System.currentTimeMillis(), str7, "" + activityC22567x42e895b8.f292486f);
            mVar.f69591xf9dbbe9c = str4;
            mVar.f69575xf11df5f5 = str5;
            mVar.f69593x419c9c3d = str8;
            mVar.f69592xf1ebe47b = 4;
            mVar.f69618x114ef53e = str7;
            mVar.f69609xd84b8349 = 2;
            mVar.f69617x5f1e8863 = "";
            mVar.f69607x9bef5d80 = true;
            mVar.f69621xf91593ca = true;
            v2Var.g();
            boolean Bi = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            this.f316276d = Bi;
            hVar2 = null;
            hVar3 = hVar;
            this.f316277e = hVar3;
            if (Bi) {
                return 0;
            }
        }
        m11.m1 i37 = m11.m1.i();
        i37.f523674p = this.f316278f;
        boolean z28 = this.f316276d;
        if (z28) {
            hVar2 = hVar3;
        }
        i37.f404288t = hVar2;
        i37.f404285q = 0;
        if (z28) {
            hVar3 = this.f316277e;
        }
        i37.f404286r = hVar3;
        i37.f404287s = new dk5.l1(this);
        i37.f523667i = 4;
        i37.a().a();
        activityC22567x42e895b8.finish();
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
