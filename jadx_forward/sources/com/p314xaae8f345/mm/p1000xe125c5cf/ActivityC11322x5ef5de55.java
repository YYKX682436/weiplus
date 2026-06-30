package com.p314xaae8f345.mm.p1000xe125c5cf;

/* renamed from: com.tencent.mm.permission.PermissionWarningDialog */
/* loaded from: classes5.dex */
public class ActivityC11322x5ef5de55 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f153900g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f153901e = new com.p314xaae8f345.mm.p1000xe125c5cf.c(this);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f153902f = null;

    public final boolean O6() {
        if (getIntent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionWarningDialog", "Intent is null");
            return false;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionWarningDialog", "invalid params");
            return false;
        }
        int i17 = extras.getInt("warning_type", 0);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f153901e;
        if (1 == i17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = extras.getString("warning_title");
            aVar.f293262s = extras.getString("warning_content");
            aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
            aVar.E = new com.p314xaae8f345.mm.p1000xe125c5cf.d(this);
            aVar.G = onCancelListener;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            this.f153902f = j0Var;
            j0Var.setCanceledOnTouchOutside(false);
            this.f153902f.show();
        } else if (2 == i17) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
            e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3q);
            e4Var.f293315i = new com.p314xaae8f345.mm.p1000xe125c5cf.e(this);
            e4Var.f293314h = onCancelListener;
            e4Var.c();
        } else {
            if (3 != i17) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
            u1Var.a(false);
            u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572009w5));
            u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571990vl));
            u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572010w6));
            u1Var.b(new com.p314xaae8f345.mm.p1000xe125c5cf.f(this));
            u1Var.q(false);
        }
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (O6()) {
            return;
        }
        finish();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f153902f;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f153902f = null;
        }
        if (O6()) {
            return;
        }
        finish();
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
