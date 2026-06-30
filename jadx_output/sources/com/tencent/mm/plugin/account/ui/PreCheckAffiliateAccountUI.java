package com.tencent.mm.plugin.account.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/PreCheckAffiliateAccountUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class PreCheckAffiliateAccountUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f73544d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73545e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73546f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f73547g = java.lang.System.currentTimeMillis() + "";

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        switch (i17) {
            case 702:
                if (intent != null) {
                    android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                    kotlin.jvm.internal.o.d(bundleExtra);
                    java.util.Map map = (java.util.Map) bundleExtra.getSerializable("next_params");
                    if (map != null) {
                        this.f73546f = (java.lang.String) map.get("ticket");
                    }
                    if (this.f73546f != null) {
                        java.lang.String string = getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), u11.b.d("CN"), "reg", 1, 0);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        c71.b.c(this, string, 703, false);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, this.f73547g, wo.w0.k(), 0, 1, 1002, 0, null, java.lang.Integer.valueOf(this.f73544d));
                    } else {
                        setResult(0, intent);
                        finish();
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73545e;
                if (u3Var != null) {
                    u3Var.dismiss();
                    return;
                }
                return;
            case 703:
                if (intent != null) {
                    android.os.Bundle bundleExtra2 = intent.getBundleExtra("result_data");
                    if (bundleExtra2 == null || !kotlin.jvm.internal.o.b(bundleExtra2.getString("go_next", ""), "agree_privacy")) {
                        setResult(0, intent);
                        finish();
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI.class);
                        intent2.putExtra("RegTicket", this.f73546f);
                        intent2.putExtra("sessionID", this.f73547g);
                        intent2.putExtra("RegScene", this.f73544d);
                        startActivityForResult(intent2, 704);
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f73545e;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    return;
                }
                return;
            case 704:
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f73545e;
                if (u3Var3 != null) {
                    u3Var3.dismiss();
                }
                setResult(i18, intent);
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        this.f73545e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        this.f73544d = getIntent().getIntExtra("RegScene", 0);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5298;
        lVar.f70666c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        r45.tb5 tb5Var = new r45.tb5();
        tb5Var.f386275e = this.f73547g;
        fo3.s sVar = fo3.s.INSTANCE;
        byte[] h17 = sVar.h();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(h17);
        k57Var.f378396f = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.L9());
        k57Var.f378400m = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(k57Var.toByteArray());
        tb5Var.f386274d = cu5Var3;
        tb5Var.f386276f = this.f73544d;
        lVar.f70664a = tb5Var;
        lVar.f70665b = new r45.ub5();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.account.ui.he(this), false);
    }
}
