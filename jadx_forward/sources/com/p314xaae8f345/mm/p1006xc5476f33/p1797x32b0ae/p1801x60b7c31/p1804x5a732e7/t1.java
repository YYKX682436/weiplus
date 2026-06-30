package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class t1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u1 f225312b;

    public t1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u1 u1Var) {
        this.f225311a = str;
        this.f225312b = u1Var;
    }

    @Override // p11.k
    public void a(java.lang.String url, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... extraObj) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraObj, "extraObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "imageLoaderListener onImageLoadComplete %s", url);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u1 u1Var = this.f225312b;
        if (bitmap != null) {
            if ((!(extraObj.length == 0)) && (obj = extraObj[0]) != null && (obj instanceof java.lang.String) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, this.f225311a)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(java.lang.String.valueOf(extraObj[0]));
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    u1Var.B(a17.m82499x9616526c());
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "download image fail");
        u1Var.f224976f.a("emoticonSingleOperation:fail_missing arguments");
    }
}
