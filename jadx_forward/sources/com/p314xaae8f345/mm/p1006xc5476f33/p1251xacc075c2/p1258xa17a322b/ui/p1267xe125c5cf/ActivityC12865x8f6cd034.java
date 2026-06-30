package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI */
/* loaded from: classes5.dex */
public final class ActivityC12865x8f6cd034 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174316d = "MicroMsg.PermissionRequestUI";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object obj;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 296 && i18 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(data);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174316d, "Selected uri = " + data);
                jz5.l e17 = to1.g.f502444a.e(data);
                if (e17 != null) {
                    java.lang.String str = (java.lang.String) e17.f384366d;
                    java.lang.String str2 = (java.lang.String) e17.f384367e;
                    java.util.Iterator it = ro1.v.f479547a.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) obj).f438833f, str)) {
                                break;
                            }
                        }
                    }
                    po1.d dVar = (po1.d) obj;
                    if (dVar != null) {
                        dVar.d(ro1.v.f479547a.d(str2, new to1.d(data)));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174316d, "try to save new device async, device=" + dVar + '.');
                        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        ((ku5.t0) ku5.t0.f394148d).q(new yo1.k(data, dVar, this, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, string, false, 3, null)));
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f174316d, "Fail to parse uuid and path from uri, uri=" + data);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                u1Var.u(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxs));
                u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.myh));
                u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h));
                u1Var.l(new yo1.g(this));
                u1Var.q(false);
                return;
            }
        }
        java.lang.String str3 = this.f174316d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestCode=");
        sb6.append(i17);
        sb6.append(" resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new yo1.h(this));
        mo54450xbf7c1df6("");
        int color = getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo64405x4dab7448(color);
        mo78578x8b18f126(color);
        boolean z17 = false;
        setResult(0);
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        po1.d dVar = null;
        if (stringExtra != null) {
            po1.d b17 = po1.d.f438827i.b(stringExtra);
            java.lang.String str = this.f174316d;
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Fail to parse deviceInfo from str = ".concat(stringExtra));
            } else {
                if (b17.f438829b != po1.g.f438843h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Device type error, type = " + b17.f438829b);
                    finish();
                    return;
                }
                if (ro1.v.f479547a.f(b17)) {
                    z17 = true;
                } else {
                    oo1.j jVar = oo1.j.f428678a;
                }
                if (!z17) {
                    throw new java.lang.IllegalArgumentException((b17 + " is not a new device. Use PermissionRegainUI for reauthorizing.").toString());
                }
                dVar = b17;
            }
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.rzu)).setOnClickListener(new yo1.i(this, dVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        android.view.View view;
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
        java.lang.ref.WeakReference weakReference = wo1.l1.f529520b;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).removeView(view);
        wo1.l1.f529520b = null;
    }
}
