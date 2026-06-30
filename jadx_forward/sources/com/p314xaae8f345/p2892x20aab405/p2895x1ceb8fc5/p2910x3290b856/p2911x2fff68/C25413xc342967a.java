package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.Id3Util */
/* loaded from: classes16.dex */
public class C25413xc342967a {
    /* renamed from: synchsafe */
    public static int m94173x1df89a3a(int i17) {
        int i18 = 0;
        int i19 = 127;
        while ((Integer.MAX_VALUE ^ i19) > 0) {
            i18 = (((~i19) & i17) << 1) | (i17 & i19);
            i19 = ((i19 + 1) << 8) - 1;
            i17 = i18;
        }
        return i18;
    }

    /* renamed from: unsynchsafe */
    public static int m94174x220ce7c1(int i17) {
        int i18 = 0;
        for (int i19 = 2130706432; i19 > 0; i19 >>= 8) {
            i18 = (i18 >> 1) | (i17 & i19);
        }
        return i18;
    }
}
