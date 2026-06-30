package com.tencent.mm.plugin.auto.service;

/* loaded from: classes11.dex */
public class MMAutoMessageReplyReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "key_username");
        if (l17 == null) {
            return;
        }
        android.os.Bundle b17 = z2.s1.b(intent);
        java.lang.CharSequence charSequence = b17 != null ? b17.getCharSequence("key_voice_reply_text") : null;
        if (charSequence == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply null", l17);
            return;
        }
        if (gn1.a.f()) {
            if (!gn1.a.h()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not open car mode");
            } else {
                if (!gn1.a.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not install auto app");
                    return;
                }
                jx3.f.INSTANCE.idkeyStat(1496L, 1L, 1L, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply %s", l17, charSequence.toString());
                ((dk5.s5) tg3.t1.a()).fj(l17, charSequence.toString(), c01.e2.C(l17), 0);
            }
        }
    }
}
