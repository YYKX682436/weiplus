package ho2;

/* loaded from: classes2.dex */
public final class b extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.sr0 f364397t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(r45.qt2 contextObj, java.lang.String str, java.lang.String str2, int i17) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        r45.sr0 sr0Var = new r45.sr0();
        this.f364397t = sr0Var;
        sr0Var.f467466d = db2.t4.f309704a.b(7023, contextObj);
        sr0Var.f467467e = str;
        sr0Var.f467468f = str2;
        sr0Var.f467469g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sr0Var;
        r45.tr0 tr0Var = new r45.tr0();
        tr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = tr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = tr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermembershipdetailinfo";
        lVar.f152200d = 7023;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> linkedList;
        r45.tr0 resp = (r45.tr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderFetchMemberShipDetailInfoCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " memberStatus=" + resp.f468256d + " visitorStatus=" + java.lang.Integer.valueOf(resp.f468259g));
        r45.h07 h07Var = resp.f468261i;
        if (h07Var == null || (linkedList = h07Var.f457264e) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : linkedList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
            bu2.j jVar = bu2.j.f106067a;
            int i19 = this.f152179f.f152246d;
            r45.kv0 kv0Var = this.f364397t.f467466d;
            jVar.n(c14994x9b99c079, new bu2.h(i19, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L));
        }
    }
}
