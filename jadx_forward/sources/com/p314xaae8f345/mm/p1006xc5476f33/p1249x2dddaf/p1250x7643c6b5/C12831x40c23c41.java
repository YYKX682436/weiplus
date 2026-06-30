package com.p314xaae8f345.mm.p1006xc5476f33.p1249x2dddaf.p1250x7643c6b5;

/* renamed from: com.tencent.mm.plugin.auto.service.MMAutoMessageReplyReceiver */
/* loaded from: classes11.dex */
public class C12831x40c23c41 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "key_username");
        if (l17 == null) {
            return;
        }
        android.os.Bundle b17 = z2.s1.b(intent);
        java.lang.CharSequence charSequence = b17 != null ? b17.getCharSequence("key_voice_reply_text") : null;
        if (charSequence == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply null", l17);
            return;
        }
        if (gn1.a.f()) {
            if (!gn1.a.h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not open car mode");
            } else {
                if (!gn1.a.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not install auto app");
                    return;
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1496L, 1L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply %s", l17, charSequence.toString());
                ((dk5.s5) tg3.t1.a()).fj(l17, charSequence.toString(), c01.e2.C(l17), 0);
            }
        }
    }
}
