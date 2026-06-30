package zh1;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f554473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.f1 f554474e;

    public s0(android.widget.TextView textView, zh1.f1 f1Var) {
        this.f554473d = textView;
        this.f554474e = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int lineEnd;
        java.lang.String concat;
        android.widget.TextView textView = this.f554473d;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        android.text.TextPaint paint = textView.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        zh1.f1 f1Var = this.f554474e;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(f1Var.f554413a, paint, width, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (staticLayout.getLineCount() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "getFirstLineEndPos, lineCount(" + staticLayout.getLineCount() + ") is illegal");
            lineEnd = 0;
        } else {
            lineEnd = staticLayout.getLineEnd(0);
        }
        if (!(1 <= lineEnd && lineEnd <= f1Var.f554413a.length())) {
            textView.setText(f1Var.f554416d);
            return;
        }
        if (lineEnd == f1Var.f554413a.length()) {
            concat = f1Var.f554413a;
        } else {
            java.lang.String substring = f1Var.f554413a.substring(0, lineEnd - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            concat = substring.concat("…");
        }
        textView.setText(concat + '\n' + f1Var.f554414b);
    }
}
