package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class x2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234294e;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, java.util.List list) {
        this.f234294e = activityC16764xd1ab6b38;
        this.f234293d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v26, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence] */
    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        java.lang.String str2;
        ?? spannableStringBuilder;
        java.lang.String str3;
        java.lang.String str4;
        at4.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x2 x2Var = this;
        g4Var.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "mmBottomSheet list show");
        int i17 = 0;
        while (true) {
            java.util.List list = x2Var.f234293d;
            if (i17 >= list.size()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            java.lang.String str5 = c19091x9511676c.f69223x58802fcb;
            if (android.text.TextUtils.isEmpty(yo3.m.f545691e)) {
                str = to3.c0.Ai().Ni(196615);
                yo3.m.f545691e = str;
            } else {
                str = yo3.m.f545691e;
            }
            java.util.LinkedList p17 = yo3.m.p(str);
            java.lang.String str6 = "";
            if (p17 != null) {
                for (int i18 = 0; i18 < p17.size(); i18++) {
                    yo3.l lVar = (yo3.l) p17.get(i18);
                    if (lVar != null && str5.equals(lVar.f545685a)) {
                        str2 = lVar.f545686b;
                        break;
                    }
                }
            }
            str2 = "";
            if (c19091x9511676c.D0() && (kVar = c19091x9511676c.f261095a3) != null) {
                str2 = kVar.f95411a;
            }
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            gt4.c1 c1Var = new gt4.c1(str2);
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(c1Var);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u2(x2Var, str2, g4Var));
            java.lang.String str7 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523) ? c19091x9511676c.f69239x93565523 : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) && !c19091x9511676c.f69260x2a326a79) {
                str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69250xdd49e65e) ? "" : c19091x9511676c.f69250xdd49e65e;
            }
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69240x24ff0512);
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = x2Var.f234294e;
            if (K0) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str7);
            } else {
                java.lang.String str8 = str7 + " ";
                spannableStringBuilder = new android.text.SpannableStringBuilder(str8 + c19091x9511676c.f69240x24ff0512);
                com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.v2(x2Var, activityC16764xd1ab6b38, c19091x9511676c);
                int length = str8.length();
                int length2 = str8.length() + c19091x9511676c.f69240x24ff0512.length();
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(activityC16764xd1ab6b38.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
                spannableStringBuilder.setSpan(v2Var, length, length2, 33);
                str7 = str8;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableStringBuilder) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69255xfd79664d)) {
                str3 = spannableStringBuilder;
            } else {
                ?? spannableStringBuilder2 = new android.text.SpannableStringBuilder(c19091x9511676c.f69255xfd79664d);
                str3 = spannableStringBuilder2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69253xe8447f03)) {
                    str3 = spannableStringBuilder2;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69254xf6f9f8d9)) {
                        spannableStringBuilder2.append(c19091x9511676c.f69253xe8447f03);
                        spannableStringBuilder2.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.w2(x2Var, c19091x9511676c)), c19091x9511676c.f69255xfd79664d.length(), spannableStringBuilder2.length(), 33);
                        str3 = spannableStringBuilder2;
                    }
                }
            }
            if (!c19091x9511676c.v0() && !c19091x9511676c.D0()) {
                str4 = c19091x9511676c.f69233x225aa2b6;
            } else if (c19091x9511676c.O2 < 0.0d) {
                str4 = c19091x9511676c.f69233x225aa2b6;
            } else {
                str4 = c19091x9511676c.f69233x225aa2b6 + activityC16764xd1ab6b38.getString(com.p314xaae8f345.mm.R.C30867xcad56011.key, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(c19091x9511676c.O2));
            }
            android.graphics.drawable.Drawable e17 = c19091x9511676c.A0() ? m95.a.e(activityC16764xd1ab6b38.getResources(), com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3, 0.0f) : d17 != null ? new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, activityC16764xd1ab6b38.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), activityC16764xd1ab6b38.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)) : null;
            if (e17 == null) {
                activityC16764xd1ab6b38.f234072v2.put(str2, java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "can choose list：i %d fee %s %s，status:%s", java.lang.Integer.valueOf(i17), str4, str3, java.lang.Integer.valueOf(c19091x9511676c.f69232xff761ac5));
            if (c19091x9511676c.z0()) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16764xd1ab6b38.mo55332x76847179();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, str4);
                java.lang.String str9 = str3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f261109o3)) {
                        str9 = c19091x9511676c.f261109o3;
                    }
                    g4Var.r(i17, i19, str6, e17, 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7));
                }
                str6 = str9;
                g4Var.r(i17, i19, str6, e17, 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7));
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16764xd1ab6b38.mo55332x76847179();
                ((ke0.e) xVar2).getClass();
                g4Var.r(i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471792, str4), str3, e17, 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7));
            }
            i17++;
            x2Var = this;
        }
    }
}
