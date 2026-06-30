package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Ldn/k;", "<init>", "()V", "it3/a", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI */
/* loaded from: classes10.dex */
public final class ActivityC16983x775783e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements dn.k {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f237144t = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f237146e;

    /* renamed from: f, reason: collision with root package name */
    public int f237147f;

    /* renamed from: g, reason: collision with root package name */
    public int f237148g;

    /* renamed from: m, reason: collision with root package name */
    public it3.a f237151m;

    /* renamed from: o, reason: collision with root package name */
    public rm5.k f237153o;

    /* renamed from: p, reason: collision with root package name */
    public long f237154p;

    /* renamed from: q, reason: collision with root package name */
    public long f237155q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f237156r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f237157s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f237145d = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f237149h = jz5.h.b(new it3.x(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f237150i = jz5.h.b(new it3.w(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f237152n = jz5.h.b(new it3.t(this));

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2, java.lang.String str) {
        activityC16983x775783e2.getClass();
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[onThumbFetchEnd] isFileExist:" + j17 + " fileSize:" + k17 + " thumbPath:" + str);
        if (!j17 || k17 <= 0) {
            activityC16983x775783e2.X6();
            return;
        }
        activityC16983x775783e2.runOnUiThread(new it3.v(activityC16983x775783e2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        activityC16983x775783e2.f237156r = sb7;
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FinderUploadTask_2";
        mVar.f323320f = activityC16983x775783e2;
        mVar.f69601xaca5bdda = sb7;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = str;
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "upload thumb, file length " + com.p314xaae8f345.mm.vfs.w6.k(str));
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69580x454032b6 = 251;
        mVar.f69584x89a4c0cf = 2;
        mVar.A = 120;
        mVar.B = 300;
        mVar.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe V6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe) ((jz5.n) this.f237152n).mo141623x754a37bb();
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f237149h).mo141623x754a37bb()).intValue();
    }

    public final void X6() {
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574319m23);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = string;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dlq;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "onBackPressed");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(new r45.ic4());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        java.lang.String stringExtra = getIntent().getStringExtra("key_feed_video_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f237145d = stringExtra;
        this.f237146e = getIntent().getLongExtra("key_feed_video_duration_ms", 0L);
        this.f237147f = getIntent().getIntExtra("key_duration_min_limit", 1) * 1000;
        this.f237148g = getIntent().getIntExtra("key_duration_max_limit", 3) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[initData] videoPath:" + this.f237145d + " videoDuration:" + this.f237146e + " durationMinLimit:" + this.f237147f + " durationMaxLimit:" + this.f237148g);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qsj);
        if (findViewById != null) {
            findViewById.setOnClickListener(new it3.i(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qsm);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16535x389ef60b c16535x389ef60b = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16535x389ef60b) findViewById(com.p314xaae8f345.mm.R.id.qsn);
        int W6 = (W6() * com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.d.f34437x366c91de) / 957;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[initViews] with:" + W6() + " height:" + W6);
        if (c16535x389ef60b != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c16535x389ef60b.getLayoutParams();
            layoutParams.width = W6();
            layoutParams.height = W6;
            c16535x389ef60b.setLayoutParams(layoutParams);
        }
        c16535x389ef60b.m81946x1a747dba(true);
        c16535x389ef60b.m81944x1a60a7c5(false);
        c16535x389ef60b.m81943x9ee45726(false);
        c16535x389ef60b.m66874x1a2696e2(new it3.j(this));
        c16535x389ef60b.setOutlineProvider(new it3.k(this));
        c16535x389ef60b.setClipToOutline(true);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qsk);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new it3.l(this));
        }
        java.lang.String path = this.f237145d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        it3.a aVar = new it3.a(mo55332x76847179);
        this.f237151m = aVar;
        aVar.m139859x887cd1cb(it3.m.f376102d);
        it3.a aVar2 = this.f237151m;
        if (aVar2 != null) {
            aVar2.m139858xed92507e(new it3.n(this));
        }
        it3.a aVar3 = this.f237151m;
        if (aVar3 != null) {
            aVar3.m139857x5dd7c812(new it3.p(this, path));
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(W6(), (W6() * eh1.e.f69677x366c91de) / 957);
        jz5.g gVar = this.f237150i;
        ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).addView(this.f237151m, layoutParams2);
        ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).requestLayout();
        it3.a aVar4 = this.f237151m;
        if (aVar4 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            rh3.q qVar = new rh3.q();
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(path.getBytes());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            wh3.a aVar5 = new wh3.a(b17, path);
            qVar.d(aVar5, ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Bi(qVar, aVar5, b17, b17));
            aVar4.a(qVar, aVar5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.p(aVar4, true, 0, 0, 0, 0, null, 62, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(aVar4, null, 0L, 3, null);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(mo55332x76847179());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(W6(), ((W6() * com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33744x366c91de) / 957) + 1);
        layoutParams3.gravity = 80;
        ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).addView(imageView, layoutParams3);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c b18 = e17.b(ya2.l.f542035a.e("https://res.wx.qq.com/t/fed_upload/def05e11-0a81-44c1-ac59-bc77ca3437d8/hb_bottom_opengray.png", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411498s));
        it3.b bVar = it3.b.f376084a;
        b18.getClass();
        b18.f529406d = bVar;
        b18.f529412j = it3.c.f376086a;
        b18.f529411i = it3.d.f376087a;
        b18.c(imageView);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g0 g0Var;
        super.onDestroy();
        it3.a aVar = this.f237151m;
        if (aVar != null) {
            aVar.t();
        }
        it3.a aVar2 = this.f237151m;
        if (aVar2 != null) {
            aVar2.t();
            aVar2.m66744x2a55bdd7().mo162427x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe V6 = V6();
        if (V6 != null) {
            V6.f230422e = -1;
            V6.f230421d = null;
            V6.f230435u.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f0 f0Var = V6.f230427m;
            if (f0Var != null && (g0Var = f0Var.f230546e) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = g0Var.f230556c;
                if (!(n3VarArr.length == 0)) {
                    int length = n3VarArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n3VarArr[i17];
                        if (n3Var != null) {
                            n3Var.mo50283x2f1920ea().f538836b.g();
                            n3VarArr[i17] = null;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f0 f0Var2 = V6.f230427m;
                if (f0Var2 != null) {
                    f0Var2.f230546e = null;
                }
                V6.f230427m = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16534x56a8ffb4 c16534x56a8ffb4 = V6.f230431q;
            if (c16534x56a8ffb4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerSeekBar");
                throw null;
            }
            c16534x56a8ffb4.d();
        }
        rm5.k kVar = this.f237153o;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        it3.a aVar = this.f237151m;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        it3.a aVar = this.f237151m;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(aVar, null, 0L, 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        super.mo2295x59cfc822();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "onSwipeBack");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(new r45.ic4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r3 == true) goto L19;
     */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r4(java.lang.String r3, int r4, dn.g r5, dn.h r6, boolean r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "[callback] mediaId:"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r7 = " startRet:"
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = " sceneResult:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderRedPacketCoverEditUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r5)
            r5 = 0
            if (r6 == 0) goto L29
            int r7 = r6.f69553xb5f54fe9
            goto L2a
        L29:
            r7 = r5
        L2a:
            java.lang.String r0 = ""
            if (r4 == 0) goto L32
            r1 = -21005(0xffffffffffffadf3, float:NaN)
            if (r4 != r1) goto L34
        L32:
            if (r7 == 0) goto L3d
        L34:
            it3.g r3 = new it3.g
            r3.<init>(r2, r0)
            r2.runOnUiThread(r3)
            return r5
        L3d:
            java.lang.String r4 = r2.f237156r
            if (r4 == 0) goto L49
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != r4) goto L49
            goto L4a
        L49:
            r4 = r5
        L4a:
            if (r4 == 0) goto L5c
            if (r6 == 0) goto L5c
            java.lang.String r3 = r6.f69524x419c440e
            if (r3 != 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            it3.g r3 = new it3.g
            r3.<init>(r2, r0)
            r2.runOnUiThread(r3)
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.r4(java.lang.String, int, dn.g, dn.h, boolean):int");
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
