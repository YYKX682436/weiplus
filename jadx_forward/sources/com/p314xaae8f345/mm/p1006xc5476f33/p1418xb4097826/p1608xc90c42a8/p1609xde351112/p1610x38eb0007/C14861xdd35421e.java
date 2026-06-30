package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData;", "Lir2/a;", "Lso2/i;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData */
/* loaded from: classes10.dex */
public final class C14861xdd35421e extends ir2.a {

    /* renamed from: k, reason: collision with root package name */
    public long f204812k;

    /* renamed from: l, reason: collision with root package name */
    public r45.qk4 f204813l;

    /* renamed from: m, reason: collision with root package name */
    public r45.tl6 f204814m;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData$Companion */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }
    }

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e.Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14861xdd35421e(java.util.List feeds, boolean z17) {
        super(feeds, false, null, z17, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
    }

    @Override // ir2.a, ir2.e1
    public void b(java.util.List dataList) {
        int i17;
        dm.pd pdVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        dataList.size();
        boolean isEmpty = dataList.isEmpty();
        java.util.List list = this.f375662a;
        if (isEmpty) {
            dataList.addAll(list);
            return;
        }
        kz5.n0.k0(dataList);
        java.util.Iterator it = kz5.n0.x0(list).iterator();
        while (true) {
            int i18 = -1;
            if (!it.hasNext()) {
                break;
            }
            so2.i iVar = (so2.i) it.next();
            java.util.Iterator it6 = dataList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                dm.pd pdVar2 = ((so2.i) it6.next()).f491944d;
                long j17 = pdVar2.f66095xc8a07680;
                dm.pd pdVar3 = iVar.f491944d;
                if (j17 == pdVar3.f66095xc8a07680 && pdVar2.f66080xac3be4e == pdVar3.f66080xac3be4e) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 == -1) {
                dm.pd pdVar4 = iVar.f491944d;
                if (pdVar4.f66129x2262335f == 10 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar4.f66073x6066efac)) {
                    java.util.Iterator it7 = dataList.iterator();
                    int i27 = 0;
                    while (true) {
                        boolean hasNext = it7.hasNext();
                        pdVar = iVar.f491944d;
                        if (!hasNext) {
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.i) it7.next()).f491944d.f66073x6066efac, pdVar.f66073x6066efac)) {
                            i18 = i27;
                            break;
                        }
                        i27++;
                    }
                    if (i18 >= 0) {
                        dataList.remove(i18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageLoaderData", "remove same clientMsgId, " + pdVar.f66073x6066efac);
                    }
                }
                dataList.add(iVar);
            } else {
                dataList.set(i19, iVar);
            }
        }
        kz5.g0.t(dataList, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData$sortMentionList$comparator$1
            @Override // java.util.Comparator
            public int compare(java.lang.Object obj, java.lang.Object obj2) {
                dm.pd pdVar5 = ((so2.i) obj).f491944d;
                int i28 = pdVar5.f66080xac3be4e;
                dm.pd pdVar6 = ((so2.i) obj2).f491944d;
                int i29 = pdVar6.f66080xac3be4e;
                return i28 == i29 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.j(pdVar6.f66095xc8a07680, pdVar5.f66095xc8a07680) : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i29, i28);
            }
        });
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageLoaderData", "increment size " + list.size());
        if (!list.isEmpty()) {
            long j18 = this.f204812k;
            if (j18 > 0) {
                java.util.ListIterator listIterator = dataList.listIterator(dataList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((so2.i) listIterator.previous()).f491944d.f66095xc8a07680 == j18) {
                            i17 = listIterator.nextIndex();
                            break;
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageLoaderData", "unread index " + i17 + ", dataList size " + dataList.size());
                if (i17 != -1) {
                    if (i17 >= 0) {
                        int i28 = 0;
                        while (true) {
                            ((so2.i) dataList.get(i28)).f491945e = false;
                            if (i28 == i17) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                    }
                    if (i17 != kz5.c0.h(dataList)) {
                        ((so2.i) dataList.get(i17)).f491945e = true;
                    }
                }
            }
        }
    }
}
