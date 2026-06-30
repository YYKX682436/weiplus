package ee5;

/* loaded from: classes9.dex */
public abstract class t2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f333581d;

    /* renamed from: e, reason: collision with root package name */
    public final int f333582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f333583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f333584g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f333585h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f333586i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f333587m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333588n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f333589o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f333590p;

    /* renamed from: q, reason: collision with root package name */
    public long f333591q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333581d = "MiscroMsg.FTSMultiNormalBasicUIC";
        this.f333582e = 1;
        this.f333583f = 2;
        this.f333584g = 3;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(ae5.n.f85965d);
        this.f333585h = j0Var;
        this.f333586i = j0Var;
        this.f333587m = new java.util.ArrayList();
        this.f333589o = "";
    }

    public abstract android.text.SpannableString O6();

    public abstract zd5.n P6();

    public int Q6() {
        return 0;
    }

    public boolean R6() {
        long j17 = this.f333591q + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f333591q = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            this.f333590p = c01.d9.b().E();
        }
        return this.f333590p;
    }

    public final void S6(java.lang.String str, long j17) {
        java.lang.String str2 = this.f333581d;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long m124847x74d37ac6 = pt0.f0.f439742b1.n(str, j17).m124847x74d37ac6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 == null || !n17.r2()) {
                if (n17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(m158354x19263085(), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                return;
            }
        } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(m158354x19263085(), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", m124847x74d37ac6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        putExtra.setClass(m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void T6(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String str) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        java.lang.String str2 = this.f333581d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[handleSelectedItem] index:%s", objArr);
        int Q6 = Q6();
        if (i17 == this.f333582e) {
            de5.a.f310929a.c(16, Q6);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(msgInfo);
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.i(m158354x19263085(), c5303xc75d2f73, this.f333589o, arrayList, false, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[handleFav] err!");
                return;
            }
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87860m = 45;
            c4Var.f87856i = m158354x19263085();
            c5303xc75d2f73.e();
            int i19 = c5303xc75d2f73.f135624h.f87966a;
            if (i19 == -2 || i19 > 0 || i19 > 0 || 14 != c4Var.f87850c) {
                return;
            }
            r45.sq0 sq0Var = c4Var.f87849b;
            if (sq0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "want to report record fav, but type count is null");
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f467439d), java.lang.Integer.valueOf(c4Var.f87849b.f467440e), java.lang.Integer.valueOf(c4Var.f87849b.f467441f), java.lang.Integer.valueOf(c4Var.f87849b.f467443h), java.lang.Integer.valueOf(c4Var.f87849b.f467444i), java.lang.Integer.valueOf(c4Var.f87849b.f467445m), java.lang.Integer.valueOf(c4Var.f87849b.f467446n), java.lang.Integer.valueOf(c4Var.f87849b.f467447o), java.lang.Integer.valueOf(c4Var.f87849b.f467448p), java.lang.Integer.valueOf(c4Var.f87849b.f467449q), java.lang.Integer.valueOf(c4Var.f87849b.f467450r), java.lang.Integer.valueOf(c4Var.f87849b.f467451s), java.lang.Integer.valueOf(c4Var.f87849b.f467452t), java.lang.Integer.valueOf(c4Var.f87849b.f467453u));
                return;
            }
        }
        if (i17 != 0) {
            if (i17 == this.f333583f) {
                de5.a.f310929a.c(17, Q6);
                S6(str, msgInfo.m124847x74d37ac6());
                return;
            } else {
                if (i17 == this.f333584g) {
                    de5.a.f310929a.c(18, Q6);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 5);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(tg3.l1.a(msgInfo));
                    db5.e1.A(m158354x19263085(), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ee5.r2(this, Q6(), hashSet, msgInfo), null);
                    return;
                }
                return;
            }
        }
        de5.a.f310929a.c(15, Q6);
        ot0.q v17 = ot0.q.v(msgInfo.j());
        if (v17 == null || (!(51 == (i18 = v17.f430199i) || 129 == i18) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(m158354x19263085(), null))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 19L, 1L, true);
            java.lang.String lowerCase = this.f333589o.toLowerCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            boolean n17 = r26.i0.n(lowerCase, "@chatroom", false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            arrayList2.add(msgInfo);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(m158354x19263085(), arrayList2, n17, this.f333589o, new ee5.s2());
        }
    }

    public final void U6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).O6();
    }

    public final void V6(java.util.ArrayList arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<set-?>");
        this.f333587m = arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f333588n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f333589o = stringExtra;
    }
}
