package b05;

/* loaded from: classes12.dex */
public final class a extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f98500n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b05.c f98501o;

    public a(b05.c cVar) {
        this.f98501o = cVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
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
        b05.i iVar = this.f98501o.f98504f;
        if (iVar == null) {
            return false;
        }
        long k17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) iVar.f423731f).k(-114L, 0L);
        c30.f0 f0Var = (c30.f0) ((c00.g4) i95.n0.c(c00.g4.class));
        f0Var.m134976x2690a4ac();
        c30.e eVar = f0Var.f119646d;
        long c17 = eVar != null ? eVar.c() : 0L;
        int i17 = 1;
        java.lang.String str = "FTS.FTSSearchWeShopLogic";
        if (k17 == c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.FTSSearchWeShopLogic", " toUpdateSeq: " + c17 + " is equal to lastSyncUpdateSeq: " + k17);
            return true;
        }
        f0Var.m134976x2690a4ac();
        c30.e eVar2 = f0Var.f119646d;
        java.util.List<tq.d> list = kz5.p0.f395529d;
        if (eVar2 != null && (tVar = eVar2.f119642c) != null) {
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = tVar.f119695a;
                com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] b17 = tVar.b();
                com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = tq.b.f502726m;
                java.util.List m107110xde3eb429 = c26924x4cd4bae.m107110xde3eb429(b17, c26981x40bb0da.gt(k17).and(c26981x40bb0da.le(c17)));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107110xde3eb429, "getAllObjects(...)");
                list = m107110xde3eb429;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopItemStorage", e17, "updateShopJumpInfoByLocalId error: " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.FTSSearchWeShopLogic", "maxUpdateSeq: " + c17 + ", lastSyncUpdateSeq: " + k17 + ", toUpdateSeq: " + c17 + ", weshopItems count: " + list.size());
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FTS.FTSSearchWeShopLogic", "weshopItems is empty, lastSyncUpdateSeq: " + k17 + ", toUpdateSeq: " + c17);
            iVar.L(-114L, c17);
            return true;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (tq.d dVar : list) {
            if (dVar.f502735g == 1 && dVar.f502736h != 0) {
                arrayList3.add(dVar);
            } else {
                arrayList4.add(dVar);
            }
        }
        iVar.h();
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            tq.d dVar2 = (tq.d) it.next();
            java.lang.String str2 = dVar2.f502730b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            long j19 = dVar2.f502729a;
            long j27 = dVar2.f502737i;
            java.lang.String K = iVar.K(str2, i17);
            if ((((K == null || K.length() == 0) ? i17 : 0) ^ i17) != 0) {
                arrayList = arrayList3;
                j17 = j19;
                iVar.F(kz5.n0.R0(kz5.b0.c(655360)), j17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete existsIndex, localId: ");
                j18 = c17;
                arrayList2 = arrayList4;
                sb6.append(dVar2.f502729a);
                sb6.append(", shopName: ");
                sb6.append(dVar2.f502731c);
                sb6.append(", shopAppId: ");
                sb6.append(dVar2.f502730b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
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
            iVar.u(655360, 1, j28, str3, j27, dVar2.f502731c);
            iVar.u(655360, 2, j28, str3, j27, o13.n.i(dVar2.f502731c, false));
            iVar.u(655360, 3, j28, str3, j27, o13.n.i(dVar2.f502731c, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "insetIndex localId: " + dVar2.f502729a + ", shopName: " + dVar2.f502731c + ", shopAppId: " + dVar2.f502730b + ", shopTagModifyTime: " + dVar2.f502737i);
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
            iVar.F(kz5.n0.R0(kz5.b0.c(655360)), dVar3.f502729a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "deleteIndex localId: " + dVar3.f502729a + ", shopName: " + dVar3.f502731c + ", shopAppId: " + dVar3.f502730b);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1).F(kz5.n0.R0(kz5.b0.c(655360)), dVar3.f502729a);
        }
        iVar.L(-114L, j37);
        iVar.j();
        this.f98500n = arrayList6.size() + arrayList7.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "ModifyWeShopIndex success");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "{updateSize: " + this.f98500n + '}';
    }
}
