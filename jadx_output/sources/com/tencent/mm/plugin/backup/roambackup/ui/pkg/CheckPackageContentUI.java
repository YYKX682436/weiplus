package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "zo1/s", "zo1/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CheckPackageContentUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f92798w = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f92801g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Spinner f92802h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f92803i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f92804m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f92805n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f92806o;

    /* renamed from: p, reason: collision with root package name */
    public zo1.w f92807p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92808q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f92810s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92811t;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f92799e = "MicroMsg.CheckBaoContentUI";

    /* renamed from: f, reason: collision with root package name */
    public long f92800f = -1;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f92809r = jz5.h.b(new zo1.b0(this));

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f92812u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f92813v = jz5.h.b(new zo1.u0(this));

    public static final void Z6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI, java.util.List list, int i17) {
        checkPackageContentUI.getClass();
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            if (list.size() > 1) {
                kz5.g0.t(list, new zo1.z());
            }
        } else if (list.size() > 1) {
            kz5.g0.t(list, new zo1.a0());
        }
        zo1.w wVar = checkPackageContentUI.f92807p;
        if (wVar != null) {
            wVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
    }

    public static final void a7(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        android.widget.LinearLayout linearLayout = checkPackageContentUI.f92801g;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mainContentLl");
            throw null;
        }
        linearLayout.setVisibility(8);
        checkPackageContentUI.c7().setVisibility(0);
        boolean z17 = true;
        checkPackageContentUI.f92811t = true;
        ((android.widget.TextView) checkPackageContentUI.c7().findViewById(com.tencent.mm.R.id.rgi)).setText(charSequence);
        if (charSequence2 != null && charSequence2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            ((android.widget.TextView) checkPackageContentUI.c7().findViewById(com.tencent.mm.R.id.rgg)).setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) checkPackageContentUI.c7().findViewById(com.tencent.mm.R.id.rgg);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        android.widget.Button button = (android.widget.Button) checkPackageContentUI.c7().findViewById(com.tencent.mm.R.id.rgf);
        if (str != null) {
            button.setText(str);
        } else {
            button.setText(com.tencent.mm.R.string.m77);
        }
        if (onClickListener != null) {
            button.setOnClickListener(onClickListener);
        } else {
            button.setOnClickListener(new zo1.t0(checkPackageContentUI));
        }
    }

    public final void b7() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    public final android.widget.LinearLayout c7() {
        return (android.widget.LinearLayout) ((jz5.n) this.f92809r).getValue();
    }

    public final void d7() {
        android.widget.LinearLayout linearLayout = this.f92801g;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mainContentLl");
            throw null;
        }
        linearLayout.setVisibility(0);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f92810s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f92810s = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.mwe), true, 3, new zo1.c0(this));
        ((ku5.t0) ku5.t0.f312615d).q(new zo1.g0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxe;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        b7();
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.mvn);
        setBackBtnVisible(false);
        getController().x0(getString(com.tencent.mm.R.string.mvh), new java.lang.Runnable() { // from class: zo1.l0
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.f92798w;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.this.b7();
            }
        });
        setBounceEnabled(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.S);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 9L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92800f = longExtra;
        if (longExtra < 0) {
            com.tencent.mars.xlog.Log.e(this.f92799e, "Invalid package id = " + this.f92800f);
            b7();
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486228rz1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92801g = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486230rz3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById2;
        this.f92802h = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) ((jz5.n) this.f92813v).getValue());
        android.widget.Spinner spinner2 = this.f92802h;
        if (spinner2 == null) {
            kotlin.jvm.internal.o.o("typeSpinner");
            throw null;
        }
        spinner2.setOnItemSelectedListener(new zo1.m0(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484264rk3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92803i = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f92807p = new zo1.w();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f92803i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f92803i;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        zo1.w wVar = this.f92807p;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        recyclerView2.setAdapter(wVar);
        zo1.w wVar2 = this.f92807p;
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        wVar2.f474807g = new zo1.n0(this);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486229rz2);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92804m = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f486227rz0);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92805n = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.ryz);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById6;
        this.f92806o = button;
        button.setEnabled(false);
        android.widget.TextView textView = this.f92804m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("selectAllTv");
            throw null;
        }
        textView.setOnClickListener(new zo1.o0(this));
        android.widget.Button button2 = this.f92806o;
        if (button2 != null) {
            button2.setOnClickListener(new zo1.p0(this));
        } else {
            kotlin.jvm.internal.o.o("deleteBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(this.f92800f);
        if (k17 != null) {
            this.f92808q = k17;
            d7();
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f92799e, "Fail to get package by id = " + this.f92800f);
        b7();
    }
}
