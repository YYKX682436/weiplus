package c01;

/* loaded from: classes5.dex */
public abstract class f1 {
    public static int a() {
        int i17 = 0;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
            return 0;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "get bottle total conversation unread sql is %s", "select count(*) from rbottleconversation where unReadCount > 0");
        android.database.Cursor B = Di.f276650d.B("select count(*) from rbottleconversation where unReadCount > 0", null);
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
