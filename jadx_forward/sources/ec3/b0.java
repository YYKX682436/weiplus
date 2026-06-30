package ec3;

/* loaded from: classes9.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f332519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332520e;

    public b0(com.p314xaae8f345.mm.p944x882e457a.f fVar, ec3.g1 g1Var) {
        this.f332519d = fVar;
        this.f332520e = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f332519d;
        int i17 = fVar.f152148a;
        ec3.g1 g1Var = this.f332520e;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar2;
            if ((m0Var != null ? m0Var.f226972d : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m0Var2 != null ? m0Var2.f226975g : null)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d;
                    int size = (m0Var3 == null || (linkedList = m0Var3.f226972d) == null) ? 0 : linkedList.size();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d;
                    java.lang.String str = m0Var4 != null ? m0Var4.f226975g : null;
                    g1Var.D = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp success, title：" + str + ", dataSize：" + size);
                    if (g1Var.f332547h) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] hasReceiveRecommendInfo: true, ignore");
                        return;
                    }
                    if (!(1 <= size && size < 4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp : dataSize illegal, reset");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[12];
                        objArr[0] = 14;
                        objArr[1] = 0;
                        objArr[2] = g1Var.f332559w;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
                        objArr[3] = activityC16373x8a110f13 != null ? activityC16373x8a110f13.s7() : null;
                        objArr[4] = "";
                        objArr[5] = "";
                        objArr[6] = "";
                        objArr[7] = 0;
                        objArr[8] = "";
                        objArr[9] = 0;
                        objArr[10] = pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f);
                        objArr[11] = 1;
                        g0Var.d(18890, objArr);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp：new_request_id：" + pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f) + "、old_request_id：" + g1Var.f332558v + "、reportSkinList：" + g1Var.f332560x);
                    ec3.g1.d7(g1Var, false, 1, null);
                    g1Var.C = 1;
                    java.util.LinkedList recommended_cover_list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list, "recommended_cover_list");
                    g1Var.f332561y = kz5.n0.g0(recommended_cover_list, "&", null, null, 0, null, ec3.a0.f332516d, 30, null);
                    g1Var.f332558v = pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226974f);
                    java.util.LinkedList recommended_cover_list2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list2, "recommended_cover_list");
                    g1Var.f332560x = kz5.n0.g0(recommended_cover_list2, "&", null, null, 0, null, ec3.z.f332638d, 30, null);
                    java.util.ArrayList arrayList = g1Var.f332544e;
                    java.util.LinkedList recommended_cover_list3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d).f226972d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommended_cover_list3, "recommended_cover_list");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recommended_cover_list3, 10));
                    java.util.Iterator it = recommended_cover_list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ec3.k1((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p6) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    g1Var.T6(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[12];
                    objArr2[0] = 14;
                    objArr2[1] = 0;
                    objArr2[2] = g1Var.f332559w;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = g1Var.m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
                    objArr2[3] = activityC16373x8a110f132 != null ? activityC16373x8a110f132.s7() : null;
                    objArr2[4] = "";
                    objArr2[5] = "";
                    objArr2[6] = "";
                    objArr2[7] = java.lang.Integer.valueOf(g1Var.f332544e.size());
                    objArr2[8] = g1Var.f332560x;
                    objArr2[9] = 0;
                    objArr2[10] = g1Var.f332558v;
                    objArr2[11] = 1;
                    g0Var2.d(18890, objArr2);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp failed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr3 = new java.lang.Object[12];
        objArr3[0] = 14;
        objArr3[1] = 0;
        objArr3[2] = g1Var.f332559w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
        objArr3[3] = activityC16373x8a110f133 != null ? activityC16373x8a110f133.s7() : null;
        objArr3[4] = "";
        objArr3[5] = "";
        objArr3[6] = "";
        objArr3[7] = 0;
        objArr3[8] = "";
        objArr3[9] = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0 m0Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m0) fVar.f152151d;
        objArr3[10] = pm0.v.u(m0Var5 != null ? m0Var5.f226974f : 0L);
        objArr3[11] = 1;
        g0Var3.d(18890, objArr3);
    }
}
