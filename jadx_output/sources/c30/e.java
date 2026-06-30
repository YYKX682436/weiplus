package c30;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f38107a = new com.tencent.wcdb.core.Database(gm0.j1.u().h() + "EcsWeShop.db");

    /* renamed from: b, reason: collision with root package name */
    public c30.f f38108b;

    /* renamed from: c, reason: collision with root package name */
    public c30.t f38109c;

    public final boolean a(java.util.List list, yz5.p pVar) {
        int size = list.size();
        if (size == 0) {
            return true;
        }
        int i17 = 0;
        while (i17 < size) {
            int min = java.lang.Math.min(100, size - i17) + i17;
            if (min > size) {
                return false;
            }
            if (!((java.lang.Boolean) pVar.invoke(list.subList(i17, min), java.lang.Long.valueOf(c() + 1))).booleanValue()) {
                return false;
            }
            i17 = min;
        }
        return true;
    }

    public final boolean b(yz5.l transactionHandle) {
        kotlin.jvm.internal.o.g(transactionHandle, "transactionHandle");
        try {
            this.f38107a.runTransaction(new c30.a(transactionHandle, this));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopDB", e17, "runTransaction error: " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public final long c() {
        c30.t tVar = this.f38109c;
        if (tVar == null) {
            return 0L;
        }
        try {
            com.tencent.wcdb.base.Value value = tVar.f38162a.getValue(tq.b.f421193m.max());
            if (value != null) {
                return value.getLong();
            }
            return 0L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopItemStorage", e17, "getMaxUpdateSeq error: " + e17.getMessage(), new java.lang.Object[0]);
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(java.lang.String shopHistoryNextKey) {
        tq.c cVar;
        kotlin.jvm.internal.o.g(shopHistoryNextKey, "shopHistoryNextKey");
        c30.f fVar = this.f38108b;
        if (fVar == null) {
            return false;
        }
        com.tencent.wcdb.core.Table table = fVar.f38112a;
        try {
            cVar = (tq.c) table.getFirstObject(tq.a.f421179c.eq(1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopExtItemStorage", e17, "getByBizId error: " + e17.getMessage(), new java.lang.Object[0]);
            cVar = null;
        }
        if (cVar == null) {
            try {
                tq.c cVar2 = new tq.c();
                cVar2.f421194a = 1;
                cVar2.f421195b = shopHistoryNextKey;
                table.insertObject(cVar2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopExtItemStorage", e18, "updateShopHistoryNextKey error: " + e18.getMessage(), new java.lang.Object[0]);
                return false;
            }
        } else {
            try {
                table.updateValue(shopHistoryNextKey, tq.a.f421180d, tq.a.f421179c.eq(1));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopExtItemStorage", e19, "updateShopHistoryNextKey error: " + e19.getMessage(), new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:52:0x00ab, B:38:0x00b3, B:40:0x00ba, B:41:0x00c2, B:42:0x00c8, B:49:0x00bd), top: B:51:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(tq.d r9, bw5.t9 r10, long r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.e.e(tq.d, bw5.t9, long):void");
    }
}
