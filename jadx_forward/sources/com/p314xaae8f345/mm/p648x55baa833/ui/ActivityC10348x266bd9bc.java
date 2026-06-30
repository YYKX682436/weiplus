package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI */
/* loaded from: classes5.dex */
public class ActivityC10348x266bd9bc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements al5.e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f145349r = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f145350d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f145351e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f145352f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f145353g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f145354h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145355i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f145356m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f145357n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145358o;

    /* renamed from: p, reason: collision with root package name */
    public int f145359p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145360q;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRoomNameUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f145354h.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams.topMargin = 0;
            this.f145354h.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f145357n;
            c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), this.f145357n.getPaddingTop(), this.f145357n.getPaddingRight(), 0);
            this.f145356m.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f145354h.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f145354h.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20492 = this.f145357n;
        c22607x763d20492.setPadding(c22607x763d20492.getPaddingLeft(), this.f145357n.getPaddingTop(), this.f145357n.getPaddingRight(), i17);
        int height = this.f145356m.getHeight();
        this.f145357n.requestLayout();
        this.f145357n.post(new com.p314xaae8f345.mm.p648x55baa833.ui.a5(this, height));
    }

    public final void T6(boolean z17) {
        if (this.f145351e == null) {
            return;
        }
        if (z17 && la5.b.f399133a.g(true)) {
            android.view.View view = this.f145351e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f145351e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View view;
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f145356m = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.hdf);
        this.f145357n = c22607x763d2049;
        c22607x763d2049.e(this);
        this.f145350d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.jpm);
        this.f145351e = findViewById(com.p314xaae8f345.mm.R.id.d9a);
        this.f145352f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpo);
        this.f145353g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpn);
        this.f145354h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f145355i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhj);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bgj);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565155bh1);
        this.f145359p = getIntent().getIntExtra("Key_Scenen", 0);
        this.f145358o = getIntent().getStringExtra("Key_Room_Id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRoomNameUI", "scene %d, roomId %s", java.lang.Integer.valueOf(this.f145359p), this.f145358o);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145358o)) {
            finish();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f145358o, true);
        if (((int) n17.E2) > 0) {
            if (this.f145359p == 3) {
                ng5.a.a(imageView, c01.z1.r());
            } else {
                ng5.a.a(imageView, n17.d1());
            }
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String P0 = n17.P0();
        if (P0 == null) {
            P0 = "";
        }
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, P0);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String w07 = n17.w0();
        if (w07 == null) {
            w07 = "";
        }
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, w07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRoomNameUI", "roomName %s, remarkName %s", i17, i18);
        int i19 = this.f145359p;
        if (i19 == 1) {
            this.f145352f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i3r);
            this.f145353g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gy_);
            this.f145350d.setText(i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(i17)) {
                this.f145350d.setHint(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4x));
            }
            getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574413i40);
            getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574415i42);
        } else if (i19 == 2) {
            this.f145352f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574428i61);
            this.f145353g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gya);
            this.f145350d.setText(i18);
            this.f145350d.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.f574428i61);
            java.lang.CharSequence string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(i17) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4x) : i17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565156bh2);
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gy9, string);
            ((ke0.e) xVar3).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string2));
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565157bh3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(i17)) {
                textView2.setVisibility(8);
            } else {
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.v4(this, i17, textView2));
            }
            getString(com.p314xaae8f345.mm.R.C30867xcad56011.itd);
        } else if (i19 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemarkRoomNameUI", "unknown scene %d, finish()", java.lang.Integer.valueOf(i19));
            finish();
        } else {
            this.f145352f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i5k);
            this.f145353g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gy8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f145350d;
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145358o);
            java.lang.String str = z07 != null ? z07.f69109x43482a3c : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = c01.z1.l();
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str);
            ((ke0.e) xVar4).getClass();
            c21486x59d05a04.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, i27));
            getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574414i41);
            getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3z);
        }
        this.f145360q = this.f145350d.getText().toString();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f145350d;
        c21486x59d05a042.setSelection(c21486x59d05a042.getText().length());
        if (la5.b.f399133a.g(true) && (view = this.f145351e) != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.w4(this));
            T6(this.f145350d.getText().length() > 0);
        }
        this.f145350d.addTextChangedListener(new com.p314xaae8f345.mm.p648x55baa833.ui.x4(this));
        if (this.f145359p == 2) {
            ck5.f b17 = ck5.f.b(this.f145350d);
            b17.f124094f = 0;
            b17.f124093e = 64;
            b17.f124089a = false;
            b17.d(null);
        } else {
            ck5.f b18 = ck5.f.b(this.f145350d);
            b18.f124094f = 0;
            b18.f124093e = 32;
            b18.f124089a = false;
            b18.d(null);
        }
        this.f145350d.requestFocus();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.y4(this));
        this.f145354h.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.z4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145358o = getIntent().getStringExtra("RoomInfo_Id");
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p648x55baa833.ui.e5.class);
    }
}
