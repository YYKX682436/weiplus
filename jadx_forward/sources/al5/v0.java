package al5;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f87607d;

    public v0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04) {
        this.f87607d = c22618x59d05a04;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = this.f87607d;
        if (c22618x59d05a04.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (c22618x59d05a04.getWidth() - c22618x59d05a04.getPaddingRight()) - c22618x59d05a04.getImgX().getIntrinsicWidth()) {
            c22618x59d05a04.setText("");
            c22618x59d05a04.setCompoundDrawables(c22618x59d05a04.getCompoundDrawables()[0], c22618x59d05a04.getCompoundDrawables()[1], null, c22618x59d05a04.getCompoundDrawables()[3]);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
