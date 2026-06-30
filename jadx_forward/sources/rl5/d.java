package rl5;

/* loaded from: classes5.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478843d;

    public d(rl5.r rVar) {
        this.f478843d = rVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if ((motionEvent.getAction() & 255) == 0) {
            rl5.r.f478866x0 = (int) motionEvent.getRawX();
            rl5.r.f478867y0 = (int) motionEvent.getRawY();
            rl5.r rVar = this.f478843d;
            rVar.A = rVar.f478871f;
            rl5.r.f478865l1 = true;
            com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMPopupMenu", "popmenu view set , x_down=" + rl5.r.f478866x0 + "y_down=" + rl5.r.f478867y0, new java.lang.Object[0]);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
