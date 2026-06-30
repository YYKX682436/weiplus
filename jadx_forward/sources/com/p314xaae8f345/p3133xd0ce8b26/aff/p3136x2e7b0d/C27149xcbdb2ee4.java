package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet */
/* loaded from: classes15.dex */
public class C27149xcbdb2ee4 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27149xcbdb2ee4.Destructor f59261x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59262xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59263xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59264xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppConsumeSessionProphet */
        public static native void m111162x64755f9(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111162x64755f9(this.f59262xf042a733, this.f59263xb1c7f9d5, this.f59264xc2e4ffd6);
        }
    }

    public C27149xcbdb2ee4(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111157x5ccbac65(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27149xcbdb2ee4 m111156xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27149xcbdb2ee4(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppConsumeSessionProphet */
    private native void m111157x5ccbac65(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnireportThatConsumeSession */
    private native void m111158xaeb17d7a(long j17, java.lang.String[] strArr);

    /* renamed from: jnireportThatLoadSessions */
    private native void m111159xc3fee623(long j17, java.lang.String[] strArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27149xcbdb2ee4.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27149xcbdb2ee4.Destructor(this, this.f60634xf042a733);
        this.f59261x5751f3f9 = destructor;
        destructor.f59262xf042a733 = this.f60634xf042a733;
        destructor.f59263xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59264xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatConsumeSession */
    public void m111160xefef40d5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe c27165x29285dbe) {
        m111158xaeb17d7a(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27165x29285dbe));
    }

    /* renamed from: reportThatLoadSessions */
    public void m111161x50fbc43e(java.util.ArrayList<java.lang.String> arrayList) {
        m111159xc3fee623(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119648xde64254f(arrayList));
    }

    public C27149xcbdb2ee4() {
        this.f60636x11bb50fe = "cara.CaraCppConsumeSessionProphet@Create";
        m111157x5ccbac65("cara.CaraCppConsumeSessionProphet@Create", this.f60638xc2e4ffd6, null);
    }
}
