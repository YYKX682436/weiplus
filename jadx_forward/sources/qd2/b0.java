package qd2;

/* loaded from: classes2.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f443236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f443237c;

    public b0(android.content.Context context, int i17, int i18) {
        this.f443235a = context;
        this.f443236b = i17;
        this.f443237c = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List] */
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "getFinderObject result errType:" + fVar.f152148a + " errCode:" + fVar.f152149b);
        int i18 = fVar.f152148a;
        android.content.Context context = this.f443235a;
        if (i18 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                qd2.d0 d0Var = qd2.d0.f443247a;
                android.content.Context context2 = this.f443235a;
                int i19 = this.f443236b;
                int i27 = this.f443237c;
                long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                int j17 = hc2.o0.j(c19792x256d2725);
                if (4 != j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] return due to not video, mediaType:" + j17 + " feedId:" + pm0.v.u(m76784x5db1b11));
                    d0Var.b(context2, true);
                } else {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                    java.util.LinkedList h17 = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : bu2.z.h(m76962x74cd162e);
                    if (h17 == null || h17.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] return due to has no video, feedId=".concat(pm0.v.u(m76784x5db1b11)));
                        d0Var.b(context2, true);
                    } else {
                        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(h17);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[downloadVideo] before filter, mediaSpecs size:");
                        sb6.append(mb4Var.m75941xfb821914(15).size());
                        sb6.append(" list:");
                        java.util.LinkedList m75941xfb821914 = mb4Var.m75941xfb821914(15);
                        java.lang.String str5 = "getSpec(...)";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSpec(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (true) {
                            str = " bitRate:";
                            str2 = str5;
                            str3 = "[fileFormat:";
                            i17 = i27;
                            str4 = " codingFormat:";
                            if (!it.hasNext()) {
                                break;
                            }
                            r45.vf2 vf2Var = (r45.vf2) it.next();
                            arrayList.add("[fileFormat:" + vf2Var.m75945x2fec8307(0) + " codingFormat:" + vf2Var.m75945x2fec8307(3) + " bitRate:" + vf2Var.m75939xb282bd08(2) + " ]");
                            str5 = str2;
                            it = it;
                            i27 = i17;
                            i19 = i19;
                        }
                        int i28 = i19;
                        sb6.append(arrayList);
                        sb6.append(" feedId:");
                        sb6.append(pm0.v.u(m76784x5db1b11));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", sb6.toString());
                        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
                        java.lang.String str6 = "";
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        java.util.Iterator it6 = cu2.x.f303982a.d(m75945x2fec8307).iterator();
                        while (true) {
                            java.lang.String str7 = " fileSize:";
                            java.lang.String str8 = str6;
                            java.lang.String str9 = " filePath:";
                            java.lang.String str10 = str;
                            if (it6.hasNext()) {
                                so2.i3 i3Var = (so2.i3) it6.next();
                                java.util.Iterator it7 = it6;
                                java.lang.String str11 = str4;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[queryByOriginalMediaId] originMediaId:" + m75945x2fec8307 + " fileFormat:" + i3Var.f68976xe1500f8);
                                if (i3Var.A0() && d0Var.a(i3Var.u0())) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] exist, originMediaId:" + m75945x2fec8307 + " fileFormat:" + i3Var.f68976xe1500f8 + " filePath:" + i3Var.u0() + " fileSize:" + o35.a.g(i3Var.u0()) + " feedId:" + pm0.v.u(m76784x5db1b11));
                                    d0Var.c(context2, c19792x256d2725, i3Var.u0(), i28, i17);
                                    break;
                                }
                                str6 = str8;
                                str = str10;
                                it6 = it7;
                                str4 = str11;
                            } else {
                                java.lang.String str12 = str4;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.util.LinkedList m75941xfb8219142 = mb4Var.m75941xfb821914(15);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, str2);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (java.lang.Object obj2 : m75941xfb8219142) {
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c19792x256d2725;
                                    android.content.Context context3 = context2;
                                    java.lang.String str13 = str7;
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.vf2) obj2).m75945x2fec8307(3), "h265")) {
                                        arrayList3.add(obj2);
                                    }
                                    c19792x256d2725 = c19792x256d27252;
                                    context2 = context3;
                                    str7 = str13;
                                }
                                android.content.Context context4 = context2;
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = c19792x256d2725;
                                java.lang.String str14 = str7;
                                boolean z17 = !arrayList3.isEmpty();
                                java.util.ArrayList arrayList4 = arrayList3;
                                if (!z17) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    for (java.lang.Object obj3 : m75941xfb8219142) {
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.vf2) obj3).m75945x2fec8307(3), "h264")) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    boolean z18 = !arrayList5.isEmpty();
                                    arrayList4 = arrayList5;
                                    if (!z18) {
                                        r45.vf2 vf2Var2 = new r45.vf2();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
                                        vf2Var2.set(0, "xV0");
                                        arrayList4 = kz5.b0.c(vf2Var2);
                                    }
                                }
                                arrayList2.addAll(arrayList4);
                                if (arrayList2.size() > 1) {
                                    kz5.g0.t(arrayList2, new qd2.a0());
                                }
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[downloadVideo] after filter, mediaSpecs size:");
                                sb7.append(arrayList2.size());
                                sb7.append(" list:");
                                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                                java.util.Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    r45.vf2 vf2Var3 = (r45.vf2) it8.next();
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str3);
                                    java.lang.String str15 = str3;
                                    sb8.append(vf2Var3.m75945x2fec8307(0));
                                    java.lang.String str16 = str12;
                                    sb8.append(str16);
                                    sb8.append(vf2Var3.m75945x2fec8307(3));
                                    sb8.append(str10);
                                    sb8.append(vf2Var3.m75939xb282bd08(2));
                                    sb8.append(']');
                                    arrayList6.add(sb8.toString());
                                    it8 = it8;
                                    str9 = str9;
                                    str12 = str16;
                                    str3 = str15;
                                }
                                java.lang.String str17 = str12;
                                java.lang.String str18 = str9;
                                sb7.append(arrayList6);
                                sb7.append(" feedId:");
                                sb7.append(pm0.v.u(m76784x5db1b11));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", sb7.toString());
                                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.K0).mo141623x754a37bb()).r()).intValue();
                                qd2.z[] zVarArr = qd2.z.f443390d;
                                r45.vf2 vf2Var4 = intValue == 2 ? (r45.vf2) kz5.n0.i0(arrayList2) : intValue == 1 ? (r45.vf2) arrayList2.get(arrayList2.size() / 2) : (r45.vf2) kz5.n0.X(arrayList2);
                                yr2.g gVar = yr2.k.X;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 c17 = gVar.c(vf2Var4.m75945x2fec8307(0));
                                java.lang.String m75945x2fec83072 = vf2Var4.m75945x2fec8307(0);
                                java.lang.String m75945x2fec83073 = vf2Var4.m75945x2fec8307(3);
                                if (m75945x2fec83073 == null) {
                                    m75945x2fec83073 = str8;
                                }
                                mn2.g4 g4Var = new mn2.g4(mb4Var, c17, m75945x2fec83072, gVar.b(m75945x2fec83073), 0, null, false, null, 240, null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] mediaType:" + j17 + " fileFormat:" + vf2Var4.m75945x2fec8307(0) + str17 + vf2Var4.m75945x2fec8307(3) + "bitRate:" + vf2Var4.m75939xb282bd08(2) + "} filePath:" + g4Var.mo148083xfb83cc9b() + " url:" + g4Var.mo148084xb5887639() + " feedId:" + pm0.v.u(m76784x5db1b11));
                                java.lang.String mo148083xfb83cc9b = g4Var.mo148083xfb83cc9b();
                                if (d0Var.a(mo148083xfb83cc9b)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] target exist, originMediaId:" + m75945x2fec8307 + str18 + g4Var.mo148083xfb83cc9b() + str14 + o35.a.g(mo148083xfb83cc9b) + " feedId:" + pm0.v.u(m76784x5db1b11));
                                    d0Var.c(context4, c19792x256d27253, g4Var.mo148083xfb83cc9b(), i28, i17);
                                } else {
                                    qd2.y yVar = new qd2.y(context4, c19792x256d27253, i28, i17);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d27253, 0);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac820 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820(context4);
                                    qd2.d0.f443248b = c15199x5a7ac820;
                                    c15199x5a7ac820.o0(g4Var, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(a17));
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8202 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8202 != null) {
                                        c15199x5a7ac8202.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8203 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8203 != null) {
                                        c15199x5a7ac8203.m48235xbc2f47ad(new mn2.c4(new mn2.e4(0, null, 2, null), g4Var, yVar));
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8204 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8204 != null) {
                                        c15199x5a7ac8204.mo64629xc2e9d13b(false);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8205 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8205 != null) {
                                        c15199x5a7ac8205.mo48236x764cf626(true);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8206 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8206 != null) {
                                        c15199x5a7ac8206.mo61536x764d819b(true);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8207 = qd2.d0.f443248b;
                                    if (c15199x5a7ac8207 != null) {
                                        c15199x5a7ac8207.mo48238x68ac462();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8208 = qd2.d0.f443248b;
                if (c15199x5a7ac8208 != null) {
                    c15199x5a7ac8208.mo48239x360802();
                }
                qd2.d0.f443248b = null;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = qd2.d0.f443249c;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                qd2.d0.f443249c = null;
                db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.eqz, 0).show();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8209 = qd2.d0.f443248b;
            if (c15199x5a7ac8209 != null) {
                c15199x5a7ac8209.mo48239x360802();
            }
            qd2.d0.f443248b = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = qd2.d0.f443249c;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            qd2.d0.f443249c = null;
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.eqz, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
