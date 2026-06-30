package al5;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMClearEditText f6074d;

    public v0(com.tencent.mm.ui.widget.MMClearEditText mMClearEditText) {
        this.f6074d = mMClearEditText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = this.f6074d;
        if (mMClearEditText.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (mMClearEditText.getWidth() - mMClearEditText.getPaddingRight()) - mMClearEditText.getImgX().getIntrinsicWidth()) {
            mMClearEditText.setText("");
            mMClearEditText.setCompoundDrawables(mMClearEditText.getCompoundDrawables()[0], mMClearEditText.getCompoundDrawables()[1], null, mMClearEditText.getCompoundDrawables()[3]);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
