package or1;

/* loaded from: classes5.dex */
public class i2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 f429040d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36) {
        this.f429040d = activityC12985xde48fa36;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36 = this.f429040d;
        activityC12985xde48fa36.f175578f.clearFocus();
        activityC12985xde48fa36.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
