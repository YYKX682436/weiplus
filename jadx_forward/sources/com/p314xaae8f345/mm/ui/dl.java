package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class dl {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f289878a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f289879b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f289880c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f289881d;

    static {
        java.lang.Object[] objArr = {java.lang.Float.valueOf(1.65f), java.lang.Float.valueOf(1.55f), java.lang.Float.valueOf(1.4f), java.lang.Float.valueOf(1.125f), java.lang.Float.valueOf(1.12f), java.lang.Float.valueOf(1.1f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(0.8f)};
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        for (int i17 = 0; i17 < 8; i17++) {
            java.lang.Object obj = objArr[i17];
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        f289881d = java.util.Collections.unmodifiableList(arrayList);
    }

    public static void a(android.widget.LinearLayout linearLayout, int i17) {
        for (int i18 = 0; i18 < linearLayout.getChildCount(); i18++) {
            android.view.View childAt = linearLayout.getChildAt(i18);
            if ((childAt.getTag(com.p314xaae8f345.mm.R.id.vc_) instanceof java.lang.Integer) && ((java.lang.Integer) childAt.getTag(com.p314xaae8f345.mm.R.id.vc_)).intValue() == com.p314xaae8f345.mm.R.C30864xbddafb2a.c_6) {
                android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.obc);
                int e17 = (i17 * 2) - com.p314xaae8f345.mm.ui.zk.e(linearLayout.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                android.text.TextPaint paint = textView.getPaint();
                java.lang.String charSequence = textView.getText().toString();
                float f17 = e17;
                if (paint.measureText(charSequence) > f17) {
                    float textSize = textView.getTextSize();
                    textView.getContext();
                    float f18 = textSize / com.p314xaae8f345.mm.ui.zk.f294171b;
                    int i19 = 0;
                    while (true) {
                        java.util.List list = f289881d;
                        if (i19 < list.size()) {
                            float floatValue = ((java.lang.Float) list.get(i19)).floatValue() * f18;
                            paint.setTextSize(floatValue);
                            if (paint.measureText(charSequence) <= f17) {
                                textView.setTextSize(0, floatValue);
                                textView.setText(charSequence);
                                break;
                            }
                            i19++;
                        }
                    }
                }
            }
        }
    }

    public static int b(android.widget.LinearLayout linearLayout, int i17, int i18) {
        if (i17 == i18) {
            return i18;
        }
        for (int i19 = 0; i19 < linearLayout.getChildCount(); i19++) {
            android.view.View childAt = linearLayout.getChildAt(i19);
            if ((childAt.getTag(com.p314xaae8f345.mm.R.id.vc_) instanceof java.lang.Integer) && ((java.lang.Integer) childAt.getTag(com.p314xaae8f345.mm.R.id.vc_)).intValue() == com.p314xaae8f345.mm.R.C30864xbddafb2a.c_6) {
                android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.obc);
                int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
                if (measureText > i17) {
                    i17 = measureText < i18 ? measureText : i18;
                }
            }
        }
        return i17;
    }

    public static android.graphics.Path c(android.graphics.RectF rectF, float f17, float f18, float f19, float f27, float f28) {
        float f29;
        float f37;
        float f38;
        float f39;
        float f47;
        float f48;
        float f49;
        float f57;
        android.graphics.Path path = new android.graphics.Path();
        float f58 = f17 < 0.0f ? 0.0f : f17;
        float f59 = f18 < 0.0f ? 0.0f : f18;
        float f66 = f27 < 0.0f ? 0.0f : f27;
        float f67 = f19 < 0.0f ? 0.0f : f19;
        float min = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
        float width = rectF.width();
        float height = rectF.height();
        float min2 = java.lang.Math.min(f59, min);
        float f68 = f28 + 1.0f;
        float min3 = java.lang.Math.min(f68 * min2, min);
        float f69 = min / 2.0f;
        if (f59 <= f69) {
            f37 = (1.0f - f28) * 90.0f;
            f29 = f28 * 45.0f;
        } else {
            float f76 = 1.0f - ((min2 - f69) / f69);
            f29 = f76 * f28 * 45.0f;
            f37 = (1.0f - (f28 * f76)) * 90.0f;
        }
        float f77 = (90.0f - f37) / 2.0f;
        double d17 = min2;
        float f78 = f58;
        float tan = (float) (java.lang.Math.tan((f77 / 2.0f) * 0.017453292f) * d17);
        float sin = (float) (java.lang.Math.sin((f37 / 2.0f) * 0.017453292f) * d17 * java.lang.Math.sqrt(2.0d));
        double d18 = f29 * 0.017453292f;
        float cos = (float) (tan * java.lang.Math.cos(d18));
        float tan2 = (float) (cos * java.lang.Math.tan(d18));
        float f79 = (((min3 - sin) - cos) - tan2) / 3.0f;
        float f86 = width / 2.0f;
        path.moveTo(java.lang.Math.max(f86, width - min3), 0.0f);
        float f87 = min3 - (f79 * 2.0f);
        float f88 = f87 - f79;
        path.cubicTo(width - f87, 0.0f, width - f88, 0.0f, width - (f88 - cos), tan2);
        float f89 = min2 * 2.0f;
        path.arcTo(new android.graphics.RectF(width - f89, 0.0f, width, f89), f77 + 270.0f, 90.0f - (f77 * 2.0f), false);
        float f96 = height / 2.0f;
        path.cubicTo(width, f88, width, f87, width, java.lang.Math.min(f96, min3));
        float min4 = java.lang.Math.min(f67, min);
        float min5 = java.lang.Math.min(f68 * min4, min);
        if (f67 <= f69) {
            f39 = (1.0f - f28) * 90.0f;
            f38 = f28 * 45.0f;
        } else {
            float f97 = 1.0f - ((min4 - f69) / f69);
            f38 = f97 * f28 * 45.0f;
            f39 = (1.0f - (f28 * f97)) * 90.0f;
        }
        float f98 = (90.0f - f39) / 2.0f;
        double d19 = min4;
        float tan3 = (float) (java.lang.Math.tan((f98 / 2.0f) * 0.017453292f) * d19);
        float sin2 = (float) (java.lang.Math.sin((f39 / 2.0f) * 0.017453292f) * d19 * java.lang.Math.sqrt(2.0d));
        double d27 = f38 * 0.017453292f;
        float cos2 = (float) (tan3 * java.lang.Math.cos(d27));
        float tan4 = (float) (cos2 * java.lang.Math.tan(d27));
        float f99 = (((min5 - sin2) - cos2) - tan4) / 3.0f;
        path.lineTo(width, java.lang.Math.max(f96, height - min5));
        float f100 = min5 - (f99 * 2.0f);
        float f101 = f100 - f99;
        path.cubicTo(width, height - f100, width, height - f101, width - tan4, height - (f101 - cos2));
        float f102 = min4 * 2.0f;
        path.arcTo(new android.graphics.RectF(width - f102, height - f102, width, height), f98 + 0.0f, 90.0f - (f98 * 2.0f), false);
        path.cubicTo(width - f101, height, width - f100, height, java.lang.Math.max(f86, width - min5), height);
        float min6 = java.lang.Math.min(f66, min);
        float min7 = java.lang.Math.min(f68 * min6, min);
        if (f66 <= f69) {
            f48 = (1.0f - f28) * 90.0f;
            f47 = f28 * 45.0f;
        } else {
            float f103 = 1.0f - ((min6 - f69) / f69);
            f47 = f103 * f28 * 45.0f;
            f48 = (1.0f - (f28 * f103)) * 90.0f;
        }
        float f104 = (90.0f - f48) / 2.0f;
        double d28 = min6;
        float tan5 = (float) (java.lang.Math.tan((f104 / 2.0f) * 0.017453292f) * d28);
        float sin3 = (float) (java.lang.Math.sin((f48 / 2.0f) * 0.017453292f) * d28 * java.lang.Math.sqrt(2.0d));
        double d29 = f47 * 0.017453292f;
        float cos3 = (float) (tan5 * java.lang.Math.cos(d29));
        float tan6 = (float) (cos3 * java.lang.Math.tan(d29));
        float f105 = (((min7 - sin3) - cos3) - tan6) / 3.0f;
        path.lineTo(java.lang.Math.min(f86, min7), height);
        float f106 = min7 - (f105 * 2.0f);
        float f107 = f106 - f105;
        path.cubicTo(f106, height, f107, height, f107 - cos3, height - tan6);
        float f108 = min6 * 2.0f;
        path.arcTo(new android.graphics.RectF(0.0f, height - f108, f108, height), f104 + 90.0f, 90.0f - (f104 * 2.0f), false);
        path.cubicTo(0.0f, height - f107, 0.0f, height - f106, 0.0f, java.lang.Math.max(f96, height - min7));
        float min8 = java.lang.Math.min(f78, min);
        float min9 = java.lang.Math.min(f68 * min8, min);
        if (f78 <= f69) {
            f49 = (1.0f - f28) * 90.0f;
            f57 = f28 * 45.0f;
        } else {
            float f109 = 1.0f - ((min8 - f69) / f69);
            f49 = (1.0f - (f28 * f109)) * 90.0f;
            f57 = f109 * f28 * 45.0f;
        }
        float f110 = (90.0f - f49) / 2.0f;
        double d37 = min8;
        float tan7 = (float) (java.lang.Math.tan((f110 / 2.0f) * 0.017453292f) * d37);
        float sin4 = (float) (java.lang.Math.sin((f49 / 2.0f) * 0.017453292f) * d37 * java.lang.Math.sqrt(2.0d));
        double d38 = f57 * 0.017453292f;
        float cos4 = (float) (tan7 * java.lang.Math.cos(d38));
        float tan8 = (float) (cos4 * java.lang.Math.tan(d38));
        float f111 = (((min9 - sin4) - cos4) - tan8) / 3.0f;
        path.lineTo(0.0f, java.lang.Math.min(f96, min9));
        float f112 = min9 - (f111 * 2.0f);
        float f113 = f112 - f111;
        path.cubicTo(0.0f, f112, 0.0f, f113, tan8, f113 - cos4);
        float f114 = min8 * 2.0f;
        path.arcTo(new android.graphics.RectF(0.0f, 0.0f, f114, f114), f110 + 180.0f, 90.0f - (f110 * 2.0f), false);
        path.cubicTo(f113, 0.0f, f112, 0.0f, java.lang.Math.min(f86, min9), 0.0f);
        path.lineTo(java.lang.Math.max(f86, width - min9), 0.0f);
        path.close();
        return path;
    }

    public static android.graphics.Point d(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static int e(android.content.Context context) {
        int identifier;
        if (!f(context) || (identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) <= 0) {
            return 0;
        }
        return android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
    }

    public static boolean f(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point d17 = d(context);
        return java.lang.Math.max(d17.y, d17.x) > java.lang.Math.max(point.y, point.x);
    }

    public static boolean g() {
        if (f289880c == null) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            f289880c = java.lang.Boolean.valueOf(!android.text.TextUtils.isEmpty(str) && str.equalsIgnoreCase("xiaomi"));
        }
        return f289880c.booleanValue();
    }

    public static void h(android.widget.LinearLayout linearLayout, int i17) {
        android.view.View findViewById;
        for (int i18 = 0; i18 < linearLayout.getChildCount(); i18++) {
            android.view.View childAt = linearLayout.getChildAt(i18);
            if ((childAt.getTag(com.p314xaae8f345.mm.R.id.vc_) instanceof java.lang.Integer) && ((java.lang.Integer) childAt.getTag(com.p314xaae8f345.mm.R.id.vc_)).intValue() == com.p314xaae8f345.mm.R.C30864xbddafb2a.c_6 && (findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.cg7)) != null) {
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = i17;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public static void i(android.graphics.Paint paint) {
        if (paint == null) {
            return;
        }
        if (f289878a) {
            paint.setFakeBoldText(true);
        } else {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(0.8f);
        }
    }
}
