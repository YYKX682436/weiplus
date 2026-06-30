package at2;

/* loaded from: classes3.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f95265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.u1 f95266e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9, at2.u1 u1Var) {
        this.f95265d = c14932xfc4acec9;
        this.f95266e = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f95265d;
        c14932xfc4acec9.getLocationOnScreen(iArr);
        int height = iArr[1] + c14932xfc4acec9.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0) this.f95266e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0.class);
        if (le0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0.w1(le0Var, height, 0, 2, null);
        }
    }
}
