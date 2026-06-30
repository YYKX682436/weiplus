package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class w extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.notification.x f63514a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.booter.notification.x xVar, android.os.Looper looper) {
        super(looper);
        this.f63514a = xVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.String string = message.getData().getString("notification.show.talker");
        java.lang.String string2 = message.getData().getString("notification.show.message.content");
        int i17 = message.getData().getInt("notification.show.message.type");
        int i18 = message.getData().getInt("notification.show.tipsflag");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNotification", "notify need to deal: %s", string);
        try {
            mm.w.e("notifyHandler");
            if (message.what == 1) {
                com.tencent.mm.booter.notification.x.d(this.f63514a, string, string2, i17, i18, true);
            } else {
                com.tencent.mm.booter.notification.x.d(this.f63514a, string, string2, i17, i18, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMNotification", e17, "showNotifiHandler", new java.lang.Object[0]);
        }
    }
}
