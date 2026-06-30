package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.StringCronetCallback */
/* loaded from: classes13.dex */
public abstract class AbstractC29578x2a8741b3 extends org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028<java.lang.String> {

    /* renamed from: CONTENT_TYPE_HEADER_NAME */
    private static final java.lang.String f74370x436f829e = "Content-Type";

    /* renamed from: getCharsetFromHeaders */
    private java.nio.charset.Charset m153739xfbfefd86(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        java.util.Iterator<java.lang.String> it = abstractC29564x6974077e.mo153680x70925e9b().get(f74370x436f829e).iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc c29568xe3c2cbfc = new org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc(it.next());
            while (c29568xe3c2cbfc.m153727x2987650f()) {
                try {
                    java.util.Map.Entry<java.lang.String, java.lang.String> m153726xab2ea640 = c29568xe3c2cbfc.m153726xab2ea640();
                    m153726xab2ea640.getKey();
                    java.lang.String value = m153726xab2ea640.getValue();
                    if (str != null && !value.equalsIgnoreCase(str)) {
                        throw new java.lang.IllegalArgumentException("Multiple charsets provided: " + value + " and " + str);
                    }
                    str = value;
                } catch (org.p3343x72743996.net.p3356x3927bb2b.C29568xe3c2cbfc.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        return str != null ? java.nio.charset.Charset.forName(str) : java.nio.charset.Charset.defaultCharset();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028
    /* renamed from: addCompletionListener, reason: avoid collision after fix types in other method */
    public org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3 mo153714x45901f31(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super java.lang.String> interfaceC29569x80e9f442) {
        super.mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442) interfaceC29569x80e9f442);
        return this;
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028
    /* renamed from: transformBodyBytes, reason: avoid collision after fix types in other method */
    public java.lang.String mo153715xf8d119dd(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, byte[] bArr) {
        return new java.lang.String(bArr, m153739xfbfefd86(abstractC29564x6974077e));
    }
}
