package com.p314xaae8f345.p542x3306d5.sdt;

/* renamed from: com.tencent.mars.sdt.SdtManager */
/* loaded from: classes12.dex */
public class C4579xc595060a extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f19524x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19523x429972cd = 0;

    /* renamed from: com.tencent.mars.sdt.SdtManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: reportSignalDetectResults */
        void mo697xf3b03037(java.lang.String str);
    }

    public C4579xc595060a(long j17) {
        m40313x1b0170de(j17);
    }

    /* renamed from: OnJniCreateSdtManagerFromContext */
    public native void m40312x549889b9(java.lang.Object obj);

    /* renamed from: OnJniCreateSdtManagerFromHandle */
    public native void m40313x1b0170de(long j17);

    /* renamed from: OnJniDestroySdtManager */
    public native void m40314xb49a80fe();

    /* renamed from: OnJniGetLoadLibraries */
    public native java.util.ArrayList<java.lang.String> m40315x6a0689e3();

    /* renamed from: OnJniSetCallback */
    public native void m40316xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetHttpNetCheckCGI */
    public native void m40317x5a3d0c76(java.lang.String str);

    /* renamed from: getLoadLibraries */
    public java.util.ArrayList<java.lang.String> m40318x31e8ec9d() {
        return m40315x6a0689e3();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19524x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m40319xac79a11b() {
        m40314xb49a80fe();
        this.f19524x7b5cfd1f = 0L;
        this.f19523x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m40320x6c4ebec7(com.p314xaae8f345.p542x3306d5.sdt.C4579xc595060a.CallBack callBack) {
        m40316xf6496dc1(callBack);
    }

    /* renamed from: setHttpNetCheckCGI */
    public void m40321xb311a8b0(java.lang.String str) {
        m40317x5a3d0c76(str);
    }

    public C4579xc595060a(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40312x549889b9(c4443x9befcd8f);
    }
}
