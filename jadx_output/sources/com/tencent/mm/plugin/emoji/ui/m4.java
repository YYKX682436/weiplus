package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.p4 f98093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ra f98094e;

    public m4(com.tencent.mm.plugin.emoji.ui.p4 p4Var, bw5.ra raVar) {
        this.f98093d = p4Var;
        this.f98094e = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emoji.ui.p4 p4Var = this.f98093d;
        p4Var.f98135u.removeAllViews();
        bw5.ra raVar = this.f98094e;
        java.util.LinkedList linkedList = raVar.G;
        kotlin.jvm.internal.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            com.google.android.flexbox.FlexboxLayout flexboxLayout = p4Var.f98135u;
            float width = (flexboxLayout.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r5 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                android.widget.ImageView imageView = new android.widget.ImageView(p4Var.f98121d.getContext());
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.google.android.flexbox.FlexboxLayout.LayoutParams(i19, i19));
                android.content.Context context = p4Var.f98122e;
                imageView.setBackground(context.getDrawable(com.tencent.mm.R.drawable.emoji_store_designer_pack_list_item_for_finder_image_background));
                if (n22.l.b(raVar.f32456d)) {
                    n11.a.b().g("", imageView);
                    imageView.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = ri0Var.f384888f;
                    b17.h(str, imageView, y12.f.b(ri0Var.f384892m, str));
                }
                imageView.setBackground(context.getDrawable(com.tencent.mm.R.drawable.emoji_store_designer_pack_list_item_for_finder_image_background));
                imageView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.l4(p4Var, ri0Var));
                flexboxLayout.addView(imageView);
            }
        }
    }
}
