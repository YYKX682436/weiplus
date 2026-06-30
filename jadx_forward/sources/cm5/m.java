package cm5;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static final float f124979e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f124980a;

    /* renamed from: b, reason: collision with root package name */
    public float f124981b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f124982c;

    /* renamed from: d, reason: collision with root package name */
    public int f124983d;

    static {
        float dimension = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561847ub);
        f124979e = dimension;
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setDither(true);
        textPaint.setTextSize(dimension);
    }

    public m(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f124980a = context;
        this.f124981b = f124979e;
        this.f124982c = "";
    }

    public final void a(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setShadowLayer(i65.a.b(textView.getContext(), 3), 0.0f, i65.a.b(textView.getContext(), 1), Integer.MIN_VALUE);
    }

    public com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 b() {
        return new com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289(this.f124980a);
    }

    public android.graphics.Bitmap c(android.text.SpannableString spannableString, int i17, int i18, boolean z17, boolean z18) {
        if (spannableString == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 b17 = b();
        android.content.Context context = this.f124980a;
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561846ua);
        b17.setPadding(h17, 0, h17, 0);
        b17.mo82626x630fd73d(i18);
        b17.setTextColor(i17);
        b17.setTextSize(java.lang.Math.round(this.f124981b / context.getResources().getDisplayMetrics().density));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = f124979e / 1.3f;
        ((ke0.e) xVar).getClass();
        b17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, spannableString, f17));
        b17.setSingleLine(false);
        if (android.text.TextUtils.isEmpty(this.f124982c)) {
            b17.setTypeface(b17.getTypeface(), 1);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(this.f124982c)) {
            b17.setTypeface(android.graphics.Typeface.createFromFile(this.f124982c));
        } else {
            b17.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        int i19 = this.f124983d;
        if (i19 != 0) {
            b17.setMaxWidth(i19);
        } else {
            b17.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561846ua) * 2)));
        }
        if (i18 == 0 && i17 != -16777216 && z18) {
            a(b17);
        }
        b17.measure(0, 0);
        if (z17) {
            b17.f294910g.layout(0, 0, b17.getMeasuredWidth(), b17.getMeasuredHeight());
        }
        b17.m82625x1a689683(z17);
        int measuredWidth = b17.getMeasuredWidth() - h17;
        int measuredHeight = b17.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/utils/TextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/utils/TextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        b17.getLayout().getPaint().setColor(i17);
        canvas.save();
        float f18 = h17;
        canvas.translate((-0.5f) * f18, 0.0f);
        b17.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f18 * 0.5f, 0.0f);
        b17.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }
}
