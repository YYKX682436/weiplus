package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.OpenIMSelectContactUI */
/* loaded from: classes11.dex */
public class ActivityC22323x39e3762a extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.lang.String C;
    public java.lang.String E;
    public java.util.List F;
    public java.util.HashSet G;
    public java.util.HashSet H;
    public java.util.HashSet I;
    public int K;
    public int L;
    public boolean D = false;

    /* renamed from: J, reason: collision with root package name */
    public int f288066J = 0;
    public final boolean M = true;
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.la N = new com.p314xaae8f345.mm.ui.p2690x38b72420.la();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.H.remove(str);
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.l8(this.C, this, this.F, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 64), null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.F, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 64), this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131081};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E)) {
            this.E = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(this.C, "openim_acct_type_title", j41.a0.TYPE_WORDING);
        }
        if (!this.D) {
            return this.E;
        }
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk) + this.E;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int i18;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) || (z3Var = (aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMSelectContactUI", "ClickUser=%s", d17);
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 64)) {
            w7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{d17}), new java.util.ArrayList(0));
            return;
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 131072) || this.f288066J + this.H.size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            if (!this.G.contains(d17)) {
                Y6();
                if (this.H.contains(d17)) {
                    this.H.remove(d17);
                } else {
                    this.H.add(d17);
                }
            }
        } else if (!this.G.contains(d17)) {
            Y6();
            if (this.H.contains(d17)) {
                this.H.remove(d17);
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra("too_many_member_tip_string");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    stringExtra = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)));
                }
                db5.e1.t(mo55332x76847179(), stringExtra, "", new com.p314xaae8f345.mm.ui.p2690x38b72420.n8(this));
            }
        }
        x7();
        if (this.M && ((i18 = this.K) == 1 || i18 == 0)) {
            java.util.HashSet hashSet = this.G;
            int size = hashSet != null ? hashSet.size() : 0;
            java.util.HashSet hashSet2 = this.H;
            this.N.a(this, size + (hashSet2 != null ? hashSet2.size() : 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatRoomInviteStartCount"), 0));
        }
        this.f287981f.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("openim_appid");
        this.E = getIntent().getStringExtra("titile");
        this.D = getIntent().getBooleanExtra("open_half_screen", false);
        this.K = getIntent().getIntExtra("list_type", -1);
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        this.L = intent.getIntExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a);
        this.f288066J = getIntent().getIntExtra("AlreadySelectOtherUserCount", 0);
        this.F = new java.util.ArrayList();
        this.H = new java.util.HashSet();
        this.I = new java.util.HashSet();
        this.G = new java.util.HashSet();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.G.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.H.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
            this.I.addAll(this.H);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra3.split(",")));
        }
        java.util.HashSet hashSet2 = new java.util.HashSet(hashSet);
        hashSet2.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet2.addAll(c01.e2.i());
        ((java.util.ArrayList) this.F).addAll(hashSet2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean k7() {
        return true;
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
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78530x8b45058f();
        if (this.D) {
            int e17 = com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            mo78514x143f1b92().Q0(com.p314xaae8f345.mm.ui.uk.d(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80008xda567a70, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8), getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b), e17, 0.5f * e17));
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 64)) {
            m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2690x38b72420.m8(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        }
        x7();
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
        }
        this.f287983h.findViewById(com.p314xaae8f345.mm.R.id.m7g).setBackground(null);
        this.f287983h.findViewById(com.p314xaae8f345.mm.R.id.f567597k12).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ahm);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.G.contains(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        if (dVar.d() && (str2 = dVar.f288383s) != null) {
            return this.H.contains(str2);
        }
        if (dVar.f288372h && (str = dVar.f288383s) != null) {
            return this.H.contains(str);
        }
        if (dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1) {
            return this.H.isEmpty();
        }
        return false;
    }

    public final boolean w7(java.util.List list, java.util.List list2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMSelectContactUI", "handleSelect %s, cancel %s", list, list2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        intent.putExtra("Cancel_Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list2, ","));
        setResult(-1, intent);
        finish();
        return true;
    }

    public final void x7() {
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 64) || this.H.size() <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk) + "(" + this.H.size() + ")");
        int intExtra = getIntent().getIntExtra("min_limit_num", 0);
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.L, 262144)) {
            m78500x43e00957(1, true);
        } else if (this.H.size() >= intExtra) {
            m78500x43e00957(1, true);
        } else {
            m78500x43e00957(1, false);
        }
    }
}
