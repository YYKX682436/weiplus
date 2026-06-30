package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI */
/* loaded from: classes11.dex */
public class ActivityC16851xecb309af extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f235246s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f235247d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235248e;

    /* renamed from: f, reason: collision with root package name */
    public r61.a f235249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f235250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f235251h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f235252i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f235253m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f235254n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f235255o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f235256p;

    /* renamed from: q, reason: collision with root package name */
    public long f235257q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235258r;

    public final void V6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f235256p.optString("ShopUrl"));
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(mo55332x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final boolean X6(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return r61.q0.j(str, mo55332x76847179(), byteArrayOutputStream.toByteArray());
    }

    public final void Y6(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235247d).w(str);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235247d).h(str);
        if (c21554xcdf33ced != null) {
            c21554xcdf33ced.U = true;
            c21554xcdf33ced.W = 5;
            if (z17) {
                c21554xcdf33ced.f279321y = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
            }
            c21554xcdf33ced.H(str2);
            c21554xcdf33ced.O(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576399aa;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bhk);
        mo54448x9c8c0d33(new hr3.u5(this));
        this.f235247d = m79336x8b97809d();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Mobile_MD5");
        java.lang.String stringExtra2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235248e.d1())) {
                this.f235249f = m61.k.wi().h(this.f235258r);
            } else {
                this.f235249f = m61.k.wi().h(this.f235248e.d1());
            }
        } else if ((stringExtra != null && stringExtra.length() > 0) || (stringExtra2 != null && stringExtra2.length() > 0)) {
            r61.a i17 = m61.k.wi().i(stringExtra);
            this.f235249f = i17;
            if (i17 == null || i17.e() == null || this.f235249f.e().length() <= 0) {
                r61.a i18 = m61.k.wi().i(stringExtra2);
                this.f235249f = i18;
                if (i18 != null && i18.e() != null) {
                    this.f235249f.e().getClass();
                }
            }
        }
        r61.a aVar = this.f235249f;
        if (aVar == null || aVar.e() == null || this.f235249f.e().length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = null");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String h17 = this.f235249f.h();
            if (h17 == null) {
                h17 = "";
            }
            sb6.append(h17);
            sb6.append(" ");
            java.lang.String f17 = this.f235249f.f();
            if (f17 == null) {
                f17 = "";
            }
            sb6.append(f17.replace(" ", ""));
            this.f235250g = sb6.toString();
        }
        Y6("contact_info_social_mobile", this.f235250g, true);
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(9, null));
        this.f235257q = getIntent().getLongExtra("Contact_Uin", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("Contact_QQNick");
        this.f235251h = stringExtra3;
        if (this.f235257q != 0 && q17 != 0) {
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                r61.w1 g17 = m61.k.Ri().g(this.f235257q);
                if (g17 == null) {
                    g17 = null;
                }
                if (g17 != null) {
                    this.f235251h = g17.c();
                }
            }
            java.lang.String str2 = this.f235251h;
            if (str2 == null) {
                str2 = "";
            }
            this.f235252i = str2;
            this.f235252i += " " + new kk.v(this.f235257q).longValue();
        }
        Y6("contact_info_social_qq", this.f235252i, true);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 0) == 0) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235248e.A1)) {
            this.f235253m = "";
        } else {
            this.f235253m = this.f235248e.B1;
        }
        Y6("contact_info_social_linkedin", this.f235253m, true);
        Y6("contact_info_social_facebook", null, false);
        java.lang.String stringExtra4 = getIntent().getStringExtra("verify_gmail");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f235255o = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("profileName");
        java.lang.String Q1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q1(this.f235255o);
        if (stringExtra5 == null) {
            stringExtra5 = Q1;
        }
        this.f235254n = stringExtra5;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235255o) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235254n)) {
            Y6("contact_info_social_googlecontacts", "", false);
        } else {
            Y6("contact_info_social_googlecontacts", this.f235254n + '\n' + this.f235255o, false);
        }
        if (c01.z1.r().equals(this.f235248e.d1())) {
            str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PROFILE_WEIDIANINFO_STRING, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", str);
        } else {
            str = this.f235248e.D1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                this.f235256p = new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactSocialInfoUI", e17, "", new java.lang.Object[0]);
                this.f235256p = null;
            }
        }
        org.json.JSONObject jSONObject = this.f235256p;
        if (jSONObject != null) {
            Y6("contact_info_social_weishop", jSONObject.optString("ShopName"), true);
        } else {
            Y6("contact_info_social_weishop", "", false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f235258r = stringExtra;
        this.f235248e = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235258r, true);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        int lastIndexOf;
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSocialInfoUI", str + " item has been clicked!");
        if (str.equals("contact_info_social_mobile")) {
            if (this.f235249f == null || this.f235248e == null) {
                return false;
            }
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h(this.f235249f.i())) {
                r61.a aVar = this.f235249f;
                java.lang.String[] stringArray = (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f474333p)) ? getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559550a4) : getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559549a3);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi().getClass();
                db5.e1.e(this, null, stringArray, null, new hr3.v5(this, stringArray));
                return false;
            }
            java.lang.String str2 = this.f235250g;
            if (str2 == null || str2.length() == 0 || (lastIndexOf = this.f235250g.lastIndexOf(32) + 1) <= 0) {
                return false;
            }
            V6(this.f235250g.substring(lastIndexOf));
            return false;
        }
        if (str.equals("contact_info_social_qq")) {
            return false;
        }
        if (str.equals("contact_info_social_linkedin")) {
            java.lang.String str3 = this.f235248e.C1;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            return false;
        }
        if (str.equals("contact_info_social_facebook") || str.equals("contact_info_social_googlecontacts") || !str.equals("contact_info_social_weishop") || this.f235256p == null) {
            return false;
        }
        if (c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PROFILE_WEIDIANINFO_ALERT_INT, null) == null) {
            db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.bhm, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new hr3.x5(this), null);
            return false;
        }
        W6();
        return false;
    }
}
