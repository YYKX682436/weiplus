package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector */
/* loaded from: classes16.dex */
public class C25359xc8558912 {

    /* renamed from: ALL_CS_RECOGNIZERS */
    private static final java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo> f45750x123b9c5e;

    /* renamed from: kBufSize */
    private static final int f45751xdbe4ba29 = 8000;

    /* renamed from: fDeclaredEncoding */
    java.lang.String f45754x67bfd833;

    /* renamed from: fEnabledRecognizers */
    private boolean[] f45755x56c91454;

    /* renamed from: fInputLen */
    int f45757x332ce471;

    /* renamed from: fInputStream */
    java.io.InputStream f45758x61f49fa4;

    /* renamed from: fRawInput */
    byte[] f45759x33ea2708;

    /* renamed from: fRawLength */
    int f45760x4df95368;

    /* renamed from: fInputBytes */
    byte[] f45756x1b01dbc7 = new byte[8000];

    /* renamed from: fByteStats */
    short[] f45752x51ca0ab1 = new short[256];

    /* renamed from: fC1Bytes */
    boolean f45753x9371a997 = false;

    /* renamed from: fStripTags */
    private boolean f45761xc180918b = false;

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector$CSRecognizerInfo */
    /* loaded from: classes16.dex */
    public static class CSRecognizerInfo {

        /* renamed from: isDefaultEnabled */
        boolean f45762xbe2f798a;

        /* renamed from: recognizer */
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 f45763x199f09a4;

