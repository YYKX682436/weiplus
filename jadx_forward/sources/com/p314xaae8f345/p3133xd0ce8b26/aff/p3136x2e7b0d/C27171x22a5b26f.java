package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter */
/* loaded from: classes15.dex */
public class C27171x22a5b26f extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27171x22a5b26f.Destructor f59530x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59531xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59532xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59533xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeContactFeatureCenter */
        public static native void m111540x72a46844(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111540x72a46844(this.f59531xf042a733, this.f59532xb1c7f9d5, this.f59533xc2e4ffd6);
        }
    }

    public C27171x22a5b26f(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111537x396cd3b0(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27171x22a5b26f m111536xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27171x22a5b26f(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeContactFeatureCenter */
    private native void m111537x396cd3b0(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnigetContactByUsername */
    private native java.lang.String[] m111538xccece8fc(long j17, java.lang.String str);

    /* renamed from: getContactByUsername */
    public java.util.Optional<com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc> m111539x1c3091d7(java.lang.String str) {
        return com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119602x716070d5(m111538xccece8fc(this.f60634xf042a733, str), new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27172xf0580f12());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27171x22a5b26f.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27171x22a5b26f.Destructor(this, this.f60634xf042a733);
        this.f59530x5751f3f9 = destructor;
        destructor.f59531xf042a733 = this.f60634xf042a733;
        destructor.f59532xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59533xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27171x22a5b26f() {
        this.f60636x11bb50fe = "cara.CaraNativeContactFeatureCenter@Create";
        m111537x396cd3b0("cara.CaraNativeContactFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
