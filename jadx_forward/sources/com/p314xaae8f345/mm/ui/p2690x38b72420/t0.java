package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 f288720d;

    public t0(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1) {
        this.f288720d = activityC22292xa218e7a1;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        bb5.g gVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288720d;
        if (action == 0) {
            activityC22292xa218e7a1.mo48674x36654fab();
            activityC22292xa218e7a1.f287882q = (int) motionEvent.getRawX();
            activityC22292xa218e7a1.f287883r = (int) motionEvent.getRawY();
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var = activityC22292xa218e7a1.f287878m;
        if (s0Var != null && (gVar2 = s0Var.f288698q) != null) {
            gVar2.c(motionEvent);
        }
        yk5.u uVar = activityC22292xa218e7a1.f287879n;
        if (uVar != null && (gVar = uVar.f544449z) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
