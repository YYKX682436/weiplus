package com.p314xaae8f345.p3121x37984a.p3123x4e97089f;

/* renamed from: com.tencent.wcdb.chaincall.Update */
/* loaded from: classes12.dex */
public class C26910x976524e9<T> extends com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26906xc5fa9c9f<com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8> {

    /* renamed from: fields */
    private com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] f57963xb4057eb9;

    /* renamed from: object */
    private T f57964xc300a33f;
    private com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[] row;

    public C26910x976524e9(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, boolean z17, boolean z18) {
        super(c26919x80675a48, z17, z18);
        this.f57963xb4057eb9 = null;
        this.f57964xc300a33f = null;
        this.row = null;
        this.f57955x83b7296f = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8();
    }

    /* renamed from: execute */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106437xb158f775() {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107904x3759ea4f(this.f57963xb4057eb9);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        try {
            c26923xdf786992 = this.f57953xb7026e28.m106780x1b7421d3(this.f57955x83b7296f);
            T t17 = this.f57964xc300a33f;
            if (t17 != null) {
                c26923xdf786992.m107044x2d44d1dc((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992) t17, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992>[]) this.f57963xb4057eb9);
            } else {
                com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[] c26901x4e9a151Arr = this.row;
                if (c26901x4e9a151Arr != null) {
                    c26923xdf786992.m107046xf98c585d(c26901x4e9a151Arr);
                }
            }
            c26923xdf786992.m107085x3606cc();
            m106404xd2e0fdba();
            c26923xdf786992.m107051xf2172ef1();
            m106403xf99e7343();
            return this;
        } catch (java.lang.Throwable th6) {
            if (c26923xdf786992 != null) {
                c26923xdf786992.m107051xf2172ef1();
            }
            m106403xf99e7343();
            throw th6;
        }
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106441x6234bbb(short s17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108829x6234bbb(s17);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106445xc3376493(short s17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108835xc3376493(s17);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106446xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108842xb80cf445(c27017x4f962880);
        return this;
    }

    @java.lang.SafeVarargs
    public final com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> set(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>... c26981x40bb0daArr) {
        this.f57963xb4057eb9 = c26981x40bb0daArr;
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108843x7022909d(c26981x40bb0daArr);
        return this;
    }

    /* renamed from: table */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106448x6903bce(java.lang.String str) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108848xce0038c9(str);
        return this;
    }

    /* renamed from: toObject */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106449x8e41959a(T t17) {
        this.f57964xc300a33f = t17;
        return this;
    }

    /* renamed from: toRow */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106450x6965d5f(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151... c26901x4e9a151Arr) {
        this.row = c26901x4e9a151Arr;
        return this;
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106456xbaa667b6(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151) {
        return m106450x6965d5f(c26901x4e9a151);
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106460x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108849x6bdbce7(c27003xbcd6eb8);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106438x6234bbb(int i17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108829x6234bbb(i17);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106442xc3376493(int i17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108835xc3376493(i17);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106447xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108842xb80cf445(c27017x4f962880Arr);
        return this;
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106451xbaa667b6(byte b17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(b17));
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106439x6234bbb(long j17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108829x6234bbb(j17);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106443xc3376493(long j17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108835xc3376493(j17);
        return this;
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106458xbaa667b6(short s17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151((int) s17));
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106440x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108832x6234bbb(interfaceC27004x81a79aad);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106444xc3376493(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8) this.f57955x83b7296f).m108836xc3376493(interfaceC27004x81a79aad);
        return this;
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106454xbaa667b6(int i17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(i17));
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106455xbaa667b6(long j17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(j17));
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106457xbaa667b6(java.lang.String str) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(str));
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106459xbaa667b6(byte[] bArr) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(bArr));
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106453xbaa667b6(float f17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(f17));
    }

    /* renamed from: toValue */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106452xbaa667b6(double d17) {
        return m106450x6965d5f(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(d17));
    }
}
