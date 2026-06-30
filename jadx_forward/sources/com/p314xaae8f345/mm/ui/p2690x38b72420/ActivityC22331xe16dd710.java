package com.p314xaae8f345.mm.ui.p2690x38b72420;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.ui.contact.SnsAddressUI */
/* loaded from: classes11.dex */
public class ActivityC22331xe16dd710 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public final java.util.ArrayList C = new java.util.ArrayList();
    public java.util.List D;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.remove(str);
            b7().notifyDataSetChanged();
            w7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        i0Var.f288295b = true;
        i0Var.f288304k = true;
        i0Var.f288306m = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571453fh);
        java.lang.String stringExtra = getIntent().getStringExtra("Add_get_from_sns");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        i0Var.f288305l = stringExtra;
        i0Var.f288303j = "@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack";
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
        java.lang.String stringExtra = getIntent().getStringExtra("Add_address_titile");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = b7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b76.getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAddressUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f288383s;
        Y6();
        java.util.ArrayList arrayList = this.C;
        if (arrayList.contains(str2)) {
            arrayList.remove(str2);
            this.f287983h.d(str2);
        } else if (arrayList.size() < com.p314xaae8f345.mm.p2621x8fb0427b.t3.f276857a) {
            arrayList.add(str2);
            this.f287983h.d(str2);
        } else {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.jco, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.t3.f276857a));
        }
        w7();
        b76.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView;
        super.mo43517x10010bd5();
        java.lang.String stringExtra = getIntent().getStringExtra("address_ui_sub_title");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nrl)) != null) {
            textView.setText(stringExtra);
            textView.setVisibility(0);
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("footer_tip");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bse, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gcc)).setText(stringExtra2);
        this.f287979d.addFooterView(inflate);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.D = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("Block_list");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        java.util.HashSet b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b();
        b17.addAll(P1);
        this.D.addAll(b17);
        this.D.addAll(c01.e2.i());
        this.D.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.C.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean n7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 3) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (java.lang.String str : stringExtra.split(",")) {
                if (this.C.add(str)) {
                    this.f287983h.d(str);
                }
            }
            w7();
            b7().notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAddressUI", "Create!");
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2690x38b72420.fb(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.gb(this));
        this.f287983h.e(this.C);
        this.f287983h.m75367x3935f5b0(new com.p314xaae8f345.mm.ui.p2690x38b72420.hb(this));
        w7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dx1.g.f326022a.j("SnsPublishProcess", "atPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void q7(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.C);
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16384, 64));
        startActivityForResult(intent, 3);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.C.contains(str);
    }

    public final void w7() {
        java.util.ArrayList arrayList = this.C;
        mo60878xf6b21fea(1, arrayList.size() == 0 ? java.lang.String.format("%s", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1)) : java.lang.String.format("%s(%d/%d)", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.t3.f276857a)));
        m78500x43e00957(1, arrayList.size() >= 0);
    }
}
