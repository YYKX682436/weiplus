package com.qq.taf;

/* renamed from: com.qq.taf.RequestPacket */
/* loaded from: classes13.dex */
public final class C2853x7d14f3d7 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f9731x7118e671 = false;

    /* renamed from: cache_context */
    static java.util.Map<java.lang.String, java.lang.String> f9732x3d88e9f2;

    /* renamed from: cache_sBuffer */
    static byte[] f9733x3f7ed2d6;

    /* renamed from: cPacketType */
    public byte f9734x1485c8a5;

    /* renamed from: context */
    public java.util.Map<java.lang.String, java.lang.String> f9735x38b735af;

    /* renamed from: iMessageType */
    public int f9736x573c23b8;

    /* renamed from: iRequestId */
    public int f9737xd2ee19a1;

    /* renamed from: iTimeout */
    public int f9738xb0434cb8;

    /* renamed from: iVersion */
    public short f9739x13891c2f;

    /* renamed from: sBuffer */
    public byte[] f9740x3aad1e93;

    /* renamed from: sFuncName */
    public java.lang.String f9741xf0d65102;

    /* renamed from: sServantName */
    public java.lang.String f9742xd1aa19c9;

    /* renamed from: status */
    public java.util.Map<java.lang.String, java.lang.String> f9743xcacdcff2;

    public C2853x7d14f3d7() {
        this.f9739x13891c2f = (short) 0;
        this.f9734x1485c8a5 = (byte) 0;
        this.f9736x573c23b8 = 0;
        this.f9737xd2ee19a1 = 0;
        this.f9742xd1aa19c9 = null;
        this.f9741xf0d65102 = null;
        this.f9738xb0434cb8 = 0;
    }

    /* renamed from: clone */
    public java.lang.Object m21231x5a5dd5d() {
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
        c2857xb4f8ac23.m21255x63a518c2(this.f9739x13891c2f, "iVersion");
        c2857xb4f8ac23.m21244x63a518c2(this.f9734x1485c8a5, "cPacketType");
        c2857xb4f8ac23.m21248x63a518c2(this.f9736x573c23b8, "iMessageType");
        c2857xb4f8ac23.m21248x63a518c2(this.f9737xd2ee19a1, "iRequestId");
        c2857xb4f8ac23.m21252x63a518c2(this.f9742xd1aa19c9, "sServantName");
        c2857xb4f8ac23.m21252x63a518c2(this.f9741xf0d65102, "sFuncName");
        c2857xb4f8ac23.m21257x63a518c2(this.f9740x3aad1e93, "sBuffer");
        c2857xb4f8ac23.m21248x63a518c2(this.f9738xb0434cb8, "iTimeout");
        c2857xb4f8ac23.m21254x63a518c2((java.util.Map) this.f9735x38b735af, "context");
        c2857xb4f8ac23.m21254x63a518c2((java.util.Map) this.f9743xcacdcff2, "status");
    }

    /* renamed from: equals */
    public boolean m21233xb2c87fbf(java.lang.Object obj) {
        com.qq.taf.C2853x7d14f3d7 c2853x7d14f3d7 = (com.qq.taf.C2853x7d14f3d7) obj;
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(1, (int) c2853x7d14f3d7.f9739x13891c2f) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(1, (int) c2853x7d14f3d7.f9734x1485c8a5) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(1, c2853x7d14f3d7.f9736x573c23b8) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(1, c2853x7d14f3d7.f9737xd2ee19a1) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf((java.lang.Object) 1, (java.lang.Object) c2853x7d14f3d7.f9742xd1aa19c9) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf((java.lang.Object) 1, (java.lang.Object) c2853x7d14f3d7.f9741xf0d65102) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf((java.lang.Object) 1, (java.lang.Object) c2853x7d14f3d7.f9740x3aad1e93) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(1, c2853x7d14f3d7.f9738xb0434cb8) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf((java.lang.Object) 1, (java.lang.Object) c2853x7d14f3d7.f9735x38b735af) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf((java.lang.Object) 1, (java.lang.Object) c2853x7d14f3d7.f9743xcacdcff2);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        try {
            this.f9739x13891c2f = c2859xe10ac61e.m21304x355996(this.f9739x13891c2f, 1, true);
            this.f9734x1485c8a5 = c2859xe10ac61e.m21296x355996(this.f9734x1485c8a5, 2, true);
            this.f9736x573c23b8 = c2859xe10ac61e.m21299x355996(this.f9736x573c23b8, 3, true);
            this.f9737xd2ee19a1 = c2859xe10ac61e.m21299x355996(this.f9737xd2ee19a1, 4, true);
            this.f9742xd1aa19c9 = c2859xe10ac61e.m21321xe22f9d47(5, true);
            this.f9741xf0d65102 = c2859xe10ac61e.m21321xe22f9d47(6, true);
            if (f9733x3f7ed2d6 == null) {
                f9733x3f7ed2d6 = new byte[1];
            }
            this.f9740x3aad1e93 = c2859xe10ac61e.m21306x355996(f9733x3f7ed2d6, 7, true);
            this.f9738xb0434cb8 = c2859xe10ac61e.m21299x355996(this.f9738xb0434cb8, 8, true);
            if (f9732x3d88e9f2 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                f9732x3d88e9f2 = hashMap;
                hashMap.put("", "");
            }
            this.f9735x38b735af = (java.util.Map) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f9732x3d88e9f2, 9, true);
            if (f9732x3d88e9f2 == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                f9732x3d88e9f2 = hashMap2;
                hashMap2.put("", "");
            }
            this.f9743xcacdcff2 = (java.util.Map) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f9732x3d88e9f2, 10, true);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21352x6c257df(this.f9739x13891c2f, 1);
        c2860x6de9642d.m21335x6c257df(this.f9734x1485c8a5, 2);
        c2860x6de9642d.m21338x6c257df(this.f9736x573c23b8, 3);
        c2860x6de9642d.m21338x6c257df(this.f9737xd2ee19a1, 4);
        c2860x6de9642d.m21349x6c257df(this.f9742xd1aa19c9, 5);
        c2860x6de9642d.m21349x6c257df(this.f9741xf0d65102, 6);
        c2860x6de9642d.m21354x6c257df(this.f9740x3aad1e93, 7);
        c2860x6de9642d.m21338x6c257df(this.f9738xb0434cb8, 8);
        c2860x6de9642d.m21351x6c257df((java.util.Map) this.f9735x38b735af, 9);
        c2860x6de9642d.m21351x6c257df((java.util.Map) this.f9743xcacdcff2, 10);
    }

    public C2853x7d14f3d7(short s17, byte b17, int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, int i19, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.f9739x13891c2f = s17;
        this.f9734x1485c8a5 = b17;
        this.f9736x573c23b8 = i17;
        this.f9737xd2ee19a1 = i18;
        this.f9742xd1aa19c9 = str;
        this.f9741xf0d65102 = str2;
        this.f9740x3aad1e93 = bArr;
        this.f9738xb0434cb8 = i19;
        this.f9735x38b735af = map;
        this.f9743xcacdcff2 = map2;
    }
}
