package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.StatCfg */
/* loaded from: classes13.dex */
public final class C26756xf2240950 extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56705x7118e671 = false;
    private static final java.lang.String TAG = "StatCfg";

    /* renamed from: internal */
    public int f56706x21ffc6bd;

    /* renamed from: lineNum */
    public short f56707xa8b0ef2;

    /* renamed from: netType */
    public byte f56708x6dd19677;

    /* renamed from: type */
    public byte f56709x368f3a;

    public C26756xf2240950() {
        this.f56709x368f3a = (byte) 0;
        this.f56708x6dd19677 = (byte) 0;
        this.f56707xa8b0ef2 = (short) 0;
        this.f56706x21ffc6bd = 0;
    }

    /* renamed from: className */
    public java.lang.String m105338xff691c23() {
        return "jce.StatCfg";
    }

    /* renamed from: clone */
    public java.lang.Object m105339x5a5dd5d() {
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
        c2857xb4f8ac23.m21244x63a518c2(this.f56709x368f3a, "type");
        c2857xb4f8ac23.m21244x63a518c2(this.f56708x6dd19677, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37);
        c2857xb4f8ac23.m21255x63a518c2(this.f56707xa8b0ef2, "lineNum");
        c2857xb4f8ac23.m21248x63a518c2(this.f56706x21ffc6bd, "internal");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21265x93891d14(this.f56709x368f3a, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56708x6dd19677, true);
        c2857xb4f8ac23.m21276x93891d14(this.f56707xa8b0ef2, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56706x21ffc6bd, false);
    }

    /* renamed from: equals */
    public boolean m105340xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26756xf2240950 c26756xf2240950 = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26756xf2240950) obj;
        return com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56709x368f3a, c26756xf2240950.f56709x368f3a) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56708x6dd19677, c26756xf2240950.f56708x6dd19677) && com.qq.taf.jce.C2862xf934904e.m21401xb2c87fbf(this.f56707xa8b0ef2, c26756xf2240950.f56707xa8b0ef2) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56706x21ffc6bd, c26756xf2240950.f56706x21ffc6bd);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105341xe2b78a54() {
        return TAG;
    }

    /* renamed from: getInternal */
    public int m105342x9dda0433() {
        return this.f56706x21ffc6bd;
    }

    /* renamed from: getLineNum */
    public short m105343x48584abc() {
        return this.f56707xa8b0ef2;
    }

    /* renamed from: getNetType */
    public byte m105344xab9ed241() {
        return this.f56708x6dd19677;
    }

    /* renamed from: getType */
    public byte m105345xfb85f7b0() {
        return this.f56709x368f3a;
    }

    /* renamed from: hashCode */
    public int m105346x8cdac1b() {
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
        this.f56709x368f3a = c2859xe10ac61e.m21296x355996(this.f56709x368f3a, 0, true);
        this.f56708x6dd19677 = c2859xe10ac61e.m21296x355996(this.f56708x6dd19677, 1, true);
        this.f56707xa8b0ef2 = c2859xe10ac61e.m21304x355996(this.f56707xa8b0ef2, 2, false);
        this.f56706x21ffc6bd = c2859xe10ac61e.m21299x355996(this.f56706x21ffc6bd, 3, false);
    }

    /* renamed from: setInternal */
    public void m105347x9892653f(int i17) {
        this.f56706x21ffc6bd = i17;
    }

    /* renamed from: setLineNum */
    public void m105348xbbc99830(short s17) {
        this.f56707xa8b0ef2 = s17;
    }

    /* renamed from: setNetType */
    public void m105349x1f101fb5(byte b17) {
        this.f56708x6dd19677 = b17;
    }

    /* renamed from: setType */
    public void m105350x7650bebc(byte b17) {
        this.f56709x368f3a = b17;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21335x6c257df(this.f56709x368f3a, 0);
        c2860x6de9642d.m21335x6c257df(this.f56708x6dd19677, 1);
        c2860x6de9642d.m21352x6c257df(this.f56707xa8b0ef2, 2);
        c2860x6de9642d.m21338x6c257df(this.f56706x21ffc6bd, 3);
    }

    public C26756xf2240950(byte b17, byte b18, short s17, int i17) {
        this.f56709x368f3a = b17;
        this.f56708x6dd19677 = b18;
        this.f56707xa8b0ef2 = s17;
        this.f56706x21ffc6bd = i17;
    }
}
