package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f274444a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f274445b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(256);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.f8 f274446c;

    static {
        java.util.regex.Pattern.compile(((char) ("⍆[0-9]+@".charAt(0) ^ 56506)) + "[0-9]+@");
    }

    public p2(java.lang.String str) {
        try {
            this.f274444a = str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException unused) {
            this.f274444a = str.getBytes();
        }
        this.f274446c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.f8(str);
    }
}
