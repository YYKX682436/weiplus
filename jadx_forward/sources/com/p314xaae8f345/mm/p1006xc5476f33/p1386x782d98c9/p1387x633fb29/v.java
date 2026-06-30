package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f180605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180606f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var, java.lang.String str, boolean z17) {
        this.f180606f = d0Var;
        this.f180604d = str;
        this.f180605e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var = this.f180606f;
        if (d0Var.f180398a != null) {
            u32.u.f505905d.d(this.f180604d, this.f180605e);
            return;
        }
        d0Var.f180398a = new u32.r();
        u32.r rVar = d0Var.f180398a;
        rVar.f505889d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.u(this, 0);
        rVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    /* renamed from: toString */
    public java.lang.String m55064x9616526c() {
        return super.toString() + "|ranging";
    }
}
