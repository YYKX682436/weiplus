package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact */
/* loaded from: classes8.dex */
public final class ActivityC16846x5788f028 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f235227y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f235228d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235229e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p670x38b72420.o f235230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f235231g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f235233i;

    /* renamed from: n, reason: collision with root package name */
    public xm3.t0 f235235n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f235237p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f235238q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235239r;

    /* renamed from: s, reason: collision with root package name */
    public long f235240s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f235241t;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f235244w;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f235232h = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ContactMoreInfoUI", null, 1);

    /* renamed from: m, reason: collision with root package name */
    public final pr3.h f235234m = new pr3.h();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f235236o = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f235242u = jz5.h.b(new hr3.w3(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f235243v = jz5.h.b(new hr3.t5(this));

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f235245x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, pr3.c cVar, com.p314xaae8f345.mm.p670x38b72420.o oVar, int i17) {
        activityC16846x5788f028.getClass();
        cVar.f439491i = true;
        cVar.f439499t = new hr3.x3(activityC16846x5788f028, oVar, i17);
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, com.p314xaae8f345.mm.p670x38b72420.o oVar, int i17) {
        if (oVar == null) {
            activityC16846x5788f028.getClass();
            return;
        }
        yq3.v vVar = (yq3.v) oVar;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16846x5788f028.getIntent(), i17, 1, vVar.h());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "click event");
        android.content.Intent intent = new android.content.Intent(activityC16846x5788f028.getIntent());
        intent.putExtra("scroll_to", i17);
        if (vVar.k()) {
            intent.putExtra("Contact_User", activityC16846x5788f028.f235229e);
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, activityC16846x5788f028);
            return;
        }
        java.lang.String str = activityC16846x5788f028.f235229e;
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username is ");
        sb6.append(str);
        sb6.append(", contact: ");
        sb6.append(vVar.h());
        sb6.append(", nickname: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
        sb6.append(z3Var != null ? z3Var.P0() : null);
        sb6.append(", remark: ");
        sb6.append(vVar.c());
        sb6.append(", username: ");
        sb6.append(activityC16846x5788f028.f235229e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactMoreInfoUI", "view stranger remark, username is null");
            return;
        }
        java.lang.String stringExtra = activityC16846x5788f028.getIntent().getStringExtra("Contact_Nick");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "nickname: " + stringExtra);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = vVar.f546068f;
        java.lang.String P0 = z3Var2 != null ? z3Var2.P0() : null;
        if (P0 != null && P0.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            stringExtra = P0;
        }
        intent.putExtra("Contact_Nick", stringExtra);
        intent.putExtra("Contact_RemarkName", vVar.c());
        android.content.Intent intent2 = activityC16846x5788f028.getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra("key_label_click_source", 0) : 0;
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.y(intent, activityC16846x5788f028);
    }

    public static /* synthetic */ void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, int i17, yz5.p pVar, yz5.p pVar2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            pVar = hr3.o5.f365383d;
        }
        if ((i18 & 4) != 0) {
            pVar2 = hr3.p5.f365409d;
        }
        activityC16846x5788f028.Y6(i17, pVar, pVar2);
    }

    public final void W6(pr3.c cVar, com.p314xaae8f345.mm.p670x38b72420.o oVar, pr3.f fVar, boolean z17) {
        java.util.List j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.j(oVar, getIntent());
        java.lang.String r17 = i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.oc7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        cVar.f439489g = kz5.n0.g0(j17, r17, null, null, 0, null, null, 62, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        cVar.f439496q = fVar;
    }

    public final boolean X6() {
        com.p314xaae8f345.mm.p670x38b72420.o oVar = this.f235230f;
        return (oVar != null && !((yq3.v) oVar).k()) && getIntent().getBooleanExtra("User_Verify", false);
    }

    public final void Y6(int i17, yz5.p pVar, yz5.p pVar2) {
        pr3.c cVar;
        pr3.h hVar = this.f235234m;
        pr3.c cVar2 = new pr3.c(((java.util.ArrayList) hVar.f439509d).size(), i17, 0, null, 0, false, null, null, null, null, null, null, null, null, 16380, null);
        java.lang.Object obj = this.f235230f;
        if (obj != null) {
            cVar = cVar2;
            pVar.mo149xb9724478(cVar, obj);
        } else {
            cVar = cVar2;
        }
        ((java.util.ArrayList) hVar.f439509d).add(cVar);
        ((java.util.ArrayList) this.f235236o).add(new hr3.q5(this, pVar2, cVar));
    }

    public final void a7(int i17, int i18) {
        pr3.h hVar = this.f235234m;
        ((java.util.ArrayList) hVar.f439509d).add(new pr3.d(((java.util.ArrayList) hVar.f439509d).size(), i17, i18, true));
    }

    public final void b7() {
        getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f235231g = getIntent().getStringExtra("Contact_ChatRoomId");
        this.f235229e = getIntent().getStringExtra("Contact_User");
        this.f235230f = ((yq3.e) ((com.p314xaae8f345.mm.p670x38b72420.p) i95.n0.c(com.p314xaae8f345.mm.p670x38b72420.p.class))).wi(this.f235229e, getIntent());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p670x38b72420.o oVar = this.f235230f;
        sb6.append(oVar != null ? ((yq3.v) oVar).e() : null);
        sb6.append(" ?: ");
        com.p314xaae8f345.mm.p670x38b72420.o oVar2 = this.f235230f;
        sb6.append(oVar2 != null ? ((yq3.v) oVar2).h() : null);
        sb6.append(" ?: ");
        sb6.append(this.f235229e);
        sb6.append(", nickname: ");
        com.p314xaae8f345.mm.p670x38b72420.o oVar3 = this.f235230f;
        sb6.append(oVar3 != null ? ((yq3.v) oVar3).d() : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p670x38b72420.o oVar4 = this.f235230f;
        sb6.append(oVar4 != null ? java.lang.Boolean.valueOf(((yq3.v) oVar4).k()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        this.f235237p = getIntent().getStringExtra("KLinkedInAddFriendNickName");
        this.f235238q = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
        this.f235239r = getIntent().getStringExtra("verify_gmail");
        getIntent().getStringExtra("profileName");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570221a26;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        super.onCreate(bundle);
        b7();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate, contact: ");
        sb6.append(this.f235230f);
        sb6.append(", isContact:");
        com.p314xaae8f345.mm.p670x38b72420.o oVar = this.f235230f;
        sb6.append(oVar != null ? java.lang.Boolean.valueOf(((yq3.v) oVar).k()) : null);
        sb6.append(" desc: ");
        com.p314xaae8f345.mm.p670x38b72420.o oVar2 = this.f235230f;
        sb6.append(oVar2 != null ? ((yq3.v) oVar2).f() : null);
        sb6.append(", chatRoomName: ");
        sb6.append(getIntent().getStringExtra("Contact_RoomNickname"));
        sb6.append(", addScene: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f235242u).mo141623x754a37bb()).intValue());
        sb6.append(" searchMobile:");
        sb6.append((java.lang.String) ((jz5.n) this.f235243v).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235231g)) {
            this.f235233i = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f235231g);
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.o3p);
        mo54448x9c8c0d33(new hr3.q4(this));
        com.p314xaae8f345.mm.p670x38b72420.o oVar3 = this.f235230f;
        a7(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(oVar3 != null ? ((yq3.v) oVar3).h() : null) ? com.p314xaae8f345.mm.R.C30867xcad56011.nbi : com.p314xaae8f345.mm.R.C30867xcad56011.nbh, com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.f574085gy2, new hr3.b5(this), new hr3.e5(this));
        com.p314xaae8f345.mm.p670x38b72420.o oVar4 = this.f235230f;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(oVar4 != null ? ((yq3.v) oVar4).h() : null)) {
            Y6(com.p314xaae8f345.mm.R.C30867xcad56011.gxv, new hr3.f5(this), new hr3.g5(this));
            Y6(com.p314xaae8f345.mm.R.C30867xcad56011.gxu, hr3.h5.f365139d, new hr3.i5(this));
            Y6(com.p314xaae8f345.mm.R.C30867xcad56011.gxx, new hr3.j5(this), new hr3.k5(this));
            Y6(com.p314xaae8f345.mm.R.C30867xcad56011.f572500nb4, new hr3.f4(this), new hr3.g4(this));
        }
        com.p314xaae8f345.mm.p670x38b72420.o oVar5 = this.f235230f;
        if ((oVar5 != null && ((yq3.v) oVar5).k()) || X6()) {
            com.p314xaae8f345.mm.p670x38b72420.o oVar6 = this.f235230f;
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(oVar6 != null ? ((yq3.v) oVar6).h() : null)) {
                a7(com.p314xaae8f345.mm.R.C30867xcad56011.f572495nb2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp);
            }
            Y6(com.p314xaae8f345.mm.R.C30867xcad56011.nbc, hr3.h4.f365138d, new hr3.i4(this));
        }
        a7(com.p314xaae8f345.mm.R.C30867xcad56011.nb8, com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp);
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.bcy, hr3.j4.f365202d, new hr3.k4(this));
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.f572503be5, hr3.l4.f365275d, new hr3.n4(this));
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.f572496nb3, hr3.o4.f365382d, new hr3.p4(this));
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.bda, hr3.r4.f365470d, new hr3.s4(this));
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.bhc, hr3.t4.f365532d, new hr3.u4(this));
        Y6(com.p314xaae8f345.mm.R.C30867xcad56011.biq, hr3.v4.f365631d, new hr3.w4(this));
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.mf8, null, new hr3.x4(this), 2, null);
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.bd8, null, hr3.y4.f365735d, 2, null);
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.bhh, null, new hr3.z4(this), 2, null);
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.bhl, null, new hr3.a5(this), 2, null);
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.bhf, null, new hr3.c5(this), 2, null);
        Z6(this, com.p314xaae8f345.mm.R.C30867xcad56011.bhj, null, new hr3.d5(this), 2, null);
        pr3.h hVar = this.f235234m;
        ((java.util.ArrayList) hVar.f439509d).add(new pr3.a(((java.util.ArrayList) hVar.f439509d).size(), com.p314xaae8f345.mm.R.C30860x5b28f31.alm));
        this.f235235n = new xm3.t0(hVar, this, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact$initItems$32
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 0 ? type != 1 ? new pr3.i() : new pr3.o() : new pr3.n();
            }
        }, true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.m7k);
        c22849x81a93d252.m7964x8d4ad49c(null);
        c22849x81a93d252.mo7960x6cab2c8d(this.f235235n);
        c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f235228d = c22849x81a93d252;
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.mm.p670x38b72420.o oVar7 = this.f235230f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(intent, 45, 1, oVar7 != null ? ((yq3.v) oVar7).h() : null);
        int intExtra = getIntent().getIntExtra("scroll_to", -1);
        if (intExtra <= 0 || (c22849x81a93d25 = this.f235228d) == null) {
            return;
        }
        c22849x81a93d25.post(new hr3.r5(this, intExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f235232h;
        if (c20976x6ba6452a != null) {
            c20976x6ba6452a.m77667xac79a11b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        super.onResume();
        b7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "onResume, data: ".concat(kz5.n0.g0(this.f235234m.f439509d, "\n", null, null, 0, null, hr3.s5.f365501d, 30, null)));
        java.util.Iterator it = this.f235236o.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
        xm3.t0 t0Var = this.f235235n;
        if (t0Var == null || (c16718x7059cefe = t0Var.I) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(j93.n.class);
        super.mo43518x5e67c7ca(set);
    }
}
