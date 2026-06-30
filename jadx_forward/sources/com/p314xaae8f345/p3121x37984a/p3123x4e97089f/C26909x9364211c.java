package com.p314xaae8f345.p3121x37984a.p3123x4e97089f;

/* renamed from: com.tencent.wcdb.chaincall.Select */
/* loaded from: classes12.dex */
public class C26909x9364211c<T> extends com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26906xc5fa9c9f<com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b> {

    /* renamed from: fields */
    private com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] f57962xb4057eb9;

    public C26909x9364211c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, boolean z17, boolean z18) {
        super(c26919x80675a48, z17, z18);
        this.f57962xb4057eb9 = null;
        this.f57955x83b7296f = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b();
    }

    /* renamed from: prepareStatement */
    private com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106423xbda3f428() {
        return this.f57953xb7026e28.m106780x1b7421d3(this.f57955x83b7296f);
    }

    /* renamed from: allObjects */
    public java.util.List<T> m106424xeffdfc33() {
        return (java.util.List<T>) m106425xeffdfc33(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107902xc6702485(this.f57962xb4057eb9));
    }

    /* renamed from: firstObject */
    public T m106426xba979e0f() {
        return (T) m106427xba979e0f(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107902xc6702485(this.f57962xb4057eb9));
    }

    /* renamed from: from */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106428x3017aa(java.lang.String str) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108792x3017aa(str);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106429x6234bbb(long j17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108798x6234bbb(j17);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106431xc3376493(long j17) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108804xc3376493(j17);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106433xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108806xb80cf445(c27017x4f962880);
        return this;
    }

    @java.lang.SafeVarargs
    /* renamed from: select */
    public final com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106435xc9ff34fc(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>... c26981x40bb0daArr) {
        this.f57962xb4057eb9 = c26981x40bb0daArr;
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108807xc9ff34fc((com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492[]) c26981x40bb0daArr);
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106436x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108812x6bdbce7(c27003xbcd6eb8);
        return this;
    }

    /* renamed from: allObjects */
    public <R extends T> java.util.List<R> m106425xeffdfc33(java.lang.Class<R> cls) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992;
        try {
            c26923xdf786992 = m106423xbda3f428();
            try {
                java.util.List<R> m107053xde3eb429 = c26923xdf786992.m107053xde3eb429(this.f57962xb4057eb9, cls);
                c26923xdf786992.m107051xf2172ef1();
                m106403xf99e7343();
                return m107053xde3eb429;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (c26923xdf786992 != null) {
                    c26923xdf786992.m107051xf2172ef1();
                }
                m106403xf99e7343();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            c26923xdf786992 = null;
        }
    }

    /* renamed from: firstObject */
    public <R extends T> R m106427xba979e0f(java.lang.Class<R> cls) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = (R) null;
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106423xbda3f428 = m106423xbda3f428();
            try {
                m106423xbda3f428.m107085x3606cc();
                java.lang.Object obj = c26923xdf786992;
                if (!m106423xbda3f428.m107080xb9a1ffcc()) {
                    obj = (R) m106423xbda3f428.m107074x5715ca8f(this.f57962xb4057eb9, cls);
                }
                m106423xbda3f428.m107051xf2172ef1();
                m106403xf99e7343();
                return (R) obj;
            } catch (java.lang.Throwable th6) {
                th = th6;
                c26923xdf786992 = (R) m106423xbda3f428;
                if (c26923xdf786992 != null) {
                    c26923xdf786992.m107051xf2172ef1();
                }
                m106403xf99e7343();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106430x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108801x6234bbb(interfaceC27004x81a79aad);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106432xc3376493(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108805xc3376493(interfaceC27004x81a79aad);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106434xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        ((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b) this.f57955x83b7296f).m108806xb80cf445(c27017x4f962880Arr);
        return this;
    }
}
