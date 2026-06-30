package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.api.GoogleApiClient */
/* loaded from: classes13.dex */
public abstract class AbstractC1748xd28d482c {

    /* renamed from: DEFAULT_ACCOUNT */
    public static final java.lang.String f5892xf85e6def = "<<default account>>";

    /* renamed from: SIGN_IN_MODE_OPTIONAL */
    public static final int f5893x3656f724 = 2;

    /* renamed from: SIGN_IN_MODE_REQUIRED */
    public static final int f5894x239dd763 = 1;
    private static final java.util.Set zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks */
    /* loaded from: classes13.dex */
    public interface ConnectionCallbacks extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 {

        /* renamed from: CAUSE_NETWORK_LOST */
        public static final int f5895xe2fd96eb = 2;

        /* renamed from: CAUSE_SERVICE_DISCONNECTED */
        public static final int f5896xbff01ddb = 1;
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener */
    /* loaded from: classes13.dex */
    public interface OnConnectionFailedListener extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae {
    }

    /* renamed from: dumpAll */
    public static void m17767x77ca130d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> set = zaa;
        synchronized (set) {
            java.lang.String str2 = str + "  ";
            int i17 = 0;
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c : set) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient#").println(i17);
                abstractC1748xd28d482c.mo17775x2f39f4(str2, fileDescriptor, printWriter, strArr);
                i17++;
            }
        }
    }

    /* renamed from: getAllClients */
    public static java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> m17768x7476751d() {
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: blockingConnect */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17769x9eb66ef5();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: blockingConnect */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17770x9eb66ef5(long j17, java.util.concurrent.TimeUnit timeUnit);

    /* renamed from: clearDefaultAccountAndReconnect */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo17771xd7f4e239();

    /* renamed from: connect */
    public abstract void mo17772x38b478ea();

    /* renamed from: connect */
    public void mo17773x38b478ea(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: disconnect */
    public abstract void mo17774x1f9d589c();

    /* renamed from: dump */
    public abstract void mo17775x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: enqueue */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<R, A>> T mo17776xa0f98e08(T t17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: execute */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A>> T mo17777xb158f775(T t17) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: getClient */
    public <C extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb> C mo17778x142a16c1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<C> c1733x6b09fe28) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: getConnectionResult */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb mo17779xd9207c11(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api);

    /* renamed from: getContext */
    public android.content.Context mo17780x76847179() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: getLooper */
    public android.os.Looper mo17781x23b2dd47() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: hasApi */
    public boolean mo17782xb7043120(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: hasConnectedApi */
    public abstract boolean mo17783xb736160b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api);

    /* renamed from: isConnected */
    public abstract boolean mo17784x23b734ff();

    /* renamed from: isConnecting */
    public abstract boolean mo17785x532f7b82();

    /* renamed from: isConnectionCallbacksRegistered */
    public abstract boolean mo17786xc5c3d528(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks);

    /* renamed from: isConnectionFailedListenerRegistered */
    public abstract boolean mo17787x1ae8313b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: maybeSignIn */
    public boolean mo17788x402f564a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934 interfaceC1790xea568934) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: maybeSignOut */
    public void mo17789xc5bb8ac9() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: reconnect */
    public abstract void mo17790x3b049b57();

    /* renamed from: registerConnectionCallbacks */
    public abstract void mo17791xa03bbbed(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks);

    /* renamed from: registerConnectionFailedListener */
    public abstract void mo17792x6b067852(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: registerListener */
    public <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> mo17793x42780477(L l17) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: stopAutoManage */
    public abstract void mo17794x58cd7196(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f);

    /* renamed from: unregisterConnectionCallbacks */
    public abstract void mo17795xfb9055b4(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks);

    /* renamed from: unregisterConnectionFailedListener */
    public abstract void mo17796x6d3de2eb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener);

    public void zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {
        private android.accounts.Account zaa;
        private final java.util.Set zab;
        private final java.util.Set zac;
        private int zad;
        private android.view.View zae;
        private java.lang.String zaf;
        private java.lang.String zag;
        private final java.util.Map zah;
        private final android.content.Context zai;
        private final java.util.Map zaj;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 zak;
        private int zal;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener zam;
        private android.os.Looper zan;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zao;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zap;
        private final java.util.ArrayList zaq;
        private final java.util.ArrayList zar;

        public Builder(android.content.Context context) {
            this.zab = new java.util.HashSet();
            this.zac = new java.util.HashSet();
            this.zah = new x.b();
            this.zaj = new x.b();
            this.zal = -1;
            this.zao = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b();
            this.zap = com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zad.zac;
            this.zaq = new java.util.ArrayList();
            this.zar = new java.util.ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf44, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
            java.util.HashSet hashSet = new java.util.HashSet(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1735x14918ddf) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api.zac(), "Base client builder must not be null")).mo17572x13eb97b1(interfaceC1734x98b0cf44));
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34 : c1762x4c04e34Arr) {
                hashSet.add(c1762x4c04e34);
            }
            this.zah.put(api, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab(hashSet));
        }

        /* renamed from: addApi */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17797xab35b9b9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions> api) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null");
            this.zaj.put(api, null);
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17572x13eb97b1 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1735x14918ddf) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api.zac(), "Base client builder must not be null")).mo17572x13eb97b1(null);
            this.zac.addAll(mo17572x13eb97b1);
            this.zab.addAll(mo17572x13eb97b1);
            return this;
        }

        /* renamed from: addApiIfAvailable */
        public <O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasOptions> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17799xb7badeb3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> api, O o17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(o17, "Null options are not permitted for this Api");
            this.zaj.put(api, o17);
            zab(api, o17, c1762x4c04e34Arr);
            return this;
        }

        /* renamed from: addConnectionCallbacks */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17801xcbaa852f(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        /* renamed from: addOnConnectionFailedListener */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17802xafc010f(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        /* renamed from: addScope */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17803xb5a61233(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1762x4c04e34, "Scope must not be null");
            this.zab.add(c1762x4c04e34);
            return this;
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c m17804x59bc66e() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zaa = zaa();
            java.util.Map zad = zaa.zad();
            x.b bVar = new x.b();
            x.b bVar2 = new x.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api = null;
            boolean z17 = false;
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api2 : this.zaj.keySet()) {
                java.lang.Object obj = this.zaj.get(api2);
                boolean z18 = zad.get(api2) != null;
                bVar.put(api2, java.lang.Boolean.valueOf(z18));
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zat zatVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zat(api2, z18);
                arrayList.add(zatVar);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(api2.zaa());
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb mo17329x6a949bd9 = abstractC1731x2722202e.mo17329x6a949bd9(this.zai, this.zan, zaa, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) obj, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) zatVar, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) zatVar);
                bVar2.put(api2.zab(), mo17329x6a949bd9);
                if (abstractC1731x2722202e.m17706x3662b71a() == 1) {
                    z17 = obj != null;
                }
                if (mo17329x6a949bd9.mo17564x6e8aa054()) {
                    if (api != null) {
                        throw new java.lang.IllegalStateException(api2.zad() + " cannot be used with " + api.zad());
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z17) {
                    throw new java.lang.IllegalStateException("With using " + api.zad() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18222xe071d469(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18222xe071d469(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa c1827x38edaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa(this.zai, new java.util.concurrent.locks.ReentrantLock(), this.zan, zaa, this.zao, this.zap, bVar, this.zaq, this.zar, bVar2, this.zal, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1827x38edaa.zad(bVar2.values(), true), arrayList);
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.zaa) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.zaa.add(c1827x38edaa);
            }
            if (this.zal >= 0) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak.zaa(this.zak).zad(this.zal, c1827x38edaa, this.zam);
            }
            return c1827x38edaa;
        }

        /* renamed from: enableAutoManage */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17805xcfea61d7(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 c1778x4647479 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479((android.app.Activity) activityC1102x9ee2d9f);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 >= 0, "clientId must be non-negative");
            this.zal = i17;
            this.zam = onConnectionFailedListener;
            this.zak = c1778x4647479;
            return this;
        }

        /* renamed from: setAccountName */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17807xa3d95496(java.lang.String str) {
            this.zaa = str == null ? null : new android.accounts.Account(str, "com.google");
            return this;
        }

        /* renamed from: setGravityForPopups */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17808x5f910544(int i17) {
            this.zad = i17;
            return this;
        }

        /* renamed from: setHandler */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17809xda89e088(android.os.Handler handler) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        /* renamed from: setViewForPopups */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17810x6789d509(android.view.View view) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(view, "View must not be null");
            this.zae = view;
            return this;
        }

        /* renamed from: useDefaultAccount */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17811x9b48ca13() {
            m17807xa3d95496("<<default account>>");
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zaa() {
            com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c c2420x5eee845c = com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c.zaa;
            java.util.Map map = this.zaj;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api = com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zad.zag;
            if (map.containsKey(api)) {
                c2420x5eee845c = (com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c) this.zaj.get(api);
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, c2420x5eee845c, false);
        }

        /* renamed from: enableAutoManage */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17806xcfea61d7(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
            m17805xcfea61d7(activityC1102x9ee2d9f, 0, onConnectionFailedListener);
            return this;
        }

        /* renamed from: addApiIfAvailable */
        public <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17800xb7badeb3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions> api, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, c1762x4c04e34Arr);
            return this;
        }

        /* renamed from: addApi */
        public <O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasOptions> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder m17798xab35b9b9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> api, O o17) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(o17, "Null options are not permitted for this Api");
            this.zaj.put(api, o17);
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17572x13eb97b1 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1735x14918ddf) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api.zac(), "Base client builder must not be null")).mo17572x13eb97b1(o17);
            this.zac.addAll(mo17572x13eb97b1);
            this.zab.addAll(mo17572x13eb97b1);
            return this;
        }

        public Builder(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
