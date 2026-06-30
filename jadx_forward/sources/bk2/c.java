package bk2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f102901a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f102902b;

    /* renamed from: c, reason: collision with root package name */
    public int f102903c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f102904d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f102905e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f102901a = store;
        this.f102902b = buContext;
        this.f102904d = "";
        this.f102905e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveMiltstoneBubble::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new bk2.b(this), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.f02 r13) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk2.c.a(r45.f02):void");
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MilestoneDistractManager", str + ":endTimer remainTimeSecond:" + this.f102903c + ", timerLotteryId:" + this.f102904d);
        this.f102905e.d();
    }

    public final void c(int i17) {
        b("onTimerEnd remainTimeSecond: " + i17);
        gk2.e eVar = this.f102902b;
        mm2.r4 P6 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
        if (P6 != null && P6.f410909a == 1) {
            mm2.r4 P62 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (P62 != null) {
                P62.f410909a = 2;
            }
            mm2.r4 P63 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (P63 != null) {
                mf2.p.a(this.f102901a, P63, true, false, false);
            }
        }
    }
}
