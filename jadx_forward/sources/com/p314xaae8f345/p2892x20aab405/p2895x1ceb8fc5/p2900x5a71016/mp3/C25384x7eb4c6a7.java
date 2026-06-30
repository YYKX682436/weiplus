package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Recognition */
/* loaded from: classes13.dex */
public class C25384x7eb4c6a7 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String str, byte[] bArr) {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25381xa9f54fdc.m94043x25876002(str) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3 : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !(str.toLowerCase().endsWith(".mp3") || str.endsWith(".mp3.tmp") || str.endsWith(".mp3.mqcc") || str.endsWith(".ofl") || str.endsWith(".efe"))) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3;
    }
}
