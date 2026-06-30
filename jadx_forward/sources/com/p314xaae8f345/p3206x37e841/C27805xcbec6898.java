package com.p314xaae8f345.p3206x37e841;

/* renamed from: com.tencent.wxmm.v2conference */
/* loaded from: classes14.dex */
public class C27805xcbec6898 {
    private static final java.lang.String TAG = "WXMM.Conference";

    /* renamed from: _hellAccFlag_ */
    private byte f60756x7f11beae;

    /* renamed from: mUiConfCallback */
    private com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 f60776xabdefe0a = null;

    /* renamed from: defaultWidth */
    public int f60761xd8c82805 = 640;

    /* renamed from: defaultHeight */
    public int f60760x266ddec8 = 480;

    /* renamed from: maxMemberSize */
    public int f60777x6a2e163f = 100;

    /* renamed from: remoteImgBuffer */
    public byte[] f60778x1ee7103d = null;

    /* renamed from: field_remoteImgLength */
    public int f60768x7eac799e = 0;

    /* renamed from: field_remoteImgHeight */
    public int f60767x77d6cfdf = 0;

    /* renamed from: field_remoteImgWidth */
    public int f60770x3e81380e = 0;

    /* renamed from: field_remoteImgMember */
    public int f60769x8060c952 = -1;

    /* renamed from: field_remoteImgFormat */
    public int f60766x74fe36af = 0;

    /* renamed from: field_remoteScreenImgLength */
    public int f60773x1108aed2 = 0;

    /* renamed from: field_remoteScreenImgHeight */
    public int f60772xa330513 = 0;

    /* renamed from: field_remoteScreenImgWidth */
    public int f60775x19ef8c5a = 0;

    /* renamed from: field_remoteScreenImgMember */
    public int f60774x12bcfe86 = -1;

    /* renamed from: field_remoteScreenImgFormat */
    public int f60771x75a6be3 = 0;

    /* renamed from: field_HWEncW */
    public int f60763xc59b1f51 = 0;

    /* renamed from: field_HWEncH */
    public int f60762xc59b1f42 = 0;

    /* renamed from: field_localImgWidth */
    public int f60765xf9b6e5c9 = 0;

    /* renamed from: field_localImgHeight */
    public int f60764x2356d984 = 0;

    /* renamed from: audioSampleRate */
    public int[] f60759xa80e7620 = {8000};

    /* renamed from: audioFrameLen */
    public int[] f60758x2ac5375e = {20};

    /* renamed from: audioChannels */
    public int[] f60757xe235edc6 = {1};

    /* renamed from: videoBuffer */
    public java.nio.ByteBuffer f60779x21300c9b = null;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("c++_shared");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("ilink2");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("confService");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: GetVideoData */
    private native int m119975x58a4882f(byte[] bArr, int i17);

    /* renamed from: Accept */
    public native int m119976x748ca128(int i17);

    public native int Ack();

    public native int Add(byte[] bArr, int i17);

    /* renamed from: CallbackFromConferenceSDK */
    public byte[] m119977x8195640f(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292 = this.f60776xabdefe0a;
        if (interfaceC27802x9a5f7292 != null) {
            return interfaceC27802x9a5f7292.mo54532xc17c1973(i17, i18, bArr);
        }
        return null;
    }

