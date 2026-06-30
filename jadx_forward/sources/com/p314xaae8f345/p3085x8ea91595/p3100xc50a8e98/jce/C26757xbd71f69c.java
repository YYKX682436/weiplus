package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.Terminal */
/* loaded from: classes13.dex */
public final class C26757xbd71f69c extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56710x7118e671 = false;
    private static final java.lang.String TAG = "Terminal";

    /* renamed from: androidId */
    public java.lang.String f56711x43745fea;

    /* renamed from: androidIdSdCard */
    public java.lang.String f56712x3a26a18b;

    /* renamed from: imei */
    public java.lang.String f56713x3160c8;

    /* renamed from: imsi */
    public java.lang.String f56714x31627a;

    /* renamed from: macAdress */
    public java.lang.String f56715x671fb8a5;

    public C26757xbd71f69c() {
        this.f56713x3160c8 = "";
        this.f56715x671fb8a5 = "";
        this.f56711x43745fea = "";
        this.f56712x3a26a18b = "";
        this.f56714x31627a = "";
    }

    /* renamed from: className */
    public java.lang.String m105351xff691c23() {
        return "jce.Terminal";
    }

    /* renamed from: clone */
    public java.lang.Object m105352x5a5dd5d() {
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
        c2857xb4f8ac23.m21252x63a518c2(this.f56713x3160c8, "imei");
        c2857xb4f8ac23.m21252x63a518c2(this.f56715x671fb8a5, "macAdress");
        c2857xb4f8ac23.m21252x63a518c2(this.f56711x43745fea, "androidId");
        c2857xb4f8ac23.m21252x63a518c2(this.f56712x3a26a18b, "androidIdSdCard");
        c2857xb4f8ac23.m21252x63a518c2(this.f56714x31627a, "imsi");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21273x93891d14(this.f56713x3160c8, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56715x671fb8a5, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56711x43745fea, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56712x3a26a18b, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56714x31627a, false);
    }

    /* renamed from: equals */
    public boolean m105353xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c c26757xbd71f69c = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c) obj;
        return com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56713x3160c8, c26757xbd71f69c.f56713x3160c8) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56715x671fb8a5, c26757xbd71f69c.f56715x671fb8a5) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56711x43745fea, c26757xbd71f69c.f56711x43745fea) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56712x3a26a18b, c26757xbd71f69c.f56712x3a26a18b) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56714x31627a, c26757xbd71f69c.f56714x31627a);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105354xe2b78a54() {
        return TAG;
    }

    /* renamed from: getAndroidId */
    public java.lang.String m105355x42e1d134() {
        return this.f56711x43745fea;
    }

    /* renamed from: getAndroidIdSdCard */
    public java.lang.String m105356x1e887355() {
        return this.f56712x3a26a18b;
    }

    /* renamed from: getImei */
    public java.lang.String m105357xfb80c93e() {
        return this.f56713x3160c8;
    }

    /* renamed from: getImsi */
    public java.lang.String m105358xfb80caf0() {
        return this.f56714x31627a;
    }

    /* renamed from: getMacAdress */
    public java.lang.String m105359x668d29ef() {
        return this.f56715x671fb8a5;
    }

    /* renamed from: hashCode */
    public int m105360x8cdac1b() {
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
        this.f56713x3160c8 = c2859xe10ac61e.m21321xe22f9d47(0, false);
        this.f56715x671fb8a5 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56711x43745fea = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56712x3a26a18b = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f56714x31627a = c2859xe10ac61e.m21321xe22f9d47(4, false);
    }

    /* renamed from: setAndroidId */
    public void m105361x9f3591a8(java.lang.String str) {
        this.f56711x43745fea = str;
    }

    /* renamed from: setAndroidIdSdCard */
    public void m105362x555f0cc9(java.lang.String str) {
        this.f56712x3a26a18b = str;
    }

    /* renamed from: setImei */
    public void m105363x764b904a(java.lang.String str) {
        this.f56713x3160c8 = str;
    }

    /* renamed from: setImsi */
    public void m105364x764b91fc(java.lang.String str) {
        this.f56714x31627a = str;
    }

    /* renamed from: setMacAdress */
    public void m105365xc2e0ea63(java.lang.String str) {
        this.f56715x671fb8a5 = str;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.lang.String str = this.f56713x3160c8;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 0);
        }
        java.lang.String str2 = this.f56715x671fb8a5;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 1);
        }
        java.lang.String str3 = this.f56711x43745fea;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 2);
        }
        java.lang.String str4 = this.f56712x3a26a18b;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 3);
        }
        java.lang.String str5 = this.f56714x31627a;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 4);
        }
    }

    public C26757xbd71f69c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f56713x3160c8 = str;
        this.f56715x671fb8a5 = str2;
        this.f56711x43745fea = str3;
        this.f56712x3a26a18b = str4;
        this.f56714x31627a = str5;
    }
}
