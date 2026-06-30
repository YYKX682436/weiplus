package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public abstract class i3 {
    public static java.lang.CharSequence a(android.text.Spannable spannable) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr;
        java.lang.String e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannable);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannable) && (z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class)) != null && z0VarArr.length > 0) {
                for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                    if (z0Var.m75731xfb85f7b0() == 1 && (e17 = z0Var.m75727xeff487ef().e()) != null && e17.length() > com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.f() && spannableStringBuilder.toString().contains(e17)) {
                        java.lang.String str = e17.substring(0, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.f()) + "...";
                        android.text.SpannableString spannableString = new android.text.SpannableString(str);
                        spannableString.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0(2, z0Var.m75727xeff487ef()), 0, str.length(), 33);
                        int indexOf = spannableStringBuilder.toString().indexOf(e17);
                        spannableStringBuilder.replace(indexOf, e17.length() + indexOf, (java.lang.CharSequence) spannableString);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsPostDescUtil", "compressedPostDesc fail:%s", spannable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return spannableStringBuilder;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 b(android.content.Context context, java.lang.String str, float f17, java.lang.Object obj, long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(ga4.m.f(j17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, true, str, (int) f17, i17, obj, null, -1, true), 0, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return f0Var;
    }
}
