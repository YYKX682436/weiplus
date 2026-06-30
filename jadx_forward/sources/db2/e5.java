package db2;

/* loaded from: classes3.dex */
public final class e5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309489g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f309490h;

    /* renamed from: i, reason: collision with root package name */
    public final int f309491i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309492m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309493n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, java.lang.String str, java.lang.Integer num, java.lang.Long l17, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList linkedList, java.lang.String str4, java.lang.String str5, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        java.lang.String str6;
        java.lang.String str7;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        java.util.LinkedList linkedList2;
        long j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar;
        int i19;
        java.lang.String str8 = (i18 & 16) != 0 ? "" : str;
        java.lang.Integer num3 = (i18 & 32) != 0 ? -1 : num;
        java.lang.Long l18 = (i18 & 64) != 0 ? -1L : l17;
        java.lang.Integer num4 = (i18 & 128) != 0 ? 0 : num2;
        java.lang.String str9 = (i18 & 256) != 0 ? "" : str2;
        java.lang.String fromQrcode = (i18 & 512) != 0 ? "" : str3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i18 & 1024) != 0 ? null : gVar;
        java.util.LinkedList noticeTypeList = (i18 & 2048) != 0 ? new java.util.LinkedList() : linkedList;
        java.lang.String gmsgId = (i18 & 4096) != 0 ? "" : str4;
        if ((i18 & 8192) != 0) {
            str7 = "";
            str6 = null;
        } else {
            str6 = str5;
            str7 = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromQrcode, "fromQrcode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeTypeList, "noticeTypeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gmsgId, "gmsgId");
        this.f309489g = userName;
        this.f309490h = noticeId;
        this.f309491i = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        java.lang.String str10 = fromQrcode;
        lVar2.f152199c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        lVar2.f152200d = 6276;
        r45.ru0 ru0Var = new r45.ru0();
        int intValue = num3 != null ? num3.intValue() : -1;
        int intValue2 = num4 != null ? num4.intValue() : 0;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (l18 != null) {
            gVar2 = gVar3;
            linkedList2 = noticeTypeList;
            j17 = l18.longValue();
        } else {
            gVar2 = gVar3;
            linkedList2 = noticeTypeList;
            j17 = -1;
        }
        if (qt2Var != null) {
            lVar = lVar2;
            i19 = qt2Var.m75939xb282bd08(5);
        } else {
            lVar = lVar2;
            i19 = 0;
        }
        java.lang.String Zi = ((c61.p2) ybVar).Zi(j17, i19, str6);
        int m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(8) : 0;
        java.lang.String str11 = str9 == null ? str7 : str9;
        com.p314xaae8f345.mm.p944x882e457a.l lVar3 = lVar;
        db2.r4.a(ru0Var, userName, noticeId, i17, l18 != null ? l18.longValue() : 0L, null, str8, intValue, m75939xb282bd08, Zi, str11, intValue2, str10, linkedList2, gmsgId, 16, null);
        ru0Var.set(14, gVar2);
        r45.su0 su0Var = new r45.su0();
        lVar3.f152197a = ru0Var;
        lVar3.f152198b = su0Var;
        this.f309492m = lVar3.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive init userName:" + userName + ", noticeId:" + noticeId + " ,optype:" + i17 + " ,promoToken:" + str8 + ",scene:" + num3 + ", fromQrcode = " + str10 + ", live_cookies:" + ru0Var.m75934xbce7f2f(14));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309493n;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        if (i18 == 0 && i19 == 0) {
            java.lang.String username = this.f309489g;
            int i27 = this.f309491i;
            if (i27 == 3 || i27 == 4) {
                zy2.x7 x7Var = (zy2.x7) i95.n0.c(zy2.x7.class);
                int i28 = i27 == 3 ? 1 : 0;
                vd2.j1 j1Var = (vd2.j1) x7Var;
                j1Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                for (java.util.Map.Entry entry : j1Var.f517304e.entrySet()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vd2.h1) entry.getKey()).f517277a, username)) {
                        ((vd2.i1) entry.getValue()).f517294a.set(1, java.lang.Integer.valueOf(i28 ^ 1));
                    }
                }
            } else {
                ((vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class))).wi(username, this.f309490h, i27 == 1);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5485x35eb0bf3 c5485x35eb0bf3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5485x35eb0bf3();
            am.rb rbVar = c5485x35eb0bf3.f135820g;
            rbVar.getClass();
            rbVar.getClass();
            c5485x35eb0bf3.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309493n = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309492m;
        if (oVar != null) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6276;
    }
}
