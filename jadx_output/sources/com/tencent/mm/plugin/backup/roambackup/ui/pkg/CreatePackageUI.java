package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lro1/e;", "<init>", "()V", "zo1/y0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatePackageUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements ro1.e {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.ref.WeakReference f92814u;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92815d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f92816e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f92817f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f92818g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92819h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f92820i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f92821m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f92822n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f92823o;

    /* renamed from: p, reason: collision with root package name */
    public final long f92824p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f92825q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f92826r;

    /* renamed from: s, reason: collision with root package name */
    public po1.d f92827s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f92828t;

    public static final void U6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        java.lang.String str;
        createPackageUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "begin save new package");
        com.tencent.wechat.aff.affroam.h hVar = new com.tencent.wechat.aff.affroam.h();
        hVar.f215838d = 0L;
        hVar.f215839e = 0;
        java.lang.String str2 = dVar.f357295a;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.g(false, new zo1.g1(f0Var, countDownLatch, str2));
        countDownLatch.await();
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "getMaxPackageNumberByDevice maxNumber = " + f0Var.f310116d + ", targetDeviceId=" + str2);
        int i17 = f0Var.f310116d + 1;
        if (i17 <= 1) {
            str = "WXGBACKUPPACKAGEPREFIX_" + createPackageUI.getString(com.tencent.mm.R.string.mwy);
        } else {
            str = "WXGBACKUPPACKAGEPREFIX_" + createPackageUI.getString(com.tencent.mm.R.string.mwz, java.lang.Integer.valueOf(i17));
        }
        com.tencent.wechat.aff.affroam.g gVar = new com.tencent.wechat.aff.affroam.g();
        gVar.f215830e = 0;
        gVar.f215831f = str;
        com.tencent.wechat.aff.affroam.u uVar = new com.tencent.wechat.aff.affroam.u();
        uVar.f215989e = dVar.f357295a;
        uVar.f215988d = dVar.f357296b.h();
        uVar.f215991g = dVar.b();
        uVar.f215990f = dVar.f357299e;
        gVar.f215832g = uVar;
        gVar.f215833h = "source_device_id";
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createPackageUI.f92826r;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        gVar.f215834i = backupRangeInfo.b();
        gVar.f215835m = createPackageUI.f92825q;
        gVar.f215837o = hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Try save package to SDK and backend");
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.e().a(kz5.c0.d(gVar), new com.tencent.mm.plugin.backup.roambackup.w(new zo1.a1(u3Var, createPackageUI, dVar)));
    }

    public final void V6(yz5.l lVar) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.mx8), true, 3, new zo1.f1(h0Var));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(lVar);
        h0Var.f310123d = ((ku5.t0) ku5.t0.f312615d).q(new zo1.e1(f17, weakReference));
    }

    public final void W6() {
        if ((this.f92825q & 1) != 0) {
            android.widget.TextView textView = this.f92821m;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.mxw);
                return;
            } else {
                kotlin.jvm.internal.o.o("autoBackupTv");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f92821m;
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.mxu);
        } else {
            kotlin.jvm.internal.o.o("autoBackupTv");
            throw null;
        }
    }

    @Override // ro1.e
    public void X4(java.util.List devices) {
        kotlin.jvm.internal.o.g(devices, "devices");
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "[onVolumeUnmounted] deviceListSize=" + devices.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.X6():void");
    }

    public final void Y6(po1.d dVar) {
        this.f92827s = dVar;
        android.widget.TextView textView = this.f92816e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f92816e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView2.setText(dVar.b());
        android.widget.TextView textView3 = this.f92816e;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView3.setTextColor(getColor(com.tencent.mm.R.color.abw));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92815d;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("deviceIcon");
            throw null;
        }
        weImageView.setVisibility(0);
        int ordinal = dVar.f357296b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f92815d;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
            weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_backup);
        } else if (ordinal != 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f92815d;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
            weImageView3.setVisibility(8);
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f92815d;
            if (weImageView4 == null) {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
            weImageView4.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
        }
        if (!r26.i0.A(dVar.f357295a, "#OnlineDeviceId@", false, 2, null) && !ro1.v.f398014a.f(dVar)) {
            oo1.o.f347151a.a(dVar.f357295a);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Target device is a unbound device=" + dVar + ", skip saving to mmkv");
    }

    @Override // ro1.e
    public void e5(java.util.List devices) {
        kotlin.jvm.internal.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        V6(new zo1.x1(devices, this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxg;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && intent != null && i17 == 125) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("convParcelRange");
            if (parcelableExtra == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CreatePackageUI", "Fail to parse backup range from result intent");
                return;
            }
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = (com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo) parcelableExtra;
            this.f92826r = backupRangeInfo;
            if (backupRangeInfo.f92734h > 0) {
                this.f92825q &= -2;
            }
            android.widget.TextView textView = this.f92823o;
            if (textView != null) {
                textView.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("estimatedSizeTv");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreatePackageUI", "Roam is disable");
            finish();
        }
        f92814u = new java.lang.ref.WeakReference(this);
        setMMTitle("");
        setBackBtn(new zo1.h1(this), com.tencent.mm.R.raw.icons_outlined_close);
        hideActionbarLine();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92941i);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 2L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rhj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92815d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rhk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92816e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rhn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92817f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rho);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92818g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rhp);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92819h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.rhq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f92820i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.rcs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f92821m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.rht);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f92823o = (android.widget.TextView) findViewById8;
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rhs)).setOnClickListener(new zo1.i1(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rhm)).setOnClickListener(new zo1.j1(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rcr)).setOnClickListener(new zo1.l1(this));
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.rhr);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById9;
        this.f92822n = button;
        button.setOnClickListener(new zo1.m1(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "setup default rule");
        this.f92826r = new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(null, null, null, 0L, 0L, 31, null);
        android.widget.TextView textView = this.f92823o;
        if (textView == null) {
            kotlin.jvm.internal.o.o("estimatedSizeTv");
            throw null;
        }
        textView.setVisibility(8);
        onNewIntent(getIntent());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f92814u = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onNewIntent(intent);
        if (intent != null && (stringExtra = intent.getStringExtra("deviceInfo")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "onNewIntent updateTargetDevice, defaultDevice = ".concat(stringExtra));
            po1.d b17 = po1.d.f357294i.b(stringExtra);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CreatePackageUI", "Fail to parse device from ".concat(stringExtra));
            } else {
                Y6(b17);
            }
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f92828t;
        if (y1Var != null) {
            y1Var.q();
        }
        com.tencent.mm.plugin.exdevice.model.a2.INSTANCE.h();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ro1.t tVar = ro1.t.f398008d;
        ro1.t.f398010f.remove(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        W6();
        ro1.t tVar = ro1.t.f398008d;
        ro1.t.f398010f.add(this);
    }
}
