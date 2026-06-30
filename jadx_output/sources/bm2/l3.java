package bm2;

/* loaded from: classes3.dex */
public final class l3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.i3 f22065d;

    public l3(bm2.i3 i3Var) {
        this.f22065d = i3Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        bm2.i3 i3Var = this.f22065d;
        if (action == 0) {
            i3Var.f21970e.setTextColor(android.graphics.Color.parseColor("#97AECC"));
        } else if (action == 1 || action == 3) {
            i3Var.f21970e.setTextColor(android.graphics.Color.parseColor("#BDD9FF"));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
