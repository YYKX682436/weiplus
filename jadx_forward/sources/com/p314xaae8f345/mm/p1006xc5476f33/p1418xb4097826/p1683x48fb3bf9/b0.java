package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 f218381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218382e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281, java.lang.String str) {
        this.f218381d = c15492xb61be281;
        this.f218382e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.sn snVar;
        zg0.q2 q2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281 = this.f218381d;
        snVar = c15492xb61be281.homeContext;
        java.lang.String str = this.f218382e;
        if (snVar != null) {
            snVar.f467385f = str;
        }
        q2Var = c15492xb61be281.webViewController;
        if (q2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) q2Var).x1(str, null, false);
        }
    }
}
