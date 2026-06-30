package kn;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.i {
    public c(java.lang.String str, java.util.LinkedList linkedList) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.az azVar = new r45.az();
            azVar.f451905d = str2;
            linkedList2.add(azVar);
        }
        r45.j7 j7Var = new r45.j7();
        j7Var.f459150d = str == null ? "" : str;
        j7Var.f459151e = linkedList2.size();
        j7Var.f459152f = linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = j7Var;
        lVar.f152198b = new r45.k7();
        lVar.f152199c = "/cgi-bin/micromsg-bin/alterchatroomwatchmembers";
        lVar.f152200d = 447;
        p(lVar.a());
    }
}
