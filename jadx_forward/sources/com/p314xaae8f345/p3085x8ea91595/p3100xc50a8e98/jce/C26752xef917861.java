package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.Response */
/* loaded from: classes13.dex */
public final class C26752xef917861 extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56684x7118e671 = false;
    private static final java.lang.String TAG = "Response";

    /* renamed from: cache_body */
    static byte[] f56685x1b3a43f;

    /* renamed from: cache_head */
    static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af f56686x1b6387d;

    /* renamed from: body */
    public byte[] f56687x2e39a2;

    /* renamed from: head */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af f56688x30cde0;

    public C26752xef917861() {
        this.f56688x30cde0 = null;
        this.f56687x2e39a2 = null;
    }

    /* renamed from: className */
    public java.lang.String m105298xff691c23() {
        return "jce.Response";
    }

    /* renamed from: clone */
    public java.lang.Object m105299x5a5dd5d() {
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
        c2857xb4f8ac23.m21250x63a518c2((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56688x30cde0, "head");
        c2857xb4f8ac23.m21257x63a518c2(this.f56687x2e39a2, "body");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21271x93891d14((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56688x30cde0, true);
        c2857xb4f8ac23.m21278x93891d14(this.f56687x2e39a2, false);
    }

    /* renamed from: equals */
    public boolean m105300xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26752xef917861 c26752xef917861 = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26752xef917861) obj;
        return com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56688x30cde0, c26752xef917861.f56688x30cde0) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56687x2e39a2, c26752xef917861.f56687x2e39a2);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105301xe2b78a54() {
        return TAG;
    }

    /* renamed from: getBody */
    public byte[] m105302xfb7da218() {
        return this.f56687x2e39a2;
    }

    /* renamed from: getHead */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af m105303xfb803656() {
        return this.f56688x30cde0;
    }

    /* renamed from: hashCode */
    public int m105304x8cdac1b() {
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
        if (f56686x1b6387d == null) {
            f56686x1b6387d = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af();
        }
        this.f56688x30cde0 = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56686x1b6387d, 0, true);
        if (f56685x1b3a43f == null) {
            f56685x1b3a43f = r0;
            byte[] bArr = {0};
        }
        this.f56687x2e39a2 = c2859xe10ac61e.m21306x355996(f56685x1b3a43f, 1, true);
    }

    /* renamed from: setBody */
    public void m105305x76486924(byte[] bArr) {
        this.f56687x2e39a2 = bArr;
    }

    /* renamed from: setHead */
    public void m105306x764afd62(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af c26754xbc48d4af) {
        this.f56688x30cde0 = c26754xbc48d4af;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56688x30cde0, 0);
        c2860x6de9642d.m21354x6c257df(this.f56687x2e39a2, 1);
    }

    public C26752xef917861(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af c26754xbc48d4af, byte[] bArr) {
        this.f56688x30cde0 = c26754xbc48d4af;
        this.f56687x2e39a2 = bArr;
    }
}
