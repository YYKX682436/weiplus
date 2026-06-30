package c66;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f39490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list) {
        super(1);
        this.f39490d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool;
        ni0.j jVar;
        java.util.List remainTidList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(remainTidList, "remainTidList");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (ni0.j jVar2 : this.f39490d) {
            java.lang.String tid = jVar2.f337235b;
            kotlin.jvm.internal.o.f(tid, "tid");
            hashMap.put(tid, jVar2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList b17 = remainTidList.isEmpty() ? null : c66.q.f39493a.b(remainTidList, (kk.l) ((jz5.n) c66.q.f39503k).getValue(), new c66.m(remainTidList));
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                ni0.i iVar = (ni0.i) it.next();
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                byte[] bArr = iVar.f337232b;
                if (bArr != null) {
                    try {
                        finderObject.parseFrom(bArr);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                    if (finderObject != null || (jVar = (ni0.j) hashMap.get(iVar.f337231a)) == null) {
                        bool = null;
                    } else {
                        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, jVar.f337237d);
                        a17.setFeedSource(jVar.f337239f);
                        a17.m131setUnreadExpiredTimeVKZWuLQ(jVar.f337238e);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        bool = java.lang.Boolean.valueOf(arrayList.add(android.util.Pair.create(iVar.f337231a, cu2.u.f222441a.p(a17))));
                    }
                    arrayList2.add(bool);
                }
                finderObject = null;
                if (finderObject != null) {
                }
                bool = null;
                arrayList2.add(bool);
            }
        }
        return arrayList;
    }
}
