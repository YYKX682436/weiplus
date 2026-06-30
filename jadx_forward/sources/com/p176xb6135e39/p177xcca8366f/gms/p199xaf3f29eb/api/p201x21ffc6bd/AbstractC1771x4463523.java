package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.BasePendingResult */
/* loaded from: classes13.dex */
public abstract class AbstractC1771x4463523<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> {
    static final java.lang.ThreadLocal zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaq();
    public static final /* synthetic */ int zad = 0;

    /* renamed from: resultGuardian */
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zas f5907x166e78ce;
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler zab;
    protected final java.lang.ref.WeakReference zac;
    private final java.lang.Object zae;
    private final java.util.concurrent.CountDownLatch zaf;
    private final java.util.ArrayList zag;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2 zah;
    private final java.util.concurrent.atomic.AtomicReference zai;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d zaj;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 zao;
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 zap;
    private boolean zaq;

    @java.lang.Deprecated
    public AbstractC1771x4463523() {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler(android.os.Looper.getMainLooper());
        this.zac = new java.lang.ref.WeakReference(null);
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d zaa() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d;
        synchronized (this.zae) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed.");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(m17881x7b5e8699(), "Result is not ready.");
            interfaceC1758x91b2b43d = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1876x38ede5 c1876x38ede5 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1876x38ede5) this.zai.getAndSet(null);
        if (c1876x38ede5 != null) {
            c1876x38ede5.zaa.zab.remove(this);
        }
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1758x91b2b43d);
    }

    private final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        this.zaj = interfaceC1758x91b2b43d;
        this.zak = interfaceC1758x91b2b43d.mo17538x2fe4f2e8();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2 interfaceC1759x2ba3aba2 = this.zah;
            if (interfaceC1759x2ba3aba2 != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(interfaceC1759x2ba3aba2, zaa());
            } else if (this.zaj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) {
                this.f5907x166e78ce = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zas(this, null);
            }
        }
        java.util.ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener) arrayList.get(i17)).mo17821x815f5438(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        if (interfaceC1758x91b2b43d instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) {
            try {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) interfaceC1758x91b2b43d).mo17739x41012807();
            } catch (java.lang.RuntimeException unused) {
                "Unable to release ".concat(java.lang.String.valueOf(interfaceC1758x91b2b43d));
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: addStatusListener */
    public final void mo17814xbaafdc7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener statusListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(statusListener != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (m17881x7b5e8699()) {
                statusListener.mo17821x815f5438(this.zak);
            } else {
                this.zag.add(statusListener);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: await */
    public final R mo17815x58e7956() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("await must not be called on the UI thread");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (java.lang.InterruptedException unused) {
            m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5902xe4a79900);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(m17881x7b5e8699(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: cancel */
    public void mo17729xae7a2e7a() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 interfaceC1915x36c76796 = this.zao;
                if (interfaceC1915x36c76796 != null) {
                    try {
                        interfaceC1915x36c76796.mo18180xae7a2e7a();
                    } catch (android.os.RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5899x14383a7b));
            }
        }
    }

    /* renamed from: createFailedResult */
    public abstract R mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);

    @java.lang.Deprecated
    /* renamed from: forceFailureUnlessReady */
    public final void m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        synchronized (this.zae) {
            if (!m17881x7b5e8699()) {
                m17883x209a1f1f(mo17567xe8a1c1d6(c1763x9432bc12));
                this.zan = true;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: isCanceled */
    public final boolean mo17817xc9602be3() {
        boolean z17;
        synchronized (this.zae) {
            z17 = this.zam;
        }
        return z17;
    }

    /* renamed from: isReady */
    public final boolean m17881x7b5e8699() {
        return this.zaf.getCount() == 0;
    }

    /* renamed from: setCancelToken */
    public final void m17882x11f151dd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 interfaceC1915x36c76796) {
        synchronized (this.zae) {
            this.zao = interfaceC1915x36c76796;
        }
    }

    /* renamed from: setResult */
    public final void m17883x209a1f1f(R r17) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r17);
                return;
            }
            m17881x7b5e8699();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!m17881x7b5e8699(), "Results have already been set");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed");
            zab(r17);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: setResultCallback */
    public final void mo17818x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2) {
        synchronized (this.zae) {
            if (interfaceC1759x2ba3aba2 == null) {
                this.zah = null;
                return;
            }
            boolean z17 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z17 = false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Cannot set callbacks if then() has been called.");
            if (mo17817xc9602be3()) {
                return;
            }
            if (m17881x7b5e8699()) {
                this.zab.zaa(interfaceC1759x2ba3aba2, zaa());
            } else {
                this.zah = interfaceC1759x2ba3aba2;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: then */
    public final <S extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<S> mo17820x364e1d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf<? super R, ? extends S> abstractC1761xc5c84baf) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<S> mo17860x364e1d;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zap == null, "Cannot call then() twice.");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zah == null, "Cannot call then() if callbacks are set.");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4(this.zac);
            mo17860x364e1d = this.zap.mo17860x364e1d(abstractC1761xc5c84baf);
            if (m17881x7b5e8699()) {
                this.zab.zaa(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return mo17860x364e1d;
    }

    public final void zak() {
        boolean z17 = true;
        if (!this.zaq && !((java.lang.Boolean) zaa.get()).booleanValue()) {
            z17 = false;
        }
        this.zaq = z17;
    }

    public final boolean zam() {
        boolean mo17817xc9602be3;
        synchronized (this.zae) {
            if (((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) this.zac.get()) == null || !this.zaq) {
                mo17729xae7a2e7a();
            }
            mo17817xc9602be3 = mo17817xc9602be3();
        }
        return mo17817xc9602be3;
    }

    public final void zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1876x38ede5 c1876x38ede5) {
        this.zai.set(c1876x38ede5);
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler */
    /* loaded from: classes13.dex */
    public static class CallbackHandler<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau {
        public CallbackHandler() {
            super(android.os.Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            int i17 = message.what;
            if (i17 != 1) {
                if (i17 == 2) {
                    ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523) message.obj).m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5905x262fcf1f);
                    return;
                }
                android.util.Log.wtf("BasePendingResult", "Don't know how to handle message: " + i17, new java.lang.Exception());
                return;
            }
            android.util.Pair pair = (android.util.Pair) message.obj;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2 interfaceC1759x2ba3aba2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2) pair.first;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d) pair.second;
            try {
                interfaceC1759x2ba3aba2.mo17836x57429edc(interfaceC1758x91b2b43d);
            } catch (java.lang.RuntimeException e17) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.zal(interfaceC1758x91b2b43d);
                throw e17;
            }
        }

        public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2 interfaceC1759x2ba3aba2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
            int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.zad;
            sendMessage(obtainMessage(1, new android.util.Pair((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1759x2ba3aba2), interfaceC1758x91b2b43d)));
        }

        public CallbackHandler(android.os.Looper looper) {
            super(looper);
        }
    }

    @java.lang.Deprecated
    public AbstractC1771x4463523(android.os.Looper looper) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler(looper);
        this.zac = new java.lang.ref.WeakReference(null);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: await */
    public final R mo17816x58e7956(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (j17 > 0) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("await must not be called on the UI thread when time is greater than zero.");
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j17, timeUnit)) {
                m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5905x262fcf1f);
            }
        } catch (java.lang.InterruptedException unused) {
            m17880xebad2b72(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5902xe4a79900);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(m17881x7b5e8699(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: setResultCallback */
    public final void mo17819x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2, long j17, java.util.concurrent.TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (interfaceC1759x2ba3aba2 == null) {
                this.zah = null;
                return;
            }
            boolean z17 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z17 = false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Cannot set callbacks if then() has been called.");
            if (mo17817xc9602be3()) {
                return;
            }
            if (m17881x7b5e8699()) {
                this.zab.zaa(interfaceC1759x2ba3aba2, zaa());
            } else {
                this.zah = interfaceC1759x2ba3aba2;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler callbackHandler = this.zab;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j17));
            }
        }
    }

    public AbstractC1771x4463523(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler(abstractC1748xd28d482c != null ? abstractC1748xd28d482c.mo17781x23b2dd47() : android.os.Looper.getMainLooper());
        this.zac = new java.lang.ref.WeakReference(abstractC1748xd28d482c);
    }

    public AbstractC1771x4463523(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler<R> callbackHandler) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(callbackHandler, "CallbackHandler must not be null");
        this.zac = new java.lang.ref.WeakReference(null);
    }
}
