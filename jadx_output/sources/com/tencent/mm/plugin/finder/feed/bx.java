package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106418d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        boolean a17 = hc2.e.a();
        com.tencent.mars.xlog.Log.i(this.f106418d.U, "PersonalizedUpdate " + a17);
        int i18 = 0;
        if (a17) {
            com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106418d;
            int i19 = pzVar.f108762p;
            if (i19 == 4 || i19 == 1 || i19 == 3) {
                hb2.q qVar = hb2.q.f280082e;
                com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
                com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
                if (qVar.o(mMActivity, ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null, pzVar.C.getDataListJustForAdapter(), pzVar.f108779z1, pzVar.f108762p)) {
                    pzVar.f108777y1 = true;
                }
                this.f106418d.C.f107667z = false;
            }
        } else {
            com.tencent.mm.plugin.finder.feed.pz pzVar2 = this.f106418d;
            pzVar2.f108777y1 = false;
            pzVar2.C.f107652h.f250828p = false;
            com.tencent.mm.plugin.finder.feed.pz pzVar3 = this.f106418d;
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList = pzVar3.C.getDataList();
            long j17 = pzVar3.G1;
            if (j17 != 0) {
                java.util.Iterator it = dataList.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((so2.j5) it.next()).getItemId() == j17) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            int i27 = i17 + 1;
            int size = dataList.size();
            if (i17 != -1 && i27 < size && size > 1) {
                java.util.List subList = dataList.subList(i27, dataList.size());
                kotlin.jvm.internal.o.f(subList, "subList(...)");
                i18 = subList.size();
                subList.clear();
                in5.n0 T0 = pzVar3.T0();
                if (T0 != null) {
                    T0.notifyItemRangeRemoved(i27, i18);
                }
            }
            com.tencent.mars.xlog.Log.i(pzVar3.U, "removeUnreadFeed currentId " + j17 + " findIndex " + i17 + " removeSize " + i18 + " dataSize " + size);
        }
        com.tencent.mm.ui.MMActivity activity = this.f106418d.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.bl) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class)).l7();
        return jz5.f0.f302826a;
    }
}
