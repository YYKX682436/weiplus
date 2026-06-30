package com.tencent.mm.plugin.backup.roambackup.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/impl/RoamBackupActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "ho1/g0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoamBackupActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.WeakReference f92622v;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f92623u = "MM.Mig.RoamBackupActivity";

    static {
        new ho1.g0(null);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i(this.f92623u, "RoamBackupActivity onCreate");
        f92622v = new java.lang.ref.WeakReference(this);
        android.os.Looper.getMainLooper().isCurrentThread();
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.GlobalHolder", "[onActivityCreate] preCount=" + ho1.c.f282633b + " instance=" + this);
        ho1.c.f282633b = ho1.c.f282633b + 1;
        if (ho1.c.f282634c) {
            getWindow().addFlags(128);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        f92622v = null;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f92623u, "RoamBackupActivity onDestroy");
        final ho1.c cVar = ho1.c.f282632a;
        android.os.Looper.getMainLooper().isCurrentThread();
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.GlobalHolder", "[onActivityDestroy] preCount=" + ho1.c.f282633b + ", instance=" + this);
        ho1.c.f282633b = ho1.c.f282633b + (-1);
        if (ho1.c.f282633b == 0) {
            ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: ho1.b
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (ho1.c.this) {
                        if (ho1.c.f282633b != 0) {
                            com.tencent.mars.xlog.Log.i("MM.RoamBackup.GlobalHolder", "tryDetachFlutter failed for activityCount=" + ho1.c.f282633b);
                        } else {
                            com.tencent.mm.plugin.backup.roambackup.p1 p1Var = (com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class));
                            p1Var.getClass();
                            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.backup.roambackup.y0(p1Var, null), 3, null);
                        }
                    }
                }
            }, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f92623u, "RoamBackupActivity onResume");
    }
}
