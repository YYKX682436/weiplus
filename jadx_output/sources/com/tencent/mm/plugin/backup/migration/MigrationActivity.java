package com.tencent.mm.plugin.backup.migration;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/migration/MigrationActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lyn1/m;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MigrationActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity implements yn1.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f92541x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f92542u = "MM.Mig.MigrationActivity";

    /* renamed from: v, reason: collision with root package name */
    public boolean f92543v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.bj0 f92544w;

    @Override // yn1.m
    public void E2() {
        bw5.bj0 i17 = yn1.z0.f463933a.i();
        boolean z17 = this.f92543v;
        java.lang.String str = this.f92542u;
        if (!z17 && a7(i17)) {
            com.tencent.mars.xlog.Log.i(str, "Keep screen on, status=" + i17);
            this.f92543v = true;
            getWindow().addFlags(128);
        } else if (this.f92543v && !a7(i17)) {
            com.tencent.mars.xlog.Log.i(str, "Turn off keep screen on, status=" + i17);
            this.f92543v = false;
            getWindow().clearFlags(128);
        }
        bw5.bj0 bj0Var = this.f92544w;
        if (bj0Var == null) {
            kotlin.jvm.internal.o.o("lastStatus");
            throw null;
        }
        if (bj0Var != i17 && i17 == bw5.bj0.NOTIFY_CODE_START) {
            kotlinx.coroutines.l.d(v65.m.b(this), kotlinx.coroutines.q1.f310568a, null, new yn1.w(this, null), 2, null);
        }
        this.f92544w = i17;
    }

    public final boolean a7(bw5.bj0 bj0Var) {
        if (yn1.k4.c(bj0Var)) {
            return true;
        }
        return bj0Var == bw5.bj0.NOTIFY_CODE_UI_SHOW_QRCODE;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        yn1.z0 z0Var = yn1.z0.f463933a;
        boolean n17 = z0Var.n();
        java.lang.String str = this.f92542u;
        if (!n17) {
            com.tencent.mars.xlog.Log.e(str, "Migration is not initialized");
            finish();
            return;
        }
        bw5.bj0 i17 = z0Var.i();
        this.f92544w = i17;
        if (!this.f92543v && a7(i17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Keep screen on, status=");
            bw5.bj0 bj0Var = this.f92544w;
            if (bj0Var == null) {
                kotlin.jvm.internal.o.o("lastStatus");
                throw null;
            }
            sb6.append(bj0Var);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            this.f92543v = true;
            getWindow().addFlags(128);
        }
        S5(false);
        ((bt.a) ((com.tencent.mm.app.o2) i95.n0.c(com.tencent.mm.app.o2.class))).Ai();
        z0Var.q(this);
        android.os.Looper.getMainLooper().isCurrentThread();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[onActivityCreate] preCount=" + yn1.z0.f463936d + " instance=" + this);
        int i18 = yn1.z0.f463936d + 1;
        yn1.z0.f463936d = i18;
        if (i18 > 0) {
            ((kotlinx.coroutines.flow.q2) yn1.z0.f463950r).e(java.lang.Boolean.TRUE);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yn1.z0 z0Var = yn1.z0.f463933a;
        android.os.Looper.getMainLooper().isCurrentThread();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[onActivityDestroy] preCount=" + yn1.z0.f463936d + ", instance=" + this);
        int i17 = yn1.z0.f463936d + (-1);
        yn1.z0.f463936d = i17;
        if (i17 == 0) {
            ((kotlinx.coroutines.flow.q2) yn1.z0.f463950r).e(java.lang.Boolean.FALSE);
            z0Var.a();
        }
        if (yn1.z0.f463936d < 0) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationGlobalHolder", "[onActivityDestroy] !!! Fix activityCount < 0");
            yn1.z0.f463936d = 0;
        }
        z0Var.u(this);
        ((bt.a) ((com.tencent.mm.app.o2) i95.n0.c(com.tencent.mm.app.o2.class))).wi();
    }
}
