package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI */
/* loaded from: classes5.dex */
public class ActivityC10362xd5e3feb2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.GridView D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 E;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145441d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.za f145442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145443f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145445h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145446i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145447m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145448n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145449o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145450p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145451q;

    /* renamed from: r, reason: collision with root package name */
    public long f145452r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145453s;

    /* renamed from: t, reason: collision with root package name */
    public long f145454t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f145455u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145456v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145457w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f145458x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f145459y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f145460z;

    public static void T6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        activityC10362xd5e3feb2.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            str2 = z07.f66692x4854b29d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_RemarkName", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "mTicket:%s", activityC10362xd5e3feb2.f145457w);
        intent.putExtra("key_add_contact_verify_ticket", activityC10362xd5e3feb2.f145457w);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10362xd5e3feb2.f145441d;
        if (a3Var != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(str));
        }
        intent.putExtra("Contact_Nick", str3);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", activityC10362xd5e3feb2.f145455u);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = str;
            c6005x8a110b2f.e();
        }
        if (n17 != null && n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", activityC10362xd5e3feb2.f145455u);
        j45.l.j(activityC10362xd5e3feb2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public com.p314xaae8f345.mm.p648x55baa833.ui.ab U6(android.view.View view) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ab abVar = new com.p314xaae8f345.mm.p648x55baa833.ui.ab(this);
        abVar.f145571a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m7e);
        abVar.f145572b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7b);
        abVar.f145573c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7d);
        return abVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cj9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f145458x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hfa);
        this.f145459y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hf_);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m7b);
        this.B = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m7d);
        this.f145460z = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.m7e);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f563881c3);
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.afo);
        this.D = gridView;
        gridView.setAdapter((android.widget.ListAdapter) this.f145442e);
        android.widget.ImageView imageView = this.f145460z;
        if (imageView != null) {
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.ra(this));
        }
        this.D.setOnTouchListener(new com.p314xaae8f345.mm.p648x55baa833.ui.sa(this));
        this.D.postDelayed(new com.p314xaae8f345.mm.p648x55baa833.ui.ta(this), 100L);
        java.lang.String str = null;
        android.text.SpannableString j17 = null;
        if (this.f145460z != null) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView2 = this.f145460z;
            java.lang.String str2 = this.f145449o;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView2, str2, null);
        }
        android.widget.TextView textView = this.A;
        if (textView != null) {
            java.lang.String str3 = this.f145449o;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "ct == null");
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145441d;
                    if (a3Var != null) {
                        str = a3Var.z0(str3);
                    }
                } else {
                    str = n17.w0();
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = n17.w0();
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = n17.f2();
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                if (str == null) {
                    str = "";
                }
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize);
            }
            textView.setText(j17);
        }
        if (this.B != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f145455u) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f145449o)) {
                dm.w8 w8Var = new dm.w8();
                w8Var.f69018x28d46377 = this.f145450p;
                w8Var.f69024xd0366ace = this.f145451q;
                w8Var.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68});
                if (android.text.TextUtils.isEmpty(w8Var.f69023xcf77aa53)) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145451q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145450p)) {
                        this.H = true;
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(this.f145451q);
                        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str4 = this.f145450p;
                        java.lang.String str5 = w8Var.f69019xbd959cfd;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str4, str5, linkedList, 0));
                    }
                    this.B.setVisibility(4);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText("＠" + w8Var.f69023xcf77aa53);
                }
            } else {
                this.B.setVisibility(8);
            }
        }
        android.widget.TextView textView2 = this.f145458x;
        if (textView2 != null) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = this.f145448n;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str6 == null) {
                str6 = "";
            }
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str6));
        }
        if (this.f145459y != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145456v)) {
            android.widget.TextView textView3 = this.f145459y;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
            java.lang.String str7 = this.f145456v;
            sb6.append(str7 != null ? str7 : "");
            sb6.append("\"");
            java.lang.String sb7 = sb6.toString();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, sb7));
        }
        android.widget.TextView textView4 = this.C;
        if (textView4 != null) {
            textView4.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.wa(this));
        }
        if (this.C == null || !pt0.f0.Li(this.f145453s, this.f145452r).I2()) {
            return;
        }
        this.C.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr);
        this.C.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560750t5));
        this.C.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3));
        this.C.setEnabled(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[onCreate]");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571329bx));
        this.f145452r = getIntent().getLongExtra("msgLocalId", 0L);
        this.f145453s = getIntent().getStringExtra("msgTalker");
        this.f145454t = getIntent().getLongExtra("msgSvrId", 0L);
        this.f145448n = getIntent().getStringExtra("invitertitle");
        this.f145449o = getIntent().getStringExtra("inviterusername");
        this.f145450p = getIntent().getStringExtra("inviterappid");
        this.f145451q = getIntent().getStringExtra("inviterdescid");
        this.f145455u = getIntent().getStringExtra("chatroom");
        this.f145456v = getIntent().getStringExtra("invitationreason");
        this.f145457w = getIntent().getStringExtra("ticket");
        this.f145444g = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        this.f145443f = getIntent().getStringExtra("nickname");
        this.f145445h = getIntent().getStringExtra("descid");
        this.f145446i = getIntent().getStringExtra("appid");
        this.f145447m = getIntent().getStringExtra("headimgurl");
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145455u;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f145441d = a17.W0(str);
        this.f145442e = new com.p314xaae8f345.mm.p648x55baa833.ui.za(this, this);
        java.lang.String[] split = this.f145444g.split(",");
        if (split != null && split.length > 0) {
            java.lang.String str2 = split[0];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[%s] has been in chatroom![%s]", str2, this.f145455u);
            if (this.f145441d.A0() != null && this.f145441d.A0().contains(str2)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f145453s, this.f145452r);
                if (!Li.I2()) {
                    Li.l1(Li.F | 128);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f145452r, Li, true);
                }
            }
        }
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.qa(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(453, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[onResume]");
        gm0.j1.n().f354821b.a(453, this);
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof ab0.u) && i17 == 0 && i18 == 0) {
            if (this.H && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.B.getText())) {
                this.H = false;
                dm.w8 w8Var = new dm.w8();
                w8Var.f69018x28d46377 = this.f145450p;
                w8Var.f69024xd0366ace = this.f145451q;
                w8Var.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68});
                if (android.text.TextUtils.isEmpty(w8Var.f69023xcf77aa53)) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145451q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145450p)) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(this.f145451q);
                        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str2 = this.f145450p;
                        java.lang.String str3 = w8Var.f69019xbd959cfd;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str2, str3, linkedList, 0));
                    }
                    this.B.setVisibility(4);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText("＠" + w8Var.f69023xcf77aa53);
                }
            }
            if (this.G) {
                this.f145442e.notifyDataSetChanged();
            }
        }
    }
}
