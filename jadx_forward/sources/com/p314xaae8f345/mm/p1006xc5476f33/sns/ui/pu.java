package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class pu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e f251814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu f251815e;

    public pu(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar) {
        this.f251814d = c6098x8f514c1e;
        this.f251815e = quVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
        if (cc4.b.f122015a.a()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = this.f251814d;
            am.yw ywVar = c6098x8f514c1e.f136375g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event >> ");
            sb6.append(ywVar.f90018a);
            sb6.append(' ');
            sb6.append(ywVar.f90019b);
            sb6.append(' ');
            sb6.append(ywVar.f90020c);
            sb6.append(' ');
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = this.f251815e;
            sb6.append(quVar.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", sb6.toString());
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(quVar.a(), ywVar.f90020c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
                return;
            }
            int i17 = c6098x8f514c1e.f136375g.f90018a;
            pb4.e eVar = pb4.e.f434729a;
            sb4.y yVar = quVar.f251894d;
            if (i17 == 1) {
                java.lang.String snsId = ywVar.f90019b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
                if (g17 != null) {
                    int size = quVar.f251895e.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            i18 = -1;
                            break;
                        }
                        java.lang.Object obj = quVar.f251895e.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj).m70357x3fdd41df() < g17.m70357x3fdd41df()) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i18 != -1) {
                        if (quVar.f251895e.size() == quVar.f251897g) {
                            fp.l.b(quVar.f251895e);
                        }
                        quVar.f251895e.add(i18, g17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "insert star feed position -1 to notify");
                        yVar.x(quVar.f251895e);
                    } else if (quVar.f251895e.size() < quVar.f251897g) {
                        quVar.f251895e.add(g17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "insert star feed slotSnsList.size < slotItemNum to notify");
                        yVar.x(quVar.f251895e);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            } else if (i17 == 3) {
                java.lang.String snsId2 = ywVar.f90019b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId2, "snsId");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                java.util.Iterator it = quVar.f251895e.iterator();
                int i19 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                        i19 = -1;
                        break;
                    } else {
                        i19++;
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next()).m70367x7525eefd().equals(snsId2)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "Delete >> " + i19);
                if (i19 != -1) {
                    java.lang.String a17 = quVar.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    int i27 = quVar.f251897g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    java.util.ArrayList h17 = eVar.h(a17, i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    quVar.f251895e = h17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSlotAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSlotAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    java.util.ArrayList arrayList = quVar.f251895e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    yVar.x(arrayList);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
    }
}
