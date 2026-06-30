package as2;

/* loaded from: classes2.dex */
public final class b extends by1.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f13437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String key) {
        super(key);
        kotlin.jvm.internal.o.g(key, "key");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // by1.f, by1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof as2.a
            if (r0 == 0) goto L13
            r0 = r6
            as2.a r0 = (as2.a) r0
            int r1 = r0.f13436g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13436g = r1
            goto L18
        L13:
            as2.a r0 = new as2.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13434e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f13436g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f13433d
            as2.b r0 = (as2.b) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.f1 r6 = r5.f36363d
            if (r6 == 0) goto L43
            boolean r6 = r6.a()
            if (r6 != r4) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r3
        L44:
            r5.f13437e = r6
            r0.f13433d = r5
            r0.f13436g = r4
            java.lang.Object r6 = by1.f.f(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6
            r0.f13437e = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestCache: errType = "
            r0.<init>(r1)
            r1 = 0
            if (r6 == 0) goto L68
            int r2 = r6.f70615a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L69
        L68:
            r3 = r1
        L69:
            r0.append(r3)
            java.lang.String r2 = ", errCode="
            r0.append(r2)
            if (r6 == 0) goto L7b
            int r1 = r6.f70616b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = r2
        L7b:
            r0.append(r1)
            java.lang.String r1 = ", cache="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderGetRelativeCache"
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: as2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.f, by1.d
    public void c(java.lang.Object obj, long j17) {
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        this.f36361b = result;
        this.f36362c = j17;
    }

    @Override // by1.f
    public boolean d() {
        if (this.f36361b == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127779k0).getValue()).r()).longValue() * 1000;
        if (longValue <= 0) {
            longValue = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC, 0) * 1000;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f36362c;
        boolean z17 = this.f13437e || currentTimeMillis < longValue;
        com.tencent.mars.xlog.Log.i("FinderGetRelativeCache", "checkCacheAvailable: result=" + z17 + ", doNotCheckTime=" + this.f13437e + "cacheValidIntervalMs=" + longValue + ", cacheTimeDelta=" + currentTimeMillis);
        return z17;
    }

    @Override // by1.f
    public void e(java.lang.Object obj) {
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        int size = ((r45.aa1) result.f70618d).getList(1).size();
        if (size <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderGetRelativeCache", "recycleCache: size = " + size);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.aa1) result.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(finderObject.getId()));
            r45.dm2 object_extend = finderObject.getObject_extend();
            e13Var.set(4, object_extend != null ? object_extend.getString(62) : null);
            e13Var.set(1, finderObject.getObjectNonceId());
            e13Var.set(3, finderObject.getSessionBuffer());
            arrayList.add(e13Var);
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 162);
        new db2.f(arrayList, qt2Var).l();
    }

    public final r45.aa1 g() {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) this.f36361b;
        if (fVar != null) {
            return (r45.aa1) fVar.f70618d;
        }
        return null;
    }
}
