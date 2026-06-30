package ac2;

/* loaded from: classes2.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public int f84549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c f84550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c) {
        super(c13721x95edc87c, false, 1, null);
        this.f84550b = c13721x95edc87c;
        this.f84549a = 1000;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeDataAndNotify */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        int i18 = this.f84549a;
        java.util.List<so2.j5> list2 = kz5.p0.f395529d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = this.f84550b;
        if (i18 != 0) {
            if (i18 != 1) {
                return super.mo1053x5ee561e(i17, list, z17, obj);
            }
            this.f84549a = 0;
            if (list != null) {
                list2 = list;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge pull top: size %d", java.lang.Integer.valueOf(list2.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, list2.size(), new java.util.LinkedList(), false, false, 24, null);
            c13721x95edc87c.m56387xe6796cde().addAll(0, list2);
            c13721x95edc87c.getDispatcher().d(0, list2.size());
            return u0Var;
        }
        this.f84549a = 0;
        if (list != null) {
            list2 = list;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: size %d", java.lang.Integer.valueOf(list2.size()));
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(c13721x95edc87c.m56387xe6796cde());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var2 : list2) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((so2.j5) it.next()).mo2128x1ed62e84() == j5Var2.mo2128x1ed62e84()) {
                    break;
                }
                i19++;
            }
            if (i19 == -1) {
                arrayList.add(j5Var2);
            }
        }
        if (j5Var == null) {
            c13721x95edc87c.m56387xe6796cde().addAll(arrayList);
            c13721x95edc87c.getDispatcher().a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: no first feed");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i27 = -1;
                break;
            }
            if (((so2.j5) it6.next()).mo2128x1ed62e84() == j5Var.mo2128x1ed62e84()) {
                break;
            }
            i27++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: feed index %d", java.lang.Integer.valueOf(i27));
        if (i27 == -1) {
            c13721x95edc87c.m56387xe6796cde().addAll(arrayList);
            c13721x95edc87c.getDispatcher().d(0, arrayList.size());
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
        }
        if (i27 != 0) {
            c13721x95edc87c.m56387xe6796cde().addAll(0, arrayList.subList(0, i27));
            c13721x95edc87c.getDispatcher().d(0, i27);
        }
        int i28 = i27 + 1;
        if (i28 < arrayList.size()) {
            int size = c13721x95edc87c.m56387xe6796cde().size();
            c13721x95edc87c.m56387xe6796cde().addAll(size, arrayList.subList(i28, arrayList.size()));
            c13721x95edc87c.getDispatcher().d(size, arrayList.size() - i27);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInit */
    public void mo1054x60f5a168(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f84549a = response.getPullType();
        super.mo1054x60f5a168(response, lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f84549a = 1000;
        super.mo1055x1f1ce1b3(response, lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f84549a = response.getPullType();
        super.mo1056x14dcd783(response, lVar);
    }
}
