package com.p314xaae8f345.p3206x37e841;

/* renamed from: com.tencent.wxmm.v2service */
/* loaded from: classes13.dex */
public class C27809x17c9b4b9 {
    private static final java.lang.String TAG = "WXMM.Voip";

    /* renamed from: _hellAccFlag_ */
    private byte f61081x7f11beae;

    /* renamed from: mUiCallBack */
    private com.p314xaae8f345.p3206x37e841.InterfaceC27803x31cbd90e f61091x4b5c2b66 = null;

    /* renamed from: defaultWidth */
    public int f61084xd8c82805 = 704;

    /* renamed from: defaultHeight */
    public int f61083x266ddec8 = 544;

    /* renamed from: remoteImgBuffer */
    public byte[] f61092x1ee7103d = null;

    /* renamed from: callbackOutData */
    public byte[] f61082xa5474c13 = null;

    /* renamed from: field_remoteImgLength */
    public int f61086x7eac799e = 0;

    /* renamed from: field_remoteImgHeight */
    public int f61085x77d6cfdf = 0;

    /* renamed from: field_remoteImgWidth */
    public int f61087x3e81380e = 0;

    /* renamed from: field_remoteScreenImgLength */
    public int f61089x1108aed2 = 0;

    /* renamed from: field_remoteScreenImgWidth */
    public int f61090x19ef8c5a = 0;

    /* renamed from: field_remoteScreenImgHeight */
    public int f61088xa330513 = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("c++_shared");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("marsbridgexlog");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("marsbridgenetwork");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("voipService");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: Init */
    private native int m120059x22d930(byte[] bArr, int i17);

    /* renamed from: UnInit */
    private native int m120060x973cdf69();

    /* renamed from: Accept */
    public native int m120061x748ca128(int i17);

    public native int Ack();

    /* renamed from: ByteArrayCallbackFromVoipSDK */
    public byte[] m120062xd5c5301a(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27803x31cbd90e interfaceC27803x31cbd90e = this.f61091x4b5c2b66;
        if (interfaceC27803x31cbd90e != null) {
            return interfaceC27803x31cbd90e.m119973x6f12c223(i17, i18, bArr);
        }
        return null;
    }

    /* renamed from: Hangup */
    public native int m120063x806766ad(int i17);

    /* renamed from: InitSDK */
    public int m120064xd75998ea(byte[] bArr, int i17, com.p314xaae8f345.p3206x37e841.InterfaceC27803x31cbd90e interfaceC27803x31cbd90e) {
        this.f61091x4b5c2b66 = interfaceC27803x31cbd90e;
        this.f61092x1ee7103d = new byte[((this.f61084xd8c82805 * this.f61083x266ddec8) * 3) / 2];
        int m120059x22d930 = m120059x22d930(bArr, i17);
        com.p314xaae8f345.p3206x37e841.C27807xedfc512a.m120042x2439c0(TAG, "protocal init ret :" + m120059x22d930 + " " + i17);
        return m120059x22d930;
    }

    /* renamed from: IntCallbackFromVoipSDK */
    public int m120065x36bd319c(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27803x31cbd90e interfaceC27803x31cbd90e = this.f61091x4b5c2b66;
        if (interfaceC27803x31cbd90e == null) {
            return 0;
        }
        interfaceC27803x31cbd90e.m119972x6f12c222(i17, i18, bArr);
        return 0;
    }

    /* renamed from: Invite */
    public native int m120066x82d71b29(int i17, byte[] bArr, int i18, int i19);

    /* renamed from: OnNetworkChange */
    public native int m120067xa3321bbf(int i17);

    /* renamed from: RecvNotify */
    public native int m120068xd82634ef(byte[] bArr, int i17, int i18);

    /* renamed from: SwitchAVCmd */
    public native int m120069xe0a069f1(int i17);

    /* renamed from: UninitSDK */
    public int m120070x519b2431() {
        this.f61091x4b5c2b66 = null;
        m120060x973cdf69();
        return 0;
    }

    /* renamed from: UpdateAuthKey */
    public native int m120071xafeb526e(byte[] bArr, int i17);

    /* renamed from: playCallback */
    public native int m120072xcbf69b99(byte[] bArr, int i17);

    /* renamed from: recordCallback */
    public native int m120073xe4580fb6(byte[] bArr, int i17);

    /* renamed from: setAppCmd */
    public int m120074x430a65b(int i17) {
        int m120075x430a65b = m120075x430a65b(i17, new byte[]{0}, 1);
        if (m120075x430a65b < 0) {
            com.p314xaae8f345.p3206x37e841.C27807xedfc512a.m120042x2439c0(TAG, "setAppCmd: type:" + m120075x430a65b + ":ret:" + m120075x430a65b);
        }
        return m120075x430a65b;
    }

    /* renamed from: setAppCmd */
    public native int m120075x430a65b(int i17, byte[] bArr, int i18);

    /* renamed from: videoDecode */
    public native int m120076x23b70a49(byte[] bArr);

    /* renamed from: videoEncodeToSend */
    public native int m120077x2bc4e674(byte[] bArr, int i17, int i18, int i19, int i27);
}
