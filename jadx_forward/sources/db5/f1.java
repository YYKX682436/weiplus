package db5;

/* loaded from: classes4.dex */
public class f1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21481x9480f35a f309864d;

    public f1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21481x9480f35a c21481x9480f35a) {
        this.f309864d = c21481x9480f35a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21481x9480f35a c21481x9480f35a = this.f309864d;
        if (c21481x9480f35a.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (c21481x9480f35a.getWidth() - c21481x9480f35a.getPaddingRight()) - c21481x9480f35a.f278843d.getIntrinsicWidth()) {
            c21481x9480f35a.setText("");
            c21481x9480f35a.setCompoundDrawables(c21481x9480f35a.getCompoundDrawables()[0], c21481x9480f35a.getCompoundDrawables()[1], null, c21481x9480f35a.getCompoundDrawables()[3]);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
