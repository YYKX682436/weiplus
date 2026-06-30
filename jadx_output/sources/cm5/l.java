package cm5;

/* loaded from: classes5.dex */
public final class l extends cm5.m {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f43442f;

    /* renamed from: g, reason: collision with root package name */
    public final int f43443g;

    /* renamed from: h, reason: collision with root package name */
    public final int f43444h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f43442f = "MicroMsg.StickerTextBitmapMaker";
        this.f43443g = -2130706433;
        this.f43444h = i65.a.f(context, com.tencent.mm.R.dimen.f480534ag0);
        this.f43445i = i65.a.f(context, com.tencent.mm.R.dimen.f480535ag1);
        this.f43448b = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479714d7);
    }

    @Override // cm5.m
    public com.tencent.mm.view.PhotoEditText b() {
        com.tencent.mm.view.StickerEditText stickerEditText = new com.tencent.mm.view.StickerEditText(this.f43447a, null);
        stickerEditText.setBgColorAlpha(this.f43443g);
        return stickerEditText;
    }

    @Override // cm5.m
    public android.graphics.Bitmap c(android.text.SpannableString spannableString, int i17, int i18, boolean z17, boolean z18) {
        android.graphics.Bitmap createBitmap;
        com.tencent.mm.view.PhotoEditText b17 = b();
        int i19 = this.f43444h;
        int i27 = this.f43445i;
        b17.setPadding(i19, i27, i19, i27);
        b17.setTextColor(i17);
        b17.setTextBackground(i18);
        b17.setTextSize(1, this.f43448b);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = cm5.m.f43446e / 1.3f;
        ((ke0.e) xVar).getClass();
        b17.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f43447a, spannableString, f17));
        b17.setSingleLine(false);
        if (!(this.f43449c.length() > 0)) {
            b17.setTypeface(b17.getTypeface(), 1);
        } else if (com.tencent.mm.vfs.w6.j(this.f43449c)) {
            b17.setTypeface(android.graphics.Typeface.createFromFile(this.f43449c));
        } else {
            b17.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        if (i18 == 0 && i17 != -16777216) {
            a(b17);
        }
        b17.measure(0, 0);
        int measuredWidth = b17.getMeasuredWidth();
        int measuredHeight = b17.getMeasuredHeight();
        java.lang.String str = this.f43442f;
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            com.tencent.mars.xlog.Log.w(str, "create bitmap size error: " + measuredWidth + ", " + measuredHeight);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList2.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/utils/StickerTextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        kotlin.jvm.internal.o.d(createBitmap);
        com.tencent.mars.xlog.Log.i(str, "drawText: w,h=[" + measuredWidth + ',' + measuredHeight + "], paddingH,V=[" + i19 + ',' + i27 + "], textSize=" + this.f43448b + ", text=" + ((java.lang.Object) spannableString));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        b17.draw(canvas);
        canvas.save();
        canvas.translate((float) i19, (float) i27);
        b17.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }
}
