package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class w extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x f145047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x xVar, android.os.Looper looper) {
        super(looper);
        this.f145047a = xVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.String string = message.getData().getString("notification.show.talker");
        java.lang.String string2 = message.getData().getString("notification.show.message.content");
        int i17 = message.getData().getInt("notification.show.message.type");
        int i18 = message.getData().getInt("notification.show.tipsflag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotification", "notify need to deal: %s", string);
        try {
            mm.w.e("notifyHandler");
            if (message.what == 1) {
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.d(this.f145047a, string, string2, i17, i18, true);
            } else {
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.d(this.f145047a, string, string2, i17, i18, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMNotification", e17, "showNotifiHandler", new java.lang.Object[0]);
        }
    }
}
