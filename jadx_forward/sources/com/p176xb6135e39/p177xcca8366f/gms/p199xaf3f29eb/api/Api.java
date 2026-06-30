package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* loaded from: classes13.dex */
public final class Api<O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74 zab;
    private final java.lang.String zac;

    /* renamed from: com.google.android.gms.common.api.Api$AbstractClientBuilder */
    /* loaded from: classes13.dex */
    public static abstract class AbstractC1731x2722202e<T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb, O> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1735x14918ddf<T, O> {
        @java.lang.Deprecated
        /* renamed from: buildClient */
        public T mo17329x6a949bd9(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, O o17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
            return mo17702x6a949bd9(context, looper, c1904x2257e52e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) o17, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70) connectionCallbacks, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae) onConnectionFailedListener);
        }

        /* renamed from: buildClient */
        public T mo17702x6a949bd9(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, O o17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 interfaceC1772x6c072b70, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae interfaceC1784xee64ffae) {
            throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$AnyClient */
    /* loaded from: classes13.dex */
    public interface InterfaceC1732xc16b58b7 {
    }

    /* renamed from: com.google.android.gms.common.api.Api$AnyClientKey */
    /* loaded from: classes13.dex */
    public static class C1733x6b09fe28<C extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$ApiOptions */
    /* loaded from: classes13.dex */
    public interface InterfaceC1734x98b0cf44 {

        /* renamed from: NO_OPTIONS */
        public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions f5867x9c607200 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions(null);

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions */
        /* loaded from: classes13.dex */
        public interface HasAccountOptions extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasOptions, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions {
            /* renamed from: getAccount */
            android.accounts.Account m17704xf7a0c5f7();
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions */
        /* loaded from: classes13.dex */
        public interface HasGoogleSignInAccountOptions extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasOptions {
            /* renamed from: getGoogleSignInAccount */
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17705x76a2ab1c();
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasOptions */
        /* loaded from: classes13.dex */
        public interface HasOptions extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 {
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$NoOptions */
        /* loaded from: classes13.dex */
        public static final class NoOptions implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions {
            private NoOptions() {
            }

            public /* synthetic */ NoOptions(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zaa zaaVar) {
            }
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$NotRequiredOptions */
        /* loaded from: classes13.dex */
        public interface NotRequiredOptions extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 {
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$Optional */
        /* loaded from: classes13.dex */
        public interface Optional extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasOptions, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NotRequiredOptions {
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$BaseClientBuilder */
    /* loaded from: classes13.dex */
    public static abstract class AbstractC1735x14918ddf<T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, O> {

        /* renamed from: API_PRIORITY_GAMES */
        public static final int f5868x8fc1b92b = 1;

        /* renamed from: API_PRIORITY_OTHER */
        public static final int f5869x903b057a = Integer.MAX_VALUE;

        /* renamed from: API_PRIORITY_PLUS */
        public static final int f5870x573c0dd0 = 2;

        /* renamed from: getImpliedScopes */
        public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17572x13eb97b1(O o17) {
            return java.util.Collections.emptyList();
        }

        /* renamed from: getPriority */
        public int m17706x3662b71a() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$Client */
    /* loaded from: classes13.dex */
    public interface InterfaceC1736x7877dfeb extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7 {
        /* renamed from: connect */
        void mo17707x38b478ea(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        /* renamed from: disconnect */
        void mo17708x1f9d589c();

        /* renamed from: disconnect */
        void mo17709x1f9d589c(java.lang.String str);

        /* renamed from: dump */
        void mo17710x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

        /* renamed from: getAvailableFeatures */
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17711x968e8170();

        /* renamed from: getEndpointPackageName */
        java.lang.String mo17712x51be17e6();

        /* renamed from: getLastDisconnectMessage */
        java.lang.String mo17713x5778d61f();

        /* renamed from: getMinApkVersion */
        int mo17560x352ce358();

        /* renamed from: getRemoteService */
        void mo17714x525c67d9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b, java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> set);

        /* renamed from: getRequiredFeatures */
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17715xf716cc72();

        /* renamed from: getScopesForConnectionlessNonSignIn */
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17716xa9228da4();

        /* renamed from: getServiceBrokerBinder */
        android.os.IBinder mo17717xaaad0302();

        /* renamed from: getSignInIntent */
        android.content.Intent mo17562xc37ac774();

        /* renamed from: isConnected */
        boolean mo17718x23b734ff();

        /* renamed from: isConnecting */
        boolean mo17719x532f7b82();

        /* renamed from: onUserSignOut */
        void mo17720x87088ea7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.SignOutCallbacks signOutCallbacks);

        /* renamed from: providesSignIn */
        boolean mo17564x6e8aa054();

        /* renamed from: requiresAccount */
        boolean mo17721xcf1169f();

        /* renamed from: requiresGooglePlayServices */
        boolean mo17722xb7ac48d9();

        /* renamed from: requiresSignIn */
        boolean mo17723xabdb8910();
    }

    /* renamed from: com.google.android.gms.common.api.Api$ClientKey */
    /* loaded from: classes13.dex */
    public static final class C1737x5f3ba74<C extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<C> {
    }

    public <C extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb> Api(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e<C, O> abstractC1731x2722202e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74<C> c1737x5f3ba74) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1731x2722202e, "Cannot construct an Api with a null ClientBuilder");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1737x5f3ba74, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractC1731x2722202e;
        this.zab = c1737x5f3ba74;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zaa() {
        return this.zaa;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28 zab() {
        return this.zab;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1735x14918ddf zac() {
        return this.zaa;
    }

    public final java.lang.String zad() {
        return this.zac;
    }
}
