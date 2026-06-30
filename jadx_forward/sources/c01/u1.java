package c01;

/* loaded from: classes5.dex */
public class u1 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkGetChatroomMemberDetail ");
        r45.xb4 xb4Var = c01.v1.f119053b;
        sb6.append(xb4Var.f471477d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", sb6.toString());
        if (xb4Var.f471477d.isEmpty()) {
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("getChatroomMemberDetail_" + gm0.m.i()).j("detail");
            if (j17 == null) {
                return;
            }
            r45.xb4 xb4Var2 = new r45.xb4();
            try {
                xb4Var2.mo11468x92b714fd(j17);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e17.getMessage());
            }
            c01.v1.f119053b.f471477d.addAll(xb4Var2.f471477d);
        }
        r45.xb4 xb4Var3 = c01.v1.f119053b;
        if (xb4Var3.f471477d.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetails is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "start Conversation:" + xb4Var3.f471477d.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = xb4Var3.f471477d.iterator();
        while (it.hasNext()) {
            r45.wb4 wb4Var = (r45.wb4) it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(wb4Var.f470568d) != null) {
                ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(wb4Var.f470568d).g(wb4Var.f470568d, wb4Var.f470569e).b();
                arrayList.add(wb4Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + wb4Var.f470568d + " " + wb4Var.f470569e);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            c01.v1.f119053b.f471477d.remove((r45.wb4) it6.next());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("delete ");
        sb7.append(arrayList.size());
        sb7.append(" ");
        r45.xb4 xb4Var4 = c01.v1.f119053b;
        sb7.append(xb4Var4.f471477d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", sb7.toString());
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("getChatroomMemberDetail_" + gm0.m.i()).H("detail", xb4Var4.mo14344x5f01b1f6());
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e18.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "end Conversation");
        arrayList.clear();
        java.util.Iterator it7 = c01.v1.f119053b.f471477d.iterator();
        while (it7.hasNext()) {
            r45.wb4 wb4Var2 = (r45.wb4) it7.next();
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(wb4Var2.f470568d).g(wb4Var2.f470568d, wb4Var2.f470569e).b();
            arrayList.add(wb4Var2);
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            c01.v1.f119053b.f471477d.remove((r45.wb4) it8.next());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("delete ");
        sb8.append(arrayList.size());
        sb8.append(" ");
        r45.xb4 xb4Var5 = c01.v1.f119053b;
        sb8.append(xb4Var5.f471477d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", sb8.toString());
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("getChatroomMemberDetail_" + gm0.m.i()).H("detail", xb4Var5.mo14344x5f01b1f6());
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e19.getMessage());
        }
    }
}
