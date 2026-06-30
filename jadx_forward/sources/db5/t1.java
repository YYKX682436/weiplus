package db5;

/* loaded from: classes5.dex */
public class t1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f310049d;

    public t1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04) {
        this.f310049d = c21486x59d05a04;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f310049d;
        if (c21486x59d05a04.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (c21486x59d05a04.getWidth() - c21486x59d05a04.getPaddingRight()) - c21486x59d05a04.f278859e.getIntrinsicWidth()) {
            c21486x59d05a04.setText("");
            c21486x59d05a04.d();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
