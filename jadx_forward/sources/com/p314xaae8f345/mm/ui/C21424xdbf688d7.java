package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav */
/* loaded from: classes14.dex */
public class C21424xdbf688d7 extends android.widget.LinearLayout {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f278527d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278528e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f278529f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f278530g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f278531h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f278532i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f278533m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f278534n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278535o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.kf f278536p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.jf f278537q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f278538r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f278539s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f278540t;

    /* renamed from: u, reason: collision with root package name */
    public dm.f8 f278541u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f278542v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f278543w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f278544x;

    /* renamed from: y, reason: collision with root package name */
    public yb5.d f278545y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.Cif f278546z;

    public C21424xdbf688d7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278536p = com.p314xaae8f345.mm.ui.kf.NotInTalking;
        this.f278541u = new p21.j();
        e();
    }

    /* renamed from: setDefaultBannerStyle */
    private void m78782x7a063ce6(java.lang.String str) {
        this.f278530g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560984zo));
        this.f278530g.setText(str);
        android.widget.LinearLayout linearLayout = this.f278538r;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            this.f278530g.setVisibility(0);
            this.f278532i.setVisibility(8);
            this.f278531h.setVisibility(8);
            this.f278538r.setVisibility(8);
        }
    }

    /* renamed from: setInvitingBannerStyle */
    private void m78783xc6950bd(java.lang.String str) {
        this.f278531h.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560984zo));
        this.f278531h.setText(str);
        this.f278530g.setVisibility(8);
        this.f278532i.setVisibility(0);
        this.f278531h.setVisibility(0);
        this.f278538r.setVisibility(8);
    }

    /* renamed from: setInvitingBannerStyleWithText */
    private void m78784x38673ef0(java.lang.String str) {
        throw null;
    }

    /* renamed from: setTalkingBannerStyle */
    private void m78785x2f157451(java.lang.String str) {
        this.f278530g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560985zp));
        this.f278530g.setText(str);
        this.f278530g.setVisibility(0);
        this.f278532i.setVisibility(8);
        this.f278531h.setVisibility(8);
    }

    public void a() {
        int i17;
        java.lang.String str = this.f278533m;
        if (str == null || this.f278534n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + this.f278533m + ",currentSenderUserName:" + this.f278534n);
            return;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        com.p314xaae8f345.mm.ui.kf kfVar = com.p314xaae8f345.mm.ui.kf.Inviting;
        if (R4 && !this.f278535o) {
            db5.e1.s(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2p), null);
            d();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).d(this.f278533m);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = 4;
            objArr[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
            objArr[2] = 0;
            objArr[3] = 1;
            objArr[4] = this.f278533m;
            objArr[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var.d(13945, objArr);
            return;
        }
        java.lang.String str2 = this.f278533m;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).q4(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkInfo is null!");
            db5.e1.s(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574131h36), null);
            d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[7];
            objArr2[0] = 4;
            objArr2[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
            objArr2[2] = 0;
            objArr2[3] = 1;
            objArr2[4] = this.f278533m;
            objArr2[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr2[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var2.d(13945, objArr2);
            return;
        }
        java.util.List P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).P6(str2);
        if (P6.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkMemberList is empty!");
            db5.e1.s(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574131h36), null);
            d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr3 = new java.lang.Object[7];
            objArr3[0] = 4;
            objArr3[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
            objArr3[2] = 0;
            objArr3[3] = 1;
            objArr3[4] = this.f278533m;
            objArr3[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr3[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var3.d(13945, objArr3);
            return;
        }
        if (P6.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "just one now member now! wait for back service process!");
        }
        com.p314xaae8f345.mm.ui.kf kfVar2 = this.f278536p;
        if (kfVar2 == com.p314xaae8f345.mm.ui.kf.Talking) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterMainUiSource", 2);
            intent.putExtra("enterMainUiWxGroupId", str2);
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "multitalk", ".ui.MultiTalkMainUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr4 = new java.lang.Object[7];
            objArr4[0] = 4;
            objArr4[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
            objArr4[2] = 0;
            objArr4[3] = 0;
            objArr4[4] = this.f278533m;
            objArr4[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr4[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var4.d(13945, objArr4);
            return;
        }
        if (kfVar2 == kfVar) {
            java.lang.String De = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).De(str2, this.f278534n);
            if (De != null) {
                i17 = 1;
                g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0y, ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).mo67022x40021d37(De)), b(P6, this.f278534n), str2, P6.size(), 300L);
            } else {
                i17 = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr5 = new java.lang.Object[7];
            objArr5[0] = 4;
            objArr5[i17] = java.lang.Integer.valueOf(this.f278536p == kfVar ? i17 : 0);
            objArr5[2] = 0;
            objArr5[3] = 0;
            objArr5[4] = this.f278533m;
            objArr5[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr5[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var5.d(13945, objArr5);
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).ff()) {
            db5.e1.s(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1z), null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr6 = new java.lang.Object[7];
            objArr6[0] = 4;
            objArr6[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
            objArr6[2] = 0;
            objArr6[3] = 1;
            objArr6[4] = this.f278533m;
            objArr6[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
            objArr6[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
            g0Var6.d(13945, objArr6);
            return;
        }
        if (P6.size() < zj3.j.e()) {
            g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3e), b(P6, ""), str2, P6.size(), 300L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13945, 4, 0, 0, 0, this.f278533m, java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b), java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f));
            return;
        }
        db5.e1.s(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574125h26, zj3.j.e() + ""), null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr7 = new java.lang.Object[7];
        objArr7[0] = 4;
        objArr7[1] = java.lang.Integer.valueOf(this.f278536p == kfVar ? 1 : 0);
        objArr7[2] = 1;
        objArr7[3] = 1;
        objArr7[4] = this.f278533m;
        objArr7[5] = java.lang.Integer.valueOf(this.f278541u.f66526xeabee3b);
        objArr7[6] = java.lang.Long.valueOf(this.f278541u.f66527xc6d1e13f);
        g0Var7.d(13945, objArr7);
    }

    public java.util.List b(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str != null && str != "") {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 != null && !str2.equals(str)) {
                    arrayList2.add(str2);
                }
            }
            list = arrayList2;
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList.add((java.lang.String) it6.next());
        }
        return arrayList;
    }

    public void c() {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.ui.jf jfVar = this.f278537q;
        if (jfVar == null || (linearLayout = jfVar.f290537a) == null || linearLayout.getVisibility() != 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.jf.a(this.f278537q);
        this.f278537q.f290537a.setVisibility(8);
    }

    public void d() {
        setVisibility(8);
        com.p314xaae8f345.mm.ui.jf jfVar = this.f278537q;
        if (jfVar != null) {
            com.p314xaae8f345.mm.ui.jf.a(jfVar);
        }
    }

    public final void e() {
        android.view.View.inflate(getContext(), mo78786x22e2bc6(), this);
        this.f278542v = findViewById(com.p314xaae8f345.mm.R.id.m7p);
        this.f278543w = findViewById(com.p314xaae8f345.mm.R.id.aun);
        this.f278527d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jws);
        this.f278530g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jx_);
        this.f278531h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jxa);
        this.f278532i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jxb);
        this.f278538r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jwg);
        this.f278539s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jwf);
        this.f278540t = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jwe);
        this.f278528e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f278529f = findViewById(com.p314xaae8f345.mm.R.id.f567628k55);
        this.f278527d.setOnClickListener(new com.p314xaae8f345.mm.ui.ef(this));
        ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.A = (int) java.lang.Math.floor((r0.widthPixels - com.p314xaae8f345.mm.ui.zk.a(getContext(), 56)) / com.p314xaae8f345.mm.ui.zk.a(getContext(), 48));
    }

    public boolean f(int i17) {
        return true;
    }

    public void g(java.lang.String str, java.util.List list, java.lang.String str2, int i17, long j17) {
        mo78793xbc1b1f34(0);
        this.f278528e.setVisibility(4);
        com.p314xaae8f345.mm.ui.jf jfVar = new com.p314xaae8f345.mm.ui.jf(this, this.f278536p == com.p314xaae8f345.mm.ui.kf.Inviting, null);
        this.f278537q = jfVar;
        com.p314xaae8f345.mm.ui.ff ffVar = new com.p314xaae8f345.mm.ui.ff(this, str2);
        com.p314xaae8f345.mm.ui.gf gfVar = new com.p314xaae8f345.mm.ui.gf(this);
        jfVar.f290539c.setText(str);
        this.f278538r.setVisibility(0);
        this.f278538r.removeAllViews();
        if (list != null) {
            if (list.size() > this.A) {
                this.f278539s.setVisibility(0);
                this.f278539s.removeAllViews();
            }
            if (list.size() > this.A * 2) {
                this.f278540t.setVisibility(0);
                this.f278540t.removeAllViews();
            }
        }
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40));
            layoutParams.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            int i19 = this.A;
            if (i18 < i19) {
                this.f278538r.addView(imageView);
            } else if (i18 >= i19 && i18 < i19 * 2) {
                this.f278539s.addView(imageView);
            } else if (i18 >= i19 * 2 && i18 < i19 * 3) {
                this.f278540t.addView(imageView);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str3, null);
            i18++;
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jvy)).setOnClickListener(ffVar);
        jfVar.f290538b.setOnClickListener(gfVar);
        android.view.View view = this.f278544x;
        if (view != null) {
            view.setOnClickListener(gfVar);
        }
        android.widget.LinearLayout linearLayout = jfVar.f290537a;
        if (linearLayout.getVisibility() != 0) {
            linearLayout.setVisibility(0);
            j(linearLayout, j17);
            i(true);
            android.view.View view2 = this.f278544x;
            if (view2 != null) {
                view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
            }
        }
    }

    /* renamed from: getInitViewId */
    public int mo78786x22e2bc6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r13) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21424xdbf688d7.h(boolean):void");
    }

    public final void i(boolean z17) {
        android.view.View view = this.f278544x;
        if (view != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f278543w;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                mo78794x295c769d(com.p314xaae8f345.mm.R.C30861xcebc809e.b7a);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278528e;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f278543w;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo78793xbc1b1f34(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f278528e;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(4);
            }
            yb5.d dVar = this.f278545y;
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public void j(android.widget.LinearLayout linearLayout, long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559387dc);
        loadAnimation.setDuration(j17);
        linearLayout.startAnimation(loadAnimation);
    }

    public void k(android.widget.LinearLayout linearLayout, long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559391dg);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.hf(this, linearLayout));
        linearLayout.startAnimation(loadAnimation);
    }

    /* renamed from: setChattingContext */
    public void m78787x4001c3c7(yb5.d dVar) {
        this.f278545y = dVar;
    }

    /* renamed from: setCurrentSenderUserName */
    public void m78788x557dfce2(java.lang.String str) {
        this.f278534n = str;
    }

    /* renamed from: setEnterMultiTalkListener */
    public void m78789x7741e463(com.p314xaae8f345.mm.ui.Cif cif) {
        this.f278546z = cif;
    }

    /* renamed from: setGroupUserName */
    public void m78790xbaa98b53(java.lang.String str) {
        this.f278533m = str;
    }

    /* renamed from: setInChatRoom */
    public void m78791x5d729e9a(boolean z17) {
        this.f278535o = z17;
    }

    /* renamed from: setMultiTalkInfo */
    public void m78792x9375ea91(dm.f8 f8Var) {
        this.f278541u = f8Var;
    }

    /* renamed from: setNavBackgroundColor */
    public void mo78793xbc1b1f34(int i17) {
        android.widget.LinearLayout linearLayout = this.f278527d;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i17);
        }
    }

    /* renamed from: setNavBackgroundResource */
    public void mo78794x295c769d(int i17) {
        android.widget.LinearLayout linearLayout = this.f278527d;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i17);
        }
    }

    /* renamed from: setRootTipsBarBackground */
    public void m78795xc68cad45(android.view.View view) {
        this.f278544x = view;
    }

    /* renamed from: setUserTalkingStatus */
    public void m78796xd16b48fb(com.p314xaae8f345.mm.ui.kf kfVar) {
        this.f278536p = kfVar;
    }

    public C21424xdbf688d7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278536p = com.p314xaae8f345.mm.ui.kf.NotInTalking;
        this.f278541u = new p21.j();
        e();
    }
}
