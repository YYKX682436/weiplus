package ug5;

/* loaded from: classes3.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ug5.v a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ug5.f fVar = ug5.v.f509188g;
        java.lang.Object obj = ug5.v.f509190i.get(key);
        if (obj instanceof ug5.v) {
            return (ug5.v) obj;
        }
        return null;
    }

    public final ug5.v b(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ug5.g gVar = (ug5.g) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(ug5.v.f509189h).remove(activity.getIntent().getStringExtra("intent_key_view_performer_builder"));
        if (gVar == null) {
            return null;
        }
        gVar.f509127h = new java.lang.ref.WeakReference(activity);
        if (gVar.f509122c == null) {
            gVar.f509122c = activity.getWindow();
        }
        gVar.f509121b = activity.getWindow();
        gVar.f509129j.isEmpty();
        gVar.f509130k.isEmpty();
        android.view.Window window = gVar.f509121b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "[build] " + gVar);
        ug5.v vVar = new ug5.v(gVar);
        vVar.h();
        return vVar;
    }
}
