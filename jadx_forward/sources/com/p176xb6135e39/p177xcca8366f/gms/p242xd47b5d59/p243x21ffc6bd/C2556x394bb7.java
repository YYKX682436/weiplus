package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzcz */
/* loaded from: classes13.dex */
public final class C2556x394bb7 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 {

    /* renamed from: zzdm */
    private final java.lang.String f7645x394bc9;

    /* renamed from: zzdn */
    private final java.lang.String f7646x394bca;

    public C2556x394bb7(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3) {
        this.f7645x394bc9 = interfaceC2463x42bdd2f3.mo19740x5db1b11();
        this.f7646x394bca = interfaceC2463x42bdd2f3.mo19739xffaf4a0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 mo18042xb4843a97() {
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3
    /* renamed from: getDataItemKey */
    public final java.lang.String mo19739xffaf4a0c() {
        return this.f7646x394bca;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3
    /* renamed from: getId */
    public final java.lang.String mo19740x5db1b11() {
        return this.f7645x394bc9;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: isDataValid */
    public final boolean mo18043x300d2c68() {
        return true;
    }

    /* renamed from: toString */
    public final java.lang.String m19916x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemAssetEntity[@");
        sb6.append(java.lang.Integer.toHexString(hashCode()));
        if (this.f7645x394bc9 == null) {
            str = ",noid";
        } else {
            sb6.append(",");
            str = this.f7645x394bc9;
        }
        sb6.append(str);
        sb6.append(", key=");
        sb6.append(this.f7646x394bca);
        sb6.append("]");
        return sb6.toString();
    }
}
