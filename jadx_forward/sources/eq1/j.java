package eq1;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.j f337354a = new eq1.j();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f337355b = jz5.h.b(eq1.i.f337352d);

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = d();
        d17.remove(c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDigestUtil", "clearFusionDigest ret: " + d17);
    }

    public final long b() {
        return d().q("biz_digest_notify_updated_time", 0L);
    }

    public final java.lang.String c() {
        return gm0.j1.b().j() + "_BizFusionSummaryContent";
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f337355b).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(int r21, android.content.Context r22, com.p314xaae8f345.mm.p2621x8fb0427b.l4 r23) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.j.e(int, android.content.Context, com.tencent.mm.storage.l4):java.lang.CharSequence");
    }

    public final android.text.SpannableString f(int i17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bxr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        drawable.setBounds(0, 0, i17, i17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        return spannableString;
    }

    public final boolean g() {
        byte[] j17 = d().j(c());
        if (j17 == null) {
            return false;
        }
        if (!(j17.length == 0)) {
            try {
                new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5().mo11468x92b714fd(j17);
            } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String h(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("<(/)?([a-zA-Z0-9_]+)(\\s+[^>]*?)?>", 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.util.regex.Matcher matcher = compile.matcher(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "");
        }
        matcher.appendTail(stringBuffer);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final java.lang.CharSequence i(android.content.Context context, java.util.Map map, java.lang.String str, int i17) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".font_bold");
        java.lang.String str3 = (java.lang.String) map.get(str + ".content");
        if (str3 == null) {
            return null;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString n17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, str3, i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "1")) {
            n17.setSpan(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2645x35f74a.C21582xa2132865(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)), 0, n17.length(), 17);
        }
        return n17;
    }

    public final void j() {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17;
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (Di == null || (p17 = Di.p("officialaccounts")) == null) {
            return;
        }
        p17.c2(2048);
        Di.W(p17, p17.h1());
    }

    public final void k(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5 e5Var) {
        if (e5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDigestUtil", "updateFusionDigest fusionSummary is null");
            return;
        }
        byte[] mo14344x5f01b1f6 = e5Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        if (mo14344x5f01b1f6.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizDigestUtil", "updateFusionDigest with empty fusionSummary");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDigestUtil", "updateFusionDigest ret: " + d().H(c(), mo14344x5f01b1f6));
    }
}
