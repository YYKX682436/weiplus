package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f226115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f226116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f226117h;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str, java.lang.String str2, boolean z17, long j17, long j18) {
        this.f226113d = str;
        this.f226114e = str2;
        this.f226115f = z17;
        this.f226116g = j17;
        this.f226117h = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5678x3e538b48 c5678x3e538b48 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5678x3e538b48();
        am.ui uiVar = c5678x3e538b48.f136004g;
        uiVar.f89630a = this.f226113d;
        uiVar.f89631b = this.f226114e;
        boolean z17 = this.f226115f;
        uiVar.f89634e = z17;
        uiVar.f89632c = java.lang.Long.valueOf(this.f226116g);
        uiVar.f89633d = java.lang.Long.valueOf(this.f226117h);
        c5678x3e538b48.e();
        if (!z17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ri(this.f226116g, this.f226117h, "destroyCamera", null, null);
            return;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str = this.f226113d;
        long j17 = this.f226116g;
        long j18 = this.f226117h;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
        iVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.y0(iVar, true, j17, str, j18, null, null, null, null, null));
    }
}
