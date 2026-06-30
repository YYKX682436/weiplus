package jr2;

/* loaded from: classes4.dex */
public final class y implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FINDER_MENTION_LIST_INTERACTION_JUMP_CONFIG")) {
            r45.et5 et5Var = new r45.et5();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "msg values: " + values);
            java.lang.String str2 = ".sysmsg.RewardTipsInfoList.rewardTipsInfos";
            int i17 = 1;
            while (values.containsKey(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "prefix: " + str2);
                r45.dt5 dt5Var = new r45.dt5();
                for (java.util.Map.Entry entry : values.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry.getKey();
                    java.lang.String str4 = (java.lang.String) entry.getValue();
                    if (r26.i0.A(str3, str2 + ".triggerType", false, 2, null)) {
                        dt5Var.m75941xfb821914(0).add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str4, 0)));
                    }
                }
                dt5Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".jumpType"), 0)));
                dt5Var.set(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(str2 + ".showType"), 0)));
                dt5Var.set(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1((java.lang.String) values.get(str2 + ".h5Link"), new java.lang.Object[0]));
                dt5Var.set(4, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) values.get(str2 + ".expireTime"))));
                linkedList.add(dt5Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "RewardTipsInfo, index: " + i17 + ", triggerType: " + dt5Var.m75941xfb821914(0) + ", jumpType: " + dt5Var.m75939xb282bd08(1) + ", showType: " + dt5Var.m75939xb282bd08(2) + ", link: " + dt5Var.m75945x2fec8307(3) + ", expireTime: " + dt5Var.m75942xfb822ef2(4));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".sysmsg.RewardTipsInfoList.rewardTipsInfos");
                sb6.append(i17);
                str2 = sb6.toString();
                i17++;
            }
            et5Var.set(0, linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "transXmlToFinderKeyWordsJumpConfigMsg: " + et5Var);
            if (et5Var.m75941xfb821914(0).size() > 0) {
                try {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(et5Var.mo14344x5f01b1f6()));
                } catch (java.lang.Exception unused) {
                }
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, "");
            }
        }
        return null;
    }
}
