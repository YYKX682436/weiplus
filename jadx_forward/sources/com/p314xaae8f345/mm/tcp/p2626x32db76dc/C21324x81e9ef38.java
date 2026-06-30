package com.p314xaae8f345.mm.tcp.p2626x32db76dc;

/* renamed from: com.tencent.mm.tcp.libmmtcp.TcpNative */
/* loaded from: classes7.dex */
public class C21324x81e9ef38 {

    /* renamed from: INIT_ERROR */
    public static int f39232x769b8df9 = -1002;

    /* renamed from: NEW_TCP_ERROR */
    public static int f39233x42c33eb = -1000;

    /* renamed from: REPEAT_INIT_ERROR */
    public static int f39234x651b431d = -1001;

    /* renamed from: SEND_BUFFER_ERROR */
    public static int f39235x2fcdb480 = -1003;
    public static java.lang.String TAG = "TcpNative";

    /* renamed from: initCallBackFlag */
    private boolean f39236x64b1eea1 = false;

    /* renamed from: mNativeInst */
    volatile long f39237x95333f4a;

    /* renamed from: com.tencent.mm.tcp.libmmtcp.TcpNative$NativeCallBackInterface */
    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {
        /* renamed from: onCallBack */
        void mo78210x9ac7b764(long j17, java.lang.String str);
    }

    public C21324x81e9ef38(long j17, long j18, long j19) {
        this.f39237x95333f4a = 0L;
        this.f39237x95333f4a = m78196x90de7c4c(j17, j18, j19);
    }

    /* renamed from: destoryBindingTcp */
    private native void m78195x40177750(long j17);

    /* renamed from: initBindingTcp */
    private native long m78196x90de7c4c(long j17, long j18, long j19);

    /* renamed from: initCallBack */
    private native int m78197x7ccb4d95(long j17, com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface nativeCallBackInterface);

    /* renamed from: serviceReceive */
    private native void m78198xc7013e6e(java.lang.String str, int i17, java.lang.String str2);

    /* renamed from: testBindingTcp */
    private native void m78199x2fbb614e(long j17);

    /* renamed from: testBindingTcp2 */
    private native void m78200xc7b0c8a4(long j17);

    /* renamed from: testBindingTcpServer */
    private native void m78201x257bca31(long j17);

    /* renamed from: updateNativeInterface */
    private native void m78202x3efb1ad9(long j17, long j18);

    /* renamed from: destoryTcp */
    public void m78203x5212aa2d() {
        if (this.f39237x95333f4a != -1 && this.f39236x64b1eea1) {
            this.f39236x64b1eea1 = false;
            m78195x40177750(this.f39237x95333f4a);
            this.f39237x95333f4a = -1L;
        }
    }

    /* renamed from: setCallBack */
    public int m78204x6c4032e7(final com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface nativeCallBackInterface) {
        if (this.f39237x95333f4a == -1) {
            return f39233x42c33eb;
        }
        if (this.f39236x64b1eea1) {
            return f39234x651b431d;
        }
        int m78197x7ccb4d95 = m78197x7ccb4d95(this.f39237x95333f4a, new com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface(this) { // from class: com.tencent.mm.tcp.libmmtcp.TcpNative.1
            @Override // com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface
            /* renamed from: onCallBack */
            public void mo78210x9ac7b764(long j17, java.lang.String str) {
                nativeCallBackInterface.mo78210x9ac7b764(j17, str);
            }
        });
        if (m78197x7ccb4d95 != 0) {
            return f39232x769b8df9;
        }
        this.f39236x64b1eea1 = true;
        return m78197x7ccb4d95;
    }

    /* renamed from: testBind */
    public void m78205xbb9d43ef() {
        if (this.f39237x95333f4a == -1) {
            return;
        }
        m78199x2fbb614e(this.f39237x95333f4a);
    }

    /* renamed from: testBind2 */
    public void m78206xb80b3a23() {
        if (this.f39237x95333f4a == -1) {
            return;
        }
        m78199x2fbb614e(this.f39237x95333f4a);
    }

    /* renamed from: testBindServer */
    public void m78207x9b77012() {
        if (this.f39237x95333f4a == -1) {
            return;
        }
        m78201x257bca31(this.f39237x95333f4a);
    }

    /* renamed from: testServiceReceive */
    public void m78208x7c59e7a0(java.lang.String str, int i17, java.lang.String str2) {
        if (this.f39237x95333f4a == -1) {
            return;
        }
        m78198xc7013e6e(str, i17, str2);
    }

    /* renamed from: update */
    public void m78209xce0038c9(long j17) {
        if (this.f39237x95333f4a == -1) {
            return;
        }
        m78202x3efb1ad9(this.f39237x95333f4a, j17);
    }
}
