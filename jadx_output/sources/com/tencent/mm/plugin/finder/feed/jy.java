package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FollowUserEvent f107150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f107150d = followUserEvent;
        this.f107151e = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.n0 T0;
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = this.f107150d;
        am.zd zdVar = followUserEvent.f54346g;
        int i17 = zdVar.f8552b;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107151e;
        if (i17 == 2 && pzVar.f108762p == 3) {
            java.lang.String finderUser = zdVar.f8551a;
            kotlin.jvm.internal.o.f(finderUser, "finderUser");
            com.tencent.mm.plugin.finder.feed.pz.L0(pzVar, finderUser);
        }
        am.zd zdVar2 = followUserEvent.f54346g;
        int i18 = zdVar2.f8555e;
        com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (i18 != ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5)) {
            java.lang.String finderUser2 = zdVar2.f8551a;
            kotlin.jvm.internal.o.f(finderUser2, "finderUser");
            java.util.Iterator it = pzVar.C.getDataList().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getUserName(), finderUser2) && (T0 = pzVar.T0()) != null) {
                    T0.notifyItemChanged(i19, new jz5.l(29, 1));
                }
                i19 = i27;
            }
        }
        return jz5.f0.f302826a;
    }
}
