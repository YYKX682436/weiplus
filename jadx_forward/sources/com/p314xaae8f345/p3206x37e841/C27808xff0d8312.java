package com.p314xaae8f345.p3206x37e841;

/* renamed from: com.tencent.wxmm.v2render */
/* loaded from: classes.dex */
public class C27808xff0d8312 {

    /* renamed from: _hellAccFlag_ */
    private byte f61077x7f11beae;

    /* renamed from: mBrightness */
    public float f61078x2d4249e = 1.2f;

    /* renamed from: mContrast */
    public float f61079x332ba8f = 1.93f;

    /* renamed from: mSaturation */
    public float f61080xce74f41f = 1.05f;

    /* renamed from: MSG_RENDER */
    public final int f61073x8d08a834 = 0;

    /* renamed from: MSG_FLUSH */
    public final int f61072x988c0486 = 1;

    /* renamed from: MSG_RESET */
    public final int f61074x9931e6d1 = 2;

    /* renamed from: FLAG_RGBA */
    public final int f61068x4e8dde27 = 0;

    /* renamed from: FLAG_RGBAClip */
    public final int f61069x7ab48a17 = 1;

    /* renamed from: FLAG_YV12 */
    public final int f61070x4e9142f1 = 0;

    /* renamed from: FLAG_YV12Edge */
    public final int f61071x4d85444e = 1;

    /* renamed from: FLAG_NV12 */
    public final int f61066x4e8c42dc = 2;

    /* renamed from: FLAG_NV21 */
    public final int f61067x4e8c42fa = 3;

    /* renamed from: FLAG_Angle90 */
    public final int f61064x30b0a137 = 4;

    /* renamed from: FLAG_Angle270 */
    public final int f61063xe5636c6b = 12;

    /* renamed from: FLAG_Mirror */
    public final int f61065xdbfc6c12 = 16;

    /* renamed from: RenderLocal */
    public final int f61075x158e355 = 0;

    /* renamed from: RenderRemote */
    public final int f61076x3378719c = 1;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipGLRender");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: getGLVersion */
    public static int m120051xf5fd219d() {
        return 2;
    }

    /* renamed from: Init */
    public native void m120052x22d930(int i17, java.lang.Object obj, int i18);

    /* renamed from: Uninit */
    public native void m120053x974b6b49(int i17);

    /* renamed from: render32 */
    public native void m120054xe2813a75(int[] iArr, int i17, int i18, int i19, int i27);

    /* renamed from: render8 */
    public native void m120055x411cf162(byte[] bArr, int i17, int i18, int i19, int i27);

    /* renamed from: setMode */
    public native void m120056x764d6925(int i17, int i18, int i19, int i27);

    /* renamed from: setParam */
    public native void m120057x5383d94b(float f17, float f18, float f19, int i17);
}
