package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI */
/* loaded from: classes11.dex */
public class ActivityC16489x8d6e80bc extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public android.widget.Button C;
    public java.util.List D;
    public java.util.List E;
    public boolean F;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 G;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        i0Var.f288295b = true;
        i0Var.f288303j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.h0(this, this.D, true, true, i0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.D, true, this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtf);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570798bx5;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = b7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b76.getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f288383s;
        Y6();
        if (((java.util.LinkedList) this.E).contains(str2)) {
            ((java.util.LinkedList) this.E).remove(str2);
            this.G.d(str2);
        } else {
            ((java.util.LinkedList) this.E).add(str2);
            this.G.d(str2);
        }
        w7(((java.util.LinkedList) this.E).size());
        b76.notifyDataSetChanged();
        Y6();
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = arrayList;
        arrayList.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        this.D.addAll(c01.e2.i());
        this.D.add(c01.z1.r());
        this.E = new java.util.LinkedList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (java.lang.String str : stringExtra.split(",")) {
                if (((java.util.LinkedList) this.E).add(str)) {
                    this.G.d(str);
                }
            }
            w7(((java.util.LinkedList) this.E).size());
            b7().notifyDataSetChanged();
            com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
            if (c9Var != null) {
                c9Var.a();
                this.f287984i.b();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "create!");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        this.G = c19642xb279030;
        if (c19642xb279030 == null) {
            finish();
            return;
        }
        c19642xb279030.setBackgroundDrawable(null);
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtd), new kf3.g2(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568330mi0);
        this.C = button;
        button.setOnClickListener(new kf3.h2(this));
        this.G.m75367x3935f5b0(new kf3.i2(this));
        w7(((java.util.LinkedList) this.E).size());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void q7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11225, 1, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("label", str);
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(new java.util.ArrayList(this.E), ","));
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16384, 64));
        j45.l.v(this, ".ui.contact.SelectLabelContactUI", intent, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return ((java.util.LinkedList) this.E).contains(str);
    }

    public final void w7(int i17) {
        if (i17 <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtd));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtd) + "(" + ((java.util.LinkedList) this.E).size() + ")");
        m78500x43e00957(1, true);
    }
}
