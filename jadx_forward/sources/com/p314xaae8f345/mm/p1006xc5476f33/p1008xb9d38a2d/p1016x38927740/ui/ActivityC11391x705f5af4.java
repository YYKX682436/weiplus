package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "account-security_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI */
/* loaded from: classes15.dex */
public final class ActivityC11391x705f5af4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public long f154732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154733h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154734i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f154735m;

    /* renamed from: o, reason: collision with root package name */
    public long f154737o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f154738p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f154739q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f154740r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154741s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154729d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154730e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154731f = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154736n = "";

    public final e71.h V6() {
        return new e71.h(this.f154730e, this.f154729d, this.f154731f, this.f154732g, this.f154733h, this.f154734i, this.f154735m, this.f154736n, this.f154737o);
    }

    public final boolean W6() {
        return ot5.h.f430410a.a(this.f154730e, wo.w0.k(), "MySafeDeviceListUI", false);
    }

    public final void X6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("detail_device_name").H(this.f154729d);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("detail_device_type");
        h17.H(this.f154731f);
        h17.E(8);
        if (this.f154735m) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("detail_device_autologin_switch", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("detail_device_autologin_switch", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("detail_device_autologin_switch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18;
        m79333x58c0be88().edit().putBoolean(c21541x1c1b08fe.f279313q, this.f154734i).commit();
        c21541x1c1b08fe.O(this.f154734i);
        c21541x1c1b08fe.S(this.f154734i);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("detail_device_last_active_time");
        h19.H(k35.m1.f(mo55332x76847179(), this.f154732g * 1000, false, false).toString());
        h19.E(8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("my_safe_device_detail_delete");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h27, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.ButtonPreference");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) h27;
        c21540x14db2dcd.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7k), c21540x14db2dcd.f279303d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        if (this.f154733h) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("detail_device_last_active_time", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("my_safe_device_detail_tip", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("small_divider2", true);
        }
        if (W6()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("detail_device_last_active_time", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("my_safe_device_detail_delete", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }

    public final void Y6(java.lang.String str) {
        android.view.View inflate;
        if (str.length() == 0) {
            return;
        }
        if (this.f154740r == null) {
            android.view.ViewParent parent = m79335xcc101dd9().getParent();
            android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
            if (relativeLayout != null && (inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.xml.f576400dh, relativeLayout)) != null) {
                this.f154740r = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilw);
                inflate.setOnClickListener(new h71.l(this));
            }
        }
        this.f154741s = false;
        ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            m78511x9f88d943.mo82163x4e0f6657(false);
        }
        m79335xcc101dd9().setVisibility(4);
        android.view.View view = this.f154740r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f154740r;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.v_x) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = findViewById;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f154740r;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.nht) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            android.view.View view5 = findViewById2;
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "startLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r45.ff3 ff3Var = new r45.ff3();
        ff3Var.f455803d = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 17692;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getextdeviceinfo";
        lVar.f152197a = ff3Var;
        lVar.f152198b = new r45.gf3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().K(new h71.f(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576453bm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_Device_Uid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154730e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_Device_Type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f154731f = stringExtra2;
        this.f154732g = getIntent().getLongExtra("INTENT_Device_LastActiveTime", 0L);
        this.f154733h = getIntent().getBooleanExtra("INTENT_Device_IsOnline", false);
        this.f154734i = getIntent().getBooleanExtra("INTENT_Device_EnableAutoLogin", false);
        this.f154735m = getIntent().getBooleanExtra("INTENT_Device_SupportAutoLogin", false);
        this.f154737o = getIntent().getLongExtra("INTENT_Device_ClientVersion", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("INTENT_Device_AutoLoginWording");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f154736n = stringExtra3;
        this.f154738p = getIntent().getBooleanExtra("INTENT_Device_NeedRequest", false);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i7p);
        java.lang.String stringExtra4 = getIntent().getStringExtra("INTENT_Device_Name");
        this.f154729d = stringExtra4 != null ? stringExtra4 : "";
        mo54448x9c8c0d33(new h71.e(this));
        X6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(this, iy1.c.MySafeDeviceDetailUI);
        aVar.dk(this, "MySafeDeviceDetailUI");
        aVar.ik(this, 4, 28198);
        if (this.f154738p) {
            Y6(this.f154730e);
        }
        gm0.j1.d().a(361, this);
        gm0.j1.d().a(362, this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(361, this);
        gm0.j1.d().q(362, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String string;
        if (rVar == null || c21560x1fce98fb == null) {
            return true;
        }
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1732210476) {
            if (hashCode == -1603395610) {
                if (!str.equals("detail_device_name")) {
                    return false;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", c21560x1fce98fb, kz5.c1.k(new jz5.l("view_id", "change_device_name_enter"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f154733h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
                db5.e1.N(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7s), this.f154729d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7v), -1, new h71.k(this));
                return true;
            }
            if (hashCode != 2127309775 || !str.equals("my_safe_device_detail_delete")) {
                return false;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", c21560x1fce98fb, kz5.c1.k(new jz5.l("view_id", "delete_device_btn"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f154733h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (this.f154733h) {
                string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else {
                string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            }
            db5.e1.A(mo55332x76847179, string, "", i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.i7i), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new h71.h(this), new h71.i(this)).f(-1).setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            return true;
        }
        if (!str.equals("detail_device_autologin_switch")) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb : null;
        if (c21541x1c1b08fe != null) {
            this.f154734i = c21541x1c1b08fe.N();
            boolean N = c21541x1c1b08fe.N();
            this.f154739q = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572138zr), true, false, h71.c.f360914d);
            r45.bn0 bn0Var = new r45.bn0();
            bn0Var.f452422h = this.f154730e;
            bn0Var.f452419e = (int) this.f154737o;
            bn0Var.f452420f = 1;
            bn0Var.f452421g = N ? 1 : 0;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceoplog";
            lVar.f152200d = 4048;
            lVar.f152197a = bn0Var;
            lVar.f152198b = new r45.cn0();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().K(new h71.d(this));
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var != null && m1Var.mo808xfb85f7b0() == 361) && (m1Var instanceof e71.g)) {
            java.lang.String str2 = str == null ? "" : str;
            e71.g gVar = (e71.g) m1Var;
            android.app.ProgressDialog progressDialog = this.f154739q;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f154739q = null;
            if (i17 == 0 && i18 == 0) {
                e71.k.wi().mo9952xce0038c9(gVar.f331410f, new java.lang.String[0]);
                e71.h hVar = gVar.f331410f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "getDeviceInfo(...)");
                java.lang.String field_name = hVar.f69207x225f1eb0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
                this.f154729d = field_name;
                X6();
                db5.e1.T(this, i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.i7w));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", gVar, kz5.c1.k(new jz5.l("view_id", "change_device_name_succ"), new jz5.l("is_login", java.lang.Integer.valueOf(this.f154733h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(W6() ? 1 : 0))), 28198);
            } else {
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str2, 4);
            }
            X6();
        }
        if ((m1Var != null && m1Var.mo808xfb85f7b0() == 362) && (m1Var instanceof e71.e)) {
            java.lang.String str3 = str != null ? str : "";
            android.app.ProgressDialog progressDialog2 = this.f154739q;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            this.f154739q = null;
            if (i18 == 0 && i18 == 0) {
                e71.k.wi().mo9951xb06685ab(V6(), new java.lang.String[0]);
                finish();
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str3, 4)) {
                return;
            }
            dp.a.m125854x26a183b(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7j, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
