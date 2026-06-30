package c01;

/* loaded from: classes5.dex */
public abstract class f1 {
    public static int a() {
        int i17 = 0;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
            return 0;
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationStorage", "get bottle total conversation unread sql is %s", "select count(*) from rbottleconversation where unReadCount > 0");
        android.database.Cursor B = Di.f195117d.B("select count(*) from rbottleconversation where unReadCount > 0", null);
        if (B != null && B.getCount() > 0) {
            B.moveToFirst();
            i17 = B.getInt(0);
        }
        if (B != null) {
            B.close();
        }
        return i17;
    }
}
