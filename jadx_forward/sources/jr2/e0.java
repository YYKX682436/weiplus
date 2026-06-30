package jr2;

/* loaded from: classes8.dex */
public final class e0 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinderHotWordsJumpMsg")) {
            return null;
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).qk().z0(false);
        r45.sb1 sb1Var = new r45.sb1();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "msg values: " + values);
        int i17 = 1;
        java.lang.String str2 = ".sysmsg.msg.infos";
        while (values.containsKey(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "prefix: " + str2);
            r45.tb1 tb1Var = new r45.tb1();
            tb1Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".start_time"), 0)));
            tb1Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".end_time"), 0)));
            tb1Var.set(2, (java.lang.String) values.get(str2 + ".key_word"));
            r45.rb1 rb1Var = new r45.rb1();
            rb1Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".jump_info.jump_dest"), 0)));
            rb1Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".jump_info.jump_scene"), 0)));
            rb1Var.set(2, (java.lang.String) values.get(str2 + ".jump_info.jump_bypass_info"));
            tb1Var.set(3, rb1Var);
            linkedList.add(tb1Var);
            str2 = ".sysmsg.msg.infos" + i17;
            i17++;
        }
        sb1Var.set(0, linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "transXmlToFinderKeyWordsJumpConfigMsg: " + sb1Var);
        java.util.LinkedList m75941xfb821914 = sb1Var.m75941xfb821914(0);
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            ((c61.l7) i95.n0.c(c61.l7.class)).qk().z0(true);
            return null;
        }
        java.util.LinkedList<r45.tb1> m75941xfb8219142 = sb1Var.m75941xfb821914(0);
        if (m75941xfb8219142 != null) {
            long j17 = 1;
            for (r45.tb1 tb1Var2 : m75941xfb8219142) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0 fj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0();
                long j18 = j17 + 1;
                fj0Var.f66248x88be67a1 = j17;
                r45.rb1 rb1Var2 = (r45.rb1) tb1Var2.m75936x14adae67(3);
                fj0Var.f66246xc2c3cbf9 = rb1Var2 != null ? rb1Var2.m75939xb282bd08(1) : -1;
                r45.rb1 rb1Var3 = (r45.rb1) tb1Var2.m75936x14adae67(3);
                fj0Var.f66245xe83a995 = rb1Var3 != null ? rb1Var3.m75939xb282bd08(0) : -1;
                fj0Var.f66250x1bb3b54a = tb1Var2.m75939xb282bd08(0);
                fj0Var.f66244x14c61803 = tb1Var2.m75939xb282bd08(1);
                fj0Var.f66247x43f93fc4 = tb1Var2.m75945x2fec8307(2);
                r45.rb1 rb1Var4 = (r45.rb1) tb1Var2.m75936x14adae67(3);
                fj0Var.f66249xac36557b = rb1Var4 != null ? rb1Var4.m75945x2fec8307(2) : null;
                ((c61.l7) i95.n0.c(c61.l7.class)).qk().y0(fj0Var);
                j17 = j18;
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).qk().mo145247xf35bbb4("SnsHotWord add data");
        return null;
    }
}
