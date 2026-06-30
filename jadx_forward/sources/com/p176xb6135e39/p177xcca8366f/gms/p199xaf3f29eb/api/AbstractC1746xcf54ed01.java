package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.GoogleApi */
/* loaded from: classes13.dex */
public abstract class AbstractC1746xcf54ed01<O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff<O> {
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zaa;
    private final android.content.Context zab;
    private final java.lang.String zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api zad;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 zae;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 zaf;
    private final android.os.Looper zag;
    private final int zah;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c zai;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe zaj;

    /* renamed from: com.google.android.gms.common.api.GoogleApi$Settings */
    /* loaded from: classes13.dex */
    public static class Settings {

        /* renamed from: DEFAULT_SETTINGS */
        public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings f5891xe8545081 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings.Builder().m17763x59bc66e();
        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe zaa;
        public final android.os.Looper zab;

        /* renamed from: com.google.android.gms.common.api.GoogleApi$Settings$Builder */
        /* loaded from: classes13.dex */
        public static class Builder {
            private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe zaa;
            private android.os.Looper zab;

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: build */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings m17763x59bc66e() {
                if (this.zaa == null) {
                    this.zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1767x9f30616();
                }
                if (this.zab == null) {
                    this.zab = android.os.Looper.getMainLooper();
                }
                return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings(this.zaa, this.zab);
            }

