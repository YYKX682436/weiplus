package com.tencent.mm.plugin.appbrand.widget.tabbar;

/* loaded from: classes4.dex */
public class AppBrandTabBarItem extends android.widget.RelativeLayout {
    public AppBrandTabBarItem(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.content.Context context = getContext();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setId(com.tencent.mm.R.id.a0b);
        boolean E = i65.a.E(getContext());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setId(com.tencent.mm.R.id.a0d);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        linearLayout.setLayoutParams(layoutParams2);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setId(com.tencent.mm.R.id.a0c);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int b17 = E ? i65.a.b(getContext(), 34) : i65.a.b(getContext(), 28);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
        linearLayout.addView(imageView);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setId(com.tencent.mm.R.id.a0g);
        textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479930ja) * i65.a.m(getContext()));
        textView.setPadding(i65.a.f(context, com.tencent.mm.R.dimen.f479646bl), 0, i65.a.f(context, com.tencent.mm.R.dimen.f479646bl), 0);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(textView);
        addView(linearLayout);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setId(com.tencent.mm.R.id.a0a);
        textView2.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479929j9) * i65.a.m(getContext()));
        textView2.setBackground(i65.a.i(context, com.tencent.mm.R.drawable.f480827dp));
        textView2.setTextAppearance(context, com.tencent.mm.R.style.f494624rv);
        textView2.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(6, com.tencent.mm.R.id.a0d);
        layoutParams3.addRule(17, com.tencent.mm.R.id.a0d);
        layoutParams3.setMarginStart(E ? i65.a.b(getContext(), -12) : i65.a.b(getContext(), -8));
        textView2.setLayoutParams(layoutParams3);
        addView(textView2);
        android.view.View imageView2 = new android.widget.ImageView(context);
        imageView2.setId(com.tencent.mm.R.id.a0f);
        imageView2.setBackground(i65.a.i(context, com.tencent.mm.R.drawable.b8i));
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(i65.a.f(context, com.tencent.mm.R.dimen.f479672c9), i65.a.f(context, com.tencent.mm.R.dimen.f479672c9));
        layoutParams4.addRule(6, com.tencent.mm.R.id.a0d);
        layoutParams4.addRule(19, com.tencent.mm.R.id.a0d);
        layoutParams4.setMarginEnd(E ? i65.a.b(getContext(), -1) : i65.a.b(getContext(), -3));
        layoutParams4.topMargin = i65.a.b(context, 1);
        imageView2.setLayoutParams(layoutParams4);
        addView(imageView2);
        android.view.View view = new android.view.View(context);
        view.setId(com.tencent.mm.R.id.a0e);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.f(context, com.tencent.mm.R.dimen.f479646bl));
        layoutParams5.addRule(18, com.tencent.mm.R.id.a0d);
        layoutParams5.addRule(19, com.tencent.mm.R.id.a0d);
        layoutParams5.addRule(12, -1);
        view.setLayoutParams(layoutParams5);
        addView(view);
    }

    public AppBrandTabBarItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
