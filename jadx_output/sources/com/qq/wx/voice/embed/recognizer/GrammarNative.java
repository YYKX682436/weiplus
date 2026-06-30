package com.qq.wx.voice.embed.recognizer;

/* loaded from: classes11.dex */
public class GrammarNative {
    public static native int begin();

    public static native int end();

    public static native int getResult(com.qq.wx.voice.embed.recognizer.Grammar grammar);

    public static native int init(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int recognize(byte[] bArr, int i17);

    public static native int update(byte[] bArr);
}
