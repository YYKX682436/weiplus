package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p4 f179626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ra f179627e;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p4 p4Var, bw5.ra raVar) {
        this.f179626d = p4Var;
        this.f179627e = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p4 p4Var = this.f179626d;
        p4Var.f179668u.removeAllViews();
        bw5.ra raVar = this.f179627e;
        java.util.LinkedList linkedList = raVar.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = p4Var.f179668u;
            float width = (c1625xd76db8dc.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r5 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                android.widget.ImageView imageView = new android.widget.ImageView(p4Var.f179654d.getContext());
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(i19, i19));
                android.content.Context context = p4Var.f179655e;
                imageView.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78055x8092b181));
                if (n22.l.b(raVar.f113989d)) {
                    n11.a.b().g("", imageView);
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = ri0Var.f466421f;
                    b17.h(str, imageView, y12.f.b(ri0Var.f466425m, str));
                }
                imageView.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78055x8092b181));
                imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l4(p4Var, ri0Var));
                c1625xd76db8dc.addView(imageView);
            }
        }
    }
}
