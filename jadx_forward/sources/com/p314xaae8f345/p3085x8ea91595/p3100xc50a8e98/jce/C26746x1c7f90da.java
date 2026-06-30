package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse */
/* loaded from: classes13.dex */
public final class C26746x1c7f90da extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56638x7118e671 = false;
    private static final java.lang.String TAG = "GetSettingsResponse";

    /* renamed from: cache_settings */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> f56639xeae79040;
    public int ret;

    /* renamed from: settings */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> f56640x5582bc23;

    public C26746x1c7f90da() {
        this.ret = 0;
        this.f56640x5582bc23 = null;
    }

    /* renamed from: className */
    public java.lang.String m105217xff691c23() {
        return "jce.GetSettingsResponse";
    }

    /* renamed from: clone */
    public java.lang.Object m105218x5a5dd5d() {
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
        c2857xb4f8ac23.m21248x63a518c2(this.ret, "ret");
        c2857xb4f8ac23.m21253x63a518c2((java.util.Collection) this.f56640x5582bc23, "settings");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21269x93891d14(this.ret, true);
        c2857xb4f8ac23.m21274x93891d14((java.util.Collection) this.f56640x5582bc23, false);
    }

    /* renamed from: equals */
    public boolean m105219xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da c26746x1c7f90da = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da) obj;
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.ret, c26746x1c7f90da.ret) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56640x5582bc23, c26746x1c7f90da.f56640x5582bc23);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105220xe2b78a54() {
        return TAG;
    }

    /* renamed from: getRet */
    public int m105221xb588696b() {
        return this.ret;
    }

    /* renamed from: getSettings */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> m105222xd15cf999() {
        return this.f56640x5582bc23;
    }

    /* renamed from: hashCode */
    public int m105223x8cdac1b() {
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
        if (f56639xeae79040 == null) {
            f56639xeae79040 = new java.util.ArrayList<>();
            f56639xeae79040.add(new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21());
        }
        this.f56640x5582bc23 = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56639xeae79040, 1, false);
    }

    /* renamed from: setRet */
    public void m105224xca0290df(int i17) {
        this.ret = i17;
    }

    /* renamed from: setSettings */
    public void m105225xcc155aa5(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> arrayList) {
        this.f56640x5582bc23 = arrayList;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.ret, 0);
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> arrayList = this.f56640x5582bc23;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 1);
        }
    }

    public C26746x1c7f90da(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> arrayList) {
        this.ret = i17;
        this.f56640x5582bc23 = arrayList;
    }
}
