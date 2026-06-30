package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class i2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263383a;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263383a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://private/gethtml/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263383a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String substring = url.substring(25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        try {
            java.lang.String decode = java.net.URLDecoder.decode(substring);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("nowUrl", e3Var.B1);
            java.lang.String stringExtra = e3Var.d0().getStringExtra("tweetid");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            bundle.putString("tweetid", stringExtra);
            bundle.putString("htmlData", decode);
            bundle.putInt("type", e3Var.d0().getIntExtra("type", 0));
            e3Var.e0().ng(3, bundle, e3Var.U());
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "edw ViewImageGetHtmlHandler handleUrl, ex = " + e17.getMessage());
            return false;
        }
    }
}
