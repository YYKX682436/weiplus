package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class b5 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f145587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f145588f;

    public b5(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc, java.lang.String str, com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar) {
        this.f145588f = activityC10348x266bd9bc;
        this.f145586d = str;
        this.f145587e = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        int i19 = this.f424756a;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f145588f;
        if (i19 != 0) {
            this.f145587e.a();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f424758c) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f424757b)) {
                return;
            }
            db5.e1.s(activityC10348x266bd9bc, fVar.f424758c, fVar.f424757b);
            return;
        }
        dp.a.m125854x26a183b(activityC10348x266bd9bc, activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572119z7), 0).show();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC10348x266bd9bc.f145358o, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            n17.M1(this.f145586d);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m0(n17);
        }
        activityC10348x266bd9bc.finish();
    }
}
