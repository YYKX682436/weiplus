package qe5;

/* loaded from: classes12.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f443630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qe5.m0 m0Var, int i17, int i18, java.lang.String str) {
        super(0);
        this.f443630d = m0Var;
        this.f443631e = i17;
        this.f443632f = i18;
        this.f443633g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qe5.m0 m0Var = this.f443630d;
        java.lang.Long X6 = m0Var.X6();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y6 = m0Var.Y6();
        if (X6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "msgId is null");
        } else {
            int i17 = this.f443632f;
            if (i17 != 0 && z65.c.a()) {
                dp.a.m125854x26a183b(m0Var.m158354x19263085(), "errCode[" + i17 + ']', 0).show();
            }
            if ((i17 == -5103087 || i17 == -5103059 || i17 == -5103017) && Y6 != null) {
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y6, m0Var.U6(), 4, true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y6.m124847x74d37ac6(), Y6, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "msgId:%s fail, errCode:%s", X6, java.lang.Integer.valueOf(i17));
            }
            if (i17 == -5103059) {
                j75.f Q6 = m0Var.Q6();
                if (Q6 != null) {
                    Q6.B3(new kd5.b());
                }
            } else {
                m0Var.c7(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "dealFailMsg msgId:%s fail, errCode:%s, errMsg:%s, errType:%s", X6, java.lang.Integer.valueOf(i17), this.f443633g, java.lang.Integer.valueOf(this.f443631e));
            }
        }
        return jz5.f0.f384359a;
    }
}
