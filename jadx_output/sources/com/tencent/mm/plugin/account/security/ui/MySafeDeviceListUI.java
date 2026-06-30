package com.tencent.mm.plugin.account.security.ui;

/* loaded from: classes15.dex */
public class MySafeDeviceListUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.q0, com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f73209u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f73210d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f73212f;

    /* renamed from: g, reason: collision with root package name */
    public h71.v f73213g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f73214h;

    /* renamed from: e, reason: collision with root package name */
    public int f73211e = -2;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f73215i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f73216m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f73217n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f73218o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f73219p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f73220q = new h71.n(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f73221r = new h71.p(this);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f73222s = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f73223t = new h71.t(this);

    public final void V6(e71.h hVar, java.text.SimpleDateFormat simpleDateFormat) {
        com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference = new com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference(this, null);
        safeDeviceListPreference.C("mysafedevice_" + hVar.field_uid);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = hVar.field_name;
        ((ke0.e) xVar).getClass();
        safeDeviceListPreference.L(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
        if (!hVar.field_online) {
            safeDeviceListPreference.H(k35.m1.f(getContext(), hVar.field_createtime * 1000, false, false));
        }
        h71.v vVar = this.f73213g;
        safeDeviceListPreference.T = vVar;
        safeDeviceListPreference.U = vVar;
        safeDeviceListPreference.M = hVar;
        ((com.tencent.mm.ui.base.preference.h0) this.f73210d).d(safeDeviceListPreference, -1);
        if (ot5.h.f348877a.a(hVar.field_uid, wo.w0.k(), "MySafeDeviceListUI", false)) {
            return;
        }
        ((java.util.LinkedList) this.f73212f).add(safeDeviceListPreference);
    }

    public final void W6() {
        ((java.util.LinkedList) this.f73212f).clear();
        this.f73214h = e71.k.wi().y0();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f73215i;
        arrayList.clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f73216m;
        arrayList2.clear();
        java.util.Collections.sort(this.f73214h, new h71.r(this));
        for (e71.h hVar : this.f73214h) {
            boolean z17 = hVar.field_online;
            ot5.h hVar2 = ot5.h.f348877a;
            if (z17) {
                if (hVar2.a(hVar.field_uid, wo.w0.k(), "MySafeDeviceListUI", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MySafeDeviceListUI", "my device uuid: " + hVar.field_uid);
                    arrayList.add(0, hVar);
                } else {
                    arrayList.add(hVar);
                }
            } else if (hVar2.a(hVar.field_uid, wo.w0.k(), "MySafeDeviceListUI", false)) {
                arrayList.add(0, hVar);
            } else {
                arrayList2.add(hVar);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f73210d).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f73210d).g(com.tencent.mm.R.xml.f494921bn);
        if (((java.util.LinkedList) this.f73214h).size() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73210d).w("my_safe_device_list_tip");
            ((com.tencent.mm.ui.base.preference.h0) this.f73210d).w("my_online_device_list_tip");
            ((com.tencent.mm.ui.base.preference.h0) this.f73210d).w("my_offline_device_list_tip");
            showOptionMenu(false);
            return;
        }
        if (this.f73211e == 1) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.i7q), this.f73220q);
            this.f73211e = ~this.f73211e;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss");
        if (arrayList.size() > 0) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
            preferenceTitleCategory.L(getContext().getString(com.tencent.mm.R.string.isn));
            ((com.tencent.mm.ui.base.preference.h0) this.f73210d).d(preferenceTitleCategory, -1);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V6((e71.h) it.next(), simpleDateFormat);
        }
        if (arrayList2.size() > 0) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory2 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
            preferenceTitleCategory2.L(getContext().getString(com.tencent.mm.R.string.ism));
            ((com.tencent.mm.ui.base.preference.h0) this.f73210d).d(preferenceTitleCategory2, -1);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            V6((e71.h) it6.next(), simpleDateFormat);
        }
        showOptionMenu(true);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f73222s;
        java.lang.Runnable runnable = this.f73223t;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
        getListView().addOnLayoutChangeListener(new h71.s(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getFooterView() {
        android.widget.TextView textView = (android.widget.TextView) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.chg, (android.view.ViewGroup) getListView().getParent(), false).findViewById(com.tencent.mm.R.id.mq8);
        this.f73218o = textView.getPaddingTop();
        textView.setText(java.lang.String.format("<a href='%s'>%s</a>", getString(com.tencent.mm.R.string.ij_), getString(com.tencent.mm.R.string.i7u)));
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
        return textView;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new h71.q(this));
        this.f73210d = getPreferenceScreen();
        this.f73212f = new java.util.LinkedList();
        this.f73213g = new h71.v(this, null);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.i7q), this.f73220q);
        setMMTitle(com.tencent.mm.R.string.isk);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(850, this);
        gm0.j1.d().a(361, this);
        e71.k.wi().add(this);
        initView();
        e71.f fVar = new e71.f();
        gm0.j1.d().g(fVar);
        this.f73217n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490605zr), true, true, new h71.o(this, fVar));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MySafeDeviceListUI);
        aVar.dk(this, getClass().getSimpleName());
        aVar.ik(this, 4, 28198);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(850, this);
        gm0.j1.d().q(361, this);
        e71.k.wi().remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MySafeDeviceListUI", "notify " + str);
        this.f73221r.post(new h71.u(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MySafeDeviceListUI", "null key");
            return false;
        }
        if (!str.startsWith("mysafedevice_")) {
            return true;
        }
        e71.h hVar = ((com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference) preference).M;
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI.class);
        intent.putExtra("INTENT_Device_Uid", hVar.field_uid);
        intent.putExtra("INTENT_Device_Name", hVar.field_name);
        intent.putExtra("INTENT_Device_Type", hVar.field_devicetype);
        intent.putExtra("INTENT_Device_LastActiveTime", hVar.field_createtime);
        intent.putExtra("INTENT_Device_IsOnline", hVar.field_online);
        intent.putExtra("INTENT_Device_EnableAutoLogin", hVar.field_enableautologin);
        intent.putExtra("INTENT_Device_SupportAutoLogin", hVar.field_supportautologin);
        intent.putExtra("INTENT_Device_ClientVersion", hVar.field_clientVersion);
        intent.putExtra("INTENT_Device_AutoLoginWording", hVar.field_autologinwording);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73221r.postDelayed(new java.lang.Runnable() { // from class: h71.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.f73209u;
                com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.this.W6();
            }
        }, 200L);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MySafeDeviceListUI", "errorCode %d, errorMsg %s, scene %s", java.lang.Integer.valueOf(i18), str, m1Var);
        android.app.ProgressDialog progressDialog = this.f73217n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f73217n.dismiss();
            this.f73217n = null;
        }
        if (m1Var.getType() == 361) {
            if (i17 != 0 || i18 != 0) {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.tencent.mm.ui.pc.a(this, i17, i18, str, 4);
            } else {
                e71.k.wi().update(((e71.g) m1Var).f249877f, new java.lang.String[0]);
                db5.e1.T(this, i65.a.r(this, com.tencent.mm.R.string.i7w));
            }
        }
    }
}
