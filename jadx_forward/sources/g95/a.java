package g95;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        p75.i0 i17 = dm.x1.N.i();
        i17.f434190d = dm.x1.Q.l(usernameList);
        p75.l0 a17 = i17.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var : a17.k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.a3.class)) {
            java.lang.String field_chatroomname = a3Var.f69088x37548063;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_chatroomname, "field_chatroomname");
            hashMap.put(field_chatroomname, a3Var);
        }
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) hashMap.get((java.lang.String) it.next());
            if (a3Var2 != null) {
                arrayList.add(a3Var2);
            }
        }
        return arrayList;
    }
}
