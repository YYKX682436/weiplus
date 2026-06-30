package b30;

/* loaded from: classes13.dex */
public final class r implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnTouchListener f17577d;

    /* renamed from: e, reason: collision with root package name */
    public long f17578e;

    public r(android.view.View.OnTouchListener onTouchListener) {
        this.f17577d = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/util/EcsViewTouchBinderHelper$Implementation$WrapperTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f17578e >= 500) {
                this.f17578e = currentTimeMillis;
                i95.m c17 = i95.n0.c(pq.r.class);
                t20.g gVar = c17 instanceof t20.g ? (t20.g) c17 : null;
                if (gVar != null) {
                    y02.n0 Ai = gVar.Ai(v17);
                    if (Ai == null) {
                        com.tencent.mars.xlog.Log.w("Ecs.Oracle.EcsOracleService", "[handleTouchDown] session is null, view:%s", v17);
                    } else {
                        com.tencent.mars.xlog.Log.i("Ecs.Oracle.EcsOracleService", "[handleTouchDown] view:%s", v17);
                        t20.e eVar = new t20.e(Ai);
                        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                            ((ku5.t0) ku5.t0.f312615d).i(new t20.f(eVar));
                        } else {
                            eVar.invoke();
                        }
                    }
                }
            }
        }
        android.view.View.OnTouchListener onTouchListener = this.f17577d;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(v17, event) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/feature/ecs/util/EcsViewTouchBinderHelper$Implementation$WrapperTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}
