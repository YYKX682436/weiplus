package wa5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final wa5.d f525848a = new wa5.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f525849b = new java.util.WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.app.SharedElementCallback f525850c = new wa5.c();

    public final wa5.b a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        java.util.WeakHashMap weakHashMap = f525849b;
        wa5.b bVar = (wa5.b) weakHashMap.get(activity);
        if (bVar != null) {
            return bVar;
        }
        wa5.b bVar2 = new wa5.b(false, false, null, null, null, false, 63, null);
        weakHashMap.put(activity, bVar2);
        return bVar2;
    }

    public final void b(android.app.Activity activity, boolean z17, wa5.a aVar) {
        java.lang.String str;
        if (aVar == null) {
            aVar = new wa5.a();
        }
        if (z17) {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", enter";
        } else {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", exit";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f525841a = str;
        if (z17) {
            activity.setEnterSharedElementCallback(aVar);
        } else {
            activity.setExitSharedElementCallback(aVar);
        }
    }

    public final void c(final android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        final wa5.b a17 = a(activity);
        if (a17.f525842a) {
            return;
        }
        a17.f525842a = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
        if (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.ui.anim.transition.MMTransitionHelper$tryRegisterObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m78843xac79a11b() {
                android.app.Activity activity2 = activity;
                activity2.getClass();
                wa5.d dVar = wa5.d.f525848a;
                android.app.SharedElementCallback sharedElementCallback = wa5.d.f525850c;
                activity2.setEnterSharedElementCallback(sharedElementCallback);
                activity2.setExitSharedElementCallback(sharedElementCallback);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = dVar.a(activity2).f525844c.iterator();
                while (it.hasNext()) {
                    android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.lang.ref.WeakReference) it.next()).get();
                    if (resultReceiver != null) {
                        resultReceiver.send(106, null);
                        sb6.append("c:" + resultReceiver + ' ');
                    }
                }
                if (!(sb6.length() > 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Transition", "onDestroy() act:" + activity2 + " coordinator is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Transition", "onDestroy() act:" + activity2 + " coordinator is not null " + ((java.lang.Object) sb6));
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
            /* renamed from: onStop */
            public final void m78844xc39f8281() {
                if (!wa5.b.this.f525843b || android.os.Build.VERSION.SDK_INT < 29) {
                    return;
                }
                android.app.Activity activity2 = activity;
                if (((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2).isFinishing()) {
                    return;
                }
                new android.app.Instrumentation().callActivityOnSaveInstanceState(activity2, new android.os.Bundle());
            }
        });
    }
}
