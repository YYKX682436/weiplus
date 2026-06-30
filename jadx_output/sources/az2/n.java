package az2;

/* loaded from: classes2.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az2.o f16145a;

    public n(az2.o oVar) {
        this.f16145a = oVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.sv0) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObjects(...)");
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            bu2.j jVar = bu2.j.f24534a;
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 0);
            az2.o oVar = this.f16145a;
            jVar.n(a17, new bu2.h(oVar.f70646f.f70713d, oVar.D()));
        }
        java.util.LinkedList list2 = ((r45.sv0) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list2, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((java.lang.Number) it6.next()).longValue()));
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb7, ",");
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6926i = Z;
        iaVar.f6919b = 33;
        return java.lang.Boolean.valueOf(feedUpdateEvent.e());
    }
}
