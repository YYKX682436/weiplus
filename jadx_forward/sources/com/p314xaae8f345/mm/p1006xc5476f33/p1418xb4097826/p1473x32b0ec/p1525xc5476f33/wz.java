package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f196536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.h7 f196537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f196538f;

    public wz(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, mm2.h7 h7Var, int i17) {
        this.f196536d = c10850xc00cf614;
        this.f196537e = h7Var;
        this.f196538f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f196536d;
        c10850xc00cf614.getLocationOnScreen(iArr);
        this.f196537e.f410648g.mo7808x76db6cb1(new mm2.g7(this.f196538f, iArr[0], iArr[1], c10850xc00cf614.getHeight()));
    }
}
