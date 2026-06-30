package bh1;

/* loaded from: classes.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String qrcodePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrcodePath, "qrcodePath");
        android.content.Intent putExtra = new android.content.Intent(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1150x37bf4c.ActivityC12406x137ca985.class).addFlags(268435456).putExtra("KEY_QRCODE_PATH", qrcodePath);
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
