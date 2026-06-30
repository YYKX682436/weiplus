package com.p314xaae8f345.p2841xd11c237d.sdt;

/* renamed from: com.tencent.paymars.sdt.SdtManager */
/* loaded from: classes12.dex */
public class C23028xc595060a extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f40228x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40227x429972cd = 0;

    /* renamed from: com.tencent.paymars.sdt.SdtManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: reportSignalDetectResults */
        void mo84463xf3b03037(java.lang.String str);
    }

    public C23028xc595060a(long j17) {
        m84454x1b0170de(j17);
    }

    /* renamed from: OnJniCreateSdtManagerFromContext */
    public native void m84453x549889b9(java.lang.Object obj);

    /* renamed from: OnJniCreateSdtManagerFromHandle */
    public native void m84454x1b0170de(long j17);

    /* renamed from: OnJniDestroySdtManager */
    public native void m84455xb49a80fe();

    /* renamed from: OnJniGetLoadLibraries */
    public native java.util.ArrayList<java.lang.String> m84456x6a0689e3();

    /* renamed from: OnJniSetCallback */
    public native void m84457xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetHttpNetCheckCGI */
    public native void m84458x5a3d0c76(java.lang.String str);

    /* renamed from: getLoadLibraries */
    public java.util.ArrayList<java.lang.String> m84459x31e8ec9d() {
        return m84456x6a0689e3();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40228x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m84460xac79a11b() {
        m84455xb49a80fe();
        this.f40228x7b5cfd1f = 0L;
        this.f40227x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m84461x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.sdt.C23028xc595060a.CallBack callBack) {
        m84457xf6496dc1(callBack);
    }

    /* renamed from: setHttpNetCheckCGI */
    public void m84462xb311a8b0(java.lang.String str) {
        m84458x5a3d0c76(str);
    }

    public C23028xc595060a(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84453x549889b9(c23011x9befcd8f);
    }
}
