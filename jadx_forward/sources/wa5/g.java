package wa5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f525851a;

    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, wa5.j uic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        this.f525851a = activity;
    }

    public static void b(wa5.g gVar, wa5.f fVar, xa5.d customCallback, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            fVar = null;
        }
        if ((i17 & 2) != 0) {
            customCallback = xa5.c.f534373a;
        }
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customCallback, "customCallback");
        wa5.d dVar = wa5.d.f525848a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = gVar.f525851a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Transition", "onEnterActivityReady() called with: activity = " + activity);
        java.util.Objects.toString(activity.getWindow().getSharedElementEnterTransition());
        activity.getWindow().getSharedElementEnterTransition().addListener(new xa5.b(fVar, activity));
        activity.startPostponedEnterTransition();
    }

    public final void a(wa5.a aVar) {
        wa5.d dVar = wa5.d.f525848a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f525851a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Transition", "onEnterActivityOnCreate() called with: activity = " + activity);
        activity.postponeEnterTransition();
        dVar.b(activity, true, aVar);
        dVar.a(activity).f525843b = true;
        dVar.c(activity);
    }
}
