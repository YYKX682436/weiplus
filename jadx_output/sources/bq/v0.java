package bq;

/* loaded from: classes2.dex */
public final class v0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23535o;

    public v0(int i17, com.tencent.mm.protobuf.g gVar, int i18, float f17, float f18, r45.xu2 xu2Var, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f23535o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3688;
        r45.z91 z91Var = new r45.z91();
        z91Var.set(3, 0L);
        z91Var.set(7, "");
        z91Var.set(4, java.lang.Integer.valueOf(i17));
        z91Var.set(5, java.lang.Float.valueOf(f17));
        z91Var.set(6, java.lang.Float.valueOf(f18));
        z91Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, this.f23483m));
        z91Var.set(9, java.lang.Integer.valueOf(i18));
        z91Var.set(11, xu2Var);
        z91Var.set(14, t4Var.n());
        db2.t4.i(t4Var, (r45.kv0) z91Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i18), 0L)), null, 4, null);
        lVar.f70664a = z91Var;
        lVar.f70665b = new r45.aa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderGetRelatedListCGI", "init feedId 0 tabType " + i17 + " lastBuffer " + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kv0 kv0Var;
        r45.aa1 resp = (r45.aa1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderGetRelatedListCGI", "processCgiResult errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        r45.z91 z91Var = fVar2 instanceof r45.z91 ? (r45.z91) fVar2 : null;
        cq.j1.a(kVar, oVar, arrayList, (z91Var == null || (kv0Var = (r45.kv0) z91Var.getCustom(1)) == null) ? 0L : kv0Var.getLong(5), false, this.f23483m);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId 0 tabType=");
            sb6.append(this.f23535o);
            sb6.append(", ");
            com.tencent.mm.protobuf.f fVar3 = this.f70646f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            java.util.LinkedList list2 = ((r45.aa1) fVar3).getList(1);
            if (list2 == null) {
                list2 = new java.util.LinkedList();
            }
            sb6.append(hc2.o0.k(list2));
            com.tencent.mars.xlog.Log.i("Finder.FinderGetRelatedListCGI", sb6.toString());
            com.tencent.mm.protobuf.f fVar4 = this.f70646f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list3 = ((r45.aa1) fVar4).getList(1);
            if (list3 == null) {
                list3 = new java.util.LinkedList();
            }
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : list3) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                kotlin.jvm.internal.o.g(finderObject2, "finderObject");
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cl(finderObject2, this.f23483m);
            }
            com.tencent.mm.protobuf.f fVar5 = this.f70646f.f70711b.f70700a;
            if (fVar5 instanceof r45.aa1) {
                i95.m c19 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                r45.aa1 aa1Var = (r45.aa1) fVar5;
                r45.sq2 sq2Var = (r45.sq2) aa1Var.getCustom(5);
                java.util.LinkedList list4 = aa1Var.getList(1);
                kotlin.jvm.internal.o.f(list4, "getObject(...)");
                yr2.a.f464659a.b(sq2Var, list4, 3688);
                dq.b b17 = cq.k1.b();
                r45.rf6 rf6Var = (r45.rf6) aa1Var.getCustom(22);
                b17.d(rf6Var != null ? rf6Var.getInteger(0) : 0, "Finder.FinderGetRelatedListCGI");
            }
        }
    }
}
