package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.SettingsCfg */
/* loaded from: classes13.dex */
public final class C26755x5c2e5d21 extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56701x7118e671 = false;
    private static final java.lang.String TAG = "SettingsCfg";

    /* renamed from: cache_cfg */
    static byte[] f56702xdf05ce27;
    public byte[] cfg;

    /* renamed from: revision */
    public long f56703xf074b7db;

    /* renamed from: type */
    public byte f56704x368f3a;

    public C26755x5c2e5d21() {
        this.f56704x368f3a = (byte) 0;
        this.cfg = null;
        this.f56703xf074b7db = 0L;
    }

    /* renamed from: className */
    public java.lang.String m105327xff691c23() {
        return "jce.SettingsCfg";
    }

    /* renamed from: clone */
    public java.lang.Object m105328x5a5dd5d() {
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
        c2857xb4f8ac23.m21244x63a518c2(this.f56704x368f3a, "type");
        c2857xb4f8ac23.m21257x63a518c2(this.cfg, "cfg");
        c2857xb4f8ac23.m21249x63a518c2(this.f56703xf074b7db, "revision");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21265x93891d14(this.f56704x368f3a, true);
        c2857xb4f8ac23.m21278x93891d14(this.cfg, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56703xf074b7db, false);
    }

    /* renamed from: equals */
    public boolean m105329xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21 c26755x5c2e5d21 = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21) obj;
        return com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56704x368f3a, c26755x5c2e5d21.f56704x368f3a) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.cfg, c26755x5c2e5d21.cfg) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56703xf074b7db, c26755x5c2e5d21.f56703xf074b7db);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105330xe2b78a54() {
        return TAG;
    }

    /* renamed from: getCfg */
    public byte[] m105331xb588312e() {
        return this.cfg;
    }

    /* renamed from: getRevision */
    public long m105332x6c4ef551() {
        return this.f56703xf074b7db;
    }

    /* renamed from: getType */
    public byte m105333xfb85f7b0() {
        return this.f56704x368f3a;
    }

    /* renamed from: hashCode */
    public int m105334x8cdac1b() {
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
        this.f56704x368f3a = c2859xe10ac61e.m21296x355996(this.f56704x368f3a, 0, true);
        if (f56702xdf05ce27 == null) {
            f56702xdf05ce27 = r0;
            byte[] bArr = {0};
        }
        this.cfg = c2859xe10ac61e.m21306x355996(f56702xdf05ce27, 1, true);
        this.f56703xf074b7db = c2859xe10ac61e.m21300x355996(this.f56703xf074b7db, 2, false);
    }

    /* renamed from: setCfg */
    public void m105335xca0258a2(byte[] bArr) {
        this.cfg = bArr;
    }

    /* renamed from: setRevision */
    public void m105336x6707565d(long j17) {
        this.f56703xf074b7db = j17;
    }

    /* renamed from: setType */
    public void m105337x7650bebc(byte b17) {
        this.f56704x368f3a = b17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21335x6c257df(this.f56704x368f3a, 0);
        c2860x6de9642d.m21354x6c257df(this.cfg, 1);
        c2860x6de9642d.m21339x6c257df(this.f56703xf074b7db, 2);
    }

    public C26755x5c2e5d21(byte b17, byte[] bArr, long j17) {
        this.f56704x368f3a = b17;
        this.cfg = bArr;
        this.f56703xf074b7db = j17;
    }
}
