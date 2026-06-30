package al5;

/* loaded from: classes5.dex */
public class k2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f87472d;

    public k2(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f87472d = c22633x83752a59;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f87472d;
        java.util.Iterator it = ((java.util.HashSet) c22633x83752a59.A).iterator();
        while (it.hasNext()) {
            ((android.view.View.OnTouchListener) it.next()).onTouch(view, motionEvent);
        }
        android.view.View.OnTouchListener onTouchListener = c22633x83752a59.f292910z;
        if (onTouchListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        boolean onTouch = onTouchListener.onTouch(view, motionEvent);
        yj0.a.i(onTouch, this, "com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}
