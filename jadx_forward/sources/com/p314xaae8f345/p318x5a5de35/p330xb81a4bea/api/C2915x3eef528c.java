package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api;

/* renamed from: com.tencent.cloud.huiyan.api.HuiYanSdkV2 */
/* loaded from: classes14.dex */
public class C2915x3eef528c {

    /* renamed from: _hellAccFlag_ */
    private byte f9912x7f11beae;

    private C2915x3eef528c() {
    }

    /* renamed from: closeAuthView */
    public static void m21755x9ffe4285() {
        int i17 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e17 = ic.c.f371813a.e();
        if (e17 == null || !e17.m21794x603da55c()) {
            return;
        }
        mc.q qVar = mc.p.f407064a;
        qVar.b("HuiYanBaseApi", "call close.");
        try {
            lc.i a17 = mc.a.f407027a.a();
            if (a17 == null || a17.getActivity() == null || a17.getActivity().isFinishing()) {
                return;
            }
            qVar.b("HuiYanBaseApi", "call finish.");
            a17.getActivity().finish();
        } catch (java.lang.Exception e18) {
            mc.p.f407064a.e("HuiYanBaseApi", "close method error: " + e18.getMessage());
        }
    }

    /* renamed from: getVersion */
    public static java.lang.String m21756x52c258a2() {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.getClass();
        return com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21743x52c258a2();
    }

