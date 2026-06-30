package hb2;

/* loaded from: classes2.dex */
public final class b0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.b0 f361558e = new hb2.b0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361559f = "Finder.FinderModifyFeedSettingService";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.wh2 modUserInfo = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modUserInfo, "modUserInfo");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(modUserInfo.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 4;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361559f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.dm2 m76806xdef68064;
        r45.dn2 dn2Var;
        r45.wh2 cmdBufItem = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        if (cmdBufItem.m75939xb282bd08(1) == 6 && cmdBufItem.m75942xfb822ef2(0) == 0) {
            r45.xh2 xh2Var = new r45.xh2();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = cmdRef.m75934xbce7f2f(3);
            if (m75934xbce7f2f != null) {
                xh2Var.mo11468x92b714fd(m75934xbce7f2f.g());
            }
            cmdBufItem.set(0, java.lang.Long.valueOf(xh2Var.m75942xfb822ef2(0)));
        }
        bu2.j jVar = bu2.j.f106067a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = jVar.h(cmdBufItem.m75942xfb822ef2(0));
        if (h17 != null) {
            if (cmdRef.m75939xb282bd08(1) == 0) {
                int m75939xb282bd08 = cmdBufItem.m75939xb282bd08(1);
                if (m75939xb282bd08 == 1) {
                    h17.m59359xd63ced6(cmdBufItem.m75939xb282bd08(2));
                    if (cmdBufItem.m75939xb282bd08(2) == 2) {
                        h17.m59199x18284011(2);
                    } else {
                        h17.m59205x263a11bd(2);
                    }
                    bu2.n.f106083a.d(cmdBufItem.m75942xfb822ef2(0));
                } else if (m75939xb282bd08 == 2) {
                    h17.m59411xd2df1a2a(cmdBufItem.m75939xb282bd08(2));
                } else if (m75939xb282bd08 == 4) {
                    pm0.v.X(new hb2.a0(cmdBufItem, h17));
                } else if (m75939xb282bd08 == 6 && (m76806xdef68064 = h17.getFeedObject().m76806xdef68064()) != null && (dn2Var = (r45.dn2) m76806xdef68064.m75936x14adae67(29)) != null) {
                    dn2Var.set(0, 2);
                    if (dn2Var.m75939xb282bd08(1) == 1) {
                        dn2Var.set(1, 2);
                    }
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32();
            long m59251x5db1b11 = h17.m59251x5db1b11();
            am.cb cbVar = c5467x4cfefe32.f135805g;
            cbVar.f87876a = m59251x5db1b11;
            c5467x4cfefe32.e();
            f361558e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361559f, "FinderExposeInfoChangeEvent scene:" + cmdBufItem.m75939xb282bd08(1) + " opType:" + cmdBufItem.m75939xb282bd08(2) + ' ' + cbVar.f87876a + ' ' + h17.m59219x7a8d6862());
            jVar.n(h17, bu2.i.f106059g);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            c5445x963cab3.f135785g.f88451a = h17.f66939xc8a07680;
            c5445x963cab3.e();
        }
    }

    public void n(long j17, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 4);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void o(long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObj, java.lang.String objectNonceId, r45.uh2 opType, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opType, "opType");
        boolean z17 = opType == r45.uh2.OpenComment;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        int i17 = z17 ? 2 : 1;
        o3Var.getClass();
        java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + i17 + ',' + o3Var.Ui(feedObj.m76784x5db1b11()) + ',' + feedObj.m76836x6c03c64c() + ',' + feedObj.m76791xf4204902() + ',' + feedObj.m76758x8ed22866() + ',' + feedObj.m76779xf67fd084();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18952 " + str);
        jx3.f.INSTANCE.mo68478xbd3cda5f(18952, str);
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 1);
        wh2Var.set(2, java.lang.Integer.valueOf(opType.f468915d));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void q(long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObj, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 7);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void r(long j17, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 8);
        wh2Var.set(2, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }
}
