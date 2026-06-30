package zd2;

/* loaded from: classes10.dex */
public final class d implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.d f553133a = new zd2.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f553134b = new java.util.concurrent.ConcurrentHashMap();

    public static final java.lang.String d(zd2.d dVar, java.util.List list) {
        java.lang.String str;
        dVar.getClass();
        cl0.e eVar = new cl0.e();
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.Map) {
                cl0.g gVar = new cl0.g();
                java.util.Map map = (java.util.Map) obj;
                java.lang.Object obj2 = map.get("product_id");
                if (obj2 == null || (str = obj2.toString()) == null) {
                    str = "";
                }
                gVar.h("product_id", str);
                java.lang.Object obj3 = map.get("count");
                java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                gVar.o("count", number != null ? number.intValue() : 1);
                eVar.q(gVar);
            }
        }
        java.lang.String mo15068x9616526c = eVar.mo15068x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15068x9616526c, "toString(...)");
        return mo15068x9616526c;
    }

    @Override // yd2.a
    public long a() {
        return 30000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [android.app.Activity] */
    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        jz5.l lVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14174x3055276b params = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14174x3055276b) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: prizeType=" + params.prizeType + ", winnerCount=" + params.winnerCount + ", attendType=" + params.attendType);
        int i17 = params.prizeType;
        if (i17 != 0 && i17 != 2) {
            lVar2 = new jz5.l(2121, "invalid prizeType: " + params.prizeType);
        } else if (params.winnerCount <= 0) {
            lVar2 = new jz5.l(2122, "invalid winnerCount: " + params.winnerCount);
        } else {
            boolean z17 = true;
            if (kz5.c0.i(1, 2, 3, 4, 5).contains(java.lang.Integer.valueOf(params.attendType))) {
                if (params.attendType == 3) {
                    java.lang.String str = params.attendComment;
                    if (str == null || str.length() == 0) {
                        lVar2 = new jz5.l(2124, "attendType=3 requires attendComment");
                    }
                }
                if (params.prizeType == 0) {
                    java.lang.String str2 = params.lotteryDescription;
                    if (str2 == null || str2.length() == 0) {
                        lVar2 = new jz5.l(2125, "Custom prize requires lotteryDescription");
                    } else if (params.claimType == null || kz5.n0.O(kz5.c0.i(0, 1, 2), params.claimType)) {
                        java.lang.Integer num = params.claimType;
                        if (num != null && num.intValue() == 2) {
                            java.lang.String str3 = params.claimRemindWording;
                            if (str3 == null || str3.length() == 0) {
                                lVar2 = new jz5.l(2127, "claimType=2 requires claimRemindWording");
                            }
                        }
                    } else {
                        lVar2 = new jz5.l(2126, "invalid claimType: " + params.claimType);
                    }
                }
                if (params.prizeType == 2) {
                    if (params.giftDistributeType == null || !kz5.n0.O(kz5.c0.i(0, 1), params.giftDistributeType)) {
                        lVar2 = new jz5.l(2128, "PackageGift requires valid giftDistributeType(0/1)");
                    } else {
                        java.util.List<?> list = params.giftItems;
                        if (list != null && !list.isEmpty()) {
                            z17 = false;
                        }
                        if (z17) {
                            lVar2 = new jz5.l(2129, "PackageGift requires giftItems");
                        }
                    }
                }
                lVar2 = null;
            } else {
                lVar2 = new jz5.l(2123, "invalid attendType: " + params.attendType);
            }
        }
        if (lVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lotteryCreate: validation failed: ");
            java.lang.String str4 = (java.lang.String) lVar2.f384367e;
            sb6.append(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", sb6.toString());
            completion.mo147xb9724478(java.lang.Boolean.FALSE, "{\"error\":\"" + str4 + "\"}", lVar2.f384366d);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        android.content.Context context2 = k0Var != null ? k0Var.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        gk2.e liveRoomData = c14197x319b1b9e != null ? c14197x319b1b9e.getLiveRoomData() : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no activity");
            completion.mo147xb9724478(java.lang.Boolean.FALSE, "{\"error\":\"no_vc\"}", 2101);
            return;
        }
        if (liveRoomData == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no buContext/liveTask");
            completion.mo147xb9724478(java.lang.Boolean.FALSE, "{\"error\":\"no_live_task\"}", 2102);
            return;
        }
        long m75942xfb822ef2 = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f410516m;
        java.lang.String str5 = ((mm2.c1) liveRoomData.a(mm2.c1.class)).f410385o;
        byte[] bArr = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f410518o;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? abstractActivityC21394xb3d2c0cf : null;
        if (abstractActivityC21394xb3d2c0cf2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no lifecycleScope");
            completion.mo147xb9724478(java.lang.Boolean.FALSE, "{\"error\":\"no_lifecycle_scope\"}", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9));
        } else {
            p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(abstractActivityC21394xb3d2c0cf2);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new zd2.c(completion, abstractActivityC21394xb3d2c0cf, m75942xfb822ef2, j17, bArr, str5, params, null), 2, null);
        }
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (dk2.ef.f314905a.e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no anchorCore");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        gk2.e liveRoomData = c14197x319b1b9e != null ? c14197x319b1b9e.getLiveRoomData() : null;
        if (liveRoomData != null && ((on2.z2) liveRoomData.a(on2.z2.class)).f428629q) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: lottery not enabled");
        return false;
    }

    public final void e(java.lang.String requestId, boolean z17, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        yz5.q qVar = (yz5.q) f553134b.remove(requestId);
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "onPrefillComplete: no pending callback for requestId=".concat(requestId));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "onPrefillComplete: requestId=" + requestId + ", success=" + z17 + ", errorCode=" + i17);
        if (z17) {
            qVar.mo147xb9724478(java.lang.Boolean.TRUE, "{\"error_code\":0}", 0);
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"error_code\":");
        sb6.append(i17);
        sb6.append(",\"error\":\"");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\"}");
        qVar.mo147xb9724478(bool, sb6.toString(), java.lang.Integer.valueOf(i17));
    }
}
