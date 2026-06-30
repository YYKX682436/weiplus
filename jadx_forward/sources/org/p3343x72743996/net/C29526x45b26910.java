package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android")
/* renamed from: org.chromium.net.NetStringUtil */
/* loaded from: classes7.dex */
public class C29526x45b26910 {
    /* renamed from: convertToUnicode */
    private static java.lang.String m153302x3aa68f6f(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        try {
            return java.nio.charset.Charset.forName(str).newDecoder().decode(byteBuffer).toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: convertToUnicodeAndNormalize */
    private static java.lang.String m153303xedb45c05(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        java.lang.String m153302x3aa68f6f = m153302x3aa68f6f(byteBuffer, str);
        if (m153302x3aa68f6f == null) {
            return null;
        }
        return java.text.Normalizer.normalize(m153302x3aa68f6f, java.text.Normalizer.Form.NFC);
    }

    /* renamed from: convertToUnicodeWithSubstitutions */
    private static java.lang.String m153304xece06a41(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        try {
            java.nio.charset.CharsetDecoder newDecoder = java.nio.charset.Charset.forName(str).newDecoder();
            newDecoder.onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE);
            newDecoder.onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
            newDecoder.replaceWith("�");
            return newDecoder.decode(byteBuffer).toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: toUpperCase */
    private static java.lang.String m153305xe82f52b7(java.lang.String str) {
        try {
            return str.toUpperCase(java.util.Locale.getDefault());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
