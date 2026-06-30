package r01;

/* loaded from: classes8.dex */
public class g3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449620d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449621e;

    public g3(java.lang.String str, int i17, java.lang.String str2, java.util.LinkedList linkedList, java.lang.String str3) {
        this(str, i17, str2, linkedList, str3, 0, null, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449620d = u0Var;
        return mo9409x10f9447a(sVar, this.f449621e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 359;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.mj6 mj6Var;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f449621e;
            r45.z30 z30Var = (r45.z30) oVar.f152243a.f152217a;
            r45.a40 a40Var = (r45.a40) oVar.f152244b.f152233a;
            if (z30Var.f473194d == 10 && z30Var.f473196f != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(z30Var.f473196f) != null) {
                java.util.LinkedList linkedList = a40Var.f451247f;
                int i27 = 10002;
                int i28 = 2;
                if (linkedList == null || linkedList.size() <= 0) {
                    r45.pb7 pb7Var = a40Var.f451245d;
                    if (pb7Var != null) {
                        java.lang.String str2 = z30Var.f473196f;
                        if (pb7Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pb7Var.f464467f) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pb7Var.f464466e)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg tips is null");
                        } else {
                            int i29 = pb7Var.f464465d;
                            if (i29 != 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg %d", java.lang.Integer.valueOf(i29));
                            } else {
                                java.lang.String str3 = pb7Var.f464466e;
                                java.lang.String str4 = pb7Var.f464467f;
                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<sysmsg type=\"biz_services_mute\"><biz_services_mute><text><![CDATA[");
                                stringBuffer.append(str3);
                                stringBuffer.append("]]></text><link><scene>biz_services_mute</scene><text><![CDATA[");
                                stringBuffer.append(str4);
                                stringBuffer.append("]]></text></link></biz_services_mute></sysmsg>");
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                f9Var.u1(str2);
                                f9Var.j1(2);
                                f9Var.m124850x7650bebc(10002);
                                f9Var.e1(c01.w9.p());
                                f9Var.d1(stringBuffer.toString());
                                c01.w9.x(f9Var);
                            }
                        }
                    }
                } else {
                    if (a40Var.f451246e != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().H("key_cookie_" + z30Var.f473196f, a40Var.f451246e.f273689a);
                    }
                    java.util.LinkedList linkedList2 = a40Var.f451247f;
                    java.lang.String str5 = z30Var.f473196f;
                    if (linkedList2 != null && linkedList2.size() != 0) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        int i37 = 0;
                        while (i37 < linkedList2.size() && (mj6Var = (r45.mj6) linkedList2.get(i37)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj6Var.f462127e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj6Var.f462128f)) {
                            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<sysmsg type=\"biz_sys_msg_tips\"><biz_sys_msg_tips><text><![CDATA[");
                            stringBuffer2.append(mj6Var.f462127e);
                            stringBuffer2.append("]]></text><link><scene>biz_sys_msg_tips</scene><text><![CDATA[");
                            stringBuffer2.append(mj6Var.f462128f);
                            stringBuffer2.append("]]></text><action_type>");
                            stringBuffer2.append(mj6Var.f462126d);
                            stringBuffer2.append("</action_type></link></biz_sys_msg_tips></sysmsg>");
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                            f9Var2.u1(str5);
                            f9Var2.j1(i28);
                            f9Var2.m124850x7650bebc(i27);
                            f9Var2.e1(c01.w9.p());
                            f9Var2.d1(stringBuffer2.toString());
                            c01.w9.x(f9Var2);
                            if (i37 != 0) {
                                sb6.append(";");
                            }
                            sb6.append(mj6Var.f462127e + mj6Var.f462128f);
                            i37++;
                            i27 = 10002;
                            i28 = 2;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30451, str5, sb6, 0, 1);
                    }
                }
            }
            r45.pb7 pb7Var2 = a40Var.f451245d;
        }
        this.f449620d.mo815x76e0bfae(i18, i19, str, this);
    }

    public g3(java.lang.String str, int i17, java.lang.String str2, java.util.LinkedList linkedList, java.lang.String str3, int i18, r45.j16 j16Var, r45.l36 l36Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z30();
        lVar.f152198b = new r45.a40();
        lVar.f152199c = "/cgi-bin/micromsg-bin/clickcommand";
        lVar.f152200d = 359;
        lVar.f152201e = 176;
        lVar.f152202f = 1000000176;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449621e = a17;
        r45.z30 z30Var = (r45.z30) a17.f152243a.f152217a;
        z30Var.f473194d = i17;
        z30Var.f473195e = str2;
        z30Var.f473196f = str;
        z30Var.f473197g = c01.ia.n();
        z30Var.f473199i = i18;
        z30Var.f473200m = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        z30Var.f473203p = str3;
        if (linkedList != null) {
            z30Var.f473198h = linkedList;
        }
        if (j16Var != null) {
            z30Var.f473201n = j16Var;
        }
        if (l36Var != null) {
            z30Var.f473202o = l36Var;
        }
        if (i17 == 14) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().W("key_cookie_" + str);
        } else if (i17 == 10) {
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().j("key_cookie_" + str);
            if (j17 != null) {
                z30Var.f473204q = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(j17, 0, j17.length);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d, scene %d", str, java.lang.Integer.valueOf(i17), str2, z30Var.f473197g, java.lang.Integer.valueOf(z30Var.f473198h.size()), java.lang.Integer.valueOf(i18));
    }
}
