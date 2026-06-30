package com.p314xaae8f345.p542x3306d5.sdt;

/* renamed from: com.tencent.mars.sdt.MMSdtManager */
/* loaded from: classes12.dex */
public class C4577xdecd87aa extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f19522x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19521x429972cd = 0;

    /* renamed from: com.tencent.mars.sdt.MMSdtManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: startTraceRoute */
        void mo658xab70e206(java.lang.String str);
    }

    public C4577xdecd87aa(long j17) {
        m40307x55fd41fe(j17);
    }

    /* renamed from: OnJniCreateMMSdtManagerFromContext */
    public native void m40306x7916dc99(java.lang.Object obj);

    /* renamed from: OnJniCreateMMSdtManagerFromHandle */
    public native void m40307x55fd41fe(long j17);

    /* renamed from: OnJniDestroyMMSdtManager */
    public native void m40308x2260159e();

    /* renamed from: OnJniSetCallback */
    public native void m40309xf6496dc1(java.lang.Object obj);

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19522x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m40310xac79a11b() {
        m40308x2260159e();
        this.f19522x7b5cfd1f = 0L;
        this.f19521x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m40311x6c4ebec7(com.p314xaae8f345.p542x3306d5.sdt.C4577xdecd87aa.CallBack callBack) {
        m40309xf6496dc1(callBack);
    }

    public C4577xdecd87aa(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40306x7916dc99(c4443x9befcd8f);
    }
}
