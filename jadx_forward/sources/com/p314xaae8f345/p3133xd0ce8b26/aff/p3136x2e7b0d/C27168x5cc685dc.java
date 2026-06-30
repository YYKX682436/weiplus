package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeContact */
/* loaded from: classes15.dex */
public class C27168x5cc685dc extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc.Destructor f59525x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeContact$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59526xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59527xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59528xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeContact */
        public static native void m111527xb0cbf9e7(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111527xb0cbf9e7(this.f59526xf042a733, this.f59527xb1c7f9d5, this.f59528xc2e4ffd6);
        }
    }

    public C27168x5cc685dc(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27169xe837b2cd interfaceC27169xe837b2cd) {
        this.f60636x11bb50fe = "cara.CaraNativeContact@Attach";
        m111510x181d6efb("cara.CaraNativeContact@Attach", this.f60638xc2e4ffd6, interfaceC27169xe837b2cd);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc m111509xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeContact */
    private native void m111510x181d6efb(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnigetDisplayName */
    private native java.lang.String m111511x6e03f41c(long j17);

    /* renamed from: jniisGroup */
    private native boolean m111512xf1f59430(long j17);

    /* renamed from: jniisMinimized */
    private native boolean m111513xa106eab7(long j17);

    /* renamed from: jniisMute */
    private native boolean m111514x732bba48(long j17);

    /* renamed from: jniisOpenIM */
    private native boolean m111515x5a42dd5d(long j17);

    /* renamed from: jniisPrivate */
    private native boolean m111516x26a51af4(long j17);

    /* renamed from: jniisSessionStickyOnTop */
    private native boolean m111517x9600d806(long j17);

    /* renamed from: jniusername */
    private native java.lang.String m111518x5e7baf7b(long j17);

    /* renamed from: getDisplayName */
    public java.lang.String m111519x40021d37() {
        return m111511x6e03f41c(this.f60634xf042a733);
    }

    /* renamed from: isGroup */
    public boolean m111520x7ac9a375() {
        return m111512xf1f59430(this.f60634xf042a733);
    }

    /* renamed from: isMinimized */
    public boolean m111521x7707cf7c() {
        return m111513xa106eab7(this.f60634xf042a733);
    }

    /* renamed from: isMute */
    public boolean m111522xb9a62e63() {
        return m111514x732bba48(this.f60634xf042a733);
    }

    /* renamed from: isOpenIM */
    public boolean m111523xebf0b6b8() {
        return m111515x5a42dd5d(this.f60634xf042a733);
    }

    /* renamed from: isPrivate */
    public boolean m111524xcab26cf9() {
        return m111516x26a51af4(this.f60634xf042a733);
    }

    /* renamed from: isSessionStickyOnTop */
    public boolean m111525xe54480e1() {
        return m111517x9600d806(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc.Destructor(this, this.f60634xf042a733);
        this.f59525x5751f3f9 = destructor;
        destructor.f59526xf042a733 = this.f60634xf042a733;
        destructor.f59527xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59528xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: username */
    public java.lang.String m111526xf02988d6() {
        return m111518x5e7baf7b(this.f60634xf042a733);
    }

    public C27168x5cc685dc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111510x181d6efb(str, str2, null);
    }
}
