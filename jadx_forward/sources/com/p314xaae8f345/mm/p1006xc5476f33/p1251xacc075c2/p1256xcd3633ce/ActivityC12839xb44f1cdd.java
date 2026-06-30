package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/migration/MigrationActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lyn1/m;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.migration.MigrationActivity */
/* loaded from: classes11.dex */
public final class ActivityC12839xb44f1cdd extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 implements yn1.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f174074x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f174075u = "MM.Mig.MigrationActivity";

    /* renamed from: v, reason: collision with root package name */
    public boolean f174076v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.bj0 f174077w;

    @Override // yn1.m
    public void E2() {
        bw5.bj0 i17 = yn1.z0.f545466a.i();
        boolean z17 = this.f174076v;
        java.lang.String str = this.f174075u;
        if (!z17 && a7(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Keep screen on, status=" + i17);
            this.f174076v = true;
            getWindow().addFlags(128);
        } else if (this.f174076v && !a7(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Turn off keep screen on, status=" + i17);
            this.f174076v = false;
            getWindow().clearFlags(128);
        }
        bw5.bj0 bj0Var = this.f174077w;
        if (bj0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastStatus");
            throw null;
        }
        if (bj0Var != i17 && i17 == bw5.bj0.NOTIFY_CODE_START) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new yn1.w(this, null), 2, null);
        }
        this.f174077w = i17;
    }

    public final boolean a7(bw5.bj0 bj0Var) {
        if (yn1.k4.c(bj0Var)) {
            return true;
        }
        return bj0Var == bw5.bj0.NOTIFY_CODE_UI_SHOW_QRCODE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        yn1.z0 z0Var = yn1.z0.f545466a;
        boolean n17 = z0Var.n();
        java.lang.String str = this.f174075u;
        if (!n17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Migration is not initialized");
            finish();
            return;
        }
        bw5.bj0 i17 = z0Var.i();
        this.f174077w = i17;
        if (!this.f174076v && a7(i17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Keep screen on, status=");
            bw5.bj0 bj0Var = this.f174077w;
            if (bj0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastStatus");
                throw null;
            }
            sb6.append(bj0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            this.f174076v = true;
            getWindow().addFlags(128);
        }
        S5(false);
        ((bt.a) ((com.p314xaae8f345.mm.app.o2) i95.n0.c(com.p314xaae8f345.mm.app.o2.class))).Ai();
        z0Var.q(this);
        android.os.Looper.getMainLooper().isCurrentThread();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[onActivityCreate] preCount=" + yn1.z0.f545469d + " instance=" + this);
        int i18 = yn1.z0.f545469d + 1;
        yn1.z0.f545469d = i18;
        if (i18 > 0) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) yn1.z0.f545483r).e(java.lang.Boolean.TRUE);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yn1.z0 z0Var = yn1.z0.f545466a;
        android.os.Looper.getMainLooper().isCurrentThread();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[onActivityDestroy] preCount=" + yn1.z0.f545469d + ", instance=" + this);
        int i17 = yn1.z0.f545469d + (-1);
        yn1.z0.f545469d = i17;
        if (i17 == 0) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) yn1.z0.f545483r).e(java.lang.Boolean.FALSE);
            z0Var.a();
        }
        if (yn1.z0.f545469d < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationGlobalHolder", "[onActivityDestroy] !!! Fix activityCount < 0");
            yn1.z0.f545469d = 0;
        }
        z0Var.u(this);
        ((bt.a) ((com.p314xaae8f345.mm.app.o2) i95.n0.c(com.p314xaae8f345.mm.app.o2.class))).wi();
    }
}
