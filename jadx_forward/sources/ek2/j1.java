package ek2;

/* loaded from: classes.dex */
public final class j1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335012u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.cv1 f335013v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j17, long j18, java.lang.String str, java.lang.String anchorUsername, byte[] bArr, int i17, java.lang.String username, java.lang.String requestId, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, r45.qt2 qt2Var, java.lang.String str3, java.lang.String str4, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        java.lang.String str5;
        byte[] bArr2 = (i19 & 16) != 0 ? null : bArr;
        java.lang.String str6 = (i19 & 256) != 0 ? null : str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i19 & 512) != 0 ? null : gVar;
        java.lang.String str7 = (i19 & 4096) != 0 ? null : str3;
        java.lang.String str8 = (i19 & 8192) != 0 ? null : str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        this.f335012u = "Finder.CgiFinderLiveGetShoppingShelf";
        r45.cv1 cv1Var = new r45.cv1();
        this.f335013v = cv1Var;
        cv1Var.set(3, java.lang.Long.valueOf(j17));
        cv1Var.set(2, java.lang.Long.valueOf(j18));
        cv1Var.set(5, anchorUsername);
        cv1Var.set(6, java.lang.Integer.valueOf(i17));
        cv1Var.set(7, username);
        cv1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr2));
        db2.t4 t4Var = db2.t4.f309704a;
        cv1Var.set(1, t4Var.a(4049));
        cv1Var.set(8, requestId);
        cv1Var.set(9, str6);
        cv1Var.set(17, gVar2);
        cv1Var.set(10, java.lang.Integer.valueOf(i18));
        gk2.e eVar = gk2.e.f354004n;
        cv1Var.set(15, (eVar == null || (str5 = ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3) == null) ? "" : str5);
        cv1Var.set(18, 4L);
        cv1Var.set(19, 0L);
        cv1Var.set(16, str8);
        if (!(str7 == null || str7.length() == 0)) {
            cv1Var.set(11, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str7));
        }
        t4Var.h((r45.kv0) cv1Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(j18), str)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cv1Var;
        r45.dv1 dv1Var = new r45.dv1();
        dv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dv1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = dv1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetshopshelf";
        lVar.f152200d = 4049;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetShoppingShelf", "init " + cv1Var.m75942xfb822ef2(3) + ", " + cv1Var.m75939xb282bd08(6) + ", " + cv1Var.m75945x2fec8307(5) + ",requestId:" + cv1Var.m75945x2fec8307(8) + ",pullScene:" + cv1Var.m75939xb282bd08(10) + ",ux_info:" + cv1Var.m75934xbce7f2f(11) + ", liveRoomBuffer: " + cv1Var.m75945x2fec8307(16));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dv1 resp = (r45.dv1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335012u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("baseResp=");
            r45.ie ieVar = (r45.ie) resp.m75936x14adae67(0);
            sb7.append(ieVar != null ? ieVar.f458493e : null);
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(", itemCount=");
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            sb8.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
            sb6.append(sb8.toString());
            sb6.append(", liveId=" + resp.m75942xfb822ef2(6));
            sb6.append(", hasVirtual=" + resp.m75933x41a8a7f2(14));
            sb6.append(", continueFlag=" + resp.m75939xb282bd08(47));
            sb6.append(", version=" + resp.m75942xfb822ef2(50));
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(", hasCouponBanner=");
            sb9.append(((bw5.jj0) resp.m75936x14adae67(39)) != null);
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(", hasPresenter=");
            sb10.append(((bw5.q30) resp.m75936x14adae67(41)) != null);
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder(", hasVip");
            sb11.append(((r45.a56) resp.m75936x14adae67(22)) != null);
            sb6.append(sb11.toString());
            java.lang.String sb12 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb12, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "shopping list result:".concat(sb12));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if ((k0Var != null ? (mm2.f6) k0Var.m57635xbba4bfc0(mm2.f6.class) : null) == null) {
                return;
            }
            resp.m75945x2fec8307(17);
        }
    }

    @Override // az2.j
    public java.util.List s() {
        r45.cv1 cv1Var = this.f335013v;
        return kz5.c0.i(new jz5.l("pull_scene", java.lang.String.valueOf(cv1Var.m75939xb282bd08(10))), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(cv1Var.m75939xb282bd08(6))));
    }
}
