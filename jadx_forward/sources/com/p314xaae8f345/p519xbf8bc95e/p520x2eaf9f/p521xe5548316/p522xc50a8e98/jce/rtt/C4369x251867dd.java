package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest */
/* loaded from: classes13.dex */
public final class C4369x251867dd extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Integer> f130223a = new java.util.ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    static int f130224b = 0;

    /* renamed from: c, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Long> f130225c = null;

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f130226d = true;

    /* renamed from: bounds */
    public java.util.ArrayList<java.lang.Integer> f17249xad8df6b5;

    /* renamed from: crcs */
    public java.util.ArrayList<java.lang.Long> f17250x2eb91f;

    /* renamed from: type */
    public int f17251x368f3a;
    public short zip;

    /* renamed from: zoom */
    public short f17252x3923d3;

    static {
        f130223a.add(0);
        f130224b = 0;
        f130225c = new java.util.ArrayList<>();
        f130225c.add(0L);
    }

    public C4369x251867dd() {
        this.f17249xad8df6b5 = null;
        this.f17252x3923d3 = (short) 0;
        this.zip = (short) 0;
        this.f17251x368f3a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu.f130702c.f130711a;
        this.f17250x2eb91f = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "navsns.RttRequest";
    }

    /* renamed from: clone */
    public final java.lang.Object m36079x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130226d) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a((java.util.Collection) this.f17249xad8df6b5, "bounds");
        kVar.a(this.f17252x3923d3, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb);
        kVar.a(this.zip, "zip");
        kVar.a(this.f17251x368f3a, "type");
        kVar.a((java.util.Collection) this.f17250x2eb91f, "crcs");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a((java.util.Collection) this.f17249xad8df6b5, true);
        kVar.a(this.f17252x3923d3, true);
        kVar.a(this.zip, true);
        kVar.a(this.f17251x368f3a, true);
        kVar.a((java.util.Collection) this.f17250x2eb91f, false);
    }

    /* renamed from: equals */
    public final boolean m36082xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd c4369x251867dd = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17249xad8df6b5, (java.lang.Object) c4369x251867dd.f17249xad8df6b5) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17252x3923d3, c4369x251867dd.f17252x3923d3) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.zip, c4369x251867dd.zip) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17251x368f3a, c4369x251867dd.f17251x368f3a) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17250x2eb91f, (java.lang.Object) c4369x251867dd.f17250x2eb91f);
    }

    /* renamed from: getBounds */
    public final java.util.ArrayList<java.lang.Integer> m36083x12a519ab() {
        return this.f17249xad8df6b5;
    }

    /* renamed from: getCrcs */
    public final java.util.ArrayList<java.lang.Long> m36084xfb7e2195() {
        return this.f17250x2eb91f;
    }

    /* renamed from: getType */
    public final int m36085xfb85f7b0() {
        return this.f17251x368f3a;
    }

    /* renamed from: getZip */
    public final short m36086xb58887eb() {
        return this.zip;
    }

    /* renamed from: getZoom */
    public final short m36087xfb888c49() {
        return this.f17252x3923d3;
    }

    /* renamed from: hashCode */
    public final int m36088x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17249xad8df6b5 = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130223a, 0, true);
        this.f17252x3923d3 = mVar.a(this.f17252x3923d3, 1, true);
        this.zip = mVar.a(this.zip, 2, true);
        this.f17251x368f3a = mVar.a(this.f17251x368f3a, 3, false);
        this.f17250x2eb91f = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130225c, 4, false);
    }

    /* renamed from: setBounds */
    public final void m36089x5da4db7(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.f17249xad8df6b5 = arrayList;
    }

    /* renamed from: setCrcs */
    public final void m36090x7648e8a1(java.util.ArrayList<java.lang.Long> arrayList) {
        this.f17250x2eb91f = arrayList;
    }

    /* renamed from: setType */
    public final void m36091x7650bebc(int i17) {
        this.f17251x368f3a = i17;
    }

    /* renamed from: setZip */
    public final void m36092xca02af5f(short s17) {
        this.zip = s17;
    }

    /* renamed from: setZoom */
    public final void m36093x76535355(short s17) {
        this.f17252x3923d3 = s17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a((java.util.Collection) this.f17249xad8df6b5, 0);
        nVar.a(this.f17252x3923d3, 1);
        nVar.a(this.zip, 2);
        nVar.a(this.f17251x368f3a, 3);
        java.util.ArrayList<java.lang.Long> arrayList = this.f17250x2eb91f;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 4);
        }
    }

    public C4369x251867dd(java.util.ArrayList<java.lang.Integer> arrayList, short s17, short s18, int i17, java.util.ArrayList<java.lang.Long> arrayList2) {
        this.f17249xad8df6b5 = null;
        this.f17252x3923d3 = (short) 0;
        this.zip = (short) 0;
        int i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu.f130702c.f130711a;
        this.f17249xad8df6b5 = arrayList;
        this.f17252x3923d3 = s17;
        this.zip = s18;
        this.f17251x368f3a = i17;
        this.f17250x2eb91f = arrayList2;
    }
}
