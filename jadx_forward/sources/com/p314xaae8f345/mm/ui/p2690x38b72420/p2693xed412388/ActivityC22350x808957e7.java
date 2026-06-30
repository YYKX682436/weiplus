package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 32768)
/* renamed from: com.tencent.mm.ui.contact.privacy.SnsTagDetailUI */
/* loaded from: classes10.dex */
public class ActivityC22350x808957e7 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d {
    public static final /* synthetic */ int K = 0;
    public long G;
    public final java.util.List F = new java.util.ArrayList();
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f288655J = 0;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        return new uf5.x1(this, l4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void V6() {
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        long j17 = this.G;
        if (j17 == 4) {
            intent.putExtra("filter_type", "@sns.black.android");
        } else if (j17 == 5) {
            intent.putExtra("filter_type", "@sns.unlike.android");
        }
        b7(intent);
        intent.putExtra("titile", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hla));
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void X6(android.content.Intent intent, android.content.Context context) {
        long j17 = this.G;
        if (j17 == 4) {
            m7(true, intent);
        } else if (j17 == 5) {
            l7(true, intent);
        }
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
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        long j18 = this.G;
        if (j18 == 4) {
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 18);
        } else if (j18 == 5) {
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 19);
        }
        intent2.putExtra("Contact_User", str);
        if (str == null || str.length() <= 0) {
            return;
        }
        j45.l.j(mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void a7(android.content.Intent intent, android.content.Context context) {
        long j17 = this.G;
        if (j17 == 4) {
            m7(false, intent);
        } else if (j17 == 5) {
            l7(false, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (this.G == 4 && i17 == 4) {
            g7();
        }
        if (this.G == 5 && i17 == 4) {
            g7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void h7() {
        if (this.G == 4) {
            this.D.c();
            d7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void i7() {
        uf5.w0 w0Var = this.f288636g;
        if (w0Var == null || w0Var.u() <= 0) {
            mo54450xbf7c1df6(this.H);
            return;
        }
        mo54450xbf7c1df6(this.H + "(" + this.f288636g.u() + ")");
    }

    public java.util.List j7() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.G == 4) {
            new java.util.LinkedList();
            return k35.c.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(this.G);
        java.lang.String str = D0.f69152x693306bd;
        return (str == null || str.equals("")) ? linkedList : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(","));
    }

    public final void k7() {
        long j17 = this.G;
        java.util.List list = this.f288634e;
        java.util.List list2 = this.F;
        if (j17 == 5) {
            ((java.util.ArrayList) list2).clear();
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            android.database.Cursor x17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).x("@sns.unlike.android", "", null);
            while (x17.moveToNext()) {
                ((java.util.ArrayList) list2).add(x17.getString(x17.getColumnIndex(dm.i4.f66875xa013b0d5)));
            }
            x17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "initTagList before localContactTagList: %s, tagList : %s.", list2, this.f288633d);
            for (int i17 = 0; i17 < ((java.util.ArrayList) list2).size(); i17++) {
                java.lang.String str2 = (java.lang.String) ((java.util.ArrayList) list2).get(i17);
                if (!this.f288633d.contains(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    c01.e2.A0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "initTagList tag no container db tagName: %s", str2);
                }
            }
            for (int i18 = 0; i18 < this.f288633d.size(); i18++) {
                java.lang.String str3 = (java.lang.String) this.f288633d.get(i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !((java.util.ArrayList) list2).contains(str3)) {
                    c01.e2.s0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str3, true));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "initTagList db no container tag tagName: %s", str3);
                }
            }
            if (this.f288633d.contains(str)) {
                this.f288633d.remove(str);
                c01.e2.A0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true));
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).addAll(this.f288633d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "initTagList after localContactTagList: %s, tagList : %s, orginTagList: %s.", list2, this.f288633d, list);
    }

    public final boolean l7(boolean z17, android.content.Intent intent) {
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , before memBerList: %s, tagList : %s, md5: %s.", P1, this.f288633d, this.I);
        if (z17) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f288633d.contains(str)) {
                    this.f288633d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && this.f288633d.contains(str2)) {
                    this.f288633d.remove(str2);
                }
            }
        }
        if ((this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",")).equals(this.I) && this.G != 0) {
            return false;
        }
        this.I = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        if (z17) {
            this.f288652z = true;
        } else {
            this.A = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3(3, this.G, this.H, this.f288633d.size(), this.f288633d, this.f288655J);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(e3Var);
        this.f288647u = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.e_ : com.p314xaae8f345.mm.R.C30867xcad56011.f571415ed), true, false, new uf5.w1(this, e3Var));
        return true;
    }

    public final boolean m7(boolean z17, android.content.Intent intent) {
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        if (z17) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f288633d.contains(str)) {
                    this.f288633d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && this.f288633d.contains(str2)) {
                    this.f288633d.remove(str2);
                }
            }
        }
        java.lang.String str3 = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        if (str3.equals(this.I) && this.G != 0) {
            return false;
        }
        java.lang.String str4 = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        this.I = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , md5: %s, tagList : %s, newMd5: %s, add : %s, memBerList: %s..", str4, this.f288633d, str3, java.lang.Boolean.valueOf(z17), P1);
        java.util.List<java.lang.String> j76 = j7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str5 : j76) {
            if (!this.f288633d.contains(str5)) {
                linkedList.add(str5);
            }
        }
        for (java.lang.String str6 : this.f288633d) {
            if (!j76.contains(str6)) {
                linkedList2.add(str6);
            }
        }
        uf5.j1 j1Var = this.D;
        if (z17) {
            this.f288652z = true;
            android.content.Context context = j1Var.f508785a;
            j1Var.f508786b = db5.e1.Q(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), j1Var.f508785a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_), true, false, new uf5.h1(j1Var));
        } else {
            this.A = true;
            android.content.Context context2 = j1Var.f508785a;
            j1Var.f508786b = db5.e1.Q(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), j1Var.f508785a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571415ed), true, false, new uf5.i1(j1Var));
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            c01.e2.l0((java.lang.String) it7.next(), false);
        }
        java.util.Iterator it8 = linkedList2.iterator();
        while (it8.hasNext()) {
            c01.e2.l0((java.lang.String) it8.next(), true);
        }
        g7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp  memBerList: %s, tagList : %s, md5: %s， delContact： %s, addContact: %s.", P1, this.f288633d, this.I, linkedList, linkedList2);
        return true;
    }

    public final void n7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f288633d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f288652z));
        if (this.A && this.f288652z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , error happen.");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        java.lang.String r17 = c01.z1.r();
        if (this.G == 5) {
            boolean z17 = this.A;
            java.util.List list = this.f288634e;
            if (z17) {
                this.A = false;
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f288633d.contains(str)) {
                        this.f288633d.add(str);
                    }
                }
            }
            if (this.f288652z) {
                this.f288652z = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str2 : this.f288633d) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && !((java.util.ArrayList) list).contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                this.f288633d.removeAll(arrayList);
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).addAll(this.f288633d);
            this.I = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f288633d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f288652z));
        f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.G = getIntent().getLongExtra("k_sns_tag_id", 0L);
        this.f288655J = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, this);
        if (((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().z0()).size() == 0) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onCreate snsTagId: %s, scene : %s.", java.lang.Long.valueOf(this.G), java.lang.Integer.valueOf(this.f288655J));
        long j17 = this.G;
        if (j17 == 4) {
            this.H = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlq);
        } else if (j17 == 5) {
            this.H = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlp);
        } else {
            this.H = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(this.G).f69154x183bff00;
        }
        long j18 = this.G;
        if (j18 == 4) {
            this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlg);
        } else if (j18 == 5) {
            this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlh);
        }
        if (this.G == 0) {
            java.lang.String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            java.lang.String stringExtra2 = getIntent().getStringExtra("k_sns_tag_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.H = stringExtra2;
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
            java.lang.String r17 = c01.z1.r();
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (P1 != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !this.f288633d.contains(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                        this.f288633d.add(str);
                    }
                }
            }
        } else {
            this.f288633d = j7();
        }
        k7();
        java.lang.String str2 = this.H;
        if (str2 == null || str2.equals("")) {
            this.H = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfq);
            this.H = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfq));
        }
        mo54448x9c8c0d33(new uf5.v1(this));
        if (this.G == 0) {
            m78501x43e00957(true);
        } else {
            m78501x43e00957(false);
        }
        this.I = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288647u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.D.c();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        uf5.j1 j1Var = this.D;
        switch (mo808xfb85f7b0) {
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de /* 290 */:
                finish();
                return;
            case 291:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288647u;
                if (u3Var != null) {
                    u3Var.dismiss();
                    this.f288647u = null;
                }
                j1Var.c();
                if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd 1, md5: %s, tagList : %s.", this.I, this.f288633d);
                    if (i17 == 0 && i18 == 0) {
                        java.lang.String str2 = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
                        this.I = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", str2, this.f288633d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f288652z));
                        if (this.A && this.f288652z) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , error happen.");
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
                        java.lang.String r17 = c01.z1.r();
                        if (this.G == 5) {
                            boolean z17 = this.A;
                            java.util.List list = this.f288634e;
                            if (z17) {
                                this.A = false;
                                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = (java.lang.String) it.next();
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str3, true).r2() && !r17.equals(str3) && !this.f288633d.contains(str3)) {
                                        c01.e2.A0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str3, true));
                                    }
                                }
                            }
                            if (this.f288652z) {
                                this.f288652z = false;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.String str4 : this.f288633d) {
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str4, true).r2() && !r17.equals(str4) && !((java.util.ArrayList) list).contains(str4)) {
                                        arrayList.add(str4);
                                        c01.e2.s0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str4, true));
                                    }
                                }
                            }
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                            arrayList2.clear();
                            arrayList2.addAll(this.f288633d);
                            this.I = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f288633d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f288652z));
                        g7();
                        d7();
                    } else {
                        n7();
                        c7();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd 2, md5: %s, tagList : %s.", this.I, this.f288633d);
                    return;
                }
                return;
            case 292:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f288647u;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    this.f288647u = null;
                }
                j1Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 1, md5: %s, tagList : %s.", this.I, this.f288633d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3 d3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3) m1Var;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d3Var.H(this.G))) {
                    for (int i19 = 0; i19 < ((java.util.LinkedList) d3Var.H(this.G)).size(); i19++) {
                        java.lang.String str5 = (java.lang.String) ((java.util.LinkedList) d3Var.H(this.G)).get(i19);
                        if (str5 != null) {
                            arrayList3.add(str5);
                        }
                    }
                }
                new java.util.LinkedList();
                java.util.List<java.lang.String> list2 = this.f288633d;
                this.f288633d = j7();
                if (list2 != null) {
                    for (java.lang.String str6 : list2) {
                        if (!this.f288633d.contains(str6)) {
                            this.f288633d.add(str6);
                        }
                    }
                }
                k7();
                this.I = this.H + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
                g7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 2, md5: %s, tagList : %s.", this.I, this.f288633d);
                return;
            default:
                return;
        }
    }
}
