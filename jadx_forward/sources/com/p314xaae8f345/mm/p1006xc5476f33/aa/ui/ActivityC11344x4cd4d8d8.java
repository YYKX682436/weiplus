package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI */
/* loaded from: classes11.dex */
public class ActivityC11344x4cd4d8d8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int V = 0;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.util.ArrayList F;
    public java.util.ArrayList G;
    public java.util.HashSet H;
    public java.util.HashSet I;

    /* renamed from: J, reason: collision with root package name */
    public long f154004J;
    public android.widget.CheckBox K;
    public android.view.View L;
    public java.util.List M;
    public java.util.List N;
    public int P;
    public int Q;
    public int R;
    public java.util.ArrayList S = new java.util.ArrayList();
    public java.util.ArrayList T = new java.util.ArrayList();
    public java.util.HashMap U = new java.util.HashMap();

    public static java.util.List w7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8) {
        activityC11344x4cd4d8d8.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = activityC11344x4cd4d8d8.y7(activityC11344x4cd4d8d8.z7()).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (activityC11344x4cd4d8d8.I.contains(str)) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    public static void x7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8, java.util.List list) {
        java.util.HashSet hashSet = activityC11344x4cd4d8d8.I;
        if (hashSet != null) {
            hashSet.clear();
        } else {
            activityC11344x4cd4d8d8.I = new java.util.HashSet();
        }
        activityC11344x4cd4d8d8.I.addAll(list);
        activityC11344x4cd4d8d8.K.setChecked(true);
        activityC11344x4cd4d8d8.b7().notifyDataSetChanged();
    }

    public final boolean A7() {
        return this.R == 1;
    }

    public final boolean B7() {
        return A7() && this.P == 3 && this.Q == 4;
    }

    public final void C7() {
        if (this.I.size() > 0) {
            m78500x43e00957(1, true);
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571259z, java.lang.Integer.valueOf(this.I.size())));
        } else {
            m78500x43e00957(1, false);
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        }
        if (this.I.size() == 1 && this.I.contains(c01.z1.r())) {
            m78500x43e00957(1, false);
        } else if (this.I.size() == 0) {
            m78500x43e00957(1, false);
        } else {
            m78500x43e00957(1, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.I.remove(str);
            b7().notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!A7() || dVar.f288383s == null || this.U.size() <= 0) {
            return null;
        }
        return h61.o.j(60, (java.lang.String) this.U.get(dVar.f288383s));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        java.util.ArrayList arrayList;
        if (this.C == 6) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t1(this, this.G);
        }
        java.lang.String str = this.D;
        java.util.ArrayList z76 = z7();
        if (A7()) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(this.T);
        } else {
            arrayList = new java.util.ArrayList();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u1(this, str, z76, arrayList, B7());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        java.util.ArrayList arrayList;
        if (this.C == 6) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v1(this, this.G);
        }
        java.lang.String str = this.D;
        java.util.ArrayList z76 = z7();
        if (A7()) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(this.T);
        } else {
            arrayList = new java.util.ArrayList();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w1(this, str, z76, arrayList, B7());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return this.E;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569407ab;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8.h7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        C7();
        this.f287983h.m75367x3935f5b0(this);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r1(this));
        if (c01.e2.R(this.D)) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569410ae, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.b_);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setMinimumHeight(i65.a.b(mo55332x76847179(), 44));
            linearLayout.setPadding(i65.a.b(mo55332x76847179(), 16), i65.a.b(mo55332x76847179(), 15), 0, i65.a.b(mo55332x76847179(), 8));
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f563854ba);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f287979d.addHeaderView(inflate, null, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = getIntent().getIntExtra("enter_scene", 1);
        this.G = getIntent().getStringArrayListExtra("third_party_usernamelist");
        this.E = getIntent().getStringExtra("titile");
        this.f154004J = getIntent().getLongExtra("max_select_num", 20L);
        getIntent().getIntExtra("select_type", 1);
        this.D = getIntent().getStringExtra("chatroomName");
        this.P = getIntent().getIntExtra("enter_mode", 2);
        this.Q = getIntent().getIntExtra("enter_sub_mode", 4);
        this.R = getIntent().getIntExtra("group_solitatire_flag", 0);
        if (A7()) {
            this.S = getIntent().getStringArrayListExtra("group_solitatire_username_list");
            this.T = getIntent().getStringArrayListExtra("group_solitatire_desc_list");
            this.U = new java.util.HashMap();
            java.util.ArrayList arrayList = this.T;
            if (arrayList != null && arrayList.size() > 0 && this.T.size() == this.S.size()) {
                for (int i17 = 0; i17 <= this.S.size() - 1; i17++) {
                    this.U.put((java.lang.String) this.S.get(i17), (java.lang.String) this.T.get(i17));
                }
            }
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AASelectContactUI", "is single chat");
        }
        this.I = new java.util.HashSet();
        this.H = new java.util.HashSet();
        this.F = new java.util.ArrayList();
        this.N = new java.util.ArrayList();
        this.M = new java.util.ArrayList();
        if (c01.e2.R(this.D)) {
            java.util.ArrayList z76 = z7();
            if (z76.size() > 0) {
                java.util.Iterator it = z76.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                        ((java.util.ArrayList) this.N).add(str);
                    } else {
                        ((java.util.ArrayList) this.M).add(str);
                    }
                }
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.H.addAll(java.util.Arrays.asList(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
            if (A7()) {
                this.I.addAll(y7(P1));
            } else {
                this.I.addAll(P1);
            }
            C7();
        }
        this.F.addAll(this.I);
        this.K = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.oen);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.oeo);
        this.L = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m1(this));
        int size = this.C == 6 ? this.G.size() : !c01.e2.R(this.D) ? y7(z7()).size() : ((java.util.ArrayList) this.M).size();
        if (this.I.size() == 0 || this.I.size() != size) {
            this.K.setChecked(false);
        } else {
            this.K.setChecked(true);
        }
        this.K.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.H.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        m78513xc2a54588().post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.H.contains(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.I.contains(str);
    }

    public java.util.ArrayList y7(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (A7()) {
            arrayList2.addAll(h61.o.k(arrayList, this.D, B7(), true));
        } else {
            arrayList2.addAll(z7());
        }
        return arrayList2;
    }

    public final java.util.ArrayList z7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (A7()) {
            arrayList.addAll(this.S);
        } else {
            arrayList.addAll(h61.o.i(this.D));
        }
        return arrayList;
    }
}
