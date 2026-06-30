package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch */
/* loaded from: classes16.dex */
public class C25360x6a0dcbf9 implements java.lang.Comparable<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9> {

    /* renamed from: fCharsetName */
    private java.lang.String f45764x2cfa55b1;

    /* renamed from: fConfidence */
    private int f45765xfb5e7390;

    /* renamed from: fInputStream */
    private java.io.InputStream f45766x61f49fa4;

    /* renamed from: fLang */
    private java.lang.String f45767x5c16374;

    /* renamed from: fRawInput */
    private byte[] f45768x33ea2708;

    /* renamed from: fRawLength */
    private int f45769x4df95368;

    public C25360x6a0dcbf9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 abstractC25366x96a257f0, int i17) {
        this.f45768x33ea2708 = null;
        this.f45766x61f49fa4 = null;
        this.f45765xfb5e7390 = i17;
        java.io.InputStream inputStream = c25359xc8558912.f45758x61f49fa4;
        if (inputStream == null) {
            this.f45768x33ea2708 = c25359xc8558912.f45759x33ea2708;
            this.f45769x4df95368 = c25359xc8558912.f45760x4df95368;
        }
        this.f45766x61f49fa4 = inputStream;
        this.f45764x2cfa55b1 = abstractC25366x96a257f0.mo93925xfb82e301();
        this.f45767x5c16374 = abstractC25366x96a257f0.mo93933x1bacd0ce();
    }

    /* renamed from: getConfidence */
    public int m93918x1fae1680() {
        return this.f45765xfb5e7390;
    }

    /* renamed from: getLanguage */
    public java.lang.String m93919x1bacd0ce() {
        return this.f45767x5c16374;
    }

    /* renamed from: getName */
    public java.lang.String m93920xfb82e301() {
        return this.f45764x2cfa55b1;
    }

    /* renamed from: getReader */
    public java.io.Reader m93921x2d5c7bb9() {
        java.io.InputStream inputStream = this.f45766x61f49fa4;
        if (inputStream == null) {
            inputStream = new java.io.ByteArrayInputStream(this.f45768x33ea2708, 0, this.f45769x4df95368);
        }
        try {
            inputStream.reset();
            return new java.io.InputStreamReader(inputStream, m93920xfb82e301());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: getString */
    public java.lang.String m93922x2fec8307() {
        return m93923x2fec8307(-1);
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 c25360x6a0dcbf9) {
        int i17 = this.f45765xfb5e7390;
        int i18 = c25360x6a0dcbf9.f45765xfb5e7390;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }

    /* renamed from: getString */
    public java.lang.String m93923x2fec8307(int i17) {
        if (this.f45766x61f49fa4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            char[] cArr = new char[1024];
            java.io.Reader m93921x2d5c7bb9 = m93921x2d5c7bb9();
            if (i17 < 0) {
                i17 = Integer.MAX_VALUE;
            }
            while (true) {
                int read = m93921x2d5c7bb9.read(cArr, 0, java.lang.Math.min(i17, 1024));
                if (read >= 0) {
                    sb6.append(cArr, 0, read);
                    i17 -= read;
                } else {
                    m93921x2d5c7bb9.close();
                    return sb6.toString();
                }
            }
        } else {
            java.lang.String m93920xfb82e301 = m93920xfb82e301();
            int indexOf = m93920xfb82e301.indexOf(m93920xfb82e301.indexOf("_rtl") < 0 ? "_ltr" : "_rtl");
            if (indexOf > 0) {
                m93920xfb82e301 = m93920xfb82e301.substring(0, indexOf);
            }
            return new java.lang.String(this.f45768x33ea2708, m93920xfb82e301);
        }
    }

    public C25360x6a0dcbf9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 abstractC25366x96a257f0, int i17, java.lang.String str, java.lang.String str2) {
        this.f45768x33ea2708 = null;
        this.f45766x61f49fa4 = null;
        this.f45765xfb5e7390 = i17;
        java.io.InputStream inputStream = c25359xc8558912.f45758x61f49fa4;
        if (inputStream == null) {
            this.f45768x33ea2708 = c25359xc8558912.f45759x33ea2708;
            this.f45769x4df95368 = c25359xc8558912.f45760x4df95368;
        }
        this.f45766x61f49fa4 = inputStream;
        this.f45764x2cfa55b1 = str;
        this.f45767x5c16374 = str2;
    }
}
