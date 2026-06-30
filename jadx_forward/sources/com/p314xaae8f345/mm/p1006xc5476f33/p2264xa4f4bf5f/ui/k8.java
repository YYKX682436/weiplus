package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class k8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255565d;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255565d = activityC18639xf6f98078;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255565d;
        boolean z17 = false;
        g4Var.p(com.p314xaae8f345.mm.R.id.jgs, activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jun), activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571945u9), 0);
        g4Var.f(com.p314xaae8f345.mm.R.id.jgx, activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipw));
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi()) {
            activityC18639xf6f98078.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.graphics.drawable.Drawable drawable = activityC18639xf6f98078.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bqx);
            com.p314xaae8f345.mm.ui.uk.f(drawable, android.graphics.Color.parseColor("#F99234"));
            int dimensionPixelSize = activityC18639xf6f98078.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561385h1);
            ak4.a aVar = new ak4.a(drawable, 1);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            spannableStringBuilder.append((char) 8199);
            spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((java.lang.CharSequence) activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gup));
            g4Var.f(com.p314xaae8f345.mm.R.id.jgw, spannableStringBuilder);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g8 d76 = activityC18639xf6f98078.d7();
        if (!d76.f255437f && !android.text.TextUtils.isEmpty(d76.f255433b)) {
            z17 = true;
        }
        if (z17 || activityC18639xf6f98078.F != null) {
            g4Var.d(com.p314xaae8f345.mm.R.id.jgv, activityC18639xf6f98078.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gut));
        }
    }
}
