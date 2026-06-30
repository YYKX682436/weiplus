package com.tencent.mm.plugin.backup.roambackup.roamlite;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "mo1/d", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateRoamLitePkgUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.ref.WeakReference f92696s;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92697d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f92698e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f92699f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f92700g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92701h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f92702i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f92703m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f92704n;

    /* renamed from: o, reason: collision with root package name */
    public po1.d f92705o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f92706p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f92707q;

    /* renamed from: r, reason: collision with root package name */
    public int f92708r = 1;

    static {
        new mo1.d(null);
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    public final void V6(long j17, java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
        jSONObject.put("packageId", j17);
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((com.tencent.mm.plugin.backup.roambackup.p1) yVar).Di("roamLiteNewBackupResult", jSONObject2);
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
                com.tencent.mars.xlog.Log.w("MM.Roam.CreateRoamLitePkgUI", "Fail to parse backup range from result intent");
            } else {
                this.f92704n = (com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo) parcelableExtra;
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f92696s = new java.lang.ref.WeakReference(this);
        setMMTitle("");
        setBackBtn(new mo1.f(this), com.tencent.mm.R.raw.icons_outlined_close);
        hideActionbarLine();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92941i);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 2L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rhj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92697d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rhk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92698e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rhn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92699f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rho);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92700g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rhp);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92701h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.rhq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f92702i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.rcs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rhm)).setOnClickListener(new mo1.g(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rcr)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.rht)).setVisibility(8);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483981t14)).setVisibility(8);
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.rhr);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById8;
        this.f92703m = button;
        button.setOnClickListener(new mo1.h(this));
        com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", "setup default rule");
        this.f92704n = new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(null, null, null, 0L, 0L, 31, null);
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        po1.d b17 = po1.d.f357294i.b(stringExtra);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MM.Roam.CreateRoamLitePkgUI", "[prepareInitData] Fail to parse device from " + stringExtra);
            U6();
            return;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        this.f92706p = stringExtra2 != null ? stringExtra2 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[prepareInitData] deviceId=");
        sb6.append(b17.f357295a);
        sb6.append(", sessionId=");
        java.lang.String str = this.f92706p;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            throw null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", sb6.toString());
        this.f92705o = b17;
        android.widget.TextView textView = this.f92698e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f92698e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView2.setText(b17.b());
        android.widget.TextView textView3 = this.f92698e;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView3.setTextColor(getColor(com.tencent.mm.R.color.abw));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92697d;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("deviceIcon");
            throw null;
        }
        weImageView.setVisibility(0);
        int ordinal = b17.f357296b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f92697d;
            if (weImageView2 != null) {
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_backup);
                return;
            } else {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
        }
        if (ordinal != 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f92697d;
            if (weImageView3 != null) {
                weImageView3.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f92697d;
        if (weImageView4 != null) {
            weImageView4.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
        } else {
            kotlin.jvm.internal.o.o("deviceIcon");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f92696s = null;
        if (this.f92707q) {
            return;
        }
        int i17 = this.f92708r;
        java.lang.String str = this.f92706p;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            throw null;
        }
        V6(-1L, str, i17);
        this.f92707q = true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String string;
        super.onResume();
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92704n;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        boolean z17 = backupRangeInfo.f92733g == 0 && backupRangeInfo.f92734h == 0;
        if (z17 && backupRangeInfo.f92730d != po1.b.f357290e) {
            android.widget.LinearLayout linearLayout = this.f92700g;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("rulesContainer");
                throw null;
            }
            linearLayout.setVisibility(8);
            android.widget.TextView textView = this.f92699f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("singleRuleTv");
                throw null;
            }
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = this.f92704n;
            if (backupRangeInfo2 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setText(fo1.r.c(backupRangeInfo2, context));
            return;
        }
        android.widget.TextView textView2 = this.f92699f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("singleRuleTv");
            throw null;
        }
        textView2.setText(backupRangeInfo.f92730d != po1.b.f357289d ? getString(com.tencent.mm.R.string.my7) : getString(com.tencent.mm.R.string.mvp));
        android.widget.LinearLayout linearLayout2 = this.f92700g;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("rulesContainer");
            throw null;
        }
        linearLayout2.setVisibility(0);
        android.widget.TextView textView3 = this.f92701h;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("convDescTv");
            throw null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = this.f92704n;
        if (backupRangeInfo3 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        objArr[0] = fo1.r.c(backupRangeInfo3, context2);
        textView3.setText(getString(com.tencent.mm.R.string.mx6, objArr));
        if (z17) {
            android.widget.TextView textView4 = this.f92702i;
            if (textView4 != null) {
                textView4.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("timeDescTv");
                throw null;
            }
        }
        android.widget.TextView textView5 = this.f92702i;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("timeDescTv");
            throw null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo4 = this.f92704n;
        if (backupRangeInfo4 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        long j17 = backupRangeInfo4.f92733g;
        if (j17 != 0 && backupRangeInfo4.f92734h != 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo5 = this.f92704n;
            if (backupRangeInfo5 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            calendar.setTimeInMillis(backupRangeInfo5.f92733g);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo6 = this.f92704n;
            if (backupRangeInfo6 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            calendar2.setTimeInMillis(backupRangeInfo6.f92734h);
            string = getString(com.tencent.mm.R.string.f490682m73, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), java.lang.Integer.valueOf(calendar2.get(1)), java.lang.Integer.valueOf(calendar2.get(2) + 1), java.lang.Integer.valueOf(calendar2.get(5)));
            kotlin.jvm.internal.o.d(string);
        } else if (j17 != 0) {
            java.util.Calendar calendar3 = java.util.Calendar.getInstance();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo7 = this.f92704n;
            if (backupRangeInfo7 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            calendar3.setTimeInMillis(backupRangeInfo7.f92733g);
            string = getString(com.tencent.mm.R.string.f490684m75, java.lang.Integer.valueOf(calendar3.get(1)), java.lang.Integer.valueOf(calendar3.get(2) + 1), java.lang.Integer.valueOf(calendar3.get(5)));
            kotlin.jvm.internal.o.d(string);
        } else {
            java.util.Calendar calendar4 = java.util.Calendar.getInstance();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo8 = this.f92704n;
            if (backupRangeInfo8 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            calendar4.setTimeInMillis(backupRangeInfo8.f92734h);
            string = getString(com.tencent.mm.R.string.f490683m74, java.lang.Integer.valueOf(calendar4.get(1)), java.lang.Integer.valueOf(calendar4.get(2) + 1), java.lang.Integer.valueOf(calendar4.get(5)));
            kotlin.jvm.internal.o.d(string);
        }
        objArr2[0] = string;
        textView5.setText(getString(com.tencent.mm.R.string.mx7, objArr2));
        android.widget.TextView textView6 = this.f92702i;
        if (textView6 != null) {
            textView6.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("timeDescTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
