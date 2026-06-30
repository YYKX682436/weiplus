package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/eb;", "Lcom/tencent/mm/plugin/finder/feed/db;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeFeedUI */
/* loaded from: classes2.dex */
public final class ActivityC13956x4e8964cd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eb, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.db> {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f190787t = "Finder.FinderFriendLikeFeedUI";

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.db f190788u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eb f190789v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f190790w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f190791x;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.db dbVar = this.f190788u;
        if (dbVar != null) {
            return dbVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eb ebVar = this.f190789v;
        if (ebVar != null) {
            return ebVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void e7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void f7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f190790w = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_NICKNAME");
        this.f190791x = stringExtra2 != null ? stringExtra2 : "";
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        java.lang.String g76 = g7();
        java.lang.String str = this.f190791x;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetNickname");
            throw null;
        }
        this.f190791x = c61.yb.md(ybVar, g76, str, false, 4, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initOnCreate ");
        sb6.append(g7());
        sb6.append(", ");
        java.lang.String str2 = this.f190791x;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetNickname");
            throw null;
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190787t, sb6.toString());
        if (g7().length() > 0) {
            lm0.a s17 = gm0.j1.s(vg3.x3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(s17, "null cannot be cast to non-null type com.tencent.mm.plugin.messenger.foundation.api.IMessengerStorage");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) s17)).Bi().n(g7(), true);
            java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f57);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            if (n17 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (n17.I != 1) {
                    string = string2;
                }
                objArr[0] = string;
                java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvm, objArr);
                ((ke0.e) xVar).getClass();
                mo56583xbf7c1df6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, string3));
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvm, string);
                ((ke0.e) xVar2).getClass();
                mo56583xbf7c1df6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471792, string4));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e c13863x5951942e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e(g7(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13863x5951942e.f188991e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b3(c13863x5951942e, this);
        this.f190788u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.db(this, 0, 0, c13863x5951942e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eb ebVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eb(this, 0, 0, true);
        this.f190789v = ebVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.db dbVar = this.f190788u;
        if (dbVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ebVar.f187715o = dbVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g7())) {
            finish();
        }
    }

    public final java.lang.String g7() {
        java.lang.String str = this.f190790w;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetUsername");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aj6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }
}
