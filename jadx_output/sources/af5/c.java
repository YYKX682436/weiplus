package af5;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f4556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4557e;

    public c(android.widget.TextView textView, java.lang.String str) {
        this.f4556d = textView;
        this.f4557e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f4556d;
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        if (paint.measureText(this.f4557e) > (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) {
            textView.setMinLines(2);
        } else {
            textView.setMinLines(0);
        }
    }
}
