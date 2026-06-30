package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeConsumeSession */
/* loaded from: classes15.dex */
public class C27165x29285dbe extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe.Destructor f59520x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeConsumeSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59521xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59522xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59523xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeConsumeSession */
        public static native void m111504xb4855753(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111504xb4855753(this.f59521xf042a733, this.f59522xb1c7f9d5, this.f59523xc2e4ffd6);
        }
    }

    public C27165x29285dbe(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27166x7e46c9af interfaceC27166x7e46c9af) {
        this.f60636x11bb50fe = "cara.CaraNativeConsumeSession@Attach";
        m111499xa72dc3bf("cara.CaraNativeConsumeSession@Attach", this.f60638xc2e4ffd6, interfaceC27166x7e46c9af);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe m111498xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeConsumeSession */
    private native void m111499xa72dc3bf(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnistayTimeInterval */
    private native float m111500x5208cd50(long j17);

    /* renamed from: jniusername */
    private native java.lang.String m111501x5e7baf7b(long j17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe.Destructor(this, this.f60634xf042a733);
        this.f59520x5751f3f9 = destructor;
        destructor.f59521xf042a733 = this.f60634xf042a733;
        destructor.f59522xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59523xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: stayTimeInterval */
    public float m111502x9d211bab() {
        return m111500x5208cd50(this.f60634xf042a733);
    }

    /* renamed from: username */
    public java.lang.String m111503xf02988d6() {
        return m111501x5e7baf7b(this.f60634xf042a733);
    }

    public C27165x29285dbe(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111499xa72dc3bf(str, str2, null);
    }
}
