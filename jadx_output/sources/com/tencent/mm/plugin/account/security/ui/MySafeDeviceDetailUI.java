package com.tencent.mm.plugin.account.security.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "account-security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MySafeDeviceDetailUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public long f73199g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73200h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73201i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f73202m;

    /* renamed from: o, reason: collision with root package name */
    public long f73204o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f73205p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f73206q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f73207r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f73208s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73196d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73197e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73198f = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73203n = "";

    public final e71.h V6() {
        return new e71.h(this.f73197e, this.f73196d, this.f73198f, this.f73199g, this.f73200h, this.f73201i, this.f73202m, this.f73203n, this.f73204o);
    }

    public final boolean W6() {
        return ot5.h.f348877a.a(this.f73197e, wo.w0.k(), "MySafeDeviceListUI", false);
    }

    public final void X6() {
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("detail_device_name").H(this.f73196d);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("detail_device_type");
        h17.H(this.f73198f);
        h17.E(8);
        if (this.f73202m) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("detail_device_autologin_switch", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("detail_device_autologin_switch", true);
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("detail_device_autologin_switch");
        kotlin.jvm.internal.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18;
        getDefaultSharedPreferences().edit().putBoolean(checkBoxPreference.f197780q, this.f73201i).commit();
        checkBoxPreference.O(this.f73201i);
        checkBoxPreference.S(this.f73201i);
        com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("detail_device_last_active_time");
        h19.H(k35.m1.f(getContext(), this.f73199g * 1000, false, false).toString());
        h19.E(8);
        com.tencent.mm.ui.base.preference.Preference h27 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("my_safe_device_detail_delete");
        kotlin.jvm.internal.o.e(h27, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.ButtonPreference");
        com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference = (com.tencent.mm.ui.base.preference.ButtonPreference) h27;
        buttonPreference.O(getString(com.tencent.mm.R.string.i7k), buttonPreference.f197770d.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        if (this.f73200h) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("detail_device_last_active_time", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("my_safe_device_detail_tip", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("small_divider2", true);
        }
        if (W6()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("detail_device_last_active_time", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("my_safe_device_detail_delete", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    public final void Y6(java.lang.String str) {
        android.view.View inflate;
        if (str.length() == 0) {
            return;
        }
        if (this.f73207r == null) {
            android.view.ViewParent parent = getListView().getParent();
            android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
            if (relativeLayout != null && (inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.xml.f494867dh, relativeLayout)) != null) {
                this.f73207r = inflate.findViewById(com.tencent.mm.R.id.ilw);
                inflate.setOnClickListener(new h71.l(this));
            }
        }
        this.f73208s = false;
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBounceEnabled(false);
        }
        getListView().setVisibility(4);
        android.view.View view = this.f73207r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f73207r;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.v_x) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = findViewById;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f73207r;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.nht) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            android.view.View view5 = findViewById2;
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r45.ff3 ff3Var = new r45.ff3();
        ff3Var.f374270d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 17692;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getextdeviceinfo";
        lVar.f70664a = ff3Var;
        lVar.f70665b = new r45.gf3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new h71.f(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494920bm;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_Device_Uid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73197e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_Device_Type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f73198f = stringExtra2;
        this.f73199g = getIntent().getLongExtra("INTENT_Device_LastActiveTime", 0L);
        this.f73200h = getIntent().getBooleanExtra("INTENT_Device_IsOnline", false);
        this.f73201i = getIntent().getBooleanExtra("INTENT_Device_EnableAutoLogin", false);
        this.f73202m = getIntent().getBooleanExtra("INTENT_Device_SupportAutoLogin", false);
        this.f73204o = getIntent().getLongExtra("INTENT_Device_ClientVersion", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("INTENT_Device_AutoLoginWording");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f73203n = stringExtra3;
        this.f73205p = getIntent().getBooleanExtra("INTENT_Device_NeedRequest", false);
        setMMTitle(com.tencent.mm.R.string.i7p);
        java.lang.String stringExtra4 = getIntent().getStringExtra("INTENT_Device_Name");
        this.f73196d = stringExtra4 != null ? stringExtra4 : "";
        setBackBtn(new h71.e(this));
        X6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(this, iy1.c.MySafeDeviceDetailUI);
        aVar.dk(this, "MySafeDeviceDetailUI");
        aVar.ik(this, 4, 28198);
        if (this.f73205p) {
            Y6(this.f73197e);
        }
        gm0.j1.d().a(361, this);
        gm0.j1.d().a(362, this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(361, this);
        gm0.j1.d().q(362, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String string;
        if (rVar == null || preference == null) {
            return true;
        }
        java.lang.String str = preference.f197780q;
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1732210476) {
            if (hashCode == -1603395610) {
                if (!str.equals("detail_device_name")) {
                    return false;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", preference, kz5.c1.k(new jz5.l("view_id", "change_device_name_enter"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f73200h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
                db5.e1.N(getContext(), getString(com.tencent.mm.R.string.i7s), this.f73196d, getString(com.tencent.mm.R.string.i7v), -1, new h71.k(this));
                return true;
            }
            if (hashCode != 2127309775 || !str.equals("my_safe_device_detail_delete")) {
                return false;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", preference, kz5.c1.k(new jz5.l("view_id", "delete_device_btn"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f73200h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (this.f73200h) {
                string = getContext().getString(com.tencent.mm.R.string.i7h);
                kotlin.jvm.internal.o.d(string);
            } else {
                string = getContext().getString(com.tencent.mm.R.string.i7g);
                kotlin.jvm.internal.o.d(string);
            }
            db5.e1.A(context, string, "", i65.a.r(getContext(), com.tencent.mm.R.string.i7i), i65.a.r(getContext(), com.tencent.mm.R.string.f490347sg), new h71.h(this), new h71.i(this)).f(-1).setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
            return true;
        }
        if (!str.equals("detail_device_autologin_switch")) {
            return false;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference : null;
        if (checkBoxPreference != null) {
            this.f73201i = checkBoxPreference.N();
            boolean N = checkBoxPreference.N();
            this.f73206q = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490605zr), true, false, h71.c.f279381d);
            r45.bn0 bn0Var = new r45.bn0();
            bn0Var.f370889h = this.f73197e;
            bn0Var.f370886e = (int) this.f73204o;
            bn0Var.f370887f = 1;
            bn0Var.f370888g = N ? 1 : 0;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceoplog";
            lVar.f70667d = 4048;
            lVar.f70664a = bn0Var;
            lVar.f70665b = new r45.cn0();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().K(new h71.d(this));
        }
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var != null && m1Var.getType() == 361) && (m1Var instanceof e71.g)) {
            java.lang.String str2 = str == null ? "" : str;
            e71.g gVar = (e71.g) m1Var;
            android.app.ProgressDialog progressDialog = this.f73206q;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f73206q = null;
            if (i17 == 0 && i18 == 0) {
                e71.k.wi().update(gVar.f249877f, new java.lang.String[0]);
                e71.h hVar = gVar.f249877f;
                kotlin.jvm.internal.o.f(hVar, "getDeviceInfo(...)");
                java.lang.String field_name = hVar.field_name;
                kotlin.jvm.internal.o.f(field_name, "field_name");
                this.f73196d = field_name;
                X6();
                db5.e1.T(this, i65.a.r(this, com.tencent.mm.R.string.i7w));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", gVar, kz5.c1.k(new jz5.l("view_id", "change_device_name_succ"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f73200h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
            } else {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.tencent.mm.ui.pc.a(this, i17, i18, str2, 4);
            }
            X6();
        }
        if ((m1Var != null && m1Var.getType() == 362) && (m1Var instanceof e71.e)) {
            java.lang.String str3 = str != null ? str : "";
            android.app.ProgressDialog progressDialog2 = this.f73206q;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            this.f73206q = null;
            if (i18 == 0 && i18 == 0) {
                e71.k.wi().delete(V6(), new java.lang.String[0]);
                finish();
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((com.tencent.mm.app.o7) wi6).getClass();
            if (com.tencent.mm.ui.pc.a(context, i17, i18, str3, 4)) {
                return;
            }
            dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.i7j, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
