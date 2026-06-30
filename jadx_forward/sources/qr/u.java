package qr;

/* loaded from: classes12.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.x f447580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f447581b;

    public u(qr.x xVar, yz5.l lVar) {
        this.f447580a = xVar;
        this.f447581b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.ri0 ri0Var;
        java.util.LinkedList linkedList3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.ye yeVar = (r45.ye) fVar.f152151d;
        qr.x xVar = this.f447580a;
        java.lang.String str = xVar.f447584g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestNext: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", size:");
        java.lang.String str2 = null;
        sb6.append((yeVar == null || (linkedList3 = yeVar.f472541g) == null) ? null : java.lang.Integer.valueOf(linkedList3.size()));
        sb6.append(", first:");
        if (yeVar != null && (linkedList2 = yeVar.f472541g) != null && (ri0Var = (r45.ri0) kz5.n0.Z(linkedList2)) != null) {
            str2 = ri0Var.f466419d;
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.l lVar = this.f447581b;
        if (i17 == 0 && i18 == 0 && (linkedList = yeVar.f472541g) != null && (!linkedList.isEmpty())) {
            r45.ri0 ri0Var2 = (r45.ri0) yeVar.f472541g.getFirst();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            n22.m.a(ri0Var2, c21053xdbf1e5f4);
            z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = xVar.f447552a;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = c17.u1(c21053xdbf1e5f42.mo42933xb5885648());
            if (u17 != null) {
                n22.m.s(c21053xdbf1e5f4, u17);
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
            }
            if (cr.m.b(c21053xdbf1e5f4) || cr.m.a(c21053xdbf1e5f4) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68654xf47770e7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f447584g, "get download info from cgi");
                n22.m.s(c21053xdbf1e5f4, c21053xdbf1e5f42);
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                return jz5.f0.f384359a;
            }
        }
        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
