package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzcx */
/* loaded from: classes13.dex */
public final class C2554x394bb5 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0 {

    /* renamed from: type */
    private int f7642x368f3a;

    /* renamed from: zzdg */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd f7643x394bc3;

    public C2554x394bb5(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0 interfaceC2460x605becf0) {
        this.f7642x368f3a = interfaceC2460x605becf0.mo19734xfb85f7b0();
        this.f7643x394bc3 = interfaceC2460x605becf0.mo19733xe6783753().mo18042xb4843a97();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0 mo18042xb4843a97() {
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0
    /* renamed from: getDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19733xe6783753() {
        return this.f7643x394bc3;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2460x605becf0
    /* renamed from: getType */
    public final int mo19734xfb85f7b0() {
        return this.f7642x368f3a;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: isDataValid */
    public final boolean mo18043x300d2c68() {
        return true;
    }

    /* renamed from: toString */
    public final java.lang.String m19914x9616526c() {
        java.lang.String str = mo19734xfb85f7b0() == 1 ? "changed" : mo19734xfb85f7b0() == 2 ? "deleted" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        java.lang.String valueOf = java.lang.String.valueOf(mo19733xe6783753());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 35 + valueOf.length());
        sb6.append("DataEventEntity{ type=");
        sb6.append(str);
        sb6.append(", dataitem=");
        sb6.append(valueOf);
        sb6.append(" }");
        return sb6.toString();
    }
}
