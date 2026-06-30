package aq1;

/* loaded from: classes9.dex */
public class e1 implements vo.b {
    public e1(aq1.l1 l1Var) {
    }

    @Override // vo.b
    public void a(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, objArr);
    }

    @Override // vo.b
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }
}
