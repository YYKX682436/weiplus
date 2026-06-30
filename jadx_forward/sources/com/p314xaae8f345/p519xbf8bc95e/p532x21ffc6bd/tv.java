package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tv implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om {

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f133786c;

    /* renamed from: d, reason: collision with root package name */
    private final float f133787d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f133788e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f133789f;

    public tv(android.content.Context context, java.lang.String str) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f133786c = applicationContext;
        this.f133787d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(applicationContext);
        this.f133788e = str;
    }

    private android.graphics.Bitmap b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.InputStream b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f133786c, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).a(this.f133788e) + str);
        if (b17 == null) {
            b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f133786c, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b(this.f133788e) + str);
        }
        if (b17 == null) {
            b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f133786c, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).e() + str);
        }
        if (b17 == null && this.f133789f != null) {
            b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(new java.io.File(this.f133789f, str));
        }
        if (b17 == null) {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a() != null) {
                b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b(this.f133786c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a() + str);
            } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b() != null) {
                b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b() + str);
            }
        }
        if (b17 == null) {
            b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a(this.f133786c, str);
        }
        if (b17 == null) {
            b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b(this.f133786c, str);
        }
        if (b17 == null) {
            return null;
        }
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(b17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) b17);
        return decodeStream;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om
    public final java.lang.String a() {
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om
    public final void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("../")) {
            str = str.replaceAll("\\.\\./", "");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f133789f = str;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om
    public final void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 c4388xc6dd6810) {
        android.graphics.Bitmap a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(str);
        if (a17 == null) {
            a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(str);
        }
        c4388xc6dd6810.f17351xad38f12f = a17;
        if (!str.endsWith(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130907s) && !str.contains("@2x")) {
            if (!str.endsWith("@3x.png") && !str.contains("@3x")) {
                c4388xc6dd6810.f17352x683094a = this.f133787d;
            } else {
                c4388xc6dd6810.f17352x683094a = 3.0f;
            }
        } else {
            c4388xc6dd6810.f17352x683094a = 2.0f;
        }
        if (this.f133786c != null && a17 == null) {
            try {
                if (str.startsWith("poi_icon") || str.startsWith(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130906r)) {
                    a17 = b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.b(str) + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130907s);
                }
                if (a17 != null) {
                    c4388xc6dd6810.f17351xad38f12f = a17;
                    c4388xc6dd6810.f17352x683094a = 2.0f;
                    return;
                }
                c4388xc6dd6810.f17351xad38f12f = b(str);
                if (!str.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om.f132126a) && !str.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om.f132127b)) {
                    c4388xc6dd6810.f17352x683094a = 1.0f;
                    return;
                }
                c4388xc6dd6810.f17352x683094a = this.f133787d;
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
    }
}
