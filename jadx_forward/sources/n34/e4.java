package n34;

/* loaded from: classes4.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e f416124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d f416125e;

    public e4(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e, com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d) {
        this.f416124d = c6098x8f514c1e;
        this.f416125e = c17692xcc3ccb9d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = this.f416124d;
        am.yw ywVar = c6098x8f514c1e.f136375g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event >> ");
        sb6.append(ywVar.f90018a);
        sb6.append(' ');
        sb6.append(ywVar.f90019b);
        sb6.append(' ');
        sb6.append(ywVar.f90020c);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d = this.f416125e;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.R6(c17692xcc3ccb9d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListDataUIC", sb6.toString());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.R6(c17692xcc3ccb9d), ywVar.f90020c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
            return;
        }
        int i17 = c6098x8f514c1e.f136375g.f90018a;
        pb4.e eVar = pb4.e.f434729a;
        if (i17 == 1) {
            java.lang.String snsId = ywVar.f90019b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            c17692xcc3ccb9d.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g18 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
            if (g18 != null) {
                java.util.ArrayList arrayList = c17692xcc3ccb9d.f244061e;
                int size = arrayList.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    }
                    java.lang.Object obj = arrayList.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj).m70357x3fdd41df() < g18.m70357x3fdd41df()) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    arrayList.add(i18, g18);
                    pf5.e.m158343xd39de650(c17692xcc3ccb9d, null, null, new n34.a4(c17692xcc3ccb9d, null), 3, null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else if (i17 == 2) {
            java.lang.String snsId2 = ywVar.f90019b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId2, "snsId");
            int O6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.O6(c17692xcc3ccb9d, snsId2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListDataUIC", "update >> " + O6);
            if (O6 != -1 && (g17 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(ywVar.f90019b))) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.Q6(c17692xcc3ccb9d).remove(O6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.Q6(c17692xcc3ccb9d).add(O6, g17);
                pf5.e.m158343xd39de650(c17692xcc3ccb9d, null, null, new n34.d4(c17692xcc3ccb9d, null), 3, null);
            }
        } else if (i17 == 3) {
            java.lang.String snsId3 = ywVar.f90019b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId3, "snsId");
            int O62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.O6(c17692xcc3ccb9d, snsId3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListDataUIC", "Delete >> " + O62);
            if (O62 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.Q6(c17692xcc3ccb9d).remove(O62);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d2 = this.f416125e;
                pf5.e.m158343xd39de650(c17692xcc3ccb9d2, null, null, new n34.c4(c17692xcc3ccb9d2, null), 3, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
    }
}
