package com.tencent.mm.plugin.backup.mmaoa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/mmaoa/UsbAttachIntentUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class UsbAttachIntentUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92550d = "MicroMsg.UsbAttachIntentUI";

    public static final void O6(com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI usbAttachIntentUI, boolean z17) {
        usbAttachIntentUI.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        java.lang.String string = context.getString(z17 ? com.tencent.mm.R.string.n7p : com.tencent.mm.R.string.n7o);
        kotlin.jvm.internal.o.d(string);
        u1Var.g(string);
        u1Var.m(com.tencent.mm.R.string.f490455vj);
        u1Var.q(false);
    }

    public final void P6(android.content.Intent intent) {
        if (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
            ((ku5.t0) ku5.t0.f312615d).q(new zn1.t(intent, this));
        } else {
            com.tencent.mars.xlog.Log.w(this.f92550d, "Aoa is not enabled, skip processing");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(getString(com.tencent.mm.R.string.n7n));
            u1Var.m(com.tencent.mm.R.string.f490455vj);
            u1Var.q(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.CTRL_INDEX);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        P6(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            P6(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }
}
