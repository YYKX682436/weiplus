package as2;

/* loaded from: classes2.dex */
public final class b extends by1.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f94970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String key) {
        super(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
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
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof as2.a
            if (r0 == 0) goto L13
            r0 = r6
            as2.a r0 = (as2.a) r0
            int r1 = r0.f94969g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94969g = r1
            goto L18
        L13:
            as2.a r0 = new as2.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f94967e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94969g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f94966d
            as2.b r0 = (as2.b) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.f1 r6 = r5.f117896d
            if (r6 == 0) goto L43
            boolean r6 = r6.a()
            if (r6 != r4) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r3
        L44:
            r5.f94970e = r6
            r0.f94966d = r5
            r0.f94969g = r4
            java.lang.Object r6 = by1.f.f(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            com.tencent.mm.modelbase.f r6 = (com.p314xaae8f345.mm.p944x882e457a.f) r6
            r0.f94970e = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestCache: errType = "
            r0.<init>(r1)
            r1 = 0
            if (r6 == 0) goto L68
            int r2 = r6.f152148a
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
            int r1 = r6.f152149b
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: as2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.f, by1.d
    public void c(java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f117894b = result;
        this.f117895c = j17;
    }

    @Override // by1.f
    public boolean d() {
        if (this.f117894b == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209312k0).mo141623x754a37bb()).r()).longValue() * 1000;
        if (longValue <= 0) {
            longValue = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC, 0) * 1000;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f117895c;
        boolean z17 = this.f94970e || currentTimeMillis < longValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetRelativeCache", "checkCacheAvailable: result=" + z17 + ", doNotCheckTime=" + this.f94970e + "cacheValidIntervalMs=" + longValue + ", cacheTimeDelta=" + currentTimeMillis);
        return z17;
    }

    @Override // by1.f
    public void e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int size = ((r45.aa1) result.f152151d).m75941xfb821914(1).size();
        if (size <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetRelativeCache", "recycleCache: size = " + size);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.aa1) result.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            e13Var.set(4, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null);
            e13Var.set(1, c19792x256d2725.m76803x6c285d75());
            e13Var.set(3, c19792x256d2725.m76829x97edf6c0());
            arrayList.add(e13Var);
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 162);
        new db2.f(arrayList, qt2Var).l();
    }

    public final r45.aa1 g() {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) this.f117894b;
        if (fVar != null) {
            return (r45.aa1) fVar.f152151d;
        }
        return null;
    }
}
