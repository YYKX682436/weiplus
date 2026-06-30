package lt1;

/* loaded from: classes4.dex */
public final class m extends lt1.e {
    @Override // lt1.e
    public int b() {
        return 12;
    }

    @Override // lt1.e
    public int c() {
        return 15031;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.OpenIMContactSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/openimcontactsync";
    }

    @Override // lt1.e
    public boolean g() {
        return true;
    }

    @Override // lt1.e
    public boolean h() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableSyncAfterAutoAuth", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMContactSyncProcessor", "isSyncOnAuth called EnableSyncAfterAutoAuth:" + z17);
        return z17;
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncItems, "syncItems");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMContactSyncProcessor", "process() called with: syncItems = " + syncItems);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(syncItems, 10));
        java.util.Iterator it = syncItems.iterator();
        while (it.hasNext()) {
            r45.go5 go5Var = (r45.go5) it.next();
            r45.b50 b50Var = new r45.b50();
            b50Var.f452063d = go5Var.f456929d;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.c(go5Var.f456930e);
            b50Var.f452064e = cu5Var;
            arrayList.add(b50Var);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Bi((r45.b50) it6.next());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMContactSyncProcessor", "process() end called");
    }
}
