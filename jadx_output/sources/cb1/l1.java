package cb1;

/* loaded from: classes14.dex */
public abstract class l1 extends android.text.method.LinkMovementMethod {
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y17 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        android.text.Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.URLSpan.class);
        if (uRLSpanArr.length != 0) {
            java.lang.String url = uRLSpanArr[0].getURL();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, onLinkClick url:%s", url);
            cb1.h hVar = new cb1.h();
            hVar.f40246i = url;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", hVar.f40246i);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEventTextViewLinkClick", "onTextViewLinkClick, url:%s", hVar.f40246i);
            hVar.t(hashMap);
            hVar.p(((cb1.r0) this).f40299a);
            hVar.m();
        }
        return true;
    }
}
