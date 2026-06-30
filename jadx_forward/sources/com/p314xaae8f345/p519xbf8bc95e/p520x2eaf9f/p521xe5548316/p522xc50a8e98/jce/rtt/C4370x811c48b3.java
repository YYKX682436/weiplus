package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse */
/* loaded from: classes13.dex */
public final class C4370x811c48b3 extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f130227a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f130228b = true;

    /* renamed from: result */
    public byte[] f17253xc84dc81d;

    static {
        f130227a = r0;
        byte[] bArr = {0};
    }

    public C4370x811c48b3() {
        this.f17253xc84dc81d = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "navsns.RttResponse";
    }

    /* renamed from: clone */
    public final java.lang.Object m36095x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130228b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17).a(this.f17253xc84dc81d, "result");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17).a(this.f17253xc84dc81d, false);
    }

    /* renamed from: equals */
    public final boolean m36096xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17253xc84dc81d, (java.lang.Object) ((com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3) obj).f17253xc84dc81d);
    }

    /* renamed from: getResult */
    public final byte[] m36097x2d64eb13() {
        return this.f17253xc84dc81d;
    }

    /* renamed from: hashCode */
    public final int m36098x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17253xc84dc81d = mVar.c(0, true);
    }

    /* renamed from: setResult */
    public final void m36099x209a1f1f(byte[] bArr) {
        this.f17253xc84dc81d = bArr;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17253xc84dc81d, 0);
    }

    public C4370x811c48b3(byte[] bArr) {
        this.f17253xc84dc81d = bArr;
    }
}
