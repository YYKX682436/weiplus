package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class jc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc f216383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f216384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f216385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f216386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17) {
        super(0);
        this.f216383d = ncVar;
        this.f216384e = abstractC13834x56f46d28;
        this.f216385f = c19792x256d2725;
        this.f216386g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar = this.f216383d;
        if (!ncVar.f216831o.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f216384e;
            java.util.Iterator it = abstractC13834x56f46d28.m56387xe6796cde().iterator();
            boolean z17 = false;
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) next;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (!abstractC14490x69736cb5.getHasExposed() && abstractC14490x69736cb5.getEnhanceFromFeedId() == this.f216385f.m76784x5db1b11() && abstractC14490x69736cb5.getEnhanceFromEventType() == this.f216386g) {
                        arrayList.add(0, java.lang.Integer.valueOf(i17));
                    }
                }
                i17 = i18;
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                abstractC13834x56f46d28.m56387xe6796cde().remove(intValue);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ncVar.f216827h;
                if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8155x27702c4(intValue);
                }
            }
            if (arrayList.size() != 0) {
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
                if (z17) {
                    android.app.Activity m80379x76847179 = ncVar.m80379x76847179();
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
                    e4Var.f293309c = "由于取消互动操作，删除 " + arrayList.size() + " 条已被插入的未读强化流Feed";
                    e4Var.c();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
