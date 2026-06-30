package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 32768)
/* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI */
/* loaded from: classes10.dex */
public class ActivityC22346xe85a7ad0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d {
    public java.lang.String F;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        return new uf5.g0(this, l4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public java.lang.CharSequence U6() {
        return getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571407e5);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        int g17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965), 131072);
        intent.putExtra("max_limit_num", this.f288649w);
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        intent.putExtra("list_attr", g17);
        intent.putExtra("always_select_contact", c17);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@social.black.android");
        intent.putExtra("titile", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hla));
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null || P1.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String r17 = c01.z1.r();
        if (this.f288633d != null) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f288633d.contains(str) && !r17.equals(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    arrayList.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!r17.equals(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s, memBerListTmp = %s.", P1, this.f288633d, arrayList);
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList.isEmpty.");
            return;
        }
        w11.h0 h0Var = new w11.h0(arrayList, 8388608, 1, this.f288648v);
        gm0.j1.n().f354821b.g(h0Var);
        this.f288647u = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_), true, true, new uf5.c0(this, h0Var));
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
        uf5.w0 w0Var = this.f288636g;
        if (w0Var.f288611f) {
            java.util.LinkedList linkedList = (java.util.LinkedList) w0Var.f508851r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            w0Var.notifyDataSetChanged();
            if (((java.util.LinkedList) this.f288636g.f508851r).size() <= 0) {
                this.f288644r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec));
                this.f288644r.setEnabled(false);
                return;
            }
            this.f288644r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec) + "(" + ((java.util.LinkedList) this.f288636g.f508851r).size() + ")");
            this.f288644r.setEnabled(true);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(str)) {
            android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.class);
            intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 3);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (str == null || str.length() <= 0) {
            return;
        }
        j45.l.j(mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null || P1.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s.", P1, this.f288633d);
        w11.h0 h0Var = new w11.h0(P1, 8388608, 2, this.f288648v);
        gm0.j1.n().f354821b.g(h0Var);
        this.f288647u = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571415ed), true, true, new uf5.d0(this, h0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c_x;
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
        mo56583xbf7c1df6(U6());
        this.f288636g.s();
        e7();
        this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571413eb);
        this.F = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571407e5);
        i7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String m150572x17ec12d2;
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (m1Var instanceof w11.h0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288647u;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f288647u = null;
            }
            w11.h0 h0Var = (w11.h0) m1Var;
            int i19 = h0Var.f523574g;
            if (i17 == 0 && i18 == 0) {
                dp.a.m125854x26a183b(this, getString(i19 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571421ej : com.p314xaae8f345.mm.R.C30867xcad56011.f571424em), 0).show();
                return;
            }
            int i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f571419eh;
            if (i18 == -3503) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                java.lang.String m150572x17ec12d22 = m1Var.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571419eh);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m150572x17ec12d22 == null) {
                    m150572x17ec12d22 = string;
                }
                u1Var.g(m150572x17ec12d22);
                u1Var.a(true);
                u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                u1Var.b(new uf5.e0(this));
                u1Var.q(false);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
            if (i18 == -3500) {
                m150572x17ec12d2 = getString(i19 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571420ei : com.p314xaae8f345.mm.R.C30867xcad56011.f571423el, java.lang.Integer.valueOf(h0Var.f523578n - ((java.util.LinkedList) h0Var.f523572e).size()));
            } else {
                m150572x17ec12d2 = m1Var.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m150572x17ec12d2)) {
                    if (i19 != 1) {
                        i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f571422ek;
                    }
                    m150572x17ec12d2 = getString(i27);
                }
            }
            u1Var2.g(m150572x17ec12d2);
            u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            u1Var2.l(new uf5.f0(this));
            u1Var2.q(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }
}
