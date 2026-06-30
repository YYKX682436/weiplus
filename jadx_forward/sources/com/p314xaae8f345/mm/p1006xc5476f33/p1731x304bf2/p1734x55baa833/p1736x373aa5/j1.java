package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static db5.d5 f220719a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f220720b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.s0(), false);

    public static void a() {
        db5.d5 d5Var = f220719a;
        if (d5Var != null && d5Var.isShowing()) {
            f220719a.dismiss();
        }
        f220719a = null;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d b(w33.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d2;
        if (aVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = aVar.f524233b;
        if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d)) {
            if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) || (c15720x34e10e9d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) fVar).f36604x391f2836) == null) {
                return null;
            }
            return c15720x34e10e9d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) fVar).f36787x39219d3a;
        if (c15741x8495618b == null || (c15720x34e10e9d2 = c15741x8495618b.f36604x391f2836) == null) {
            return null;
        }
        return c15720x34e10e9d2;
    }

    public static int c(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, android.view.View view, java.util.List list, long j17, long j18) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        int i18 = l33.c.f396961a;
        if (i18 == 1 || i18 == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Vi();
            return 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05) it.next();
                if (c15705xc5787f05.f36453x368f3a == 1) {
                    d(context, c15705xc5787f05.f36452x2efe91);
                    return 0;
                }
            }
        }
        if (c15720x34e10e9d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15720x34e10e9d.f36490x3923b317)) {
            return 0;
        }
        android.app.ActivityOptions makeScaleUpAnimation = view != null ? android.app.ActivityOptions.makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0) : null;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("chat_room_title", c15720x34e10e9d.f36499xc05e036f);
        t33.e eVar = new t33.e(c15720x34e10e9d.f36490x3923b317, c15720x34e10e9d.f36488x39217505, j17, j18, false, bundle);
        if (i17 == 1) {
            s33.y.h(context, c15720x34e10e9d.f36484xa59b228e);
            return 2;
        }
        if (i17 == 2) {
            eVar.f496940c = true;
            ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
            s33.n.f484063b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9.b7(context, eVar, lbs, makeScaleUpAnimation, false);
            return 1;
        }
        if (i17 == 3) {
            ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
            s33.n.f484063b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9.b7(context, eVar, lbs, makeScaleUpAnimation, false);
            return 1;
        }
        if (i17 != 4) {
            return 0;
        }
        if (c15720x34e10e9d.f36494x46ae0f6e || !c15720x34e10e9d.f36487xe57a0dba) {
            s33.y.h(context, c15720x34e10e9d.f36484xa59b228e);
            return 2;
        }
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        s33.n.f484063b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9.b7(context, eVar, lbs, makeScaleUpAnimation, false);
        return 1;
    }

    public static void d(android.content.Context context, java.lang.String str) {
        a();
        f220719a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.a((android.app.Activity) context, 1, com.p314xaae8f345.mm.R.raw.f81210x36d951ba, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), str, 0, null, null, null);
        f220720b.c(5000L, 0L);
    }
}
