package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class f7 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f282021a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f282022b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f282023c;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f282025e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f282026f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f282027g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f282028h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f282031k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f282032l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f282033m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f282034n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f282037q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f282024d = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7 f282029i = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.DEFAULT;

    /* renamed from: j, reason: collision with root package name */
    public int f282030j = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f282035o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f282036p = -1;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f282038r = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u6(this);

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f282039s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v6(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 f282040t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.d7(this);

    public f7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484) {
        this.f282022b = viewOnClickListenerC21613xfaa83484.getContext();
        this.f282023c = viewOnClickListenerC21613xfaa83484;
    }

    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f7Var) {
        f7Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[handleNoUrl]");
        android.content.Context context = f7Var.f282022b;
        db5.e1.y(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.azm), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.azi), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9.f282032l) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9.f282032l) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9.f282032l) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f282022b
            java.lang.String r1 = "com.tencent.androidqqmail"
            boolean r1 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(r0, r1)
            com.tencent.mm.ui.chatting.e7 r2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.INSTALLED
            r3 = 3
            r4 = 1
            r5 = 4
            if (r1 == 0) goto L11
            r1 = r2
            goto L76
        L11:
            java.lang.String r1 = "QQMAIL"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r5)
            r9.f282021a = r0
            java.lang.String r1 = "qqmail_downloadid"
            r6 = -1
            long r0 = r0.getLong(r1, r6)
            r9.f282036p = r0
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            com.tencent.mm.ui.chatting.e7 r1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.NO_URL
            com.tencent.mm.ui.chatting.e7 r6 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.NEED_DOWNLOAD
            if (r0 >= 0) goto L36
            java.lang.String r0 = r9.f282032l
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L36:
            java.lang.Class<vz.v1> r0 = vz.v1.class
            i95.m r0 = i95.n0.c(r0)
            vz.v1 r0 = (vz.v1) r0
            uz.v1 r0 = (uz.v1) r0
            r0.getClass()
            com.tencent.mm.plugin.downloader.model.r0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i()
            long r7 = r9.f282036p
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r0 = r0.p(r7)
            int r7 = r0.f178496f
            java.lang.String r0 = r0.f178497g
            r9.f282035o = r0
            if (r7 == r4) goto L74
            if (r7 == r3) goto L60
            java.lang.String r0 = r9.f282032l
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L60:
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            if (r0 == 0) goto L69
            com.tencent.mm.ui.chatting.e7 r1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.NEED_INSTALL
            goto L76
        L69:
            java.lang.String r0 = r9.f282032l
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L72:
            r1 = r6
            goto L76
        L74:
            com.tencent.mm.ui.chatting.e7 r1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.DOWNLOADING
        L76:
            r9.f282029i = r1
            if (r1 != r2) goto L83
            android.widget.ImageView r0 = r9.f282028h
            r1 = 2131692054(0x7f0f0a16, float:1.9013197E38)
            r0.setImageResource(r1)
            goto L8b
        L83:
            android.widget.ImageView r0 = r9.f282028h
            r1 = 2131692055(0x7f0f0a17, float:1.90132E38)
            r0.setImageResource(r1)
        L8b:
            com.tencent.mm.ui.chatting.e7 r0 = r9.f282029i
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.ChattingQQMailFooterHandler"
            java.lang.String r2 = "dz[initRightBtnTv: status:%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            com.tencent.mm.ui.chatting.e7 r0 = r9.f282029i
            int r0 = r0.ordinal()
            com.tencent.mm.pluginsdk.ui.tools.u6 r1 = r9.f282040t
            java.lang.String r2 = "QQMailUnreadHelper"
            if (r0 == r4) goto Ld1
            r4 = 2
            if (r0 == r4) goto Lc8
            if (r0 == r3) goto Lbf
            if (r0 == r5) goto Ld1
            r3 = 5
            if (r0 == r3) goto Ld1
            ku5.u0 r0 = ku5.t0.f394148d
            com.tencent.mm.pluginsdk.ui.tools.t6$$a r3 = new com.tencent.mm.pluginsdk.ui.tools.t6$$a
            r3.<init>(r1)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r3, r2)
            goto Ldd
        Lbf:
            android.widget.TextView r0 = r9.f282027g
            r1 = 2131758221(0x7f100c8d, float:1.91474E38)
            r0.setText(r1)
            goto Ldd
        Lc8:
            android.widget.TextView r0 = r9.f282027g
            r1 = 2131758219(0x7f100c8b, float:1.9147396E38)
            r0.setText(r1)
            goto Ldd
        Ld1:
            ku5.u0 r0 = ku5.t0.f394148d
            com.tencent.mm.pluginsdk.ui.tools.t6$$a r3 = new com.tencent.mm.pluginsdk.ui.tools.t6$$a
            r3.<init>(r1)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r3, r2)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7.b():void");
    }

    public final void c() {
        int i17 = this.f282030j;
        if (i17 == 0 || this.f282029i != com.p314xaae8f345.mm.ui.p2650x55bb7a46.e7.INSTALLED) {
            this.f282027g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.azq);
        } else if (i17 > 99) {
            this.f282027g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.azp);
        } else {
            this.f282027g.setText(java.lang.String.format(i65.a.r(this.f282022b, com.p314xaae8f345.mm.R.C30867xcad56011.azo), java.lang.Integer.valueOf(this.f282030j)));
        }
    }
}
