package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes15.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc f185675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.m0 f185676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q2 f185678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185679h;

    public o2(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc, so2.m0 m0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q2 q2Var, java.lang.String str) {
        this.f185675d = c1625xd76db8dc;
        this.f185676e = m0Var;
        this.f185677f = s0Var;
        this.f185678g = q2Var;
        this.f185679h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = this.f185675d;
        c1625xd76db8dc.removeAllViews();
        java.util.LinkedList linkedList = this.f185676e.f492011d.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            float width = (c1625xd76db8dc.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r3 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                in5.s0 s0Var = this.f185677f;
                android.widget.ImageView imageView = new android.widget.ImageView(s0Var.f374654e);
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(i19, i19));
                n11.a b17 = n11.a.b();
                java.lang.String str = ri0Var.f466421f;
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5 u5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5.class);
                java.lang.String str2 = ri0Var.f466425m;
                java.lang.String str3 = ri0Var.f466421f;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i0) u5Var).getClass();
                b17.h(str, imageView, y12.f.b(str2, str3));
                imageView.setBackground(s0Var.f374654e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78055x8092b181));
                imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n2(s0Var, ri0Var, this.f185678g, this.f185679h));
                c1625xd76db8dc.addView(imageView);
            }
        }
    }
}
