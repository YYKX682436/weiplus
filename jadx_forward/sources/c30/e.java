package c30;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f119640a = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b(gm0.j1.u().h() + "EcsWeShop.db");

    /* renamed from: b, reason: collision with root package name */
    public c30.f f119641b;

    /* renamed from: c, reason: collision with root package name */
    public c30.t f119642c;

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
            if (!((java.lang.Boolean) pVar.mo149xb9724478(list.subList(i17, min), java.lang.Long.valueOf(c() + 1))).booleanValue()) {
                return false;
            }
            i17 = min;
        }
        return true;
    }

    public final boolean b(yz5.l transactionHandle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transactionHandle, "transactionHandle");
        try {
            this.f119640a.m106962xc8054b53(new c30.a(transactionHandle, this));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopDB", e17, "runTransaction error: " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public final long c() {
        c30.t tVar = this.f119642c;
        if (tVar == null) {
            return 0L;
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107276x754a37bb = tVar.f119695a.m107276x754a37bb(tq.b.f502726m.max());
            if (m107276x754a37bb != null) {
                return m107276x754a37bb.m106361xfb822ef2();
            }
            return 0L;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopItemStorage", e17, "getMaxUpdateSeq error: " + e17.getMessage(), new java.lang.Object[0]);
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(java.lang.String shopHistoryNextKey) {
        tq.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopHistoryNextKey, "shopHistoryNextKey");
        c30.f fVar = this.f119641b;
        if (fVar == null) {
            return false;
        }
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = fVar.f119645a;
        try {
            cVar = (tq.c) c26924x4cd4bae.m107127x946de4d9(tq.a.f502712c.eq(1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopExtItemStorage", e17, "getByBizId error: " + e17.getMessage(), new java.lang.Object[0]);
            cVar = null;
        }
        if (cVar == null) {
            try {
                tq.c cVar2 = new tq.c();
                cVar2.f502727a = 1;
                cVar2.f502728b = shopHistoryNextKey;
                c26924x4cd4bae.m107150x251da358(cVar2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopExtItemStorage", e18, "updateShopHistoryNextKey error: " + e18.getMessage(), new java.lang.Object[0]);
                return false;
            }
        } else {
            try {
                c26924x4cd4bae.m107326xdd4a7e28(shopHistoryNextKey, tq.a.f502713d, tq.a.f502712c.eq(1));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopExtItemStorage", e19, "updateShopHistoryNextKey error: " + e19.getMessage(), new java.lang.Object[0]);
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
