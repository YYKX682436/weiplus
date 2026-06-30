package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI */
/* loaded from: classes10.dex */
public class ActivityC22352x7cb33d67 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d {
    public java.util.List F = new java.util.ArrayList();
    public final java.util.List G = new java.util.ArrayList();
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f288656J;
    public final java.util.Set K;

    public ActivityC22352x7cb33d67() {
        new java.util.HashSet();
        this.I = "";
        this.f288656J = "";
        this.K = new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        return new uf5.h2(this, l4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void V6() {
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("topstory_import_type", this.H == 1 ? 1 : 2);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("titile", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hla));
        long j17 = this.H;
        if (j17 == 1) {
            intent.putExtra("filter_type", "@tophistory.unlike.android");
        } else if (j17 == 2) {
            intent.putExtra("filter_type", "@tophistory.black.android");
        }
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact.");
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact %s", stringExtra);
        if (stringExtra == null || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("App_MsgId");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String r17 = c01.z1.r();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || !stringExtra2.equals("fromSns")) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f288633d.contains(str) && !r17.equals(str) && (n17 = Bi.n(str, true)) != null && n17.r2()) {
                    this.f288633d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f288633d.contains(str2) && !r17.equals(str2)) {
                    this.f288633d.add(str2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact tagList = %s.", this.f288633d);
        this.f288652z = true;
        l7();
        if (((java.util.HashSet) this.K).size() > 0) {
            this.D.a(new uf5.e2(this));
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact %s", stringExtra);
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        if (P1 == null) {
            return;
        }
        this.D.b(new uf5.f2(this, P1), new uf5.g2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", java.lang.Integer.valueOf(i17), a1Var, obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void i7() {
        uf5.w0 w0Var = this.f288636g;
        if (w0Var == null || w0Var.u() <= 0) {
            mo54450xbf7c1df6(this.I);
            return;
        }
        mo54450xbf7c1df6(this.I + "(" + this.f288636g.u() + ")");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        mo54448x9c8c0d33(new uf5.d2(this));
    }

    public final void j7(sm4.i iVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus");
        if (iVar == null || iVar.f491482g == null || iVar.f491483h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus， netScene is null.");
            return;
        }
        for (int i17 = 0; i17 < iVar.f491482g.size(); i17++) {
            java.lang.String str = (java.lang.String) iVar.f491482g.get(i17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus，snsTagId is %s,  name is %s, .", java.lang.Long.valueOf(this.H), str);
                long j17 = this.H;
                if (j17 == 1) {
                    if (((java.lang.Integer) iVar.f491483h.get(i17)).intValue() == 3) {
                        this.f288633d.remove(str);
                        ((java.util.ArrayList) this.F).remove(str);
                    } else if (((java.lang.Integer) iVar.f491483h.get(i17)).intValue() == 4) {
                        this.f288633d.add(str);
                        ((java.util.ArrayList) this.F).add(str);
                    }
                } else if (j17 == 2) {
                    if (((java.lang.Integer) iVar.f491483h.get(i17)).intValue() == 1) {
                        this.f288633d.remove(str);
                        ((java.util.ArrayList) this.F).remove(str);
                    } else if (((java.lang.Integer) iVar.f491483h.get(i17)).intValue() == 2) {
                        this.f288633d.add(str);
                        ((java.util.ArrayList) this.F).add(str);
                    }
                }
            }
        }
        k7();
        g7();
        if (z17) {
            c7();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f288656J, this.f288633d, this.F);
    }

    public final void k7() {
        this.f288656J = this.I + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        if (this.H == 1) {
            rm4.c.b().f478976e.clear();
            rm4.c.b().f478976e.addAll(this.f288633d);
            rm4.c.b().d();
        } else {
            rm4.c.b().f478975d.clear();
            rm4.c.b().f478975d.addAll(this.f288633d);
            rm4.c.b().c();
        }
    }

    public void l7() {
        java.lang.String str = this.I + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "writeNow newMd5 = %s, md5 = %s, origList = %s.", str, this.f288656J, this.F);
        if (!str.equals(this.f288656J) || this.H == 0) {
            k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : this.f288633d) {
                if (!((java.util.ArrayList) this.F).contains(str2)) {
                    arrayList.add(str2);
                    if (this.H == 1) {
                        arrayList2.add(3);
                    } else {
                        arrayList2.add(1);
                    }
                }
            }
            java.util.Iterator it = ((java.util.ArrayList) this.F).iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!this.f288633d.contains(str3)) {
                    arrayList.add(str3);
                    if (this.H == 1) {
                        arrayList2.add(4);
                    } else {
                        arrayList2.add(2);
                    }
                }
            }
            java.util.Set set = this.K;
            ((java.util.HashSet) set).clear();
            int i17 = 0;
            while (i17 < arrayList.size()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (int i18 = 0; i17 < arrayList.size() && i18 < 50; i18++) {
                    arrayList3.add((java.lang.String) arrayList.get(i17));
                    arrayList4.add((java.lang.Integer) arrayList2.get(i17));
                    i17++;
                }
                ((java.util.HashSet) set).add(new sm4.i(arrayList3, arrayList4));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "batch doNetscene, size: %s", java.lang.Integer.valueOf(((java.util.HashSet) set).size()));
            ((java.util.ArrayList) this.F).clear();
            ((java.util.ArrayList) this.F).addAll(this.f288633d);
            if (((java.util.HashSet) set).size() == 0) {
                this.D.c();
                return;
            }
            java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
            while (it6.hasNext()) {
                gm0.j1.n().f354821b.g((sm4.i) it6.next());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.H = getIntent().getIntExtra("k_topstory_type", 0);
        super.onCreate(bundle);
        if (this.H == 1) {
            this.I = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlk);
        } else {
            this.I = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hl9);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, before md5: %s, tagList: %s, origList : %s.", this.f288656J, this.f288633d, this.F);
        java.lang.String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            this.F = P1;
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !this.f288633d.contains(str)) {
                    this.f288633d.add(str);
                }
            }
        }
        java.util.List list = this.G;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
        if (str2 == null) {
            str2 = "";
        }
        long j17 = this.H;
        if (j17 == 1) {
            android.database.Cursor x17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).x("@tophistory.unlike.android", "", null);
            while (x17.moveToNext()) {
                arrayList.add(x17.getString(x17.getColumnIndex(dm.i4.f66875xa013b0d5)));
            }
            x17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", list);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str3 = (java.lang.String) arrayList.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !this.f288633d.contains(str3)) {
                    c01.e2.D0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str3, true));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList tag no container db tagName: %s", str3);
                }
            }
            for (int i18 = 0; i18 < this.f288633d.size(); i18++) {
                java.lang.String str4 = (java.lang.String) this.f288633d.get(i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    c01.e2.v0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str4, true));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList db no container tag tagName: %s", str4);
                }
            }
            if (this.f288633d.contains(str2)) {
                this.f288633d.remove(str2);
                c01.e2.D0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true));
            }
        } else if (j17 == 2) {
            android.database.Cursor x18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).x("@tophistory.black.android", "", null);
            while (x18.moveToNext()) {
                arrayList.add(x18.getString(x18.getColumnIndex(dm.i4.f66875xa013b0d5)));
            }
            x18.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", list);
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                java.lang.String str5 = (java.lang.String) arrayList.get(i19);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !this.f288633d.contains(str5)) {
                    c01.e2.C0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str5, true));
                }
            }
            for (int i27 = 0; i27 < this.f288633d.size(); i27++) {
                java.lang.String str6 = (java.lang.String) this.f288633d.get(i27);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    c01.e2.u0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str6, true));
                }
            }
            if (this.f288633d.contains(str2)) {
                this.f288633d.remove(str2);
                c01.e2.C0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, after md5: %s, tagList: %s, origList : %s.", this.f288656J, this.f288633d, this.F);
        mo43517x10010bd5();
        gm0.j1.d().a(2859, this);
        m78501x43e00957(false);
        this.f288656J = this.I + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ",");
        if (this.H == 1) {
            this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hli);
        } else {
            this.f288645s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlj);
        }
        f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(2859, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (m1Var instanceof sm4.i) {
            sm4.i iVar = (sm4.i) m1Var;
            boolean z17 = i17 == 0 && i18 == 0;
            if (z17 && (i19 = ((r45.o50) iVar.f491481f.f152244b.f152233a).f76492x92037252.f458492d) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", java.lang.Integer.valueOf(i19));
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", java.lang.Boolean.valueOf(z17));
            java.util.Set set = this.K;
            if (!z17) {
                int i27 = iVar.f491484i + 1;
                iVar.f491484i = i27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, netScene.retryTimes: %s.", java.lang.Integer.valueOf(i27));
                if (iVar.f491484i < 2) {
                    sm4.i iVar2 = new sm4.i(iVar);
                    gm0.j1.n().f354821b.g(iVar2);
                    ((java.util.HashSet) set).add(iVar2);
                } else {
                    j7(iVar, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, isAddingContact: %s, isRemovingContact: %s.", java.lang.Boolean.valueOf(this.f288652z), java.lang.Boolean.valueOf(this.A));
                }
            }
            java.util.HashSet hashSet = (java.util.HashSet) set;
            if (hashSet.contains(m1Var)) {
                hashSet.remove(m1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", java.lang.Integer.valueOf(hashSet.size()));
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus");
                    for (int i28 = 0; i28 < iVar.f491482g.size(); i28++) {
                        java.lang.String str2 = (java.lang.String) iVar.f491482g.get(i28);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus，snsTagId is %s,  name is %s, .", java.lang.Long.valueOf(this.H), str2);
                            long j17 = this.H;
                            if (j17 == 1) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true);
                                if (((java.lang.Integer) iVar.f491483h.get(i28)).intValue() == 3) {
                                    c01.e2.v0(n17);
                                } else if (((java.lang.Integer) iVar.f491483h.get(i28)).intValue() == 4) {
                                    c01.e2.D0(n17);
                                }
                            } else if (j17 == 2) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true);
                                if (((java.lang.Integer) iVar.f491483h.get(i28)).intValue() == 1) {
                                    c01.e2.u0(n18);
                                } else if (((java.lang.Integer) iVar.f491483h.get(i28)).intValue() == 2) {
                                    c01.e2.C0(n18);
                                }
                            }
                        }
                    }
                    g7();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f288656J, this.f288633d, this.F);
                }
                if (hashSet.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", " onSceneEnd, isEmpty, isAddingContact: %s, isRemovingContact: %s, succ : %s.", java.lang.Boolean.valueOf(this.f288652z), java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(z17));
                    this.D.c();
                    this.A = false;
                    this.f288652z = false;
                    if (z17) {
                        d7();
                    }
                }
            }
        }
    }
}
