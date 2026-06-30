package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m8 f108117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f108119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.tencent.mm.plugin.finder.feed.model.m8 m8Var, java.util.List list, db2.c3 c3Var) {
        super(0);
        this.f108117d = m8Var;
        this.f108118e = list;
        this.f108119f = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ShowPreloadCacheDirectly: tabType=");
        sb6.append(this.f108117d.f108182e.f108034d);
        sb6.append(" pullType=0 valid=");
        sb6.append(this.f108118e.size());
        sb6.append(" raw=");
        db2.c3 c3Var = this.f108119f;
        sb6.append(c3Var.getList(1).size());
        sb6.append(' ');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("invalidFeed=");
        java.util.LinkedList list = c3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            kotlin.jvm.internal.o.d((com.tencent.mm.protocal.protobuf.FinderObject) obj);
            if (!hc2.o0.C(r6)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(pm0.v.u(finderObject.getId()));
            sb8.append('#');
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            sb8.append(objectDesc != null ? java.lang.Integer.valueOf(objectDesc.getMediaType()) : null);
            arrayList2.add(sb8.toString());
        }
        sb7.append(arrayList2);
        sb6.append(r26.i0.v(sb7.toString(), ",", ";", false, 4, null));
        return sb6.toString();
    }
}
