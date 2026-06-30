package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLikePrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI */
/* loaded from: classes4.dex */
public final class ActivityC13981x5704e39f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f190850d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f190851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f190852f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f190853g;

    /* renamed from: h, reason: collision with root package name */
    public int f190854h;

    public final void V6(java.util.LinkedList opList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opList, "opList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(opList, 10));
        java.util.Iterator it = opList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.un4) it.next()).f469027d);
        }
        gm0.j1.d().g(new w11.h0(arrayList, ((r45.un4) opList.getFirst()).f469028e, ((r45.un4) opList.getFirst()).f469029f, ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30)));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576410dk;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.m1i);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x6(this));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.erq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.CharSequence k17 = hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f79670xb62772ac, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.erm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.CharSequence k18 = hc2.x0.k(string2, context, '#', com.p314xaae8f345.mm.R.raw.f79670xb62772ac, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("checkbox_preference_shieldHisLike");
        this.f190850d = c21541x1c1b08fe;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.L(k17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("checkbox_preference_shieldMyLike");
        this.f190851e = c21541x1c1b08fe2;
        if (c21541x1c1b08fe2 != null) {
            c21541x1c1b08fe2.L(k18);
        }
        this.f190853g = getIntent().getStringExtra("WxUserName");
        this.f190854h = getIntent().getIntExtra("keyFromSource", 0);
        gm0.j1.d().a(3990, this);
        hc2.v0.c(this, iy1.c.FinderFriendLikePrivilegePage, "page_in", false, kz5.c1.k(new jz5.l("thx_to_uin", this.f190853g), new jz5.l("friend_like_privilege_source_page", java.lang.Integer.valueOf(this.f190854h))), 4, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3990, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82;
        java.lang.String str2;
        java.lang.String str3 = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLikePrivacyUI", "click " + str3);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "checkbox_preference_shieldHisLike")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f190850d;
            if (c21541x1c1b08fe != null && (str2 = this.f190852f) != null) {
                boolean N = c21541x1c1b08fe.N();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.un4 un4Var = new r45.un4();
                un4Var.f469027d = str2;
                un4Var.f469028e = zy2.v.f559126d;
                un4Var.f469029f = N ? 1 : 2;
                linkedList.add(un4Var);
                V6(linkedList);
                cq.k1.a();
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.k1().r()).booleanValue()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5474xce8c4584 c5474xce8c4584 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5474xce8c4584();
                    java.util.List c17 = kz5.b0.c(str2);
                    am.jb jbVar = c5474xce8c4584.f135812g;
                    jbVar.f88555a = c17;
                    jbVar.f88556b = N ? 1 : 0;
                    c5474xce8c4584.e();
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f190850d;
            if (c21541x1c1b08fe2 != null && (viewOnClickListenerC22631x1cc07cc82 = c21541x1c1b08fe2.M) != null) {
                hc2.v0.d(viewOnClickListenerC22631x1cc07cc82, "dont_check_his_like_switch", "view_clk", false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y6(viewOnClickListenerC22631x1cc07cc82, this.f190853g, this), 12, null);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "checkbox_preference_shieldMyLike")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = this.f190851e;
            if (c21541x1c1b08fe3 != null && (str = this.f190852f) != null) {
                boolean N2 = c21541x1c1b08fe3.N();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                r45.un4 un4Var2 = new r45.un4();
                un4Var2.f469027d = str;
                un4Var2.f469028e = zy2.v.f559127e;
                un4Var2.f469029f = N2 ? 1 : 2;
                linkedList2.add(un4Var2);
                V6(linkedList2);
                cq.k1.a();
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.k1().r()).booleanValue()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5474xce8c4584 c5474xce8c45842 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5474xce8c4584();
                    java.util.List c18 = kz5.b0.c(str);
                    am.jb jbVar2 = c5474xce8c45842.f135812g;
                    jbVar2.f88555a = c18;
                    jbVar2.f88556b = -1;
                    c5474xce8c45842.e();
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = this.f190851e;
            if (c21541x1c1b08fe4 != null && (viewOnClickListenerC22631x1cc07cc8 = c21541x1c1b08fe4.M) != null) {
                hc2.v0.d(viewOnClickListenerC22631x1cc07cc8, "hide_my_like_from_him_switch", "view_clk", false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y6(viewOnClickListenerC22631x1cc07cc8, this.f190853g, this), 12, null);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Bundle extras = getIntent().getExtras();
        this.f190852f = extras != null ? extras.getString("Username", "") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("isShieldHisLike", 0)) : null;
        android.os.Bundle extras3 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras3 != null ? java.lang.Integer.valueOf(extras3.getInt("isShieldMyLike", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_shieldHisLike", true);
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f190850d;
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(valueOf != null && valueOf.intValue() == 1);
                c21541x1c1b08fe.f279318v = false;
            }
        }
        if (valueOf2 != null && valueOf2.intValue() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_shieldMyLike", true);
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f190851e;
            if (c21541x1c1b08fe2 != null) {
                c21541x1c1b08fe2.O(valueOf2 != null && valueOf2.intValue() == 1);
                c21541x1c1b08fe2.f279318v = false;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof w11.h0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLikePrivacyUI", "NetSceneBatchSetBlackList errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
            if (i17 == 0 && i18 == 0) {
                java.util.List list = ((w11.h0) m1Var).f523572e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getNames(...)");
            }
        }
    }
}
