package on2;

/* loaded from: classes3.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f428603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(km2.z zVar, on2.z2 z2Var) {
        super(0);
        this.f428603d = zVar;
        this.f428604e = z2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 cz1Var4;
        km2.z zVar = this.f428603d;
        java.lang.String m75945x2fec8307 = (zVar == null || (cz1Var4 = zVar.f390765d) == null) ? null : cz1Var4.m75945x2fec8307(0);
        int m75939xb282bd08 = (zVar == null || (cz1Var3 = zVar.f390765d) == null) ? 0 : cz1Var3.m75939xb282bd08(7);
        on2.z2 z2Var = this.f428604e;
        km2.z zVar2 = z2Var.f428625m;
        java.lang.String m75945x2fec83072 = (zVar2 == null || (cz1Var2 = zVar2.f390765d) == null) ? null : cz1Var2.m75945x2fec8307(0);
        km2.z zVar3 = z2Var.f428625m;
        int m75939xb282bd082 = (zVar3 == null || (cz1Var = zVar3.f390765d) == null) ? 0 : cz1Var.m75939xb282bd08(7);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83072, m75945x2fec8307)) {
            km2.z zVar4 = z2Var.f428625m;
            if (zVar4 != null) {
                zVar4.f390765d = zVar.f390765d;
            }
            if (zVar4 != null) {
                zVar4.f390766e = zVar.f390766e;
            }
            if (m75939xb282bd08 < m75939xb282bd082) {
                r45.cz1 cz1Var5 = zVar4 != null ? zVar4.f390765d : null;
                if (cz1Var5 != null) {
                    cz1Var5.set(7, java.lang.Integer.valueOf(m75939xb282bd082));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "updateLocalLotteryInfo:" + z2Var.f428625m + ",remoteParticipateCount:" + m75939xb282bd08 + ",curParticipateCount:" + m75939xb282bd082);
        return jz5.f0.f384359a;
    }
}
