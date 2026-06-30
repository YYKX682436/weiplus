package com.tencent.mm.live.ap.karaoke;

/* loaded from: classes10.dex */
public class LiveDAFX {
    static {
        dn0.b.f241825a.a();
    }

    public native long Create(int i17, int i18);

    public native int Free(long j17);

    public native int GetVersion();

    public native int Init(long j17, java.lang.String str);

    public native int Proc(long j17, byte[] bArr, byte[] bArr2, int i17, int i18);

    public native int SetType(long j17, int i17, float[] fArr, int i18);
}
