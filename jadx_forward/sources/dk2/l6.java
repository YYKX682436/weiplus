package dk2;

/* loaded from: classes3.dex */
public final class l6 implements ss5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f315253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f315255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f315256e;

    public l6(android.content.Context context, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var, r45.hc1 hc1Var) {
        this.f315252a = context;
        this.f315253b = z17;
        this.f315254c = c19792x256d2725;
        this.f315255d = qt2Var;
        this.f315256e = hc1Var;
    }

    @Override // ss5.j0
    public void a(int i17, int i18, java.lang.String str, r45.r71 resp, int i19, java.lang.String str2) {
        byte[] bArr;
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        dk2.u6 u6Var = dk2.u6.f315704a;
        android.content.Context context = this.f315252a;
        boolean a17 = u6Var.a(context);
        r45.qt2 qt2Var = this.f315255d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f315254c;
        boolean z17 = this.f315253b;
        if (a17 && !z17) {
            u6Var.e(context, c19792x256d2725, qt2Var, true);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "live msg errCode = " + i18);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : dk2.u6.f315712i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveMsg return Cookie = ");
        byte[] bArr2 = g17 == null ? new byte[0] : g17;
        sb6.append(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr2, 0, bArr2.length).i());
        sb6.append(", resp.liveCloseFlag = ");
        sb6.append(resp.m75939xb282bd08(7));
        sb6.append(", errCode = ");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
        long j17 = dk2.u6.f315709f;
        r45.nw1 nw1Var2 = (r45.nw1) resp.m75936x14adae67(3);
        if (j17 == (nw1Var2 != null ? nw1Var2.m75942xfb822ef2(0) : -1L)) {
            long j18 = dk2.u6.f315713j;
            r45.nw1 nw1Var3 = (r45.nw1) resp.m75936x14adae67(3);
            if (j18 == (nw1Var3 != null ? nw1Var3.m75942xfb822ef2(0) : -1L) && !z17) {
                r45.hc1 hc1Var = this.f315256e;
                dk2.u6.f315711h = hc1Var;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = resp.m75934xbce7f2f(4);
                dk2.u6.f315712i = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                if (resp.m75939xb282bd08(7) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "live is end , return");
                    u6Var.e(context, null, null, false);
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    if (!r4Var.x0() || (nw1Var = (r45.nw1) resp.m75936x14adae67(3)) == null) {
                        return;
                    }
                    long m75942xfb822ef2 = nw1Var.m75942xfb822ef2(0);
                    java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
                    if (m76836x6c03c64c == null) {
                        m76836x6c03c64c = "";
                    }
                    zl2.r4.D2(r4Var, m75942xfb822ef2, m76836x6c03c64c, 2, 0, 8, null);
                    return;
                }
                if (i18 == -100020) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "INVALID_COOKIES, but live in on, rejoinLive");
                    u6Var.e(context, null, null, false);
                    u6Var.c(context, c19792x256d2725, qt2Var);
                    return;
                }
                long m75939xb282bd08 = resp.m75939xb282bd08(17) * 1000;
                if (m75939xb282bd08 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "liveMsgDelay == 0, set to 3000");
                    m75939xb282bd08 = 30000;
                }
                ae2.b2 b2Var = ae2.b2.f84994a;
                if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.b2.S).mo141623x754a37bb()).r()).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "维修厂开关开了，固定使用一个cookie");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = hc1Var.m75934xbce7f2f(1);
                    bArr = m75934xbce7f2f3 != null ? m75934xbce7f2f3.g() : null;
                } else {
                    bArr = g17;
                }
                u6Var.b(this.f315252a, this.f315254c, this.f315256e, this.f315255d, m75939xb282bd08, this.f315253b, bArr);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "not current liveId or offline，stop.  offline = " + z17);
    }
}
