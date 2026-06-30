package bx2;

/* loaded from: classes3.dex */
public final class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f36316d;

    public a(java.lang.Integer num) {
        this.f36316d = num;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/span/FinderLiveCritSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/span/FinderLiveCritSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        java.lang.Integer num = this.f36316d;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        try {
            textPaint.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "setTypeface() Exception:" + e17.getMessage());
        }
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }

    public /* synthetic */ a(java.lang.Integer num, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FFCF33")) : num);
    }
}
