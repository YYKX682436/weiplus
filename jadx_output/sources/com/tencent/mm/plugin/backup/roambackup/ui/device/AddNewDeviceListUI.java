package com.tencent.mm.plugin.backup.roambackup.ui.device;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AddNewDeviceListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final int f92762d = 16;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f92763e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f92764f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f92765g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f92766h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxd;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("deviceId");
        if (!(stringExtra == null || stringExtra.length() == 0) && i17 == this.f92762d) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new xo1.a(this));
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        hideActionbarLine();
        setBounceEnabled(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92959y);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 6L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mhj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92763e = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.oxg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92764f = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mhk);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92765g = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.mhi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92766h = (android.widget.LinearLayout) findViewById4;
        android.widget.LinearLayout linearLayout = this.f92763e;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("computerLl");
            throw null;
        }
        linearLayout.setOnClickListener(new xo1.b(this));
        android.widget.LinearLayout linearLayout2 = this.f92764f;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("usbDeviceLl");
            throw null;
        }
        linearLayout2.setOnClickListener(new xo1.c(this));
        android.widget.LinearLayout linearLayout3 = this.f92765g;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("netLocationLl");
            throw null;
        }
        linearLayout3.setOnClickListener(xo1.d.f455748d);
        android.widget.LinearLayout linearLayout4 = this.f92766h;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(xo1.e.f455749d);
        } else {
            kotlin.jvm.internal.o.o("cloudLl");
            throw null;
        }
    }
}
