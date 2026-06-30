package com.p314xaae8f345.p2841xd11c237d.sdt;

/* renamed from: com.tencent.paymars.sdt.MMSdtManager */
/* loaded from: classes12.dex */
public class C23026xdecd87aa extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f40226x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40225x429972cd = 0;

    /* renamed from: com.tencent.paymars.sdt.MMSdtManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: startTraceRoute */
        void mo84452xab70e206(java.lang.String str);
    }

    public C23026xdecd87aa(long j17) {
        m84447x55fd41fe(j17);
    }

    /* renamed from: OnJniCreateMMSdtManagerFromContext */
    public native void m84446x7916dc99(java.lang.Object obj);

    /* renamed from: OnJniCreateMMSdtManagerFromHandle */
    public native void m84447x55fd41fe(long j17);

    /* renamed from: OnJniDestroyMMSdtManager */
    public native void m84448x2260159e();

    /* renamed from: OnJniSetCallback */
    public native void m84449xf6496dc1(java.lang.Object obj);

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40226x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m84450xac79a11b() {
        m84448x2260159e();
        this.f40226x7b5cfd1f = 0L;
        this.f40225x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m84451x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.sdt.C23026xdecd87aa.CallBack callBack) {
        m84449xf6496dc1(callBack);
    }

    public C23026xdecd87aa(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84446x7916dc99(c23011x9befcd8f);
    }
}
