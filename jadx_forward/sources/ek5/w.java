package ek5;

/* loaded from: classes9.dex */
public final class w extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        jd5.b bVar = new jd5.b();
        param.a(bVar);
        java.io.Serializable serializableExtra = intent.getSerializableExtra("Retr_Msg_Id_List");
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (java.lang.Object obj : list) {
            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
            if (l17 == null) {
                return null;
            }
            arrayList.add(java.lang.Long.valueOf(l17.longValue()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(bVar.m75945x2fec8307(bVar.f125235d + 1), ((java.lang.Number) it.next()).longValue());
            if (k17 != null) {
                arrayList2.add(k17);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj2;
            if (!(g95.e0.h(f9Var) || f9Var.P2())) {
                arrayList3.add(obj2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMediaGroupConfig", "genViewModelByRetransmitIntent, original size: " + arrayList.size() + ", forwardable size: " + arrayList3.size());
        if (arrayList3.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList4.add(g45.b.f350379a.b((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kz5.n0.O0(arrayList4, linkedList);
        bVar.k(linkedList);
        return bVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.u.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.y.class;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return jd5.b.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(44);
    }
}
