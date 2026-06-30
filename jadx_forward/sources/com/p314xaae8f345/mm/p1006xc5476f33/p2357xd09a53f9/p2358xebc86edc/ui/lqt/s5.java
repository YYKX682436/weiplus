package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class s5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f259900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259901e;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, hs4.d dVar) {
        this.f259901e = activityC19020x7623dbfb;
        this.f259900d = dVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        android.graphics.Bitmap S;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259901e;
        int size = ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).get(i17);
            at4.k c17 = dt4.b.c(activityC19020x7623dbfb, c19091x9511676c.f69223x58802fcb, c19091x9511676c.F0());
            java.lang.String str = c17 != null ? c17.f95411a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p5(this, str, g4Var));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523) ? "" : c19091x9511676c.f69239x93565523;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69240x24ff0512)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
            } else {
                str2 = str2 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2 + c19091x9511676c.f69240x24ff0512);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q5(this, activityC19020x7623dbfb, c19091x9511676c);
                int length = str2.length();
                int length2 = str2.length() + c19091x9511676c.f69240x24ff0512.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(activityC19020x7623dbfb.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)), length, length2, 33);
                spannableStringBuilder.setSpan(q5Var, length, length2, 33);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableStringBuilder) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69255xfd79664d)) {
                spannableStringBuilder2 = spannableStringBuilder;
            } else {
                spannableStringBuilder2 = new android.text.SpannableStringBuilder(c19091x9511676c.f69255xfd79664d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69253xe8447f03) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69254xf6f9f8d9)) {
                    spannableStringBuilder2.append((java.lang.CharSequence) c19091x9511676c.f69253xe8447f03);
                    spannableStringBuilder2.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r5(this, c19091x9511676c)), c19091x9511676c.f69255xfd79664d.length(), spannableStringBuilder2.length(), 33);
                }
            }
            java.lang.String str3 = c19091x9511676c.f69233x225aa2b6;
            if (c19091x9511676c.v0()) {
                if (c19091x9511676c.O2 >= 0.0d) {
                    str3 = str3 + activityC19020x7623dbfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.key, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(c19091x9511676c.O2));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str3, spannableStringBuilder2);
                g4Var.r(i17, str3, spannableStringBuilder2, activityC19020x7623dbfb.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9), 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
                S = null;
            } else {
                S = d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, activityC19020x7623dbfb.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), activityC19020x7623dbfb.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str3, spannableStringBuilder2);
                g4Var.r(i17, str3, spannableStringBuilder2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
            }
            if (S == null) {
                activityC19020x7623dbfb.K1.put(str, java.lang.Integer.valueOf(i17));
            }
        }
    }
}
