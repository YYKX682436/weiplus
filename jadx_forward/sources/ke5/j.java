package ke5;

/* loaded from: classes9.dex */
public class j extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final long f388629i;

    /* renamed from: j, reason: collision with root package name */
    public int f388630j;

    public j(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f388629i = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).w0();
    }

    @Override // ke5.a, hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        super.c(c21897x17252689, qVar);
        int size = ((java.util.LinkedList) qVar.f362164c).size();
        int i17 = qVar.f362167f;
        int ordinal = qVar.f362163b.ordinal();
        yb5.d dVar = this.f388574b;
        if (ordinal == 0) {
            c21897x17252689.d(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), (c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2()) + 1, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).r0() + c21897x17252689.m79077xde699c26(), false, false);
            int m79870x9b948425 = c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2();
            if (m79870x9b948425 > 0) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).I0(m79870x9b948425);
            }
        } else if (ordinal == 1) {
            c21897x17252689.c(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), c21897x17252689.m79874x2d2219a2() + 1, c21897x17252689.m79872xcc101dd9().m75888x1c4fb41d() - ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).r0(), false, false);
        } else if (ordinal == 3) {
            dVar.N(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[onViewUpdate] result:%s", qVar.m133238x9616526c());
        java.lang.String x17 = dVar.x();
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        c21897x17252689.m79088x648e109b(i17 - F2 <= size);
        c21897x17252689.m79085xcc8bf2ed(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        he5.h hVar;
        int h17 = c01.d9.b().j().h(this.f388575c, this.f388629i);
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            hVar = new he5.h(this.f388575c, this.f388629i, this.f388576d + 48, h17);
        } else if (ordinal != 2) {
            hVar = ordinal != 3 ? null : new he5.h(this.f388575c, this.f388629i, 48, h17);
        } else {
            int i17 = h17 - this.f388630j;
            java.lang.String str = this.f388575c;
            long j17 = this.f388629i;
            int i18 = this.f388576d;
            if (i17 <= 0) {
                i17 = 0;
            }
            hVar = new he5.h(str, j17, i18 + i17, h17);
        }
        this.f388630j = h17;
        return hVar;
    }
}
