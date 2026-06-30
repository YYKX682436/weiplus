package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

/* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI */
/* loaded from: classes9.dex */
public class ActivityC22567x42e895b8 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {
    public static final /* synthetic */ int H1 = 0;
    public java.lang.String C;
    public int E;
    public float F;
    public float G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f292484J;
    public int N;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;

    /* renamed from: e, reason: collision with root package name */
    public int f292485e;

    /* renamed from: f, reason: collision with root package name */
    public long f292486f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292487g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f292488h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f292489i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f292491m;

    /* renamed from: o, reason: collision with root package name */
    public int f292493o;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f292495p0;

    /* renamed from: n, reason: collision with root package name */
    public int f292492n = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f292494p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f292497q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f292498r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292499s = false;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f292500t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f292501u = null;

    /* renamed from: v, reason: collision with root package name */
    public int f292502v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f292503w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f292504x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f292507y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f292510z = false;
    public boolean A = false;
    public boolean B = false;
    public int D = -1;
    public boolean K = true;
    public boolean L = true;
    public int M = 0;
    public long P = 0;
    public boolean T = true;
    public boolean U = false;
    public int V = 0;
    public boolean W = false;
    public boolean X = true;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f292505x0 = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: y0, reason: collision with root package name */
    public boolean f292508y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e f292490l1 = null;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 f292496p1 = null;

