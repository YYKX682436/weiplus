package ut2;

/* loaded from: classes4.dex */
public final class y3 extends android.text.method.LinkMovementMethod {
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable buffer, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        if (action != 0 && action != 1) {
            return false;
        }
        int offsetForHorizontal = widget.getLayout().getOffsetForHorizontal(widget.getLayout().getLineForVertical((((int) event.getY()) - widget.getTotalPaddingTop()) + widget.getScrollY()), (((int) event.getX()) - widget.getTotalPaddingLeft()) + widget.getScrollX());
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(clickableSpanArr);
        if (!(clickableSpanArr.length == 0)) {
            return super.onTouchEvent(widget, buffer, event);
        }
        android.text.Selection.removeSelection(buffer);
        return false;
    }
}
