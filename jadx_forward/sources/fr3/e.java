package fr3;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr3.f f347324a;

    public e(fr3.f fVar) {
        this.f347324a = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MVI_Model", "getInfrequentContact() called " + fVar.f152148a + ' ' + fVar.f152149b);
        int i17 = fVar.f152148a;
        fr3.f fVar2 = this.f347324a;
        if (i17 != 0 || fVar.f152149b != 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar2.m158354x19263085();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = fVar2.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.k2u);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return fVar;
        }
        r45.hh3 hh3Var = (r45.hh3) fVar.f152151d;
        if (hh3Var == null) {
            return fVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getInfrequentContact() rsp back ok lastContext:");
        java.lang.String str = fVar2.f347327f;
        int i19 = 0;
        sb6.append(!(str == null || r26.n0.N(str)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MVI_Model", sb6.toString());
        fVar2.f347327f = hh3Var.f457681e;
        java.util.LinkedList infrequent_contact_list = hh3Var.f457680d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infrequent_contact_list, "infrequent_contact_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(infrequent_contact_list, 10));
        java.util.Iterator it = infrequent_contact_list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.qz3) it.next()).f465894d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        java.util.List d17 = g95.x.f351360a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) d17).iterator();
        while (it6.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) it6.next()).w0()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            fr3.a aVar = new fr3.a(str2, 0L, null, 0L, 14, null);
            java.lang.Long l17 = (java.lang.Long) kz5.n0.a0(arrayList3, i19);
            if (l17 != null) {
                aVar.f347314b = l17.longValue();
            }
            arrayList4.add(aVar);
            i19 = i27;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(fVar2), null, null, new fr3.d(fVar2, arrayList4, null), 3, null);
        return fVar;
    }
}
