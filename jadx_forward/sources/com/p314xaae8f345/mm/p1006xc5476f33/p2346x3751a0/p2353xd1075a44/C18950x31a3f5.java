package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.l$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class C18950x31a3f5 implements yz5.l {
    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        intent.setFlags(268435456);
        try {
            android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(0)).send();
            return null;
        } catch (android.app.PendingIntent.CanceledException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.NewVoipSmallWindow", e17, "send pending intent error: %s", e17.getMessage());
            return null;
        }
    }
}
