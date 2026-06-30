package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPNativeLog */
/* loaded from: classes13.dex */
public class C26319x6d577091 {

    /* renamed from: LEVEL_DEBUG */
    public static final int f52287x34b38998 = 1;

    /* renamed from: LEVEL_ERROR */
    public static final int f52288x34c7c54d = 4;

    /* renamed from: LEVEL_INFO */
    public static final int f52289x2afff0a9 = 2;

    /* renamed from: LEVEL_VERBOSE */
    public static final int f52290x8f00ab87 = 0;

    /* renamed from: LEVEL_WARN */
    public static final int f52291x2b061e81 = 3;
    private static final java.lang.String TAG = "PlayerCore";

    /* renamed from: mLogCallback */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26282x1866f50d f52292x77fb4fc;

    /* renamed from: onPrintLog */
    private static void m101884x5f950056(int i17, byte[] bArr, int i18, byte[] bArr2, int i19) {
        try {
            int i27 = 0;
            java.lang.String str = new java.lang.String(bArr, 0, i18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String str2 = new java.lang.String(bArr2, 0, i19, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            if (i17 == 0) {
                i27 = 4;
            } else if (i17 == 1) {
                i27 = 3;
            } else if (i17 == 2) {
                i27 = 2;
            } else if (i17 == 3) {
                i27 = 1;
            }
            m101886xba7add57(i27, str, str2);
        } catch (java.lang.Exception e17) {
            m101885xba7add57(4, e17.getMessage());
        }
    }

    /* renamed from: printLog */
    public static void m101885xba7add57(int i17, java.lang.String str) {
        m101886xba7add57(i17, TAG, str);
    }

    /* renamed from: printLogDefault */
    public static void m101887xd8d530ea(int i17, java.lang.String str, java.lang.String str2) {
    }

    /* renamed from: setLogCallback */
    public static void m101888xcdae5de7(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26282x1866f50d interfaceC26282x1866f50d) {
        f52292x77fb4fc = interfaceC26282x1866f50d;
    }

    /* renamed from: printLog */
    public static void m101886xba7add57(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26282x1866f50d interfaceC26282x1866f50d = f52292x77fb4fc;
        if (interfaceC26282x1866f50d != null) {
            interfaceC26282x1866f50d.mo101137x5f950056(i17, str, str2);
        } else {
            m101887xd8d530ea(i17, str, str2);
        }
    }
}
