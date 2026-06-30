package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult */
/* loaded from: classes13.dex */
public final class C4371x446b01d7 extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f130229a = true;

    /* renamed from: iErrCode */
    public int f17254xa6587049;

    /* renamed from: iSubErrCode */
    public int f17255xd813efdb;

    /* renamed from: strErrDesc */
    public java.lang.String f17256x39437225;

    public C4371x446b01d7() {
        this.f17254xa6587049 = 0;
        this.f17256x39437225 = "";
        this.f17255xd813efdb = 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "sosomap.CmdResult";
    }

    /* renamed from: clone */
    public final java.lang.Object m36100x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130229a) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17254xa6587049, "iErrCode");
        kVar.a(this.f17256x39437225, "strErrDesc");
        kVar.a(this.f17255xd813efdb, "iSubErrCode");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17254xa6587049, true);
        kVar.a(this.f17256x39437225, true);
        kVar.a(this.f17255xd813efdb, false);
    }

    /* renamed from: equals */
    public final boolean m36101xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7 c4371x446b01d7 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17254xa6587049, c4371x446b01d7.f17254xa6587049) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17256x39437225, (java.lang.Object) c4371x446b01d7.f17256x39437225) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17255xd813efdb, c4371x446b01d7.f17255xd813efdb);
    }

    /* renamed from: hashCode */
    public final int m36102x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17254xa6587049 = mVar.a(this.f17254xa6587049, 0, true);
        this.f17256x39437225 = mVar.b(1, true);
        this.f17255xd813efdb = mVar.a(this.f17255xd813efdb, 2, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17254xa6587049, 0);
        nVar.a(this.f17256x39437225, 1);
        nVar.a(this.f17255xd813efdb, 2);
    }

    public C4371x446b01d7(int i17, java.lang.String str, int i18) {
        this.f17254xa6587049 = i17;
        this.f17256x39437225 = str;
        this.f17255xd813efdb = i18;
    }
}
