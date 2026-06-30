package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f159933a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(":appbrand0", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57.class);
        hashMap.put(":appbrand1", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11891xbd7f70ba.class);
        hashMap.put(":appbrand2", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11892xbd7f70bb.class);
        hashMap.put(":appbrand3", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11893xbd7f70bc.class);
        hashMap.put(":appbrand4", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11894xbd7f70bd.class);
        f159933a = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2, final android.content.DialogInterface.OnClickListener onClickListener3) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.f159880p;
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        android.content.Intent putExtra = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class).putExtra("key_running_mode", 2).putExtra("key_result_receiver", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.x0.a(new p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.3

            /* renamed from: g */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f159891g;

            /* renamed from: h */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f159892h;

            /* renamed from: i */
            public final /* synthetic */ android.content.DialogInterface.OnClickListener f159893i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(android.os.Handler handler, final android.content.DialogInterface.OnClickListener onClickListener4, final android.content.DialogInterface.OnClickListener onClickListener22, final android.content.DialogInterface.OnClickListener onClickListener32) {
                super(handler);
                r2 = onClickListener4;
                r3 = onClickListener22;
                r4 = onClickListener32;
            }

            @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessProxyUI", e17, "showAlert get BadParcelableException", new java.lang.Object[0]);
        }
    }

    public static void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar) {
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9> cls = (java.lang.Class) f159933a.get(bm5.f1.a().replaceFirst(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, ""));
        if (cls == null) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, cls, abstractC11887x3610e10c, uVar, null);
    }
}
