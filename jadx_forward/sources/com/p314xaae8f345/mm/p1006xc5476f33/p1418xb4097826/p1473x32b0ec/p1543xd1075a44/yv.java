package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yv {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f202007a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f202008b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f202009c;

    public yv(android.content.Context context, android.view.ViewGroup rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f202007a = textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        this.f202008b = c22699x3dcdb352;
        this.f202009c = "";
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        textView.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561130a7));
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8x);
        textView.setPadding(ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10.0f), textView.getPaddingTop(), ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10.0f), textView.getPaddingBottom());
        android.content.res.Resources resources = context.getResources();
        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79678x41464de0, resources != null ? resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d) : -1));
        if (rootView instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 150.0f);
            rootView.addView(textView, layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
            layoutParams2.topMargin = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 150.0f);
            rootView.addView(c22699x3dcdb352, layoutParams2);
        } else {
            rootView.addView(textView);
            rootView.addView(c22699x3dcdb352);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        int dimensionPixelOffset = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562001ys));
        if (dimensionPixelOffset > 0) {
            layoutParams3.width = dimensionPixelOffset;
        }
        if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        textView.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xv(this, context));
    }
}
