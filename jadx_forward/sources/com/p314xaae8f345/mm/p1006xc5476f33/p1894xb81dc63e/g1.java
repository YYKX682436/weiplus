package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class g1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 f231968d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var) {
        this.f231968d = i1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f231968d.f231978d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }
}
