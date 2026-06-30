package or1;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f f429041d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f activityC12975xaf74d12f) {
        this.f429041d = activityC12975xaf74d12f;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f activityC12975xaf74d12f = this.f429041d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = activityC12975xaf74d12f.f175506d;
        if (c9Var != null) {
            c9Var.a();
        }
        activityC12975xaf74d12f.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
