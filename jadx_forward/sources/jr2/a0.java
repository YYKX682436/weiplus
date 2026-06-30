package jr2;

/* loaded from: classes8.dex */
public final class a0 implements vg3.q4 {
    public final java.util.ArrayList b(r45.or2 or2Var, int[] iArr) {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.o55> m75941xfb821914 = or2Var.m75941xfb821914(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPath_infos(...)");
        for (r45.o55 o55Var : m75941xfb821914) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o55Var.m75939xb282bd08(0));
            r45.kb7 kb7Var = (r45.kb7) o55Var.m75936x14adae67(1);
            if (kb7Var == null) {
                kb7Var = new r45.kb7();
            }
            hashMap.put(valueOf, kb7Var);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            r45.kb7 kb7Var2 = (r45.kb7) hashMap.get(java.lang.Integer.valueOf(i17));
            if (kb7Var2 != null) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? kb7Var2.m75945x2fec8307(0) : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? kb7Var2.m75945x2fec8307(1) : !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? kb7Var2.m75945x2fec8307(2) : kb7Var2.m75945x2fec8307(0);
                if (str != null) {
                    arrayList.add(str);
                }
            }
            str = "";
            arrayList.add(str);
        }
        return arrayList;
    }

    public final r45.or2 c(java.util.Map map) {
        r45.or2 or2Var = new r45.or2();
        or2Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.priority"), 0)));
        or2Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_action"), 0)));
        or2Var.set(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.start_time"), 0)));
        or2Var.set(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.end_time"), 0)));
        or2Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_type"), 0)));
        or2Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_ext"), 0)));
        r45.um4 um4Var = new r45.um4();
        um4Var.set(0, (java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_name"));
        um4Var.set(1, (java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_path"));
        um4Var.set(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_scene"), 0)));
        or2Var.set(6, um4Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 1;
        java.lang.String str = ".sysmsg.msg.path_info";
        while (map.containsKey(str)) {
            r45.kb7 kb7Var = new r45.kb7();
            kb7Var.set(0, (java.lang.String) map.get(str + ".wording.zh_cn"));
            kb7Var.set(1, (java.lang.String) map.get(str + ".wording.zh_tw"));
            kb7Var.set(2, (java.lang.String) map.get(str + ".wording.en"));
            r45.o55 o55Var = new r45.o55();
            o55Var.set(1, kb7Var);
            o55Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".msg_position"), 0)));
            linkedList.add(o55Var);
            str = ".sysmsg.msg.path_info" + i17;
            i17++;
        }
        or2Var.set(7, linkedList);
        return or2Var;
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 p27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p27, "p2");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinderPromotion")) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionConsumer", "[FinderPromotionConsumer]");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_type"), 0);
        if (D1 != 1) {
            if (D1 != 2) {
                return null;
            }
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_action"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackWx] msgAction:" + D12);
            if (D12 != 1) {
                if (D12 != 2) {
                    return null;
                }
                zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1016, null, null, 6, null);
                return null;
            }
            r45.or2 c17 = c(values);
            java.util.ArrayList b17 = b(c17, new int[]{1});
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f470023h = java.lang.String.valueOf(c01.id.c());
            vs2Var.f470019d = c17.m75939xb282bd08(0);
            vs2Var.f470020e = 1016;
            r45.xs2 xs2Var = new r45.xs2();
            xs2Var.set(10, 1);
            r45.um4 um4Var = (r45.um4) c17.m75936x14adae67(6);
            xs2Var.set(11, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(um4Var != null ? um4Var.mo14344x5f01b1f6() : null));
            vs2Var.f470021f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(xs2Var.mo14344x5f01b1f6());
            vs2Var.f470025m = c17.m75939xb282bd08(2);
            int m75939xb282bd08 = c17.m75939xb282bd08(3) - c01.id.e();
            if (m75939xb282bd08 < 0) {
                m75939xb282bd08 = 0;
            }
            vs2Var.f470024i = m75939xb282bd08;
            r45.f03 f03Var = new r45.f03();
            f03Var.f455420d = 20;
            java.lang.String str2 = (java.lang.String) kz5.n0.a0(b17, 0);
            f03Var.f455422f = str2 != null ? str2 : "";
            f03Var.f455424h = 1;
            f03Var.f455425i = "CreateFinderEntrance";
            vs2Var.f470022g.add(f03Var);
            zy2.fa.D(nk6, vs2Var, "checkFinderRedPackRedDot", null, true, null, 20, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + vs2Var.f470025m + ", endtime" + c17.m75939xb282bd08(3) + ", title:" + f03Var.f455422f + ", expire_time" + vs2Var.f470024i);
            return null;
        }
        int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_action"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] msgAction:" + D13);
        if (D13 != 1) {
            if (D13 != 2) {
                return null;
            }
            zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1015, null, null, 6, null);
            return null;
        }
        r45.or2 c18 = c(values);
        java.util.ArrayList b18 = b(c18, new int[]{2, 3});
        zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.vs2 vs2Var2 = new r45.vs2();
        vs2Var2.f470023h = java.lang.String.valueOf(c01.id.c());
        vs2Var2.f470019d = 0;
        vs2Var2.f470020e = 1015;
        r45.xs2 xs2Var2 = new r45.xs2();
        xs2Var2.set(10, 1);
        r45.um4 um4Var2 = (r45.um4) c18.m75936x14adae67(6);
        xs2Var2.set(11, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(um4Var2 != null ? um4Var2.mo14344x5f01b1f6() : null));
        vs2Var2.f470021f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(xs2Var2.mo14344x5f01b1f6());
        vs2Var2.f470025m = c18.m75939xb282bd08(2);
        int m75939xb282bd082 = c18.m75939xb282bd08(3) - c01.id.e();
        if (m75939xb282bd082 < 0) {
            m75939xb282bd082 = 0;
        }
        vs2Var2.f470024i = m75939xb282bd082;
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f455420d = 3;
        java.lang.String str3 = (java.lang.String) kz5.n0.a0(b18, 0);
        if (str3 == null) {
            str3 = "";
        }
        f03Var2.f455422f = str3;
        f03Var2.f455424h = 1;
        f03Var2.f455425i = "ProfileEntrance";
        vs2Var2.f470022g.add(f03Var2);
        r45.f03 f03Var3 = new r45.f03();
        f03Var3.f455420d = 20;
        java.lang.String str4 = (java.lang.String) kz5.n0.a0(b18, 1);
        f03Var3.f455422f = str4 != null ? str4 : "";
        f03Var3.f455424h = 1;
        f03Var3.f455425i = "FinderProfileBanner";
        f03Var3.f455426m = "ProfileEntrance";
        vs2Var2.f470022g.add(f03Var3);
        zy2.fa.D(nk7, vs2Var2, "checkFinderRedPackRedDot", null, true, null, 20, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + vs2Var2.f470025m + ", endtime" + c18.m75939xb282bd08(3) + ", title1:" + f03Var2.f455422f + " ,title2:" + f03Var3.f455422f + ", expire_time" + vs2Var2.f470024i);
        return null;
    }
}
