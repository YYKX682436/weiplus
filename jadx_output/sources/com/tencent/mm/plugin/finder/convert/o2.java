package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.flexbox.FlexboxLayout f104142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.m0 f104143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q2 f104145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104146h;

    public o2(com.google.android.flexbox.FlexboxLayout flexboxLayout, so2.m0 m0Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.q2 q2Var, java.lang.String str) {
        this.f104142d = flexboxLayout;
        this.f104143e = m0Var;
        this.f104144f = s0Var;
        this.f104145g = q2Var;
        this.f104146h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.flexbox.FlexboxLayout flexboxLayout = this.f104142d;
        flexboxLayout.removeAllViews();
        java.util.LinkedList linkedList = this.f104143e.f410478d.G;
        kotlin.jvm.internal.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            float width = (flexboxLayout.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r3 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                in5.s0 s0Var = this.f104144f;
                android.widget.ImageView imageView = new android.widget.ImageView(s0Var.f293121e);
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.google.android.flexbox.FlexboxLayout.LayoutParams(i19, i19));
                n11.a b17 = n11.a.b();
                java.lang.String str = ri0Var.f384888f;
                com.tencent.mm.feature.emoji.api.u5 u5Var = (com.tencent.mm.feature.emoji.api.u5) i95.n0.c(com.tencent.mm.feature.emoji.api.u5.class);
                java.lang.String str2 = ri0Var.f384892m;
                java.lang.String str3 = ri0Var.f384888f;
                ((com.tencent.mm.feature.emoji.i0) u5Var).getClass();
                b17.h(str, imageView, y12.f.b(str2, str3));
                imageView.setBackground(s0Var.f293121e.getDrawable(com.tencent.mm.R.drawable.emoji_store_designer_pack_list_item_for_finder_image_background));
                imageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.n2(s0Var, ri0Var, this.f104145g, this.f104146h));
                flexboxLayout.addView(imageView);
            }
        }
    }
}
