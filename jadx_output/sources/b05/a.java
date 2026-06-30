package b05;

/* loaded from: classes12.dex */
public final class a extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f16967n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b05.c f16968o;

    public a(b05.c cVar) {
        this.f16968o = cVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "ModifyWeShopIndexTask";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p13.c
    public boolean i() {
        java.util.ArrayList arrayList;
        long j17;
        long j18;
        java.util.ArrayList arrayList2;
        c30.t tVar;
        b05.i iVar = this.f16968o.f16971f;
        if (iVar == null) {
            return false;
        }
        long k17 = ((com.tencent.mm.plugin.fts.o) iVar.f342198f).k(-114L, 0L);
        c30.f0 f0Var = (c30.f0) ((c00.g4) i95.n0.c(c00.g4.class));
        f0Var.requireAccountInitialized();
        c30.e eVar = f0Var.f38113d;
        long c17 = eVar != null ? eVar.c() : 0L;
        int i17 = 1;
        java.lang.String str = "FTS.FTSSearchWeShopLogic";
        if (k17 == c17) {
            com.tencent.mars.xlog.Log.i("FTS.FTSSearchWeShopLogic", " toUpdateSeq: " + c17 + " is equal to lastSyncUpdateSeq: " + k17);
            return true;
        }
        f0Var.requireAccountInitialized();
        c30.e eVar2 = f0Var.f38113d;
        java.util.List<tq.d> list = kz5.p0.f313996d;
        if (eVar2 != null && (tVar = eVar2.f38109c) != null) {
            try {
                com.tencent.wcdb.core.Table table = tVar.f38162a;
                com.tencent.wcdb.orm.Field[] b17 = tVar.b();
                com.tencent.wcdb.orm.Field field = tq.b.f421193m;
                java.util.List allObjects = table.getAllObjects(b17, field.gt(k17).and(field.le(c17)));
                kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
                list = allObjects;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopItemStorage", e17, "updateShopJumpInfoByLocalId error: " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("FTS.FTSSearchWeShopLogic", "maxUpdateSeq: " + c17 + ", lastSyncUpdateSeq: " + k17 + ", toUpdateSeq: " + c17 + ", weshopItems count: " + list.size());
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("FTS.FTSSearchWeShopLogic", "weshopItems is empty, lastSyncUpdateSeq: " + k17 + ", toUpdateSeq: " + c17);
            iVar.L(-114L, c17);
            return true;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (tq.d dVar : list) {
            if (dVar.f421202g == 1 && dVar.f421203h != 0) {
                arrayList3.add(dVar);
            } else {
                arrayList4.add(dVar);
            }
        }
        iVar.h();
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            tq.d dVar2 = (tq.d) it.next();
            java.lang.String str2 = dVar2.f421197b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            long j19 = dVar2.f421196a;
            long j27 = dVar2.f421204i;
            java.lang.String K = iVar.K(str2, i17);
            if ((((K == null || K.length() == 0) ? i17 : 0) ^ i17) != 0) {
                arrayList = arrayList3;
                j17 = j19;
                iVar.F(kz5.n0.R0(kz5.b0.c(655360)), j17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete existsIndex, localId: ");
                j18 = c17;
                arrayList2 = arrayList4;
                sb6.append(dVar2.f421196a);
                sb6.append(", shopName: ");
                sb6.append(dVar2.f421198c);
                sb6.append(", shopAppId: ");
                sb6.append(dVar2.f421197b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
            } else {
                arrayList = arrayList3;
                j17 = j19;
                j18 = c17;
                arrayList2 = arrayList4;
            }
            java.lang.String str3 = str2;
            long j28 = j17;
            long j29 = j18;
            java.util.ArrayList arrayList5 = arrayList;
            java.lang.String str4 = str;
            iVar.u(655360, 1, j28, str3, j27, dVar2.f421198c);
            iVar.u(655360, 2, j28, str3, j27, o13.n.i(dVar2.f421198c, false));
            iVar.u(655360, 3, j28, str3, j27, o13.n.i(dVar2.f421198c, true));
            com.tencent.mars.xlog.Log.i(str4, "insetIndex localId: " + dVar2.f421196a + ", shopName: " + dVar2.f421198c + ", shopAppId: " + dVar2.f421197b + ", shopTagModifyTime: " + dVar2.f421204i);
            str = str4;
            arrayList3 = arrayList5;
            arrayList4 = arrayList2;
            c17 = j29;
            i17 = 1;
        }
        java.util.ArrayList arrayList6 = arrayList3;
        java.util.ArrayList arrayList7 = arrayList4;
        long j37 = c17;
        java.lang.String str5 = str;
        java.util.Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            tq.d dVar3 = (tq.d) it6.next();
            iVar.F(kz5.n0.R0(kz5.b0.c(655360)), dVar3.f421196a);
            com.tencent.mars.xlog.Log.i(str5, "deleteIndex localId: " + dVar3.f421196a + ", shopName: " + dVar3.f421198c + ", shopAppId: " + dVar3.f421197b);
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1).F(kz5.n0.R0(kz5.b0.c(655360)), dVar3.f421196a);
        }
        iVar.L(-114L, j37);
        iVar.j();
        this.f16967n = arrayList6.size() + arrayList7.size();
        com.tencent.mars.xlog.Log.i(str5, "ModifyWeShopIndex success");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "{updateSize: " + this.f16967n + '}';
    }
}
