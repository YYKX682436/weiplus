package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class s1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f207379a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207380b;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        this.f207380b = activityC14945x8c20f160;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f207379a || i17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activity = this.f207380b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).Z6(-1);
        if (Z6 != null) {
            fc2.i iVar = new fc2.i(Z6);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activity.P;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            iVar.mo481x4d79408f(c1163xf1deaba4, 5);
        }
        this.f207379a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreBegin");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160.U1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207380b;
        if (activityC14945x8c20f160.h7()) {
            if (activityC14945x8c20f160.f207082v != null) {
                bq.o1 o1Var = activityC14945x8c20f160.E1;
                if (o1Var != null) {
                    o1Var.j();
                }
                bq.o1 o1Var2 = new bq.o1(activityC14945x8c20f160.f207082v, activityC14945x8c20f160.f207083w, activityC14945x8c20f160.E, activityC14945x8c20f160.f207090z, activityC14945x8c20f160.j7(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC14945x8c20f160).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), null, null, null, null, false, 0, 3456, null);
                activityC14945x8c20f160.E1 = o1Var2;
                o1Var2.f105042v = activityC14945x8c20f160.H;
                pm0.v.T(o1Var2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j2(activityC14945x8c20f160, o1Var2)).f(activityC14945x8c20f160);
                activityC14945x8c20f160.p7();
                return;
            }
            return;
        }
        java.lang.String str = activityC14945x8c20f160.f207082v;
        if (str != null) {
            if (activityC14945x8c20f160.f207084x == 1) {
                activityC14945x8c20f160.x7(str, false);
                return;
            }
            if (activityC14945x8c20f160.w7(false)) {
                activityC14945x8c20f160.p7();
                return;
            }
            int i19 = activityC14945x8c20f160.f207087y;
            if (i19 == 1) {
                activityC14945x8c20f160.g7(null, false);
                return;
            }
            if (i19 != 0 || activityC14945x8c20f160.X != null || !activityC14945x8c20f160.L) {
                activityC14945x8c20f160.q7();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreBegin wait for onGetList");
                activityC14945x8c20f160.M = true;
            }
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreEnd");
    }
}
