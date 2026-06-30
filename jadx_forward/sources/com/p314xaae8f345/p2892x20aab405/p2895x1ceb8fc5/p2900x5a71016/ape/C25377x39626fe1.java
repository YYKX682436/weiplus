package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.ape;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.ape.ApeRecognition */
/* loaded from: classes13.dex */
public class C25377x39626fe1 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {
    public static final java.lang.String TAG = "ApeRecognition";

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec;
        if (bArr != null && bArr.length > 0 && new java.lang.String(bArr).startsWith("MAC")) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.APE;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d();
        if (c25375x52862c0d.mo93993x316510(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str)) != 0 || (mo93985x6e8c46ec = c25375x52862c0d.mo93985x6e8c46ec()) == null) {
            return audioType;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93536xaa5357a = mo93985x6e8c46ec.m93536xaa5357a();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType2 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.APE;
        return m93536xaa5357a == audioType2 ? audioType2 : audioType;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !(str.toLowerCase().contains(".ape") || str.toLowerCase().contains(".mac"))) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.APE;
    }
}
