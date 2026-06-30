package com.tencent.mm.plugin.backup.roambackup.ui.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PermissionRegainUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92781d = "MicroMsg.PermissionRegainUI";

    /* renamed from: e, reason: collision with root package name */
    public po1.d f92782e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 296 && i18 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                kotlin.jvm.internal.o.d(data);
                com.tencent.mars.xlog.Log.i(this.f92781d, "Selected uri = " + data);
                jz5.l e17 = to1.g.f420911a.e(data);
                if (e17 == null) {
                    com.tencent.mars.xlog.Log.e(this.f92781d, "Fail to parse uuid and path from uri, uri=" + data);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = getString(com.tencent.mm.R.string.mxs);
                    e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                    e4Var.c();
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f302833d;
                java.lang.String str2 = (java.lang.String) e17.f302834e;
                po1.d dVar = this.f92782e;
                if (dVar == null) {
                    kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                    throw null;
                }
                po1.d a17 = po1.d.a(dVar, null, null, null, null, null, null, null, 127, null);
                kotlin.jvm.internal.o.g(str, "<set-?>");
                a17.f357300f = str;
                a17.d(str2);
                java.lang.String uri = data.toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                a17.f357301g = uri;
                com.tencent.mars.xlog.Log.i(this.f92781d, "try to save old device async. targetDevice=" + a17 + ", uri=" + data);
                java.lang.String string = getString(com.tencent.mm.R.string.mvy);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                ((ku5.t0) ku5.t0.f312615d).q(new yo1.f(data, a17, this, com.tencent.mm.ui.widget.dialog.u3.f(this, string, false, 3, null)));
                return;
            }
        }
        java.lang.String str3 = this.f92781d;
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
        setResult(0);
        setBackBtn(new yo1.c(this));
        java.lang.String stringExtra = getIntent().getStringExtra("actitity_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        setMMTitle(stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("deviceInfo");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f92781d;
        if (z17) {
            com.tencent.mars.xlog.Log.e(str2, "deviceId is empty");
            finish();
            return;
        }
        po1.d b17 = po1.d.f357294i.b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e(str2, "Fail to parse deviceInfo from str = ".concat(str));
            finish();
            return;
        }
        this.f92782e = b17;
        if (b17 == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        if (b17.f357296b != po1.g.f357310h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Device type error, type = ");
            po1.d dVar = this.f92782e;
            if (dVar == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                throw null;
            }
            sb6.append(dVar.f357296b);
            com.tencent.mars.xlog.Log.e(str2, sb6.toString());
            finish();
            return;
        }
        ro1.v vVar = ro1.v.f398014a;
        if (b17 == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        if (vVar.f(b17)) {
            com.tencent.mars.xlog.Log.e(str2, "New device need bind before reauthorization.");
            finish();
            return;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.rgi)).setText(com.tencent.mm.R.string.mvk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rgg);
        textView.setVisibility(0);
        po1.d dVar2 = this.f92782e;
        if (dVar2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        textView.setText(dVar2.f357299e);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.rgf);
        button.setText(com.tencent.mm.R.string.mvl);
        button.setOnClickListener(new yo1.d(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ro1.v vVar = ro1.v.f398014a;
        po1.d dVar = this.f92782e;
        if (dVar == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        po1.d e17 = vVar.e(dVar.f357295a);
        if (e17 == null && (e17 = this.f92782e) == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        this.f92782e = e17;
        if (to1.g.f420911a.a(this, e17)) {
            finish();
        }
    }
}
