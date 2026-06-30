package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI */
/* loaded from: classes11.dex */
public class ActivityC22334x657dae5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.util.List C;
    public java.lang.String D;
    public java.lang.String E;
    public java.util.ArrayList F = new java.util.ArrayList();
    public java.util.List G = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.F.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.k(str);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null) {
                c19642xb279030.e(this.F);
            }
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.l3(this, true, this.G, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jho, java.lang.Integer.valueOf(this.G.size()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = b7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b76.getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationMemberUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f288383s;
        Y6();
        if (this.F.contains(str2)) {
            this.F.remove(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.k(str2);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null) {
                c19642xb279030.d(str2);
            }
        } else {
            if (w7(this.F.size() + 1)) {
                return;
            }
            this.F.add(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.a(str2, 2);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb2790302 = this.f287983h;
            if (c19642xb2790302 != null) {
                c19642xb2790302.d(str2);
            }
        }
        x7();
        b76.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f287979d.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("select_chatroom_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.D = stringExtra;
        this.F = new java.util.ArrayList();
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Conv_User");
        this.E = stringExtra2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.F.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.E.split(",")));
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("Block_list");
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((stringExtra3 != null ? stringExtra3 : "").split(","));
        java.util.HashSet b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b();
        b17.addAll(P1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(b17);
        this.C.addAll(c01.e2.i());
        this.G = new java.util.LinkedList();
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.D);
        p75.n0 n0Var = dm.e2.N1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.e2.P1);
        p75.m c17 = dm.e2.P1.l(L0).c(dm.e2.T1.g(1, 1));
        p75.i0 g17 = dm.e2.N1.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        l75.k0 k0Var = gm0.j1.u().f354686f;
        if (!k0Var.mo123783xb9a70294()) {
            k0Var = null;
        }
        java.util.List k17 = a17.k(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
            if (!r17.equals(z3Var.d1()) && !android.text.TextUtils.isEmpty(z3Var.d1()) && !z3Var.d1().contains("openim")) {
                this.G.add(z3Var.d1());
            }
        }
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationMemberUI", "Create!");
        m78494xd9193382(1, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574064gv0), new com.p314xaae8f345.mm.ui.p2690x38b72420.wb(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.xb(this));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 != null) {
            c19642xb279030.e(this.F);
        }
        x7();
        b7().notifyDataSetChanged();
        x7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final boolean w7(int i17) {
        if (i17 <= 10) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSelectConversationMemberUI", "tooManySelection");
        db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhs, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.yb(this));
        return true;
    }

    public final void x7() {
        mo60878xf6b21fea(1, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574064gv0));
        m78500x43e00957(1, this.F.size() >= 0);
    }
}
