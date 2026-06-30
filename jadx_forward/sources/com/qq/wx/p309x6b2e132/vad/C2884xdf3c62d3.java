package com.qq.wx.p309x6b2e132.vad;

/* renamed from: com.qq.wx.voice.vad.VoiceRecognizeNative */
/* loaded from: classes10.dex */
public class C2884xdf3c62d3 {

    /* renamed from: RESULT_CONTINUE */
    public static final int f9786xf9c0e289 = 0;

    /* renamed from: RESULT_ERROR */
    public static final int f9787xdf87af46 = -1;

    /* renamed from: RESULT_FINISHED */
    public static final int f9788xf3687654 = 1;

    /* renamed from: TYPE_KEYWORD */
    public static final int f9789x1e01fdc4 = 0;

    /* renamed from: TYPE_NO_RESULT */
    public static final int f9790xa563a596 = -1;

    /* renamed from: com.qq.wx.voice.vad.VoiceRecognizeNative$Result */
    /* loaded from: classes10.dex */
    public static class Result {

        /* renamed from: action */
        public java.lang.String f9791xab2f7e36;

        /* renamed from: confidence */
        public float f9792x316d5e8a;

        /* renamed from: endOffset */
        public int f9793x584c894e;

        /* renamed from: name */
        public java.lang.String f9794x337a8b;

        /* renamed from: startOffset */
        public int f9795x8926c395;

        /* renamed from: text */
        public java.lang.String f9796x36452d;

        /* renamed from: type */
        public int f9797x368f3a;
    }

    /* renamed from: initEngine */
    public static native boolean m21480xf7323f72(java.lang.String str);

    /* renamed from: AddData */
    public native int m21481x1ebb3bcb(long j17, byte[] bArr);

    /* renamed from: Begin */
    public native int m21482x3d18889(long j17);

    public native int End(long j17);

    /* renamed from: GetResult */
    public native com.qq.wx.p309x6b2e132.vad.C2884xdf3c62d3.Result m21483xa4d70af3(long j17);

    /* renamed from: GetVersion */
    public native int[] m21484xc99434c2(long j17);

    /* renamed from: Init */
    public native long m21485x22d930(java.lang.String str, java.lang.String str2);

    /* renamed from: InitWithNameList */
    public native long m21486xb40335ff(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: Release */
    public native void m21487xa439bfe7(long j17);

    /* renamed from: SetKeywordSetIndex */
    public native int m21488x1d4e99f7(long j17, int i17);

    /* renamed from: SetTranThres */
    public native int m21489xa2970b1f(long j17, int i17);

    /* renamed from: UpdateNameSlot */
    public native int m21490x65d92b32(long j17, java.lang.String str);
}
