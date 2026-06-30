package cm5;

/* loaded from: classes5.dex */
public final class l extends cm5.m {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f124975f;

    /* renamed from: g, reason: collision with root package name */
    public final int f124976g;

    /* renamed from: h, reason: collision with root package name */
    public final int f124977h;

    /* renamed from: i, reason: collision with root package name */
    public final int f124978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f124975f = "MicroMsg.StickerTextBitmapMaker";
        this.f124976g = -2130706433;
        this.f124977h = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562067ag0);
        this.f124978i = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562068ag1);
        this.f124981b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
    }

    @Override // cm5.m
    public com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 b() {
        com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94 = new com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94(this.f124980a, null);
        c22810x4e74aa94.m82758x33475b62(this.f124976g);
        return c22810x4e74aa94;
    }

    @Override // cm5.m
    public android.graphics.Bitmap c(android.text.SpannableString spannableString, int i17, int i18, boolean z17, boolean z18) {
        android.graphics.Bitmap createBitmap;
        com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 b17 = b();
        int i19 = this.f124977h;
        int i27 = this.f124978i;
        b17.setPadding(i19, i27, i19, i27);
        b17.setTextColor(i17);
        b17.mo82626x630fd73d(i18);
        b17.setTextSize(1, this.f124981b);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = cm5.m.f124979e / 1.3f;
        ((ke0.e) xVar).getClass();
        b17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f124980a, spannableString, f17));
        b17.setSingleLine(false);
        if (!(this.f124982c.length() > 0)) {
            b17.setTypeface(b17.getTypeface(), 1);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(this.f124982c)) {
            b17.setTypeface(android.graphics.Typeface.createFromFile(this.f124982c));
        } else {
            b17.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        if (i18 == 0 && i17 != -16777216) {
            a(b17);
        }
        b17.measure(0, 0);
        int measuredWidth = b17.getMeasuredWidth();
        int measuredHeight = b17.getMeasuredHeight();
        java.lang.String str = this.f124975f;
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "create bitmap size error: " + measuredWidth + ", " + measuredHeight);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        } else {
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList2.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "drawText: w,h=[" + measuredWidth + ',' + measuredHeight + "], paddingH,V=[" + i19 + ',' + i27 + "], textSize=" + this.f124981b + ", text=" + ((java.lang.Object) spannableString));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        b17.draw(canvas);
        canvas.save();
        canvas.translate((float) i19, (float) i27);
        b17.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }
}
