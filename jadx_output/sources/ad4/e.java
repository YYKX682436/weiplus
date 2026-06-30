package ad4;

/* loaded from: classes4.dex */
public final class e implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad4.f f3180d;

    public e(ad4.f fVar) {
        this.f3180d = fVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(250, valueOf.intValue(), valueOf2.intValue());
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onDown rawX:" + valueOf + " rawY:" + valueOf2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        kotlin.jvm.internal.o.g(e27, "e2");
        i64.u1.b(255, (int) f17, (int) f18);
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onFling velocityX:" + f17 + " velocityY:" + f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(254, valueOf.intValue(), valueOf2.intValue());
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onLongPress rawX:" + valueOf + " rawY:" + valueOf2);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        kotlin.jvm.internal.o.g(e27, "e2");
        i64.u1.b(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, (int) f17, (int) f18);
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onScroll distanceX:" + f17 + " distanceY:" + f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(251, valueOf.intValue(), valueOf2.intValue());
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onShowPress rawX:" + valueOf + " rawY:" + valueOf2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(252, valueOf.intValue(), valueOf2.intValue());
        com.tencent.mars.xlog.Log.i(ad4.f.a(this.f3180d), "onSingleTapUp rawX:" + valueOf + " rawY:" + valueOf2);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }
}
