package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse */
/* loaded from: classes13.dex */
public final class C26749x7dcda1b1 extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56668x7118e671 = false;
    private static final java.lang.String TAG = "ReportLogResponse";
    public int ret;

    public C26749x7dcda1b1() {
        this.ret = 0;
    }

    /* renamed from: className */
    public java.lang.String m105259xff691c23() {
        return "jce.ReportLogResponse";
    }

    /* renamed from: clone */
    public java.lang.Object m105260x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: display */
    public void mo21232x63a518c2(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17).m21248x63a518c2(this.ret, "ret");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17).m21269x93891d14(this.ret, false);
    }

    /* renamed from: equals */
    public boolean m105261xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.ret, ((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26749x7dcda1b1) obj).ret);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105262xe2b78a54() {
        return TAG;
    }

    /* renamed from: getRet */
    public int m105263xb588696b() {
        return this.ret;
    }

    /* renamed from: hashCode */
    public int m105264x8cdac1b() {
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
        this.ret = c2859xe10ac61e.m21299x355996(this.ret, 0, true);
    }

    /* renamed from: setRet */
    public void m105265xca0290df(int i17) {
        this.ret = i17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.ret, 0);
    }

    public C26749x7dcda1b1(int i17) {
        this.ret = i17;
    }
}
