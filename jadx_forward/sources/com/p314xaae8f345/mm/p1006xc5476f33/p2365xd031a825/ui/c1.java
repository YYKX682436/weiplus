package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f261696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f261697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f261698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f261699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f261700h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f261701i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261702m;

    public c1(java.util.List list, android.content.Context context, java.util.HashMap hashMap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, boolean z17, boolean z18, java.lang.String str) {
        this.f261696d = list;
        this.f261697e = context;
        this.f261698f = hashMap;
        this.f261699g = k0Var;
        this.f261700h = z17;
        this.f261701i = z18;
        this.f261702m = str;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        at4.k c17;
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        int i17;
        int i18 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c : this.f261696d) {
            if (c19091x9511676c.D0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95537m;
                c17 = c19091x9511676c2 != null ? c19091x9511676c2.f261095a3 : null;
            } else {
                c17 = dt4.b.c(this.f261697e, c19091x9511676c.f69223x58802fcb, c19091x9511676c.F0());
            }
            java.lang.String str = c17 != null ? c17.f95411a : "";
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z0(this, str, g4Var));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523) ? "" : c19091x9511676c.f69239x93565523;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69240x24ff0512)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
            } else {
                str2 = str2 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str2 + c19091x9511676c.f69240x24ff0512);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a1(this, this.f261697e, c19091x9511676c);
                int length = str2.length();
                int length2 = str2.length() + c19091x9511676c.f69240x24ff0512.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f261697e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
                spannableStringBuilder.setSpan(a1Var, length, length2, 33);
            }
            if (this.f261700h && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableStringBuilder) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69236x5048ceff)) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(c19091x9511676c.f69236x5048ceff);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableStringBuilder) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69255xfd79664d)) {
                spannableStringBuilder2 = spannableStringBuilder;
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(c19091x9511676c.f69255xfd79664d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69253xe8447f03) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69254xf6f9f8d9)) {
                    spannableStringBuilder3.append((java.lang.CharSequence) c19091x9511676c.f69253xe8447f03);
                    spannableStringBuilder3.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b1(this, c19091x9511676c)), c19091x9511676c.f69255xfd79664d.length(), spannableStringBuilder3.length(), 33);
                }
                spannableStringBuilder2 = spannableStringBuilder3;
            }
            java.lang.String str3 = c19091x9511676c.f69233x225aa2b6;
            android.graphics.Bitmap S = d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, this.f261697e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), this.f261697e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false) : null;
            if (S == null) {
                this.f261698f.put(str, java.lang.Integer.valueOf(i18));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardBottomSheetHelper", "i %d fee %s %s", java.lang.Integer.valueOf(i18), str3, spannableStringBuilder2);
            if (c19091x9511676c.v0()) {
                i17 = i18 + 1;
                g4Var.r(i18, str3, spannableStringBuilder2, this.f261697e.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9), 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
            } else {
                i17 = i18 + 1;
                g4Var.r(i18, str3, spannableStringBuilder2, S == null ? null : new android.graphics.drawable.BitmapDrawable(S), 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
            }
            i18 = i17;
        }
        if (!this.f261701i || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261702m)) {
            return;
        }
        g4Var.s(i18, this.f261702m, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ch6), false);
    }
}
