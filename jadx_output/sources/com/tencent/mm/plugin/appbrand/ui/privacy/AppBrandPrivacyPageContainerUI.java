package com.tencent.mm.plugin.appbrand.ui.privacy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyPageContainerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AppBrandPrivacyPageContainerUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.content.Intent r5 = r4.getIntent()
            if (r5 == 0) goto L6d
            java.lang.String r0 = "MMFragment_ClassName"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMMFragment, className: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.Privacy.MMFragmentExt"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            if (r5 != 0) goto L26
            goto L47
        L26:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L35
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L35
            boolean r2 = r5 instanceof com.tencent.mm.ui.MMFragment     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L47
            com.tencent.mm.ui.MMFragment r5 = (com.tencent.mm.ui.MMFragment) r5     // Catch: java.lang.Exception -> L35
            goto L48
        L35:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getMMFragment, newInstance fail since "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.mars.xlog.Log.w(r1, r5)
        L47:
            r5 = r0
        L48:
            if (r5 != 0) goto L4b
            goto L6d
        L4b:
            androidx.fragment.app.FragmentManager r1 = r4.getSupportFragmentManager()
            androidx.fragment.app.i2 r1 = r1.beginTransaction()
            android.content.Intent r2 = r4.getIntent()
            if (r2 == 0) goto L5e
            android.os.Bundle r2 = r2.getExtras()
            goto L5f
        L5e:
            r2 = r0
        L5f:
            r5.setArguments(r2)
            r2 = 1
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            r1.h(r3, r5, r0, r2)
            r1.d()
            return
        L6d:
            java.lang.String r5 = "MicroMsg.AppBrandPrivacyPageContainerUI"
            java.lang.String r0 = "onCreate, fragment is null"
            com.tencent.mars.xlog.Log.w(r5, r0)
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI.onCreate(android.os.Bundle):void");
    }
}
