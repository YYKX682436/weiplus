package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso;

/* loaded from: classes13.dex */
public final class Tag extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f130237a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f130238b = true;

    /* renamed from: strId */
    public java.lang.String f17284x68aff2c;

    /* renamed from: value */
    public byte[] f17285x6ac9171;

    public Tag() {
        this.f17284x68aff2c = "";
        this.f17285x6ac9171 = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "sosomap.Tag";
    }

    /* renamed from: clone */
    public final java.lang.Object m36111x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130238b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17284x68aff2c, "strId");
        kVar.a(this.f17285x6ac9171, "value");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17284x68aff2c, true);
        kVar.a(this.f17285x6ac9171, false);
    }

    /* renamed from: equals */
    public final boolean m36112xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag tag = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17284x68aff2c, (java.lang.Object) tag.f17284x68aff2c) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17285x6ac9171, (java.lang.Object) tag.f17285x6ac9171);
    }

    /* renamed from: getValue */
    public final byte[] m36113x754a37bb() {
        return this.f17285x6ac9171;
    }

    /* renamed from: hashCode */
    public final int m36114x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17284x68aff2c = mVar.b(0, true);
        if (f130237a == null) {
            f130237a = r2;
            byte[] bArr = {0};
        }
        this.f17285x6ac9171 = mVar.c(1, true);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17284x68aff2c, 0);
        nVar.a(this.f17285x6ac9171, 1);
    }

    public Tag(java.lang.String str, byte[] bArr) {
        this.f17284x68aff2c = str;
        this.f17285x6ac9171 = bArr;
    }
}
