package com.p314xaae8f345.mm.ui.p2690x38b72420;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.ui.contact.SelectSpecialContactUI */
/* loaded from: classes9.dex */
public class ActivityC22330xcf7cf337 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.lang.String C;
    public int D;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.kc(this, getIntent().getStringExtra("filter_type"));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(i17);
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", str);
        java.lang.String str2 = this.C;
        if (str2 != null && str2.equals(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ix6))) {
            vf5.d dVar = (vf5.d) m80391xac8f1cfd(vf5.d.class);
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListPageReportUIC", "reportClick user=" + str + ", position=" + i17);
            if (((java.lang.Boolean) ((jz5.n) dVar.f517946d).mo141623x754a37bb()).booleanValue()) {
                pm0.v.K(null, new vf5.c(dVar, str, i17));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 16384)) {
            intent.putExtra("Select_Contact", str);
            setResult(-1, intent);
            finish();
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 32768)) {
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 20);
            j45.l.n(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 1);
            return;
        }
        intent.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("titile");
        this.D = getIntent().getIntExtra("list_attr", 0);
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
        if (i17 != 1) {
            return;
        }
        this.f287981f.s();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vf5.d.class);
    }
}
