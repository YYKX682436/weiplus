package bb5;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f100663a;

    /* renamed from: b, reason: collision with root package name */
    public final bb5.f f100664b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f100665c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f100666d;

    /* renamed from: e, reason: collision with root package name */
    public final bb5.d f100667e;

    /* renamed from: f, reason: collision with root package name */
    public int f100668f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.GestureDetector f100669g = new android.view.GestureDetector(new bb5.c(this));

    public g(int i17, bb5.d dVar) {
        i17 = i17 > 30 ? 30 : i17;
        this.f100667e = dVar;
        this.f100663a = i17;
        this.f100664b = new bb5.f(this, (i17 * 2) + 10);
        this.f100665c = new java.util.LinkedList();
        bb5.b bVar = new bb5.b(this);
        this.f100666d = bVar;
        android.os.Looper.myQueue().addIdleHandler(bVar);
    }

    public void a() {
        android.os.MessageQueue.IdleHandler idleHandler = this.f100666d;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
        }
    }

    public void b(int i17, bb5.e eVar) {
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EarlyGetHeadImg", "earlyGet, getter is null, no early get headimg will be performed");
            return;
        }
        int i18 = this.f100663a;
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EarlyGetHeadImg", "earlyGet fail, threshold is invalid");
            return;
        }
        int a17 = eVar.a();
        for (int i19 = 1; i19 <= i18; i19++) {
            int i27 = this.f100668f;
            java.util.LinkedList linkedList = this.f100665c;
            bb5.f fVar = this.f100664b;
            if (i27 == 1) {
                int i28 = i17 - i19;
                if (i28 < 0) {
                    return;
                }
                java.lang.String b17 = eVar.b(i28);
                if (b17 != null && b17.length() != 0 && !fVar.f100662b.contains(b17)) {
                    java.util.LinkedList linkedList2 = fVar.f100662b;
                    if (!linkedList2.contains(b17)) {
                        linkedList2.add(b17);
                        if (linkedList2.size() >= fVar.f100661a) {
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
                if (b18 != null && b18.length() != 0 && !fVar.f100662b.contains(b18)) {
                    java.util.LinkedList linkedList3 = fVar.f100662b;
                    if (!linkedList3.contains(b18)) {
                        linkedList3.add(b18);
                        if (linkedList3.size() >= fVar.f100661a) {
                            linkedList3.removeFirst();
                        }
                    }
                    linkedList.add(b18);
                }
            }
        }
    }

    public void c(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f100669g;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
    }
}
