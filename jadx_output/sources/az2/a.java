package az2;

/* loaded from: classes.dex */
public class a extends az2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.LinkedList objectIds, r45.qt2 qt2Var, int i17) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(objectIds, "objectIds");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qv0 qv0Var = new r45.qv0();
        qv0Var.set(2, objectIds);
        db2.t4 t4Var = db2.t4.f228171a;
        qv0Var.set(1, t4Var.b(8755, qt2Var));
        qv0Var.set(3, java.lang.Integer.valueOf(i17));
        qv0Var.set(4, t4Var.n());
        lVar.f70664a = qv0Var;
        r45.sv0 sv0Var = new r45.sv0();
        sv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) sv0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = sv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbatchloadobject";
        lVar.f70667d = 8755;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderBatchLoadObject", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sv0 resp = (r45.sv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.tencent.mars.xlog.Log.i("CgiFinderBatchLoadObject", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.sv0 resp = (r45.sv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBatchLoadObjectRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.qv0) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
