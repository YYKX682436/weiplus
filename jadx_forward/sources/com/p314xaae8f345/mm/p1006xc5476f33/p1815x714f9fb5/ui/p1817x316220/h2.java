package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes3.dex */
public class h2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f226358d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f226359e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 f226360f;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var) {
        this.f226360f = y1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = this.f226360f;
        y1Var.T.setSelected(false);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f226358d = motionEvent.getX();
            this.f226359e = motionEvent.getY();
        } else if (action == 1 && (java.lang.Math.abs(motionEvent.getX() - this.f226358d) > 10.0f || java.lang.Math.abs(motionEvent.getY() - this.f226359e) > 10.0f)) {
            y1Var.G("move_map_poi");
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
