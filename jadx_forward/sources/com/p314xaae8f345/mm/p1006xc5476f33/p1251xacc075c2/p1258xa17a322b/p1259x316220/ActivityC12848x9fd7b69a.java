package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/impl/RoamBackupActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "ho1/g0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity */
/* loaded from: classes5.dex */
public final class ActivityC12848x9fd7b69a extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.WeakReference f174155v;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f174156u = "MM.Mig.RoamBackupActivity";

    static {
        new ho1.g0(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174156u, "RoamBackupActivity onCreate");
        f174155v = new java.lang.ref.WeakReference(this);
        android.os.Looper.getMainLooper().isCurrentThread();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.GlobalHolder", "[onActivityCreate] preCount=" + ho1.c.f364166b + " instance=" + this);
        ho1.c.f364166b = ho1.c.f364166b + 1;
        if (ho1.c.f364167c) {
            getWindow().addFlags(128);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        f174155v = null;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174156u, "RoamBackupActivity onDestroy");
        final ho1.c cVar = ho1.c.f364165a;
        android.os.Looper.getMainLooper().isCurrentThread();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.GlobalHolder", "[onActivityDestroy] preCount=" + ho1.c.f364166b + ", instance=" + this);
        ho1.c.f364166b = ho1.c.f364166b + (-1);
        if (ho1.c.f364166b == 0) {
            ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: ho1.b
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (ho1.c.this) {
                        if (ho1.c.f364166b != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.GlobalHolder", "tryDetachFlutter failed for activityCount=" + ho1.c.f364166b);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class));
                            p1Var.getClass();
                            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y0(p1Var, null), 3, null);
                        }
                    }
                }
            }, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174156u, "RoamBackupActivity onResume");
    }
}
