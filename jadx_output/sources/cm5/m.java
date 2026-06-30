package cm5;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static final float f43446e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f43447a;

    /* renamed from: b, reason: collision with root package name */
    public float f43448b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f43449c;

    /* renamed from: d, reason: collision with root package name */
    public int f43450d;

    static {
        float dimension = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480314ub);
        f43446e = dimension;
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setDither(true);
        textPaint.setTextSize(dimension);
    }

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f43447a = context;
        this.f43448b = f43446e;
        this.f43449c = "";
    }

    public final void a(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "textView");
        textView.setShadowLayer(i65.a.b(textView.getContext(), 3), 0.0f, i65.a.b(textView.getContext(), 1), Integer.MIN_VALUE);
    }

    public com.tencent.mm.view.PhotoEditText b() {
        return new com.tencent.mm.view.PhotoEditText(this.f43447a);
    }

    public android.graphics.Bitmap c(android.text.SpannableString spannableString, int i17, int i18, boolean z17, boolean z18) {
        if (spannableString == null) {
            return null;
        }
        com.tencent.mm.view.PhotoEditText b17 = b();
        android.content.Context context = this.f43447a;
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f480313ua);
        b17.setPadding(h17, 0, h17, 0);
        b17.setTextBackground(i18);
        b17.setTextColor(i17);
        b17.setTextSize(java.lang.Math.round(this.f43448b / context.getResources().getDisplayMetrics().density));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = f43446e / 1.3f;
        ((ke0.e) xVar).getClass();
        b17.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, spannableString, f17));
        b17.setSingleLine(false);
        if (android.text.TextUtils.isEmpty(this.f43449c)) {
            b17.setTypeface(b17.getTypeface(), 1);
        } else if (com.tencent.mm.vfs.w6.j(this.f43449c)) {
            b17.setTypeface(android.graphics.Typeface.createFromFile(this.f43449c));
        } else {
            b17.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        int i19 = this.f43450d;
        if (i19 != 0) {
            b17.setMaxWidth(i19);
        } else {
            b17.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimension(com.tencent.mm.R.dimen.f480313ua) * 2)));
        }
        if (i18 == 0 && i17 != -16777216 && z18) {
            a(b17);
        }
        b17.measure(0, 0);
        if (z17) {
            b17.f213377g.layout(0, 0, b17.getMeasuredWidth(), b17.getMeasuredHeight());
        }
        b17.setEnableStoke(z17);
        int measuredWidth = b17.getMeasuredWidth() - h17;
        int measuredHeight = b17.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/utils/TextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/utils/TextBitmapMaker", "drawText", "(Landroid/text/SpannableString;IIZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
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
