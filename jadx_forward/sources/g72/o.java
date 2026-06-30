package g72;

/* loaded from: classes14.dex */
public class o extends android.text.method.LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.zd5 f350773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350774b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4, r45.zd5 zd5Var) {
        this.f350774b = activityC13520x8c9585b4;
        this.f350773a = zd5Var;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int x17 = (int) ((motionEvent.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX());
            int y17 = (int) ((motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY());
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y17), x17);
            if (((android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class)).length > 0) {
                r45.zd5 zd5Var = this.f350773a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zd5Var.f473471e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectConfirmUI", "promptInfo url is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.T6(this.f350774b, zd5Var.f473471e);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
