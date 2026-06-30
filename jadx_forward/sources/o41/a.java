package o41;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3);
        r45.va vaVar = new r45.va();
        vaVar.f469553g = str3;
        vaVar.f469550d = str2;
        r45.xz4 xz4Var = new r45.xz4();
        xz4Var.f472163d = str;
        vaVar.f469551e = xz4Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            r45.xz4 xz4Var2 = new r45.xz4();
            xz4Var2.f472163d = str4;
            linkedList.add(xz4Var2);
        }
        vaVar.f469552f = linkedList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = vaVar;
        lVar.f152198b = new r45.wa();
        lVar.f152199c = "/cgi-bin/micromsg-bin/approveaddopenimchatroommember";
        lVar.f152200d = 941;
        p(lVar.a());
    }
}
