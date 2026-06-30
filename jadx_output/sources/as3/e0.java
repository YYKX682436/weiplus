package as3;

/* loaded from: classes2.dex */
public final class e0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f13502d;

    public e0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f13502d = weImageView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f13502d;
        if (action == 0) {
            weImageView.setIconColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a1r));
        } else if (action == 1 || action == 3) {
            weImageView.setIconColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a1p));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
