package pt2;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f439787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 f439788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439789f;

    public n(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453, int i18) {
        this.f439787d = i17;
        this.f439788e = abstractActivityC14960x21b59453;
        this.f439789f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f439789f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453 = this.f439788e;
        int i18 = this.f439787d;
        if (i18 == 0) {
            abstractActivityC14960x21b59453.e7().N(i17);
            return;
        }
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f545054f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0) abstractActivityC14960x21b59453.c7()).f207210e == 1;
        int i19 = i17 - i18;
        s3Var.f545055g = i19 <= 0;
        s3Var.f545056h = i19;
        abstractActivityC14960x21b59453.e7().mo56054xc12c74c0(s3Var);
    }
}
