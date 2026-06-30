package bs2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f23880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bs2.n1 n1Var, java.util.LinkedList linkedList) {
        super(0);
        this.f23879d = n1Var;
        this.f23880e = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        bs2.n1 n1Var = this.f23879d;
        n1Var.getClass();
        boolean U2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.U2();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!U2 || (i17 = n1Var.f23907a) != 4) {
            return f0Var;
        }
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.i2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        bs2.d1 d1Var = new bs2.d1((ey2.i2) a17, n1Var);
        java.util.LinkedList linkedList = this.f23880e;
        pm0.v.d0(linkedList, d1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) next;
            jz5.f0 f0Var2 = f0Var;
            if (!bu2.j.f24534a.i(i17, finderObject.getId()) && com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0).isSupportCache()) {
                arrayList.add(next);
            }
            f0Var = f0Var2;
        }
        jz5.f0 f0Var3 = f0Var;
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = n1Var.f23909c;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i(str, "refreshFirstPage: valid feed is empty, origin size=" + linkedList.size());
            return f0Var3;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(arrayList);
        jz5.f0 f0Var4 = null;
        if (finderObject2 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject2, 0));
            p17.c2(true);
            java.util.List list = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f257443c;
            if (list.size() > 0) {
                java.util.Iterator it6 = list.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it6.next();
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    if (baseFinderFeed != null && baseFinderFeed.getIsUnReadCacheFeed()) {
                        break;
                    }
                    i18++;
                }
                if (i18 >= 0) {
                    list.remove(i18);
                    list.add(i18, p17);
                    com.tencent.mars.xlog.Log.i(str, "refreshFirstPage: insert to cache, index=" + i18 + ", feedId=" + pm0.v.u(finderObject2.getId()));
                } else {
                    list.add(p17);
                    com.tencent.mars.xlog.Log.i(str, "refreshFirstPage: insert to cache tail, feedId=".concat(pm0.v.u(finderObject2.getId())));
                }
            }
            int d17 = hc2.d0.d(4);
            int a18 = hc2.d0.a(d17);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(bu2.d0.i(bu2.e0.f24498a, a18, null, 2, null));
            if (linkedList2.isEmpty()) {
                linkedList2.add(p17);
            } else {
                if (linkedList2.size() > 1) {
                    linkedList2.remove(1);
                }
                linkedList2.add(1, p17);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            linkedList3.addAll(p17.getFeedObject().getMediaList());
            jz5.l lVar = new jz5.l(p17, kz5.n0.V0(linkedList3));
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList4.add(lVar);
            ((ds2.b0) ((jz5.n) n1Var.f23922p).getValue()).e(new ek4.b(1, -1, hc2.d0.b(i17), 2, 0L, null, 0, 112, null), com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(p17.getFeedObject()), kz5.n0.V0(linkedList4), 1000);
            cu2.u.f222441a.m(linkedList2, d17, "", true);
            com.tencent.mars.xlog.Log.i(str, "refreshFirstPage: store unread feed, id=".concat(pm0.v.u(finderObject2.getId())));
            f0Var4 = f0Var3;
        }
        if (f0Var4 != null) {
            return f0Var3;
        }
        com.tencent.mars.xlog.Log.e(str, "refreshFirstPage: error, feed is null, size=" + arrayList.size());
        return f0Var3;
    }
}
