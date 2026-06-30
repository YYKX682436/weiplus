package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f260055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f260056f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb, java.util.List list, android.content.Context context) {
        this.f260056f = activityC18999x8e4b0cb;
        this.f260054d = list;
        this.f260055e = context;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.text.SpannableString spannableString;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c> list = this.f260054d;
        if (list != null) {
            int i17 = 0;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c : list) {
                java.lang.String str = c19091x9511676c.f69223x58802fcb;
                boolean F0 = c19091x9511676c.F0();
                android.content.Context context = this.f260055e;
                at4.k c17 = dt4.b.c(context, str, F0);
                java.lang.String str2 = c17 != null ? c17.f95411a : "";
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                gt4.c1 c1Var = new gt4.c1(str2);
                ((x60.e) fVar).getClass();
                android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u(this, str2, g4Var));
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523) ? "" : c19091x9511676c.f69239x93565523;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69240x24ff0512)) {
                    spannableString = new android.text.SpannableString(str3);
                } else {
                    str3 = str3 + " ";
                    spannableString = new android.text.SpannableString(str3 + c19091x9511676c.f69240x24ff0512);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.v(this, context, c19091x9511676c);
                    int length = str3.length();
                    int length2 = str3.length() + c19091x9511676c.f69240x24ff0512.length();
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
                    spannableString.setSpan(vVar, length, length2, 33);
                }
                android.text.SpannableString spannableString2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString) ? new android.text.SpannableString(c19091x9511676c.f69236x5048ceff) : spannableString;
                java.lang.String str4 = c19091x9511676c.f69233x225aa2b6;
                android.graphics.Bitmap S = d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "i %d fee %s %s", java.lang.Integer.valueOf(i17), str4, spannableString2);
                int i18 = i17 + 1;
                g4Var.r(i17, str4, spannableString2, S != null ? new android.graphics.drawable.BitmapDrawable(S) : null, 0, true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3));
                if (S == null) {
                    this.f260056f.U.put(str2, java.lang.Integer.valueOf(i18));
                }
                i17 = i18;
            }
        }
    }
}
