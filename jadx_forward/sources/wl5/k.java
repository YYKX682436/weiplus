package wl5;

/* loaded from: classes10.dex */
public class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528647d;

    public k(wl5.x xVar) {
        this.f528647d = xVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        wl5.x xVar = this.f528647d;
        if (action == 0) {
            com.p314xaae8f345.mm.ui.yk.c("SelectableTextHelper", "mOnTouchListener ACTION_DOWN, mTouchListener=%s, v=%s", xVar.f528704p, view);
        }
        android.view.View.OnTouchListener onTouchListener = xVar.f528704p;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        xVar.f528710v = (int) motionEvent.getX();
        xVar.f528711w = (int) motionEvent.getY();
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
