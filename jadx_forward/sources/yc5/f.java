package yc5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final yc5.f f542438a = new yc5.f();

    public final v05.b a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        try {
            v05.b bVar = new v05.b();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                return null;
            }
            bVar.m126728xdc93280d(U1);
            return bVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHistoryGalleryFileHelper", e17, "parseCommonAppMsg failed", new java.lang.Object[0]);
            return null;
        }
    }
}