    /* renamed from: init */
    public static void m21757x316510(android.content.Context context) {
        java.lang.String str;
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        if (context == null) {
            dVar.getClass();
            return;
        }
        dVar.f371818d = true;
        dVar.f371815a = new java.lang.ref.WeakReference(context.getApplicationContext());
        pc.j jVar = pc.i.f434741a;
        if (!jVar.f434742a) {
            jVar.f434742a = true;
            java.io.File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(externalFilesDir);
                java.lang.String str2 = java.io.File.separator;
                sb6.append(str2);
                sb6.append("cloud-huiyan");
                sb6.append(str2);
                sb6.append("log");
                str = sb6.toString();
            } else {
                str = "";
            }
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(context.getFilesDir());
                java.lang.String str3 = java.io.File.separator;
                sb7.append(str3);
                sb7.append("cloud-huiyan");
                sb7.append(str3);
                sb7.append("log");
                str = sb7.toString();
            }
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2903x3c4dddc.m21642x316510(new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2905x9a9793f8(context, new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e.AiLogConfigBuilder().m21672x8ed9679(str).m21674x16e3c4f4(true).m21675xc599d92d("huiyan-log").m21676x23f4c6d4(3).m21671x44d8439b("[hy-sdk-log]").m21677x764e55cc(true).m21673x9f6d985d(259200000L).m21670xaf65a0fc()));
        }
        oc.h hVar = oc.g.f425634a;
        try {
            hVar.f425637c = new kc.c();
            hVar.c();
            hVar.f425635a = false;
            hVar.f425638d.getClass();
            mc.p.f407064a.b("TuringSdkHelper", "call turing interface init finish");
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            mc.p.f407064a.e("TuringSdkHelper", "create and init turing help error " + e17.getLocalizedMessage());
            hVar.f425638d = null;
            hVar.f425640f = false;
        }
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2906xdd933c58.m21707x21169495().m21711x316510(context, "huiyan", true, "com.tencent.cloud.huiyan", false);
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2906xdd933c58.m21707x21169495().m21710x5d8d7a5a(new ic.a());
        mc.p.f407064a.b("HuiYanBaseApi", "call huiyan init");
    }

    /* renamed from: release */
    public static void m21758x41012807() {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.f();
    }

    /* renamed from: setHuiYanSdkEventCallback */
    public static void m21759x177b5d1(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f) {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.f371820f = interfaceC2917x949fc30f;
    }

    /* renamed from: setHuiYanSdkExtraCallBack */
    public static void m21760x9a447567(jc.c cVar) {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.getClass();
    }

    /* renamed from: setLoggerCallback */
    public static void m21761xcc761ef7(java.lang.String str, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2918x552bfd03 interfaceC2918x552bfd03) {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.getClass();
        mc.q qVar = mc.p.f407064a;
        synchronized (qVar.f407066b) {
            qVar.f407067c = str;
            qVar.f407068d = interfaceC2918x552bfd03;
            if (qVar.f407069e == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("logger-thread");
                qVar.f407069e = handlerThread;
                handlerThread.start();
                qVar.f407070f = new mc.n(qVar, qVar.f407069e.getLooper());
            }
        }
    }

    /* renamed from: startAuthByLightData */
    public static void m21762x947eb7bf(java.lang.String str) {
        int m21750x34b33aae;
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        dVar.getClass();
        dVar.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.START_AUTH);
        mc.q qVar = mc.p.f407064a;
        qVar.b("HuiYanBaseApi", "thread: " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
        if (c2920x9dce3f52 == null) {
            qVar.e("HuiYanNativeUtils", "huiYanSdkConfig is null");
            m21750x34b33aae = -111;
        } else {
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21752xf6e0f4e5();
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2921x702de260 c2921x702de260 = new com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2921x702de260();
            c2921x702de260.m21932x21e4b743(str);
            c2921x702de260.m21923x54a44109(c2920x9dce3f52.m21824xcf6d6e49());
            c2921x702de260.m21928x921fa75c(c2920x9dce3f52.m21835x9b223799());
            c2921x702de260.m21927xe1db472d(!c2920x9dce3f52.m21842x22a5b797());
            c2921x702de260.m21924x1bfc731a(c2920x9dce3f52.m21829xeed46c72());
            c2921x702de260.m21925xb1072479(c2920x9dce3f52.m21848x704df978());
            c2921x702de260.m21926x4d21c708(dVar.f371822h ? 3 : 4);
            c2921x702de260.m21931x93537b7d(c2920x9dce3f52.m21838x9e04c65f());
            java.lang.String m21624xcc31ba03 = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2899x9a2844f6().m21624xcc31ba03(c2921x702de260, 1);
            qVar.b("HuiYanNativeUtils", "start initYtLivenessSdk!");
            m21750x34b33aae = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21750x34b33aae(m21624xcc31ba03);
        }
        if (m21750x34b33aae == 0) {
            mc.d.f407048a.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.START_CAMERA_PREVIEW, null);
            return;
        }
        dVar.b(228, "initYtLivenessSdk  code : " + m21750x34b33aae);
        qVar.e("HuiYanBaseApi", "initYtLivenessSdk return code : " + m21750x34b33aae);
    }

    /* renamed from: startHuiYanCheck */
    public static void m21763x91e3a19c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2916x7b7d8c75 interfaceC2916x7b7d8c75) {
        android.content.Context m21786xa6583b54;
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        boolean z17 = true;
        dVar.f371822h = true;
        dVar.f371821g = interfaceC2916x7b7d8c75;
        dVar.f371823i = c2920x9dce3f52;
        dVar.f371819e = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
        dVar.f371817c = false;
        dVar.f371818d = false;
        mc.q qVar = mc.p.f407064a;
        qVar.e("HuiYanBaseApi", "realStartCheckWithConfig!");
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f522 = dVar.f371823i;
        if (c2920x9dce3f522 == null) {
            dVar.b(211, "start huiYanSdkConfig is null");
            return;
        }
        int m21744x29c6785f = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21744x29c6785f(c2920x9dce3f522.m21823xb9b45843(), "", "", com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21738x11062113());
        if (m21744x29c6785f != 0) {
            dVar.b(211, "init youtu init auth return code : " + m21744x29c6785f);
            return;
        }
        qVar.b("HuiYanBaseApi", "license check success!");
        java.lang.ref.WeakReference weakReference = dVar.f371816b;
        android.content.Context context = weakReference == null ? null : (android.content.Context) weakReference.get();
        if (context == null) {
            context = dVar.a();
        }
        if (context == null) {
            dVar.b(216, "please call init() function first!");
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e17 = dVar.e();
        if (e17 != null && (m21786xa6583b54 = e17.m21786xa6583b54()) != null) {
            z17 = false;
            context = m21786xa6583b54;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f523 = dVar.f371823i;
        android.content.Intent intent = (c2920x9dce3f523 == null || !c2920x9dce3f523.m21848x704df978()) ? new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed.ActivityC2913x9422dd50.class) : new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed.ActivityC2912x3ec76d5b.class);
        qVar.b("HuiYanBaseApi", "useAppContext: " + z17);
        if (z17) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/cloud/huiyan/api/HuiYanSdkV2", "startHuiYanCheck", "(Lcom/tencent/cloud/huiyan/entity/HuiYanSdkConfig;Lcom/tencent/cloud/huiyan/callback/HuiYanSdkCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/cloud/huiyan/api/HuiYanSdkV2", "startHuiYanCheck", "(Lcom/tencent/cloud/huiyan/entity/HuiYanSdkConfig;Lcom/tencent/cloud/huiyan/callback/HuiYanSdkCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new ic.b(dVar));
    }

    /* renamed from: stopAuthAction */
    public static void m21764xd226b3a0(final int i17, final java.lang.String str) {
        int i18 = ic.d.f371814k;
        ic.c.f371813a.getClass();
        lc.i a17 = mc.a.f407027a.a();
        if (!(a17 instanceof lc.g)) {
            mc.p.f407064a.e("HuiYanBaseApi", "current fragment is null!");
            pc.f.c(i17, str);
        } else {
            final lc.g gVar = (lc.g) a17;
            gVar.getClass();
            mc.p.f407064a.b("AuthingFragment", ">>>local auth fail");
            gVar.a(new java.lang.Runnable() { // from class: lc.g$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = lc.g.this.f399347o;
                    if (c2936x4a02ed39 != null) {
                        c2936x4a02ed39.c(true);
                    }
                    int i19 = i17;
                    java.lang.String str2 = str;
                    pc.f.c(i19, str2);
                    mc.p.f407064a.e("AuthingFragment", "local auth fail! code: " + i19 + " msg: " + str2);
                }
            });
        }
    }
}
