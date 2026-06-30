package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lio1/c;", "", "<init>", "()V", "RestoreTaskStatusView", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI */
/* loaded from: classes5.dex */
public final class ActivityC12875x98f0bdfd extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements io1.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f174414g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView f174415d;

    /* renamed from: e, reason: collision with root package name */
    public long f174416e = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174417f;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView;", "Lwo1/a1;", "app_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI$RestoreTaskStatusView */
    /* loaded from: classes5.dex */
    public static final class RestoreTaskStatusView extends wo1.a1 {

        /* renamed from: v, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd f174418v;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RestoreTaskStatusView(android.content.Context context, android.util.AttributeSet attrs) {
            this(context, attrs, 0, 0, 12, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        }

        @Override // wo1.a1
        public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
            r();
            m174213xcbd04540().setVisibility(0);
            m174213xcbd04540().setImageResource(i17);
            m174220xefe232c4().setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzj);
            m174210x881571cf().setVisibility(0);
            m174210x881571cf().setText(com.p314xaae8f345.mm.R.C30867xcad56011.mwn);
            m174210x881571cf().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.d(this, pkgInfo, device));
            m174215x485ad7cc().setVisibility(0);
            m174215x485ad7cc().setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzi);
            m174215x485ad7cc().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.g(this, device, pkgInfo));
        }

        @Override // wo1.a1
        public void p(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "stop restore task by pkgId=" + pkgInfo.f297362d);
            qo1.j1.f447056a.i(pkgInfo.f297362d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd = this.f174418v;
            if (activityC12875x98f0bdfd == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                throw null;
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.f174414g;
            activityC12875x98f0bdfd.U6();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RestoreTaskStatusView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
            this(context, attrs, i17, 0, 8, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RestoreTaskStatusView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
            /*
                r1 = this;
                r7 = r6 & 4
                r0 = 0
                if (r7 == 0) goto L6
                r4 = r0
            L6:
                r6 = r6 & 8
                if (r6 == 0) goto Lb
                r5 = r0
            Lb:
                java.lang.String r6 = "context"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r6)
                java.lang.String r6 = "attrs"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
                r1.<init>(r2, r3, r4, r5)
                r2 = 1
                r1.m174221x9f7af36(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
        }
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f174416e == task.f447016i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "onProgressChanged, pkgId=" + this.f174416e + ", percentage=" + f17);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.h(this, f17, task));
        }
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(this.f174416e);
        if (k17 == null && (k17 = this.f174417f) == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgInfo");
            throw null;
        }
        this.f174417f = k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "onTaskStateChanged, pkgId=" + this.f174416e + ", status=" + state);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.i(this, task, state, error));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean a17;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 126 && i18 == -1) {
            if (!(intent == null)) {
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
                if (stringArrayExtra == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StartRestoringUI", "result is null");
                    return;
                }
                po1.c cVar = po1.d.f438827i;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174417f;
                if (gVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgInfo");
                    throw null;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
                po1.d a18 = cVar.a(uVar);
                if (a18.f438829b != po1.g.f438843h) {
                    a17 = true;
                } else {
                    po1.d e17 = ro1.v.f479547a.e(a18.f438828a);
                    a17 = ((e17 == null || so1.b.f491759a.h(e17)) ? so1.g.f491771a : to1.g.f502444a).a(this, a18);
                }
                if (!a17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StartRestoringUI", "Request permission failed");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "start restore task, pkgId=" + this.f174416e);
                qo1.j1 j1Var = qo1.j1.f447056a;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = this.f174417f;
                if (gVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgInfo");
                    throw null;
                }
                int ordinal = j1Var.h(gVar2, kz5.z.z0(stringArrayExtra)).ordinal();
                if (ordinal == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "task launched(pkgId=" + this.f174416e + "), finish current activity.");
                    setResult(-1, getIntent());
                    U6();
                    return;
                }
                int i19 = com.p314xaae8f345.mm.R.C30867xcad56011.n0p;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i19 = com.p314xaae8f345.mm.R.C30867xcad56011.n0q;
                    } else if (ordinal != 3) {
                        throw new jz5.j();
                    }
                }
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
                e4Var.d(i19);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.c();
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip for invalid data, reqCode=");
        sb6.append(i17);
        sb6.append(", resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (!v1Var.a(mo55332x76847179, new zo1.k5(this))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartRestoringUI", "onCreate, can not backup ");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.Z);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 10L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f174416e = longExtra;
        if (longExtra > 0) {
            gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longExtra);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartRestoringUI", "Invalid packageId = " + this.f174416e);
            gVar = null;
        }
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartRestoringUI", "Fail to get package by packageId=" + this.f174416e);
            U6();
            return;
        }
        this.f174417f = gVar;
        getWindow().addFlags(128);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mzk);
        m78563x4e0f6657(false);
        mo74406x9c8c0d33(new zo1.l5(this), com.p314xaae8f345.mm.R.raw.f80009xb2ca17f);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s7_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView) findViewById;
        this.f174415d = restoreTaskStatusView;
        restoreTaskStatusView.f174418v = this;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qo1.j1.f447056a.e(this.f174416e, false);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        r0Var.p(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174221e.remove(this);
        r0Var.e(true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        r0Var.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174221e.add(this);
        qo1.j0 d17 = qo1.j1.f447056a.d(this.f174416e);
        boolean z17 = d17 instanceof qo1.v0;
        if (z17 && d17.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartRestoringUI", "error task type, task=" + d17);
            U6();
            return;
        }
        if (z17) {
            d17 = new qo1.g0(this.f174416e);
        }
        jz5.l d18 = d17.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView = this.f174415d;
        if (restoreTaskStatusView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statueView");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174417f;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgInfo");
            throw null;
        }
        restoreTaskStatusView.v(gVar, d17, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) d18.f384366d, (qo1.i0) d18.f384367e);
        r0Var.e(false);
    }
}
