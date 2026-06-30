package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public abstract class y implements zb5.h, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f284074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f284075e;

    /* renamed from: f, reason: collision with root package name */
    public zb5.i f284076f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0 f284077g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f284078h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f284079i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f284080m = null;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f284081n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f284082o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public volatile long f284083p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f284084q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f284085r = 0;

    public y(android.content.Context context) {
        this.f284079i = null;
        this.f284074d = context;
        this.f284079i = new java.util.ArrayList();
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h(int i17) {
        java.util.ArrayList arrayList = this.f284079i;
        if (arrayList == null || arrayList.size() <= i17) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) this.f284079i.get(i17);
    }

    public java.lang.String j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, boolean z18) {
        java.lang.String str = null;
        if (f9Var == null) {
            return null;
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        if (z17) {
            str = c01.w9.s(f9Var.j());
        } else if (z18) {
            str = f9Var.u0();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? f9Var.Q0() : str;
    }

    public abstract int k();

    public void l(android.content.Context context, java.lang.String str, long j17) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long m124847x74d37ac6 = pt0.f0.Li(str, j17).m124847x74d37ac6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 == null || !n17.r2()) {
                if (n17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                return;
            }
        } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", m124847x74d37ac6);
        putExtra.setClass(context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void m(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i18) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", java.lang.Integer.valueOf(i17));
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHistoryListPresenter", "handleSelectedItem msgInfo is null");
            return;
        }
        int k17 = k();
        android.content.Context context = this.f284074d;
        if (i17 == 0) {
            de5.a.f310929a.k(15, i18, k17);
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null || (!(51 == (i19 = v17.f430199i) || 129 == i19) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(context, null))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 19L, 1L, true);
                boolean endsWith = this.f284075e.toLowerCase().endsWith("@chatroom");
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(f9Var);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(context, arrayList, endsWith, this.f284075e, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u(this));
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                de5.a.f310929a.k(17, i18, k17);
                l(context, this.f284075e, f9Var.m124847x74d37ac6());
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                de5.a.f310929a.k(18, i18, k17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 5);
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
                copyOnWriteArraySet.add(tg3.l1.a(f9Var));
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x(this, i18, copyOnWriteArraySet, f9Var), null);
                return;
            }
        }
        de5.a.f310929a.k(16, i18, k17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList2.add(f9Var);
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.i(this.f284074d, c5303xc75d2f73, this.f284075e, arrayList2, false, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
            return;
        }
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87860m = 45;
        c4Var.f87856i = (android.app.Activity) context;
        c5303xc75d2f73.e();
        int i27 = c5303xc75d2f73.f135624h.f87966a;
        if (i27 == -2 || i27 > 0 || i27 > 0 || 14 != c4Var.f87850c) {
            return;
        }
        r45.sq0 sq0Var = c4Var.f87849b;
        if (sq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f467439d), java.lang.Integer.valueOf(c4Var.f87849b.f467440e), java.lang.Integer.valueOf(c4Var.f87849b.f467441f), java.lang.Integer.valueOf(c4Var.f87849b.f467442g), java.lang.Integer.valueOf(c4Var.f87849b.f467443h), java.lang.Integer.valueOf(c4Var.f87849b.f467444i), java.lang.Integer.valueOf(c4Var.f87849b.f467445m), java.lang.Integer.valueOf(c4Var.f87849b.f467446n), java.lang.Integer.valueOf(c4Var.f87849b.f467447o), java.lang.Integer.valueOf(c4Var.f87849b.f467448p), java.lang.Integer.valueOf(c4Var.f87849b.f467449q), java.lang.Integer.valueOf(c4Var.f87849b.f467450r), java.lang.Integer.valueOf(c4Var.f87849b.f467451s), java.lang.Integer.valueOf(c4Var.f87849b.f467452t), java.lang.Integer.valueOf(c4Var.f87849b.f467453u));
        }
    }

    public void n() {
        this.f284082o.set(true);
        this.f284083p = java.lang.System.currentTimeMillis() - this.f284081n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[loadData][perf] completed, cost:%dms, type:%s", java.lang.Long.valueOf(this.f284083p), getClass().getSimpleName());
    }

    public void o() {
        this.f284081n = java.lang.System.currentTimeMillis();
        this.f284082o.set(false);
        this.f284083p = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        if (this.f284081n != 0) {
            boolean z17 = this.f284082o.get();
            long currentTimeMillis = z17 ? this.f284083p : java.lang.System.currentTimeMillis() - this.f284081n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[loadData][perf] exit, completed:%s, cost:%dms, type:%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), getClass().getSimpleName());
            java.util.ArrayList arrayList = this.f284079i;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o(this, z17, currentTimeMillis, arrayList != null ? arrayList.size() : 0));
        }
        this.f284076f.l2(null);
        this.f284076f = null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0 k0Var = this.f284077g;
        if (k0Var != null) {
            k0Var.getClass();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279963f = null;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279964g = null;
        }
    }
}
