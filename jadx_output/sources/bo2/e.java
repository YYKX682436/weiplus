package bo2;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader f23022d;

    public e(com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader seeLaterLoader) {
        this.f23022d = seeLaterLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.modelbase.o oVar;
        bo2.d dVar = new bo2.d(this.f23022d, i17, i18, str);
        if ((fVar instanceof r45.m03) && i17 == 0 && i18 == 0) {
            r45.m03 m03Var = (r45.m03) fVar;
            dVar.f23021a = m03Var;
            dVar.setLastBuffer(m03Var.getByteString(2));
            dVar.setHasMore(m03Var.getInteger(3) == 1);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = m03Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(cu2.u.f222441a.o(h90Var.a(finderObject, 2097152), 11003));
            }
            dVar.setIncrementList(arrayList);
            o45.zg reqObj = (iVar == null || (oVar = iVar.f70646f) == null) ? null : oVar.getReqObj();
            com.tencent.mm.modelbase.m mVar = reqObj instanceof com.tencent.mm.modelbase.m ? (com.tencent.mm.modelbase.m) reqObj : null;
            java.lang.Object obj = mVar != null ? mVar.f70684a : null;
            r45.l03 l03Var = obj instanceof r45.l03 ? (r45.l03) obj : null;
            dVar.setPullType(l03Var != null ? l03Var.getInteger(5) : 0);
            dVar.setRequest(iVar);
        }
        return dVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        vn2.k kVar = vn2.l.f438315a;
        com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader seeLaterLoader = this.f23022d;
        return vn2.k.d(kVar, null, seeLaterLoader.getContextObj(), seeLaterLoader.getLastBuffer(), 24, kVar.a(2), null, 32, null).d();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        vn2.k kVar = vn2.l.f438315a;
        com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader seeLaterLoader = this.f23022d;
        return vn2.k.d(kVar, null, seeLaterLoader.getContextObj(), seeLaterLoader.getLastBuffer(), 24, kVar.a(1), null, 32, null).d();
    }
}
