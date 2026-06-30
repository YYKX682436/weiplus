package bk4;

/* loaded from: classes4.dex */
public final class a1 extends android.text.method.LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f102936a;

    public a1(yz5.a aVar) {
        this.f102936a = aVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        yz5.a aVar;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (textView != null && ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 0))) {
            float x17 = motionEvent.getX();
            float totalPaddingLeft = (x17 - textView.getTotalPaddingLeft()) + textView.getScrollX();
            float y17 = (motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layout, "getLayout(...)");
            if (layout.getOffsetForHorizontal(layout.getLineForVertical((int) y17), totalPaddingLeft) >= textView.getText().length()) {
                if (valueOf == null || valueOf.intValue() != 1 || (aVar = this.f102936a) == null) {
                    return false;
                }
                aVar.mo152xb9724478();
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
