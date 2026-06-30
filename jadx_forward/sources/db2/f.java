package db2;

/* loaded from: classes.dex */
public final class f extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f309498t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sx0 f309499u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(java.util.List unreadList, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unreadList, "unreadList");
        this.f309498t = unreadList;
        r45.sx0 sx0Var = new r45.sx0();
        this.f309499u = sx0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        db2.t4 t4Var = db2.t4.f309704a;
        sx0Var.set(1, t4Var.b(3980, qt2Var));
        sx0Var.m75941xfb821914(2).addAll(unreadList);
        lVar.f152197a = sx0Var;
        r45.kv0 kv0Var = (r45.kv0) sx0Var.m75936x14adae67(1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(unreadList, 10));
        java.util.Iterator it = unreadList.iterator();
        while (it.hasNext()) {
            r45.e13 e13Var = (r45.e13) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(e13Var.m75942xfb822ef2(0)), e13Var.m75945x2fec8307(4)));
        }
        t4Var.h(kv0Var, null, arrayList);
        r45.tx0 tx0Var = new r45.tx0();
        tx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tx0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tx0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercollectunread";
        lVar.f152200d = 3980;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unreadList=");
        java.util.List list = this.f309498t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(pm0.v.u(((r45.e13) it6.next()).m75942xfb822ef2(0)));
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCollectUnreadItem", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tx0 resp = (r45.tx0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCollectUnreadItem", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
