package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "k13/h", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI */
/* loaded from: classes5.dex */
public final class ActivityC15560xcaaa67b0 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: f, reason: collision with root package name */
    public static k13.h f218862f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f218863g;

    /* renamed from: e, reason: collision with root package name */
    public final int f218864e = 1234;

    public final void O6() {
        android.os.Bundle extras;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 1, 2, false);
        z2Var.q(extras.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573688ff4)));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gcm);
        if (textView != null) {
            textView.setText(extras.getString("warning_content"));
        }
        z2Var.j(inflate);
        java.lang.String string = getString(fp.h.c(23) ? com.p314xaae8f345.mm.R.C30867xcad56011.feo : com.p314xaae8f345.mm.R.C30867xcad56011.fez);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        z2Var.m(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fem), string);
        z2Var.o(0);
        k13.i iVar = new k13.i(this);
        k13.j jVar = new k13.j(this);
        z2Var.D = iVar;
        z2Var.E = jVar;
        f218863g = z2Var;
        z2Var.C();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        k13.h hVar = f218862f;
        if (hVar == null) {
            finish();
            return;
        }
        if (i17 == this.f218864e) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                k13.h hVar2 = f218862f;
                if (hVar2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission granted");
                    finish();
                    ((m13.a) hVar2).f404393a.a(true);
                }
            } else {
                k13.h hVar3 = f218862f;
                if (hVar3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission refused");
                    finish();
                    ((m13.a) hVar3).f404393a.a(false);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission refused");
            finish();
            ((m13.a) hVar).f404393a.a(false);
        }
        f218862f = null;
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        O6();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = f218863g;
        if (z2Var != null) {
            if (z2Var != null) {
                z2Var.B();
            }
            f218863g = null;
        }
        O6();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.m9.a(false, null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        db5.m9.a(true, null);
    }
}
