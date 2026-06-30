package com.p314xaae8f345.mm.p2611x1bbd4e96.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sensitive/ui/PermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sensitive.ui.PermissionDialogUI */
/* loaded from: classes8.dex */
public final class ActivityC21020xdc947ceb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static yz5.l f274725d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        jz5.f0 f0Var2;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_PERMISSION");
        if (stringExtra != null) {
            try {
                d85.g0[] m123709xcee59d22 = d85.g0.m123709xcee59d22();
                int length = m123709xcee59d22.length;
                for (int i17 = 0; i17 < length; i17++) {
                    g0Var = m123709xcee59d22[i17];
                    if (r26.i0.p(g0Var.f308725d, stringExtra, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        g0Var = null;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_BUSINESS");
        if (stringExtra2 != null) {
            try {
                d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
                int length2 = m123703xcee59d22.length;
                for (int i18 = 0; i18 < length2; i18++) {
                    f0Var = m123703xcee59d22[i18];
                    if (r26.i0.p(f0Var.f308709d, stringExtra2, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused2) {
            }
        }
        f0Var = null;
        if (g0Var == null || f0Var == null) {
            f0Var2 = null;
        } else {
            j85.g.f379784a.c(g0Var, f0Var, null);
            k85.t.f386972a.i(this, g0Var, f0Var, new k85.a(this));
            f0Var2 = jz5.f0.f384359a;
        }
        if (f0Var2 == null) {
            f274725d = null;
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yz5.l lVar = f274725d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        f274725d = null;
    }
}
