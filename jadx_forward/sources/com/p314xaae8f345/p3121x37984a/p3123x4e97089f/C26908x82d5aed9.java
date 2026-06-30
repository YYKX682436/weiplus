package com.p314xaae8f345.p3121x37984a.p3123x4e97089f;

/* renamed from: com.tencent.wcdb.chaincall.Insert */
/* loaded from: classes12.dex */
public class C26908x82d5aed9<T> extends com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26906xc5fa9c9f<com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f57956x7118e671 = false;

    /* renamed from: fields */
    private com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] f57957xb4057eb9;

    /* renamed from: hasConflictAction */
    private boolean f57958x3c30b9e2;

    /* renamed from: lastInsertRowId */
    private long f57959x7b7f88e6;

    /* renamed from: values */
    private java.util.Collection<T> f57960xcee59d22;

    public C26908x82d5aed9(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, boolean z17, boolean z18) {
        super(c26919x80675a48, z17, z18);
        this.f57958x3c30b9e2 = false;
        this.f57957xb4057eb9 = null;
        this.f57960xcee59d22 = null;
        this.f57959x7b7f88e6 = 0L;
        this.f57955x83b7296f = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: realExecute */
    public void m106414xc44fc7f7() {
        com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7 m107904x3759ea4f = com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107904x3759ea4f(this.f57957xb4057eb9);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106780x1b7421d3 = this.f57953xb7026e28.m106780x1b7421d3(this.f57955x83b7296f);
        this.f57959x7b7f88e6 = 0L;
        for (T t17 : this.f57960xcee59d22) {
            m106780x1b7421d3.m107084x6761d4f();
            int i17 = 1;
            boolean z17 = !this.f57958x3c30b9e2 && m107904x3759ea4f.mo107917xf0271976(t17);
            for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da : this.f57957xb4057eb9) {
                if (z17 && c26981x40bb0da.m107909xf0271976()) {
                    m106780x1b7421d3.m107041x37fcf764(i17);
                } else {
                    m107904x3759ea4f.mo107914xc72baabd(t17, c26981x40bb0da, i17, m106780x1b7421d3);
                }
                i17++;
            }
            m106780x1b7421d3.m107085x3606cc();
            if (z17) {
                m107904x3759ea4f.mo107918x96b7f424(t17, this.f57953xb7026e28.m106773xc54eb6b1());
            }
        }
        if (this.f57960xcee59d22.size() > 0) {
            this.f57959x7b7f88e6 = this.f57953xb7026e28.m106773xc54eb6b1();
        }
        m106404xd2e0fdba();
        m106780x1b7421d3.m107051xf2172ef1();
    }

    /* renamed from: execute */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106415xb158f775() {
        if (this.f57960xcee59d22.size() == 0) {
            return this;
        }
        try {
            if (this.f57960xcee59d22.size() > 1) {
                this.f57953xb7026e28.m106962xc8054b53(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe() { // from class: com.tencent.wcdb.chaincall.Insert.1
                    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe
                    /* renamed from: insideTransaction */
                    public boolean mo14059x1b311542(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
                        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9.this.m106414xc44fc7f7();
                        return true;
                    }
                });
            } else {
                m106414xc44fc7f7();
            }
            return this;
        } finally {
            m106403xf99e7343();
        }
    }

    /* renamed from: getLastInsertRowId */
    public long m106416x5fe15ab0() {
        return this.f57959x7b7f88e6;
    }

    /* renamed from: intoTable */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106417x2d5ce14e(java.lang.String str) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8) this.f57955x83b7296f).m108723x399198b9(str);
        return this;
    }

    @java.lang.SafeVarargs
    /* renamed from: onFields */
    public final com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106418x42fa5578(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>... c26981x40bb0daArr) {
        this.f57957xb4057eb9 = c26981x40bb0daArr;
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8) this.f57955x83b7296f).m108720x389b97dd(c26981x40bb0daArr).m108732x4175192f(c26981x40bb0daArr.length);
        return this;
    }

    /* renamed from: orIgnore */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106419x1b99c195() {
        this.f57958x3c30b9e2 = true;
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8) this.f57955x83b7296f).m108726x1b99c195();
        return this;
    }

    /* renamed from: orReplace */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106420x30676751() {
        this.f57958x3c30b9e2 = true;
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8) this.f57955x83b7296f).m108727x30676751();
        return this;
    }

    /* renamed from: value */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106421x6ac9171(T t17) {
        this.f57960xcee59d22 = java.util.Collections.singleton(t17);
        return this;
    }

    /* renamed from: values */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106422xcee59d22(java.util.Collection<T> collection) {
        this.f57960xcee59d22 = collection;
        return this;
    }
}
