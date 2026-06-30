package gp2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355741d;

    public c(gp2.l0 l0Var) {
        this.f355741d = l0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        gp2.q0 q0Var = this.f355741d.f355799y;
        if (q0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
            if (motionEvent.getAction() == 0 && q0Var.f355836n) {
                q0Var.f355837o = true;
                q0Var.f355838p = motionEvent;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
