package j42;

/* loaded from: classes9.dex */
public class a implements j42.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f379194a;

    public a(int i17) {
        this.f379194a = i17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a(int i17) {
        if (i17 == 2) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_instant_cache_" + j62.e.g().n());
        }
        if (i17 != 1) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_cache_" + j62.e.g().n());
    }

    public final java.lang.String b(java.lang.String str) {
        if (u46.l.e(str)) {
            return null;
        }
        return "mmkv_key_data_cache_" + str;
    }

    @Override // j42.f
    /* renamed from: close */
    public void mo140333x5a5ddf8() {
    }

    @Override // j42.f
    public java.util.List e(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17;
        byte[] j17;
        java.util.List list;
        if (u46.l.e(str) || (a17 = a(this.f379194a)) == null) {
            return null;
        }
        java.lang.String b17 = b(str);
        if (!u46.l.e(b17) && (j17 = a17.j(b17)) != null && j17.length > 0) {
            r45.rh0 rh0Var = new r45.rh0();
            try {
                rh0Var.mo11468x92b714fd(j17);
                list = r42.c.a(rh0Var);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingCacheStrategyMMKV", "[EdgeComputingCacheStrategyMMKV] query parseFrom : " + b17 + ", throw Exception : " + e17.getMessage());
                list = null;
            }
            if (list != null) {
                return list;
            }
        }
        return null;
    }

    @Override // j42.f
    public void f(long j17) {
    }

    @Override // j42.f
    public void g() {
    }

    @Override // j42.f
    public long h() {
        java.util.List list;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a(this.f379194a);
        long j17 = 0;
        if (a17 == null) {
            return 0L;
        }
        java.lang.String[] b17 = a17.b();
        if (b17 != null && b17.length > 0) {
            for (java.lang.String str : b17) {
                byte[] j18 = a17.j(str);
                if (j18 != null && j18.length > 0) {
                    r45.rh0 rh0Var = new r45.rh0();
                    try {
                        rh0Var.mo11468x92b714fd(j18);
                        list = r42.c.a(rh0Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingCacheStrategyMMKV", "[EdgeComputingCacheStrategyMMKV] size parseFrom : " + str + ", throw Exception : " + e17.getMessage());
                        list = null;
                    }
                    if (list != null) {
                        j17 += list.size();
                    }
                }
            }
        }
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // j42.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(r42.a r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            int r0 = r8.f379194a
            com.tencent.mm.sdk.platformtools.o4 r0 = r8.a(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.String r1 = r9.f451042r
            java.lang.String r1 = r8.b(r1)
            boolean r2 = u46.l.e(r1)
            if (r2 == 0) goto L19
            return
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[EdgeComputingCacheStrategyMMKV] save key : "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EdgeComputingCacheStrategyMMKV"
            g42.i.a(r3, r2)
            byte[] r2 = r0.j(r1)
            r4 = 0
            if (r2 == 0) goto L61
            int r5 = r2.length
            if (r5 <= 0) goto L61
            r45.rh0 r5 = new r45.rh0
            r5.<init>()
            r5.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> L43
            java.util.List r2 = r42.c.a(r5)     // Catch: java.lang.Exception -> L43
            goto L62
        L43:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[EdgeComputingCacheStrategyMMKV] save parseFrom : "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ", throw Exception : "
            r5.append(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
        L61:
            r2 = r4
        L62:
            if (r2 != 0) goto L69
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L69:
            r2.add(r9)
            int r9 = r2.size()
            if (r9 > 0) goto L73
            goto L9f
        L73:
            r45.rh0 r4 = new r45.rh0
            r4.<init>()
            java.util.Iterator r9 = r2.iterator()
        L7c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r9.next()
            r42.a r2 = (r42.a) r2
            r45.qh0 r5 = new r45.qh0
            r5.<init>()
            long r6 = r2.f451043s
            r5.f465521e = r6
            java.lang.String r6 = r2.f451044t
            r5.f465522f = r6
            java.lang.String r2 = r2.f451042r
            r5.f465520d = r2
            java.util.LinkedList r2 = r4.f466396d
            r2.add(r5)
            goto L7c
        L9f:
            if (r4 == 0) goto Ldc
            byte[] r9 = r4.mo14344x5f01b1f6()     // Catch: java.lang.Exception -> Lc6
            boolean r9 = r0.H(r1, r9)     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r0.<init>()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r2 = "[EdgeComputingCacheStrategyMMKV] save encode : "
            r0.append(r2)     // Catch: java.lang.Exception -> Lc6
            r0.append(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r1 = ", mmkvEncode : "
            r0.append(r1)     // Catch: java.lang.Exception -> Lc6
            r0.append(r9)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> Lc6
            g42.i.a(r3, r9)     // Catch: java.lang.Exception -> Lc6
            goto Ldc
        Lc6:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[EdgeComputingCacheStrategyMMKV] save encode throw Exception : "
            r0.<init>(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r9)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j42.a.i(r42.a):void");
    }

    @Override // j42.f
    /* renamed from: remove */
    public void mo140334xc84af884(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17;
        if (u46.l.e(str) || (a17 = a(this.f379194a)) == null) {
            return;
        }
        java.lang.String b17 = b(str);
        if (u46.l.e(b17)) {
            return;
        }
        a17.W(b17);
        if (a17.Y() >= 3145728) {
            a17.a0();
        }
    }

    @Override // j42.f
    /* renamed from: reset */
    public void mo140335x6761d4f() {
    }
}
