package db5;

/* loaded from: classes5.dex */
public class q8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21521x2d1d70e4 f310017d;

    public q8(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21521x2d1d70e4 c21521x2d1d70e4) {
        this.f310017d = c21521x2d1d70e4;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21521x2d1d70e4 c21521x2d1d70e4 = this.f310017d;
        if (c21521x2d1d70e4.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (c21521x2d1d70e4.getWidth() - c21521x2d1d70e4.getPaddingRight()) - c21521x2d1d70e4.f279169d.getIntrinsicWidth()) {
            c21521x2d1d70e4.f279171f = !c21521x2d1d70e4.f279171f;
            c21521x2d1d70e4.b();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
