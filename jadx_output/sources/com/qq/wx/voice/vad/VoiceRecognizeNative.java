package com.qq.wx.voice.vad;

/* loaded from: classes10.dex */
public class VoiceRecognizeNative {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_FINISHED = 1;
    public static final int TYPE_KEYWORD = 0;
    public static final int TYPE_NO_RESULT = -1;

    /* loaded from: classes10.dex */
    public static class Result {
        public java.lang.String action;
        public float confidence;
        public int endOffset;
        public java.lang.String name;
        public int startOffset;
        public java.lang.String text;
        public int type;
    }

    public static native boolean initEngine(java.lang.String str);

    public native int AddData(long j17, byte[] bArr);

    public native int Begin(long j17);

    public native int End(long j17);

    public native com.qq.wx.voice.vad.VoiceRecognizeNative.Result GetResult(long j17);

    public native int[] GetVersion(long j17);

    public native long Init(java.lang.String str, java.lang.String str2);

    public native long InitWithNameList(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public native void Release(long j17);

    public native int SetKeywordSetIndex(long j17, int i17);

    public native int SetTranThres(long j17, int i17);

    public native int UpdateNameSlot(long j17, java.lang.String str);
}
