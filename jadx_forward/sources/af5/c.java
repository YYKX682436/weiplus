package af5;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f86089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86090e;

    public c(android.widget.TextView textView, java.lang.String str) {
        this.f86089d = textView;
        this.f86090e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f86089d;
        android.text.TextPaint paint = textView.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        if (paint.measureText(this.f86090e) > (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) {
            textView.setMinLines(2);
        } else {
            textView.setMinLines(0);
        }
    }
}
