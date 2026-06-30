package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.ReqHead */
/* loaded from: classes13.dex */
public final class C26750xa473137e extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56669x7118e671 = false;
    private static final java.lang.String TAG = "ReqHead";

    /* renamed from: cache_net */
    static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net f56670xdf05f760;

    /* renamed from: cache_terminal */
    static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c f56671x4efc6699;

    /* renamed from: assistantAPILevel */
    public int f56672x820f0e88;

    /* renamed from: assistantVersionCode */
    public int f56673xb14d7127;

    /* renamed from: cmdId */
    public int f56674x5a623f5;

    /* renamed from: encryptWithPack */
    public byte f56675x65a71584;
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net net;

    /* renamed from: phoneGuid */
    public java.lang.String f56676xc2a4e117;
    public java.lang.String qua;

    /* renamed from: requestId */
    public int f56677x295c940a;

    /* renamed from: terminal */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c f56678xb997927c;

    public C26750xa473137e() {
        this.f56677x295c940a = 0;
        this.f56674x5a623f5 = 0;
        this.f56676xc2a4e117 = "";
        this.qua = "";
        this.f56675x65a71584 = (byte) 0;
        this.f56678xb997927c = null;
        this.f56672x820f0e88 = 0;
        this.f56673xb14d7127 = 0;
        this.net = null;
    }

    /* renamed from: className */
    public java.lang.String m105266xff691c23() {
        return "jce.ReqHead";
    }

    /* renamed from: clone */
    public java.lang.Object m105267x5a5dd5d() {
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
        c2857xb4f8ac23.m21248x63a518c2(this.f56677x295c940a, "requestId");
        c2857xb4f8ac23.m21248x63a518c2(this.f56674x5a623f5, "cmdId");
        c2857xb4f8ac23.m21252x63a518c2(this.f56676xc2a4e117, "phoneGuid");
        c2857xb4f8ac23.m21252x63a518c2(this.qua, "qua");
        c2857xb4f8ac23.m21244x63a518c2(this.f56675x65a71584, "encryptWithPack");
        c2857xb4f8ac23.m21250x63a518c2((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56678xb997927c, "terminal");
        c2857xb4f8ac23.m21248x63a518c2(this.f56672x820f0e88, "assistantAPILevel");
        c2857xb4f8ac23.m21248x63a518c2(this.f56673xb14d7127, "assistantVersionCode");
        c2857xb4f8ac23.m21250x63a518c2((com.qq.taf.jce.AbstractC2861x7aec4921) this.net, "net");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21269x93891d14(this.f56677x295c940a, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56674x5a623f5, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56676xc2a4e117, true);
        c2857xb4f8ac23.m21273x93891d14(this.qua, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56675x65a71584, true);
        c2857xb4f8ac23.m21271x93891d14((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56678xb997927c, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56672x820f0e88, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56673xb14d7127, true);
        c2857xb4f8ac23.m21271x93891d14((com.qq.taf.jce.AbstractC2861x7aec4921) this.net, false);
    }

    /* renamed from: equals */
    public boolean m105268xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e c26750xa473137e = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e) obj;
        return com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56677x295c940a, c26750xa473137e.f56677x295c940a) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56674x5a623f5, c26750xa473137e.f56674x5a623f5) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56676xc2a4e117, c26750xa473137e.f56676xc2a4e117) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.qua, c26750xa473137e.qua) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56675x65a71584, c26750xa473137e.f56675x65a71584) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56678xb997927c, c26750xa473137e.f56678xb997927c) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56672x820f0e88, c26750xa473137e.f56672x820f0e88) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56673xb14d7127, c26750xa473137e.f56673xb14d7127) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.net, c26750xa473137e.net);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105269xe2b78a54() {
        return TAG;
    }

    /* renamed from: getAssistantAPILevel */
    public int m105270xd54395d2() {
        return this.f56672x820f0e88;
    }

    /* renamed from: getAssistantVersionCode */
    public int m105271x5f192d9d() {
        return this.f56673xb14d7127;
    }

    /* renamed from: getCmdId */
    public int m105272x7443ca3f() {
        return this.f56674x5a623f5;
    }

    /* renamed from: getEncryptWithPack */
    public byte m105273x4a08e74e() {
        return this.f56675x65a71584;
    }

    /* renamed from: getNet */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net m105274xb5885a67() {
        return this.net;
    }

    /* renamed from: getPhoneGuid */
    public java.lang.String m105275xc2125261() {
        return this.f56676xc2a4e117;
    }

    /* renamed from: getQua */
    public java.lang.String m105276xb5886787() {
        return this.qua;
    }

    /* renamed from: getRequestId */
    public int m105277x28ca0554() {
        return this.f56677x295c940a;
    }

    /* renamed from: getTerminal */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c m105278x3571cff2() {
        return this.f56678xb997927c;
    }

    /* renamed from: hashCode */
    public int m105279x8cdac1b() {
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
        this.f56677x295c940a = c2859xe10ac61e.m21299x355996(this.f56677x295c940a, 0, true);
        this.f56674x5a623f5 = c2859xe10ac61e.m21299x355996(this.f56674x5a623f5, 1, true);
        this.f56676xc2a4e117 = c2859xe10ac61e.m21321xe22f9d47(2, true);
        this.qua = c2859xe10ac61e.m21321xe22f9d47(3, true);
        this.f56675x65a71584 = c2859xe10ac61e.m21296x355996(this.f56675x65a71584, 4, false);
        if (f56671x4efc6699 == null) {
            f56671x4efc6699 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c();
        }
        this.f56678xb997927c = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56671x4efc6699, 5, false);
        this.f56672x820f0e88 = c2859xe10ac61e.m21299x355996(this.f56672x820f0e88, 6, false);
        this.f56673xb14d7127 = c2859xe10ac61e.m21299x355996(this.f56673xb14d7127, 7, false);
        if (f56670xdf05f760 == null) {
            f56670xdf05f760 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net();
        }
        this.net = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56670xdf05f760, 8, false);
    }

    /* renamed from: setAssistantAPILevel */
    public void m105280xb0d9a246(int i17) {
        this.f56672x820f0e88 = i17;
    }

    /* renamed from: setAssistantVersionCode */
    public void m105281xd96c5ca9(int i17) {
        this.f56673xb14d7127 = i17;
    }

    /* renamed from: setCmdId */
    public void m105282x52d1e4b3(int i17) {
        this.f56674x5a623f5 = i17;
    }

    /* renamed from: setEncryptWithPack */
    public void m105283x80df80c2(byte b17) {
        this.f56675x65a71584 = b17;
    }

    /* renamed from: setNet */
    public void m105284xca0281db(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net net) {
        this.net = net;
    }

    /* renamed from: setPhoneGuid */
    public void m105285x1e6612d5(java.lang.String str) {
        this.f56676xc2a4e117 = str;
    }

    /* renamed from: setQua */
    public void m105286xca028efb(java.lang.String str) {
        this.qua = str;
    }

    /* renamed from: setRequestId */
    public void m105287x851dc5c8(int i17) {
        this.f56677x295c940a = i17;
    }

    /* renamed from: setTerminal */
    public void m105288x302a30fe(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c c26757xbd71f69c) {
        this.f56678xb997927c = c26757xbd71f69c;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56677x295c940a, 0);
        c2860x6de9642d.m21338x6c257df(this.f56674x5a623f5, 1);
        c2860x6de9642d.m21349x6c257df(this.f56676xc2a4e117, 2);
        c2860x6de9642d.m21349x6c257df(this.qua, 3);
        c2860x6de9642d.m21335x6c257df(this.f56675x65a71584, 4);
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c c26757xbd71f69c = this.f56678xb997927c;
        if (c26757xbd71f69c != null) {
            c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) c26757xbd71f69c, 5);
        }
        c2860x6de9642d.m21338x6c257df(this.f56672x820f0e88, 6);
        c2860x6de9642d.m21338x6c257df(this.f56673xb14d7127, 7);
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net net = this.net;
        if (net != null) {
            c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) net, 8);
        }
    }

    public C26750xa473137e(int i17, int i18, java.lang.String str, java.lang.String str2, byte b17, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c c26757xbd71f69c, int i19, int i27, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.Net net) {
        this.f56677x295c940a = i17;
        this.f56674x5a623f5 = i18;
        this.f56676xc2a4e117 = str;
        this.qua = str2;
        this.f56675x65a71584 = b17;
        this.f56678xb997927c = c26757xbd71f69c;
        this.f56672x820f0e88 = i19;
        this.f56673xb14d7127 = i27;
        this.net = net;
    }
}
