package uw;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.g f513025a = new uw.g();

    public final java.lang.CharSequence a(java.lang.CharSequence msgContent, int i17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!zv.q.f557612a.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceDigestUtil", "[BS]getOfficialAccountsFusionDigest box switch is false");
            return msgContent;
        }
        java.lang.String obj = msgContent.toString();
        if (!r26.n0.D(obj, "{{HEART}}", false, 2, null)) {
            return msgContent;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(obj);
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int L = r26.n0.L(obj, "{{HEART}}", i18, false, 4, null);
            if (L == -1) {
                break;
            }
            int i27 = i19 + 1;
            if (i19 >= 10) {
                break;
            }
            i18 = L + 9;
            spannableStringBuilder.replace(L, i18, (java.lang.CharSequence) " ");
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78628xa6fb0b7e : com.p314xaae8f345.mm.R.raw.f78627x4310e53a, context.getTheme());
            drawable.setBounds(0, 0, i17, i17);
            spannableStringBuilder.setSpan(new al5.w(drawable, 1), L, L + 1, 33);
            i19 = i27;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceDigestUtil", "replace digest : " + ((java.lang.Object) spannableStringBuilder));
        return spannableStringBuilder;
    }

    public final long b(long j17, long j18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j19 = 1000 * j17;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime: svrBoxTime (" + j17 + ") is 0. Replacing with currentTimestamp (" + currentTimeMillis + ").");
            return currentTimeMillis;
        }
        bw5.d5 d5Var = bw5.d5.EcsBrandTimelineBoxDisplayTimeErr;
        if (j19 > currentTimeMillis) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime FAILED: svrBoxTime (" + j17 + ") is invalid (svrBoxTime > currentTimestamp). Replacing with currentTimestamp (" + currentTimeMillis + ").");
            y02.v0 a17 = y02.x0.f540167d.a();
            if (a17 != null) {
                a17.p1(d5Var, 1, java.lang.String.valueOf(j17));
            }
            return currentTimeMillis;
        }
        if (j19 >= j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime SUCCESS. svrBoxTime (" + j19 + ") is valid and returned.");
            return j19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime FAILED: svrBoxTime (" + j17 + ") is invalid (svrBoxTime < localBoxTime). Replacing with localBoxTime (" + j18 + ").");
        y02.v0 a18 = y02.x0.f540167d.a();
        if (a18 != null) {
            a18.p1(d5Var, 2, java.lang.String.valueOf(j17));
        }
        return j18;
    }
}