        public CSRecognizerInfo(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 abstractC25366x96a257f0, boolean z17) {
            this.f45763x199f09a4 = abstractC25366x96a257f0;
            this.f45762xbe2f798a = z17;
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25362x95c54d54(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_16_BE(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_16_LE(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32_BE(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32_LE(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_sjis(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1.CharsetRecog_2022JP(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1.CharsetRecog_2022CN(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1.CharsetRecog_2022KR(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_gb_18030(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_euc.CharsetRecog_euc_jp(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_euc.CharsetRecog_euc_kr(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_big5(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_1(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_2(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_5_ru(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_6_ar(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_7_el(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_8_I_he(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_8_he(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_windows_1251(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_windows_1256(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_KOI8_R(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_8859_9_tr(), true));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_IBM424_he_rtl(), false));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_IBM424_he_ltr(), false));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_IBM420_ar_rtl(), false));
        arrayList.add(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25365x95d328c2.CharsetRecog_IBM420_ar_ltr(), false));
        f45750x123b9c5e = java.util.Collections.unmodifiableList(arrayList);
    }

    /* renamed from: MungeInput */
    private void m93905xd952bf26() {
        int i17;
        int i18;
        if (this.f45761xc180918b) {
            int i19 = 0;
            i17 = 0;
            i18 = 0;
            boolean z17 = false;
            for (int i27 = 0; i27 < this.f45760x4df95368; i27++) {
                byte[] bArr = this.f45756x1b01dbc7;
                if (i19 >= bArr.length) {
                    break;
                }
                byte b17 = this.f45759x33ea2708[i27];
                if (b17 == 60) {
                    if (z17) {
                        i18++;
                    }
                    i17++;
                    z17 = true;
                }
                if (!z17) {
                    bArr[i19] = b17;
                    i19++;
                }
                if (b17 == 62) {
                    z17 = false;
                }
            }
            this.f45757x332ce471 = i19;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (i17 < 5 || i17 / 5 < i18 || (this.f45757x332ce471 < 100 && this.f45760x4df95368 > 600)) {
            int i28 = this.f45760x4df95368;
            if (i28 > 8000) {
                i28 = 8000;
            }
            int i29 = 0;
            while (i29 < i28) {
                this.f45756x1b01dbc7[i29] = this.f45759x33ea2708[i29];
                i29++;
            }
            this.f45757x332ce471 = i29;
        }
        java.util.Arrays.fill(this.f45752x51ca0ab1, (short) 0);
        for (int i37 = 0; i37 < this.f45757x332ce471; i37++) {
            int i38 = this.f45756x1b01dbc7[i37] & 255;
            short[] sArr = this.f45752x51ca0ab1;
            sArr[i38] = (short) (sArr[i38] + 1);
        }
        this.f45753x9371a997 = false;
        for (int i39 = 128; i39 <= 159; i39++) {
            if (this.f45752x51ca0ab1[i39] != 0) {
                this.f45753x9371a997 = true;
                return;
            }
        }
    }

    /* renamed from: getAllDetectableCharsets */
    public static java.lang.String[] m93906x3eab540f() {
        int size = f45750x123b9c5e.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = f45750x123b9c5e.get(i17).f45763x199f09a4.mo93925xfb82e301();
        }
        return strArr;
    }

    /* renamed from: detect */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 m93907xb06a26a3() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9[] m93908x90e733fe = m93908x90e733fe();
        if (m93908x90e733fe == null || m93908x90e733fe.length == 0) {
            return null;
        }
        return m93908x90e733fe[0];
    }

    /* renamed from: detectAll */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9[] m93908x90e733fe() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m93905xd952bf26();
        int i17 = 0;
        while (true) {
            java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo> list = f45750x123b9c5e;
            if (i17 >= list.size()) {
                java.util.Collections.sort(arrayList);
                java.util.Collections.reverse(arrayList);
                return (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9[]) arrayList.toArray(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9[arrayList.size()]);
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo cSRecognizerInfo = list.get(i17);
            boolean[] zArr = this.f45755x56c91454;
            if ((zArr != null ? zArr[i17] : cSRecognizerInfo.f45762xbe2f798a) && (mo93926x62dd9c5 = cSRecognizerInfo.f45763x199f09a4.mo93926x62dd9c5(this)) != null) {
                arrayList.add(mo93926x62dd9c5);
            }
            i17++;
        }
    }

    /* renamed from: enableInputFilter */
    public boolean m93909x2579925f(boolean z17) {
        boolean z18 = this.f45761xc180918b;
        this.f45761xc180918b = z17;
        return z18;
    }

    @java.lang.Deprecated
    /* renamed from: getDetectableCharsets */
    public java.lang.String[] m93910x967b743a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(f45750x123b9c5e.size());
        int i17 = 0;
        while (true) {
            java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo> list = f45750x123b9c5e;
            if (i17 >= list.size()) {
                return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo cSRecognizerInfo = list.get(i17);
            boolean[] zArr = this.f45755x56c91454;
            if (zArr == null ? cSRecognizerInfo.f45762xbe2f798a : zArr[i17]) {
                arrayList.add(cSRecognizerInfo.f45763x199f09a4.mo93925xfb82e301());
            }
            i17++;
        }
    }

    /* renamed from: getReader */
    public java.io.Reader m93911x2d5c7bb9(java.io.InputStream inputStream, java.lang.String str) {
        this.f45754x67bfd833 = str;
        try {
            m93916x765074af(inputStream);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 m93907xb06a26a3 = m93907xb06a26a3();
            if (m93907xb06a26a3 == null) {
                return null;
            }
            return m93907xb06a26a3.m93921x2d5c7bb9();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: getString */
    public java.lang.String m93912x2fec8307(byte[] bArr, java.lang.String str) {
        this.f45754x67bfd833 = str;
        try {
            m93917x765074af(bArr);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 m93907xb06a26a3 = m93907xb06a26a3();
            if (m93907xb06a26a3 == null) {
                return null;
            }
            return m93907xb06a26a3.m93923x2fec8307(-1);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: inputFilterEnabled */
    public boolean m93913x86c50ff() {
        return this.f45761xc180918b;
    }

    /* renamed from: setDeclaredEncoding */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 m93914xc2221c2f(java.lang.String str) {
        this.f45754x67bfd833 = str;
        return this;
    }

    @java.lang.Deprecated
    /* renamed from: setDetectableCharset */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 m93915x438983cd(java.lang.String str, boolean z17) {
        java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo> list;
        boolean z18;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            list = f45750x123b9c5e;
            if (i18 >= list.size()) {
                i18 = -1;
                break;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo cSRecognizerInfo = list.get(i18);
            if (!cSRecognizerInfo.f45763x199f09a4.mo93925xfb82e301().equals(str)) {
                i18++;
            } else if (cSRecognizerInfo.f45762xbe2f798a == z17) {
                z18 = true;
            }
        }
        z18 = false;
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("Invalid encoding: \"" + str + "\"");
        }
        if (this.f45755x56c91454 == null && !z18) {
            this.f45755x56c91454 = new boolean[list.size()];
            while (true) {
                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912.CSRecognizerInfo> list2 = f45750x123b9c5e;
                if (i17 >= list2.size()) {
                    break;
                }
                this.f45755x56c91454[i17] = list2.get(i17).f45762xbe2f798a;
                i17++;
            }
        }
        boolean[] zArr = this.f45755x56c91454;
        if (zArr != null) {
            zArr[i18] = z17;
        }
        return this;
    }

    /* renamed from: setText */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 m93917x765074af(byte[] bArr) {
        this.f45759x33ea2708 = bArr;
        this.f45760x4df95368 = bArr.length;
        return this;
    }

    /* renamed from: setText */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 m93916x765074af(java.io.InputStream inputStream) {
        this.f45758x61f49fa4 = inputStream;
        int i17 = 8000;
        inputStream.mark(8000);
        this.f45759x33ea2708 = new byte[8000];
        this.f45760x4df95368 = 0;
        while (i17 > 0) {
            int read = this.f45758x61f49fa4.read(this.f45759x33ea2708, this.f45760x4df95368, i17);
            if (read <= 0) {
                break;
            }
            this.f45760x4df95368 += read;
            i17 -= read;
        }
        this.f45758x61f49fa4.reset();
        return this;
    }
}
