package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class kc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc f216485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f216486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f216487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f216485d = ncVar;
        this.f216486e = abstractC13834x56f46d28;
        this.f216487f = c19792x256d2725;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar = this.f216485d;
        if (!ncVar.f216831o.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f216486e;
            java.util.Iterator it = abstractC13834x56f46d28.m56387xe6796cde().iterator();
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f216487f;
                if (hasNext) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                        if (!abstractC14490x69736cb5.getHasExposed() && abstractC14490x69736cb5.getEnhanceFromFeedId() != 0 && abstractC14490x69736cb5.getEnhanceFromFeedId() != c19792x256d2725.m76784x5db1b11()) {
                            arrayList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), j5Var));
                        }
                    }
                    i17 = i18;
                } else if (arrayList.size() != 0) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        jz5.l lVar = (jz5.l) it6.next();
                        abstractC13834x56f46d28.m56387xe6796cde().remove(((java.lang.Number) lVar.f384366d).intValue());
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ncVar.f216827h;
                        if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                            mo7946xf939df19.m8155x27702c4(((java.lang.Number) lVar.f384366d).intValue());
                        }
                    }
                    if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                        z17 = true;
                    } else {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                    if (z17) {
                        android.app.Activity m80379x76847179 = ncVar.m80379x76847179();
                        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
                        e4Var.f293309c = "产生了新的互动强化操作，删除 " + arrayList.size() + " 条删除旧的强化流Feed";
                        e4Var.c();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar2 = this.f216485d;
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        jz5.l lVar2 = (jz5.l) it7.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.R6(ncVar2, c19792x256d2725.m76784x5db1b11(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) lVar2.f384367e).mo2128x1ed62e84(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) lVar2.f384367e).getFeedObject().getFeedObject().m76829x97edf6c0());
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
