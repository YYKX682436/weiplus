package cw1;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f304706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.e8 f304707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304708f;

    public n(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, c01.e8 e8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8) {
        this.f304706d = c26987xeef691ab;
        this.f304707e = e8Var;
        this.f304708f = activityC13107x4291ddb8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f304706d;
        yv1.h1.f(1, c26987xeef691ab);
        java.util.List q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        java.util.ArrayList arrayList = (java.util.ArrayList) q17;
        if (arrayList.size() > 0) {
            java.util.List e17 = c01.t1.e(q17);
            if (e17 != null) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
                int size = arrayList2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj = arrayList2.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        o25.s1 a17 = f14.g.a();
                        java.lang.String str = (java.lang.String) arrayList.get(i17);
                        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
                        com.p314xaae8f345.mm.p950x112e8cc1.f.d().b(str);
                    }
                }
            }
            int size2 = arrayList.size();
            for (int i18 = 0; i18 < size2; i18++) {
                qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
                java.lang.Object obj2 = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                ((c61.ec) x7Var).Ai((java.lang.String) obj2);
            }
        }
        ((hn.k0) ((vg3.i4) i95.n0.c(vg3.i4.class))).Ai();
        c01.e8 e8Var = this.f304707e;
        java.util.Map map = c01.w9.f119072b;
        ((ku5.t0) ku5.t0.f394148d).a(new c01.RunnableC1366x6a761ff(e8Var, c01.id.c(), c26987xeef691ab));
        if (c26987xeef691ab.m108008xc9602be3()) {
            return;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8.f177179n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304708f;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13107x4291ddb8.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13107x4291ddb8.f177185i));
        lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(activityC13107x4291ddb8.f177186m));
        lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(activityC13107x4291ddb8.f177186m));
        ((cy1.a) rVar).Ej("chat_history_clean_all_complete", kz5.c1.k(lVarArr), 32903);
    }
}
