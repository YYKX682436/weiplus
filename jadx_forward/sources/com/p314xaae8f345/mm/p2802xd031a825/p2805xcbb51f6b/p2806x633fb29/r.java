package com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29;

/* loaded from: classes9.dex */
public abstract class r extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o implements com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.a {
    private static final java.lang.String TAG = "MicroMsg.NetSceneTenpayRetriableBase";

    /* renamed from: can_pay_retry2 */
    private boolean f39878xd8d9c5d0;

    /* renamed from: retryPayInfo */
    private com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 f39884x30c99dae;

    /* renamed from: shouldRetr */
    private boolean f39885xee99d444 = false;

    /* renamed from: errCode */
    private int f39879xa7c470f2 = 0;

    /* renamed from: errMsg */
    private java.lang.String f39880xb2d4efdc = "";

    /* renamed from: hasRetried */
    private boolean f39882xba9bad3d = false;

    /* renamed from: hasCGiRetried */
    private boolean f39881x85e70c = false;

    /* renamed from: isPaySuccess */
    public boolean f39883x9cd69705 = false;

    /* renamed from: canPayRetry */
    public boolean m83042x2e74bed0() {
        return this.f39878xd8d9c5d0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: canRetry */
    public boolean mo83038xf7b914b8() {
        return false;
    }

    /* renamed from: checkPaySuccess */
    public boolean m83043x632cb163() {
        return this.f39883x9cd69705;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: configRequest */
    public void mo83006x226c38ed(boolean z17, boolean z18) {
        super.mo83006x226c38ed(z17, z18);
    }

    /* renamed from: getErrCode */
    public int m83044xe591acbc() {
        return this.f39879xa7c470f2;
    }

    /* renamed from: getErrMsg */
    public java.lang.String m83045x17ec12d2() {
        return this.f39880xb2d4efdc;
    }

    /* renamed from: getHasRetried */
    public boolean m83046xa8dc6533() {
        return this.f39882xba9bad3d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.a
    /* renamed from: getRetryPayInfo */
    public com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 mo83036x91bc3024() {
        return this.f39884x30c99dae;
    }

    /* renamed from: isShouldRetr */
    public boolean m83047x7004d10e() {
        return this.f39885xee99d444;
    }

    /* renamed from: ishasCGiRetried */
    public boolean m83048x52260e22() {
        return this.f39881x85e70c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f39879xa7c470f2 = i17;
        this.f39880xb2d4efdc = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        boolean z17 = false;
        if (jSONObject != null && jSONObject.optInt("can_pay_retry") == 1) {
            z17 = true;
        }
        this.f39878xd8d9c5d0 = z17;
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e1 = new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1();
        this.f39884x30c99dae = c22898xca8246e1;
        c22898xca8246e1.a(jSONObject);
    }

    /* renamed from: resetForRetry */
    public void m83049xd0c8fdce() {
        m48013x6761d4f();
        this.f39881x85e70c = true;
        this.f39877xb9a2b39f = false;
    }

    /* renamed from: setErrCode */
    public void m83050x5902fa30(int i17) {
        this.f39879xa7c470f2 = i17;
    }

    /* renamed from: setErrMsg */
    public void m83051xb2146de(java.lang.String str) {
        this.f39880xb2d4efdc = str;
    }

    /* renamed from: setHasRetried */
    public void m83052xd700b33f(boolean z17) {
        this.f39882xba9bad3d = z17;
    }

    /* renamed from: setPaySuccess */
    public void m83053x37d0a03d(boolean z17) {
        this.f39883x9cd69705 = z17;
    }

    /* renamed from: setRetry */
    public void m83054x53a1e366() {
        m48013x6761d4f();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_retry_pay", "1");
        m83003x698ba778(hashMap);
        this.f39881x85e70c = true;
        this.f39877xb9a2b39f = false;
    }

    /* renamed from: setShouldRetr */
    public void m83055xafeda46(boolean z17) {
        this.f39885xee99d444 = z17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: shouldResolveJsonWhenError */
    public boolean mo68416xd2dc02ad() {
        return !m83046xa8dc6533();
    }

    /* renamed from: updateConfig */
    public void m83056xac5f2d6b(int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("retry_count", i17 + "");
        hashMap.put("is_last_retry", i18 + "");
        m83003x698ba778(hashMap);
    }
}
