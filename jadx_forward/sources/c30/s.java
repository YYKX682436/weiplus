package c30;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final c30.e f119691a;

    /* renamed from: b, reason: collision with root package name */
    public c30.l f119692b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f119693c;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f119694d;

    public s(c30.e db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f119691a = db6;
        this.f119693c = new java.util.LinkedHashMap();
    }

    public final java.util.List a() {
        java.util.Collection values = ((java.util.LinkedHashMap) this.f119693c).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((c30.k) obj).f119675c == c30.j.f119667d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        java.util.List a17 = a();
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c30.k) it.next()).f119673a);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        c(c30.j.f119668e, a17);
        bw5.w6 w6Var = new bw5.w6();
        w6Var.f116126d = new java.util.LinkedList(arrayList2);
        w6Var.f116127e[2] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w6Var;
        lVar.f152198b = new bw5.x6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getusershopinfo";
        lVar.f152200d = 28957;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopInfoUpdater", "EcsGetUserShopInfoReq shopAppIds count: " + arrayList2.size());
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new c30.p(this, a17));
    }

    public final void c(c30.j newStatus, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            c30.k kVar = (c30.k) it.next();
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStatus, "newStatus");
            kVar.f119675c = newStatus;
            kVar.f119674b = android.os.SystemClock.elapsedRealtime();
        }
    }
}
