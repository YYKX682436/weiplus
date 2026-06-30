package pf3;

/* loaded from: classes12.dex */
public abstract class d extends mf3.e implements mf3.j {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f435353o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f435354p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f435355q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.MotionEvent f435356r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mf3.p apiCenter, java.lang.String logLabel) {
        super(apiCenter, logLabel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logLabel, "logLabel");
        this.f435353o = new java.util.LinkedHashMap();
        this.f435354p = new java.util.LinkedHashMap();
        this.f435355q = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ android.view.View U(pf3.d dVar, android.view.View view, pf3.j jVar, android.view.View.OnClickListener onClickListener, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickable");
        }
        if ((i17 & 1) != 0) {
            jVar = null;
        }
        if ((i17 & 2) != 0) {
            onClickListener = null;
        }
        dVar.T(view, jVar, onClickListener);
        return view;
    }

    public static android.view.View W(pf3.d dVar, android.view.View view, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mutable");
        }
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.String V = dVar.V(view);
        java.util.Map map = dVar.f435354p;
        if (!map.containsKey(V)) {
            map.put(V, view);
            return view;
        }
        throw new java.lang.RuntimeException("register mutable view, duplicate id: " + V);
    }

    public final void S(pf3.d dVar, pf3.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        dVar.O("LazyVisibilityRefreshTask apply: " + task.f435343e, new java.lang.Object[0]);
        task.f435346b.clear();
        task.f435347c.clear();
        task.f435344f.mo146xb9724478(task);
        task.a(dVar);
    }

    public final android.view.View T(android.view.View view, pf3.j jVar, android.view.View.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.String V = V(view);
        java.util.Map map = this.f435353o;
        if (map.containsKey(V)) {
            throw new java.lang.RuntimeException("register clickable view, duplicate id: " + V);
        }
        if (jVar == null) {
            map.put(V, new pf3.l(view));
        } else {
            map.put(V, new pf3.i(view, jVar));
        }
        if (onClickListener != null) {
            view.setOnClickListener(new pf3.c(this, V, onClickListener, view));
        }
        return view;
    }

    public final java.lang.String V(android.view.View view) {
        int id6 = view.getId();
        return "<" + (id6 == -1 ? "noID" : view.getContext().getResources().getResourceEntryName(id6)) + ">@" + java.lang.Integer.toHexString(view.hashCode());
    }

    public final android.view.View X(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.String V = V(view);
        java.util.Map map = this.f435353o;
        if (!map.containsKey(V)) {
            map.put(V, new pf3.l(view));
            return view;
        }
        throw new java.lang.RuntimeException("register touchable view, duplicate id: " + V);
    }

    public final void Y(pf3.d dVar, yz5.l dsl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dsl, "dsl");
        pf3.b bVar = new pf3.b(dVar);
        dsl.mo146xb9724478(bVar);
        bVar.a(dVar);
    }

    public final pf3.a Z(pf3.d dVar, java.lang.String desc, yz5.l dsl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dsl, "dsl");
        return new pf3.a(dVar, desc, dsl);
    }

    @Override // mf3.n
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        android.view.MotionEvent motionEvent = this.f435356r;
        if (motionEvent != null && ((int) motionEvent.getRawX()) == rawX && ((int) motionEvent.getRawY()) == rawY) {
            O("hitElements, with same event:" + mg3.p.a(event) + " x-y:{" + rawX + ',' + rawY + '}', new java.lang.Object[0]);
            return true;
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f435353o).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((pf3.k) entry.getValue()).a(event)) {
                O("hitElements, id: " + str + " event:" + mg3.p.a(event) + " x-y:{" + rawX + ',' + rawY + '}', new java.lang.Object[0]);
                this.f435356r = android.view.MotionEvent.obtain(event);
                return true;
            }
        }
        return false;
    }
}
