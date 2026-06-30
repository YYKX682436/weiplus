package q81;

/* loaded from: classes4.dex */
public final class i extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.nf7 nf7Var = (r45.nf7) obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!(!(str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            linkedList.add(str2);
        }
        java.util.LinkedList linkedList2 = nf7Var != null ? nf7Var.f462902f : null;
        if (!(true ^ (linkedList2 == null || linkedList2.isEmpty()))) {
            linkedList2 = null;
        }
        if (linkedList2 != null) {
            linkedList.addAll(linkedList2);
        }
        if (linkedList.isEmpty()) {
            return java.lang.Boolean.FALSE;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nf7Var);
        boolean z17 = nf7Var.f462901e;
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doSyncJsApiControlBytes with appId:");
        java.lang.String arrays = java.util.Arrays.toString(linkedList.toArray(new java.lang.String[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", forceUpdate:");
        sb6.append(z17);
        sb6.append(", requestId:");
        sb6.append(randomUUID);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CmdGetJsApiControlBytes", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new q81.h(z17, linkedList, randomUUID, null), 2, null);
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.nf7 nf7Var = (r45.nf7) obj;
        if (nf7Var != null) {
            return nf7Var.f462900d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetJsApiControlBytes";
    }
}
