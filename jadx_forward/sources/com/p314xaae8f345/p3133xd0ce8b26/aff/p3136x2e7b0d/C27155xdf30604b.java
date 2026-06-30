package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter */
/* loaded from: classes15.dex */
public class C27155xdf30604b extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27155xdf30604b.Destructor f59285x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59286xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59287xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59288xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppSessionFeatureCenter */
        public static native void m111228xb7c88296(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111228xb7c88296(this.f59286xf042a733, this.f59287xb1c7f9d5, this.f59288xc2e4ffd6);
        }
    }

    public C27155xdf30604b(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111223x1569aeaa(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27155xdf30604b m111222xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27155xdf30604b(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppSessionFeatureCenter */
    private native void m111223x1569aeaa(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnireportThatConsumeSession */
    private native void m111224xaeb17d7a(long j17, java.lang.String[] strArr);

    /* renamed from: jnireportThatSend */
    private native void m111225x8a8208(long j17, java.lang.String[] strArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27155xdf30604b.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27155xdf30604b.Destructor(this, this.f60634xf042a733);
        this.f59285x5751f3f9 = destructor;
        destructor.f59286xf042a733 = this.f60634xf042a733;
        destructor.f59287xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59288xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatConsumeSession */
    public void m111226xefef40d5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27165x29285dbe c27165x29285dbe) {
        m111224xaeb17d7a(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27165x29285dbe));
    }

    /* renamed from: reportThatSend */
    public void m111227xd288ab23(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc c27168x5cc685dc) {
        m111225x8a8208(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27168x5cc685dc));
    }

    public C27155xdf30604b() {
        this.f60636x11bb50fe = "cara.CaraCppSessionFeatureCenter@Create";
        m111223x1569aeaa("cara.CaraCppSessionFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
