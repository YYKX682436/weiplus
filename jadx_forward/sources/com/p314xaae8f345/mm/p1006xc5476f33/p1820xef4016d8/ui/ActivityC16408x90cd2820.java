package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI */
/* loaded from: classes9.dex */
public class ActivityC16408x90cd2820 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public android.view.View C;
    public java.util.List D;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.util.List list = this.D;
        ((qd0.y0) j1Var).getClass();
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.o8(this, list, true, false, false, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.D, false, this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnj);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        if (i17 >= this.f287979d.getHeaderViewsCount()) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d) this.f287979d.getAdapter().getItem(i17);
            if (dVar == null || (str = dVar.f288383s) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).wi(this.f39322x2305be9, null, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i28), str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kz7, java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str))) : null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vp(this, intent));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
        int intExtra = getIntent().getIntExtra("key_friends_num", 0);
        android.content.Intent intent2 = new android.content.Intent();
        int g17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16, 1, 2, 4, 16384, 64, 65536, 131072);
        intent2.putExtra("list_type", 0);
        intent2.putExtra("list_attr", g17);
        intent2.putExtra("max_limit_num", intExtra);
        intent2.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.gni, java.lang.Integer.valueOf(intExtra)));
        intent2.putExtra("sub_title", getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8q));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent2, 1);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet.addAll(c01.e2.i());
        java.lang.String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = arrayList;
        arrayList.addAll(hashSet);
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
        if (intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i17);
        } else if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            p7();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        super.p7();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
        if (this.C == null) {
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.cjm, null);
            this.C = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gl9);
            listView.addHeaderView(inflate);
        }
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
