package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* loaded from: classes13.dex */
public final class Net extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56656x7118e671 = false;
    private static final java.lang.String TAG = "Net";

    /* renamed from: extNetworkOperator */
    public java.lang.String f56657xee116091;

    /* renamed from: extNetworkType */
    public int f56658x5628c5a7;

    /* renamed from: isWap */
    public byte f56659x5fd3d5c;

    /* renamed from: netType */
    public byte f56660x6dd19677;

    public Net() {
        this.f56660x6dd19677 = (byte) 0;
        this.f56657xee116091 = "";
        this.f56658x5628c5a7 = 0;
        this.f56659x5fd3d5c = (byte) 0;
    }

    /* renamed from: className */
    public java.lang.String m105231xff691c23() {
        return "jce.Net";
    }

    /* renamed from: clone */
    public java.lang.Object m105232x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: display */
    public void mo21232x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21244x63a518c2(this.f56660x6dd19677, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37);
        c2857xb4f8ac23.m21252x63a518c2(this.f56657xee116091, "extNetworkOperator");
        c2857xb4f8ac23.m21248x63a518c2(this.f56658x5628c5a7, "extNetworkType");
        c2857xb4f8ac23.m21244x63a518c2(this.f56659x5fd3d5c, "isWap");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21265x93891d14(this.f56660x6dd19677, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56657xee116091, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56658x5628c5a7, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56659x5fd3d5c, false);
    }

    /* renamed from: equals */
    public boolean m105233xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net net = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net) obj;
        return com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56660x6dd19677, net.f56660x6dd19677) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56657xee116091, net.f56657xee116091) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56658x5628c5a7, net.f56658x5628c5a7) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56659x5fd3d5c, net.f56659x5fd3d5c);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105234xe2b78a54() {
        return TAG;
    }

    /* renamed from: getExtNetworkOperator */
    public java.lang.String m105235x16dc287() {
        return this.f56657xee116091;
    }

    /* renamed from: getExtNetworkType */
    public int m105236x44c0929d() {
        return this.f56658x5628c5a7;
    }

    /* renamed from: getIsWap */
    public byte m105237x749ae3a6() {
        return this.f56659x5fd3d5c;
    }

    /* renamed from: getNetType */
    public byte m105238xab9ed241() {
        return this.f56660x6dd19677;
    }

    /* renamed from: hashCode */
    public int m105239x8cdac1b() {
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
        this.f56660x6dd19677 = c2859xe10ac61e.m21296x355996(this.f56660x6dd19677, 0, true);
        this.f56657xee116091 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56658x5628c5a7 = c2859xe10ac61e.m21299x355996(this.f56658x5628c5a7, 2, false);
        this.f56659x5fd3d5c = c2859xe10ac61e.m21296x355996(this.f56659x5fd3d5c, 3, false);
    }

    /* renamed from: setExtNetworkOperator */
    public void m105240x98994493(java.lang.String str) {
        this.f56657xee116091 = str;
    }

    /* renamed from: setExtNetworkType */
    public void m105241xcb6faa9(int i17) {
        this.f56658x5628c5a7 = i17;
    }

    /* renamed from: setIsWap */
    public void m105242x5328fe1a(byte b17) {
        this.f56659x5fd3d5c = b17;
    }

    /* renamed from: setNetType */
    public void m105243x1f101fb5(byte b17) {
        this.f56660x6dd19677 = b17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21335x6c257df(this.f56660x6dd19677, 0);
        java.lang.String str = this.f56657xee116091;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 1);
        }
        c2860x6de9642d.m21338x6c257df(this.f56658x5628c5a7, 2);
        c2860x6de9642d.m21335x6c257df(this.f56659x5fd3d5c, 3);
    }

    public Net(byte b17, java.lang.String str, int i17, byte b18) {
        this.f56660x6dd19677 = b17;
        this.f56657xee116091 = str;
        this.f56658x5628c5a7 = i17;
        this.f56659x5fd3d5c = b18;
    }
}
