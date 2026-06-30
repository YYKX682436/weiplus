package z63;

/* loaded from: classes5.dex */
public class i0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551951d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551951d = activityC16081x2d23fdab;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551951d;
        if (actionMasked == 1 && (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) && activityC16081x2d23fdab.F) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view).setCursorVisible(true);
        }
        if (motionEvent.getActionMasked() == 1 && (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view;
            if (((java.lang.Integer) c22621x7603e017.getTag(com.p314xaae8f345.mm.R.id.guj)).intValue() == 3 && activityC16081x2d23fdab.L) {
                c22621x7603e017.setCursorVisible(true);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
        activityC16081x2d23fdab.getClass();
        if (c22621x7603e0172.getLineCount() > c22621x7603e0172.getMaxLines()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            activityC16081x2d23fdab.K = true;
            if (motionEvent.getAction() == 1) {
                activityC16081x2d23fdab.K = false;
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
