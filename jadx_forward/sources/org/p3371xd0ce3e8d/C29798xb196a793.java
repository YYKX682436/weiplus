package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.JniHelper */
/* loaded from: classes4.dex */
class C29798xb196a793 {
    /* renamed from: getKey */
    public static java.lang.Object m155651xb5884f29(java.util.Map.Entry entry) {
        return entry.getKey();
    }

    /* renamed from: getStringBytes */
    public static byte[] m155652x7e3a19a4(java.lang.String str) {
        try {
            return str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    /* renamed from: getStringClass */
    public static java.lang.Object m155653x7e4202b1() {
        return java.lang.String.class;
    }

    /* renamed from: getValue */
    public static java.lang.Object m155654x754a37bb(java.util.Map.Entry entry) {
        return entry.getValue();
    }
}
