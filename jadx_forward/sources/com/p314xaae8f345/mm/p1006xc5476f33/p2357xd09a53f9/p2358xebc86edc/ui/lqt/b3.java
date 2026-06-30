package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class b3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f259636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259637e;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, java.util.List list) {
        this.f259637e = activityC19014x45f83936;
        this.f259636d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.text.SpannableString spannableString;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b3 b3Var = this;
        java.util.List list = b3Var.f259636d;
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            java.lang.String str = c19091x9511676c.f69223x58802fcb;
            boolean F0 = c19091x9511676c.F0();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = b3Var.f259637e;
            at4.k c17 = dt4.b.c(activityC19014x45f83936, str, F0);
            java.lang.String str2 = c17 != null ? c17.f95411a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str2);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z2(b3Var, str2, g4Var));
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523) ? "" : c19091x9511676c.f69239x93565523;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69240x24ff0512)) {
                spannableString = new android.text.SpannableString(str3);
            } else {
                str3 = str3 + " ";
                spannableString = new android.text.SpannableString(str3 + c19091x9511676c.f69240x24ff0512);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a3 a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a3(b3Var, activityC19014x45f83936);
                int length = str3.length();
                int length2 = str3.length() + c19091x9511676c.f69240x24ff0512.length();
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(activityC19014x45f83936.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
                spannableString.setSpan(a3Var, length, length2, 33);
            }
            android.text.SpannableString spannableString2 = spannableString;
            java.lang.String str4 = c19091x9511676c.f69233x225aa2b6;
            if (c19091x9511676c.v0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                g4Var.s(i17, str4, spannableString2, activityC19014x45f83936.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9), true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3));
                bitmap = null;
            } else {
                android.graphics.Bitmap S = d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, activityC19014x45f83936.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), activityC19014x45f83936.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                g4Var.r(i17, str4, spannableString2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3));
                bitmap = S;
            }
            if (bitmap == null) {
                activityC19014x45f83936.f259524p0.put(str2, java.lang.Integer.valueOf(i17));
            }
            i17++;
            b3Var = this;
        }
    }
}
