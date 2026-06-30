package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zabe */
/* loaded from: classes13.dex */
public final class C1827x38edaa extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf {
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1846x38edbd zab;
    final java.util.Map zac;
    java.util.Set zad;
    final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zae;
    final java.util.Map zaf;
    final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zag;
    java.util.Set zah;
    final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1877x38ede6 zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zak zak;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1825x38eda8 zas;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zat;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3 zau;
    private final java.util.ArrayList zav;
    private java.lang.Integer zaw;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaj zax;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 zal = null;
    final java.util.Queue zaa = new java.util.LinkedList();

    public C1827x38edaa(android.content.Context context, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e, java.util.Map map, java.util.List list, java.util.List list2, java.util.Map map2, int i17, int i18, java.util.ArrayList arrayList) {
        this.zaq = true != com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1990x36406441.m18534xe2218f33() ? u04.d.f505010c : com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.zar = 5000L;
        this.zad = new java.util.HashSet();
        this.zau = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3();
        this.zaw = null;
        this.zah = null;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1821x38ed9f c1821x38ed9f = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1821x38ed9f(this);
        this.zax = c1821x38ed9f;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zak(looper, c1821x38ed9f);
        this.zao = looper;
        this.zas = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1825x38eda8(this, looper);
        this.zat = c1705x2db7dcfc;
        this.zam = i17;
        if (i17 >= 0) {
            this.zaw = java.lang.Integer.valueOf(i18);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1877x38ede6();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) it.next());
        }
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            this.zak.zag((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) it6.next());
        }
        this.zae = c1904x2257e52e;
        this.zag = abstractC1731x2722202e;
    }

    public static int zad(java.lang.Iterable iterable, boolean z17) {
        java.util.Iterator it = iterable.iterator();
        boolean z18 = false;
        boolean z19 = false;
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) it.next();
            z18 |= interfaceC1736x7877dfeb.mo17723xabdb8910();
            z19 |= interfaceC1736x7877dfeb.mo17564x6e8aa054();
        }
        if (z18) {
            return (z19 && z17) ? 2 : 1;
        }
        return 3;
    }

    public static java.lang.String zag(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa c1827x38edaa) {
        c1827x38edaa.zaj.lock();
        try {
            if (c1827x38edaa.zap) {
                c1827x38edaa.zan();
            }
        } finally {
            c1827x38edaa.zaj.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void zaj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa c1827x38edaa) {
        c1827x38edaa.zaj.lock();
        try {
            if (c1827x38edaa.zak()) {
                c1827x38edaa.zan();
            }
        } finally {
            c1827x38edaa.zaj.unlock();
        }
    }

    private final void zal(int i17) {
        java.lang.Integer num = this.zaw;
        if (num == null) {
            this.zaw = java.lang.Integer.valueOf(i17);
        } else if (num.intValue() != i17) {
            throw new java.lang.IllegalStateException("Cannot use sign-in mode: " + zag(i17) + ". Mode was already set to " + zag(this.zaw.intValue()));
        }
        if (this.zal != null) {
            return;
        }
        boolean z17 = false;
        boolean z18 = false;
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb : this.zac.values()) {
            z17 |= interfaceC1736x7877dfeb.mo17723xabdb8910();
            z18 |= interfaceC1736x7877dfeb.mo17564x6e8aa054();
        }
        int intValue = this.zaw.intValue();
        if (intValue == 1) {
            if (!z17) {
                throw new java.lang.IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z18) {
                throw new java.lang.IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z17) {
            this.zal = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 c1793x54db91a2, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p208x7643c6b5.C1942x78a4160b.zaa.zaa(abstractC1748xd28d482c).mo17818x1deb1484(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1824x38eda7(this, c1793x54db91a2, z17, abstractC1748xd28d482c));
    }

    private final void zan() {
        this.zak.zab();
        ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zal)).zaq();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: blockingConnect */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17769x9eb66ef5() {
        boolean z17 = true;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z17 = false;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zal(((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaw)).intValue());
            this.zak.zab();
            return ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zal)).zab();
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: clearDefaultAccountAndReconnect */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo17771xd7f4e239() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(mo17784x23b734ff(), "GoogleApiClient is not connected yet.");
        java.lang.Integer num = this.zaw;
        boolean z17 = true;
        if (num != null && num.intValue() == 2) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 c1793x54db91a2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2(this);
        if (this.zac.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p208x7643c6b5.C1942x78a4160b.f5957x5eb35bcb)) {
            zam(this, c1793x54db91a2, false);
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1822x38eda0 c1822x38eda0 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1822x38eda0(this, atomicReference, c1793x54db91a2);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1823x38eda6 c1823x38eda6 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1823x38eda6(this, c1793x54db91a2);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder builder = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder(this.zan);
            builder.m17797xab35b9b9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p208x7643c6b5.C1942x78a4160b.API);
            builder.m17801xcbaa852f(c1822x38eda0);
            builder.m17802xafc010f(c1823x38eda6);
            builder.m17809xda89e088(this.zas);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c m17804x59bc66e = builder.m17804x59bc66e();
            atomicReference.set(m17804x59bc66e);
            m17804x59bc66e.mo17772x38b478ea();
        }
        return c1793x54db91a2;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: connect */
    public final void mo17772x38b478ea() {
        this.zaj.lock();
        try {
            int i17 = 2;
            boolean z17 = false;
            if (this.zam >= 0) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaw)).intValue();
            this.zaj.lock();
            if (intValue == 3 || intValue == 1) {
                i17 = intValue;
            } else if (intValue != 2) {
                i17 = intValue;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "Illegal sign-in mode: " + i17);
                zal(i17);
                zan();
                this.zaj.unlock();
            }
            z17 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "Illegal sign-in mode: " + i17);
            zal(i17);
            zan();
            this.zaj.unlock();
        } catch (java.lang.Throwable th6) {
            throw th6;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: disconnect */
    public final void mo17774x1f9d589c() {
        this.zaj.lock();
        try {
            this.zai.zab();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
            if (interfaceC1849x38edc5 != null) {
                interfaceC1849x38edc5.zar();
            }
            this.zau.zab();
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.mo17729xae7a2e7a();
            }
            this.zaa.clear();
            if (this.zal != null) {
                zak();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: dump */
    public final void mo17775x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((java.lang.CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
        if (interfaceC1849x38edc5 != null) {
            interfaceC1849x38edc5.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: enqueue */
    public final <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<R, A>> T mo17776xa0f98e08(T t17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> m17874xb5882ae4 = t17.m17874xb5882ae4();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.zac.containsKey(t17.m17875x8def0bde()), "GoogleApiClient is not configured to use " + (m17874xb5882ae4 != null ? m17874xb5882ae4.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
            if (interfaceC1849x38edc5 == null) {
                this.zaa.add(t17);
            } else {
                t17 = (T) interfaceC1849x38edc5.zae(t17);
            }
            return t17;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: execute */
    public final <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A>> T mo17777xb158f775(T t17) {
        java.util.Map map = this.zac;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> m17874xb5882ae4 = t17.m17874xb5882ae4();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(map.containsKey(t17.m17875x8def0bde()), "GoogleApiClient is not configured to use " + (m17874xb5882ae4 != null ? m17874xb5882ae4.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
            if (interfaceC1849x38edc5 == null) {
                throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zap) {
                this.zaa.add(t17);
                while (!this.zaa.isEmpty()) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl) this.zaa.remove();
                    this.zai.zaa(apiMethodImpl);
                    apiMethodImpl.mo17877x921f43c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5901x9c108648);
                }
            } else {
                t17 = (T) interfaceC1849x38edc5.zaf(t17);
            }
            return t17;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: getClient */
    public final <C extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb> C mo17778x142a16c1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<C> c1733x6b09fe28) {
        C c17 = (C) this.zac.get(c1733x6b09fe28);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c17, "Appropriate Api was not requested.");
        return c17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: getConnectionResult */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17779xd9207c11(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb;
        this.zaj.lock();
        try {
            if (!mo17784x23b734ff() && !this.zap) {
                throw new java.lang.IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new java.lang.IllegalArgumentException(api.zad() + " was never registered with GoogleApiClient");
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zad = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zal)).zad(api);
            if (zad != null) {
                return zad;
            }
            if (this.zap) {
                c1700xff0c58bb = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.f5810x535c1c1;
            } else {
                zaf();
                android.util.Log.wtf("GoogleApiClientImpl", api.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new java.lang.Exception());
                c1700xff0c58bb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null);
            }
            return c1700xff0c58bb;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: getContext */
    public final android.content.Context mo17780x76847179() {
        return this.zan;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: getLooper */
    public final android.os.Looper mo17781x23b2dd47() {
        return this.zao;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: hasApi */
    public final boolean mo17782xb7043120(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: hasConnectedApi */
    public final boolean mo17783xb736160b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb;
        return mo17784x23b734ff() && (interfaceC1736x7877dfeb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) this.zac.get(api.zab())) != null && interfaceC1736x7877dfeb.mo17718x23b734ff();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: isConnected */
    public final boolean mo17784x23b734ff() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
        return interfaceC1849x38edc5 != null && interfaceC1849x38edc5.zaw();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: isConnecting */
    public final boolean mo17785x532f7b82() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
        return interfaceC1849x38edc5 != null && interfaceC1849x38edc5.zax();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: isConnectionCallbacksRegistered */
    public final boolean mo17786xc5c3d528(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: isConnectionFailedListenerRegistered */
    public final boolean mo17787x1ae8313b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: maybeSignIn */
    public final boolean mo17788x402f564a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934 interfaceC1790xea568934) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
        return interfaceC1849x38edc5 != null && interfaceC1849x38edc5.zay(interfaceC1790xea568934);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: maybeSignOut */
    public final void mo17789xc5bb8ac9() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5 interfaceC1849x38edc5 = this.zal;
        if (interfaceC1849x38edc5 != null) {
            interfaceC1849x38edc5.zau();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: reconnect */
    public final void mo17790x3b049b57() {
        mo17774x1f9d589c();
        mo17772x38b478ea();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: registerConnectionCallbacks */
    public final void mo17791xa03bbbed(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: registerConnectionFailedListener */
    public final void mo17792x6b067852(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: registerListener */
    public final <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> mo17793x42780477(L l17) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l17, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: stopAutoManage */
    public final void mo17794x58cd7196(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 c1778x4647479 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479((android.app.Activity) activityC1102x9ee2d9f);
        if (this.zam < 0) {
            throw new java.lang.IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak.zaa(c1778x4647479).zae(this.zam);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: unregisterConnectionCallbacks */
    public final void mo17795xfb9055b4(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: unregisterConnectionFailedListener */
    public final void mo17796x6d3de2eb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        if (!this.zat.m17646x244e0a07(this.zan, c1700xff0c58bb.m17600x130a215f())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(c1700xff0c58bb);
        this.zak.zaa();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zab(android.os.Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            mo17777xb158f775((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl) this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zac(int i17, boolean z17) {
        if (i17 == 1) {
            if (!z17 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1990x36406441.m18534xe2218f33()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1826x38eda9(this));
                    } catch (java.lang.SecurityException unused) {
                    }
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1825x38eda8 handlerC1825x38eda8 = this.zas;
                handlerC1825x38eda8.sendMessageDelayed(handlerC1825x38eda8.obtainMessage(1), this.zaq);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1825x38eda8 handlerC1825x38eda82 = this.zas;
                handlerC1825x38eda82.sendMessageDelayed(handlerC1825x38eda82.obtainMessage(2), this.zar);
            }
            i17 = 1;
        }
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523 abstractC1771x4463523 : (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523[]) this.zai.zab.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523[0])) {
            abstractC1771x4463523.m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1877x38ede6.zaa);
        }
        this.zak.zae(i17);
        this.zak.zaa();
        if (i17 == 2) {
            zan();
        }
    }

    public final java.lang.String zaf() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        mo17775x2f39f4("", null, new java.io.PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1846x38edbd c1846x38edbd = this.zab;
        if (c1846x38edbd != null) {
            c1846x38edbd.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    public final void zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new java.util.HashSet();
            }
            this.zah.add(c1875x38ede4);
        } finally {
            this.zaj.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r3;
     */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            java.util.Set r0 = r2.zah     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.String r3 = "Attempted to remove pending transform when no transforms are registered."
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            android.util.Log.wtf(r1, r3, r0)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.String r3 = "Failed to remove pending transform - this may lead to memory leaks!"
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            android.util.Log.wtf(r1, r3, r0)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set r3 = r2.zah     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            com.google.android.gms.common.api.internal.zaca r3 = r2.zal     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.zat()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa.zap(com.google.android.gms.common.api.internal.zada):void");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: blockingConnect */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17770x9eb66ef5(long j17, java.util.concurrent.TimeUnit timeUnit) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            java.lang.Integer num = this.zaw;
            if (num == null) {
                this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zal(((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaw)).intValue());
            this.zak.zab();
            return ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1849x38edc5) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zal)).zac(j17, timeUnit);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c
    /* renamed from: connect */
    public final void mo17773x38b478ea(int i17) {
        this.zaj.lock();
        boolean z17 = true;
        if (i17 != 3 && i17 != 1) {
            if (i17 == 2) {
                i17 = 2;
            } else {
                z17 = false;
            }
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "Illegal sign-in mode: " + i17);
            zal(i17);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
