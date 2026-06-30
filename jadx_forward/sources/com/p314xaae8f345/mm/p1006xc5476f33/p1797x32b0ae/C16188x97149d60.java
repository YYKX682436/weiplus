package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/LiteAppTaskPreloadReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver */
/* loaded from: classes8.dex */
public final class C16188x97149d60 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLiteAppTaskPreloadReceiver", "onReceive NULL intent.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        oVar.b(6, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        if (intent.hasExtra("task") && intent.hasExtra("appId") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getStringExtra("task"), "prelogin")) {
            java.lang.String stringExtra = intent.getStringExtra("appId");
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(stringExtra, null);
            if (y17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaLiteAppTaskPreloadReceiver", stringExtra.concat(" is not existed"));
            } else {
                m93.i.INSTANCE.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65301x1743ea71(y17.f14369x346425, y17.f14359x58b7f1c, y17.f14372xa8503287, false), true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.t(y17));
            }
        }
        if (intent.hasExtra("task") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getStringExtra("task"), "updateBaseLibPath")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppTaskPreloadReceiver", "receive set baselib path");
            oVar.d();
        }
    }
}
