package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderDraftOpEvent f108154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f108155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent, com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader) {
        super(0);
        this.f108154d = finderDraftOpEvent;
        this.f108155e = finderProfileDraftLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = this.f108154d;
        if (finderDraftOpEvent != null) {
            com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f108155e;
            am.ab abVar = finderDraftOpEvent.f54270g;
            int i17 = abVar.f6144a;
            if (i17 == 100) {
                long j17 = abVar.f6145b;
                com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getF123427d(), "add localId: " + j17);
                com.tencent.mm.plugin.finder.storage.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(j17);
                if (D0 == null) {
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    java.util.List a17 = cq.n1.a((cq.k) c17, pm0.v.u(j17), java.lang.Boolean.FALSE);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.tencent.mm.plugin.finder.storage.x80.N.a((ni0.h) it.next()));
                    }
                    D0 = (com.tencent.mm.plugin.finder.storage.x80) kz5.n0.Z(arrayList);
                }
                if (D0 != null && (finderProfileDraftLoader.f107581e || !D0.t0().isMemberFeed())) {
                    new java.util.ArrayList();
                    finderProfileDraftLoader.getDataListJustForAdapter().add(0, new so2.k0(D0));
                    finderProfileDraftLoader.getDispatcher().a();
                }
            } else if (i17 == 110) {
                long j18 = abVar.f6145b;
                com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getF123427d(), "del localId: " + j18);
                java.util.Iterator it6 = finderProfileDraftLoader.getDataList().iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).getItemId() == j18) {
                        break;
                    }
                    i18++;
                }
                if (i18 != -1) {
                    java.lang.Object remove = finderProfileDraftLoader.getDataList().remove(i18);
                    kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                    finderProfileDraftLoader.getDispatcher().a();
                    if (finderProfileDraftLoader.getDataList().size() == 0) {
                        finderProfileDraftLoader.f107584h = com.tencent.mm.plugin.finder.feed.model.f6.f107857e;
                        yz5.a aVar = finderProfileDraftLoader.f107583g;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            } else if (i17 == 112) {
                long j19 = abVar.f6145b;
                com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getF123427d(), "mod localId: " + j19);
                int i19 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.f107579o;
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.o6(finderProfileDraftLoader, j19, true));
            }
        }
        return jz5.f0.f302826a;
    }
}
