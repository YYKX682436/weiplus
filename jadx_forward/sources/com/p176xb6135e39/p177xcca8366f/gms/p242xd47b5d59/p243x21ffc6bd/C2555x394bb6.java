package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzcy */
/* loaded from: classes13.dex */
public final class C2555x394bb6 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0 {

    /* renamed from: zzdl */
    private final int f7644x394bc8;

    public C2555x394bb6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16, int i17, int i18) {
        super(c1888xafe09e16, i17);
        this.f7644x394bc8 = i18;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0 mo18042xb4843a97() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2554x394bb5(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0
    /* renamed from: getDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19733xe6783753() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2562x394bc2(this.f5916x1540ba43, this.f5917xf41deca3, this.f7644x394bc8);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0
    /* renamed from: getType */
    public final int mo19734xfb85f7b0() {
        return m18005xb282bd08("event_type");
    }

    /* renamed from: toString */
    public final java.lang.String m19915x9616526c() {
        java.lang.String str = mo19734xfb85f7b0() == 1 ? "changed" : mo19734xfb85f7b0() == 2 ? "deleted" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        java.lang.String valueOf = java.lang.String.valueOf(mo19733xe6783753());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 32 + valueOf.length());
        sb6.append("DataEventRef{ type=");
        sb6.append(str);
        sb6.append(", dataitem=");
        sb6.append(valueOf);
        sb6.append(" }");
        return sb6.toString();
    }
}
