package com.p314xaae8f345.mm.udp.p2634x32db7abc;

/* renamed from: com.tencent.mm.udp.libmmudp.UdpNative */
/* loaded from: classes7.dex */
public class C21331x7e0f8b18 {

    /* renamed from: INIT_ERROR */
    public static int f39240x769b8df9 = -1002;

    /* renamed from: NEW_UDP_ERROR */
    public static int f39241x51cfcb = -1000;

    /* renamed from: REPEAT_INIT_ERROR */
    public static int f39242x651b431d = -1001;

    /* renamed from: SEND_BUFFER_ERROR */
    public static int f39243x2fcdb480 = -1003;
    public static java.lang.String TAG = "UdpNative";

    /* renamed from: initCallBackFlag */
    private boolean f39244x64b1eea1 = false;

    /* renamed from: mNativeInst */
    volatile long f39245x95333f4a;

    /* renamed from: com.tencent.mm.udp.libmmudp.UdpNative$NativeCallBackInterface */
    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {
        /* renamed from: onCallBack */
        void mo78290x9ac7b764(long j17, java.lang.String str);
    }

    public C21331x7e0f8b18(long j17, long j18, long j19) {
        this.f39245x95333f4a = 0L;
        this.f39245x95333f4a = m78276x90de802c(j17, j18, j19);
    }

    /* renamed from: destoryBindingUdp */
    private native void m78275x40177b30(long j17);

    /* renamed from: initBindingUdp */
    private native long m78276x90de802c(long j17, long j18, long j19);

    /* renamed from: initCallBack */
    private native int m78277x7ccb4d95(long j17, com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface nativeCallBackInterface);

    /* renamed from: serviceReceive */
    private native void m78278xc7013e6e(java.lang.String str, int i17, java.lang.String str2);

    /* renamed from: testBindingUdp */
    private native void m78279x2fbb652e(long j17);

    /* renamed from: testBindingUdp2 */
    private native void m78280xc7b140c4(long j17);

    /* renamed from: testBindingUdp3 */
    private native void m78281xc7b140c5(long j17);

    /* renamed from: updateNativeInterface */
    private native void m78282x3efb1ad9(long j17, long j18);

    /* renamed from: destoryUdp */
    public void m78283x5212ae0d() {
        if (this.f39245x95333f4a != -1 && this.f39244x64b1eea1) {
            this.f39244x64b1eea1 = false;
            m78275x40177b30(this.f39245x95333f4a);
            this.f39245x95333f4a = -1L;
        }
    }

    /* renamed from: setCallBack */
    public int m78284x6c4032e7(final com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface nativeCallBackInterface) {
        if (this.f39245x95333f4a == -1) {
            return f39241x51cfcb;
        }
        if (this.f39244x64b1eea1) {
            return f39242x651b431d;
        }
        int m78277x7ccb4d95 = m78277x7ccb4d95(this.f39245x95333f4a, new com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface(this) { // from class: com.tencent.mm.udp.libmmudp.UdpNative.1
            @Override // com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface
            /* renamed from: onCallBack */
            public void mo78290x9ac7b764(long j17, java.lang.String str) {
                nativeCallBackInterface.mo78290x9ac7b764(j17, str);
            }
        });
        if (m78277x7ccb4d95 != 0) {
            return f39240x769b8df9;
        }
        this.f39244x64b1eea1 = true;
        return m78277x7ccb4d95;
    }

    /* renamed from: testBind */
    public void m78285xbb9d43ef() {
        if (this.f39245x95333f4a == -1) {
            return;
        }
        m78279x2fbb652e(this.f39245x95333f4a);
    }

    /* renamed from: testBind2 */
    public void m78286xb80b3a23() {
        if (this.f39245x95333f4a == -1) {
            return;
        }
        m78280xc7b140c4(this.f39245x95333f4a);
    }

    /* renamed from: testBind3 */
    public void m78287xb80b3a24() {
        if (this.f39245x95333f4a == -1) {
            return;
        }
        m78281xc7b140c5(this.f39245x95333f4a);
    }

    /* renamed from: testServiceReceive */
    public void m78288x7c59e7a0(java.lang.String str, int i17, java.lang.String str2) {
        if (this.f39245x95333f4a == -1) {
            return;
        }
        m78278xc7013e6e(str, i17, str2);
    }

    /* renamed from: update */
    public void m78289xce0038c9(long j17) {
        if (this.f39245x95333f4a == -1) {
            return;
        }
        m78282x3efb1ad9(this.f39245x95333f4a, j17);
    }
}
