package v65;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f515113a = new v65.l();

    public static final p3325xe03a0797.p3326xc267989b.y0 a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (!(view.getContext() instanceof p012xc85e97e9.p093xedfae76a.y)) {
            return f515113a;
        }
        java.lang.Object context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
        return p012xc85e97e9.p093xedfae76a.w.a(mo273xed6858b4);
    }

    public static final p3325xe03a0797.p3326xc267989b.y0 b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityC0065xcd7aa112, "<this>");
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
        return p012xc85e97e9.p093xedfae76a.w.a(mo273xed6858b4);
    }
}
