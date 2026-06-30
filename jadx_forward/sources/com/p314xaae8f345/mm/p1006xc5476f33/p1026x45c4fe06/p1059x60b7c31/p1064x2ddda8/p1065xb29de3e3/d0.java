package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c f161022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 f161023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f161025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l f161026h;

    public d0(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var, int i17, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l lVar) {
        this.f161022d = c10750x9556b48c;
        this.f161023e = m0Var;
        this.f161024f = i17;
        this.f161025g = arrayList;
        this.f161026h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = this.f161022d;
        boolean z17 = c10750x9556b48c != null ? c10750x9556b48c.f149933d : false;
        int i17 = this.f161024f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var = this.f161023e;
        if (z17) {
            m0Var.f161056e.clear();
            m0Var.f161056e.addAll(this.f161025g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaUserInfoListOperationController", "delete avatar success.index:" + i17 + "  current szie=" + m0Var.f161056e.size());
        } else {
            m0Var.e(m0Var.f161056e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaUserInfoListOperationController", "delete avatar failed, revert delete item. index:" + i17, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l lVar = this.f161026h;
        if (lVar != null) {
            lVar.a(z17);
        }
    }
}
