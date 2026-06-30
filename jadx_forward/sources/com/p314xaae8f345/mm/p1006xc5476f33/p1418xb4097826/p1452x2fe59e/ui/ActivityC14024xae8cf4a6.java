package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI */
/* loaded from: classes11.dex */
public final class ActivityC14024xae8cf4a6 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int T = 0;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f190935J;
    public boolean K;
    public boolean Q;
    public int S;
    public final java.util.ArrayList C = new java.util.ArrayList();
    public final java.util.ArrayList D = new java.util.ArrayList();
    public final java.util.ArrayList E = new java.util.ArrayList();
    public final java.util.ArrayList F = new java.util.ArrayList();
    public final java.util.ArrayList G = new java.util.ArrayList();
    public final java.util.ArrayList H = new java.util.ArrayList();
    public final java.util.ArrayList L = new java.util.ArrayList();
    public final java.util.ArrayList M = new java.util.ArrayList();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public final java.util.ArrayList P = new java.util.ArrayList();
    public final java.util.ArrayList R = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            java.util.ArrayList arrayList = this.G;
            kz5.h0.B(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ub(str));
            java.util.ArrayList arrayList2 = this.E;
            kz5.h0.B(arrayList2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vb(str));
            java.util.ArrayList arrayList3 = this.C;
            kz5.h0.B(arrayList3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wb(str));
            b7().notifyDataSetChanged();
            x7();
            w7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-2,onSelectChange selectRoom:" + arrayList2 + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList3);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.M);
        arrayList.addAll(this.N);
        return new bm2.o5(this, null, true, false, this.P, arrayList, this.Q, this.R);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new bm2.s5(this, null, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131075, 131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.avs;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) || (z3Var = (aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        boolean z17 = this.P.contains(item.f288383s);
        java.util.ArrayList arrayList = this.L;
        if (z17) {
            if (arrayList.contains(aVar.f288383s)) {
                db5.t7.i(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehb), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                return;
            }
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
            e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouy);
            e4Var.c();
            return;
        }
        if (p5(item)) {
            if (arrayList.contains(aVar.f288383s)) {
                db5.t7.i(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehb), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = aVar.B;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var2.d1());
        java.util.ArrayList arrayList2 = this.C;
        java.util.ArrayList arrayList3 = this.F;
        java.util.ArrayList arrayList4 = this.E;
        java.util.ArrayList arrayList5 = this.G;
        if (R4) {
            java.lang.String d17 = z3Var2.d1();
            if (d17 == null) {
                d17 = "";
            }
            z3Var2.P0();
            Y6();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null) {
                c19642xb279030.d(d17);
            }
            if (arrayList4.contains(d17)) {
                arrayList4.remove(d17);
                pm0.v.b0(arrayList3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xb(d17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "remove room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            } else {
                arrayList4.add(d17);
                r45.ky5 ky5Var = new r45.ky5();
                ky5Var.set(0, d17);
                java.lang.String d18 = z3Var2.d1();
                if (!(d18 == null || d18.length() == 0)) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d19 = z3Var2.d1();
                    ((sg3.a) v0Var).getClass();
                    ky5Var.set(1, c01.a2.c(z3Var2, d19));
                }
                arrayList3.add(ky5Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "add room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "before select room,selectAllContact:" + arrayList2);
            if (arrayList2.contains(d17)) {
                arrayList2.remove(d17);
            } else {
                arrayList2.add(d17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "after select room,selectAllContact:" + arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-1,onSelectRoom selectRoom:" + arrayList4 + ", selectUser:" + arrayList5 + ", selectAllContact:" + arrayList2);
            x7();
        } else {
            java.lang.String d110 = z3Var2.d1();
            if (d110 == null) {
                d110 = "";
            }
            Y6();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb2790302 = this.f287983h;
            if (c19642xb2790302 != null) {
                c19642xb2790302.d(d110);
            }
            if (arrayList5.contains(d110)) {
                arrayList5.remove(d110);
                pm0.v.b0(arrayList3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ac(d110));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "remove room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList5);
            } else {
                arrayList5.add(d110);
                r45.ky5 ky5Var2 = new r45.ky5();
                ky5Var2.set(0, d110);
                java.lang.String d111 = z3Var2.d1();
                if (!(d111 == null || d111.length() == 0)) {
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d112 = z3Var2.d1();
                    ((sg3.a) v0Var2).getClass();
                    ky5Var2.set(1, c01.a2.c(z3Var2, d112));
                }
                arrayList3.add(ky5Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "add room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "before select room,selectAllContact:" + arrayList2);
            if (arrayList2.contains(d110)) {
                arrayList2.remove(d110);
            } else {
                arrayList2.add(d110);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "after select user, selectAllContact:" + arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-1,onSelectRoom selectRoom:" + arrayList4 + ", selectUser:" + arrayList5 + ", selectAllContact:" + arrayList2);
            x7();
        }
        this.f287981f.notifyDataSetChanged();
        x7();
        w7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.v2r);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.mkd);
        if (findViewById2 != null) {
            findViewById2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rb(findViewById2, this));
        }
        if (findViewById != null) {
            findViewById.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.tb(findViewById, this));
        }
        android.view.View view = this.f287989q;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kz5.p0] */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.I = getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0);
        this.f190935J = getIntent().getBooleanExtra("KEY_PARAMS_WHITE_LIST_HIDE_SELECT_FROM_CONTACT_BOOK", false);
        this.K = getIntent().getBooleanExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", false);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_WHITE_LIST");
        java.util.ArrayList arrayList = this.G;
        java.util.ArrayList arrayList2 = this.E;
        java.util.ArrayList arrayList3 = this.C;
        if (byteArrayExtra != null) {
            r45.re2 re2Var = new r45.re2();
            re2Var.mo11468x92b714fd(byteArrayExtra);
            arrayList3.addAll(re2Var.m75941xfb821914(2));
            this.D.addAll(re2Var.m75941xfb821914(2));
            arrayList2.addAll(re2Var.m75941xfb821914(0));
            arrayList.addAll(re2Var.m75941xfb821914(1));
        }
        java.util.ArrayList arrayList4 = this.L;
        arrayList4.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        ?? r37 = kz5.p0.f395529d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = r37;
        }
        arrayList4.addAll(stringArrayListExtra);
        java.util.ArrayList arrayList5 = this.M;
        arrayList5.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = r37;
        }
        arrayList5.addAll(stringArrayListExtra2);
        java.util.ArrayList arrayList6 = this.N;
        arrayList6.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOSEN_USER_LIST");
        if (stringArrayListExtra3 == null) {
            stringArrayListExtra3 = r37;
        }
        arrayList6.addAll(stringArrayListExtra3);
        java.util.ArrayList arrayList7 = this.P;
        arrayList7.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra4 = getIntent().getStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST");
        if (stringArrayListExtra4 == null) {
            stringArrayListExtra4 = r37;
        }
        arrayList7.addAll(stringArrayListExtra4);
        java.util.ArrayList arrayList8 = this.R;
        arrayList8.clear();
        if (getIntent().hasExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST")) {
            this.Q = true;
            java.util.ArrayList<java.lang.String> stringArrayListExtra5 = getIntent().getStringArrayListExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST");
            java.util.ArrayList<java.lang.String> arrayList9 = r37;
            if (stringArrayListExtra5 != null) {
                arrayList9 = stringArrayListExtra5;
            }
            arrayList8.addAll(arrayList9);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select_contact_step1,init selectRoom:" + arrayList2 + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList3 + ", luckyMoneyAlwaysSelectList:" + kz5.n0.g0(arrayList4, ",", null, null, 0, null, null, 62, null) + ", forbidChosenContactList:" + kz5.n0.g0(arrayList7, ",", null, null, 0, null, null, 62, null) + ", useCustomContactData:" + this.Q + ", allowSelectContactList:" + kz5.n0.g0(arrayList8, ",", null, null, 0, null, null, 62, null) + ", outerChosenRoomList:" + kz5.n0.g0(arrayList5, ",", null, null, 0, null, null, 62, null) + ", outerChosenUserList:" + kz5.n0.g0(arrayList6, ",", null, null, 0, null, null, 62, null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean k7() {
        return !this.K;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2) {
            java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            if (O1 != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList(O1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select user:" + linkedList);
                if (linkedList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select user empty, return");
                    return;
                }
                java.util.ArrayList arrayList = this.G;
                kz5.h0.B(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yb(linkedList));
                arrayList.addAll(linkedList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "before select user, userList:" + linkedList);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before select user,selectAllContact:");
                java.util.ArrayList arrayList2 = this.C;
                sb6.append(arrayList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", sb6.toString());
                kz5.h0.B(arrayList2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zb(this));
                arrayList2.addAll(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "after select user,selectAllContact:" + arrayList2);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
                if (c19642xb279030 != null) {
                    c19642xb279030.e(arrayList2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "select_contact_step3,onSelectChange selectRoom:" + this.E + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList2);
                x7();
                this.f287981f.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwk), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pb(this), null, com.p314xaae8f345.mm.ui.fb.FINDER_LIVE);
        x7();
        m78560xe21cbbf(false);
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwd), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qb(this));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 != null) {
            c19642xb279030.e(this.C);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb2790302 = this.f287983h;
        if (c19642xb2790302 != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(this.M);
            arrayList.addAll(this.N);
            c19642xb2790302.m75366x5028ebe9(arrayList);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return ((dVar != null && this.P.contains(dVar.f288383s)) || dVar == null || (!this.L.contains(dVar.f288383s) && !this.M.contains(dVar.f288383s) && !this.N.contains(dVar.f288383s))) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (this.P.contains(item.f288383s)) {
            return false;
        }
        if (item.d() && item.f288383s != null) {
            java.util.ArrayList arrayList = this.C;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) next, item.f288383s)) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void w7() {
        if (this.f287989q == null) {
            return;
        }
        findViewById(com.p314xaae8f345.mm.R.id.v2r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "before init view holderView height:" + this.f287989q.getLayoutParams().height);
        android.view.ViewGroup.LayoutParams layoutParams = this.f287989q.getLayoutParams();
        int i17 = this.S;
        java.util.ArrayList arrayList = this.C;
        layoutParams.height = i17 + (arrayList == null || arrayList.isEmpty() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561252dc) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561261dk));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", "after init view holderView height:" + this.f287989q.getLayoutParams().height);
        this.f287989q.requestLayout();
    }

    public final void x7() {
        java.util.ArrayList arrayList = this.C;
        int size = arrayList.size();
        m78500x43e00957(1, this.D.size() != arrayList.size() ? true : !arrayList.containsAll(r2));
        if (size > 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwj, java.lang.Integer.valueOf(size)));
        } else {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwk));
        }
    }
}
