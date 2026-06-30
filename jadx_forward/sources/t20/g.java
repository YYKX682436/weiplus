package t20;

@j95.b
/* loaded from: classes13.dex */
public final class g extends i95.w implements pq.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f496204d = new java.util.LinkedHashMap();

    public final y02.n0 Ai(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.t68);
        if (tag instanceof y02.n0) {
            return (y02.n0) tag;
        }
        return null;
    }

    public void Bi(android.view.View view) {
        if (view == null) {
            return;
        }
        y02.n0 Ai = Ai(view);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Ecs.Oracle.EcsOracleService", "[handleClick] session is null, view:%s", view);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Oracle.EcsOracleService", "[handleClick] view:%s", view);
        t20.c cVar = new t20.c(Ai);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            cVar.mo152xb9724478();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).i(new t20.f(cVar));
    }

    public final void Di(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.t67);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str != null) {
            java.util.Map map = this.f496204d;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(str);
            if ((weakReference != null ? (android.view.View) weakReference.get() : null) == view) {
                map.remove(str);
            }
            view.setTag(com.p314xaae8f345.mm.R.id.t67, null);
        }
        b30.t tVar = b30.t.f99115a;
        if (tVar.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewTouchBinderHelper", "Failed to unbind preload jump info on touch");
        } else {
            b30.s a17 = tVar.a();
            if (a17 != null) {
                android.view.View.OnTouchListener a18 = a17.a(view);
                if (a18 instanceof b30.r) {
                    view.setOnTouchListener(((b30.r) a18).f99110d);
                }
            }
        }
        view.setTag(com.p314xaae8f345.mm.R.id.t68, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Oracle.EcsOracleService", "[unbindFromView] view:%s", view);
    }

    public final void wi(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        b30.t tVar = b30.t.f99115a;
        if (tVar.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewTouchBinderHelper", "Failed to bind preload jump info on touch");
        } else {
            b30.s a17 = tVar.a();
            if (a17 != null && !(a17.a(view) instanceof b30.r)) {
                view.setOnTouchListener(new b30.r(a17.a(view)));
            }
        }
        if (u46.l.e(((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).mj(view))) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "EcsOracleService_" + view.hashCode());
        }
        if (((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).hj(view) <= 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 0);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        t20.a aVar = new t20.a(this);
        ((cy1.a) rVar).getClass();
        jz1.e.Di().Bi(view, aVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(view, 8, new t20.b(this, view));
    }
}
