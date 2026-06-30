package fh4;

/* loaded from: classes13.dex */
public class y implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.b0 f344243d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b, fh4.b0 b0Var) {
        this.f344243d = b0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        fh4.b0 b0Var = this.f344243d;
        b0Var.getClass();
        int action = motionEvent.getAction();
        boolean z17 = true;
        if (action == 0) {
            b0Var.f344199a = motionEvent.getX();
            b0Var.f344200b = motionEvent.getY();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            b0Var.f344201c = android.os.SystemClock.elapsedRealtime();
        } else {
            if (action == 1 || action == 3) {
                float abs = java.lang.Math.abs(motionEvent.getX() - b0Var.f344199a);
                float y17 = b0Var.f344200b - motionEvent.getY();
                if (y17 >= 100.0f && y17 / abs > 2.0f) {
                    long j17 = b0Var.f344201c;
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (y17 / ((float) (android.os.SystemClock.elapsedRealtime() - j17)) > 0.6f) {
                        ((fh4.x) b0Var).f344242d.onBackPressed();
                    }
                }
            }
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
