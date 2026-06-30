package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d f173486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f173488f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d dVar, java.lang.String str, l75.w0 w0Var) {
        this.f173486d = dVar;
        this.f173487e = str;
        this.f173488f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set keySet = ((java.util.LinkedHashMap) this.f173486d.f173494e).keySet();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d dVar = this.f173486d;
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            dVar.h((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g2) it.next());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.b(this.f173486d, this.f173487e, this.f173488f));
    }
}
