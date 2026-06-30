package com.google.android.gms.common.api;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public abstract class GoogleApiClient {
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final java.util.Set zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set = zaa;
        synchronized (set) {
            java.lang.String str2 = str + "  ";
            int i17 = 0;
            for (com.google.android.gms.common.api.GoogleApiClient googleApiClient : set) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient#").println(i17);
                googleApiClient.dump(str2, fileDescriptor, printWriter, strArr);
                i17++;
            }
        }
    }

    public static java.util.Set<com.google.android.gms.common.api.GoogleApiClient> getAllClients() {
        java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect(long j17, java.util.concurrent.TimeUnit timeUnit);

    public abstract com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> anyClientKey) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api);

    public android.content.Context getContext() {
        throw new java.lang.UnsupportedOperationException();
    }

    public android.os.Looper getLooper() {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean hasApi(com.google.android.gms.common.api.Api<?> api) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public void zao(com.google.android.gms.common.api.internal.zada zadaVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void zap(com.google.android.gms.common.api.internal.zada zadaVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
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
        private com.google.android.gms.common.api.internal.LifecycleActivity zak;
        private int zal;
        private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zam;
        private android.os.Looper zan;
        private com.google.android.gms.common.GoogleApiAvailability zao;
        private com.google.android.gms.common.api.Api.AbstractClientBuilder zap;
        private final java.util.ArrayList zaq;
        private final java.util.ArrayList zar;

        public Builder(android.content.Context context) {
            this.zab = new java.util.HashSet();
            this.zac = new java.util.HashSet();
            this.zah = new x.b();
            this.zaj = new x.b();
            this.zal = -1;
            this.zao = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new java.util.ArrayList();
            this.zar = new java.util.ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final void zab(com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.Api.ApiOptions apiOptions, com.google.android.gms.common.api.Scope... scopeArr) {
            java.util.HashSet hashSet = new java.util.HashSet(((com.google.android.gms.common.api.Api.BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(apiOptions));
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> api) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = ((com.google.android.gms.common.api.Api.BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<O> api, O o17, com.google.android.gms.common.api.Scope... scopeArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(o17, "Null options are not permitted for this Api");
            this.zaj.put(api, o17);
            zab(api, o17, scopeArr);
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addScope(com.google.android.gms.common.api.Scope scope) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public com.google.android.gms.common.api.GoogleApiClient build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.common.internal.ClientSettings zaa = zaa();
            java.util.Map zad = zaa.zad();
            x.b bVar = new x.b();
            x.b bVar2 = new x.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.google.android.gms.common.api.Api api = null;
            boolean z17 = false;
            for (com.google.android.gms.common.api.Api api2 : this.zaj.keySet()) {
                java.lang.Object obj = this.zaj.get(api2);
                boolean z18 = zad.get(api2) != null;
                bVar.put(api2, java.lang.Boolean.valueOf(z18));
                com.google.android.gms.common.api.internal.zat zatVar = new com.google.android.gms.common.api.internal.zat(api2, z18);
                arrayList.add(zatVar);
                com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = (com.google.android.gms.common.api.Api.AbstractClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(api2.zaa());
                com.google.android.gms.common.api.Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (com.google.android.gms.common.internal.ClientSettings) obj, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zatVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zatVar);
                bVar2.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z17 = obj != null;
                }
                if (buildClient.providesSignIn()) {
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
                com.google.android.gms.common.internal.Preconditions.checkState(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                com.google.android.gms.common.internal.Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            com.google.android.gms.common.api.internal.zabe zabeVar = new com.google.android.gms.common.api.internal.zabe(this.zai, new java.util.concurrent.locks.ReentrantLock(), this.zan, zaa, this.zao, this.zap, bVar, this.zaq, this.zar, bVar2, this.zal, com.google.android.gms.common.api.internal.zabe.zad(bVar2.values(), true), arrayList);
            synchronized (com.google.android.gms.common.api.GoogleApiClient.zaa) {
                com.google.android.gms.common.api.GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                com.google.android.gms.common.api.internal.zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity, int i17, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity = new com.google.android.gms.common.api.internal.LifecycleActivity((android.app.Activity) fragmentActivity);
            com.google.android.gms.common.internal.Preconditions.checkArgument(i17 >= 0, "clientId must be non-negative");
            this.zal = i17;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setAccountName(java.lang.String str) {
            this.zaa = str == null ? null : new android.accounts.Account(str, "com.google");
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setGravityForPopups(int i17) {
            this.zad = i17;
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setHandler(android.os.Handler handler) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setViewForPopups(android.view.View view) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings zaa() {
            com.google.android.gms.signin.SignInOptions signInOptions = com.google.android.gms.signin.SignInOptions.zaa;
            java.util.Map map = this.zaj;
            com.google.android.gms.common.api.Api api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (com.google.android.gms.signin.SignInOptions) this.zaj.get(api);
            }
            return new com.google.android.gms.common.internal.ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        public <T extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> api, com.google.android.gms.common.api.Scope... scopeArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<O> api, O o17) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(o17, "Null options are not permitted for this Api");
            this.zaj.put(api, o17);
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = ((com.google.android.gms.common.api.Api.BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o17);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        public Builder(android.content.Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