            /* renamed from: setLooper */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings.Builder m17764x16e81153(android.os.Looper looper) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            /* renamed from: setMapper */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings.Builder m17765x17d81543(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe interfaceC1792x8e82d8fe) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1792x8e82d8fe, "StatusExceptionMapper must not be null.");
                this.zaa = interfaceC1792x8e82d8fe;
                return this;
            }
        }

        private Settings(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe interfaceC1792x8e82d8fe, android.accounts.Account account, android.os.Looper looper) {
            this.zaa = interfaceC1792x8e82d8fe;
            this.zab = looper;
        }
    }

    public AbstractC1746xcf54ed01(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> api, O o17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        this(activity, activity, api, o17, settings);
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zad(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zau(this, i17, apiMethodImpl);
        return apiMethodImpl;
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zae(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633 abstractC1794xa4358633) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        this.zaa.zav(this, i17, abstractC1794xa4358633, c2440x4f4de6dc, this.zaj);
        return c2440x4f4de6dc.m19602xfb859dfb();
    }

    /* renamed from: asGoogleApiClient */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c m17741xb77111ba() {
        return this.zai;
    }

    /* renamed from: createClientSettingsBuilder */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder m17742xb8612711() {
        android.accounts.Account m17704xf7a0c5f7;
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> emptySet;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17705x76a2ab1c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder builder = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf44 = this.zae;
        if (!(interfaceC1734x98b0cf44 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasGoogleSignInAccountOptions) || (m17705x76a2ab1c = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasGoogleSignInAccountOptions) interfaceC1734x98b0cf44).m17705x76a2ab1c()) == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf442 = this.zae;
            m17704xf7a0c5f7 = interfaceC1734x98b0cf442 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasAccountOptions ? ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasAccountOptions) interfaceC1734x98b0cf442).m17704xf7a0c5f7() : null;
        } else {
            m17704xf7a0c5f7 = m17705x76a2ab1c.m17484xf7a0c5f7();
        }
        builder.zab(m17704xf7a0c5f7);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf443 = this.zae;
        if (interfaceC1734x98b0cf443 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasGoogleSignInAccountOptions) {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17705x76a2ab1c2 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.HasGoogleSignInAccountOptions) interfaceC1734x98b0cf443).m17705x76a2ab1c();
            emptySet = m17705x76a2ab1c2 == null ? java.util.Collections.emptySet() : m17705x76a2ab1c2.m17493xb3e81777();
        } else {
            emptySet = java.util.Collections.emptySet();
        }
        builder.zaa(emptySet);
        builder.zac(this.zab.getClass().getName());
        builder.m18146x85ada1e6(this.zab.getPackageName());
        return builder;
    }

    /* renamed from: disconnectService */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> m17743x13e35e79() {
        return this.zaa.zan(this);
    }

    /* renamed from: doBestEffortWrite */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A>> T m17744x274c99c4(T t17) {
        zad(2, t17);
        return t17;
    }

    /* renamed from: doRead */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A>> T m17746xb0e79cc1(T t17) {
        zad(0, t17);
        return t17;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: doRegisterEventListener */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858<A, ?>, U extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1796xcf699631<A, ?>> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17748xa3689bc0(T t17, U u17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(t17);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(u17);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(t17.m17934x2985fbd5(), "Listener has already been released.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(u17.m17958x2985fbd5(), "Listener has already been released.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(t17.m17934x2985fbd5(), u17.m17958x2985fbd5()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, t17, u17, new java.lang.Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doUnregisterEventListener */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<?> listenerKey) {
        return m17751x3ea49d87(listenerKey, 0);
    }

    /* renamed from: doWrite */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A>> T m17752x6c587a14(T t17) {
        zad(1, t17);
        return t17;
    }

    /* renamed from: getApiFallbackAttributionTag */
    public java.lang.String m17754x92eb0621(android.content.Context context) {
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff
    /* renamed from: getApiKey */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05<O> mo17755x10f860db() {
        return this.zaf;
    }

    /* renamed from: getApiOptions */
    public O m17756x101fab1a() {
        return (O) this.zae;
    }

    /* renamed from: getApplicationContext */
    public android.content.Context m17757x6e669035() {
        return this.zab;
    }

    /* renamed from: getContextAttributionTag */
    public java.lang.String m17758x69302874() {
        return this.zac;
    }

    @java.lang.Deprecated
    /* renamed from: getContextFeatureId */
    public java.lang.String m17759xde02e538() {
        return this.zac;
    }

    /* renamed from: getLooper */
    public android.os.Looper m17760x23b2dd47() {
        return this.zag;
    }

    /* renamed from: registerListener */
    public <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> m17761x42780477(L l17, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(l17, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb zab(android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e m18145x59bc66e = m17742xb8612711().m18145x59bc66e();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb mo17329x6a949bd9 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zad.zaa())).mo17329x6a949bd9(this.zab, looper, m18145x59bc66e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) this.zae, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) c1839x38edb6, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) c1839x38edb6);
        java.lang.String m17758x69302874 = m17758x69302874();
        if (m17758x69302874 != null && (mo17329x6a949bd9 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687)) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687) mo17329x6a949bd9).m18122x4957a79d(m17758x69302874);
        }
        if (m17758x69302874 != null && (mo17329x6a949bd9 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ServiceConnectionC1783xc5aca5d9)) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ServiceConnectionC1783xc5aca5d9) mo17329x6a949bd9).zac(m17758x69302874);
        }
        return mo17329x6a949bd9;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8 zac(android.content.Context context, android.os.Handler handler) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8(context, handler, m17742xb8612711().m18145x59bc66e());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1746xcf54ed01(android.app.Activity r2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> r3, O r4, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.m17765x17d81543(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m17764x16e81153(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.m17763x59bc66e()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doBestEffortWrite */
    public <TResult, A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m17745x274c99c4(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633<A, TResult> abstractC1794xa4358633) {
        return zae(2, abstractC1794xa4358633);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doRead */
    public <TResult, A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m17747xb0e79cc1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633<A, TResult> abstractC1794xa4358633) {
        return zae(0, abstractC1794xa4358633);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doUnregisterEventListener */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> m17751x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<?> listenerKey, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(listenerKey, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerKey, i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doWrite */
    public <TResult, A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m17753x6c587a14(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633<A, TResult> abstractC1794xa4358633) {
        return zae(1, abstractC1794xa4358633);
    }

    private AbstractC1746xcf54ed01(android.content.Context context, android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf44, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        java.lang.String m17754x92eb0621;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Null context is not permitted.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context context2 = (android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            m17754x92eb0621 = context.getAttributionTag();
        } else {
            m17754x92eb0621 = m17754x92eb0621(context);
        }
        this.zac = m17754x92eb0621;
        this.zad = api;
        this.zae = interfaceC1734x98b0cf44;
        this.zag = settings.zab;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 m17863x401c920 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05.m17863x401c920(api, interfaceC1734x98b0cf44, m17754x92eb0621);
        this.zaf = m17863x401c920;
        this.zai = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1844x38edbb(this);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zak = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zak(context2);
        this.zaa = zak;
        this.zah = zak.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.DialogInterfaceOnCancelListenerC1747xcb82b330) && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b.zad(activity, zak, m17863x401c920);
        }
        zak.zaz(this);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: doRegisterEventListener */
    public <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17749xa3689bc0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099<A, ?> c1788x70613099) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1788x70613099);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1788x70613099.f5911xd6dc2ea3.m17934x2985fbd5(), "Listener has already been released.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1788x70613099.zaa.m17958x2985fbd5(), "Listener has already been released.");
        return this.zaa.zao(this, c1788x70613099.f5911xd6dc2ea3, c1788x70613099.zaa, c1788x70613099.zab);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1746xcf54ed01(android.content.Context r2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> r3, O r4, android.os.Looper r5, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.m17764x16e81153(r5)
            r0.m17765x17d81543(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.m17763x59bc66e()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    public AbstractC1746xcf54ed01(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> api, O o17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        this(context, (android.app.Activity) null, api, o17, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1746xcf54ed01(android.content.Context r2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> r3, O r4, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.m17765x17d81543(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.m17763x59bc66e()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
