package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.ContentTypeParametersParser */
/* loaded from: classes13.dex */
final class C29568xe3c2cbfc {

    /* renamed from: TOKEN_ALLOWED_SPECIAL_CHARS */
    private static final java.lang.String f74358xf0e9b43a = "!#$%&'*+-.^_`|~";

    /* renamed from: mCurrentPosition */
    private int f74359x82926195;

    /* renamed from: mHeaderValue */
    private final java.lang.String f74360xf01a6037;

    /* renamed from: org.chromium.net.apihelpers.ContentTypeParametersParser$ContentTypeParametersParserException */
    /* loaded from: classes13.dex */
    public static class ContentTypeParametersParserException extends java.text.ParseException {
        public ContentTypeParametersParserException(java.lang.String str, int i17) {
            super(str, i17);
        }
    }

    public C29568xe3c2cbfc(java.lang.String str) {
        this.f74360xf01a6037 = str;
        int indexOf = str.indexOf(59);
        this.f74359x82926195 = indexOf != -1 ? indexOf + 1 : str.length();
    }

    /* renamed from: advance */
    private void m153716xbc8da882() {
        if (!m153727x2987650f()) {
            throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("End of header reached", this.f74359x82926195);
        }
        this.f74359x82926195++;
    }

    /* renamed from: currentChar */
    private char m153717x23ce606f() {
        if (m153727x2987650f()) {
            return this.f74360xf01a6037.charAt(this.f74359x82926195);
        }
        throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("End of header reached", this.f74359x82926195);
    }

    /* renamed from: getNextQuotedString */
    private java.lang.String m153718xcc01a1a2() {
        int i17 = this.f74359x82926195;
        if (m153717x23ce606f() != '\"') {
            throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Not a quoted string: expected \" at " + this.f74359x82926195 + ": [" + this.f74360xf01a6037 + "]", this.f74359x82926195);
        }
        m153716xbc8da882();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            boolean z17 = false;
            while (m153727x2987650f()) {
                if (z17) {
                    if (!m153722xaffe02a2(m153717x23ce606f())) {
                        throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Invalid character at " + this.f74359x82926195 + ": [" + this.f74360xf01a6037 + "]", this.f74359x82926195);
                    }
                    sb6.append(m153717x23ce606f());
                    m153716xbc8da882();
                } else {
                    if (m153717x23ce606f() == '\"') {
                        m153716xbc8da882();
                        return sb6.toString();
                    }
                    if (m153717x23ce606f() == '\\') {
                        m153716xbc8da882();
                        z17 = true;
                    } else {
                        if (!m153721x4b73600(m153717x23ce606f())) {
                            throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Invalid character at " + this.f74359x82926195 + ": [" + this.f74360xf01a6037 + "]", this.f74359x82926195);
                        }
                        sb6.append(m153717x23ce606f());
                        m153716xbc8da882();
                    }
                }
            }
            throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Unterminated quoted string at " + i17 + ": [" + this.f74360xf01a6037 + "]", i17);
        }
    }

    /* renamed from: getNextToken */
    private java.lang.String m153719x475d9010() {
        int i17 = this.f74359x82926195;
        while (m153727x2987650f() && m153723x2bb1d0fa(m153717x23ce606f())) {
            m153716xbc8da882();
        }
        int i18 = this.f74359x82926195;
        if (i17 != i18) {
            return this.f74360xf01a6037.substring(i17, i18);
        }
        throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Token not found at position " + i17 + ": [" + this.f74360xf01a6037 + "]", i17);
    }

    /* renamed from: isAscii */
    private static boolean m153720x7a755c47(char c17) {
        return c17 >= 0 && c17 <= 127;
    }

    /* renamed from: isQdtextChar */
    private static boolean m153721x4b73600(char c17) {
        return (c17 == '\\' || c17 == '\"' || !m153722xaffe02a2(c17)) ? false : true;
    }

    /* renamed from: isQuotedPairChar */
    private static boolean m153722xaffe02a2(char c17) {
        return m153724x91ec5347(c17) || ('!' <= c17 && c17 <= 255 && c17 != 127);
    }

    /* renamed from: isTokenCharacter */
    private static boolean m153723x2bb1d0fa(char c17) {
        return m153720x7a755c47(c17) && (java.lang.Character.isLetterOrDigit(c17) || f74358xf0e9b43a.indexOf(c17) != -1);
    }

    /* renamed from: isWhitespace */
    private static boolean m153724x91ec5347(char c17) {
        return c17 == '\t' || c17 == ' ';
    }

    /* renamed from: optionallySkipWhitespace */
    private void m153725x8c30afa9() {
        while (m153727x2987650f() && m153724x91ec5347(m153717x23ce606f())) {
            m153716xbc8da882();
        }
    }

    /* renamed from: getNextParameter */
    public java.util.Map.Entry<java.lang.String, java.lang.String> m153726xab2ea640() {
        m153725x8c30afa9();
        java.lang.String m153719x475d9010 = m153719x475d9010();
        if (m153717x23ce606f() != '=') {
            throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Invalid parameter format: expected = at " + this.f74359x82926195 + ": [" + this.f74360xf01a6037 + "]", this.f74359x82926195);
        }
        m153716xbc8da882();
        java.lang.String m153718xcc01a1a2 = m153717x23ce606f() == '\"' ? m153718xcc01a1a2() : m153719x475d9010();
        m153725x8c30afa9();
        if (m153727x2987650f()) {
            if (m153717x23ce606f() != ';') {
                throw new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException("Invalid parameter format: expected ; at " + this.f74359x82926195 + ": [" + this.f74360xf01a6037 + "]", this.f74359x82926195);
            }
            m153716xbc8da882();
        }
        return new java.util.AbstractMap.SimpleEntry(m153719x475d9010, m153718xcc01a1a2);
    }

    /* renamed from: hasMore */
    public boolean m153727x2987650f() {
        return this.f74359x82926195 < this.f74360xf01a6037.length();
    }
}
