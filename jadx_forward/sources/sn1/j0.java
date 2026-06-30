package sn1;

/* loaded from: classes12.dex */
public class j0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f491568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f491569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f491570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.k0 f491571g;

    public j0(sn1.k0 k0Var, java.lang.Long l17, int i17, java.lang.Long l18) {
        this.f491571g = k0Var;
        this.f491568d = l17;
        this.f491569e = i17;
        this.f491570f = l18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        sn1.k0 k0Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        java.lang.Long l17 = this.f491568d;
        long longValue = l17.longValue();
        long longValue2 = valueOf.longValue();
        long j17 = 0;
        while (true) {
            long j18 = longValue2 + 86400000;
            k0Var = this.f491571g;
            if (longValue > j18) {
                break;
            }
            j17 += k0Var.a(longValue);
            longValue += 86400000;
        }
        k0Var.getClass();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f491569e);
        java.lang.Long l18 = this.f491570f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupLogManager", "backupAfterLogTimeHandler, backupMode[%d], endAfterLogTime[%d], startAfterLogTime[%d], endAfterLogSize[%d], startAfterLogSize[%d]", valueOf3, valueOf, l17, valueOf2, l18);
        if (valueOf2.longValue() == 0 || valueOf2.longValue() <= l18.longValue()) {
            return false;
        }
        this.f491571g.b(this.f491569e, valueOf.longValue() - l17.longValue(), valueOf2.longValue() - l18.longValue(), true);
        return false;
    }
}
