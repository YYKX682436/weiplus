package be1;

/* loaded from: classes.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.l0 f101016d = new be1.l0();

    public l0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("android.settings.BLUETOOTH_SETTINGS");
        boolean z17 = true;
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiOpenSystemSetting$Companion$openActions$2$2", "invoke", "(Landroid/content/Context;)Ljava/lang/Boolean;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiOpenSystemSetting$Companion$openActions$2$2", "invoke", "(Landroid/content/Context;)Ljava/lang/Boolean;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiOpenSystemSetting", e17, "", new java.lang.Object[0]);
                z17 = false;
            }
            z18 = z17;
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
