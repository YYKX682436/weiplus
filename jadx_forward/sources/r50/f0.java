package r50;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            ct.f3 f3Var = (ct.f3) i95.n0.c(ct.f3.class);
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            a31.m mVar = ((x90.m) f3Var).f534152d;
            if (mVar != null) {
                mVar.g(x17, y17);
            }
            a31.m mVar2 = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
            if (mVar2 != null) {
                mVar2.m(54);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
