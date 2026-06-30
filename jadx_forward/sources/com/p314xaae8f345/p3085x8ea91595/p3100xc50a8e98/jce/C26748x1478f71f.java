package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest */
/* loaded from: classes13.dex */
public final class C26748x1478f71f extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56661x7118e671 = false;
    private static final java.lang.String TAG = "ReportLogRequest";

    /* renamed from: cache_logData */
    static byte[] f56662x19287951;

    /* renamed from: hostAppPackageName */
    public java.lang.String f56663x8acd8ad8;

    /* renamed from: hostAppVersion */
    public int f56664xe89fa33f;

    /* renamed from: hostUserId */
    public java.lang.String f56665xc18c320e;

    /* renamed from: logData */
    public byte[] f56666x1456c50e;

    /* renamed from: logType */
    public int f56667x145e649e;

    public C26748x1478f71f() {
        this.f56667x145e649e = 0;
        this.f56666x1456c50e = null;
        this.f56665xc18c320e = "";
        this.f56663x8acd8ad8 = "";
        this.f56664xe89fa33f = 0;
    }

    /* renamed from: className */
    public java.lang.String m105244xff691c23() {
        return "jce.ReportLogRequest";
    }

    /* renamed from: clone */
    public java.lang.Object m105245x5a5dd5d() {
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
        c2857xb4f8ac23.m21248x63a518c2(this.f56667x145e649e, "logType");
        c2857xb4f8ac23.m21257x63a518c2(this.f56666x1456c50e, "logData");
        c2857xb4f8ac23.m21252x63a518c2(this.f56665xc18c320e, "hostUserId");
        c2857xb4f8ac23.m21252x63a518c2(this.f56663x8acd8ad8, "hostAppPackageName");
        c2857xb4f8ac23.m21248x63a518c2(this.f56664xe89fa33f, "hostAppVersion");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21269x93891d14(this.f56667x145e649e, true);
        c2857xb4f8ac23.m21278x93891d14(this.f56666x1456c50e, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56665xc18c320e, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56663x8acd8ad8, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56664xe89fa33f, false);
    }

    /* renamed from: equals */
    public boolean m105246xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26748x1478f71f c26748x1478f71f = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26748x1478f71f) obj;
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56667x145e649e, c26748x1478f71f.f56667x145e649e) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56666x1456c50e, c26748x1478f71f.f56666x1456c50e) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56665xc18c320e, c26748x1478f71f.f56665xc18c320e) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56663x8acd8ad8, c26748x1478f71f.f56663x8acd8ad8) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56664xe89fa33f, c26748x1478f71f.f56664xe89fa33f);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105247xe2b78a54() {
        return TAG;
    }

    /* renamed from: getHostAppPackageName */
    public java.lang.String m105248x9e29ecce() {
        return this.f56663x8acd8ad8;
    }

    /* renamed from: getHostAppVersion */
    public int m105249xd7377035() {
        return this.f56664xe89fa33f;
    }

    /* renamed from: getHostUserId */
    public java.lang.String m105250xafccea04() {
        return this.f56665xc18c320e;
    }

    /* renamed from: getLogData */
    public byte[] m105251x522400d8() {
        return this.f56666x1456c50e;
    }

    /* renamed from: getLogType */
    public int m105252x522ba068() {
        return this.f56667x145e649e;
    }

    /* renamed from: hashCode */
    public int m105253x8cdac1b() {
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
        this.f56667x145e649e = c2859xe10ac61e.m21299x355996(this.f56667x145e649e, 0, false);
        if (f56662x19287951 == null) {
            f56662x19287951 = r0;
            byte[] bArr = {0};
        }
        this.f56666x1456c50e = c2859xe10ac61e.m21306x355996(f56662x19287951, 1, false);
        this.f56665xc18c320e = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56663x8acd8ad8 = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f56664xe89fa33f = c2859xe10ac61e.m21299x355996(this.f56664xe89fa33f, 4, false);
    }

    /* renamed from: setHostAppPackageName */
    public void m105254x35556eda(java.lang.String str) {
        this.f56663x8acd8ad8 = str;
    }

    /* renamed from: setHostAppVersion */
    public void m105255x9f2dd841(int i17) {
        this.f56664xe89fa33f = i17;
    }

    /* renamed from: setHostUserId */
    public void m105256xddf13810(java.lang.String str) {
        this.f56665xc18c320e = str;
    }

    /* renamed from: setLogData */
    public void m105257xc5954e4c(byte[] bArr) {
        this.f56666x1456c50e = bArr;
    }

    /* renamed from: setLogType */
    public void m105258xc59ceddc(int i17) {
        this.f56667x145e649e = i17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56667x145e649e, 0);
        byte[] bArr = this.f56666x1456c50e;
        if (bArr != null) {
            c2860x6de9642d.m21354x6c257df(bArr, 1);
        }
        java.lang.String str = this.f56665xc18c320e;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 2);
        }
        java.lang.String str2 = this.f56663x8acd8ad8;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 3);
        }
        c2860x6de9642d.m21338x6c257df(this.f56664xe89fa33f, 4);
    }

    public C26748x1478f71f(int i17, byte[] bArr, java.lang.String str, java.lang.String str2, int i18) {
        this.f56667x145e649e = i17;
        this.f56666x1456c50e = bArr;
        this.f56665xc18c320e = str;
        this.f56663x8acd8ad8 = str2;
        this.f56664xe89fa33f = i18;
    }
}
