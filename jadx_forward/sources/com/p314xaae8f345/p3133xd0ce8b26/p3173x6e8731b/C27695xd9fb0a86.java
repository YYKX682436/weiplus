package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ZidlObjHolder2 */
/* loaded from: classes15.dex */
public class C27695xd9fb0a86 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86.Destructor f60642x5751f3f9;

    /* renamed from: identity */
    private java.lang.String f60643xf7e870be;

    /* renamed from: manager */
    private long f60644x31c90fad;

    /* renamed from: name */
    private java.lang.String f60645x337a8b;

    /* renamed from: com.tencent.wechat.zidl2.ZidlObjHolder2$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: refCntManager */
        long f60646xde38a6f7;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.f60646xde38a6f7 = j17;
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119598x1b65b0a2(this.f60646xde38a6f7);
        }
    }

    public C27695xd9fb0a86() {
        this.f60645x337a8b = "";
        this.f60643xf7e870be = "";
        this.f60644x31c90fad = 0L;
    }

    /* renamed from: getIdentity */
    public java.lang.String m119554x73c2ae34() {
        return this.f60643xf7e870be;
    }

    /* renamed from: getManager */
    public long m119555x6f964b77() {
        return this.f60644x31c90fad;
    }

    /* renamed from: getName */
    public java.lang.String m119556xfb82e301() {
        return this.f60645x337a8b;
    }

    /* renamed from: setIdentity */
    public void m119557x6e7b0f40(java.lang.String str) {
        this.f60643xf7e870be = str;
    }

    /* renamed from: setManager */
    public void m119558xe30798eb(long j17) {
        this.f60644x31c90fad = j17;
    }

    /* renamed from: setName */
    public void m119559x764daa0d(java.lang.String str) {
        this.f60645x337a8b = str;
    }

    public C27695xd9fb0a86(java.lang.String str, java.lang.String str2, long j17) {
        this.f60645x337a8b = str;
        this.f60643xf7e870be = str2;
        this.f60644x31c90fad = j17;
        if (j17 != 0) {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119597x2e207037(j17);
            this.f60642x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86.Destructor(this, this.f60644x31c90fad);
        }
    }
}
