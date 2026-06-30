package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1;

/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI */
/* loaded from: classes9.dex */
public class ActivityC16884xbfaa2323 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f235706y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f235707d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235708e;

    /* renamed from: f, reason: collision with root package name */
    public qk.o f235709f;

    /* renamed from: h, reason: collision with root package name */
    public qk.n f235711h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235712i;

    /* renamed from: m, reason: collision with root package name */
    public int f235713m;

    /* renamed from: n, reason: collision with root package name */
    public long f235714n;

    /* renamed from: o, reason: collision with root package name */
    public long f235715o;

    /* renamed from: p, reason: collision with root package name */
    public int f235716p;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f235720t;

    /* renamed from: x, reason: collision with root package name */
    public r45.j16 f235724x;

    /* renamed from: g, reason: collision with root package name */
    public android.content.SharedPreferences f235710g = null;

    /* renamed from: q, reason: collision with root package name */
    public int f235717q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f235718r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final e31.k f235719s = e31.n.f328620a.a("name_biz");

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f235721u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f235722v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235723w = false;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16884xbfaa2323.f235707d).h("contact_info_block_like");
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(activityC16884xbfaa2323.f235718r == 2);
            c21541x1c1b08fe.L(activityC16884xbfaa2323.X6());
        }
    }

    public final void W6(qk.o oVar, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_subscribe_bizinfo");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_locate");
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f461192d = oVar.f66733x6baace8e;
        ln4Var.f461193e = this.f235708e.d1();
        if (Z6(this.f235713m)) {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
        }
        r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0]);
        c21541x1c1b08fe.O(oVar.W0());
        if (c21541x1c1b08fe2 != null) {
            c21541x1c1b08fe2.O(oVar.u0());
        }
        if (z17) {
            mo43517x10010bd5();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).notifyDataSetChanged();
        }
    }

    public final java.lang.CharSequence X6() {
        if (this.f235718r == 0) {
            return "";
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79472xe7e9e18e);
        if (drawable == null) {
            return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574109oa4) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_y);
        }
        int b17 = i65.a.b(this, 18);
        drawable.setBounds(0, 0, b17, b17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574109oa4));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.setSpan(wVar, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final r45.wl Y6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235708e;
        if (z3Var == null) {
            return null;
        }
        java.lang.String d17 = z3Var.d1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return null;
        }
        return qr3.c0.a(d17);
    }

    public final boolean Z6(int i17) {
        return i17 == 81 || i17 == 92 || i17 == 93 || i17 == 94;
    }

    public final void a7() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235708e;
        if (z3Var == null || !z3Var.r2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(this.f235708e.d1()) || c01.e2.c0(this.f235708e.d1())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", true);
        } else {
            qk.o oVar = this.f235709f;
            if (oVar == null || !oVar.Q0()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", true);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", false);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_verifyuser_weibo", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_bizinfo", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_locate", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_finder", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_like", true);
    }

    public final void b7(boolean z17) {
        qk.o oVar;
        if (this.f235708e == null || (oVar = this.f235709f) == null || !oVar.Q0()) {
            return;
        }
        r45.l36 l36Var = new r45.l36();
        l36Var.f460648e = c01.e2.P(this.f235708e) ? 1 : 0;
        l36Var.f460647d = getIntent().getIntExtra("key_start_biz_profile_setting_from_scene", 0);
        r01.q3.Zi().b(this.f235708e.d1(), z17 ? 15 : 16, 0, 0.0f, 0.0f, 0, null, 0, null, l36Var);
    }

    public final void c7(boolean z17) {
        qk.o oVar;
        if (this.f235708e != null) {
            if (this.f235710g == null) {
                this.f235710g = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_is_mute");
            if (z17 && (oVar = this.f235709f) != null && oVar.Q0()) {
                m78594xca3c3c9a(0);
                if (c21541x1c1b08fe != null) {
                    this.f235710g.edit().putBoolean("contact_is_mute", true).commit();
                }
            } else {
                m78594xca3c3c9a(8);
                if (c21541x1c1b08fe != null) {
                    this.f235710g.edit().putBoolean("contact_is_mute", false).commit();
                }
            }
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(z17);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).notifyDataSetChanged();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.b_;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(qr3.o.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17;
        qk.o oVar;
        boolean z18;
        qk.o oVar2;
        qk.o oVar3;
        e31.k kVar;
        qk.o oVar4 = this.f235709f;
        if (oVar4 != null) {
            this.f235711h = oVar4.D0(false);
        }
        qk.o oVar5 = this.f235709f;
        if (oVar5 == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", true);
        } else if (oVar5.Q0()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_msg", true);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235708e;
        if (z3Var != null && z3Var.r2() && (oVar3 = this.f235709f) != null && oVar3.Q0() && (kVar = this.f235719s) != null) {
            ((g31.l) kVar).p(this.f235709f.f66748xdec927b, new qr3.b0(this));
        }
        boolean P = c01.e2.P(this.f235708e);
        this.f235712i = P;
        c7(P);
        getIntent().getBooleanExtra("KIsHardDevice", false);
        if (getIntent() != null && getIntent().getBooleanExtra("KIsHardDevice", false)) {
            if (getIntent() == null) {
                z18 = false;
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030);
                java.lang.String stringExtra2 = getIntent().getStringExtra("device_type");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5336xc89469db c5336xc89469db = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5336xc89469db();
                am.f5 f5Var = c5336xc89469db.f135652g;
                f5Var.f88171b = stringExtra;
                f5Var.f88170a = stringExtra2;
                c5336xc89469db.e();
                z18 = c5336xc89469db.f135653h.f88272a;
            }
            this.f235708e.r2();
            if (!this.f235708e.r2() || !z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewBizInfoSettingUI", "%s is not my hard biz contact", this.f235708e.d1());
                a7();
                if (Z6(this.f235713m)) {
                    if (this.f235709f == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_subscribe_bizinfo")).O(this.f235709f.W0());
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_bizinfo", false);
                        return;
                    }
                }
                return;
            }
            if (this.f235709f == null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_bizinfo", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_locate", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_msg", true);
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_subscribe_bizinfo")).O(this.f235709f.W0());
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_locate");
            if (this.f235709f.D0(false).o()) {
                c21541x1c1b08fe.O(this.f235709f.u0());
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_locate", true);
                c21541x1c1b08fe.O(this.f235709f.u0());
            }
            if (!this.f235709f.W0()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
                return;
            }
            if (this.f235711h == null && (oVar2 = this.f235709f) != null) {
                this.f235711h = oVar2.D0(false);
            }
            qk.n nVar = this.f235711h;
            if (nVar == null || !nVar.q()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
                return;
            } else {
                j45.l.g("brandservice");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", false);
                return;
            }
        }
        if (!this.f235708e.r2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewBizInfoSettingUI", "%s is not my contact", this.f235708e.d1());
            a7();
            if (Z6(this.f235713m)) {
                if (this.f235709f == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                } else {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_subscribe_bizinfo")).O(this.f235709f.W0());
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_bizinfo", false);
                }
            }
        } else if (this.f235709f != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_subscribe_bizinfo")).O(this.f235709f.W0());
            if (this.f235709f.W0()) {
                if (this.f235711h == null && (oVar = this.f235709f) != null) {
                    this.f235711h = oVar.D0(false);
                }
                qk.n nVar2 = this.f235711h;
                if (nVar2 == null || !nVar2.q()) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
                } else {
                    j45.l.g("brandservice");
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", false);
                }
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_locate");
            if (this.f235709f.D0(false).o()) {
                c21541x1c1b08fe2.O(this.f235709f.u0());
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_locate", true);
                c21541x1c1b08fe2.O(this.f235709f.u0());
            }
        }
        qk.o oVar6 = this.f235709f;
        if (oVar6 != null && oVar6.Q0()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_desc").J(com.p314xaae8f345.mm.R.C30867xcad56011.nax);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f235708e;
        if (z3Var2 != null && z3Var2.l2()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_is_mute", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_bizinfo", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_desc", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_finder", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_locate", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_template_recv", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_add_shortcut_btn", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_clear_msg", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_subscribe_msg", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_block_like");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f235708e;
        if (!((z3Var3 == null || this.f235709f == null || !z3Var3.r2() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235708e.d1()) || r01.z.n(this.f235708e.d1()) || this.f235718r == 0) ? false : true) || c21541x1c1b08fe3 == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_like", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_like", false);
            c21541x1c1b08fe3.O(this.f235718r == 2);
            c21541x1c1b08fe3.L(X6());
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).h("contact_info_block_finder");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = this.f235708e;
        if (z3Var4 != null && this.f235709f != null && z3Var4.r2() && !this.f235708e.l2()) {
            r45.wl Y6 = Y6();
            boolean z19 = Y6 != null && Y6.f470779t == 1;
            boolean z27 = this.f235717q != 0;
            if (z19 && z27) {
                z17 = true;
                if (z17 || c21541x1c1b08fe4 == null) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_finder", true);
                } else {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_finder", false);
                    c21541x1c1b08fe4.O(this.f235717q == 1);
                    return;
                }
            }
        }
        z17 = false;
        if (z17) {
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235707d).m("contact_info_block_finder", true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        e31.k kVar;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoSettingUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1001 || intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = (com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7) intent.getParcelableExtra("key_biz_data");
        if (!booleanExtra || c11161xb2ee02d7 == null || this.f235709f == null || (kVar = this.f235719s) == null) {
            return;
        }
        e31.o oVar = new e31.o();
        java.lang.String str = this.f235709f.f66748xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        oVar.f328622a = str;
        ((java.util.ArrayList) oVar.f328624c).addAll(c11161xb2ee02d7.f153365d);
        oVar.f328625d = c11161xb2ee02d7.f153366e;
        oVar.f328630i = new qr3.v(this);
        ((g31.l) kVar).x(oVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.el elVar;
        r45.td5 td5Var;
        super.onCreate(bundle);
        this.f235707d = m79336x8b97809d();
        this.f235715o = java.lang.System.currentTimeMillis() / 1000;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bcp);
        m78591x7f5d15fd(false);
        mo78530x8b45058f();
        mo54448x9c8c0d33(new qr3.r(this));
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f235708e = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(stringExtra, true);
        this.f235709f = r01.z.b(stringExtra);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = stringExtra;
        objArr[1] = java.lang.Boolean.valueOf(this.f235708e != null);
        objArr[2] = java.lang.Boolean.valueOf(this.f235709f != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoSettingUI", "user:%s contact:%b, bizInfo:%b", objArr);
        this.f235713m = getIntent().getIntExtra("Contact_Scene", 9);
        this.f235714n = getIntent().getLongExtra("key_profile_enter_timestamp", 0L);
        this.f235716p = getIntent().getIntExtra("key_start_biz_profile_setting_service_type", 0);
        r45.wl Y6 = Y6();
        if (Y6 == null || (td5Var = Y6.f470782w) == null) {
            this.f235717q = 0;
        } else {
            this.f235717q = td5Var.f467860d;
        }
        if (Y6 == null || (elVar = Y6.M) == null) {
            this.f235718r = 0;
        } else {
            this.f235718r = elVar.f455124d;
        }
        mo43517x10010bd5();
        b7(true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f235721u.clear();
        b7(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r23, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb r24) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323.mo26755x5cc6f590(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }
}
