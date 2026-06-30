package com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf;

/* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog */
/* loaded from: classes14.dex */
public class ActivityC19629x1cf9c994 extends com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 {

    /* renamed from: g, reason: collision with root package name */
    public static j35.f0 f271058g;

    /* renamed from: h, reason: collision with root package name */
    public static qp1.l0 f271059h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f271060i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f271061e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271062f = false;

    public static void O6(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        java.util.Iterator it = f271060i.iterator();
        while (it.hasNext()) {
            ((j35.a) it.next()).a(abstractActivityC19626xce283566);
        }
    }

    public static void Q6(android.content.Context context, int i17, java.lang.String str, j35.a aVar, qp1.l0 l0Var, boolean z17, boolean z18, java.lang.String str2) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return;
        }
        f271058g = new j35.f0(aVar);
        f271059h = l0Var;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.class);
        intent.putExtra("warning_content", str);
        if (z17) {
            intent.addFlags(805306368);
        }
        bm5.e.a(context, intent, str, com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.class.getCanonicalName(), z18, str2, false);
    }

    public static void R6(android.content.Context context, int i17, java.lang.String str, j35.a aVar, boolean z17, boolean z18, java.lang.String str2) {
        Q6(context, i17, str, aVar, null, z17, z18, str2);
    }

    public static void S6(android.content.Context context, java.lang.String str, j35.a aVar, boolean z17, java.lang.String str2) {
        R6(context, -1, str, new j35.f0(new j35.f0(aVar)), z17, false, str2);
    }

    public final void P6() {
        if (getIntent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "Intent is null");
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "invalid params");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(this);
        i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.fb9);
        java.lang.String string = extras.getString("warning_content");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.f293262s = string;
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.fb6);
        aVar.F = new j35.c0(this);
        aVar.H = new j35.d0(this);
        i0Var.f(fp.h.c(23) ? com.p314xaae8f345.mm.R.C30867xcad56011.fb8 : com.p314xaae8f345.mm.R.C30867xcad56011.fb7);
        i0Var.f293354b.E = new j35.e0(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        this.f271061e = a17;
        a17.setCanceledOnTouchOutside(false);
        this.f271061e.show();
        qp1.l0 l0Var = f271059h;
        if (l0Var != null) {
            l0Var.a();
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        j35.f0 f0Var = f271058g;
        if (f0Var == null) {
            finish();
            return;
        }
        if (i17 == 1234) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                f271058g.a(this);
            } else {
                f271058g.c(this);
            }
        } else {
            f0Var.c(this);
        }
        f271058g.d();
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        P6();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5830xe1920e5c c5830xe1920e5c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5830xe1920e5c();
        c5830xe1920e5c.f136137g.getClass();
        hashCode();
        c5830xe1920e5c.e();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        j35.f0 f0Var = f271058g;
        if (f0Var != null && f0Var.f379039a != null) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback allow");
                f271058g.a(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback cancel");
                f271058g.b(this);
            }
            f271058g.d();
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5830xe1920e5c c5830xe1920e5c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5830xe1920e5c();
        c5830xe1920e5c.f136137g.getClass();
        hashCode();
        c5830xe1920e5c.e();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f271061e;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f271061e = null;
        }
        P6();
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
