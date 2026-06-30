package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class eu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f184823e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.l f184824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f184825g;

    public eu(boolean z17, jz5.l lVar) {
        int i17;
        this.f184823e = z17;
        this.f184824f = lVar;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z18 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        this.f184825g = i18;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7h;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ms2.b item = (ms2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566460fz0);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567997lb1);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567996lb0);
        boolean z18 = this.f184823e;
        android.content.Context context = holder.f374654e;
        int dimensionPixelSize = (this.f184825g - (z18 ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561257dg) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl))) / 2;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561219cl);
        if (dimensionPixelSize > dimensionPixelOffset) {
            dimensionPixelSize = dimensionPixelOffset;
        }
        if (dimensionPixelSize > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.setLayoutParams(layoutParams);
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        r45.vx0 vx0Var = item.f412501d;
        mn2.q3 q3Var = new mn2.q3(vx0Var.m75945x2fec8307(3), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411486d));
        textView.setText(vx0Var.m75945x2fec8307(1));
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0a, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(4))));
        if (this.f184824f == null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "audio_collection_card");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.du(holder, item));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 25496);
        } else {
            android.view.View view = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            dy1.a.i(view, "biz_aduio_colle_page_content");
            dy1.a.l(view, 40, 29426);
            dy1.a.a(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cu(item, this));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
