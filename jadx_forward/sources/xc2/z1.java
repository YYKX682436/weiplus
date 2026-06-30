package xc2;

/* loaded from: classes2.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f534883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f534883d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) this.f534883d.f391656d).f292654p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84 activityC13649x64352d84 = abstractActivityC22579xbed01a37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84) abstractActivityC22579xbed01a37 : null;
        if (activityC13649x64352d84 != null && (c13650x1bf60d72 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72) pf5.z.f435481a.a(activityC13649x64352d84).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.class)) != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = c13650x1bf60d72.f183296n;
            android.view.ViewGroup.LayoutParams layoutParams = c2678xa407981c != null ? c2678xa407981c.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a;
            if (!(behavior instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) || ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) behavior).y() == 0) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
