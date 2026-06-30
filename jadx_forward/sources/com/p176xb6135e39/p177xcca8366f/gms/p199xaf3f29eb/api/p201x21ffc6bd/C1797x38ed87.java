package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zaaa */
/* loaded from: classes13.dex */
public final class C1797x38ed87 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 {
    private final android.content.Context zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa zab;
    private final android.os.Looper zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae zad;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae zae;
    private final java.util.Map zaf;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb zah;
    private android.os.Bundle zai;
    private final java.util.concurrent.locks.Lock zam;
    private final java.util.Set zag = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaj = null;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zak = null;
    private boolean zal = false;
    private int zan = 0;

    private C1797x38ed87(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa c1827x38edaa, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a, java.util.Map map, java.util.Map map2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.Map map3, java.util.Map map4) {
        this.zaa = context;
        this.zab = c1827x38edaa;
        this.zam = lock;
        this.zac = looper;
        this.zah = interfaceC1736x7877dfeb;
        this.zad = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae(context, c1827x38edaa, lock, looper, c1706xe937257a, map2, null, map4, null, arrayList2, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zax(this, null));
        this.zae = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae(context, c1827x38edaa, lock, looper, c1706xe937257a, map, c1904x2257e52e, map3, abstractC1731x2722202e, arrayList, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaz(this, null));
        x.b bVar = new x.b();
        java.util.Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            bVar.put((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) it.next(), this.zad);
        }
        java.util.Iterator it6 = map.keySet().iterator();
        while (it6.hasNext()) {
            bVar.put((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) it6.next(), this.zae);
        }
        this.zaf = java.util.Collections.unmodifiableMap(bVar);
    }

    private final void zaA(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        int i17 = this.zan;
        if (i17 != 1) {
            if (i17 != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.Exception());
                this.zan = 0;
            }
            this.zab.zaa(c1700xff0c58bb);
        }
        zaB();
        this.zan = 0;
    }

    private final void zaB() {
        java.util.Iterator it = this.zag.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934) it.next()).mo17558x815f5438();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = this.zak;
        return c1700xff0c58bb != null && c1700xff0c58bb.m17600x130a215f() == 4;
    }

    private final boolean zaD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae) this.zaf.get(apiMethodImpl.m17875x8def0bde());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1831x38edae, "GoogleApiClient is not configured to use the API required for this call.");
        return c1831x38edae.equals(this.zae);
    }

    private static boolean zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        return c1700xff0c58bb != null && c1700xff0c58bb.m17605x6e268779();
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 zag(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa c1827x38edaa, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a, java.util.Map map, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, java.util.Map map2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e, java.util.ArrayList arrayList) {
        x.b bVar = new x.b();
        x.b bVar2 = new x.b();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = null;
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) entry.getValue();
            if (true == interfaceC1736x7877dfeb2.mo17564x6e8aa054()) {
                interfaceC1736x7877dfeb = interfaceC1736x7877dfeb2;
            }
            if (interfaceC1736x7877dfeb2.mo17723xabdb8910()) {
                bVar.put((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) entry.getKey(), interfaceC1736x7877dfeb2);
            } else {
                bVar2.put((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) entry.getKey(), interfaceC1736x7877dfeb2);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!bVar.m174752x7aab3243(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        x.b bVar3 = new x.b();
        x.b bVar4 = new x.b();
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api : map2.keySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28 zab = api.zab();
            if (bVar.m174748xc6607c0(zab)) {
                bVar3.put(api, (java.lang.Boolean) map2.get(api));
            } else {
                if (!bVar2.m174748xc6607c0(zab)) {
                    throw new java.lang.IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                bVar4.put(api, (java.lang.Boolean) map2.get(api));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zat zatVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zat) arrayList.get(i17);
            if (bVar3.m174748xc6607c0(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!bVar4.m174748xc6607c0(zatVar.zaa)) {
                    throw new java.lang.IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87(context, c1827x38edaa, lock, looper, c1706xe937257a, bVar, bVar2, c1904x2257e52e, abstractC1731x2722202e, interfaceC1736x7877dfeb, arrayList2, arrayList3, bVar3, bVar4);
    }

    public static /* bridge */ /* synthetic */ void zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 c1797x38ed87, int i17, boolean z17) {
        c1797x38ed87.zab.zac(i17, z17);
        c1797x38ed87.zak = null;
        c1797x38ed87.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 c1797x38ed87, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = c1797x38ed87.zai;
        if (bundle2 == null) {
            c1797x38ed87.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 c1797x38ed87) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb;
        if (!zaE(c1797x38ed87.zaj)) {
            if (c1797x38ed87.zaj != null && zaE(c1797x38ed87.zak)) {
                c1797x38ed87.zae.zar();
                c1797x38ed87.zaA((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1797x38ed87.zaj));
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb2 = c1797x38ed87.zaj;
            if (c1700xff0c58bb2 == null || (c1700xff0c58bb = c1797x38ed87.zak) == null) {
                return;
            }
            if (c1797x38ed87.zae.zaf < c1797x38ed87.zad.zaf) {
                c1700xff0c58bb2 = c1700xff0c58bb;
            }
            c1797x38ed87.zaA(c1700xff0c58bb2);
            return;
        }
        if (!zaE(c1797x38ed87.zak) && !c1797x38ed87.zaC()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb3 = c1797x38ed87.zak;
            if (c1700xff0c58bb3 != null) {
                if (c1797x38ed87.zan == 1) {
                    c1797x38ed87.zaB();
                    return;
                } else {
                    c1797x38ed87.zaA(c1700xff0c58bb3);
                    c1797x38ed87.zad.zar();
                    return;
                }
            }
            return;
        }
        int i17 = c1797x38ed87.zan;
        if (i17 != 1) {
            if (i17 != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.AssertionError());
                c1797x38ed87.zan = 0;
            }
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1797x38ed87.zab)).zab(c1797x38ed87.zai);
        }
        c1797x38ed87.zaB();
        c1797x38ed87.zan = 0;
    }

    private final android.app.PendingIntent zaz() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = this.zah;
        if (interfaceC1736x7877dfeb == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.zaa, java.lang.System.identityHashCode(this.zab), interfaceC1736x7877dfeb.mo17562xc37ac774(), com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zap.zaa | 134217728);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zab() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zac(long j17, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zaf.get(api.zab()), this.zae) ? zaC() ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(4, zaz()) : this.zae.zad(api) : this.zad.zad(api);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.zad.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaC()) {
            apiMethodImpl.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4, (java.lang.String) null, zaz()));
            return apiMethodImpl;
        }
        this.zae.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4, (java.lang.String) null, zaz()));
        return apiMethodImpl;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("authClient").println(":");
        this.zae.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((java.lang.CharSequence) str).append("anonClient").println(":");
        this.zad.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final void zau() {
        this.zam.lock();
        try {
            boolean zax = zax();
            this.zae.zar();
            this.zak = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(4);
            if (zax) {
                new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(this.zac).post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.zan == 1) goto L11;
     */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = r2
        L22:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zaw():boolean");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final boolean zax() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5
    public final boolean zay(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934 interfaceC1790xea568934) {
        this.zam.lock();
        try {
            boolean z17 = false;
            if ((zax() || zaw()) && !this.zae.zaw()) {
                this.zag.add(interfaceC1790xea568934);
                z17 = true;
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
            }
            return z17;
        } finally {
            this.zam.unlock();
        }
    }
}
