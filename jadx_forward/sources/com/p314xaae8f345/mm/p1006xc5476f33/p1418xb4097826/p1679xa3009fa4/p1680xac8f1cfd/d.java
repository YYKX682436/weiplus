package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class d extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f215581t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f215582u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List unreadIdList, java.util.List hasReadIdList, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.o72 o72Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unreadIdList, "unreadIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hasReadIdList, "hasReadIdList");
        this.f215581t = unreadIdList;
        this.f215582u = hasReadIdList;
        r45.sw0 sw0Var = new r45.sw0();
        db2.t4 t4Var = db2.t4.f309704a;
        sw0Var.set(3, t4Var.b(6658, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) sw0Var.m75936x14adae67(3);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(unreadIdList, 10));
        java.util.Iterator it = unreadIdList.iterator();
        while (true) {
            int i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (qt2Var != null) {
                i17 = qt2Var.m75939xb282bd08(5);
            }
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(longValue), null));
        }
        t4Var.h(kv0Var, null, arrayList);
        db2.t4 t4Var2 = db2.t4.f309704a;
        r45.kv0 kv0Var2 = (r45.kv0) sw0Var.m75936x14adae67(3);
        java.util.List list = this.f215582u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(((java.lang.Number) it6.next()).longValue()), null));
        }
        t4Var2.h(kv0Var2, null, arrayList2);
        sw0Var.m75941xfb821914(5).addAll(this.f215581t);
        sw0Var.m75941xfb821914(4).addAll(this.f215582u);
        sw0Var.set(6, gVar);
        sw0Var.set(7, o72Var);
        sw0Var.set(8, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initCommReqResp: commentScene=");
        sb6.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        sb6.append(", unreadIdList:");
        sb6.append(kz5.n0.g0(this.f215581t, ";", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b.f215348d, 30, null));
        sb6.append(", hasReadIdList:");
        sb6.append(kz5.n0.g0(this.f215582u, ";", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c.f215470d, 30, null));
        sb6.append(", last_check_context=");
        sb6.append(gVar);
        sb6.append(", live_report_base_info=");
        sb6.append(o72Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFeedSafeCheckNew", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sw0Var;
        r45.tw0 tw0Var = new r45.tw0();
        tw0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tw0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tw0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercheckprefetch";
        lVar.f152200d = 6658;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tw0 resp = (r45.tw0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", commentScene=");
        r45.qt2 qt2Var = this.f97668n;
        sb6.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFeedSafeCheckNew", sb6.toString());
    }
}
