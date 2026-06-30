package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class PermissionWarningDialog extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f72367g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f72368e = new com.tencent.mm.permission.c(this);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f72369f = null;

    public final boolean O6() {
        if (getIntent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PermissionWarningDialog", "Intent is null");
            return false;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PermissionWarningDialog", "invalid params");
            return false;
        }
        int i17 = extras.getInt("warning_type", 0);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f72368e;
        if (1 == i17) {
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = extras.getString("warning_title");
            aVar.f211729s = extras.getString("warning_content");
            aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f490455vj);
            aVar.E = new com.tencent.mm.permission.d(this);
            aVar.G = onCancelListener;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            this.f72369f = j0Var;
            j0Var.setCanceledOnTouchOutside(false);
            this.f72369f.show();
        } else if (2 == i17) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
            e4Var.f211776c = getString(com.tencent.mm.R.string.n3q);
            e4Var.f211782i = new com.tencent.mm.permission.e(this);
            e4Var.f211781h = onCancelListener;
            e4Var.c();
        } else {
            if (3 != i17) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
            u1Var.a(false);
            u1Var.g(getString(com.tencent.mm.R.string.f490476w5));
            u1Var.j(getString(com.tencent.mm.R.string.f490457vl));
            u1Var.n(getString(com.tencent.mm.R.string.f490477w6));
            u1Var.b(new com.tencent.mm.permission.f(this));
            u1Var.q(false);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (O6()) {
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f72369f;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f72369f = null;
        }
        if (O6()) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.m9.a(false, null);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        db5.m9.a(true, null);
    }
}
