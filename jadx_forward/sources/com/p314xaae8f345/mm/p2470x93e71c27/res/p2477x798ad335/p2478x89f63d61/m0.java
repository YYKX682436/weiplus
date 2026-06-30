package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes9.dex */
public abstract class m0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.SparseArray f271155f = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p944x882e457a.u0 f271156d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f271157e = new java.util.LinkedList();

    public m0() {
        int[] iArr = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.f271093c;
        int length = iArr.length;
        int i17 = 0;
        while (i17 < length) {
            int i18 = iArr[i17];
            if (((m35.a) f271155f.get(i18)) != null) {
                i17 = i18 == 39 && !com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.k.a() ? i17 + 1 : i17;
            }
            r45.fs5 fs5Var = new r45.fs5();
            fs5Var.f456124d = i18;
            this.f271157e.add(fs5Var);
        }
    }

    public abstract com.p314xaae8f345.mm.p971x6de15a2e.v0 H();

    public abstract java.lang.String I();

    public abstract r45.d20 J(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var);

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f271156d = u0Var;
        I();
        try {
            for (r45.fs5 fs5Var : this.f271157e) {
                java.util.List<com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0> a17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.y.a(fs5Var.f456124d);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ ");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I(), "before doScene type(%d) subtypeRecordList size=(%d) ", java.lang.Integer.valueOf(fs5Var.f456124d), java.lang.Integer.valueOf(a17.size()));
                for (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var : a17) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, -1);
                    if (P >= 0) {
                        if (37 == n0Var.f68792xb5ef19b5 && android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55))) {
                            byte[] bArr = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.f271091a;
                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, -1), false);
                        } else {
                            if (96 == n0Var.f68792xb5ef19b5 && android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55))) {
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, -1), false);
                            }
                            if (38 == n0Var.f68792xb5ef19b5 && n0Var.f68786xda09c2ad && android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I(), "before doScene, res(%d.%d) needRetry and cachedFilePath isEmpty, skip add fileVersion into req", java.lang.Integer.valueOf(n0Var.f68792xb5ef19b5), java.lang.Integer.valueOf(n0Var.f68796x5334f55));
                            } else if (83 == n0Var.f68792xb5ef19b5 && android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55))) {
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, -1), false);
                            } else if (103 == n0Var.f68792xb5ef19b5 && android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I(), "before doScene, res(%d.%d) needRetry and cachedFilePath isEmpty, skip add fileVersion(%s) into req", java.lang.Integer.valueOf(n0Var.f68792xb5ef19b5), java.lang.Integer.valueOf(n0Var.f68796x5334f55), n0Var.f68780xf1e133f7);
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, -1), false);
                            } else {
                                r45.ds5 ds5Var = new r45.ds5();
                                ds5Var.f454265d = n0Var.f68796x5334f55;
                                ds5Var.f454266e = P;
                                ds5Var.f454267f = n0Var.f68783xe47531de;
                                ds5Var.f454268g = n0Var.f68767x4b6dcf5b;
                                fs5Var.f456125e.add(ds5Var);
                                sb6.append(n0Var.f68796x5334f55);
                                sb6.append(";");
                                sb6.append(P);
                                sb6.append(", ");
                            }
                        }
                    }
                }
                sb6.append(" }");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I(), "before doScene, add subtypeList(%s) in type(%d)", sb6.toString(), java.lang.Integer.valueOf(fs5Var.f456124d));
            }
            return mo9409x10f9447a(sVar, H(), this);
        } catch (android.database.SQLException | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(I(), "doScene get SQLException(%s), return -1", e17);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public final void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I(), "onGYNetEnd errType(%d), errCode(%d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.d20 J2 = J(v0Var);
            java.lang.String I = I();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(J2.f453538d) ? "null" : java.lang.String.valueOf(J2.f453538d.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(I, "response.Res.size() = %s", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(J2.f453538d)) {
                s75.d.b(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.l0(this, J2.f453538d), "NetSceneCheckResUpdate-ResponseHandlingThread");
            }
        }
        this.f271156d.mo815x76e0bfae(i18, i19, str, this);
    }
}