    /* renamed from: x1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 f292506x1 = null;

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 f292509y1 = null;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f292511z1 = false;
    public java.lang.String A1 = "";
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 B1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public boolean C1 = false;
    public boolean D1 = false;
    public java.lang.String E1 = "";
    public java.lang.String F1 = "";
    public java.lang.String G1 = "";

    public static void O6(java.lang.String str, java.lang.Long l17) {
        if (l17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
        long longValue = l17.longValue();
        am.xz xzVar = c6194x6522023a.f136451g;
        xzVar.f89942a = longValue;
        xzVar.f89943b = 0;
        xzVar.f89944c = str;
        c6194x6522023a.e();
    }

    public static void P6(w11.n1 n1Var) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        if (n1Var == null || (m1Var = n1Var.f523628a) == null || 522 != m1Var.mo808xfb85f7b0()) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = n1Var.f523628a;
        if (m1Var2 instanceof w11.r0) {
            O6(((w11.r0) m1Var2).f523651g, java.lang.Long.valueOf(((w11.r0) m1Var2).f523650f));
        }
    }

    public final boolean Q6() {
        if (c01.d9.b().E()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "sdcard is not available, type = " + this.f292485e);
        db5.t7.k(this, null);
        return false;
    }

    public final boolean R6(dk5.e2 e2Var, t21.v2 v2Var, java.lang.String str) {
        if (v2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "checkVideoCdnInfo info is null !!!");
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(v2Var.g(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "%s cdntra parse video recv xml failed");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
        java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$md5");
        java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$newmd5");
        java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideoaeskey");
        java.lang.String str7 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
        java.lang.String str8 = (java.lang.String) d17.get(".msg.videomsg.$rawmd5");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$rawlength"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$playlength"), 0);
        int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$cdnthumblength"), 0);
        java.lang.String str9 = (java.lang.String) d17.get(".msg.videomsg.$originsourcemd5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, v2Var.d(), false))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1328L, 1L, 1L, true);
                return false;
            }
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_MsgRetransmitUI_3";
        mVar.f323320f = new dk5.n1(this, str7, str2, str6, str3, P4, P, P2, str, str8, str4, str5, str9, P3, v2Var);
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("checkExist", java.lang.System.currentTimeMillis(), str, "" + this.f292486f);
        mVar.f69591xf9dbbe9c = str2;
        mVar.f69575xf11df5f5 = str3;
        mVar.f69593x419c9c3d = str4;
        mVar.f69592xf1ebe47b = 4;
        mVar.f69618x114ef53e = str;
        mVar.f69609xd84b8349 = 2;
        mVar.f69617x5f1e8863 = "";
        mVar.f69607x9bef5d80 = true;
        mVar.f69621xf91593ca = true;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            this.f292499s = false;
            finish();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "check exist fail! download video before retransmit");
        finish();
        return false;
    }

    public final void S6(dk5.e2 e2Var, java.lang.String str) {
        r45.uf6 uf6Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MsgRetransmitUI", "start copy video", new java.lang.Object[0]);
        dk5.c2 c2Var = new dk5.c2();
        this.f292500t = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new dk5.k1(this, c2Var));
        java.util.concurrent.CountDownLatch countDownLatch = this.f292505x0;
        if (countDownLatch.getCount() > 0) {
            this.f292508y0 = true;
            c2Var.f316093t = countDownLatch;
        }
        c2Var.f316075b = this;
        c2Var.f316079f = this.f292487g;
        c2Var.f316074a = this.f292500t;
        c2Var.f316077d = this.f292503w;
        c2Var.f316078e = this.f292493o;
        c2Var.f316083j = false;
        c2Var.f316081h = str;
        c2Var.f316084k = true;
        c2Var.f316085l = this.f292499s;
        c2Var.f316088o = e2Var;
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str2 = this.f292487g;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        if (h17 != null && (uf6Var = h17.E) != null) {
            c2Var.f316087n = uf6Var;
            c2Var.f316089p = h17.h();
            c2Var.f316090q = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(h17.f496549n, h17.f496553r);
        }
        if (h17 != null) {
            c2Var.f316092s = h17.N;
        }
        c2Var.f316098y = h17.R;
        c2Var.f316097x = h17.Q;
        c2Var.execute(new java.lang.Object[0]);
        c01.sc.d().a(c01.sc.f118994d, null);
        long j17 = this.f292486f;
        if (j17 == -1) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.R, j17);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(R4 ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Chatroom : com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Chat, this.f292484J ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Full : com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, Li, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0);
    }

    public final void T6() {
        ((ku5.t0) ku5.t0.f394148d).h(new dk5.j1(this), "MicroMsg.MsgRetransmitUI");
        finish();
        this.f292499s = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0232, code lost:
    
        if (r4.m75939xb282bd08(r4.f449898d + 6) == 24) goto L164;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x026f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:159:0x02f8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 3546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.U6(java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0070. Please report as an issue. */
    public final void V6() {
        android.view.View inflate;
        int i17 = this.f292485e;
        if (i17 == 2 || i17 == 16) {
            java.lang.String string = getIntent().getExtras().getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
            mVar.f67386xa1e9e82c = string;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().get(mVar, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req(getIntent().getExtras()).f33049x38eb0007;
            dk5.r4 r4Var = new dk5.r4(new dk5.u1(this));
            byte[] bArr = c11286x34a5504.f33128x4f3b3aa0;
            android.graphics.Bitmap G = bArr == null ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
            int mo14189x368f3a = c11286x34a5504.f33122xe4128443.mo14189x368f3a();
            if (mo14189x368f3a != 130) {
                switch (mo14189x368f3a) {
                    case 1:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569688in, null);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(c11286x34a5504.f33130x6942258);
                        android.view.View view = inflate;
                        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 2:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569687im, null);
                        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(c11286x34a5504.f33130x6942258);
                        android.view.View view2 = inflate;
                        ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 3:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569686il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
                        textView.setText(c11286x34a5504.f33130x6942258);
                        textView2.setText(c11286x34a5504.f33121x993583fc);
                        android.view.View view22 = inflate;
                        ((android.widget.TextView) view22.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view22, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 4:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569686il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
                        textView3.setText(c11286x34a5504.f33130x6942258);
                        textView4.setText(c11286x34a5504.f33121x993583fc);
                        android.view.View view222 = inflate;
                        ((android.widget.TextView) view222.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view222, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 5:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569686il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
                        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
                        textView5.setText(c11286x34a5504.f33130x6942258);
                        textView6.setText(c11286x34a5504.f33121x993583fc);
                        android.view.View view2222 = inflate;
                        ((android.widget.TextView) view2222.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view2222, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 6:
                        break;
                    case 7:
                        inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569686il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
                        android.widget.TextView textView7 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                        android.widget.TextView textView8 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
                        textView7.setText(c11286x34a5504.f33130x6942258);
                        textView8.setText(c11286x34a5504.f33121x993583fc);
                        android.view.View view22222 = inflate;
                        ((android.widget.TextView) view22222.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f316383a = db5.e1.r(this, null, view22222, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    default:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessage", "unkown app message type, skipped, type=" + c11286x34a5504.f33122xe4128443.mo14189x368f3a());
                        return;
                }
            }
            inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569686il, null);
            ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70)).setImageBitmap(G);
            android.widget.TextView textView9 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
            android.widget.TextView textView10 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
            textView9.setText(c11286x34a5504.f33130x6942258);
            textView10.setText(c11286x34a5504.f33121x993583fc);
            android.view.View view222222 = inflate;
            ((android.widget.TextView) view222222.findViewById(com.p314xaae8f345.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
            r4Var.f316383a = db5.e1.r(this, null, view222222, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
        }
    }

    public final void W6(java.lang.String str) {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20192x51d45f07()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "done isWaitedForRecreateCompressVideo:%s showSuccessTips:%s isFixSnackBar:%s goToChattingUI:%s, StayWhereYouAre:%s sessionId:%s", java.lang.Boolean.valueOf(this.f292508y0), java.lang.Boolean.valueOf(this.f292499s), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f292498r), java.lang.Boolean.valueOf(this.K), com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
            int i17 = al5.u4.f87591t;
            al5.t4 t4Var = new al5.t4(this);
            t4Var.f87575e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6);
            t4Var.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            t4Var.f87583m = z17;
            t4Var.g();
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(this.f292488h);
        intent.putStringArrayListExtra("SendMsgUsernames", arrayList);
        intent.putExtra("sendResult", 0);
        setResult(-1, intent);
        if (this.T && !this.f292508y0) {
            this.B1.mo50297x7c4d7ca2(new dk5.f1(this), z17 ? 0L : this.f292499s ? 2000L : 0L);
        }
        if (!this.f292498r || this.K) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent2.addFlags(67108864);
        intent2.putExtra("Chat_User", str);
        intent2.putExtra("scene_from", this.V);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/transmit/MsgRetransmitUI", "done", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/transmit/MsgRetransmitUI", "done", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.String X6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4((java.lang.String) list.get(i17))) {
                arrayList.add("group");
            } else {
                arrayList.add("chat");
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";");
    }

    public final void Y6(ot0.q qVar, boolean z17) {
        r45.kv2 shareObj;
        if (!this.X || qVar == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f292488h);
        long j17 = z17 ? 1L : 2L;
        zy2.i iVar = (zy2.i) qVar.y(zy2.i.class);
        if (iVar == null || (shareObj = iVar.f558944b) == null) {
            return;
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        java.lang.String receiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";");
        long size = arrayList.size();
        ((c61.w8) paVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObj, "shareObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Uj(shareObj, 7, j17, receiver, null, size);
    }

    public final boolean Z6(byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }

    public final boolean a7(final java.lang.String str) {
        java.lang.String str2 = this.f292489i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "processAppMessageTransfer error: app content null");
            return false;
        }
        int i17 = v17.f430199i;
        if (i17 == 53 || i17 == 57) {
            java.lang.String str3 = v17.f430187f;
            c01.z1.r();
            if (w11.t1.a(str)) {
                w11.r1 a17 = w11.s1.a(str);
                a17.g(str);
                a17.e(str3);
                a17.h(c01.e2.C(str));
                c01.h7 h7Var = new c01.h7();
                h7Var.f118763e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                h7Var.f118760b = this.f292486f;
                h7Var.f118762d = this.R;
                a17.f(h7Var);
                a17.c(new yz5.l() { // from class: dk5.b1$$c
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str, (java.lang.Long) obj);
                        return null;
                    }
                });
            } else {
                w11.r1 a18 = w11.s1.a(str);
                a18.g(str);
                a18.e(str3);
                a18.h(c01.e2.C(str));
                a18.f523664f = 0;
                a18.f523667i = 4;
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f118763e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                h7Var2.f118760b = this.f292486f;
                h7Var2.f118762d = this.R;
                a18.f(h7Var2);
                w11.n1 a19 = a18.a();
                a19.a();
                P6(a19);
            }
            return true;
        }
        if (i17 == 101) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
            g0Var.f273170i = 0;
            g0Var.f273171j = "";
            v17.f(g0Var);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.R, this.f292486f);
        byte[] bArr = null;
        if (!Li.t2()) {
            java.lang.String str4 = this.f292494p;
            if (str4 != null) {
                try {
                    bArr = com.p314xaae8f345.mm.vfs.w6.N(str4, 0, -1);
                    if (!Z6(bArr)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "processAppMessageTransfer thumb file is not image");
                        return false;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRetransmitUI", e17, "processAppMessageTransfer send to user: %s, exception", str);
                }
            } else if (this.D < 0) {
                try {
                    bArr = com.p314xaae8f345.mm.vfs.w6.N(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(Li, Li.z0(), true), 0, -1);
                    if (!Z6(bArr)) {
                        return false;
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRetransmitUI", e18, "processAppMessageTransfer send to user: %s, exception", str);
                }
            }
            byte[] bArr2 = bArr;
            ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
            if (aVar == null) {
                aVar = new ot0.a();
            }
            aVar.K = this.Y;
            com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e = this.f292490l1;
            if (c11127xcc7d6e4e != null) {
                aVar.P = c11127xcc7d6e4e.c();
            }
            if (this.f292511z1) {
                aVar.R = this.A1;
            }
            v17.f(aVar);
            ((ku5.t0) ku5.t0.f394148d).h(new dk5.w1(this, v17, bArr2, str, v17, Li), "MicroMsg.MsgRetransmitUI");
        } else if (v17.f430199i == 33) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.a4.c(str, this.B, v17, c01.od.c(((java.util.HashMap) getIntent().getSerializableExtra("appbrand_params")).get("img_url"), null));
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.F(this, str, this.f292489i, Li.A0(), this.B);
        }
        return true;
    }

    public final boolean b7(java.lang.String str, boolean z17) {
        if (this.f292487g == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f292487g);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(N == null ? this.f292487g : N.N0());
        java.lang.String N0 = N == null ? this.f292487g : N.N0();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(N0, options);
        boolean z18 = options.outHeight > ip.c.c() || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z18) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = N == null ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207 : N.mo42933xb5885648();
            objArr[1] = java.lang.Integer.valueOf(this.f292493o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "emoji is over size. md5:%s size:%d", objArr);
            this.T = false;
            this.f292499s = false;
            db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new dk5.e1(this));
            if (this.E == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13459, java.lang.Long.valueOf(k17), 1, N.mo42933xb5885648(), 1);
            }
            return true;
        }
        if (this.E == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = java.lang.Long.valueOf(k17);
            objArr2[1] = 0;
            objArr2[2] = N == null ? "" : N.mo42933xb5885648();
            objArr2[3] = 1;
            g0Var.d(13459, objArr2);
        }
        if (!z17) {
            if (N != null && k17 > ip.c.e()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.h(N, str, null);
                return true;
            }
            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).W(this, str, this.f292487g, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f292486f, this.R), 9)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "Retransmit emoji failed.");
            return false;
        }
        if (N == null) {
            N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(getApplicationContext(), new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984(this.f292487g)), ""));
        }
        if (N != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13459, java.lang.Long.valueOf(k17), 0, N.mo42933xb5885648(), 2);
            com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e = this.f292490l1;
            if (c11127xcc7d6e4e != null || this.f292511z1) {
                ot0.q qVar = new ot0.q();
                qVar.f430179d = "";
                qVar.H = "";
                qVar.f430239s = 1;
                ot0.a aVar = new ot0.a();
                if (c11127xcc7d6e4e != null) {
                    aVar.P = c11127xcc7d6e4e.c();
                }
                aVar.R = this.A1;
                qVar.f(aVar);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.h(N, str, qVar);
                if (this.V == 23) {
                    setResult(-1);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.h(N, str, null);
            }
        }
        finish();
        return true;
    }

    public final void c7(java.lang.String str, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var, boolean z18) {
        if ((this.f292505x0.getCount() > 0) && this.f292501u == null) {
            this.f292508y0 = true;
            this.f292501u = db5.e1.Q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        }
        ((ku5.t0) ku5.t0.f394148d).r(new dk5.t1(this, z17, str, w3Var, z18), "MultiSendMsg");
    }

    public final boolean d7(final java.lang.String str, java.lang.String str2) {
        c01.z1.r();
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(c01.e2.C(str));
            c01.h7 h7Var = new c01.h7();
            h7Var.f118763e = getIntent().getStringExtra("msg_forward_sns_obj_id");
            h7Var.f118760b = this.f292486f;
            h7Var.f118762d = this.R;
            a17.f(h7Var);
            boolean z17 = this.f292511z1;
            java.lang.String str3 = this.A1;
            a17.f523671m = z17;
            a17.f523672n = str3;
            a17.c(new yz5.l() { // from class: dk5.b1$$b
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    java.lang.Long l17 = (java.lang.Long) obj;
                    int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
                    com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.this;
                    activityC22567x42e895b8.getClass();
                    long longValue = l17.longValue();
                    java.lang.String str4 = str;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str4, longValue);
                    c01.h7 h7Var2 = new c01.h7();
                    h7Var2.f118760b = activityC22567x42e895b8.f292486f;
                    h7Var2.f118762d = activityC22567x42e895b8.R;
                    ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li, h7Var2);
                    ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
                    com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str4, l17);
                    return null;
                }
            });
            return true;
        }
        w11.r1 a18 = w11.s1.a(str);
        a18.g(str);
        a18.e(str2);
        a18.h(c01.e2.C(str));
        a18.f523664f = 0;
        a18.f523667i = 4;
        c01.h7 h7Var2 = new c01.h7();
        h7Var2.f118763e = getIntent().getStringExtra("msg_forward_sns_obj_id");
        h7Var2.f118760b = this.f292486f;
        h7Var2.f118762d = this.R;
        a18.f(h7Var2);
        boolean z18 = this.f292511z1;
        java.lang.String str4 = this.A1;
        a18.f523671m = z18;
        a18.f523672n = str4;
        w11.n1 a19 = a18.a();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, a19.f523629b);
        c01.h7 h7Var3 = new c01.h7();
        h7Var3.f118760b = this.f292486f;
        h7Var3.f118762d = this.R;
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li, h7Var3);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        a19.a();
        P6(a19);
        return true;
    }

    public final void e7(java.lang.String str, ot0.q qVar, byte[] bArr, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.h(qVar.f430227p);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.A)) {
            h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.o(f9Var, qVar.f430227p);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = h17;
        if (dVar == null || (str4 = dVar.f68099xfeae815) == null || str4.equals("")) {
            str2 = "";
        } else {
            if (ez.v0.f339310a.j(java.lang.Integer.valueOf(qVar.f430199i))) {
                ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).cj(f9Var.m124847x74d37ac6(), f9Var.Q0());
            }
            java.lang.String f17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.k(), qVar.n(), qVar.f430223o);
            int i17 = j62.e.g().i("clicfg_attachment_retransmit_copy_link", 1, false, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "copyFile, status = " + dVar.f68112x10a0fed7 + ", linkExpt = " + i17);
            if (i17 == 0) {
                com.p314xaae8f345.mm.vfs.w6.c(dVar.f68099xfeae815, f17);
            } else if (dVar.f68112x10a0fed7 == 199) {
                com.p314xaae8f345.mm.vfs.w6.d(dVar.f68099xfeae815, f17, true);
            } else {
                com.p314xaae8f345.mm.vfs.w6.c(dVar.f68099xfeae815, f17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]", dVar.f68099xfeae815, qVar.n(), f17, java.lang.Boolean.valueOf(dVar.t0()));
            str2 = f17;
        }
        ot0.q i18 = ot0.q.i(qVar);
        i18.f430239s = 3;
        if (f9Var != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(qVar.f430199i)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.A)) {
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).cj(f9Var.m124847x74d37ac6(), f9Var.Q0());
            if (dVar != null && (!com.p314xaae8f345.mm.vfs.w6.j(dVar.f68099xfeae815) || com.p314xaae8f345.mm.vfs.w6.k(dVar.f68099xfeae815) != dVar.f68113xeb1a61d6)) {
                dn.m mVar = new dn.m();
                mVar.f323318d = "task_MsgRetransmitUI_1";
                mVar.f323320f = new dk5.d1(this, dVar, str2, f9Var, i18, str, bArr);
                mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("checkExist", java.lang.System.currentTimeMillis(), f9Var.Q0(), "" + f9Var.m124847x74d37ac6());
                mVar.f69575xf11df5f5 = i18.T;
                mVar.f69592xf1ebe47b = 19;
                mVar.f69582x4e093552 = i18.E;
                mVar.f323344z = i18.A;
                mVar.f69595x6d25b0d9 = str2;
                if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "openim attach download failed before rescend");
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((qVar.f430247u != 0 || qVar.f430215m > 26214400) && ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "summerbig send attachPath is null islargefilemsg[%d], attachlen[%d]", java.lang.Integer.valueOf(qVar.f430247u), java.lang.Long.valueOf(qVar.f430215m));
            c01.d9.e().g(new g35.e(qVar, null, str, new dk5.c1(this, qVar, i18, str, bArr)));
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str) && f9Var != null && this.f292486f > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "sendAppMsg: claw user with newSendUrl type=%d forwardMsgId:%d, converting to text", java.lang.Integer.valueOf(i18.f430199i), java.lang.Long.valueOf(this.f292486f));
            qx.d0 d0Var = (qx.d0) i95.n0.c(qx.d0.class);
            java.lang.String str5 = this.R;
            long j17 = this.f292486f;
            java.lang.String str6 = i18.f430187f;
            ((px.a) d0Var).Ni(str, str5, j17, str6 == null ? "" : str6);
            return;
        }
        if (f9Var != null) {
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).sj(i18.f430199i, str)) {
                l15.c cVar = new l15.c();
                cVar.m126728xdc93280d(ot0.q.u(qVar, null, null));
                av.b bVar = new av.b(str, cVar, bArr);
                p15.e eVar = new p15.e();
                eVar.m126728xdc93280d(f9Var.G);
                bVar.f493716e = eVar;
                bVar.f493720i = this.I;
                c01.h7 h7Var = new c01.h7();
                h7Var.f118760b = this.f292486f;
                h7Var.f118762d = this.R;
                h7Var.f118763e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                bVar.f493715d = h7Var;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new av.a(bVar));
                return;
            }
        }
        if ("wxid_wi_1d142z0zdj03".equals(str) && i18.f430199i == 33) {
            ot0.a aVar = (ot0.a) i18.y(ot0.a.class);
            if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18.f430210k2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s piece is null", i18.f430210k2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0.class))).Ai(i18.f430210k2);
                if (Ai == null || !Ai.f161825a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s result is null", i18.f430210k2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s result:%s", i18.f430210k2, Ai);
                    aVar.S = Ai.f161827c;
                    aVar.T = Ai.f161828d;
                }
            }
        }
        str3 = "";
        java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(i18, qVar.f430179d, qVar.H, str, str2, bArr, this.I, "", c01.ia.v(f9Var.G), new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f292486f, this.R)).second;
        if (obj != null) {
            O6(str, (java.lang.Long) obj);
        }
        if (i18.f430199i == 36) {
            boolean endsWith = str.endsWith("chatroom");
            java.lang.String str7 = i18.f430207k;
            if (str7 == null) {
                str7 = str3;
            }
            java.lang.String encode = java.net.URLEncoder.encode(str7);
            java.lang.String str8 = i18.f430187f;
            if (str8 == null) {
                str8 = str3;
            }
            java.lang.String encode2 = java.net.URLEncoder.encode(str8);
            java.lang.String str9 = i18.f430191g;
            if (str9 == null) {
                str9 = str3;
            }
            java.lang.String encode3 = java.net.URLEncoder.encode(str9);
            java.lang.String str10 = i18.f430202i2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14127, i18.f430179d, i18.f430206j2, java.net.URLEncoder.encode(str10 != null ? str10 : ""), encode2, encode3, "", encode, 0, 1, 1, java.lang.Integer.valueOf(endsWith ? 1 : 0), str, 1, qVar.f430222n2, "");
        }
    }

    public final void f7(java.lang.String str, java.util.List list) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(str);
        if (list.size() > 0) {
            java.lang.String str2 = (java.lang.String) list.get(0);
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2);
            if (list.size() != 1 || !R4 || a17 == null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar = c5990xd50ae361.f136285g;
                    mtVar.f88895a = str3;
                    mtVar.f88896b = str;
                    mtVar.f88897c = c01.e2.C(str3);
                    mtVar.f88898d = 0;
                    c5990xd50ae361.e();
                }
                return;
            }
            if (w11.t1.a(str2)) {
                w11.r1 a18 = w11.s1.a(str2);
                a18.e(str);
                a18.h(c01.e2.C(str2));
                a18.f523664f = 1;
                a18.f523666h = a17;
                a18.b();
                return;
            }
            w11.r1 a19 = w11.s1.a(str2);
            a19.g(str2);
            a19.e(str);
            a19.h(c01.e2.C(str2));
            a19.f523664f = 1;
            a19.f523666h = a17;
            a19.f523667i = 5;
            a19.a().a();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void g7(android.content.Intent intent, java.lang.String str) {
        if (!this.f292510z) {
            h7(str);
            return;
        }
        this.f292507y.size();
        java.util.ArrayList parcelableArrayList = intent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            finish();
            return;
        }
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            if (this.C1) {
                return;
            } else {
                h7(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r11.f292487g.startsWith(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + "/share_img_tmp_") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "sendMultiVideo"
            java.lang.String r1 = "MicroMsg.MsgRetransmitUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "KISFileFromCopyTmpPath"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)
            if (r0 == 0) goto L59
            java.lang.String r0 = r11.f292487g
            java.lang.String r2 = zo3.p.Vi()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = r11.f292487g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = "/share_img_tmp_"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L59
        L43:
            java.lang.String r0 = r11.f292487g
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "sendMultiVideo, fileName is from shareImgTmpPath:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "ImportVideoTempPath"
            java.lang.String r2 = r11.f292487g
            r0.putExtra(r1, r2)
        L59:
            com.tencent.mm.pluginsdk.model.c3 r0 = new com.tencent.mm.pluginsdk.model.c3
            r5 = 0
            android.content.Intent r6 = r11.getIntent()
            r8 = 1
            dk5.g1 r9 = new dk5.g1
            r9.<init>(r11)
            r10 = 0
            r3 = r0
            r4 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            ku5.u0 r12 = ku5.t0.f394148d
            ku5.t0 r12 = (ku5.t0) r12
            r12.g(r0)
            r12 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r2 = r11.getString(r12)
            r12 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r3 = r11.getString(r12)
            r4 = 1
            r5 = 1
            dk5.h1 r6 = new dk5.h1
            r6.<init>(r11, r0)
            r1 = r11
            com.tencent.mm.ui.widget.dialog.u3 r12 = db5.e1.Q(r1, r2, r3, r4, r5, r6)
            r11.f292500t = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.h7(java.lang.String):void");
    }

    public final void i7(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo originFullPath = " + str + ", outputFullPath = " + str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.b(str, c19767x257d7f, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2(), null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo, checkRet = " + c19767x257d7f.f38864x6ac9171);
        int i17 = c19767x257d7f.f38864x6ac9171;
        if (i17 == 1) {
            com.p314xaae8f345.mm.vfs.w6.d(str, str2, true);
        } else if (i17 == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3.b(str, str2, b17, false, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo done, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
        java.lang.String str3 = "";
        if (intent != null) {
            str = intent.getStringExtra("custom_send_text");
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                this.f292488h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            }
        } else {
            str = "";
        }
        if (this.U) {
            a14.g a17 = a14.g.a();
            java.util.List list = this.f292488h;
            a17.getClass();
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ";");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6760x897d68ec c6760x897d68ec = a17.f82142a;
            c6760x897d68ec.f140880j = c6760x897d68ec.b("ToUsername", c17, true);
            a14.g.a().f82142a.f140876f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 2L : 1L;
        }
        if (i18 == -1) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgRetransmitUI", "onActivityResult, unknown requestCode = " + i17);
                return;
            }
            if (intent.getBooleanExtra("key_is_biz_chat", false)) {
                intent.getLongExtra("key_biz_chat_id", -1L);
            }
            int intExtra = intent.getIntExtra("Retr_Msg_Type", -1);
            if (intExtra != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "summerbig replace msgType %d->%d", java.lang.Integer.valueOf(this.f292485e), java.lang.Integer.valueOf(intExtra));
                this.f292485e = intExtra;
            }
            this.Y = intent.getBooleanExtra("KSendGroupToDo", false);
            intent.getIntExtra("KShowTodoIntroduceView", 0);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f292485e);
            objArr[1] = java.lang.Integer.valueOf(this.f292504x);
            objArr[2] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f292488h) ? 0 : ((java.util.ArrayList) this.f292488h).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "summersafecdn onActivityResult doRetransmit msgType[%d], iScene[%d], size[%d]", objArr);
            int i19 = this.f292485e;
            java.lang.String msgContent = this.f292489i;
            vg3.l4 l4Var = (vg3.l4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.k2) ((vg3.b4) i95.n0.c(vg3.b4.class))).f230222d.get(java.lang.Integer.valueOf(i19));
            if (l4Var != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
                java.lang.String toUserName = (java.lang.String) ((java.util.ArrayList) this.f292488h).get(0);
                dk5.q1 q1Var = new dk5.q1(this, f17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ui(toUserName, msgContent, new c61.l6(q1Var)).l();
            }
            if (l4Var != null) {
                return;
            }
            U6(str);
            f7(str, this.f292488h);
            if (this.U) {
                a14.g a18 = a14.g.a();
                a18.c(1);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6760x897d68ec c6760x897d68ec2 = a18.f82142a;
                c6760x897d68ec2.f140879i = 1L;
                c6760x897d68ec2.n();
                c6760x897d68ec2.k();
                return;
            }
            return;
        }
        java.lang.String str4 = this.f292489i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(str4);
        if (v17 != null && v17.f430199i == 5 && (str2 = v17.f430207k) != null) {
            try {
                str3 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRetransmitUI", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str3, java.lang.Long.valueOf(this.P), java.lang.Integer.valueOf(this.N), 1, 3);
        } else if (v17 != null && v17.f430199i == 33) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052 c5166x9fda1052 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052();
            am.w wVar = c5166x9fda1052.f135516g;
            wVar.getClass();
            int i27 = this.S;
            wVar.f89768d = i27;
            if (2 == i27) {
                wVar.f89770f = this.R + ":" + this.Q;
            } else {
                wVar.f89770f = this.R;
            }
            wVar.f89769e = v17.f430270z2 + 1;
            wVar.f89771g = v17.f430202i2;
            wVar.f89765a = v17.f430206j2;
            wVar.f89766b = v17.f430210k2;
            wVar.f89767c = v17.A2;
            wVar.f89772h = 1;
            wVar.f89773i = "";
            wVar.f89774j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            wVar.f89775k = 3;
            wVar.f89776l = v17.f430222n2;
            c5166x9fda1052.e();
        }
        if (this.U) {
            a14.g.a().b();
        }
        if (this.D1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e5 e5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e5.class);
            java.lang.String userName = gm0.j1.b().k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h0) e5Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6326x30e97219 c6326x30e97219 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6326x30e97219();
            c6326x30e97219.f136831d = c6326x30e97219.b("Username", userName, true);
            c6326x30e97219.f136832e = 0;
            c6326x30e97219.k();
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0872  */
    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 2332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.onCreate(android.os.Bundle):void");
    }
}
