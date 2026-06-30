package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class da extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6 f188087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa f188088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6 c5543xbe6908c6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar) {
        super(0);
        this.f188087d = c5543xbe6908c6;
        this.f188088e = oaVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f188087d.f135867g.f88953a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f188088e;
        if (i17 == oaVar.f190160m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowFeedUIContract.Presenter", "autoRefreshEventListener: trigger refresh tabType = " + oaVar.f190160m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = oaVar.f188690f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar = a1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa) a1Var : null;
            if (xaVar != null) {
                xaVar.f187713m.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qa(xaVar, false), 150L);
            }
        }
        return jz5.f0.f384359a;
    }
}
