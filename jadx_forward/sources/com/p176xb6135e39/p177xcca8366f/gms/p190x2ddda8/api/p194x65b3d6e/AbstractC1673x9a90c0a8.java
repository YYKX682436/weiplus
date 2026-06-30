package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p194x65b3d6e;

/* renamed from: com.google.android.gms.auth.api.phone.SmsRetrieverClient */
/* loaded from: classes13.dex */
public abstract class AbstractC1673x9a90c0a8 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions> implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p194x65b3d6e.InterfaceC1672xa8a1225d {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions> API;

    /* renamed from: CLIENT_BUILDER */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16.zzi, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions> f5620x19320f07;

    /* renamed from: CLIENT_KEY */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16.zzi> f5621x5eb35bcb;

    static {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16.zzi> c1737x5f3ba74 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74<>();
        f5621x5eb35bcb = c1737x5f3ba74;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p194x65b3d6e.zza zzaVar = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p194x65b3d6e.zza();
        f5620x19320f07 = zzaVar;
        API = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<>("SmsRetriever.API", zzaVar, c1737x5f3ba74);
    }

    public AbstractC1673x9a90c0a8(android.app.Activity activity) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44>) API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe) new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1767x9f30616());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p194x65b3d6e.InterfaceC1672xa8a1225d
    /* renamed from: startSmsRetriever */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo17451x238b3df();

    public AbstractC1673x9a90c0a8(android.content.Context context) {
        super(context, API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1767x9f30616());
    }
}
