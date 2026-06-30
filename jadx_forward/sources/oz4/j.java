package oz4;

/* loaded from: classes12.dex */
public class j extends android.text.method.ArrowKeyMovementMethod {
    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y17 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            oz4.l[] lVarArr = (oz4.l[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal + 1, oz4.l.class);
            if (scrollX < mz4.b.b() && lVarArr.length != 0 && action == 0) {
                oz4.l lVar = lVarArr[0];
                lVar.b(textView, spannable, motionEvent, lVar);
            }
        }
        return false;
    }
}
