package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SelectLabelContactUI */
/* loaded from: classes11.dex */
public class ActivityC22329x7cbba65c extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.lang.String C;
    public int D;
    public java.util.List E;
    public java.util.HashSet F;
    public java.util.HashSet G;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.l3(this, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64), ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(this.C)), this.E);
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
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = b7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b76.getItem(headerViewsCount);
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", str);
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            w7(str);
            return;
        }
        if (!this.G.contains(str) && !this.F.contains(str) && com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 131072) && this.G.size() + this.F.size() >= getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE))), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.va(this));
            return;
        }
        if (!this.G.contains(str)) {
            if (this.F.contains(str)) {
                this.F.remove(str);
            } else {
                this.F.add(str);
            }
        }
        x7();
        b76.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("label");
        this.D = getIntent().getIntExtra("list_attr", 0);
        this.F = new java.util.HashSet();
        this.G = new java.util.HashSet();
        this.E = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.G.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.F.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
            return;
        }
        this.E.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra3.split(",")));
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
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2690x38b72420.ua(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        }
        x7();
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
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final void w7(java.lang.String str) {
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 16384)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", str);
            setResult(-1, intent);
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent2.putExtra("Chat_User", str);
        intent2.putExtra("finish_direct", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void x7() {
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64) || this.F.size() <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1) + "(" + this.F.size() + ")");
        m78500x43e00957(1, true);
    }
}
