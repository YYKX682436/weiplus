package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class j8 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s8 f197949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197950e;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s8 s8Var, android.view.View view) {
        this.f197949d = s8Var;
        this.f197950e = view;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductRecordPlayWidget", "FetchDataTask result is null or empty");
        }
        android.view.View rootLayout = this.f197950e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootLayout, "$rootLayout");
        this.f197949d.e(rootLayout, c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null);
    }
}
