package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.RspHead */
/* loaded from: classes13.dex */
public final class C26754xbc48d4af extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56696x7118e671 = false;
    private static final java.lang.String TAG = "RspHead";

    /* renamed from: cmdId */
    public int f56697x5a623f5;

    /* renamed from: encryptWithPack */
    public byte f56698x65a71584;

    /* renamed from: phoneGuid */
    public java.lang.String f56699xc2a4e117;

    /* renamed from: requestId */
    public int f56700x295c940a;
    public int ret;

    public C26754xbc48d4af() {
        this.f56700x295c940a = 0;
        this.f56697x5a623f5 = 0;
        this.ret = 0;
        this.f56698x65a71584 = (byte) 0;
        this.f56699xc2a4e117 = "";
    }

    /* renamed from: className */
    public java.lang.String m105312xff691c23() {
        return "jce.RspHead";
    }

    /* renamed from: clone */
    public java.lang.Object m105313x5a5dd5d() {
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
        c2857xb4f8ac23.m21248x63a518c2(this.f56700x295c940a, "requestId");
        c2857xb4f8ac23.m21248x63a518c2(this.f56697x5a623f5, "cmdId");
        c2857xb4f8ac23.m21248x63a518c2(this.ret, "ret");
        c2857xb4f8ac23.m21244x63a518c2(this.f56698x65a71584, "encryptWithPack");
        c2857xb4f8ac23.m21252x63a518c2(this.f56699xc2a4e117, "phoneGuid");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21269x93891d14(this.f56700x295c940a, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56697x5a623f5, true);
        c2857xb4f8ac23.m21269x93891d14(this.ret, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56698x65a71584, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56699xc2a4e117, false);
    }

    /* renamed from: equals */
    public boolean m105314xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af c26754xbc48d4af = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af) obj;
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56700x295c940a, c26754xbc48d4af.f56700x295c940a) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56697x5a623f5, c26754xbc48d4af.f56697x5a623f5) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.ret, c26754xbc48d4af.ret) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56698x65a71584, c26754xbc48d4af.f56698x65a71584) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56699xc2a4e117, c26754xbc48d4af.f56699xc2a4e117);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105315xe2b78a54() {
        return TAG;
    }

    /* renamed from: getCmdId */
    public int m105316x7443ca3f() {
        return this.f56697x5a623f5;
    }

    /* renamed from: getEncryptWithPack */
    public byte m105317x4a08e74e() {
        return this.f56698x65a71584;
    }

    /* renamed from: getPhoneGuid */
    public java.lang.String m105318xc2125261() {
        return this.f56699xc2a4e117;
    }

    /* renamed from: getRequestId */
    public int m105319x28ca0554() {
        return this.f56700x295c940a;
    }

    /* renamed from: getRet */
    public int m105320xb588696b() {
        return this.ret;
    }

    /* renamed from: hashCode */
    public int m105321x8cdac1b() {
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
        this.f56700x295c940a = c2859xe10ac61e.m21299x355996(this.f56700x295c940a, 0, true);
        this.f56697x5a623f5 = c2859xe10ac61e.m21299x355996(this.f56697x5a623f5, 1, true);
        this.ret = c2859xe10ac61e.m21299x355996(this.ret, 2, true);
        this.f56698x65a71584 = c2859xe10ac61e.m21296x355996(this.f56698x65a71584, 3, false);
        this.f56699xc2a4e117 = c2859xe10ac61e.m21321xe22f9d47(4, false);
    }

    /* renamed from: setCmdId */
    public void m105322x52d1e4b3(int i17) {
        this.f56697x5a623f5 = i17;
    }

    /* renamed from: setEncryptWithPack */
    public void m105323x80df80c2(byte b17) {
        this.f56698x65a71584 = b17;
    }

    /* renamed from: setPhoneGuid */
    public void m105324x1e6612d5(java.lang.String str) {
        this.f56699xc2a4e117 = str;
    }

    /* renamed from: setRequestId */
    public void m105325x851dc5c8(int i17) {
        this.f56700x295c940a = i17;
    }

    /* renamed from: setRet */
    public void m105326xca0290df(int i17) {
        this.ret = i17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56700x295c940a, 0);
        c2860x6de9642d.m21338x6c257df(this.f56697x5a623f5, 1);
        c2860x6de9642d.m21338x6c257df(this.ret, 2);
        c2860x6de9642d.m21335x6c257df(this.f56698x65a71584, 3);
        java.lang.String str = this.f56699xc2a4e117;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 4);
        }
    }

    public C26754xbc48d4af(int i17, int i18, int i19, byte b17, java.lang.String str) {
        this.f56700x295c940a = i17;
        this.f56697x5a623f5 = i18;
        this.ret = i19;
        this.f56698x65a71584 = b17;
        this.f56699xc2a4e117 = str;
    }
}
