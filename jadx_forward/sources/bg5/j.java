package bg5;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f102285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f102286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f102287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f102288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102289h;

    public j(java.util.Collection collection, long j17, long j18, long j19, java.lang.String str) {
        this.f102285d = collection;
        this.f102286e = j17;
        this.f102287f = j18;
        this.f102288g = j19;
        this.f102289h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        java.util.Iterator it = this.f102285d.iterator();
        long j18 = 0;
        long j19 = 0;
        long j27 = 0;
        long j28 = 0;
        long j29 = 0;
        long j37 = 0;
        long j38 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = it;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next();
            long j39 = j38;
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var)) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(l4Var.h1())) {
                    j38 = 1;
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102289h, l4Var.h1())) {
                        j38 = j39;
                        j37 = 1;
                    } else {
                        j38 = j39;
                    }
                }
                long j47 = j37;
                int b17 = c01.h2.b(l4Var.h1());
                if (b17 == 1 || b17 == 2) {
                    j17 = 1;
                    j18++;
                } else if (b17 == 3 || b17 == 4) {
                    j17 = 1;
                    j19++;
                } else if (b17 != 6) {
                    j17 = 1;
                } else {
                    j17 = 1;
                    j27++;
                }
                if (l4Var.d1() > 0 || l4Var.f1() > 0) {
                    j28 += j17;
                }
                j37 = j47;
            } else {
                if (l4Var.d1() > 0 || l4Var.f1() > 0) {
                    j29++;
                }
                j38 = j39;
            }
            it = it6;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6976xc92117b8 c6976xc92117b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6976xc92117b8();
        c6976xc92117b8.f142849d = j18;
        c6976xc92117b8.f142850e = j19;
        c6976xc92117b8.f142851f = j27;
        c6976xc92117b8.f142852g = j28;
        c6976xc92117b8.f142853h = j29;
        c6976xc92117b8.f142854i = this.f102286e;
        c6976xc92117b8.f142855j = this.f102287f;
        c6976xc92117b8.f142856k = j37;
        c6976xc92117b8.f142857l = j38;
        c6976xc92117b8.k();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putLong("top_session_info_report", this.f102288g);
    }
}
