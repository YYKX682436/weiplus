package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wav;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.wav.WavRecognition */
/* loaded from: classes13.dex */
public class C25386x2b905d4b implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {
    /* renamed from: isWav */
    public static boolean m94069x5fd3d62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        byte[] bArr = new byte[4];
        try {
            interfaceC25439x37e1318e.mo94264xc8455469(0L, bArr, 0, 4);
        } catch (java.io.IOException unused) {
        }
        if (bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70) {
            return true;
        }
        try {
            interfaceC25439x37e1318e.mo94264xc8455469(8L, bArr, 0, 4);
        } catch (java.io.IOException unused2) {
        }
        return bArr[0] == 87 && bArr[1] == 65 && bArr[2] == 86 && bArr[3] == 69;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String str, byte[] bArr) {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wav.C25387x852dd53c.m94071x6e430ff9(str) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WAV : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wav")) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WAV;
    }
}
