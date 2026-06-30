package ad4;

/* loaded from: classes4.dex */
public final class e implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad4.f f84713d;

    public e(ad4.f fVar) {
        this.f84713d = fVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(250, valueOf.intValue(), valueOf2.intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onDown rawX:" + valueOf + " rawY:" + valueOf2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        i64.u1.b(255, (int) f17, (int) f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onFling velocityX:" + f17 + " velocityY:" + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(254, valueOf.intValue(), valueOf2.intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onLongPress rawX:" + valueOf + " rawY:" + valueOf2);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        i64.u1.b(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, (int) f17, (int) f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onScroll distanceX:" + f17 + " distanceY:" + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(251, valueOf.intValue(), valueOf2.intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onShowPress rawX:" + valueOf + " rawY:" + valueOf2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Float valueOf = java.lang.Float.valueOf(e17.getRawX());
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17.getRawY());
        i64.u1.b(252, valueOf.intValue(), valueOf2.intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ad4.f.a(this.f84713d), "onSingleTapUp rawX:" + valueOf + " rawY:" + valueOf2);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveDebugUtil$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil$gestureDetector$1");
        return false;
    }
}
