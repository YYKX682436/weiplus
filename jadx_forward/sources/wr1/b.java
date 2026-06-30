package wr1;

/* loaded from: classes8.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569752kw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xr1.e item = (xr1.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f564931am1);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.alz);
        r45.yk ykVar = item.f537717d;
        java.lang.String str = ykVar.f472697f;
        if (str != null) {
            c22624x85d69039.b(str);
        }
        textView.setText(ykVar.f472698g);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f564930am0);
        if (ykVar.f472701m == 10) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        int i19 = ykVar.f472701m;
        android.content.Context context = holder.f374654e;
        if (i19 == 7) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 40), i65.a.b(context, 40));
            layoutParams.gravity = 17;
            fq1.e.h(fq1.e.f347040a, imageView, i65.a.b(context, 20), false, false, 12, null);
            frameLayout.addView(imageView, layoutParams);
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78659xc2c7e519);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
            layoutParams2.gravity = 17;
            frameLayout.addView(imageView2, layoutParams2);
            return;
        }
        android.widget.ImageView imageView3 = new android.widget.ImageView(context);
        imageView3.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        fq1.e.h(fq1.e.f347040a, imageView3, i65.a.b(context, 2), false, false, 12, null);
        frameLayout.addView(imageView3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf;
        fVar.f423612c = true;
        fVar.f423610a = true;
        fVar.D = "bizRecentReading";
        n11.a.b().h(ykVar.f472695d, imageView3, fVar.a());
        int i27 = ykVar.f472701m;
        if (i27 == 5) {
            android.widget.ImageView imageView4 = new android.widget.ImageView(context);
            imageView4.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bxo);
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 24), i65.a.b(context, 24));
            layoutParams3.gravity = 17;
            frameLayout.addView(imageView4, layoutParams3);
            return;
        }
        if (i27 == 8) {
            android.widget.ImageView imageView5 = new android.widget.ImageView(context);
            imageView5.setImageResource(com.p314xaae8f345.mm.R.raw.f78655x2affc71c);
            android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 16), i65.a.b(context, 16));
            layoutParams4.gravity = 8388693;
            layoutParams4.setMargins(0, 0, i65.a.b(context, 2), i65.a.b(context, 2));
            frameLayout.addView(imageView5, layoutParams4);
        }
    }
}
