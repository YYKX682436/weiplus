package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo */
/* loaded from: classes13.dex */
public final class C26742x5a9e4fad extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56610x7118e671 = false;
    private static final java.lang.String TAG = "DownloadChunkLogInfo";

    /* renamed from: UUID */
    public java.lang.String f56611x27ebbb;

    /* renamed from: appId */
    public java.lang.String f56612x58b7f1c;

    /* renamed from: currentRetryCnt */
    public byte f56613x73dd9e3a;

    /* renamed from: endTime */
    public long f56614xa0336a48;

    /* renamed from: errorCode */
    public int f56615x139cb015;

    /* renamed from: flag */
    public java.lang.String f56616x2fff6c;

    /* renamed from: isWap */
    public byte f56617x5fd3d5c;

    /* renamed from: networkOperator */
    public java.lang.String f56618x9637d8f2;

    /* renamed from: networkType */
    public int f56619x8c549688;

    /* renamed from: readHeaderTime */
    public long f56620xaecb4d30;

    /* renamed from: receiveDataSize */
    public long f56621xff1ba2ce;

    /* renamed from: requestRanagePosition */
    public long f56622xe775ee38;

    /* renamed from: requestRanageSize */
    public long f56623xa5741490;

    /* renamed from: requestUrl */
    public java.lang.String f56624x2361c60;

    /* renamed from: responseContentLength */
    public long f56625xd21e29fe;

    /* renamed from: responseHttpCode */
    public int f56626x3ea74df6;

    /* renamed from: responseRangeLength */
    public long f56627x694dcf82;

    /* renamed from: responseRangePosition */
    public long f56628x63f76c5;

    /* renamed from: resultState */
    public int f56629xdf539674;

    /* renamed from: startTime */
    public long f56630x81158a4f;

    /* renamed from: type */
    public byte f56631x368f3a;
    public java.lang.String via;

    public C26742x5a9e4fad() {
        this.f56611x27ebbb = "";
        this.f56631x368f3a = (byte) 0;
        this.f56624x2361c60 = "";
        this.f56618x9637d8f2 = "";
        this.f56619x8c549688 = 0;
        this.f56617x5fd3d5c = (byte) 0;
        this.f56622xe775ee38 = 0L;
        this.f56623xa5741490 = 0L;
        this.f56628x63f76c5 = 0L;
        this.f56627x694dcf82 = 0L;
        this.f56625xd21e29fe = 0L;
        this.f56626x3ea74df6 = 0;
        this.f56621xff1ba2ce = 0L;
        this.f56630x81158a4f = 0L;
        this.f56620xaecb4d30 = 0L;
        this.f56614xa0336a48 = 0L;
        this.f56615x139cb015 = 0;
        this.f56629xdf539674 = 0;
        this.f56613x73dd9e3a = (byte) 0;
        this.via = "";
        this.f56612x58b7f1c = "";
        this.f56616x2fff6c = "";
    }

    /* renamed from: className */
    public java.lang.String m105161xff691c23() {
        return "jce.DownloadChunkLogInfo";
    }

    /* renamed from: clone */
    public java.lang.Object m105162x5a5dd5d() {
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
        c2857xb4f8ac23.m21252x63a518c2(this.f56611x27ebbb, "UUID");
        c2857xb4f8ac23.m21244x63a518c2(this.f56631x368f3a, "type");
        c2857xb4f8ac23.m21252x63a518c2(this.f56624x2361c60, "requestUrl");
        c2857xb4f8ac23.m21252x63a518c2(this.f56618x9637d8f2, "networkOperator");
        c2857xb4f8ac23.m21248x63a518c2(this.f56619x8c549688, "networkType");
        c2857xb4f8ac23.m21244x63a518c2(this.f56617x5fd3d5c, "isWap");
        c2857xb4f8ac23.m21249x63a518c2(this.f56622xe775ee38, "requestRanagePosition");
        c2857xb4f8ac23.m21249x63a518c2(this.f56623xa5741490, "requestRanageSize");
        c2857xb4f8ac23.m21249x63a518c2(this.f56628x63f76c5, "responseRangePosition");
        c2857xb4f8ac23.m21249x63a518c2(this.f56627x694dcf82, "responseRangeLength");
        c2857xb4f8ac23.m21249x63a518c2(this.f56625xd21e29fe, "responseContentLength");
        c2857xb4f8ac23.m21248x63a518c2(this.f56626x3ea74df6, "responseHttpCode");
        c2857xb4f8ac23.m21249x63a518c2(this.f56621xff1ba2ce, "receiveDataSize");
        c2857xb4f8ac23.m21249x63a518c2(this.f56630x81158a4f, "startTime");
        c2857xb4f8ac23.m21249x63a518c2(this.f56620xaecb4d30, "readHeaderTime");
        c2857xb4f8ac23.m21249x63a518c2(this.f56614xa0336a48, "endTime");
        c2857xb4f8ac23.m21248x63a518c2(this.f56615x139cb015, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
        c2857xb4f8ac23.m21248x63a518c2(this.f56629xdf539674, "resultState");
        c2857xb4f8ac23.m21244x63a518c2(this.f56613x73dd9e3a, "currentRetryCnt");
        c2857xb4f8ac23.m21252x63a518c2(this.via, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56308x97129f1f);
        c2857xb4f8ac23.m21252x63a518c2(this.f56612x58b7f1c, "appId");
        c2857xb4f8ac23.m21252x63a518c2(this.f56616x2fff6c, "flag");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21273x93891d14(this.f56611x27ebbb, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56631x368f3a, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56624x2361c60, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56618x9637d8f2, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56619x8c549688, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56617x5fd3d5c, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56622xe775ee38, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56623xa5741490, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56628x63f76c5, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56627x694dcf82, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56625xd21e29fe, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56626x3ea74df6, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56621xff1ba2ce, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56630x81158a4f, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56620xaecb4d30, true);
        c2857xb4f8ac23.m21270x93891d14(this.f56614xa0336a48, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56615x139cb015, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56629xdf539674, true);
        c2857xb4f8ac23.m21265x93891d14(this.f56613x73dd9e3a, true);
        c2857xb4f8ac23.m21273x93891d14(this.via, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56612x58b7f1c, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56616x2fff6c, false);
    }

    /* renamed from: equals */
    public boolean m105163xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad c26742x5a9e4fad = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad) obj;
        return com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56611x27ebbb, c26742x5a9e4fad.f56611x27ebbb) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56631x368f3a, c26742x5a9e4fad.f56631x368f3a) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56624x2361c60, c26742x5a9e4fad.f56624x2361c60) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56618x9637d8f2, c26742x5a9e4fad.f56618x9637d8f2) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56619x8c549688, c26742x5a9e4fad.f56619x8c549688) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56617x5fd3d5c, c26742x5a9e4fad.f56617x5fd3d5c) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56622xe775ee38, c26742x5a9e4fad.f56622xe775ee38) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56623xa5741490, c26742x5a9e4fad.f56623xa5741490) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56628x63f76c5, c26742x5a9e4fad.f56628x63f76c5) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56627x694dcf82, c26742x5a9e4fad.f56627x694dcf82) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56625xd21e29fe, c26742x5a9e4fad.f56625xd21e29fe) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56626x3ea74df6, c26742x5a9e4fad.f56626x3ea74df6) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56621xff1ba2ce, c26742x5a9e4fad.f56621xff1ba2ce) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56630x81158a4f, c26742x5a9e4fad.f56630x81158a4f) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56620xaecb4d30, c26742x5a9e4fad.f56620xaecb4d30) && com.qq.taf.jce.C2862xf934904e.m21399xb2c87fbf(this.f56614xa0336a48, c26742x5a9e4fad.f56614xa0336a48) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56615x139cb015, c26742x5a9e4fad.f56615x139cb015) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56629xdf539674, c26742x5a9e4fad.f56629xdf539674) && com.qq.taf.jce.C2862xf934904e.m21394xb2c87fbf(this.f56613x73dd9e3a, c26742x5a9e4fad.f56613x73dd9e3a) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.via, c26742x5a9e4fad.via) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56612x58b7f1c, c26742x5a9e4fad.f56612x58b7f1c) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56616x2fff6c, c26742x5a9e4fad.f56616x2fff6c);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105164xe2b78a54() {
        return TAG;
    }

    /* renamed from: getAppId */
    public java.lang.String m105165x74292566() {
        return this.f56612x58b7f1c;
    }

    /* renamed from: getCurrentRetryCnt */
    public byte m105166x583f7004() {
        return this.f56613x73dd9e3a;
    }

    /* renamed from: getEndTime */
    public long m105167xde00a612() {
        return this.f56614xa0336a48;
    }

    /* renamed from: getErrorCode */
    public int m105168x130a215f() {
        return this.f56615x139cb015;
    }

    /* renamed from: getFlag */
    public java.lang.String m105169xfb7f67e2() {
        return this.f56616x2fff6c;
    }

    /* renamed from: getIsWap */
    public byte m105170x749ae3a6() {
        return this.f56617x5fd3d5c;
    }

    /* renamed from: getNetworkOperator */
    public java.lang.String m105171x7a99aabc() {
        return this.f56618x9637d8f2;
    }

    /* renamed from: getNetworkType */
    public int m105172x662add52() {
        return this.f56619x8c549688;
    }

    /* renamed from: getReadHeaderTime */
    public long m105173x9d631a26() {
        return this.f56620xaecb4d30;
    }

    /* renamed from: getReceiveDataSize */
    public long m105174xe37d7498() {
        return this.f56621xff1ba2ce;
    }

    /* renamed from: getRequestRanagePosition */
    public long m105175xf321c082() {
        return this.f56622xe775ee38;
    }

    /* renamed from: getRequestRanageSize */
    public long m105176xf8a89bda() {
        return this.f56623xa5741490;
    }

    /* renamed from: getRequestUrl */
    public java.lang.String m105177xf076d456() {
        return this.f56624x2361c60;
    }

    /* renamed from: getResponseContentLength */
    public long m105178xddc9fc48() {
        return this.f56625xd21e29fe;
    }

    /* renamed from: getResponseHttpCode */
    public int m105179xe67fb56c() {
        return this.f56626x3ea74df6;
    }

    /* renamed from: getResponseRangeLength */
    public long m105180xc17dac4c() {
        return this.f56627x694dcf82;
    }

    /* renamed from: getResponseRangePosition */
    public long m105181x11eb490f() {
        return this.f56628x63f76c5;
    }

    /* renamed from: getResultState */
    public int m105182xb929dd3e() {
        return this.f56629xdf539674;
    }

    /* renamed from: getStartTime */
    public long m105183x8082fb99() {
        return this.f56630x81158a4f;
    }

    /* renamed from: getType */
    public byte m105184xfb85f7b0() {
        return this.f56631x368f3a;
    }

    /* renamed from: getUUID */
    public java.lang.String m105185xfb85e011() {
        return this.f56611x27ebbb;
    }

    /* renamed from: getVia */
    public java.lang.String m105186xb58878d8() {
        return this.via;
    }

    /* renamed from: hashCode */
    public int m105187x8cdac1b() {
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
        this.f56611x27ebbb = c2859xe10ac61e.m21321xe22f9d47(0, false);
        this.f56631x368f3a = c2859xe10ac61e.m21296x355996(this.f56631x368f3a, 1, false);
        this.f56624x2361c60 = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56618x9637d8f2 = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f56619x8c549688 = c2859xe10ac61e.m21299x355996(this.f56619x8c549688, 4, false);
        this.f56617x5fd3d5c = c2859xe10ac61e.m21296x355996(this.f56617x5fd3d5c, 5, false);
        this.f56622xe775ee38 = c2859xe10ac61e.m21300x355996(this.f56622xe775ee38, 6, false);
        this.f56623xa5741490 = c2859xe10ac61e.m21300x355996(this.f56623xa5741490, 7, false);
        this.f56628x63f76c5 = c2859xe10ac61e.m21300x355996(this.f56628x63f76c5, 9, false);
        this.f56627x694dcf82 = c2859xe10ac61e.m21300x355996(this.f56627x694dcf82, 10, false);
        this.f56625xd21e29fe = c2859xe10ac61e.m21300x355996(this.f56625xd21e29fe, 11, false);
        this.f56626x3ea74df6 = c2859xe10ac61e.m21299x355996(this.f56626x3ea74df6, 12, false);
        this.f56621xff1ba2ce = c2859xe10ac61e.m21300x355996(this.f56621xff1ba2ce, 13, false);
        this.f56630x81158a4f = c2859xe10ac61e.m21300x355996(this.f56630x81158a4f, 14, false);
        this.f56620xaecb4d30 = c2859xe10ac61e.m21300x355996(this.f56620xaecb4d30, 15, false);
        this.f56614xa0336a48 = c2859xe10ac61e.m21300x355996(this.f56614xa0336a48, 16, false);
        this.f56615x139cb015 = c2859xe10ac61e.m21299x355996(this.f56615x139cb015, 17, false);
        this.f56629xdf539674 = c2859xe10ac61e.m21299x355996(this.f56629xdf539674, 18, false);
        this.f56613x73dd9e3a = c2859xe10ac61e.m21296x355996(this.f56613x73dd9e3a, 19, false);
        this.via = c2859xe10ac61e.m21321xe22f9d47(20, false);
        this.f56612x58b7f1c = c2859xe10ac61e.m21321xe22f9d47(21, false);
        this.f56616x2fff6c = c2859xe10ac61e.m21321xe22f9d47(22, false);
    }

    /* renamed from: setAppId */
    public void m105188x52b73fda(java.lang.String str) {
        this.f56612x58b7f1c = str;
    }

    /* renamed from: setCurrentRetryCnt */
    public void m105189x8f160978(byte b17) {
        this.f56613x73dd9e3a = b17;
    }

    /* renamed from: setEndTime */
    public void m105190x5171f386(long j17) {
        this.f56614xa0336a48 = j17;
    }

    /* renamed from: setErrorCode */
    public void m105191x6f5de1d3(int i17) {
        this.f56615x139cb015 = i17;
    }

    /* renamed from: setFlag */
    public void m105192x764a2eee(java.lang.String str) {
        this.f56616x2fff6c = str;
    }

    /* renamed from: setIsWap */
    public void m105193x5328fe1a(byte b17) {
        this.f56617x5fd3d5c = b17;
    }

    /* renamed from: setNetworkOperator */
    public void m105194xb1704430(java.lang.String str) {
        this.f56618x9637d8f2 = str;
    }

    /* renamed from: setNetworkType */
    public void m105195xfc9050c6(int i17) {
        this.f56619x8c549688 = i17;
    }

    /* renamed from: setReadHeaderTime */
    public void m105196x65598232(long j17) {
        this.f56620xaecb4d30 = j17;
    }

    /* renamed from: setReceiveDataSize */
    public void m105197x1a540e0c(long j17) {
        this.f56621xff1ba2ce = j17;
    }

    /* renamed from: setRequestRanagePosition */
    public void m105198xc33472f6(long j17) {
        this.f56622xe775ee38 = j17;
    }

    /* renamed from: setRequestRanageSize */
    public void m105199xd43ea84e(long j17) {
        this.f56623xa5741490 = j17;
    }

    /* renamed from: setRequestUrl */
    public void m105200x1e9b2262(java.lang.String str) {
        this.f56624x2361c60 = str;
    }

    /* renamed from: setResponseContentLength */
    public void m105201xaddcaebc(long j17) {
        this.f56625xd21e29fe = j17;
    }

    /* renamed from: setResponseHttpCode */
    public void m105202x8a7c4a78(int i17) {
        this.f56626x3ea74df6 = i17;
    }

    /* renamed from: setResponseRangeLength */
    public void m105203xfc26bc0(long j17) {
        this.f56627x694dcf82 = j17;
    }

    /* renamed from: setResponseRangePosition */
    public void m105204xe1fdfb83(long j17) {
        this.f56628x63f76c5 = j17;
    }

    /* renamed from: setResultState */
    public void m105205x4f8f50b2(int i17) {
        this.f56629xdf539674 = i17;
    }

    /* renamed from: setStartTime */
    public void m105206xdcd6bc0d(long j17) {
        this.f56630x81158a4f = j17;
    }

    /* renamed from: setType */
    public void m105207x7650bebc(byte b17) {
        this.f56631x368f3a = b17;
    }

    /* renamed from: setUUID */
    public void m105208x7650a71d(java.lang.String str) {
        this.f56611x27ebbb = str;
    }

    /* renamed from: setVia */
    public void m105209xca02a04c(java.lang.String str) {
        this.via = str;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.lang.String str = this.f56611x27ebbb;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 0);
        }
        c2860x6de9642d.m21335x6c257df(this.f56631x368f3a, 1);
        java.lang.String str2 = this.f56624x2361c60;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 2);
        }
        java.lang.String str3 = this.f56618x9637d8f2;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 3);
        }
        c2860x6de9642d.m21338x6c257df(this.f56619x8c549688, 4);
        c2860x6de9642d.m21335x6c257df(this.f56617x5fd3d5c, 5);
        c2860x6de9642d.m21339x6c257df(this.f56622xe775ee38, 6);
        c2860x6de9642d.m21339x6c257df(this.f56623xa5741490, 7);
        c2860x6de9642d.m21339x6c257df(this.f56628x63f76c5, 9);
        c2860x6de9642d.m21339x6c257df(this.f56627x694dcf82, 10);
        c2860x6de9642d.m21339x6c257df(this.f56625xd21e29fe, 11);
        c2860x6de9642d.m21338x6c257df(this.f56626x3ea74df6, 12);
        c2860x6de9642d.m21339x6c257df(this.f56621xff1ba2ce, 13);
        c2860x6de9642d.m21339x6c257df(this.f56630x81158a4f, 14);
        c2860x6de9642d.m21339x6c257df(this.f56620xaecb4d30, 15);
        c2860x6de9642d.m21339x6c257df(this.f56614xa0336a48, 16);
        c2860x6de9642d.m21338x6c257df(this.f56615x139cb015, 17);
        c2860x6de9642d.m21338x6c257df(this.f56629xdf539674, 18);
        c2860x6de9642d.m21335x6c257df(this.f56613x73dd9e3a, 19);
        java.lang.String str4 = this.via;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 20);
        }
        java.lang.String str5 = this.f56612x58b7f1c;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 21);
        }
        java.lang.String str6 = this.f56616x2fff6c;
        if (str6 != null) {
            c2860x6de9642d.m21349x6c257df(str6, 22);
        }
    }

    public C26742x5a9e4fad(java.lang.String str, byte b17, java.lang.String str2, java.lang.String str3, int i17, byte b18, long j17, long j18, long j19, long j27, long j28, int i18, long j29, long j37, long j38, long j39, int i19, int i27, byte b19, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f56611x27ebbb = str;
        this.f56631x368f3a = b17;
        this.f56624x2361c60 = str2;
        this.f56618x9637d8f2 = str3;
        this.f56619x8c549688 = i17;
        this.f56617x5fd3d5c = b18;
        this.f56622xe775ee38 = j17;
        this.f56623xa5741490 = j18;
        this.f56628x63f76c5 = j19;
        this.f56627x694dcf82 = j27;
        this.f56625xd21e29fe = j28;
        this.f56626x3ea74df6 = i18;
        this.f56621xff1ba2ce = j29;
        this.f56630x81158a4f = j37;
        this.f56620xaecb4d30 = j38;
        this.f56614xa0336a48 = j39;
        this.f56615x139cb015 = i19;
        this.f56629xdf539674 = i27;
        this.f56613x73dd9e3a = b19;
        this.via = str4;
        this.f56612x58b7f1c = str5;
        this.f56616x2fff6c = str6;
    }
}
