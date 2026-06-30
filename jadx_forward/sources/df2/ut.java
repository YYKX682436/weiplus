package df2;

/* loaded from: classes3.dex */
public final class ut extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f313087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f313088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.e32 f313089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(df2.wt wtVar, r45.h32 h32Var, r45.e32 e32Var) {
        super(0);
        this.f313087d = wtVar;
        this.f313088e = h32Var;
        this.f313089f = e32Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.wt wtVar = this.f313087d;
        if (currentTimeMillis - wtVar.f313243p < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", "showBubble: can not double click");
        } else {
            wtVar.f313243p = java.lang.System.currentTimeMillis();
            r45.h32 h32Var = this.f313088e;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            wtVar.o7(2, m75945x2fec8307);
            if (h32Var.m75939xb282bd08(1) != 0) {
                df2.wt.m7(wtVar, h32Var, 1);
            } else {
                df2.wt.m7(wtVar, h32Var, 2);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = wtVar.f313245r;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = wtVar.f313246s;
            if (r2Var2 != null && r2Var2.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", "checkDismissAfterReserve: is delaying");
            } else {
                java.lang.Number valueOf = java.lang.Integer.valueOf(this.f313089f.m75939xb282bd08(3));
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    valueOf = 5000L;
                }
                wtVar.f313246s = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(wtVar, null, null, new df2.qt(valueOf.longValue(), wtVar, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
