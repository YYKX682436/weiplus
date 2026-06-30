package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class y1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f263558b;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f263557a = e3Var;
        this.f263558b = c22633x83752a59;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://");
    }

    @Override // rw4.a
    public boolean f(java.lang.String urlOrig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlOrig, "urlOrig");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263557a;
        java.lang.String stringExtra = e3Var.d0().getStringExtra("sentUsername");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int k07 = e3Var.k0(stringExtra);
        java.lang.String w17 = o25.z.w(urlOrig);
        if (!o25.z.q(w17, e3Var.K1)) {
            return false;
        }
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://dl/shopping", w17)) {
                java.lang.String m37 = e3Var.e0().m3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m37, "getJDUrl(...)");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m37)) {
                    zg0.q2.b(this.f263557a, m37, null, false, 6, null);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://dl/faq", w17)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iz_, java.lang.Integer.valueOf(e3Var.e0().J3()), java.lang.Integer.valueOf(e3Var.e0().fd()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                zg0.q2.b(this.f263557a, string, null, false, 6, null);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://dl/posts", w17)) {
                e3Var.e0().Ri();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://dl/moments", w17)) {
                e3Var.e0().Y2();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
                if (r26.i0.y(w17, "weixin://dl/feedback", false)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e3Var.e0().Ge(w17), "getFeedbackUrl(...)");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://dl/scan", w17)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_scan_report_enter_scene", 27);
                    j45.l.k(e3Var.Y(), "scanner", ".ui.BaseScanUI", intent, false);
                } else {
                    o25.z.m(this.f263558b.m81400x569210f3(), w17);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
            arrayList.add(w17);
            arrayList.add("1");
            arrayList.add(java.lang.String.valueOf(k07));
            java.lang.String stringExtra2 = e3Var.d0().getStringExtra("sentUsername");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            arrayList.add(stringExtra2);
            java.lang.String i17 = e3Var.i();
            if (i17 != null) {
                str = i17;
            }
            arrayList.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(11405, arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "kv report fail, ex = %s", e17.getMessage());
        }
        return true;
    }
}
