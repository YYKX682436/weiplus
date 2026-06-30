package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactLabelRecommendUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI */
/* loaded from: classes11.dex */
public final class ActivityC16170x2911e4dc extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f224793q = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224798h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224799i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224800m;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f224803p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f224794d = jz5.h.b(new f93.p2(this));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f224795e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f224796f = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f224801n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f224802o = jz5.h.b(new f93.w2(this));

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc) {
        if (activityC16170x2911e4dc.f224800m) {
            if (!activityC16170x2911e4dc.Z6().O6().isEmpty()) {
                activityC16170x2911e4dc.V6();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onSaveWrapper(): batch mode, no label selected, exit");
                activityC16170x2911e4dc.finish();
                return;
            }
        }
        if (activityC16170x2911e4dc.a7()) {
            activityC16170x2911e4dc.V6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onSaveWrapper(): not change, exit");
            activityC16170x2911e4dc.finish();
        }
    }

    public final void V6() {
        java.util.ArrayList O6 = Z6().O6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "[doAddLabelAndSaveLabel]: " + O6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var : Z6().f361244g) {
            java.lang.String str = d4Var.f66586x7661fe9a;
            if (str == null) {
                str = "";
            }
            if (O6.contains(str)) {
                arrayList.add(d4Var.f66586x7661fe9a);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "temp Label " + arrayList.size() + " need to add: " + arrayList);
        if (!(!arrayList.isEmpty())) {
            W6();
        } else {
            b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
            c01.d9.e().g(new e93.a(arrayList));
        }
    }

    public final boolean W6() {
        java.util.ArrayList O6 = Z6().O6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "do save labels: " + O6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = O6.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f224795e.contains(str)) {
                arrayList.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "newAttached: " + arrayList);
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
        if (wi6 != null) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("lastUseTime", java.lang.Long.valueOf(c17));
            p75.h1 j17 = dm.g2.f318560n.j(contentValues);
            j17.f434184c = dm.g2.f318562p.l(arrayList).c(dm.g2.f318564r.i(0));
            j17.a().f(wi6.f276535d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "lastUseTime=" + c17 + ", newAttached: " + arrayList);
        if (this.f224800m) {
            java.util.ArrayList arrayList2 = this.f224801n;
            if (arrayList2.isEmpty()) {
                return false;
            }
            b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new f93.o2(this, new java.util.ArrayList(arrayList2), O6, null), 3, null);
            return true;
        }
        java.lang.String str2 = "";
        if (this.f224797g) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(this.f224798h);
            java.lang.String h17 = ((b93.b) c93.a.a()).h(O6);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                z07.f66693x91130dba = "";
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).mo11260x413cb2b4(z07);
            } else {
                z07.f66693x91130dba = h17;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                    z07.f66694xdd77ad16 = this.f224798h;
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).mo11260x413cb2b4(z07);
            }
            X6();
            return true;
        }
        if (!O6.isEmpty()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi7 = b93.r.wi();
            str2 = wi7 != null ? wi7.u1(O6) : null;
        }
        if (str2 == null || this.f224798h == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify ContactLabel: userName=" + this.f224798h + " LabelIds=" + str2);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f224798h, true);
        if (n17 != null) {
            n17.r1(str2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f224798h, n17);
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785().e();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gw6 gw6Var = new r45.gw6();
        gw6Var.f457115e = str2;
        gw6Var.f457114d = this.f224798h;
        linkedList.add(gw6Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518178e, vg3.c.f518204z, 0, kz5.b0.c(this.f224798h), 8, null));
        c01.d9.e().g(new e93.e(linkedList));
        b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
        return true;
    }

    public final void X6() {
        android.content.Intent intent = new android.content.Intent();
        if (a7()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        java.util.ArrayList O6 = Z6().O6();
        intent.putExtra("result_label_id_list", O6);
        java.util.ArrayList<java.lang.String> mo65204x8c275306 = ((h93.r) pf5.z.f435481a.a(this).a(h93.r.class)).O6().mo65204x8c275306();
        intent.putExtra("recommend_label_adopt_count", mo65204x8c275306 != null ? java.lang.Integer.valueOf(mo65204x8c275306.size()) : null);
        intent.putExtra("button_add_new_label_cnt", ((h93.k) pf5.z.f435481a.a(this).a(h93.k.class)).f361249o);
        intent.putExtra("search_add_new_label_cnt", ((h93.k) pf5.z.f435481a.a(this).a(h93.k.class)).f361250p);
        intent.putStringArrayListExtra("selected_labels", ((h93.k) pf5.z.f435481a.a(this).a(h93.k.class)).O6());
        intent.putIntegerArrayListExtra("selected_source", new java.util.ArrayList<>(((h93.k) pf5.z.f435481a.a(this).a(h93.k.class)).f361241d.values()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "finishWithSelectedLabels " + O6);
        setResult(-1, intent);
        finish();
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 Y6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f224794d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo141623x754a37bb;
    }

    public final h93.k Z6() {
        return (h93.k) ((jz5.n) this.f224802o).mo141623x754a37bb();
    }

    public final boolean a7() {
        java.util.ArrayList O6 = Z6().O6();
        int size = O6.size();
        java.util.ArrayList arrayList = this.f224795e;
        if (size != arrayList.size()) {
            return true;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!O6.contains((java.lang.String) it.next())) {
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "no change");
        return false;
    }

    public final void b7(java.lang.String str) {
        this.f224803p = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), str, true, true, f93.v2.f342021d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3r;
    }

    /* renamed from: onChange */
    public final void m65197x3dcbea6f() {
        if (this.f224800m) {
            m78501x43e00957(!Z6().O6().isEmpty());
        } else {
            m78501x43e00957(a7());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("label_username_list");
        boolean z17 = !(stringArrayListExtra == null || stringArrayListExtra.isEmpty());
        this.f224800m = z17;
        if (z17) {
            java.util.ArrayList arrayList = this.f224801n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringArrayListExtra);
            arrayList.addAll(stringArrayListExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "batch mode, userCount: " + arrayList.size());
        } else {
            m78495xf385c157();
        }
        mo64405x4dab7448(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        this.f224798h = getIntent().getStringExtra("label_username");
        this.f224797g = getIntent().getBooleanExtra("is_stranger", false);
        this.f224799i = getIntent().getStringExtra("Contact_ReportSessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "mUserName: " + this.f224798h + ", mIsStranger: " + this.f224797g + ", mIsBatchMode: " + this.f224800m);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(new jz5.l("note_sid", this.f224799i), new jz5.l("add_username", this.f224798h)), 33926);
        }
        h93.k Z6 = Z6();
        f93.r2 r2Var = new f93.r2(this);
        Z6.getClass();
        Z6.f361245h = r2Var;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("label_str_list");
        if (stringArrayListExtra2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "originalList: " + stringArrayListExtra2);
            com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
            if (wi6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (!stringArrayListExtra2.isEmpty()) {
                    p75.i0 h17 = dm.g2.f318560n.h(dm.g2.f318561o);
                    h17.f434190d = dm.g2.f318562p.l(stringArrayListExtra2);
                    java.util.Iterator it = ((java.util.ArrayList) h17.a().l(wi6.f276535d)).iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        try {
                            arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        } catch (java.lang.NumberFormatException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelStorage", "Invalid label ID format: " + str, e17);
                        }
                    }
                }
                list = kz5.n0.V(arrayList2);
            } else {
                list = kz5.p0.f395529d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "original ids: " + list);
            java.util.ArrayList arrayList3 = this.f224795e;
            arrayList3.addAll(stringArrayListExtra2);
            java.util.ArrayList arrayList4 = this.f224796f;
            arrayList4.addAll(list);
            if (arrayList4.size() != arrayList3.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelRecommendUI", "originalList: " + stringArrayListExtra2.size() + ", idList: " + list.size() + ", may have some temporary label");
            }
            h93.k Z62 = Z6();
            Z62.getClass();
            java.util.HashMap hashMap = Z62.f361241d;
            java.util.List V = kz5.n0.V(stringArrayListExtra2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(V, 10));
            java.util.Iterator it6 = ((java.util.ArrayList) V).iterator();
            while (it6.hasNext()) {
                arrayList5.add(new jz5.l((java.lang.String) it6.next(), 0));
            }
            kz5.c1.o(hashMap, arrayList5);
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = Z62.m158359x1e885992().getStringArrayListExtra("selected_labels");
            java.util.ArrayList<java.lang.Integer> integerArrayListExtra = Z62.m158359x1e885992().getIntegerArrayListExtra("selected_source");
            if (stringArrayListExtra3 != null && integerArrayListExtra != null) {
                java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.a1(stringArrayListExtra3, integerArrayListExtra)).iterator();
                while (it7.hasNext()) {
                    jz5.l lVar = (jz5.l) it7.next();
                    java.lang.String str2 = (java.lang.String) lVar.f384366d;
                    java.lang.Integer num = (java.lang.Integer) lVar.f384367e;
                    if (Z62.f361241d.containsKey(str2)) {
                        java.util.HashMap hashMap2 = Z62.f361241d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                        hashMap2.put(str2, num);
                    }
                }
            }
            Z62.f361242e.addAll(list);
            Z62.Q6();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mbk);
        m65197x3dcbea6f();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(Y6());
        aVar.fk(Y6(), "view_id", "tag_search_input");
        aVar.fk(Y6(), "note_sid", this.f224799i);
        aVar.fk(Y6(), "add_username", this.f224798h);
        aVar.ik(Y6(), 8, 33926);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new f93.s2(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        if (this.f224800m) {
            mo78514x143f1b92().t0(true);
            mo78514x143f1b92().s0(new f93.t2(this), 0);
        } else {
            mo78514x143f1b92().t0(false);
            mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new f93.u2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(638, this);
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(638, this);
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", scene=");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", sb6.toString());
        if (m1Var instanceof e93.a) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "add temp label success: " + ((r45.c4) ((e93.a) m1Var).f331881d.f152244b.f152233a).f452792d);
                W6();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "add temp label failed");
            android.app.ProgressDialog progressDialog = this.f224803p;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn), null);
            return;
        }
        if (m1Var instanceof e93.e) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518179f, vg3.c.f518204z, i18, this.f224800m ? this.f224801n : kz5.b0.c(this.f224798h)));
            android.app.ProgressDialog progressDialog2 = this.f224803p;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                progressDialog2.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify contact label success");
                X6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify contact label failed");
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn), null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(h93.k.class);
        set.add(j93.n.class);
        java.util.List list = h93.k.f361240q;
        java.util.Iterator it = h93.k.f361240q.iterator();
        while (it.hasNext()) {
            set.add((java.lang.Class) it.next());
        }
    }
}
