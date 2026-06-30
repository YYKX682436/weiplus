package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f78400a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(":appbrand0", com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI.class);
        hashMap.put(":appbrand1", com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI1.class);
        hashMap.put(":appbrand2", com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI2.class);
        hashMap.put(":appbrand3", com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI3.class);
        hashMap.put(":appbrand4", com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI4.class);
        f78400a = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2, final android.content.DialogInterface.OnClickListener onClickListener3) {
        int i17 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f78347p;
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        android.content.Intent putExtra = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class).putExtra("key_running_mode", 2).putExtra("key_result_receiver", com.tencent.mm.plugin.appbrand.ipc.x0.a(new android.support.v4.os.ResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.3

            /* renamed from: g */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f78358g;

            /* renamed from: h */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f78359h;

            /* renamed from: i */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f78360i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(android.os.Handler handler, final android.content.DialogInterface.OnClickListener onClickListener4, final android.content.DialogInterface.OnClickListener onClickListener22, final android.content.DialogInterface.OnClickListener onClickListener32) {
                super(handler);
                r2 = onClickListener4;
                r3 = onClickListener22;
                r4 = onClickListener32;
            }

            @Override // android.support.v4.os.ResultReceiver
            public void a(int i18, android.os.Bundle bundle) {
                android.content.DialogInterface.OnClickListener onClickListener4;
                android.content.DialogInterface.OnClickListener onClickListener5;
                android.content.DialogInterface.OnClickListener onClickListener6;
                if (-1 == i18 && (onClickListener6 = r2) != null) {
                    onClickListener6.onClick(null, i18);
                }
                if (-2 == i18 && (onClickListener5 = r3) != null) {
                    onClickListener5.onClick(null, i18);
                }
                if (-3 != i18 || (onClickListener4 = r4) == null) {
                    return;
                }
                onClickListener4.onClick(null, i18);
            }
        }, context2)).putExtra("key_alert_message", str).putExtra("key_alert_title", str2).putExtra("key_alert_confirm", str3).putExtra("key_alert_deny", str4);
        if (!(context2 instanceof android.app.Activity)) {
            putExtra.addFlags(268435456);
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showAlert", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showAlert", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessProxyUI", e17, "showAlert get BadParcelableException", new java.lang.Object[0]);
        }
    }

    public static void b(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest, com.tencent.mm.plugin.appbrand.ipc.u uVar) {
        java.lang.Class<com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI> cls = (java.lang.Class) f78400a.get(bm5.f1.a().replaceFirst(com.tencent.mm.sdk.platformtools.x2.f193072b, ""));
        if (cls == null) {
            cls = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class;
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, cls, appBrandProxyUIProcessTask$ProcessRequest, uVar, null);
    }
}
