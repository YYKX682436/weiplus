package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "zo1/x3", "zo1/k4", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SelectPackageUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final zo1.x3 f92864q = new zo1.x3(null);

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.ref.WeakReference f92865r;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f92866e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f92867f;

    /* renamed from: i, reason: collision with root package name */
    public long f92870i;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f92873o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92874p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f92868g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final zo1.k4 f92869h = new zo1.k4();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f92871m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f92872n = -1;

    public static final void Z6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, boolean z17) {
        if (!z17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = selectPackageUI.f92867f;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("packageRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(0);
            android.widget.LinearLayout linearLayout = selectPackageUI.f92866e;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("listEmptyLl");
                throw null;
            }
            linearLayout.setVisibility(8);
            selectPackageUI.showOptionMenu(true);
            selectPackageUI.setMMTitle(com.tencent.mm.R.string.a7p);
            selectPackageUI.showActionbarLine();
            int color = selectPackageUI.getColor(com.tencent.mm.R.color.f478489a);
            selectPackageUI.setActionbarColor(color);
            selectPackageUI.setNavigationbarColor(color);
            selectPackageUI.setBackGroundColorResource(com.tencent.mm.R.color.f478489a);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = selectPackageUI.f92867f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("packageRecyclerView");
            throw null;
        }
        recyclerView2.setVisibility(8);
        selectPackageUI.showOptionMenu(false);
        selectPackageUI.setMMTitle("");
        selectPackageUI.hideActionbarLine();
        android.widget.LinearLayout linearLayout2 = selectPackageUI.f92866e;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("listEmptyLl");
            throw null;
        }
        if (linearLayout2.getVisibility() != 0) {
            android.widget.LinearLayout linearLayout3 = selectPackageUI.f92866e;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("listEmptyLl");
                throw null;
            }
            linearLayout3.setAlpha(0.0f);
            android.widget.LinearLayout linearLayout4 = selectPackageUI.f92866e;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("listEmptyLl");
                throw null;
            }
            linearLayout4.setVisibility(0);
            android.widget.LinearLayout linearLayout5 = selectPackageUI.f92866e;
            if (linearLayout5 == null) {
                kotlin.jvm.internal.o.o("listEmptyLl");
                throw null;
            }
            sa5.d.a(linearLayout5, new sa5.l(0.0f, 1, null), 300L, null);
        }
        int color2 = selectPackageUI.getColor(com.tencent.mm.R.color.f478491c);
        selectPackageUI.setActionbarColor(color2);
        selectPackageUI.setNavigationbarColor(color2);
        selectPackageUI.setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
    }

    public final void a7() {
        kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "hideLoadingToast");
        this.f92874p = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f92873o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f92873o = null;
    }

    public final void b7(boolean z17, yz5.l lVar) {
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.g(z17, new zo1.o4(java.lang.System.currentTimeMillis(), this, z17, lVar));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dwb;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult, resultCode=");
            sb6.append(i18);
            sb6.append(", data=");
            sb6.append(intent != null ? java.lang.Integer.valueOf(intent.hashCode()) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", sb6.toString());
            return;
        }
        if (i17 == 122) {
            long longExtra = intent.getLongExtra("packageId", -1L);
            if (longExtra == -1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "A new package created. pkgId=" + longExtra);
            ((java.util.ArrayList) this.f92868g).add(java.lang.Long.valueOf(longExtra));
            this.f92872n = longExtra;
            return;
        }
        if (i17 != 123) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectPackageUI", "[onActivityResult] request code = " + i17);
            return;
        }
        long longExtra2 = intent.getLongExtra("packageId", -1L);
        if (longExtra2 == -1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Restore task is started. pkgId=" + longExtra2);
        this.f92872n = longExtra2;
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(true);
        if (!((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "Roam is disable");
            finish();
        }
        f92865r = new java.lang.ref.WeakReference(this);
        setMMTitle("");
        setBackBtn(new zo1.p4(this));
        addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_add2, new zo1.q4(this));
        showOptionMenu(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.D);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 7L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s0c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f92867f = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f92867f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("packageRecyclerView");
            throw null;
        }
        recyclerView2.setItemAnimator(new vo1.q());
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f92867f;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("packageRecyclerView");
            throw null;
        }
        recyclerView3.setAdapter(this.f92869h);
        this.f92869h.f474673d = new zo1.r4(this);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s0b);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92866e = (android.widget.LinearLayout) findViewById2;
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.s0a)).setOnClickListener(new zo1.s4(this));
        qo1.j1 j1Var = qo1.j1.f365523a;
        synchronized (j1Var.c()) {
            for (java.util.Map.Entry entry : j1Var.c().entrySet()) {
                long longValue = ((java.lang.Number) entry.getKey()).longValue();
                qo1.j0 j0Var = (qo1.j0) entry.getValue();
                if ((j0Var instanceof qo1.v0) && ((qo1.v0) j0Var).f365557x) {
                    com.tencent.mars.xlog.Log.i("TaskManager", "Disable show auto backup error, pkgId=" + longValue);
                    ((qo1.v0) j0Var).f365557x = false;
                    if (!j0Var.b() && !((qo1.v0) j0Var).p()) {
                        ((qo1.v0) j0Var).f365478d = -1L;
                    }
                }
            }
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        final com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        ((ku5.t0) u0Var).q(new java.lang.Runnable() { // from class: zo1.t4
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager2 = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.this;
                mmAoaManager2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Try to find the target accessory to open");
                jz5.l a17 = mmAoaManager2.a();
                android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) a17.f302833d;
                boolean booleanValue = ((java.lang.Boolean) a17.f302834e).booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "accessory = %s, granted = %s", usbAccessory, java.lang.Boolean.valueOf(booleanValue));
                if (usbAccessory != null) {
                    com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager3 = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
                    if (booleanValue) {
                        mmAoaManager3.c(usbAccessory);
                    } else {
                        mmAoaManager3.e(usbAccessory);
                    }
                }
            }
        });
        onNewIntent(getIntent());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        f92865r = null;
        super.onDestroy();
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("expandCard", false)) {
            java.lang.String stringExtra = intent.getStringExtra("deviceId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f92871m = stringExtra;
            this.f92872n = intent.getLongExtra("packageId", -1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "[onNewIntent] expandByDeviceId=" + this.f92871m + ", expandByPkgId=" + this.f92872n);
            return;
        }
        if (!intent.getBooleanExtra("sub-intent", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "This intent is not a sub intent.");
            return;
        }
        po1.d b17 = po1.d.f357294i.b(intent.getStringExtra("deviceInfo"));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "Try to start next activity, but not match any target.");
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Find a bound device=" + b17);
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.class);
        intent2.putExtra("deviceInfo", b17.c());
        ((ku5.t0) ku5.t0.f312615d).B(new zo1.l4(this, intent2));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        a7();
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.p(this.f92869h);
        com.tencent.mm.plugin.backup.roambackup.r0.f92690g = null;
        zo1.k4 listener = this.f92869h;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.roambackup.r0.f92688e.remove(listener);
        com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
        com.tencent.mm.plugin.setting.ui.setting.g.f161054c = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        android.text.style.TextAppearanceSpan textAppearanceSpan = zo1.k4.f474668i;
        zo1.k4.f474668i = new android.text.style.TextAppearanceSpan(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.style.f494506yc);
        zo1.k4.f474670n = new android.text.style.TextAppearanceSpan(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.style.f494505yb);
        new android.graphics.PorterDuffColorFilter(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f92874p = true;
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: zo1.w4
            @Override // java.lang.Runnable
            public final void run() {
                zo1.x3 x3Var = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.f92864q;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.this;
                selectPackageUI.getClass();
                kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
                if (!selectPackageUI.f92874p) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Showing toast is not allowed.");
                } else if (selectPackageUI.f92873o != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Loading toast is showing already.");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "showLoadingToast");
                    selectPackageUI.f92873o = com.tencent.mm.ui.widget.dialog.u3.f(selectPackageUI, selectPackageUI.getString(com.tencent.mm.R.string.mwe), true, 3, new zo1.h5(selectPackageUI));
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 500L, false);
        if (java.lang.System.currentTimeMillis() - this.f92870i > 300000) {
            b7(false, new zo1.x4(this));
            b7(true, new zo1.y4(this));
        } else {
            b7(false, new zo1.z4(this));
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.b(this.f92869h);
        com.tencent.mm.plugin.backup.roambackup.r0.f92690g = new zo1.a5(this);
        zo1.k4 listener = this.f92869h;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.roambackup.r0.f92688e.add(listener);
    }
}
