package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class d7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 f197782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f197784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197785d;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var, android.view.View view, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, android.view.View view2) {
        this.f197782a = k7Var;
        this.f197783b = view;
        this.f197784c = c19782x23db1cfa;
        this.f197785d = view2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 nw1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197782a.H, "CgiFinderLivePrepare: errCode=" + fVar.f152149b + ", errType=" + fVar.f152148a);
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            android.content.Context context = this.f197783b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f197784c;
            gk2.e eVar = dk2.ef.I;
            c61.ub.A3(ubVar, activity, intent, c19782x23db1cfa, 1012, true, java.lang.Boolean.valueOf(((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)) > 0), null, false, (r45.j01) fVar.f152151d, null, 704, null);
        } else {
            db5.t7.m123882x26a183b(this.f197785d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
