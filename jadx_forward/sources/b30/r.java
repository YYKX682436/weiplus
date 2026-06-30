package b30;

/* loaded from: classes13.dex */
public final class r implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnTouchListener f99110d;

    /* renamed from: e, reason: collision with root package name */
    public long f99111e;

    public r(android.view.View.OnTouchListener onTouchListener) {
        this.f99110d = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/util/EcsViewTouchBinderHelper$Implementation$WrapperTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getAction() == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f99111e >= 500) {
                this.f99111e = currentTimeMillis;
                i95.m c17 = i95.n0.c(pq.r.class);
                t20.g gVar = c17 instanceof t20.g ? (t20.g) c17 : null;
                if (gVar != null) {
                    y02.n0 Ai = gVar.Ai(v17);
                    if (Ai == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Ecs.Oracle.EcsOracleService", "[handleTouchDown] session is null, view:%s", v17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Oracle.EcsOracleService", "[handleTouchDown] view:%s", v17);
                        t20.e eVar = new t20.e(Ai);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                            ((ku5.t0) ku5.t0.f394148d).i(new t20.f(eVar));
                        } else {
                            eVar.mo152xb9724478();
                        }
                    }
                }
            }
        }
        android.view.View.OnTouchListener onTouchListener = this.f99110d;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(v17, event) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/feature/ecs/util/EcsViewTouchBinderHelper$Implementation$WrapperTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}
