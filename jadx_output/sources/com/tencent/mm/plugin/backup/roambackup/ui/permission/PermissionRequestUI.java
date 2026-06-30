package com.tencent.mm.plugin.backup.roambackup.ui.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PermissionRequestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92783d = "MicroMsg.PermissionRequestUI";

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxl;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object obj;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 296 && i18 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                kotlin.jvm.internal.o.d(data);
                com.tencent.mars.xlog.Log.i(this.f92783d, "Selected uri = " + data);
                jz5.l e17 = to1.g.f420911a.e(data);
                if (e17 != null) {
                    java.lang.String str = (java.lang.String) e17.f302833d;
                    java.lang.String str2 = (java.lang.String) e17.f302834e;
                    java.util.Iterator it = ro1.v.f398014a.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((po1.d) obj).f357300f, str)) {
                                break;
                            }
                        }
                    }
                    po1.d dVar = (po1.d) obj;
                    if (dVar != null) {
                        dVar.d(ro1.v.f398014a.d(str2, new to1.d(data)));
                        com.tencent.mars.xlog.Log.i(this.f92783d, "try to save new device async, device=" + dVar + '.');
                        java.lang.String string = getString(com.tencent.mm.R.string.mvy);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        ((ku5.t0) ku5.t0.f312615d).q(new yo1.k(data, dVar, this, com.tencent.mm.ui.widget.dialog.u3.f(this, string, false, 3, null)));
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e(this.f92783d, "Fail to parse uuid and path from uri, uri=" + data);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                u1Var.u(getString(com.tencent.mm.R.string.mxs));
                u1Var.g(getString(com.tencent.mm.R.string.myh));
                u1Var.n(getString(com.tencent.mm.R.string.f489708h));
                u1Var.l(new yo1.g(this));
                u1Var.q(false);
                return;
            }
        }
        java.lang.String str3 = this.f92783d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestCode=");
        sb6.append(i17);
        sb6.append(" resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.w(str3, sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new yo1.h(this));
        setMMTitle("");
        int color = getColor(com.tencent.mm.R.color.f478491c);
        setActionbarColor(color);
        setNavigationbarColor(color);
        boolean z17 = false;
        setResult(0);
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        po1.d dVar = null;
        if (stringExtra != null) {
            po1.d b17 = po1.d.f357294i.b(stringExtra);
            java.lang.String str = this.f92783d;
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e(str, "Fail to parse deviceInfo from str = ".concat(stringExtra));
            } else {
                if (b17.f357296b != po1.g.f357310h) {
                    com.tencent.mars.xlog.Log.i(str, "Device type error, type = " + b17.f357296b);
                    finish();
                    return;
                }
                if (ro1.v.f398014a.f(b17)) {
                    z17 = true;
                } else {
                    oo1.j jVar = oo1.j.f347145a;
                }
                if (!z17) {
                    throw new java.lang.IllegalArgumentException((b17 + " is not a new device. Use PermissionRegainUI for reauthorizing.").toString());
                }
                dVar = b17;
            }
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.rzu)).setOnClickListener(new yo1.i(this, dVar));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.view.View view;
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
        java.lang.ref.WeakReference weakReference = wo1.l1.f447987b;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).removeView(view);
        wo1.l1.f447987b = null;
    }
}
