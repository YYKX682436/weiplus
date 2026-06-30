package com.tencent.mm.live.ap.karaoke;

/* loaded from: classes10.dex */
public class SingScore {
    static {
        dn0.b.f241825a.a();
    }

    public native int GetFinalScore(long j17, int[] iArr, int[] iArr2);

    public native int GetNoteInfo(long j17, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5);

    public native int GetNoteInfoNum(long j17);

    public native int GetVersion();

    public native long Init(int i17, int i18);

    public native int Process(long j17, byte[] bArr, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public native int SentSongInfo(long j17, byte[] bArr, int i17, int[] iArr, int i18);

    public native int SetConfig(long j17, long j18);

    public native int SetLogPath(java.lang.String str);

    public native int SetToneChangeVal(long j17, int i17);

    public native int UnInit(long j17);
}
