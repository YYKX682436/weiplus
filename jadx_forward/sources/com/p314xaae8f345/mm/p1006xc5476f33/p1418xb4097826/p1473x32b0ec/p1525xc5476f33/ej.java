package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class ej extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fj f193959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fj fjVar, java.lang.Class cls) {
        super(cls);
        this.f193959b = fjVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.sy2 result = (r45.sy2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onPollingSuccess isMount=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fj fjVar = this.f193959b;
        sb6.append(fjVar.f194095q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePlugin", sb6.toString());
        if (fjVar.f194095q) {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dj(fjVar, result));
        }
    }
}
