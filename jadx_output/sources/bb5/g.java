package bb5;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f19130a;

    /* renamed from: b, reason: collision with root package name */
    public final bb5.f f19131b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f19132c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f19133d;

    /* renamed from: e, reason: collision with root package name */
    public final bb5.d f19134e;

    /* renamed from: f, reason: collision with root package name */
    public int f19135f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.GestureDetector f19136g = new android.view.GestureDetector(new bb5.c(this));

    public g(int i17, bb5.d dVar) {
        i17 = i17 > 30 ? 30 : i17;
        this.f19134e = dVar;
        this.f19130a = i17;
        this.f19131b = new bb5.f(this, (i17 * 2) + 10);
        this.f19132c = new java.util.LinkedList();
        bb5.b bVar = new bb5.b(this);
        this.f19133d = bVar;
        android.os.Looper.myQueue().addIdleHandler(bVar);
    }

    public void a() {
        android.os.MessageQueue.IdleHandler idleHandler = this.f19133d;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
        }
    }

    public void b(int i17, bb5.e eVar) {
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EarlyGetHeadImg", "earlyGet, getter is null, no early get headimg will be performed");
            return;
        }
        int i18 = this.f19130a;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EarlyGetHeadImg", "earlyGet fail, threshold is invalid");
            return;
        }
        int a17 = eVar.a();
        for (int i19 = 1; i19 <= i18; i19++) {
            int i27 = this.f19135f;
            java.util.LinkedList linkedList = this.f19132c;
            bb5.f fVar = this.f19131b;
            if (i27 == 1) {
                int i28 = i17 - i19;
                if (i28 < 0) {
                    return;
                }
                java.lang.String b17 = eVar.b(i28);
                if (b17 != null && b17.length() != 0 && !fVar.f19129b.contains(b17)) {
                    java.util.LinkedList linkedList2 = fVar.f19129b;
                    if (!linkedList2.contains(b17)) {
                        linkedList2.add(b17);
                        if (linkedList2.size() >= fVar.f19128a) {
                            linkedList2.removeFirst();
                        }
                    }
                    linkedList.add(b17);
                }
            } else {
                int i29 = i17 + i19;
                if (i29 >= a17) {
                    return;
                }
                java.lang.String b18 = eVar.b(i29);
                if (b18 != null && b18.length() != 0 && !fVar.f19129b.contains(b18)) {
                    java.util.LinkedList linkedList3 = fVar.f19129b;
                    if (!linkedList3.contains(b18)) {
                        linkedList3.add(b18);
                        if (linkedList3.size() >= fVar.f19128a) {
                            linkedList3.removeFirst();
                        }
                    }
                    linkedList.add(b18);
                }
            }
        }
    }

    public void c(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f19136g;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
    }
}
