package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest */
/* loaded from: classes13.dex */
public final class C26745x5ba7fed6 extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56636x7118e671 = false;
    private static final java.lang.String TAG = "GetSettingsRequest";

    /* renamed from: reserve */
    public java.lang.String f56637x41640cbc;

    public C26745x5ba7fed6() {
        this.f56637x41640cbc = "";
    }

    /* renamed from: className */
    public java.lang.String m105210xff691c23() {
        return "jce.GetSettingsRequest";
    }

    /* renamed from: clone */
    public java.lang.Object m105211x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: display */
    public void mo21232x63a518c2(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17).m21252x63a518c2(this.f56637x41640cbc, "reserve");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17).m21273x93891d14(this.f56637x41640cbc, false);
    }

    /* renamed from: equals */
    public boolean m105212xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56637x41640cbc, ((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26745x5ba7fed6) obj).f56637x41640cbc);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105213xe2b78a54() {
        return TAG;
    }

    /* renamed from: getReserve */
    public java.lang.String m105214x7f314886() {
        return this.f56637x41640cbc;
    }

    /* renamed from: hashCode */
    public int m105215x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56637x41640cbc = c2859xe10ac61e.m21321xe22f9d47(0, false);
    }

    /* renamed from: setReserve */
    public void m105216xf2a295fa(java.lang.String str) {
        this.f56637x41640cbc = str;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.lang.String str = this.f56637x41640cbc;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 0);
        }
    }

    public C26745x5ba7fed6(java.lang.String str) {
        this.f56637x41640cbc = str;
    }
}
