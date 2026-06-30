package ec3;

/* loaded from: classes9.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f332631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332633f;

    public x(com.p314xaae8f345.mm.p944x882e457a.f fVar, ec3.g1 g1Var, java.lang.String str) {
        this.f332631d = fVar;
        this.f332632e = g1Var;
        this.f332633f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c17;
        java.lang.String str;
        char c18;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f332631d;
        int i17 = fVar.f152148a;
        java.lang.String str3 = this.f332633f;
        ec3.g1 g1Var = this.f332632e;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar2;
            if ((m0Var != null ? m0Var.f226972d : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar2;
                int size = (m0Var2 == null || (linkedList = m0Var2.f226972d) == null) ? 0 : linkedList.size();
                java.lang.String a76 = g1Var.a7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp success, requestContent: " + str3 + ",nowEditText: " + a76 + ", dataSize：" + size);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, a76)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp：inputContent != nowEditText, ignore");
                    java.lang.String u17 = pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f);
                    java.util.LinkedList recommended_cover_list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list, "recommended_cover_list");
                    java.lang.String g07 = kz5.n0.g0(recommended_cover_list, "&", null, null, 0, null, ec3.v.f332627d, 30, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[12];
                    objArr[0] = 14;
                    objArr[1] = 0;
                    objArr[2] = g1Var.f332559w;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
                    if (activityC16373x8a110f13 != null) {
                        str = activityC16373x8a110f13.s7();
                        c17 = 3;
                    } else {
                        c17 = 3;
                        str = null;
                    }
                    objArr[c17] = str;
                    objArr[4] = "";
                    objArr[5] = "";
                    objArr[6] = str3;
                    objArr[7] = java.lang.Integer.valueOf(size);
                    objArr[8] = g07;
                    objArr[9] = 0;
                    objArr[10] = u17;
                    objArr[11] = 0;
                    g0Var.d(18890, objArr);
                    return;
                }
                g1Var.f332547h = true;
                g1Var.C = 0;
                if (!(1 <= size && size < 4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp : dataSize illegal, reset");
                    ec3.g1.d7(g1Var, false, 1, null);
                    g1Var.S6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[12];
                    objArr2[0] = 14;
                    objArr2[1] = 0;
                    objArr2[2] = g1Var.f332559w;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = g1Var.m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
                    if (activityC16373x8a110f132 != null) {
                        str2 = activityC16373x8a110f132.s7();
                        c18 = 3;
                    } else {
                        c18 = 3;
                        str2 = null;
                    }
                    objArr2[c18] = str2;
                    objArr2[4] = "";
                    objArr2[5] = "";
                    objArr2[6] = str3;
                    objArr2[7] = 0;
                    objArr2[8] = "";
                    objArr2[9] = 0;
                    objArr2[10] = pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f);
                    objArr2[11] = 0;
                    g0Var2.d(18890, objArr2);
                    return;
                }
                g1Var.f332557u.put(str3, java.lang.Boolean.TRUE);
                java.util.LinkedList recommended_cover_list2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list2, "recommended_cover_list");
                java.lang.String g08 = kz5.n0.g0(recommended_cover_list2, "&", null, null, 0, null, ec3.w.f332629d, 30, null);
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g1Var.f332561y, g08);
                boolean z17 = !b17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp：new_request_id：" + pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f) + "、old_request_id：" + g1Var.f332558v + "、reportSkinList：" + g1Var.f332560x);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp ，needUpdateSkinUrlList: " + z17 + "、url_isSame: " + b17 + "、old_url_List：" + g1Var.f332561y + "、new_url_List：" + g08);
                g1Var.c7(z17);
                g1Var.f332558v = pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f);
                java.util.LinkedList recommended_cover_list3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list3, "recommended_cover_list");
                g1Var.f332560x = kz5.n0.g0(recommended_cover_list3, "&", null, null, 0, null, ec3.u.f332625d, 30, null);
                if (z17) {
                    java.util.ArrayList arrayList = g1Var.f332544e;
                    java.util.LinkedList recommended_cover_list4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list4, "recommended_cover_list");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recommended_cover_list4, 10));
                    java.util.Iterator it = recommended_cover_list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ec3.k1((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p6) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    g1Var.f332561y = g08;
                    g1Var.T6("");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[12];
                    objArr3[0] = 15;
                    objArr3[1] = 0;
                    objArr3[2] = g1Var.f332559w;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = g1Var.m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
                    objArr3[3] = activityC16373x8a110f133 != null ? activityC16373x8a110f133.s7() : null;
                    objArr3[4] = "";
                    objArr3[5] = "";
                    objArr3[6] = g1Var.Z6();
                    objArr3[7] = java.lang.Integer.valueOf(g1Var.f332544e.size());
                    objArr3[8] = g1Var.f332560x;
                    objArr3[9] = 0;
                    objArr3[10] = g1Var.f332558v;
                    objArr3[11] = 0;
                    g0Var3.d(18890, objArr3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr4 = new java.lang.Object[12];
                objArr4[0] = 14;
                objArr4[1] = 0;
                objArr4[2] = g1Var.f332559w;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = g1Var.m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f134 = m158354x192630854 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630854 : null;
                objArr4[3] = activityC16373x8a110f134 != null ? activityC16373x8a110f134.s7() : null;
                objArr4[4] = "";
                objArr4[5] = "";
                objArr4[6] = str3;
                objArr4[7] = java.lang.Integer.valueOf(g1Var.f332544e.size());
                objArr4[8] = g1Var.f332560x;
                objArr4[9] = 0;
                objArr4[10] = g1Var.f332558v;
                objArr4[11] = 0;
                g0Var4.d(18890, objArr4);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp failed");
        ec3.g1.d7(g1Var, false, 1, null);
        g1Var.S6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr5 = new java.lang.Object[12];
        objArr5[0] = 14;
        objArr5[1] = 0;
        objArr5[2] = g1Var.f332559w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f135 = m158354x192630855 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630855 : null;
        objArr5[3] = activityC16373x8a110f135 != null ? activityC16373x8a110f135.s7() : null;
        objArr5[4] = "";
        objArr5[5] = "";
        objArr5[6] = str3;
        objArr5[7] = 0;
        objArr5[8] = "";
        objArr5[9] = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d;
        objArr5[10] = pm0.v.u(m0Var3 != null ? m0Var3.f226974f : 0L);
        objArr5[11] = 0;
        g0Var5.d(18890, objArr5);
    }
}
