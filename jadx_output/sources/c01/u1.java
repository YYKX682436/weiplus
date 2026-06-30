package c01;

/* loaded from: classes5.dex */
public class u1 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkGetChatroomMemberDetail ");
        r45.xb4 xb4Var = c01.v1.f37520b;
        sb6.append(xb4Var.f389944d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", sb6.toString());
        if (xb4Var.f389944d.isEmpty()) {
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.M("getChatroomMemberDetail_" + gm0.m.i()).j("detail");
            if (j17 == null) {
                return;
            }
            r45.xb4 xb4Var2 = new r45.xb4();
            try {
                xb4Var2.parseFrom(j17);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e17.getMessage());
            }
            c01.v1.f37520b.f389944d.addAll(xb4Var2.f389944d);
        }
        r45.xb4 xb4Var3 = c01.v1.f37520b;
        if (xb4Var3.f389944d.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetails is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "start Conversation:" + xb4Var3.f389944d.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = xb4Var3.f389944d.iterator();
        while (it.hasNext()) {
            r45.wb4 wb4Var = (r45.wb4) it.next();
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(wb4Var.f389035d) != null) {
                ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(wb4Var.f389035d).g(wb4Var.f389035d, wb4Var.f389036e).b();
                arrayList.add(wb4Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + wb4Var.f389035d + " " + wb4Var.f389036e);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            c01.v1.f37520b.f389944d.remove((r45.wb4) it6.next());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("delete ");
        sb7.append(arrayList.size());
        sb7.append(" ");
        r45.xb4 xb4Var4 = c01.v1.f37520b;
        sb7.append(xb4Var4.f389944d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", sb7.toString());
        try {
            com.tencent.mm.sdk.platformtools.o4.M("getChatroomMemberDetail_" + gm0.m.i()).H("detail", xb4Var4.toByteArray());
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e18.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "end Conversation");
        arrayList.clear();
        java.util.Iterator it7 = c01.v1.f37520b.f389944d.iterator();
        while (it7.hasNext()) {
            r45.wb4 wb4Var2 = (r45.wb4) it7.next();
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(wb4Var2.f389035d).g(wb4Var2.f389035d, wb4Var2.f389036e).b();
            arrayList.add(wb4Var2);
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            c01.v1.f37520b.f389944d.remove((r45.wb4) it8.next());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("delete ");
        sb8.append(arrayList.size());
        sb8.append(" ");
        r45.xb4 xb4Var5 = c01.v1.f37520b;
        sb8.append(xb4Var5.f389944d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", sb8.toString());
        try {
            com.tencent.mm.sdk.platformtools.o4.M("getChatroomMemberDetail_" + gm0.m.i()).H("detail", xb4Var5.toByteArray());
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e19.getMessage());
        }
    }
}
