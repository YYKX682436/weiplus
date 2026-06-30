package qs3;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447887d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447887d = c16945xe78973e5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.Button m67789x20765f72;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447887d;
        m67789x20765f72 = c16945xe78973e5.m67789x20765f72();
        if (view != m67789x20765f72 && motionEvent.getAction() == 1) {
            if (c16945xe78973e5.getVisibility() == 0) {
                c16945xe78973e5.c();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
