package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

/* renamed from: com.tencent.mm.ui.contact.privacy.SportBlackListUI */
/* loaded from: classes10.dex */
public class ActivityC22351x8428a09d extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d {
    public java.lang.String F;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        return new uf5.b2(this, l4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void V6() {
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("always_select_contact", c17);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@werun.black.android");
        intent.putExtra("titile", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hla));
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportBlackListUI", "onAddContact before userNameStr: %s, tagList : %s.", stringExtra, this.f288633d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f288633d.contains(str) && !r17.equals(str)) {
                this.f288633d.add(str);
                c01.e2.w0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true));
            }
        }
        this.f288652z = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportBlackListUI", "onAddContact after userNameStr: %s, tagList : %s.", stringExtra, this.f288633d);
        this.f288647u = db5.e1.Q(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_), true, false, new uf5.z1(this));
        g7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = this.f288636g.getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportBlackListUI", "onRemoveContact before userNameStr: %s, tagList : %s.", stringExtra, this.f288633d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f288633d.remove(str);
                c01.e2.E0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true));
                ve4.g.a(40);
            }
        }
        this.A = true;
        g7();
        this.f288647u = db5.e1.Q(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571415ed), true, false, new uf5.a2(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportBlackListUI", "onRemoveContact after userNameStr: %s, tagList : %s.", stringExtra, this.f288633d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportBlackListUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", java.lang.Integer.valueOf(i17), a1Var, obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void h7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288647u;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f288647u = null;
        }
        if (this.A) {
            this.A = false;
            dp.a.m125854x26a183b(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571424em), 0).show();
        }
        if (this.f288652z) {
            this.f288652z = false;
            dp.a.m125854x26a183b(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571421ej), 0).show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void i7() {
        uf5.w0 w0Var = this.f288636g;
        if (w0Var == null || w0Var.u() <= 0) {
            mo54450xbf7c1df6(this.F);
            return;
        }
        mo54450xbf7c1df6(this.F + "(" + this.f288636g.u() + ")");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(39);
        if (this.f288633d == null) {
            this.f288633d = new java.util.ArrayList();
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.database.Cursor x17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).x("@werun.black.android", "", null);
        while (x17.moveToNext()) {
            java.lang.String string = x17.getString(x17.getColumnIndex(dm.i4.f66875xa013b0d5));
            if (str.equals(string)) {
                c01.e2.E0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(string, true));
            } else {
                this.f288633d.add(string);
            }
        }
        x17.close();
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlm);
        this.F = string2;
        mo54450xbf7c1df6(string2);
        mo54448x9c8c0d33(new uf5.y1(this));
        this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hll);
        f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288647u;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f288647u = null;
        }
    }
}
