package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParserFactory */
/* loaded from: classes13.dex */
public class C25368x2bb4e0b0 {
    /* renamed from: createParser */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa m93980x55601c3b(java.lang.String str) {
        if (str.startsWith("http") || !str.endsWith(".cue")) {
            return null;
        }
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.C25369x96977385(str);
    }
}
