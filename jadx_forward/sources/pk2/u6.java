package pk2;

/* loaded from: classes3.dex */
public abstract class u6 {
    public static final void a(pk2.o9 o9Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        df2.zb zbVar;
        df2.zb zbVar2;
        df2.zb zbVar3;
        df2.zb zbVar4;
        df2.zb zbVar5;
        df2.zb zbVar6;
        df2.zb zbVar7;
        pk2.g8 g8Var;
        hn0.r rVar;
        pk2.g8 g8Var2;
        df2.k9 k9Var;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        lu2.j jVar = lu2.j.f402909a;
        int i18 = o9Var.f437640r0;
        java.lang.String str3 = "";
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o9Var.f437611d;
        if (i17 == i18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (zl2.r4.f555483a.w1()) {
                str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183995c;
            } else {
                str2 = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184267c.get("RV_VISITOR_" + ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                if (str2 == null) {
                    str2 = "";
                }
            }
            jVar.a(activity, str2, "");
            return;
        }
        if (i17 == o9Var.f437642s0) {
            if (zl2.q4.f555466a.E()) {
                mm2.k2.f410725h = !mm2.k2.f410725h;
                return;
            }
            return;
        }
        int i19 = o9Var.E0;
        gk2.e liveData = o9Var.f437607b;
        if (i17 == i19) {
            am2.s0 s0Var = new am2.s0(activity, liveData, o9Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) s0Var.f90274a, 1, false);
            k0Var.f293405n = am2.z.f90311d;
            k0Var.f293414s = new am2.b0(s0Var);
            k0Var.v();
            return;
        }
        if (i17 == o9Var.H0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, false);
            k0Var2.f293405n = am2.f2.f90201d;
            k0Var2.f293414s = am2.g2.f90206d;
            k0Var2.v();
            return;
        }
        if (i17 == o9Var.f437646u0) {
            am2.x0 x0Var = new am2.x0(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) x0Var.f90301a, 1, false);
            k0Var3.f293405n = am2.v0.f90293d;
            k0Var3.f293414s = new am2.w0(x0Var);
            k0Var3.v();
            return;
        }
        if (i17 == o9Var.f437648v0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            if (c19792x256d2725 == null || (str = c19792x256d2725.m76763xcfb260aa()) == null || android.text.TextUtils.isEmpty(str)) {
                str = "empty msg.";
            }
            lu2.j.b(jVar, o9Var.f437611d, str, null, 4, null);
            return;
        }
        if (i17 == o9Var.f437644t0) {
            am2.s1 s1Var = new am2.s1(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) s1Var.f90278a, 1, false);
            k0Var4.f293405n = new am2.r1(s1Var);
            k0Var4.v();
            return;
        }
        if (i17 == o9Var.f437654y0) {
            am2.e2 e2Var = new am2.e2(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) e2Var.f90194a, 1, false);
            k0Var5.f293405n = new am2.d2(e2Var);
            k0Var5.v();
            return;
        }
        int i27 = o9Var.A0;
        pk2.d9 d9Var = o9Var.f437615f;
        if (i17 == i27) {
            if (d9Var == null || (g8Var2 = d9Var.f437191a) == null || (k9Var = (df2.k9) ((pk2.k9) g8Var2).f437457a.m56789x25fe639c(df2.k9.class)) == null) {
                return;
            }
            r45.ii1 ii1Var = new r45.ii1();
            ii1Var.set(0, "2");
            k9Var.Z6(ii1Var);
            return;
        }
        if (i17 == o9Var.B0) {
            am2.h hVar = new am2.h(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var6 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) hVar.f90209a, 1, false);
            k0Var6.f293405n = new am2.g(hVar);
            k0Var6.v();
            return;
        }
        if (i17 == o9Var.C0) {
            am2.v vVar = new am2.v(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var7 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) vVar.f90291a, 1, false);
            k0Var7.f293405n = new am2.u(vVar);
            k0Var7.v();
            return;
        }
        if (i17 == o9Var.D0) {
            am2.p pVar = new am2.p(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var8 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) pVar.f90259a, 1, false);
            k0Var8.f293405n = new am2.o(pVar);
            k0Var8.v();
            return;
        }
        if (i17 == o9Var.F0) {
            am2.g3 g3Var = new am2.g3(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var9 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) g3Var.f90207a, 1, false);
            k0Var9.f293405n = new am2.f3(g3Var);
            k0Var9.v();
            return;
        }
        if (i17 == o9Var.G0) {
            am2.x2 x2Var = new am2.x2(activity, liveData);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var10 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) x2Var.f90305a, 1, false);
            k0Var10.f293405n = new am2.w2(x2Var);
            k0Var10.v();
            return;
        }
        if (i17 == o9Var.f437650w0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (r4Var.x1()) {
                if (in0.q.f374302b2 == null) {
                    in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
                }
                in0.q qVar = in0.q.f374302b2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                str3 = java.lang.String.valueOf(qVar.hashCode());
            } else {
                co0.s u07 = dk2.ef.f314905a.u0();
                if (u07 != null && (rVar = u07.R1) != null) {
                    str3 = rVar.d();
                }
            }
            java.lang.String str4 = "onLine: " + ((mm2.k2) o9Var.c(mm2.k2.class)).f410727g + "\n " + ((mm2.k2) o9Var.c(mm2.k2.class)).N6(r4Var.x1(), str3);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activity.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            jVar.a(mo55332x76847179, str4, str3);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var11 = null;
        if (i17 == o9Var.K0) {
            if (d9Var != null && (g8Var = d9Var.f437191a) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ((pk2.k9) g8Var).f437457a.f372632e;
                if (ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) {
                    k0Var11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar;
                }
            }
            if (k0Var11 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o9Var.f437605a, "clickDumpViewHierarchy: pluginLayout is null");
                return;
            }
            zl2.l5 l5Var = zl2.l5.f555417a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            l5Var.a(k0Var11, 0, sb6);
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewHierarchyDumper", "=== Hierarchy Dump: Hierarchy ===");
            java.util.Iterator it = r26.n0.Q(sb7).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewHierarchyDumper", (java.lang.String) it.next());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewHierarchyDumper", "=== End Dump: Hierarchy ===");
            return;
        }
        if (i17 == o9Var.L0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e2 = dk2.ef.f314904J;
            if (c14197x319b1b9e2 == null || (zbVar7 = (df2.zb) c14197x319b1b9e2.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            zbVar7.o7("simulate");
            return;
        }
        if (i17 == o9Var.M0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e3 = dk2.ef.f314904J;
            if (c14197x319b1b9e3 == null || (zbVar6 = (df2.zb) c14197x319b1b9e3.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            yd2.b bVar = new yd2.b(zbVar6.k7(), ((mm2.e1) zbVar6.getStore().getLiveRoomData().a(mm2.e1.class)).f410516m, "mock_session_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), "", ((mm2.c1) zbVar6.getStore().getLiveRoomData().a(mm2.c1.class)).f410385o);
            java.util.List c17 = kz5.b0.c(new yd2.n("mock_flip_" + java.lang.System.currentTimeMillis(), "camera::flip", "1.0.0", null));
            yg2.b bVar2 = zbVar6.getStore().getLiveRoomData().f354008i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar6.f313472m, "[aiAssistant] mockFlipCamera: dispatching");
            zbVar6.f313473n.d(c17, bVar, bVar2, new df2.ua(zbVar6));
            return;
        }
        if (i17 == o9Var.N0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e4 = dk2.ef.f314904J;
            if (c14197x319b1b9e4 == null || (zbVar5 = (df2.zb) c14197x319b1b9e4.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            yd2.b bVar3 = new yd2.b(zbVar5.k7(), ((mm2.e1) zbVar5.getStore().getLiveRoomData().a(mm2.e1.class)).f410516m, "mock_session_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), "", ((mm2.c1) zbVar5.getStore().getLiveRoomData().a(mm2.c1.class)).f410385o);
            java.util.List c18 = kz5.b0.c(new yd2.n("mock_echo_" + java.lang.System.currentTimeMillis(), "debug::echo", "1.0.0", "{\"message\":\"Hello from debug mock\"}"));
            yg2.b bVar4 = zbVar5.getStore().getLiveRoomData().f354008i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar5.f313472m, "[aiAssistant] mockEcho: dispatching");
            zbVar5.f313473n.d(c18, bVar3, bVar4, new df2.ta(zbVar5));
            return;
        }
        if (i17 == o9Var.O0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e5 = dk2.ef.f314904J;
            if (c14197x319b1b9e5 == null || (zbVar4 = (df2.zb) c14197x319b1b9e5.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            yd2.b c76 = zbVar4.c7();
            java.util.List c19 = kz5.b0.c(new yd2.n("mock_lottery_custom_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":0,\"winnerCount\":5,\"durationMinutes\":5,\"attendType\":3,\"attendComment\":\"抽奖\",\"allowRepeatWin\":false,\"lotteryDescription\":\"小猫周边大礼包\",\"claimType\":0}"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar4.f313472m, "[aiAssistant] mockLotteryCreateCustom: dispatching");
            zbVar4.f313473n.d(c19, c76, zbVar4.getStore().getLiveRoomData().f354008i, new df2.va(zbVar4));
            return;
        }
        if (i17 == o9Var.P0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e6 = dk2.ef.f314904J;
            if (c14197x319b1b9e6 == null || (zbVar3 = (df2.zb) c14197x319b1b9e6.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            yd2.b c77 = zbVar3.c7();
            java.util.List c27 = kz5.b0.c(new yd2.n("mock_lottery_custom_claim_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":0,\"winnerCount\":3,\"durationMinutes\":3,\"attendType\":1,\"allowRepeatWin\":true,\"lotteryDescription\":\"现金红包\",\"claimType\":2,\"claimRemindWording\":\"加主播微信领取\"}"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar3.f313472m, "[aiAssistant] mockLotteryCreateCustomClaim: dispatching");
            zbVar3.f313473n.d(c27, c77, zbVar3.getStore().getLiveRoomData().f354008i, new df2.wa(zbVar3));
            return;
        }
        if (i17 == o9Var.Q0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e7 = dk2.ef.f314904J;
            if (c14197x319b1b9e7 == null || (zbVar2 = (df2.zb) c14197x319b1b9e7.m56798x25fe639c(df2.zb.class)) == null) {
                return;
            }
            yd2.b c78 = zbVar2.c7();
            java.util.List c28 = kz5.b0.c(new yd2.n("mock_lottery_gift_same_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":2,\"winnerCount\":3,\"durationMinutes\":5,\"attendType\":2,\"allowRepeatWin\":false,\"giftDistributeType\":0,\"giftItems\":[{\"product_id\":\"FAKE_PRODUCT_ID_FOR_MOCK\",\"count\":1}]}"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar2.f313472m, "[aiAssistant] mockLotteryCreateGift: dispatching");
            zbVar2.f313473n.d(c28, c78, zbVar2.getStore().getLiveRoomData().f354008i, new df2.xa(zbVar2));
            return;
        }
        if (i17 != o9Var.R0 || (c14197x319b1b9e = dk2.ef.f314904J) == null || (zbVar = (df2.zb) c14197x319b1b9e.m56798x25fe639c(df2.zb.class)) == null) {
            return;
        }
        yd2.b c79 = zbVar.c7();
        java.util.List c29 = kz5.b0.c(new yd2.n("mock_lottery_gift_random_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":2,\"winnerCount\":5,\"durationMinutes\":5,\"attendType\":4,\"allowRepeatWin\":false,\"giftDistributeType\":1,\"giftItems\":[{\"product_id\":\"FAKE_PRODUCT_ID_FOR_MOCK\",\"count\":3}]}"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar.f313472m, "[aiAssistant] mockLotteryCreateGiftRandom: dispatching");
        zbVar.f313473n.d(c29, c79, zbVar.getStore().getLiveRoomData().f354008i, new df2.ya(zbVar));
    }
}
