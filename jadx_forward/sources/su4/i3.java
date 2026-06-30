package su4;

/* loaded from: classes8.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f494468d;

    public i3(int i17) {
        this.f494468d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        final int[] iArr = {1, 0, 5, 6, 3, 9};
        int i17 = this.f494468d;
        if (i17 == -1) {
            ((i04.i) ((j04.e) i95.n0.c(j04.e.class))).Ri("reportWebSearchTemplate", 24, new j04.f() { // from class: su4.i3$$a
                @Override // j04.f
                public final void a(java.lang.String str, long j17, long j18) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= iArr.length) {
                            return;
                        }
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7135xe07f920b c7135xe07f920b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7135xe07f920b();
                        int i19 = i18 + 1;
                        c7135xe07f920b.f144473d = i19;
                        c7135xe07f920b.f144474e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(r4[i18]);
                        c7135xe07f920b.k();
                        su4.k3.m(c7135xe07f920b);
                        i18 = i19;
                    }
                }
            }, true, false);
            return;
        }
        for (int i18 = 0; i18 < 6; i18++) {
            if (iArr[i18] == i17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7135xe07f920b c7135xe07f920b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7135xe07f920b();
                c7135xe07f920b.f144473d = i18 + 1;
                c7135xe07f920b.f144474e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(iArr[i18]);
                c7135xe07f920b.k();
                su4.k3.m(c7135xe07f920b);
                return;
            }
        }
    }
}
