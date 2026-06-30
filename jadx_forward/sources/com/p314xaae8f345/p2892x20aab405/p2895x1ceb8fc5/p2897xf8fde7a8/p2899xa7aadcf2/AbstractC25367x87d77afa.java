package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser */
/* loaded from: classes13.dex */
public abstract class AbstractC25367x87d77afa {
    public static final java.lang.String TAG = "AudioListItemParser";

    /* renamed from: charsetDetector */
    protected com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 f45821x3c2d132 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912();

    /* renamed from: mUri */
    protected java.lang.String f45822x32d9bf;

    /* renamed from: delSeprator */
    public static java.lang.String m93975x69984c55(java.lang.String str) {
        return str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x003f -> B:12:0x0056). Please report as a decompilation issue!!! */
    /* renamed from: guessCharsetEncoding */
    public java.lang.String m93976x3f3927e8(java.io.InputStream inputStream) {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.String str = "unicode";
        java.io.BufferedInputStream bufferedInputStream2 = null;
        java.io.BufferedInputStream bufferedInputStream3 = null;
        java.io.BufferedInputStream bufferedInputStream4 = null;
        bufferedInputStream2 = null;
        try {
            try {
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "guess encoding close fis ex", e18);
            bufferedInputStream2 = bufferedInputStream2;
        }
        try {
            this.f45821x3c2d132.m93916x765074af(bufferedInputStream);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 m93907xb06a26a3 = this.f45821x3c2d132.m93907xb06a26a3();
            if (m93907xb06a26a3 != null) {
                int m93918x1fae1680 = m93907xb06a26a3.m93918x1fae1680();
                str = m93907xb06a26a3.m93920xfb82e301();
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "Audio list file encode: " + str + " ,confidence: " + m93918x1fae1680);
                bufferedInputStream3 = m93918x1fae1680;
            }
            bufferedInputStream.close();
            bufferedInputStream2 = bufferedInputStream3;
        } catch (java.io.IOException e19) {
            e = e19;
            bufferedInputStream4 = bufferedInputStream;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "guess encoding ex", e);
            bufferedInputStream2 = bufferedInputStream4;
            if (bufferedInputStream4 != null) {
                bufferedInputStream4.close();
                bufferedInputStream2 = bufferedInputStream4;
            }
            return str;
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "guess encoding close fis ex", e27);
                }
            }
            throw th;
        }
        return str;
    }

    /* renamed from: isParseSuccess */
    public abstract boolean mo93977xee35d01a();

    /* renamed from: iterator */
    public abstract java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79> mo93978x467c086e();

    /* renamed from: parse */
    public abstract void mo93979x6581ab3();
}
