package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem */
/* loaded from: classes4.dex */
public class C12813xe3573f17 extends android.widget.RelativeLayout {
    public C12813xe3573f17(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.content.Context context = getContext();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setId(com.p314xaae8f345.mm.R.id.a0b);
        boolean E = i65.a.E(getContext());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setId(com.p314xaae8f345.mm.R.id.a0d);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        linearLayout.setLayoutParams(layoutParams2);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setId(com.p314xaae8f345.mm.R.id.a0c);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int b17 = E ? i65.a.b(getContext(), 34) : i65.a.b(getContext(), 28);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
        linearLayout.addView(imageView);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setId(com.p314xaae8f345.mm.R.id.a0g);
        textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja) * i65.a.m(getContext()));
        textView.setPadding(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(textView);
        addView(linearLayout);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setId(com.p314xaae8f345.mm.R.id.a0a);
        textView2.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9) * i65.a.m(getContext()));
        textView2.setBackground(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562360dp));
        textView2.setTextAppearance(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576157rv);
        textView2.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(6, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams3.addRule(17, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams3.setMarginStart(E ? i65.a.b(getContext(), -12) : i65.a.b(getContext(), -8));
        textView2.setLayoutParams(layoutParams3);
        addView(textView2);
        android.view.View imageView2 = new android.widget.ImageView(context);
        imageView2.setId(com.p314xaae8f345.mm.R.id.a0f);
        imageView2.setBackground(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.b8i));
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        layoutParams4.addRule(6, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams4.addRule(19, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams4.setMarginEnd(E ? i65.a.b(getContext(), -1) : i65.a.b(getContext(), -3));
        layoutParams4.topMargin = i65.a.b(context, 1);
        imageView2.setLayoutParams(layoutParams4);
        addView(imageView2);
        android.view.View view = new android.view.View(context);
        view.setId(com.p314xaae8f345.mm.R.id.a0e);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        layoutParams5.addRule(18, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams5.addRule(19, com.p314xaae8f345.mm.R.id.a0d);
        layoutParams5.addRule(12, -1);
        view.setLayoutParams(layoutParams5);
        addView(view);
    }

    public C12813xe3573f17(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
