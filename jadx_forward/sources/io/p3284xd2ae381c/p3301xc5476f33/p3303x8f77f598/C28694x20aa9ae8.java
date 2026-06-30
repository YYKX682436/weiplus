package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.editing.FlutterTextUtils */
/* loaded from: classes15.dex */
public class C28694x20aa9ae8 {

    /* renamed from: CANCEL_TAG */
    public static final int f71641x8d8fc835 = 917631;

    /* renamed from: CARRIAGE_RETURN */
    public static final int f71642x8675cfbb = 13;

    /* renamed from: COMBINING_ENCLOSING_KEYCAP */
    public static final int f71643x1b0aaca9 = 8419;

    /* renamed from: LINE_FEED */
    public static final int f71644x3cc6c709 = 10;

    /* renamed from: ZERO_WIDTH_JOINER */
    public static final int f71645x1e750047 = 8205;

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71646x2014a1e9;

    public C28694x20aa9ae8(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71646x2014a1e9 = c28586x96e67e09;
    }

    /* renamed from: getOffsetAfter */
    public int m138462x2439dbd3(java.lang.CharSequence charSequence, int i17) {
        int charCount;
        int length = charSequence.length();
        int i18 = length - 1;
        if (i17 >= i18) {
            return length;
        }
        int codePointAt = java.lang.Character.codePointAt(charSequence, i17);
        int charCount2 = java.lang.Character.charCount(codePointAt);
        int i19 = i17 + charCount2;
        int i27 = 0;
        if (i19 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (java.lang.Character.codePointAt(charSequence, i19) == 13) {
                charCount2++;
            }
            return i17 + charCount2;
        }
        if (m138468x346243de(codePointAt)) {
            if (i19 >= i18 || !m138468x346243de(java.lang.Character.codePointAt(charSequence, i19))) {
                return i19;
            }
            int i28 = i17;
            while (i28 > 0 && m138468x346243de(java.lang.Character.codePointBefore(charSequence, i17))) {
                i28 -= java.lang.Character.charCount(java.lang.Character.codePointBefore(charSequence, i17));
                i27++;
            }
            if (i27 % 2 == 0) {
                charCount2 += 2;
            }
            return i17 + charCount2;
        }
        if (m138467x5564074e(codePointAt)) {
            charCount2 += java.lang.Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = java.lang.Character.codePointBefore(charSequence, i19);
            int charCount3 = i19 + java.lang.Character.charCount(codePointBefore);
            if (charCount3 < length && m138470xbb7f2308(codePointBefore)) {
                int codePointAt2 = java.lang.Character.codePointAt(charSequence, charCount3);
                if (m138467x5564074e(codePointAt2)) {
                    charCount2 += java.lang.Character.charCount(codePointBefore) + java.lang.Character.charCount(codePointAt2);
                }
            } else if (m138467x5564074e(codePointBefore)) {
                charCount2 += java.lang.Character.charCount(codePointBefore);
            }
            return i17 + charCount2;
        }
        if (m138464x7aab2d3c(codePointAt)) {
            boolean z17 = false;
            int i29 = 0;
            do {
                if (z17) {
                    charCount2 += java.lang.Character.charCount(codePointAt) + i29 + 1;
                    z17 = false;
                }
                if (m138465x46629833(codePointAt)) {
                    break;
                }
                if (i19 < length) {
                    codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                    i19 += java.lang.Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!m138465x46629833(codePointAt)) {
                            if (!m138470xbb7f2308(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                                    i19 += java.lang.Character.charCount(codePointAt);
                                    if (i19 >= length || !m138470xbb7f2308(codePointAt)) {
                                        i29 = 0;
                                    } else {
                                        codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                                        int charCount4 = java.lang.Character.charCount(codePointAt);
                                        i19 += java.lang.Character.charCount(codePointAt);
                                        i29 = charCount4;
                                    }
                                    z17 = true;
                                    if (i19 < length || !z17) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                charCount = java.lang.Character.charCount(codePointAt);
                            }
                        } else {
                            charCount = java.lang.Character.charCount(codePointAt);
                        }
                        charCount2 += charCount + 0;
                        break;
                    }
                    int codePointBefore2 = java.lang.Character.codePointBefore(charSequence, i19);
                    int charCount5 = i19 + java.lang.Character.charCount(codePointBefore2);
                    if (charCount5 < length && m138470xbb7f2308(codePointBefore2)) {
                        int codePointAt3 = java.lang.Character.codePointAt(charSequence, charCount5);
                        if (m138467x5564074e(codePointAt3)) {
                            charCount2 += java.lang.Character.charCount(codePointBefore2) + java.lang.Character.charCount(codePointAt3);
                        }
                    } else if (m138467x5564074e(codePointBefore2)) {
                        charCount2 += java.lang.Character.charCount(codePointBefore2);
                    }
                    return i17 + charCount2;
                }
                i29 = 0;
                if (i19 < length) {
                    break;
                }
            } while (m138464x7aab2d3c(codePointAt));
        }
        return i17 + charCount2;
    }

    /* renamed from: getOffsetBefore */
    public int m138463x64a22868(java.lang.CharSequence charSequence, int i17) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i18 = 0;
        int i19 = 1;
        if (i17 <= 1 || (charCount2 = i17 - (charCount = java.lang.Character.charCount((codePointBefore = java.lang.Character.codePointBefore(charSequence, i17))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (java.lang.Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i17 - charCount;
        }
        if (m138468x346243de(codePointBefore)) {
            int codePointBefore2 = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - java.lang.Character.charCount(codePointBefore2);
            while (charCount3 > 0 && m138468x346243de(codePointBefore2)) {
                codePointBefore2 = java.lang.Character.codePointBefore(charSequence, charCount3);
                charCount3 -= java.lang.Character.charCount(codePointBefore2);
                i19++;
            }
            if (i19 % 2 == 0) {
                charCount += 2;
            }
            return i17 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - java.lang.Character.charCount(codePointBefore3);
            if (charCount4 > 0 && m138470xbb7f2308(codePointBefore3)) {
                int codePointBefore4 = java.lang.Character.codePointBefore(charSequence, charCount4);
                if (m138467x5564074e(codePointBefore4)) {
                    charCount += java.lang.Character.charCount(codePointBefore3) + java.lang.Character.charCount(codePointBefore4);
                }
            } else if (m138467x5564074e(codePointBefore3)) {
                charCount += java.lang.Character.charCount(codePointBefore3);
            }
            return i17 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount5 = java.lang.Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount5;
                if (charCount2 <= 0 || !m138469xdf9a2fe1(codePointBefore)) {
                    break;
                }
                charCount += java.lang.Character.charCount(codePointBefore);
                codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                charCount5 = java.lang.Character.charCount(codePointBefore);
            }
            if (!m138464x7aab2d3c(codePointBefore)) {
                return i17 - 2;
            }
            charCount += java.lang.Character.charCount(codePointBefore);
        }
        if (m138470xbb7f2308(codePointBefore)) {
            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
            if (!m138464x7aab2d3c(codePointBefore)) {
                return i17 - charCount;
            }
            charCount += java.lang.Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (m138464x7aab2d3c(codePointBefore)) {
            boolean z17 = false;
            int i27 = 0;
            while (true) {
                if (z17) {
                    charCount += java.lang.Character.charCount(codePointBefore) + i27 + 1;
                    z17 = false;
                }
                if (m138465x46629833(codePointBefore)) {
                    int codePointBefore5 = java.lang.Character.codePointBefore(charSequence, charCount2);
                    int charCount6 = charCount2 - java.lang.Character.charCount(codePointBefore5);
                    if (charCount6 > 0 && m138470xbb7f2308(codePointBefore5)) {
                        codePointBefore5 = java.lang.Character.codePointBefore(charSequence, charCount6);
                        if (!m138464x7aab2d3c(codePointBefore5)) {
                            return i17 - charCount;
                        }
                        i18 = java.lang.Character.charCount(codePointBefore5);
                        java.lang.Character.charCount(codePointBefore5);
                    }
                    if (m138466xa644c1a4(codePointBefore5)) {
                        charCount += i18 + java.lang.Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= java.lang.Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= java.lang.Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !m138470xbb7f2308(codePointBefore)) {
                                i27 = 0;
                            } else {
                                codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                                int charCount7 = java.lang.Character.charCount(codePointBefore);
                                charCount2 -= java.lang.Character.charCount(codePointBefore);
                                i27 = charCount7;
                            }
                            z17 = true;
                            if (charCount2 != 0 || !z17 || !m138464x7aab2d3c(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i27 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i17 - charCount;
    }

    /* renamed from: isEmoji */
    public boolean m138464x7aab2d3c(int i17) {
        return this.f71646x2014a1e9.m137687xeab9822d(i17);
    }

    /* renamed from: isEmojiModifier */
    public boolean m138465x46629833(int i17) {
        return this.f71646x2014a1e9.m137688xd1496c24(i17);
    }

    /* renamed from: isEmojiModifierBase */
    public boolean m138466xa644c1a4(int i17) {
        return this.f71646x2014a1e9.m137689xf8ce3515(i17);
    }

    /* renamed from: isKeycapBase */
    public boolean m138467x5564074e(int i17) {
        return (48 <= i17 && i17 <= 57) || i17 == 35 || i17 == 42;
    }

    /* renamed from: isRegionalIndicatorSymbol */
    public boolean m138468x346243de(int i17) {
        return this.f71646x2014a1e9.m137690x1af36a17(i17);
    }

    /* renamed from: isTagSpecChar */
    public boolean m138469xdf9a2fe1(int i17) {
        return 917536 <= i17 && i17 <= 917630;
    }

    /* renamed from: isVariationSelector */
    public boolean m138470xbb7f2308(int i17) {
        return this.f71646x2014a1e9.m137691xd5c220ab(i17);
    }
}
