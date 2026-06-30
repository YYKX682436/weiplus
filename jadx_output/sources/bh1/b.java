package bh1;

/* loaded from: classes.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String qrcodePath) {
        kotlin.jvm.internal.o.g(qrcodePath, "qrcodePath");
        android.content.Intent putExtra = new android.content.Intent(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI.class).addFlags(268435456).putExtra("KEY_QRCODE_PATH", qrcodePath);
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
