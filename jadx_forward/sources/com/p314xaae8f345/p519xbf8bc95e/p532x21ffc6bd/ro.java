package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ro extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae {

    /* renamed from: a, reason: collision with root package name */
    static int f132775a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f132776c = 256;

    /* renamed from: b, reason: collision with root package name */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c f132777b;

    public ro(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        super(256, 256);
        this.f132777b = c26089x9c7ff29c;
        int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a();
        f132775a = a17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c2 = this.f132777b;
        if (c26089x9c7ff29c2 != null) {
            c26089x9c7ff29c2.m100014x290dc9a6(java.lang.Integer.toString(a17));
        }
    }

    public static java.lang.String a() {
        return java.lang.Integer.toString(f132775a);
    }

    private void b() {
        int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a();
        f132775a = a17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = this.f132777b;
        if (c26089x9c7ff29c != null) {
            c26089x9c7ff29c.m100014x290dc9a6(java.lang.Integer.toString(a17));
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae
    /* renamed from: getTileUrl */
    public final java.net.URL mo36931xef6e0fab(int i17, int i18, int i19) {
        java.lang.String m36697x6a686695 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dh) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw.class)).i()).m36697x6a686695(i17, (int) ((java.lang.Math.pow(2.0d, i19) - 1.0d) - i18), i19, f132775a);
        try {
            if (android.text.TextUtils.isEmpty(m36697x6a686695)) {
                return null;
            }
            return new java.net.URL(m36697x6a686695);
        } catch (java.net.MalformedURLException unused) {
            return null;
        }
    }
}
