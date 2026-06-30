package w03;

/* loaded from: classes5.dex */
public final class l extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 f523420d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 activityC15553x533c7950) {
        this.f523420d = activityC15553x533c7950;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 activityC15553x533c7950 = this.f523420d;
        if (activityC15553x533c7950.f218850r != 0) {
            return false;
        }
        activityC15553x533c7950.f218850r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15553x533c7950.f218839d, "onFling, velocity:" + f17 + ", velocityY:" + f18 + " firstScrollMills:" + activityC15553x533c7950.f218850r);
        return false;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 activityC15553x533c7950 = this.f523420d;
        if (activityC15553x533c7950.f218850r != 0) {
            return false;
        }
        activityC15553x533c7950.f218850r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15553x533c7950.f218839d, "onScroll, distanceX:" + f17 + ", distanceY:" + f18 + ", firstScrollMills:" + activityC15553x533c7950.f218850r);
        return false;
    }
}
