package mc5;

/* loaded from: classes9.dex */
public final class q implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public boolean Fc(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 sourceImgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceImgInfo, "sourceImgInfo");
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Qe).mo141623x754a37bb()).r()).booleanValue() && sourceImgInfo.f152792e == 12) {
            java.lang.String str = sourceImgInfo.f152791d;
            if (c(str) || b(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public void Ob(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256, boolean z17) {
        if (c11126xa77ef256 != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ya2.e1 e1Var = ya2.e1.f542005a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e1Var.p(context, c11126xa77ef256.f152791d, false, z17 ? 3 : 2, 51);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public void Y9(java.lang.String eventId, java.lang.String imgSourceUrl, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgSourceUrl, "imgSourceUrl");
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).ij(eventId, imgSourceUrl, i17, zy2.oa.f559055f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public java.lang.String Ze(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256) {
        return f(c11126xa77ef256);
    }

    public final boolean b(java.lang.String str) {
        java.lang.String str2 = "";
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter(dm.i4.f66875xa013b0d5);
            if (queryParameter != null) {
                str2 = queryParameter;
            }
        } catch (java.lang.UnsupportedOperationException unused) {
        }
        return str2.length() > 0;
    }

    public final boolean c(java.lang.String str) {
        java.lang.String str2 = "";
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("feedid");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
        } catch (java.lang.UnsupportedOperationException unused) {
        }
        return str2.length() > 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public java.lang.String dd(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256) {
        return f(c11126xa77ef256);
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256) {
        if (c11126xa77ef256 == null) {
            return "";
        }
        java.lang.String str = c11126xa77ef256.f152791d;
        if (c(str)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nif);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (!b(str)) {
            return "";
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1
    public java.lang.String ge(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256) {
        if (c11126xa77ef256 == null) {
            return "";
        }
        java.lang.String str = c11126xa77ef256.f152791d;
        if (c(str)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (!b(str)) {
            return "";
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
