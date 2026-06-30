package sr2;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f493121f;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6, int i17, int i18) {
        this.f493119d = c14609xb4d6eef6;
        this.f493120e = i17;
        this.f493121f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue();
        int i17 = this.f493121f;
        int i18 = this.f493120e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493119d;
        if (booleanValue) {
            c14609xb4d6eef6.m7().smoothScrollBy(0, i18 - i17);
        } else {
            c14609xb4d6eef6.m7().scrollBy(0, i18 - i17);
        }
    }
}
