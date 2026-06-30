package com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI */
/* loaded from: classes11.dex */
public class ActivityC18981xa9d9abb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 f259079e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259081g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259082h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f259083i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f259084m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f259085n;

    /* renamed from: d, reason: collision with root package name */
    public final int f259078d = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f259080f = 1;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 c18980x270fd319 = this.f259079e;
        if (c18980x270fd319 != null) {
            return c18980x270fd319;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fragment");
        throw null;
    }

    public java.lang.String U6() {
        return "";
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 V6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqk;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        ((ty.o0) i95.n0.c(ty.o0.class)).getClass();
        return kz5.o1.c(wn.v.class);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f259078d && i18 == -1 && intent != null) {
            if (!intent.getBooleanExtra("key_remind_changed", false)) {
                intent = null;
            }
            if (intent != null) {
                ((lr4.k) ((jz5.n) T6().f259077x).mo141623x754a37bb()).m8146xced61ae5();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 V6 = V6();
        android.os.Bundle bundle2 = new android.os.Bundle();
        int intExtra = getIntent().getIntExtra("KEY_CONV_TYPE", 1);
        this.f259080f = intExtra;
        bundle2.putInt("KEY_CONV_TYPE", intExtra);
        V6.mo7562xe26dab14(bundle2);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.gd9, V6, null);
        m7630xb2c12e75.f();
        this.f259079e = V6;
        this.f259082h = getIntent().getStringExtra("key_w1w_refer_scene");
        this.f259083i = getIntent().getStringExtra("key_w1w_refer_scene_note");
        this.f259084m = getIntent().getStringExtra("key_w1w_refer_session_id");
        this.f259085n = getIntent().getStringExtra("key_w1w_refer_ext_info");
        ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).getClass();
        java.lang.String c17 = mr4.a.c(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "generatePageId(...)");
        this.f259081g = c17;
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        vu4.d dVar = vu4.d.f521828h;
        java.lang.String str = this.f259082h;
        java.lang.String str2 = this.f259083i;
        java.lang.String str3 = this.f259084m;
        java.lang.String str4 = this.f259085n;
        java.lang.String str5 = this.f259081g;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentPageId");
            throw null;
        }
        ((fr4.g0) fVar).cj(dVar, str, str2, str3, str4, str5, vu4.e.f521839e, "", "", "", this.f259080f == 1 ? vu4.g.f521856e : vu4.g.f521857f);
        T6().f259076w = new lr4.b(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f259081g != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_w1w_refer_scene");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_w1w_refer_scene_note");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_w1w_refer_session_id");
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_w1w_refer_ext_info");
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            vu4.d dVar = vu4.d.f521829i;
            java.lang.String str = this.f259081g;
            if (str != null) {
                ((fr4.g0) fVar).cj(dVar, stringExtra, stringExtra2, stringExtra3, stringExtra4, str, vu4.e.f521839e, "", "", "", this.f259080f == 1 ? vu4.g.f521856e : vu4.g.f521857f);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentPageId");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo54450xbf7c1df6(U6());
        java.lang.String stringExtra = getIntent().getStringExtra("key_w1w_self_contact_data");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            try {
                ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).hj(new org.json.JSONObject(stringExtra));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgConvListUI", "Failed to parse contact data", e17);
            }
        }
        T6().K0(vu4.d.f521830m, "", "", "");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        T6().K0(vu4.d.f521831n, "", "", "");
    }
}
