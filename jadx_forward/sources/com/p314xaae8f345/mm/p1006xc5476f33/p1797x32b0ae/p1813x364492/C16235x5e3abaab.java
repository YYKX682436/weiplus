package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1813x364492;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.test.LiteAppTestBroadcastReceiver */
/* loaded from: classes15.dex */
public final class C16235x5e3abaab extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f225818b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f225819a = "LiteAppTestBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("url");
        java.lang.String str = this.f225819a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "receive:%s", stringExtra);
        if (stringExtra != null) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true)) {
                qa3.o oVar = qa3.o.f442584a;
                if (qa3.o.f442585b != null) {
                    qa3.o.f442586c.clear();
                    jz5.l lVar = qa3.o.f442585b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
                    java.lang.String str2 = (java.lang.String) lVar.f384366d;
                    jz5.l lVar2 = qa3.o.f442585b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
                    int intValue = ((java.lang.Number) lVar2.f384367e).intValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppTestService", "close last socket: " + str2 + '(' + intValue + "), new url:" + stringExtra);
                    com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.m108915xa028f8b(str2, intValue, 0, "force init");
                    qa3.o.f442585b = null;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65464xcab73a76(oVar);
                com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.a(new qa3.m(), "liteapp", stringExtra, null, null, null, new com.p314xaae8f345.p3132xf2511bc7.C27056x4979ef19(5000, 12000, false, !r26.i0.y(stringExtra, "wss", false), 0, false), null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "use new websocket for test");
            if (!f225818b) {
                f225818b = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "use new websocket load new cronet");
                java.lang.String m154080xdba63de6 = org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(m154080xdba63de6);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                wp5.e.a(context2, new qa3.i());
            }
            qa3.o oVar2 = qa3.o.f442584a;
            xp5.f fVar = qa3.o.f442589f;
            if (fVar != null) {
                fVar.f537501b.m83282xe8880bd2(qa3.o.f442590g, 100, "");
            }
            qa3.o.f442589f = new xp5.f("", "");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65464xcab73a76(oVar2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
            xp5.f fVar2 = qa3.o.f442589f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar2);
            qa3.n nVar = new qa3.n(stringExtra);
            long m83283xbbd9acfd = fVar2.f537501b.m83283xbbd9acfd(stringExtra, hashMap, arrayList2, false, true, valueOf != null ? valueOf.intValue() : 30000L);
            fVar2.f537500a.put(java.lang.Long.valueOf(m83283xbbd9acfd), nVar);
            qa3.o.f442590g = m83283xbbd9acfd;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket connectId is " + qa3.o.f442590g);
        }
    }
}