    /* renamed from: CallbackOnVideoFrameFromSDK */
    public void m119978x5a3ea55a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292 = this.f60776xabdefe0a;
        if (interfaceC27802x9a5f7292 != null) {
            interfaceC27802x9a5f7292.mo54533xc7ba63d7(i17, this.f60779x21300c9b, i18, i19, i27);
        }
    }

    /* renamed from: CallbackWriteLogFromSDK */
    public void m119979x2447f666(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292 = this.f60776xabdefe0a;
        if (interfaceC27802x9a5f7292 != null) {
            interfaceC27802x9a5f7292.mo54534x93d9424a(i17, str, str2, i18, str3, str4, i19);
        }
    }

    /* renamed from: ExitRoom */
    public native int m119980x85535339(int i17);

    /* renamed from: GetAllActiveMembers */
    public int m119981xbed46268(int[] iArr, int i17) {
        if (iArr == null || i17 <= 0) {
            return -1;
        }
        return m119990x90b18796(iArr, i17);
    }

    /* renamed from: GetAudioData */
    public native int m119982x1468ea0a(byte[] bArr, int i17);

    /* renamed from: GetAudioDataToCustom */
    public native int m119983x33d21f6(byte[] bArr, int i17);

    /* renamed from: GetAudioDataToPlayInLiveMode */
    public native int m119984xdfa5bccd(byte[] bArr, int i17);

    /* renamed from: GetAudioDeviceFmt */
    public int m119985xe843cff7(com.p314xaae8f345.p3206x37e841.C27801x171f9fd3 c27801x171f9fd3) {
        int m119986xa204da57 = m119986xa204da57(this.f60759xa80e7620, this.f60758x2ac5375e, this.f60757xe235edc6);
        c27801x171f9fd3.f60746xea63b30 = this.f60757xe235edc6[0];
        c27801x171f9fd3.f60747x5735fc16 = this.f60758x2ac5375e[0];
        c27801x171f9fd3.f60749x79ac8898 = this.f60759xa80e7620[0];
        return m119986xa204da57;
    }

    /* renamed from: GetAudioFormat */
    public native int m119986xa204da57(int[] iArr, int[] iArr2, int[] iArr3);

    /* renamed from: GetConfRecordAudioData */
    public native int m119987x895e0875(byte[] bArr, int i17);

    /* renamed from: GetDecodeVideoData */
    public int m119988x6c3b2a61(byte[] bArr, int i17) {
        return m119975x58a4882f(bArr, i17);
    }

    /* renamed from: GetDirectByteBuffer */
    public java.nio.ByteBuffer m119989x81b49387(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f60779x21300c9b;
        if (byteBuffer == null) {
            this.f60779x21300c9b = java.nio.ByteBuffer.allocateDirect(i17);
        } else if (byteBuffer.capacity() < i17) {
            this.f60779x21300c9b = java.nio.ByteBuffer.allocateDirect(i17);
        }
        return this.f60779x21300c9b;
    }

    /* renamed from: GetVADMembers */
    public native int m119990x90b18796(int[] iArr, int i17);

    /* renamed from: GetVoiceActivity */
    public native int m119991x7be9e6cb(int i17);

    /* renamed from: Hangup */
    public native int m119992x806766ad(int i17);

    /* renamed from: ImageConvert */
    public native int m119993x662c33f8(com.p314xaae8f345.p3206x37e841.C27804x1ffbbde1 c27804x1ffbbde1, com.p314xaae8f345.p3206x37e841.C27804x1ffbbde1 c27804x1ffbbde12, byte[] bArr, byte[] bArr2);

    /* renamed from: Init */
    public native int m119994x22d930(byte[] bArr, int i17);

    /* renamed from: InitSDK */
    public int m119995xd75998ea(byte[] bArr, int i17, com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292) {
        this.f60776xabdefe0a = interfaceC27802x9a5f7292;
        this.f60778x1ee7103d = new byte[((this.f60761xd8c82805 * this.f60760x266ddec8) * 3) / 2];
        return m119994x22d930(bArr, i17);
    }

    /* renamed from: Invite */
    public native int m119996x82d71b29(byte[] bArr, int i17);

    /* renamed from: JoinRoom */
    public native int m119997xb04c9145(byte[] bArr, int i17);

    /* renamed from: OnNetworkChange */
    public native int m119998xa3321bbf(int i17, byte[] bArr);

    /* renamed from: PutExternalplayAudioData */
    public native int m119999x7fe50232(byte[] bArr, int i17, int i18, int i19, int i27);

    /* renamed from: PutProcessedAudioDataToEncodeInLiveMode */
    public native int m120000x5b3a1066(byte[] bArr, int i17);

    /* renamed from: RecvNotify */
    public native int m120001xd82634ef(byte[] bArr, int i17, int i18);

    /* renamed from: SendAudioData */
    public native int m120002x47289dd8(byte[] bArr, int i17, int i18);

    /* renamed from: SendAudioDataFromCustom */
    public native int m120003x33f2b3b3(byte[] bArr, int i17);

    /* renamed from: SendCmdMsg */
    public native int m120004x78033daf(byte[] bArr, int i17);

    /* renamed from: SendVideoData */
    public native int m120005x8b643bfd(byte[] bArr, int i17, int i18, int i19, int i27);

    /* renamed from: SetAppCmd */
    public native int m120006x7ba2c63b(int i17, byte[] bArr, int i18);

    /* renamed from: SetAudioDevFormat */
    public native int m120007x75302e18(int i17, int i18, int i19, int i27, int i28);

    /* renamed from: SetAudioPlayStatus */
    public native int m120008x86da5c1a(int i17, int i18);

    /* renamed from: SetUICallback */
    public void m120009x32af14bb(com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292) {
        this.f60776xabdefe0a = interfaceC27802x9a5f7292;
    }

    /* renamed from: StartPublish */
    public native int m120010xf3c0726d(byte[] bArr, int i17);

    /* renamed from: StopPublish */
    public native int m120011x8ce2e8d();

    /* renamed from: SubscribeVideo */
    public native int m120012x1d2cd171(byte[] bArr, int i17);

    /* renamed from: SwitchAV */
    public native int m120013xfec52689(int i17, int i18, int i19);

    /* renamed from: SwitchAudio */
    public native int m120014xe0aefce2(int i17);

    /* renamed from: SwitchVideo */
    public native int m120015xe1d17587(int i17);

    /* renamed from: UnInit */
    public native int m120016x973cdf69();

    /* renamed from: UninitSDK */
    public int m120017x519b2431() {
        this.f60776xabdefe0a = null;
        m120016x973cdf69();
        return 0;
    }

    /* renamed from: UpdateAuthKey */
    public native int m120018xafeb526e(byte[] bArr, int i17);

    /* renamed from: imgClip */
    public native int m120019x723a15b3(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, int i28, int i29);

    /* renamed from: sendResponse */
    public native int m120020x4e33fe9(byte[] bArr, int i17, int i18, int i19);

    /* renamed from: videoHWProcess */
    public native int m120021xecfaf445(byte[] bArr, int i17, int i18, int i19, int i27, byte[] bArr2, int i28, int i29);

    /* renamed from: videoTrans */
    public native int m120022x9ef582ed(byte[] bArr, int i17, int i18, int i19, int i27, int[] iArr);
}
